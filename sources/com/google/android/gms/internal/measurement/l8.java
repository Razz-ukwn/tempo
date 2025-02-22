package com.google.android.gms.internal.measurement;

public final class l8 implements s8 {

    /* renamed from: a  reason: collision with root package name */
    public final h8 f5386a;

    /* renamed from: b  reason: collision with root package name */
    public final d9 f5387b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5388c;

    /* renamed from: d  reason: collision with root package name */
    public final t6 f5389d;

    public l8(d9 d9Var, t6 t6Var, h8 h8Var) {
        this.f5387b = d9Var;
        this.f5388c = t6Var.c(h8Var);
        this.f5389d = t6Var;
        this.f5386a = h8Var;
    }

    public final boolean a(Object obj) {
        this.f5389d.a(obj);
        throw null;
    }

    public final boolean b(Object obj, Object obj2) {
        d9 d9Var = this.f5387b;
        if (!d9Var.d(obj).equals(d9Var.d(obj2))) {
            return false;
        }
        if (!this.f5388c) {
            return true;
        }
        t6 t6Var = this.f5389d;
        t6Var.a(obj);
        t6Var.a(obj2);
        throw null;
    }

    public final void c(Object obj, p6 p6Var) {
        this.f5389d.a(obj);
        throw null;
    }

    public final void d(Object obj, byte[] bArr, int i8, int i10, c6 c6Var) {
        g7 g7Var = (g7) obj;
        if (g7Var.zzc == e9.f5259f) {
            g7Var.zzc = e9.b();
        }
        d7 d7Var = (d7) obj;
        throw null;
    }

    public final int zza(Object obj) {
        d9 d9Var = this.f5387b;
        int b10 = d9Var.b(d9Var.d(obj));
        if (!this.f5388c) {
            return b10;
        }
        this.f5389d.a(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.f5387b.d(obj).hashCode();
        if (!this.f5388c) {
            return hashCode;
        }
        this.f5389d.a(obj);
        throw null;
    }

    public final g7 zze() {
        h8 h8Var = this.f5386a;
        return h8Var instanceof g7 ? (g7) ((g7) h8Var).s(4) : h8Var.f().k();
    }

    public final void zzf(Object obj) {
        this.f5387b.g(obj);
        this.f5389d.b(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        Class cls = t8.f5528a;
        d9 d9Var = this.f5387b;
        d9Var.h(obj, d9Var.e(d9Var.d(obj), d9Var.d(obj2)));
        if (this.f5388c) {
            this.f5389d.a(obj2);
            throw null;
        }
    }
}
