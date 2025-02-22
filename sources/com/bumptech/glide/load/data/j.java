package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import j0.t;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import l5.c;
import l5.h;
import p4.e;
import v4.f;

public final class j implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final f f4116a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4117b;

    /* renamed from: c  reason: collision with root package name */
    public HttpURLConnection f4118c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f4119d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f4120e;

    public static class a {
    }

    static {
        new a();
    }

    public j(f fVar, int i8) {
        this.f4116a = fVar;
        this.f4117b = i8;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f4119d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f4118c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f4118c = null;
    }

    public final void cancel() {
        this.f4120e = true;
    }

    public final p4.a d() {
        return p4.a.f12447b;
    }

    public final void e(com.bumptech.glide.j jVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        f fVar = this.f4116a;
        int i8 = h.f10997b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.f(f(fVar.d(), 0, (URL) null, fVar.f16165b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                sb2.append(h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder("Finished http url fetcher fetch in ");
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + h.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i8, URL url2, Map<String, String> map) {
        if (i8 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e(-1, "In re-direct loop", (IOException) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z10 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry next : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                int i10 = this.f4117b;
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f4118c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f4119d = this.f4118c.getInputStream();
                    if (this.f4120e) {
                        return null;
                    }
                    int c3 = c(this.f4118c);
                    int i11 = c3 / 100;
                    if (i11 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f4118c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f4119d = new c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f4119d = httpURLConnection2.getInputStream();
                            }
                            return this.f4119d;
                        } catch (IOException e10) {
                            throw new e(c(httpURLConnection2), "Failed to obtain InputStream", e10);
                        }
                    } else {
                        if (i11 == 3) {
                            z10 = true;
                        }
                        if (z10) {
                            String headerField = this.f4118c.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    b();
                                    return f(url3, i8 + 1, url, map);
                                } catch (MalformedURLException e11) {
                                    throw new e(c3, t.a("Bad redirect url: ", headerField), e11);
                                }
                            } else {
                                throw new e(c3, "Received empty or null redirect url", (IOException) null);
                            }
                        } else if (c3 == -1) {
                            throw new e(c3, "Http request failed", (IOException) null);
                        } else {
                            try {
                                throw new e(c3, this.f4118c.getResponseMessage(), (IOException) null);
                            } catch (IOException e12) {
                                throw new e(c3, "Failed to get a response message", e12);
                            }
                        }
                    }
                } catch (IOException e13) {
                    throw new e(c(this.f4118c), "Failed to connect or obtain data", e13);
                }
            } catch (IOException e14) {
                throw new e(0, "URL.openConnection threw", e14);
            }
        } else {
            throw new e(-1, "Too many (> 5) redirects!", (IOException) null);
        }
    }
}
