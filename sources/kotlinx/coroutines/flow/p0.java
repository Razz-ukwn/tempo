package kotlinx.coroutines.flow;

import ag.l;
import ag.u0;
import ag.v0;
import androidx.compose.ui.platform.b3;
import androidx.fragment.app.z0;
import cg.e;
import dg.b;
import dg.c;
import dg.i;
import dg.o;
import ff.m;
import jf.d;
import jf.f;
import kotlinx.coroutines.internal.v;
import sf.j;

public class p0<T> extends b<r0> implements j0<T>, f, o<T> {
    public final int B;
    public final e C;
    public Object[] D;
    public long E;
    public long F;
    public int G;
    public int H;

    /* renamed from: e  reason: collision with root package name */
    public final int f10612e;

    public static final class a implements u0 {

        /* renamed from: a  reason: collision with root package name */
        public final p0<?> f10613a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10614b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f10615c;

        /* renamed from: d  reason: collision with root package name */
        public final d<m> f10616d;

        public a(p0 p0Var, long j10, Object obj, l lVar) {
            this.f10613a = p0Var;
            this.f10614b = j10;
            this.f10615c = obj;
            this.f10616d = lVar;
        }

        public final void a() {
            p0<?> p0Var = this.f10613a;
            synchronized (p0Var) {
                if (this.f10614b >= p0Var.q()) {
                    Object[] objArr = p0Var.D;
                    j.c(objArr);
                    int i8 = (int) this.f10614b;
                    if (objArr[(objArr.length - 1) & i8] == this) {
                        objArr[i8 & (objArr.length - 1)] = b3.f1265e;
                        p0Var.k();
                        m mVar = m.f8717a;
                    }
                }
            }
        }
    }

    public p0(int i8, int i10, e eVar) {
        this.f10612e = i8;
        this.B = i10;
        this.C = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2 A[Catch:{ all -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kf.a l(kotlinx.coroutines.flow.p0 r8, kotlinx.coroutines.flow.g r9, jf.d r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.q0
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.q0 r0 = (kotlinx.coroutines.flow.q0) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.C = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.q0 r0 = new kotlinx.coroutines.flow.q0
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f10624e
            kf.a r1 = kf.a.f10464a
            int r2 = r0.C
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            ag.n1 r8 = r0.f10623d
            kotlinx.coroutines.flow.r0 r9 = r0.f10622c
            kotlinx.coroutines.flow.g r2 = r0.f10621b
            kotlinx.coroutines.flow.p0 r5 = r0.f10620a
            cb.b.J(r10)     // Catch:{ all -> 0x003e }
            goto L_0x0089
        L_0x003e:
            r8 = move-exception
        L_0x003f:
            r10 = r9
            r9 = r8
            r8 = r5
            goto L_0x00c6
        L_0x0044:
            kotlinx.coroutines.flow.r0 r9 = r0.f10622c
            kotlinx.coroutines.flow.g r8 = r0.f10621b
            kotlinx.coroutines.flow.p0 r2 = r0.f10620a
            cb.b.J(r10)     // Catch:{ all -> 0x0050 }
            r10 = r8
            r8 = r2
            goto L_0x007a
        L_0x0050:
            r8 = move-exception
            r10 = r9
            r9 = r8
            r8 = r2
            goto L_0x00c6
        L_0x0056:
            cb.b.J(r10)
            dg.c r10 = r8.d()
            kotlinx.coroutines.flow.r0 r10 = (kotlinx.coroutines.flow.r0) r10
            boolean r2 = r9 instanceof kotlinx.coroutines.flow.a1     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0077
            r2 = r9
            kotlinx.coroutines.flow.a1 r2 = (kotlinx.coroutines.flow.a1) r2     // Catch:{ all -> 0x0075 }
            r0.f10620a = r8     // Catch:{ all -> 0x0075 }
            r0.f10621b = r9     // Catch:{ all -> 0x0075 }
            r0.f10622c = r10     // Catch:{ all -> 0x0075 }
            r0.C = r5     // Catch:{ all -> 0x0075 }
            java.lang.Object r2 = r2.a(r0)     // Catch:{ all -> 0x0075 }
            if (r2 != r1) goto L_0x0077
            return r1
        L_0x0075:
            r9 = move-exception
            goto L_0x00c6
        L_0x0077:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x007a:
            jf.f r2 = r0.getContext()     // Catch:{ all -> 0x00c1 }
            ag.n1$b r5 = ag.n1.b.f447a     // Catch:{ all -> 0x00c1 }
            jf.f$b r2 = r2.d(r5)     // Catch:{ all -> 0x00c1 }
            ag.n1 r2 = (ag.n1) r2     // Catch:{ all -> 0x00c1 }
            r5 = r8
            r8 = r2
            r2 = r10
        L_0x0089:
            java.lang.Object r10 = r5.u(r9)     // Catch:{ all -> 0x003e }
            kotlinx.coroutines.internal.v r6 = androidx.compose.ui.platform.b3.f1265e     // Catch:{ all -> 0x003e }
            if (r10 != r6) goto L_0x00a2
            r0.f10620a = r5     // Catch:{ all -> 0x003e }
            r0.f10621b = r2     // Catch:{ all -> 0x003e }
            r0.f10622c = r9     // Catch:{ all -> 0x003e }
            r0.f10623d = r8     // Catch:{ all -> 0x003e }
            r0.C = r4     // Catch:{ all -> 0x003e }
            java.lang.Object r10 = r5.i(r9, r0)     // Catch:{ all -> 0x003e }
            if (r10 != r1) goto L_0x0089
            return r1
        L_0x00a2:
            if (r8 == 0) goto L_0x00b0
            boolean r6 = r8.c()     // Catch:{ all -> 0x003e }
            if (r6 == 0) goto L_0x00ab
            goto L_0x00b0
        L_0x00ab:
            java.util.concurrent.CancellationException r8 = r8.F()     // Catch:{ all -> 0x003e }
            throw r8     // Catch:{ all -> 0x003e }
        L_0x00b0:
            r0.f10620a = r5     // Catch:{ all -> 0x003e }
            r0.f10621b = r2     // Catch:{ all -> 0x003e }
            r0.f10622c = r9     // Catch:{ all -> 0x003e }
            r0.f10623d = r8     // Catch:{ all -> 0x003e }
            r0.C = r3     // Catch:{ all -> 0x003e }
            java.lang.Object r10 = r2.m(r10, r0)     // Catch:{ all -> 0x003e }
            if (r10 != r1) goto L_0x0089
            return r1
        L_0x00c1:
            r10 = move-exception
            r5 = r8
            r8 = r10
            goto L_0x003f
        L_0x00c6:
            r8.g(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p0.l(kotlinx.coroutines.flow.p0, kotlinx.coroutines.flow.g, jf.d):kf.a");
    }

    public final Object a(g<? super T> gVar, d<?> dVar) {
        l(this, gVar, dVar);
        return kf.a.f10464a;
    }

    public final f<T> b(f fVar, int i8, e eVar) {
        return ((i8 == 0 || i8 == -3) && eVar == e.f4020a) ? this : new i(i8, fVar, eVar, this);
    }

    public final void c() {
        synchronized (this) {
            v(q() + ((long) this.G), this.F, q() + ((long) this.G), q() + ((long) this.G) + ((long) this.H));
            m mVar = m.f8717a;
        }
    }

    public final c e() {
        return new r0();
    }

    public final c[] f() {
        return new r0[2];
    }

    public final boolean h(T t2) {
        int i8;
        boolean z10;
        d[] dVarArr = z0.f2175a;
        synchronized (this) {
            if (s(t2)) {
                dVarArr = p(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(m.f8717a);
            }
        }
        return z10;
    }

    public final Object i(r0 r0Var, q0 q0Var) {
        l lVar = new l(1, e9.c.g(q0Var));
        lVar.t();
        synchronized (this) {
            if (t(r0Var) < 0) {
                r0Var.f10632b = lVar;
            } else {
                lVar.resumeWith(m.f8717a);
            }
            m mVar = m.f8717a;
        }
        Object s10 = lVar.s();
        return s10 == kf.a.f10464a ? s10 : m.f8717a;
    }

    public final void k() {
        if (this.B != 0 || this.H > 1) {
            Object[] objArr = this.D;
            j.c(objArr);
            while (this.H > 0) {
                long q10 = q();
                int i8 = this.G;
                int i10 = this.H;
                if (objArr[((int) ((q10 + ((long) (i8 + i10))) - 1)) & (objArr.length - 1)] == b3.f1265e) {
                    this.H = i10 - 1;
                    objArr[((int) (q() + ((long) (this.G + this.H)))) & (objArr.length - 1)] = null;
                } else {
                    return;
                }
            }
        }
    }

    public final Object m(T t2, d<? super m> dVar) {
        a aVar;
        d[] dVarArr;
        if (h(t2)) {
            return m.f8717a;
        }
        l lVar = new l(1, e9.c.g(dVar));
        lVar.t();
        d[] dVarArr2 = z0.f2175a;
        synchronized (this) {
            if (s(t2)) {
                lVar.resumeWith(m.f8717a);
                dVarArr = p(dVarArr2);
                aVar = null;
            } else {
                a aVar2 = new a(this, ((long) (this.G + this.H)) + q(), t2, lVar);
                o(aVar2);
                this.H++;
                if (this.B == 0) {
                    dVarArr2 = p(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            lVar.v(new v0(aVar));
        }
        for (d dVar2 : dVarArr) {
            if (dVar2 != null) {
                dVar2.resumeWith(m.f8717a);
            }
        }
        Object s10 = lVar.s();
        kf.a aVar3 = kf.a.f10464a;
        if (s10 != aVar3) {
            s10 = m.f8717a;
        }
        return s10 == aVar3 ? s10 : m.f8717a;
    }

    public final void n() {
        S[] sArr;
        Object[] objArr = this.D;
        j.c(objArr);
        objArr[((int) q()) & (objArr.length - 1)] = null;
        this.G--;
        long q10 = q() + 1;
        if (this.E < q10) {
            this.E = q10;
        }
        if (this.F < q10) {
            if (!(this.f7527b == 0 || (sArr = this.f7526a) == null)) {
                for (S s10 : sArr) {
                    if (s10 != null) {
                        r0 r0Var = (r0) s10;
                        long j10 = r0Var.f10631a;
                        if (j10 >= 0 && j10 < q10) {
                            r0Var.f10631a = q10;
                        }
                    }
                }
            }
            this.F = q10;
        }
    }

    public final void o(Object obj) {
        int i8 = this.G + this.H;
        Object[] objArr = this.D;
        if (objArr == null) {
            objArr = r(0, 2, (Object[]) null);
        } else if (i8 >= objArr.length) {
            objArr = r(i8, objArr.length * 2, objArr);
        }
        objArr[((int) (q() + ((long) i8))) & (objArr.length - 1)] = obj;
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final jf.d<ff.m>[] p(jf.d<ff.m>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f7527b
            if (r1 == 0) goto L_0x0043
            S[] r1 = r10.f7526a
            if (r1 == 0) goto L_0x0043
            int r2 = r1.length
            r3 = 0
        L_0x000b:
            if (r3 >= r2) goto L_0x0043
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0040
            kotlinx.coroutines.flow.r0 r4 = (kotlinx.coroutines.flow.r0) r4
            ag.l r5 = r4.f10632b
            if (r5 != 0) goto L_0x0018
            goto L_0x0040
        L_0x0018:
            long r6 = r10.t(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0040
            int r6 = r11.length
            if (r0 < r6) goto L_0x0035
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            sf.j.e(r11, r6)
        L_0x0035:
            r6 = r11
            jf.d[] r6 = (jf.d[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f10632b = r0
            r0 = r7
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0043:
            jf.d[] r11 = (jf.d[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p0.p(jf.d[]):jf.d[]");
    }

    public final long q() {
        return Math.min(this.F, this.E);
    }

    public final Object[] r(int i8, int i10, Object[] objArr) {
        if (i10 > 0) {
            Object[] objArr2 = new Object[i10];
            this.D = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long q10 = q();
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = (int) (((long) i11) + q10);
                objArr2[i12 & (i10 - 1)] = objArr[(objArr.length - 1) & i12];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean s(T t2) {
        int i8 = this.f7527b;
        int i10 = this.f10612e;
        if (i8 == 0) {
            if (i10 != 0) {
                o(t2);
                int i11 = this.G + 1;
                this.G = i11;
                if (i11 > i10) {
                    n();
                }
                this.F = q() + ((long) this.G);
            }
            return true;
        }
        int i12 = this.G;
        int i13 = this.B;
        if (i12 >= i13 && this.F <= this.E) {
            int ordinal = this.C.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        o(t2);
        int i14 = this.G + 1;
        this.G = i14;
        if (i14 > i13) {
            n();
        }
        long q10 = q() + ((long) this.G);
        long j10 = this.E;
        if (((int) (q10 - j10)) > i10) {
            v(j10 + 1, this.F, q() + ((long) this.G), q() + ((long) this.G) + ((long) this.H));
        }
        return true;
    }

    public final long t(r0 r0Var) {
        long j10 = r0Var.f10631a;
        if (j10 < q() + ((long) this.G)) {
            return j10;
        }
        if (this.B <= 0 && j10 <= q() && this.H != 0) {
            return j10;
        }
        return -1;
    }

    public final Object u(r0 r0Var) {
        Object obj;
        d[] dVarArr = z0.f2175a;
        synchronized (this) {
            long t2 = t(r0Var);
            if (t2 < 0) {
                obj = b3.f1265e;
            } else {
                long j10 = r0Var.f10631a;
                Object[] objArr = this.D;
                j.c(objArr);
                Object obj2 = objArr[((int) t2) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).f10615c;
                }
                r0Var.f10631a = t2 + 1;
                Object obj3 = obj2;
                dVarArr = w(j10);
                obj = obj3;
            }
        }
        for (d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(m.f8717a);
            }
        }
        return obj;
    }

    public final void v(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long q10 = q(); q10 < min; q10++) {
            Object[] objArr = this.D;
            j.c(objArr);
            objArr[((int) q10) & (objArr.length - 1)] = null;
        }
        this.E = j10;
        this.F = j11;
        this.G = (int) (j12 - min);
        this.H = (int) (j13 - j12);
    }

    public final d<m>[] w(long j10) {
        long j11;
        long j12;
        long j13;
        S[] sArr;
        int i8 = (j10 > this.F ? 1 : (j10 == this.F ? 0 : -1));
        d<m>[] dVarArr = z0.f2175a;
        if (i8 > 0) {
            return dVarArr;
        }
        long q10 = q();
        long j14 = ((long) this.G) + q10;
        int i10 = this.B;
        if (i10 == 0 && this.H > 0) {
            j14++;
        }
        if (!(this.f7527b == 0 || (sArr = this.f7526a) == null)) {
            for (S s10 : sArr) {
                if (s10 != null) {
                    long j15 = ((r0) s10).f10631a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.F) {
            return dVarArr;
        }
        long q11 = q() + ((long) this.G);
        int min = this.f7527b > 0 ? Math.min(this.H, i10 - ((int) (q11 - j14))) : this.H;
        long j16 = ((long) this.H) + q11;
        v vVar = b3.f1265e;
        if (min > 0) {
            dVarArr = new d[min];
            Object[] objArr = this.D;
            j.c(objArr);
            long j17 = q11;
            int i11 = 0;
            while (true) {
                if (q11 >= j16) {
                    j12 = j14;
                    j11 = j16;
                    break;
                }
                j12 = j14;
                int i12 = (int) q11;
                Object obj = objArr[(objArr.length - 1) & i12];
                if (obj == vVar) {
                    j11 = j16;
                    j13 = 1;
                } else if (obj != null) {
                    a aVar = (a) obj;
                    j11 = j16;
                    int i13 = i11 + 1;
                    dVarArr[i11] = aVar.f10616d;
                    objArr[i12 & (objArr.length - 1)] = vVar;
                    objArr[((int) j17) & (objArr.length - 1)] = aVar.f10615c;
                    j13 = 1;
                    j17++;
                    if (i13 >= min) {
                        break;
                    }
                    i11 = i13;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                }
                q11 += j13;
                j14 = j12;
                j16 = j11;
            }
            q11 = j17;
        } else {
            j12 = j14;
            j11 = j16;
        }
        d<m>[] dVarArr2 = dVarArr;
        int i14 = (int) (q11 - q10);
        long j18 = this.f7527b == 0 ? q11 : j12;
        long max = Math.max(this.E, q11 - ((long) Math.min(this.f10612e, i14)));
        if (i10 == 0 && max < j11) {
            Object[] objArr2 = this.D;
            j.c(objArr2);
            if (j.a(objArr2[((int) max) & (objArr2.length - 1)], vVar)) {
                q11++;
                max++;
            }
        }
        v(max, j18, q11, j11);
        k();
        return (dVarArr2.length == 0) ^ true ? p(dVarArr2) : dVarArr2;
    }
}
