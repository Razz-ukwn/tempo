package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.compose.ui.platform.b3;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l9  reason: invalid package */
public final class l9 {

    /* renamed from: a  reason: collision with root package name */
    public static final tf f4710a;

    static {
        byte[] bArr = new byte[0];
        tf tfVar = m6.f4730a;
        mg mgVar = mg.TINK;
        f4710a = a(3, tfVar, mgVar, bArr);
        a(4, tfVar, mg.RAW, bArr);
        a(3, m6.f4731b, mgVar, bArr);
    }

    public static tf a(int i8, tf tfVar, mg mgVar, byte[] bArr) {
        oe t2 = pe.t();
        we t10 = xe.t();
        t10.j();
        xe.A((xe) t10.f4729b);
        t10.j();
        ((xe) t10.f4729b).zze = b3.b(5);
        p1 l10 = q1.l(bArr, 0, 0);
        t10.j();
        ((xe) t10.f4729b).zzf = l10;
        me t11 = ne.t();
        t11.j();
        ne.x((ne) t11.f4729b, tfVar);
        qe u7 = re.u();
        u7.j();
        ((re) u7.f4729b).zzd = (xe) t10.h();
        u7.j();
        ((re) u7.f4729b).zze = (ne) t11.h();
        u7.j();
        re.B((re) u7.f4729b, i8);
        t2.j();
        ((pe) t2.f4729b).zzd = (re) u7.h();
        sf t12 = tf.t();
        new g9();
        t12.l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        t12.k(mgVar);
        t12.m(((pe) t2.h()).zzo());
        return (tf) t12.h();
    }
}
