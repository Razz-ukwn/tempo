package kotlinx.coroutines.internal;

import ag.c0;
import ag.i0;
import ag.i2;
import ag.k;
import ag.l;
import ag.q0;
import ag.w;
import ag.x;
import ag.y0;
import com.google.android.gms.internal.p000firebaseauthapi.g;
import ff.h;
import ff.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lf.d;
import sf.j;

public final class f<T> extends q0<T> implements d, jf.d<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    public Object B = g.f4560d;
    public final Object C = x.b(getContext());
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f10709d;

    /* renamed from: e  reason: collision with root package name */
    public final jf.d<T> f10710e;

    public f(c0 c0Var, jf.d<? super T> dVar) {
        super(-1);
        this.f10709d = c0Var;
        this.f10710e = dVar;
    }

    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof x) {
            ((x) obj).f508b.invoke(cancellationException);
        }
    }

    public final jf.d<T> d() {
        return this;
    }

    public final d getCallerFrame() {
        jf.d<T> dVar = this.f10710e;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final jf.f getContext() {
        return this.f10710e.getContext();
    }

    public final Object j() {
        Object obj = this.B;
        this.B = g.f4560d;
        return obj;
    }

    public final l<T> k() {
        boolean z10;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            v vVar = g.f4561e;
            if (obj == null) {
                this._reusableCancellableContinuation = vVar;
                return null;
            } else if (obj instanceof l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, vVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return (l) obj;
                }
            } else if (obj != vVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean m() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean o(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            v vVar = g.f4561e;
            boolean z10 = false;
            boolean z11 = true;
            if (j.a(obj, vVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, th)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z11 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z11) {
                    return false;
                }
            }
        }
    }

    public final void p() {
        Object obj = this._reusableCancellableContinuation;
        l lVar = obj instanceof l ? (l) obj : null;
        if (lVar != null) {
            lVar.p();
        }
    }

    public final Throwable q(k<?> kVar) {
        boolean z10;
        do {
            Object obj = this._reusableCancellableContinuation;
            v vVar = g.f4561e;
            z10 = false;
            if (obj == vVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = D;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, (Object) null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!z10);
        return null;
    }

    public final void resumeWith(Object obj) {
        jf.f context;
        Object c3;
        jf.d<T> dVar = this.f10710e;
        jf.f context2 = dVar.getContext();
        Throwable a10 = h.a(obj);
        Object wVar = a10 == null ? obj : new w(a10, false);
        c0 c0Var = this.f10709d;
        if (c0Var.H0()) {
            this.B = wVar;
            this.f474c = 0;
            c0Var.F0(context2, this);
            return;
        }
        y0 a11 = i2.a();
        if (a11.M0()) {
            this.B = wVar;
            this.f474c = 0;
            a11.K0(this);
            return;
        }
        a11.L0(true);
        try {
            context = getContext();
            c3 = x.c(context, this.C);
            dVar.resumeWith(obj);
            m mVar = m.f8717a;
            x.a(context, c3);
            do {
            } while (a11.O0());
        } catch (Throwable th) {
            try {
                h(th, (Throwable) null);
            } catch (Throwable th2) {
                a11.J0(true);
                throw th2;
            }
        }
        a11.J0(true);
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f10709d + ", " + i0.e(this.f10710e) + ']';
    }
}
