package cg;

import ag.c2;
import ag.i0;
import androidx.fragment.app.z0;
import cg.i;
import cg.o;
import d2.f1;
import e9.c;
import ff.m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.d;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.internal.v;
import rf.l;
import sf.j;
import sf.y;

public abstract class b<E> implements w<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4013c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "onCloseHandler");

    /* renamed from: a  reason: collision with root package name */
    public final l<E, m> f4014a;

    /* renamed from: b  reason: collision with root package name */
    public final h f4015b = new h();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a<E> extends v {

        /* renamed from: d  reason: collision with root package name */
        public final E f4016d;

        public a(E e10) {
            this.f4016d = e10;
        }

        public final String toString() {
            return "SendBuffered@" + i0.d(this) + '(' + this.f4016d + ')';
        }

        public final void w() {
        }

        public final Object x() {
            return this.f4016d;
        }

        public final void y(j<?> jVar) {
        }

        public final v z() {
            return ag.m.f438a;
        }
    }

    public b(l<? super E, m> lVar) {
        this.f4014a = lVar;
    }

    public static final void a(b bVar, ag.l lVar, Object obj, j jVar) {
        b0 a10;
        bVar.getClass();
        g(jVar);
        Throwable th = jVar.f4030d;
        if (th == null) {
            th = new l();
        }
        l<E, m> lVar2 = bVar.f4014a;
        if (lVar2 == null || (a10 = o.a(lVar2, obj, (b0) null)) == null) {
            lVar.resumeWith(cb.b.u(th));
            return;
        }
        z0.c(a10, th);
        lVar.resumeWith(cb.b.u(a10));
    }

    public static void g(j jVar) {
        Object obj = null;
        while (true) {
            i q10 = jVar.q();
            r rVar = q10 instanceof r ? (r) q10 : null;
            if (rVar == null) {
                break;
            } else if (!rVar.t()) {
                ((q) rVar.o()).f10733a.r();
            } else {
                obj = f1.C(obj, rVar);
            }
        }
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((r) obj).x(jVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((r) arrayList.get(size)).x(jVar);
        }
    }

    public Object b(x xVar) {
        boolean z10;
        i q10;
        boolean i8 = i();
        h hVar = this.f4015b;
        if (i8) {
            do {
                q10 = hVar.q();
                if (q10 instanceof t) {
                    return q10;
                }
            } while (!q10.l(xVar, hVar));
            return null;
        }
        c cVar = new c(xVar, this);
        while (true) {
            i q11 = hVar.q();
            if (!(q11 instanceof t)) {
                int v3 = q11.v(xVar, hVar, cVar);
                z10 = true;
                if (v3 != 1) {
                    if (v3 == 2) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return q11;
            }
        }
        if (!z10) {
            return gc.b.B;
        }
        return null;
    }

    public String c() {
        return "";
    }

    public final j<?> d() {
        i q10 = this.f4015b.q();
        j<?> jVar = q10 instanceof j ? (j) q10 : null;
        if (jVar == null) {
            return null;
        }
        g(jVar);
        return jVar;
    }

    public final void f(o.b bVar) {
        boolean z10;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4013c;
        while (true) {
            z10 = false;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, bVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    z11 = false;
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        v vVar = gc.b.C;
        if (!z11) {
            Object obj = this.onCloseHandler;
            if (obj == vVar) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(c4.a.c("Another handler was already registered: ", obj));
        }
        j<?> d10 = d();
        if (d10 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4013c;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, bVar, vVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != bVar) {
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                bVar.invoke(d10.f4030d);
            }
        }
    }

    public abstract boolean i();

    public abstract boolean j();

    public final boolean k(Throwable th) {
        boolean z10;
        boolean z11;
        Object obj;
        v vVar;
        j jVar = new j(th);
        h hVar = this.f4015b;
        while (true) {
            i q10 = hVar.q();
            z10 = false;
            if (!(q10 instanceof j)) {
                if (q10.l(jVar, hVar)) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (!z11) {
            jVar = (j) this.f4015b.q();
        }
        g(jVar);
        if (!(!z11 || (obj = this.onCloseHandler) == null || obj == (vVar = gc.b.C))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4013c;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                y.c(1, obj);
                ((l) obj).invoke(th);
            }
        }
        return z11;
    }

    public Object l(E e10) {
        t n2;
        do {
            n2 = n();
            if (n2 == null) {
                return gc.b.f8934d;
            }
        } while (n2.b(e10) == null);
        n2.j(e10);
        return n2.g();
    }

    public t<E> n() {
        i iVar;
        i u7;
        h hVar = this.f4015b;
        while (true) {
            iVar = (i) hVar.o();
            if (iVar != hVar && (iVar instanceof t)) {
                if (((((t) iVar) instanceof j) && !iVar.s()) || (u7 = iVar.u()) == null) {
                    break;
                }
                u7.r();
            }
        }
        iVar = null;
        return (t) iVar;
    }

    public final Object o(E e10) {
        i.a aVar;
        Object l10 = l(e10);
        if (l10 == gc.b.f8933c) {
            return m.f8717a;
        }
        if (l10 == gc.b.f8934d) {
            j<?> d10 = d();
            if (d10 == null) {
                return i.f4027b;
            }
            g(d10);
            Throwable th = d10.f4030d;
            if (th == null) {
                th = new l();
            }
            aVar = new i.a(th);
        } else if (l10 instanceof j) {
            j jVar = (j) l10;
            g(jVar);
            Throwable th2 = jVar.f4030d;
            if (th2 == null) {
                th2 = new l();
            }
            aVar = new i.a(th2);
        } else {
            throw new IllegalStateException(("trySend returned " + l10).toString());
        }
        return aVar;
    }

    public final v p() {
        kotlinx.coroutines.internal.i iVar;
        kotlinx.coroutines.internal.i u7;
        h hVar = this.f4015b;
        while (true) {
            iVar = (kotlinx.coroutines.internal.i) hVar.o();
            if (iVar != hVar && (iVar instanceof v)) {
                if (((((v) iVar) instanceof j) && !iVar.s()) || (u7 = iVar.u()) == null) {
                    break;
                }
                u7.r();
            }
        }
        iVar = null;
        return (v) iVar;
    }

    public final boolean r() {
        return d() != null;
    }

    public final Object t(E e10, d<? super m> dVar) {
        Object l10 = l(e10);
        v vVar = gc.b.f8933c;
        if (l10 == vVar) {
            return m.f8717a;
        }
        ag.l J = cb.d.J(c.g(dVar));
        while (true) {
            if (!(this.f4015b.p() instanceof t) && j()) {
                l<E, m> lVar = this.f4014a;
                x xVar = lVar == null ? new x(e10, J) : new y(e10, J, lVar);
                Object b10 = b(xVar);
                if (b10 == null) {
                    J.v(new c2(xVar));
                    break;
                } else if (b10 instanceof j) {
                    a(this, J, e10, (j) b10);
                    break;
                } else if (b10 != gc.b.B && !(b10 instanceof r)) {
                    throw new IllegalStateException(("enqueueSend returned " + b10).toString());
                }
            }
            Object l11 = l(e10);
            if (l11 == vVar) {
                J.resumeWith(m.f8717a);
                break;
            } else if (l11 != gc.b.f8934d) {
                if (l11 instanceof j) {
                    a(this, J, e10, (j) l11);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + l11).toString());
                }
            }
        }
        Object s10 = J.s();
        kf.a aVar = kf.a.f10464a;
        if (s10 != aVar) {
            s10 = m.f8717a;
        }
        return s10 == aVar ? s10 : m.f8717a;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('@');
        sb2.append(i0.d(this));
        sb2.append('{');
        h hVar = this.f4015b;
        kotlinx.coroutines.internal.i p10 = hVar.p();
        if (p10 == hVar) {
            str = "EmptyQueue";
        } else {
            if (p10 instanceof j) {
                str2 = p10.toString();
            } else if (p10 instanceof r) {
                str2 = "ReceiveQueued";
            } else if (p10 instanceof v) {
                str2 = "SendQueued";
            } else {
                str2 = "UNEXPECTED:" + p10;
            }
            kotlinx.coroutines.internal.i q10 = hVar.q();
            if (q10 != p10) {
                StringBuilder b10 = d.a.b(str2, ",queueSize=");
                int i8 = 0;
                for (kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) hVar.o(); !j.a(iVar, hVar); iVar = iVar.p()) {
                    if (iVar instanceof kotlinx.coroutines.internal.i) {
                        i8++;
                    }
                }
                b10.append(i8);
                str = b10.toString();
                if (q10 instanceof j) {
                    str = str + ",closedForSend=" + q10;
                }
            } else {
                str = str2;
            }
        }
        sb2.append(str);
        sb2.append('}');
        sb2.append(c());
        return sb2.toString();
    }
}
