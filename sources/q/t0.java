package q;

import cb.b;
import d2.f1;
import q.p;
import sf.j;
import wf.e;

public final class t0<V extends p> implements r0<V> {

    /* renamed from: a  reason: collision with root package name */
    public final q f12769a;

    /* renamed from: b  reason: collision with root package name */
    public V f12770b;

    /* renamed from: c  reason: collision with root package name */
    public V f12771c;

    /* renamed from: d  reason: collision with root package name */
    public V f12772d;

    public t0(q qVar) {
        this.f12769a = qVar;
    }

    public final V b(long j10, V v3, V v10, V v11) {
        V v12 = v3;
        V v13 = v10;
        V v14 = v11;
        j.f(v12, "initialValue");
        j.f(v13, "targetValue");
        j.f(v14, "initialVelocity");
        if (this.f12770b == null) {
            this.f12770b = b.E(v3);
        }
        V v15 = this.f12770b;
        if (v15 != null) {
            int b10 = v15.b();
            int i8 = 0;
            while (i8 < b10) {
                V v16 = this.f12770b;
                if (v16 != null) {
                    v16.e(i8, this.f12769a.get(i8).e(j10, v12.a(i8), v13.a(i8), v14.a(i8)));
                    i8++;
                } else {
                    j.l("valueVector");
                    throw null;
                }
            }
            V v17 = this.f12770b;
            if (v17 != null) {
                return v17;
            }
            j.l("valueVector");
            throw null;
        }
        j.l("valueVector");
        throw null;
    }

    public final V c(long j10, V v3, V v10, V v11) {
        V v12 = v3;
        V v13 = v10;
        V v14 = v11;
        j.f(v12, "initialValue");
        j.f(v13, "targetValue");
        j.f(v14, "initialVelocity");
        if (this.f12771c == null) {
            this.f12771c = b.E(v11);
        }
        V v15 = this.f12771c;
        if (v15 != null) {
            int b10 = v15.b();
            int i8 = 0;
            while (i8 < b10) {
                V v16 = this.f12771c;
                if (v16 != null) {
                    v16.e(i8, this.f12769a.get(i8).b(j10, v12.a(i8), v13.a(i8), v14.a(i8)));
                    i8++;
                } else {
                    j.l("velocityVector");
                    throw null;
                }
            }
            V v17 = this.f12771c;
            if (v17 != null) {
                return v17;
            }
            j.l("velocityVector");
            throw null;
        }
        j.l("velocityVector");
        throw null;
    }

    public final long d(V v3, V v10, V v11) {
        j.f(v3, "initialValue");
        j.f(v10, "targetValue");
        e d10 = f1.P(0, v3.b()).iterator();
        long j10 = 0;
        while (d10.f16719c) {
            int nextInt = d10.nextInt();
            j10 = Math.max(j10, this.f12769a.get(nextInt).c(v3.a(nextInt), v10.a(nextInt), v11.a(nextInt)));
        }
        return j10;
    }

    public final V e(V v3, V v10, V v11) {
        j.f(v3, "initialValue");
        j.f(v10, "targetValue");
        if (this.f12772d == null) {
            this.f12772d = b.E(v11);
        }
        V v12 = this.f12772d;
        if (v12 != null) {
            int b10 = v12.b();
            int i8 = 0;
            while (i8 < b10) {
                V v13 = this.f12772d;
                if (v13 != null) {
                    v13.e(i8, this.f12769a.get(i8).d(v3.a(i8), v10.a(i8), v11.a(i8)));
                    i8++;
                } else {
                    j.l("endVelocityVector");
                    throw null;
                }
            }
            V v14 = this.f12772d;
            if (v14 != null) {
                return v14;
            }
            j.l("endVelocityVector");
            throw null;
        }
        j.l("endVelocityVector");
        throw null;
    }
}
