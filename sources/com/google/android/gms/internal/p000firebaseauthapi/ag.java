package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ag  reason: invalid package */
public final class ag extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final ag zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private t2 zze = x3.f5071d;

    static {
        ag agVar = new ag();
        zzb = agVar;
        p2.g(ag.class, agVar);
    }

    public static void C(ag agVar, yf yfVar) {
        t2 t2Var = agVar.zze;
        if (!t2Var.zzc()) {
            int size = t2Var.size();
            agVar.zze = t2Var.zzd(size == 0 ? 10 : size + size);
        }
        agVar.zze.add(yfVar);
    }

    public static wf v() {
        return (wf) zzb.o();
    }

    public static ag y(InputStream inputStream, c2 c2Var) {
        return (ag) p2.s(zzb, inputStream, c2Var);
    }

    public static ag z(byte[] bArr, c2 c2Var) {
        ag agVar = zzb;
        int length = bArr.length;
        p2 q10 = agVar.q();
        try {
            z3 a10 = w3.f5030c.a(q10.getClass());
            a10.e(q10, bArr, 0, length, new h1(c2Var));
            a10.zzf(q10);
            p2.m(q10);
            return (ag) q10;
        } catch (w2 e10) {
            e = e10;
            if (e.f5029a) {
                e = new w2((IOException) e);
            }
            throw e;
        } catch (j4 e11) {
            throw new w2(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof w2) {
                throw ((w2) e12.getCause());
            }
            throw new w2(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw w2.f();
        }
    }

    public final t2 A() {
        return this.zze;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", yf.class});
        } else if (i10 == 3) {
            return new ag();
        } else {
            if (i10 == 4) {
                return new wf(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int t() {
        return this.zze.size();
    }

    public final int u() {
        return this.zzd;
    }

    public final yf w(int i8) {
        return (yf) this.zze.get(i8);
    }
}
