package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u1  reason: invalid package */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public final t1 f4970a;

    /* renamed from: b  reason: collision with root package name */
    public int f4971b;

    /* renamed from: c  reason: collision with root package name */
    public int f4972c;

    /* renamed from: d  reason: collision with root package name */
    public int f4973d = 0;

    public u1(t1 t1Var) {
        Charset charset = u2.f4974a;
        this.f4970a = t1Var;
        t1Var.f4940b = this;
    }

    public static final void r(int i8) {
        if ((i8 & 3) != 0) {
            throw w2.e();
        }
    }

    public static final void s(int i8) {
        if ((i8 & 7) != 0) {
            throw w2.e();
        }
    }

    public final void a(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof e3;
        t1 t1Var = this.f4970a;
        if (z10) {
            e3 e3Var = (e3) list;
            int i8 = this.f4971b & 7;
            if (i8 == 1) {
                do {
                    e3Var.b(t1Var.r());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int q10 = t1Var.q();
                s(q10);
                int i10 = t1Var.i() + q10;
                do {
                    e3Var.b(t1Var.r());
                } while (t1Var.i() < i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(t1Var.r()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int q11 = t1Var.q();
                s(q11);
                int i12 = t1Var.i() + q11;
                do {
                    list.add(Long.valueOf(t1Var.r()));
                } while (t1Var.i() < i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void b(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof k2;
        t1 t1Var = this.f4970a;
        if (z10) {
            k2 k2Var = (k2) list;
            int i8 = this.f4971b & 7;
            if (i8 == 2) {
                int q10 = t1Var.q();
                r(q10);
                int i10 = t1Var.i() + q10;
                do {
                    k2Var.b(t1Var.h());
                } while (t1Var.i() < i10);
            } else if (i8 == 5) {
                do {
                    k2Var.b(t1Var.h());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 2) {
                int q11 = t1Var.q();
                r(q11);
                int i12 = t1Var.i() + q11;
                do {
                    list.add(Float.valueOf(t1Var.h()));
                } while (t1Var.i() < i12);
            } else if (i11 == 5) {
                do {
                    list.add(Float.valueOf(t1Var.h()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else {
                throw w2.a();
            }
        }
    }

    @Deprecated
    public final void c(List list, z3 z3Var, c2 c2Var) {
        int p10;
        int i8 = this.f4971b;
        if ((i8 & 7) == 3) {
            do {
                p2 zze = z3Var.zze();
                n(zze, z3Var, c2Var);
                z3Var.zzf(zze);
                list.add(zze);
                t1 t1Var = this.f4970a;
                if (!t1Var.b() && this.f4973d == 0) {
                    p10 = t1Var.p();
                } else {
                    return;
                }
            } while (p10 == i8);
            this.f4973d = p10;
            return;
        }
        int i10 = w2.f5028b;
        throw new v2();
    }

    public final void d(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof q2;
        t1 t1Var = this.f4970a;
        if (z10) {
            q2 q2Var = (q2) list;
            int i8 = this.f4971b & 7;
            if (i8 == 0) {
                do {
                    q2Var.b(t1Var.m());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int i10 = t1Var.i() + t1Var.q();
                do {
                    q2Var.b(t1Var.m());
                } while (t1Var.i() < i10);
                p(i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(t1Var.m()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int i12 = t1Var.i() + t1Var.q();
                do {
                    list.add(Integer.valueOf(t1Var.m()));
                } while (t1Var.i() < i12);
                p(i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void e(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof e3;
        t1 t1Var = this.f4970a;
        if (z10) {
            e3 e3Var = (e3) list;
            int i8 = this.f4971b & 7;
            if (i8 == 0) {
                do {
                    e3Var.b(t1Var.s());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int i10 = t1Var.i() + t1Var.q();
                do {
                    e3Var.b(t1Var.s());
                } while (t1Var.i() < i10);
                p(i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(t1Var.s()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int i12 = t1Var.i() + t1Var.q();
                do {
                    list.add(Long.valueOf(t1Var.s()));
                } while (t1Var.i() < i12);
                p(i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void f(List list, z3 z3Var, c2 c2Var) {
        int p10;
        int i8 = this.f4971b;
        if ((i8 & 7) == 2) {
            do {
                p2 zze = z3Var.zze();
                o(zze, z3Var, c2Var);
                z3Var.zzf(zze);
                list.add(zze);
                t1 t1Var = this.f4970a;
                if (!t1Var.b() && this.f4973d == 0) {
                    p10 = t1Var.p();
                } else {
                    return;
                }
            } while (p10 == i8);
            this.f4973d = p10;
            return;
        }
        int i10 = w2.f5028b;
        throw new v2();
    }

    public final void g(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof q2;
        t1 t1Var = this.f4970a;
        if (z10) {
            q2 q2Var = (q2) list;
            int i8 = this.f4971b & 7;
            if (i8 == 2) {
                int q10 = t1Var.q();
                r(q10);
                int i10 = t1Var.i() + q10;
                do {
                    q2Var.b(t1Var.n());
                } while (t1Var.i() < i10);
            } else if (i8 == 5) {
                do {
                    q2Var.b(t1Var.n());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 2) {
                int q11 = t1Var.q();
                r(q11);
                int i12 = t1Var.i() + q11;
                do {
                    list.add(Integer.valueOf(t1Var.n()));
                } while (t1Var.i() < i12);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(t1Var.n()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else {
                throw w2.a();
            }
        }
    }

    public final void h(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof e3;
        t1 t1Var = this.f4970a;
        if (z10) {
            e3 e3Var = (e3) list;
            int i8 = this.f4971b & 7;
            if (i8 == 1) {
                do {
                    e3Var.b(t1Var.t());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int q10 = t1Var.q();
                s(q10);
                int i10 = t1Var.i() + q10;
                do {
                    e3Var.b(t1Var.t());
                } while (t1Var.i() < i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(t1Var.t()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int q11 = t1Var.q();
                s(q11);
                int i12 = t1Var.i() + q11;
                do {
                    list.add(Long.valueOf(t1Var.t()));
                } while (t1Var.i() < i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void i(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof q2;
        t1 t1Var = this.f4970a;
        if (z10) {
            q2 q2Var = (q2) list;
            int i8 = this.f4971b & 7;
            if (i8 == 0) {
                do {
                    q2Var.b(t1Var.o());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int i10 = t1Var.i() + t1Var.q();
                do {
                    q2Var.b(t1Var.o());
                } while (t1Var.i() < i10);
                p(i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(t1Var.o()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int i12 = t1Var.i() + t1Var.q();
                do {
                    list.add(Integer.valueOf(t1Var.o()));
                } while (t1Var.i() < i12);
                p(i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void j(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof e3;
        t1 t1Var = this.f4970a;
        if (z10) {
            e3 e3Var = (e3) list;
            int i8 = this.f4971b & 7;
            if (i8 == 0) {
                do {
                    e3Var.b(t1Var.u());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int i10 = t1Var.i() + t1Var.q();
                do {
                    e3Var.b(t1Var.u());
                } while (t1Var.i() < i10);
                p(i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(t1Var.u()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int i12 = t1Var.i() + t1Var.q();
                do {
                    list.add(Long.valueOf(t1Var.u()));
                } while (t1Var.i() < i12);
                p(i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void k(List list, boolean z10) {
        String str;
        int p10;
        int p11;
        if ((this.f4971b & 7) == 2) {
            boolean z11 = list instanceof a3;
            t1 t1Var = this.f4970a;
            if (z11 && !z10) {
                a3 a3Var = (a3) list;
                do {
                    a3Var.n(u());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
                return;
            }
            do {
                if (z10) {
                    q(2);
                    str = t1Var.y();
                } else {
                    q(2);
                    str = t1Var.x();
                }
                list.add(str);
                if (!t1Var.b()) {
                    p10 = t1Var.p();
                } else {
                    return;
                }
            } while (p10 == this.f4971b);
            this.f4973d = p10;
            return;
        }
        int i8 = w2.f5028b;
        throw new v2();
    }

    public final void l(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof q2;
        t1 t1Var = this.f4970a;
        if (z10) {
            q2 q2Var = (q2) list;
            int i8 = this.f4971b & 7;
            if (i8 == 0) {
                do {
                    q2Var.b(t1Var.q());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int i10 = t1Var.i() + t1Var.q();
                do {
                    q2Var.b(t1Var.q());
                } while (t1Var.i() < i10);
                p(i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(t1Var.q()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int i12 = t1Var.i() + t1Var.q();
                do {
                    list.add(Integer.valueOf(t1Var.q()));
                } while (t1Var.i() < i12);
                p(i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void m(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof e3;
        t1 t1Var = this.f4970a;
        if (z10) {
            e3 e3Var = (e3) list;
            int i8 = this.f4971b & 7;
            if (i8 == 0) {
                do {
                    e3Var.b(t1Var.v());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int i10 = t1Var.i() + t1Var.q();
                do {
                    e3Var.b(t1Var.v());
                } while (t1Var.i() < i10);
                p(i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(t1Var.v()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int i12 = t1Var.i() + t1Var.q();
                do {
                    list.add(Long.valueOf(t1Var.v()));
                } while (t1Var.i() < i12);
                p(i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void n(Object obj, z3 z3Var, c2 c2Var) {
        int i8 = this.f4972c;
        this.f4972c = ((this.f4971b >>> 3) << 3) | 4;
        try {
            z3Var.d(obj, this, c2Var);
            if (this.f4971b != this.f4972c) {
                throw w2.e();
            }
        } finally {
            this.f4972c = i8;
        }
    }

    public final void o(Object obj, z3 z3Var, c2 c2Var) {
        t1 t1Var = this.f4970a;
        int q10 = t1Var.q();
        if (t1Var.f4939a < 100) {
            int j10 = t1Var.j(q10);
            t1Var.f4939a++;
            z3Var.d(obj, this, c2Var);
            t1Var.z(0);
            t1Var.f4939a--;
            t1Var.a(j10);
            return;
        }
        throw new w2("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void p(int i8) {
        if (this.f4970a.i() != i8) {
            throw w2.f();
        }
    }

    public final void q(int i8) {
        if ((this.f4971b & 7) != i8) {
            throw w2.a();
        }
    }

    public final int t() {
        int i8 = this.f4973d;
        if (i8 != 0) {
            this.f4971b = i8;
            this.f4973d = 0;
        } else {
            i8 = this.f4970a.p();
            this.f4971b = i8;
        }
        if (i8 == 0 || i8 == this.f4972c) {
            return Integer.MAX_VALUE;
        }
        return i8 >>> 3;
    }

    public final q1 u() {
        q(2);
        return this.f4970a.w();
    }

    public final void v(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof k1;
        t1 t1Var = this.f4970a;
        if (z10) {
            k1 k1Var = (k1) list;
            int i8 = this.f4971b & 7;
            if (i8 == 0) {
                do {
                    k1Var.b(t1Var.c());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int i10 = t1Var.i() + t1Var.q();
                do {
                    k1Var.b(t1Var.c());
                } while (t1Var.i() < i10);
                p(i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(t1Var.c()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int i12 = t1Var.i() + t1Var.q();
                do {
                    list.add(Boolean.valueOf(t1Var.c()));
                } while (t1Var.i() < i12);
                p(i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void w(List list) {
        int p10;
        if ((this.f4971b & 7) == 2) {
            do {
                list.add(u());
                t1 t1Var = this.f4970a;
                if (!t1Var.b()) {
                    p10 = t1Var.p();
                } else {
                    return;
                }
            } while (p10 == this.f4971b);
            this.f4973d = p10;
            return;
        }
        throw w2.a();
    }

    public final void x(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof a2;
        t1 t1Var = this.f4970a;
        if (z10) {
            a2 a2Var = (a2) list;
            int i8 = this.f4971b & 7;
            if (i8 == 1) {
                do {
                    a2Var.b(t1Var.g());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int q10 = t1Var.q();
                s(q10);
                int i10 = t1Var.i() + q10;
                do {
                    a2Var.b(t1Var.g());
                } while (t1Var.i() < i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(t1Var.g()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int q11 = t1Var.q();
                s(q11);
                int i12 = t1Var.i() + q11;
                do {
                    list.add(Double.valueOf(t1Var.g()));
                } while (t1Var.i() < i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void y(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof q2;
        t1 t1Var = this.f4970a;
        if (z10) {
            q2 q2Var = (q2) list;
            int i8 = this.f4971b & 7;
            if (i8 == 0) {
                do {
                    q2Var.b(t1Var.k());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else if (i8 == 2) {
                int i10 = t1Var.i() + t1Var.q();
                do {
                    q2Var.b(t1Var.k());
                } while (t1Var.i() < i10);
                p(i10);
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(t1Var.k()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else if (i11 == 2) {
                int i12 = t1Var.i() + t1Var.q();
                do {
                    list.add(Integer.valueOf(t1Var.k()));
                } while (t1Var.i() < i12);
                p(i12);
            } else {
                throw w2.a();
            }
        }
    }

    public final void z(List list) {
        int p10;
        int p11;
        boolean z10 = list instanceof q2;
        t1 t1Var = this.f4970a;
        if (z10) {
            q2 q2Var = (q2) list;
            int i8 = this.f4971b & 7;
            if (i8 == 2) {
                int q10 = t1Var.q();
                r(q10);
                int i10 = t1Var.i() + q10;
                do {
                    q2Var.b(t1Var.l());
                } while (t1Var.i() < i10);
            } else if (i8 == 5) {
                do {
                    q2Var.b(t1Var.l());
                    if (!t1Var.b()) {
                        p11 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p11 == this.f4971b);
                this.f4973d = p11;
            } else {
                throw w2.a();
            }
        } else {
            int i11 = this.f4971b & 7;
            if (i11 == 2) {
                int q11 = t1Var.q();
                r(q11);
                int i12 = t1Var.i() + q11;
                do {
                    list.add(Integer.valueOf(t1Var.l()));
                } while (t1Var.i() < i12);
            } else if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(t1Var.l()));
                    if (!t1Var.b()) {
                        p10 = t1Var.p();
                    } else {
                        return;
                    }
                } while (p10 == this.f4971b);
                this.f4973d = p10;
            } else {
                throw w2.a();
            }
        }
    }
}
