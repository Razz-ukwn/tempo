package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import s9.j;
import u6.q;
import x6.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f  reason: invalid package */
public final class f extends AsyncTask {

    /* renamed from: g  reason: collision with root package name */
    public static final a f4523g = new a("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a  reason: collision with root package name */
    public final String f4524a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4525b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f4526c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri.Builder f4527d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4528e;

    /* renamed from: f  reason: collision with root package name */
    public final m9.f f4529f;

    public f(String str, String str2, Intent intent, m9.f fVar, h hVar) {
        q.f(str);
        this.f4524a = str;
        this.f4529f = fVar;
        q.f(str2);
        q.i(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        q.f(stringExtra);
        Uri.Builder buildUpon = Uri.parse(hVar.e(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        q.i(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f4525b = buildUpon.build().toString();
        this.f4526c = new WeakReference(hVar);
        this.f4527d = hVar.c(intent, str, str2);
        this.f4528e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* renamed from: a */
    public final void onPostExecute(e eVar) {
        String str;
        String str2;
        Uri.Builder builder;
        h hVar = (h) this.f4526c.get();
        if (eVar != null) {
            str2 = eVar.f4498a;
            str = eVar.f4499b;
        } else {
            str2 = null;
            str = null;
        }
        if (hVar == null) {
            f4523g.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.f4527d) == null) {
            hVar.f(j.a(str));
        } else {
            builder.authority(str2);
            hVar.j(builder.build(), this.f4524a, FirebaseAuth.getInstance(this.f4529f).f6318o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fc, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fd, code lost:
        r0.c("ConversionException encountered: ".concat(java.lang.String.valueOf(r2.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0111, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0112, code lost:
        r0.c("Null pointer encountered: ".concat(java.lang.String.valueOf(r2.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0126, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0127, code lost:
        r0.c("IOException occurred: ".concat(java.lang.String.valueOf(r2.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0083 A[Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fc A[ExcHandler: xh (r2v8 'e' com.google.android.gms.internal.firebase-auth-api.xh A[CUSTOM_DECLARE]), Splitter:B:4:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0111 A[ExcHandler: NullPointerException (r2v4 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:4:0x0017] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r10) {
        /*
            r9 = this;
            x6.a r0 = f4523g
            java.lang.Void[] r10 = (java.lang.Void[]) r10
            java.lang.String r10 = r9.f4528e
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x0015
            com.google.android.gms.internal.firebase-auth-api.e r0 = new com.google.android.gms.internal.firebase-auth-api.e
            r0.<init>()
            r0.f4498a = r10
            goto L_0x013b
        L_0x0015:
            r10 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r3 = r9.f4525b     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.ref.WeakReference r3 = r9.f4526c     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.Object r3 = r3.get()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            com.google.android.gms.internal.firebase-auth-api.h r3 = (com.google.android.gms.internal.p000firebaseauthapi.h) r3     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.net.HttpURLConnection r2 = r3.h(r2)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json; charset=UTF-8"
            r2.addRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r4 = 60000(0xea60, float:8.4078E-41)
            r2.setConnectTimeout(r4)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            com.google.android.gms.internal.firebase-auth-api.q r4 = new com.google.android.gms.internal.firebase-auth-api.q     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            android.content.Context r3 = r3.zza()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            m9.f r5 = r9.f4529f     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            com.google.android.gms.internal.firebase-auth-api.o r6 = com.google.android.gms.internal.p000firebaseauthapi.o.b()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            int r6 = r6.f4766a     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r8[r10] = r6     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r6 = "X%s"
            java.lang.String r6 = java.lang.String.format(r6, r8)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r4.<init>(r3, r5, r6)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r4.a(r2)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            int r3 = r2.getResponseCode()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x00a3
            com.google.android.gms.internal.firebase-auth-api.j0 r3 = new com.google.android.gms.internal.firebase-auth-api.j0     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r3.<init>()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            byte[] r2 = b(r2)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r3.a(r4)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.util.ArrayList r2 = r3.f4653a     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
        L_0x007d:
            boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            if (r3 == 0) goto L_0x013a
            java.lang.Object r3 = r2.next()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r4 = "firebaseapp.com"
            boolean r4 = r3.endsWith(r4)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            if (r4 != 0) goto L_0x0099
            java.lang.String r4 = "web.app"
            boolean r4 = r3.endsWith(r4)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            if (r4 == 0) goto L_0x007d
        L_0x0099:
            com.google.android.gms.internal.firebase-auth-api.e r2 = new com.google.android.gms.internal.firebase-auth-api.e     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r2.<init>()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r2.f4498a = r3     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r0 = r2
            goto L_0x013b
        L_0x00a3:
            int r4 = r2.getResponseCode()     // Catch:{ IOException -> 0x00c6, NullPointerException -> 0x0111, xh -> 0x00fc }
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto L_0x00dc
            java.io.InputStream r2 = r2.getErrorStream()     // Catch:{ IOException -> 0x00c6, NullPointerException -> 0x0111, xh -> 0x00fc }
            if (r2 != 0) goto L_0x00b4
            java.lang.String r2 = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again."
            goto L_0x00dd
        L_0x00b4:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x00c6, NullPointerException -> 0x0111, xh -> 0x00fc }
            byte[] r2 = b(r2)     // Catch:{ IOException -> 0x00c6, NullPointerException -> 0x0111, xh -> 0x00fc }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00c6, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Object r2 = com.google.android.gms.internal.p000firebaseauthapi.l.a(r4, r2)     // Catch:{ IOException -> 0x00c6, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00c6, NullPointerException -> 0x0111, xh -> 0x00fc }
            goto L_0x00dd
        L_0x00c6:
            r2 = move-exception
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r4 = "Error parsing error message from response body in getErrorMessageFromBody. "
            java.lang.String r2 = r4.concat(r2)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r5 = r0.f16968a     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r2 = r0.d(r2, r4)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            android.util.Log.w(r5, r2)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
        L_0x00dc:
            r2 = r1
        L_0x00dd:
            java.lang.String r4 = "Error getting project config. Failed with %s %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r5[r10] = r2     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r5[r7] = r3     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.String r3 = java.lang.String.format(r4, r5)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r0.c(r3, r4)     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            com.google.android.gms.internal.firebase-auth-api.e r3 = new com.google.android.gms.internal.firebase-auth-api.e     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r3.<init>()     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r3.f4499b = r2     // Catch:{ IOException -> 0x0126, NullPointerException -> 0x0111, xh -> 0x00fc }
            r0 = r3
            goto L_0x013b
        L_0x00fc:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r3 = "ConversionException encountered: "
            java.lang.String r2 = r3.concat(r2)
            r0.c(r2, r10)
            goto L_0x013a
        L_0x0111:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r3 = "Null pointer encountered: "
            java.lang.String r2 = r3.concat(r2)
            r0.c(r2, r10)
            goto L_0x013a
        L_0x0126:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r3 = "IOException occurred: "
            java.lang.String r2 = r3.concat(r2)
            r0.c(r2, r10)
        L_0x013a:
            r0 = r1
        L_0x013b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.f.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final /* synthetic */ void onCancelled(Object obj) {
        e eVar = (e) obj;
        onPostExecute((e) null);
    }
}
