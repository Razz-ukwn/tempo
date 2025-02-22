package cg;

import ag.i0;
import ag.k;
import ag.l;
import cg.i;
import d2.f1;
import ff.m;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.v;

public abstract class a<E> extends b<E> implements f<E> {

    /* renamed from: cg.a$a  reason: collision with other inner class name */
    public static final class C0065a<E> implements h<E> {

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f4001a;

        /* renamed from: b  reason: collision with root package name */
        public Object f4002b = gc.b.f8935e;

        public C0065a(a<E> aVar) {
            this.f4001a = aVar;
        }

        public final Object a(lf.c cVar) {
            Object obj = this.f4002b;
            v vVar = gc.b.f8935e;
            boolean z10 = false;
            if (obj != vVar) {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    if (jVar.f4030d != null) {
                        Throwable B = jVar.B();
                        int i8 = u.f10737a;
                        throw B;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            a<E> aVar = this.f4001a;
            Object y10 = aVar.y();
            this.f4002b = y10;
            if (y10 != vVar) {
                if (y10 instanceof j) {
                    j jVar2 = (j) y10;
                    if (jVar2.f4030d != null) {
                        Throwable B2 = jVar2.B();
                        int i10 = u.f10737a;
                        throw B2;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            l J = cb.d.J(e9.c.g(cVar));
            d dVar = new d(this, J);
            while (true) {
                if (aVar.q(dVar)) {
                    J.v(new e(dVar));
                    break;
                }
                Object y11 = aVar.y();
                this.f4002b = y11;
                if (y11 instanceof j) {
                    j jVar3 = (j) y11;
                    if (jVar3.f4030d == null) {
                        J.resumeWith(Boolean.FALSE);
                    } else {
                        J.resumeWith(cb.b.u(jVar3.B()));
                    }
                } else if (y11 != vVar) {
                    Boolean bool = Boolean.TRUE;
                    rf.l<E, m> lVar = aVar.f4014a;
                    J.A(bool, J.f474c, lVar != null ? new n(lVar, y11, J.f435e) : null);
                }
            }
            return J.s();
        }

        public final E next() {
            E e10 = this.f4002b;
            if (!(e10 instanceof j)) {
                E e11 = gc.b.f8935e;
                if (e10 != e11) {
                    this.f4002b = e11;
                    return e10;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            Throwable B = ((j) e10).B();
            int i8 = u.f10737a;
            throw B;
        }
    }

    public static class b<E> extends r<E> {

        /* renamed from: d  reason: collision with root package name */
        public final k<Object> f4003d;

        /* renamed from: e  reason: collision with root package name */
        public final int f4004e = 1;

        public b(l lVar) {
            this.f4003d = lVar;
        }

        public final v b(Object obj) {
            if (this.f4003d.a(this.f4004e == 1 ? new i(obj) : obj, w(obj)) == null) {
                return null;
            }
            return ag.m.f438a;
        }

        public final void j(E e10) {
            this.f4003d.g();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReceiveElement@");
            sb2.append(i0.d(this));
            sb2.append("[receiveMode=");
            return rb.b.a(sb2, this.f4004e, ']');
        }

        public final void x(j<?> jVar) {
            int i8 = this.f4004e;
            k<Object> kVar = this.f4003d;
            if (i8 == 1) {
                kVar.resumeWith(new i(new i.a(jVar.f4030d)));
            } else {
                kVar.resumeWith(cb.b.u(jVar.B()));
            }
        }
    }

    public static final class c<E> extends b<E> {
        public final rf.l<E, m> B;

        public c(l lVar, rf.l lVar2) {
            super(lVar);
            this.B = lVar2;
        }

        public final rf.l<Throwable, m> w(E e10) {
            return new n(this.B, e10, this.f4003d.getContext());
        }
    }

    public static class d<E> extends r<E> {

        /* renamed from: d  reason: collision with root package name */
        public final C0065a<E> f4005d;

        /* renamed from: e  reason: collision with root package name */
        public final k<Boolean> f4006e;

        public d(C0065a aVar, l lVar) {
            this.f4005d = aVar;
            this.f4006e = lVar;
        }

        public final v b(Object obj) {
            if (this.f4006e.a(Boolean.TRUE, w(obj)) == null) {
                return null;
            }
            return ag.m.f438a;
        }

        public final void j(E e10) {
            this.f4005d.f4002b = e10;
            this.f4006e.g();
        }

        public final String toString() {
            return "ReceiveHasNext@" + i0.d(this);
        }

        public final rf.l<Throwable, m> w(E e10) {
            rf.l<E, m> lVar = this.f4005d.f4001a.f4014a;
            if (lVar != null) {
                return new n(lVar, e10, this.f4006e.getContext());
            }
            return null;
        }

        public final void x(j<?> jVar) {
            Throwable th = jVar.f4030d;
            k<Boolean> kVar = this.f4006e;
            if ((th == null ? kVar.b(Boolean.FALSE, (Object) null) : kVar.l(jVar.B())) != null) {
                this.f4005d.f4002b = jVar;
                kVar.g();
            }
        }
    }

    public final class e extends ag.e {

        /* renamed from: a  reason: collision with root package name */
        public final r<?> f4007a;

        public e(r<?> rVar) {
            this.f4007a = rVar;
        }

        public final void a(Throwable th) {
            if (this.f4007a.t()) {
                a.this.getClass();
            }
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return m.f8717a;
        }

        public final String toString() {
            return "RemoveReceiveOnCancel[" + this.f4007a + ']';
        }
    }

    public static final class f extends i.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f4009d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(kotlinx.coroutines.internal.i iVar, a aVar) {
            super(iVar);
            this.f4009d = aVar;
        }

        public final v c(Object obj) {
            kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) obj;
            if (this.f4009d.u()) {
                return null;
            }
            return androidx.databinding.a.f1765b;
        }
    }

    @lf.e(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    public static final class g extends lf.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f4010a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a<E> f4011b;

        /* renamed from: c  reason: collision with root package name */
        public int f4012c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(a<E> aVar, jf.d<? super g> dVar) {
            super(dVar);
            this.f4011b = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f4010a = obj;
            this.f4012c |= Integer.MIN_VALUE;
            Object m = this.f4011b.m(this);
            return m == kf.a.f10464a ? m : new i(m);
        }
    }

    public a(rf.l<? super E, m> lVar) {
        super(lVar);
    }

    public final void e(CancellationException cancellationException) {
        if (!v()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(getClass().getSimpleName().concat(" was cancelled"));
            }
            w(k(cancellationException));
        }
    }

    public final Object h() {
        Object y10 = y();
        return y10 == gc.b.f8935e ? i.f4027b : y10 instanceof j ? new i.a(((j) y10).f4030d) : y10;
    }

    public final h<E> iterator() {
        return new C0065a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(jf.d<? super cg.i<? extends E>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof cg.a.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            cg.a$g r0 = (cg.a.g) r0
            int r1 = r0.f4012c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4012c = r1
            goto L_0x0018
        L_0x0013:
            cg.a$g r0 = new cg.a$g
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f4010a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f4012c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            cb.b.J(r7)
            goto L_0x009e
        L_0x0028:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0030:
            cb.b.J(r7)
            java.lang.Object r7 = r6.y()
            kotlinx.coroutines.internal.v r2 = gc.b.f8935e
            if (r7 == r2) goto L_0x004a
            boolean r0 = r7 instanceof cg.j
            if (r0 == 0) goto L_0x0049
            cg.j r7 = (cg.j) r7
            java.lang.Throwable r7 = r7.f4030d
            cg.i$a r0 = new cg.i$a
            r0.<init>(r7)
            r7 = r0
        L_0x0049:
            return r7
        L_0x004a:
            r0.f4012c = r3
            jf.d r7 = e9.c.g(r0)
            ag.l r7 = cb.d.J(r7)
            rf.l<E, ff.m> r0 = r6.f4014a
            if (r0 != 0) goto L_0x005e
            cg.a$b r0 = new cg.a$b
            r0.<init>(r7)
            goto L_0x0064
        L_0x005e:
            cg.a$c r4 = new cg.a$c
            r4.<init>(r7, r0)
            r0 = r4
        L_0x0064:
            boolean r4 = r6.q(r0)
            if (r4 == 0) goto L_0x0073
            cg.a$e r2 = new cg.a$e
            r2.<init>(r0)
            r7.v(r2)
            goto L_0x0097
        L_0x0073:
            java.lang.Object r4 = r6.y()
            boolean r5 = r4 instanceof cg.j
            if (r5 == 0) goto L_0x0081
            cg.j r4 = (cg.j) r4
            r0.x(r4)
            goto L_0x0097
        L_0x0081:
            if (r4 == r2) goto L_0x0064
            int r2 = r0.f4004e
            if (r2 != r3) goto L_0x008d
            cg.i r2 = new cg.i
            r2.<init>(r4)
            goto L_0x008e
        L_0x008d:
            r2 = r4
        L_0x008e:
            rf.l r0 = r0.w(r4)
            int r3 = r7.f474c
            r7.A(r2, r3, r0)
        L_0x0097:
            java.lang.Object r7 = r7.s()
            if (r7 != r1) goto L_0x009e
            return r1
        L_0x009e:
            cg.i r7 = (cg.i) r7
            java.lang.Object r7 = r7.f4028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.a.m(jf.d):java.lang.Object");
    }

    public final t<E> n() {
        t<E> n2 = super.n();
        if (n2 != null) {
            boolean z10 = n2 instanceof j;
        }
        return n2;
    }

    public boolean q(r<? super E> rVar) {
        int v3;
        kotlinx.coroutines.internal.i q10;
        boolean s10 = s();
        h hVar = this.f4015b;
        if (!s10) {
            f fVar = new f(rVar, this);
            do {
                kotlinx.coroutines.internal.i q11 = hVar.q();
                if (!(!(q11 instanceof v))) {
                    break;
                }
                v3 = q11.v(rVar, hVar, fVar);
                if (v3 == 1) {
                    return true;
                }
            } while (v3 != 2);
        } else {
            do {
                q10 = hVar.q();
                if (!(!(q10 instanceof v))) {
                }
            } while (!q10.l(rVar, hVar));
            return true;
        }
        return false;
    }

    public abstract boolean s();

    public abstract boolean u();

    public boolean v() {
        kotlinx.coroutines.internal.i p10 = this.f4015b.p();
        j jVar = null;
        j jVar2 = p10 instanceof j ? (j) p10 : null;
        if (jVar2 != null) {
            b.g(jVar2);
            jVar = jVar2;
        }
        return jVar != null && u();
    }

    public void w(boolean z10) {
        j<?> d10 = d();
        if (d10 != null) {
            Object obj = null;
            while (true) {
                kotlinx.coroutines.internal.i q10 = d10.q();
                if (q10 instanceof h) {
                    x(obj, d10);
                    return;
                } else if (!q10.t()) {
                    ((q) q10.o()).f10733a.r();
                } else {
                    obj = f1.C(obj, (v) q10);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public void x(Object obj, j<?> jVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((v) obj).y(jVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((v) arrayList.get(size)).y(jVar);
        }
    }

    public Object y() {
        while (true) {
            v p10 = p();
            if (p10 == null) {
                return gc.b.f8935e;
            }
            if (p10.z() != null) {
                p10.w();
                return p10.x();
            }
            p10.A();
        }
    }
}
