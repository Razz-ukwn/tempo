package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.compose.ui.platform.b3;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g9  reason: invalid package */
public final class g9 extends kb {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f4575d = new byte[0];

    public g9() {
        super(te.class, new s6(3, k5.class));
    }

    public static pa i(int i8, t5 t5Var, byte[] bArr, int i10) {
        int i11;
        oe t2 = pe.t();
        we t10 = xe.t();
        t10.j();
        xe.A((xe) t10.f4729b);
        t10.j();
        ((xe) t10.f4729b).zze = b3.b(5);
        p1 l10 = q1.l(bArr, 0, 0);
        t10.j();
        ((xe) t10.f4729b).zzf = l10;
        xe xeVar = (xe) t10.h();
        sf t11 = tf.t();
        tf tfVar = t5Var.f4942a;
        t11.l(tfVar.y());
        byte[] m = tfVar.x().m();
        t11.m(q1.l(m, 0, m.length));
        int ordinal = tfVar.w().ordinal();
        if (ordinal == 1) {
            i11 = 1;
        } else if (ordinal != 2) {
            i11 = 3;
            if (ordinal != 3) {
                i11 = 4;
                if (ordinal != 4) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        } else {
            i11 = 2;
        }
        int i12 = i11 - 1;
        t11.k(i12 != 0 ? i12 != 1 ? i12 != 2 ? mg.CRUNCHY : mg.RAW : mg.LEGACY : mg.TINK);
        me t12 = ne.t();
        t12.j();
        ne.x((ne) t12.f4729b, (tf) t11.h());
        qe u7 = re.u();
        u7.j();
        ((re) u7.f4729b).zzd = xeVar;
        u7.j();
        ((re) u7.f4729b).zze = (ne) t12.h();
        u7.j();
        re.B((re) u7.f4729b, i8);
        t2.j();
        ((pe) t2.f4729b).zzd = (re) u7.h();
        return new pa((pe) t2.h(), i10);
    }

    public final qa a() {
        return new t6(pe.class, 3);
    }

    public final int b() {
        return 3;
    }

    public final o3 c(q1 q1Var) {
        return te.w(q1Var, c2.f4439b);
    }

    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final void e(o3 o3Var) {
        te teVar = (te) o3Var;
        if (!(teVar.y().c() == 0)) {
            kh.c(teVar.t());
            m9.a(teVar.x().u());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final /* synthetic */ o3 h(o3 o3Var) {
        return ((te) o3Var).x();
    }
}
