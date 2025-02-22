package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.compose.ui.platform.b3;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m6  reason: invalid package */
public final class m6 {

    /* renamed from: a  reason: collision with root package name */
    public static final tf f4730a = b(16);

    /* renamed from: b  reason: collision with root package name */
    public static final tf f4731b = c(16, 16);

    static {
        b(32);
        a(16);
        a(32);
        c(32, 32);
        sf t2 = tf.t();
        new f7(2);
        t2.l("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        mg mgVar = mg.TINK;
        t2.k(mgVar);
        tf tfVar = (tf) t2.h();
        sf t10 = tf.t();
        new u6(3);
        t10.l("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        t10.k(mgVar);
        tf tfVar2 = (tf) t10.h();
    }

    public static void a(int i8) {
        rd u7 = sd.u();
        u7.j();
        ((sd) u7.f4729b).zze = i8;
        td u10 = ud.u();
        u10.j();
        ((ud) u10.f4729b).zzd = 16;
        u7.j();
        ((sd) u7.f4729b).zzd = (ud) u10.h();
        sf t2 = tf.t();
        t2.m(((sd) u7.h()).zzo());
        new f7(0);
        t2.l("type.googleapis.com/google.crypto.tink.AesEaxKey");
        t2.k(mg.TINK);
        tf tfVar = (tf) t2.h();
    }

    public static tf b(int i8) {
        xd u7 = yd.u();
        u7.j();
        ((yd) u7.f4729b).zzd = i8;
        sf t2 = tf.t();
        t2.m(((yd) u7.h()).zzo());
        new f7(1);
        t2.l("type.googleapis.com/google.crypto.tink.AesGcmKey");
        t2.k(mg.TINK);
        return (tf) t2.h();
    }

    public static tf c(int i8, int i10) {
        ld u7 = md.u();
        nd u10 = od.u();
        u10.j();
        ((od) u10.f4729b).zzd = 16;
        u7.j();
        ((md) u7.f4729b).zzd = (od) u10.h();
        u7.j();
        ((md) u7.f4729b).zze = i8;
        cf u11 = df.u();
        ef u12 = ff.u();
        u12.j();
        ((ff) u12.f4729b).zzd = b3.b(5);
        u12.j();
        ((ff) u12.f4729b).zze = i10;
        u11.j();
        ((df) u11.f4729b).zzd = (ff) u12.h();
        u11.j();
        ((df) u11.f4729b).zze = 32;
        hd t2 = id.t();
        t2.j();
        ((id) t2.f4729b).zzd = (md) u7.h();
        t2.j();
        ((id) t2.f4729b).zze = (df) u11.h();
        sf t10 = tf.t();
        t10.m(((id) t2.h()).zzo());
        new u6(0);
        t10.l("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        t10.k(mg.TINK);
        return (tf) t10.h();
    }
}
