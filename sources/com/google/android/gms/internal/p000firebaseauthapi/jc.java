package com.google.android.gms.internal.p000firebaseauthapi;

import ag.v1;
import androidx.compose.ui.platform.b3;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jc  reason: invalid package */
public final class jc extends ra {

    /* renamed from: d  reason: collision with root package name */
    public static final db f4671d = new db(v1.E, hc.class);

    public jc() {
        super(bf.class, new e8(2, a6.class));
    }

    public static final void h(bf bfVar) {
        kh.c(bfVar.t());
        if (bfVar.z().c() >= 16) {
            j(bfVar.y());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static pa i(int i8, int i10, int i11, int i12) {
        cf u7 = df.u();
        ef u10 = ff.u();
        u10.j();
        ((ff) u10.f4729b).zzd = b3.b(i11);
        u10.j();
        ((ff) u10.f4729b).zze = i10;
        u7.j();
        ((df) u7.f4729b).zzd = (ff) u10.h();
        u7.j();
        ((df) u7.f4729b).zze = i8;
        return new pa((df) u7.h(), i12);
    }

    public static void j(ff ffVar) {
        if (ffVar.t() >= 10) {
            int y10 = ffVar.y() - 2;
            if (y10 != 1) {
                if (y10 != 2) {
                    if (y10 != 3) {
                        if (y10 != 4) {
                            if (y10 != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (ffVar.t() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (ffVar.t() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (ffVar.t() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (ffVar.t() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (ffVar.t() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final qa a() {
        return new f8(df.class, 1);
    }

    public final int b() {
        return 2;
    }

    public final o3 c(q1 q1Var) {
        return bf.x(q1Var, c2.f4439b);
    }

    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* bridge */ /* synthetic */ void e(o3 o3Var) {
        h((bf) o3Var);
    }

    public final int f() {
        return 2;
    }
}
