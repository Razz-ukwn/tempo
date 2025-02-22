package cg;

import gc.b;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.v;
import rf.l;

public final class m<E> extends a<E> {

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantLock f4031d = new ReentrantLock();

    /* renamed from: e  reason: collision with root package name */
    public Object f4032e = b.f8932b;

    public m(l<? super E, ff.m> lVar) {
        super(lVar);
    }

    public final String c() {
        ReentrantLock reentrantLock = this.f4031d;
        reentrantLock.lock();
        try {
            return "(value=" + this.f4032e + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        return false;
    }

    /* JADX INFO: finally extract failed */
    public final Object l(E e10) {
        t n2;
        ReentrantLock reentrantLock = this.f4031d;
        reentrantLock.lock();
        j<?> d10 = d();
        if (d10 != null) {
            reentrantLock.unlock();
            return d10;
        }
        Object obj = this.f4032e;
        v vVar = b.f8932b;
        if (obj == vVar) {
            do {
                try {
                    n2 = n();
                    if (n2 != null) {
                        if (n2 instanceof j) {
                            reentrantLock.unlock();
                            return n2;
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } while (n2.b(e10) == null);
            ff.m mVar = ff.m.f8717a;
            reentrantLock.unlock();
            n2.j(e10);
            return n2.g();
        }
        Object obj2 = this.f4032e;
        b0 b0Var = null;
        if (obj2 != vVar) {
            l<E, ff.m> lVar = this.f4014a;
            if (lVar != null) {
                b0Var = o.a(lVar, obj2, (b0) null);
            }
        }
        this.f4032e = e10;
        if (b0Var == null) {
            v vVar2 = b.f8933c;
            reentrantLock.unlock();
            return vVar2;
        }
        throw b0Var;
    }

    public final boolean q(r<? super E> rVar) {
        ReentrantLock reentrantLock = this.f4031d;
        reentrantLock.lock();
        try {
            return super.q(rVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean s() {
        return false;
    }

    public final boolean u() {
        ReentrantLock reentrantLock = this.f4031d;
        reentrantLock.lock();
        try {
            return this.f4032e == b.f8932b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void w(boolean z10) {
        ReentrantLock reentrantLock = this.f4031d;
        reentrantLock.lock();
        try {
            v vVar = b.f8932b;
            Object obj = this.f4032e;
            b0 b0Var = null;
            if (obj != vVar) {
                l<E, ff.m> lVar = this.f4014a;
                if (lVar != null) {
                    b0Var = o.a(lVar, obj, (b0) null);
                }
            }
            this.f4032e = vVar;
            ff.m mVar = ff.m.f8717a;
            reentrantLock.unlock();
            super.w(z10);
            if (b0Var != null) {
                throw b0Var;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Object y() {
        ReentrantLock reentrantLock = this.f4031d;
        reentrantLock.lock();
        try {
            Object obj = this.f4032e;
            v vVar = b.f8932b;
            if (obj == vVar) {
                Object d10 = d();
                if (d10 == null) {
                    d10 = b.f8935e;
                }
                return d10;
            }
            this.f4032e = vVar;
            ff.m mVar = ff.m.f8717a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
