package s9;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.ca;
import com.google.android.gms.internal.p000firebaseauthapi.da;
import com.google.android.gms.internal.p000firebaseauthapi.h9;
import com.google.android.gms.internal.p000firebaseauthapi.k5;
import com.google.android.gms.internal.p000firebaseauthapi.l9;
import com.google.android.gms.internal.p000firebaseauthapi.w5;
import e.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public final class h0 {

    /* renamed from: c  reason: collision with root package name */
    public static h0 f14833c;

    /* renamed from: a  reason: collision with root package name */
    public final String f14834a;

    /* renamed from: b  reason: collision with root package name */
    public final da f14835b;

    public h0(Context context, String str) {
        da daVar;
        this.f14834a = str;
        try {
            h9.a();
            ca caVar = new ca();
            caVar.b(context, String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str}));
            caVar.a(l9.f4710a);
            String format = String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str});
            if (format.startsWith("android-keystore://")) {
                caVar.f4464d = format;
                daVar = caVar.c();
                this.f14835b = daVar;
                return;
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e10.getMessage())));
            daVar = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r0.equals(r3) != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r1 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s9.h0 a(android.content.Context r2, java.lang.String r3) {
        /*
            s9.h0 r0 = f14833c
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.f14834a
            if (r0 == r3) goto L_0x0011
            r1 = 0
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r1 != 0) goto L_0x001b
        L_0x0014:
            s9.h0 r0 = new s9.h0
            r0.<init>(r2, r3)
            f14833c = r0
        L_0x001b:
            s9.h0 r2 = f14833c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.h0.a(android.content.Context, java.lang.String):s9.h0");
    }

    public final String b(String str) {
        w5 a10;
        String str2;
        da daVar = this.f14835b;
        if (daVar != null) {
            try {
                synchronized (daVar) {
                    da daVar2 = this.f14835b;
                    synchronized (daVar2) {
                        a10 = daVar2.f4490b.a();
                    }
                    str2 = new String(((k5) a10.c()).zza(Base64.decode(str, 8)), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
                Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e10.getMessage())));
                return null;
            }
        } else {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
    }

    public final String c() {
        w5 a10;
        if (this.f14835b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        s sVar = new s((Object) byteArrayOutputStream);
        try {
            synchronized (this.f14835b) {
                da daVar = this.f14835b;
                synchronized (daVar) {
                    a10 = daVar.f4490b.a();
                }
                a10.b().e(sVar);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e10.getMessage())));
            return null;
        }
    }
}
