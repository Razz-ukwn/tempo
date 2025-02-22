package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import cb.d;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import sf.j;

public final class zzaq implements zzap {
    private final String zza;

    public zzaq(String str) {
        this.zza = str;
    }

    private static final void zzb(byte[] bArr) {
        for (zzlo zzlo : zzlr.zzk(bArr).zzG()) {
            if (!d.P("INIT_TOTAL", "EXECUTE_TOTAL").contains(zzlo.zzj().name()) || !zzlo.zzS()) {
                zzlo.zzH();
                zzlo.zzI();
                zzlo.zzj().name();
                zzlo.zzT();
            } else {
                zzlo.zzH();
                zzlo.zzI();
                zzlo.zzj().name();
                zzlo.zzg().zzk();
                zzlo.zzg().zzf();
                zzlo.zzT();
            }
        }
    }

    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection openConnection = new URL(this.zza).openConnection();
                j.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) openConnection;
            } else if (URLUtil.isHttpsUrl(this.zza)) {
                URLConnection openConnection2 = new URL(this.zza).openConnection();
                j.d(openConnection2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) openConnection2;
            } else {
                throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e10) {
            e10.getMessage();
            return false;
        }
    }
}
