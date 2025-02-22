package cg;

import d.a;
import ff.m;
import gc.b;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.v;
import rf.l;
import sf.j;

public final class d<E> extends a<E> {
    public final ReentrantLock B;
    public Object[] C;
    public int D;

    /* renamed from: d  reason: collision with root package name */
    public final int f4018d;

    /* renamed from: e  reason: collision with root package name */
    public final e f4019e;
    private volatile /* synthetic */ int size;

    public d(int i8, e eVar, l<? super E, m> lVar) {
        super(lVar);
        this.f4018d = i8;
        this.f4019e = eVar;
        if (i8 < 1 ? false : true) {
            this.B = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i8, 8)];
            gf.l.a0(objArr, b.f8932b);
            this.C = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(a.a("ArrayChannel capacity must be at least 1, but ", i8, " was specified").toString());
    }

    public final Object b(x xVar) {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            return super.b(xVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder("(buffer:capacity=");
        sb2.append(this.f4018d);
        sb2.append(",size=");
        return rb.b.a(sb2, this.size, ')');
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        return this.size == this.f4018d && this.f4019e == e.f4020a;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(E r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.B
            r0.lock()
            int r1 = r5.size     // Catch:{ all -> 0x006b }
            cg.j r2 = r5.d()     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0011
            r0.unlock()
            return r2
        L_0x0011:
            int r2 = r5.f4018d     // Catch:{ all -> 0x006b }
            kotlinx.coroutines.internal.v r3 = gc.b.f8933c
            if (r1 >= r2) goto L_0x001c
            int r2 = r1 + 1
            r5.size = r2     // Catch:{ all -> 0x006b }
            goto L_0x0032
        L_0x001c:
            cg.e r2 = r5.f4019e     // Catch:{ all -> 0x006b }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0034
            r4 = 1
            if (r2 == r4) goto L_0x0032
            r4 = 2
            if (r2 != r4) goto L_0x002c
            r2 = r3
            goto L_0x0036
        L_0x002c:
            ff.e r6 = new ff.e     // Catch:{ all -> 0x006b }
            r6.<init>()     // Catch:{ all -> 0x006b }
            throw r6     // Catch:{ all -> 0x006b }
        L_0x0032:
            r2 = 0
            goto L_0x0036
        L_0x0034:
            kotlinx.coroutines.internal.v r2 = gc.b.f8934d     // Catch:{ all -> 0x006b }
        L_0x0036:
            if (r2 == 0) goto L_0x003c
            r0.unlock()
            return r2
        L_0x003c:
            if (r1 != 0) goto L_0x0064
        L_0x003e:
            cg.t r2 = r5.n()     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0045
            goto L_0x0064
        L_0x0045:
            boolean r4 = r2 instanceof cg.j     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x004f
            r5.size = r1     // Catch:{ all -> 0x006b }
            r0.unlock()
            return r2
        L_0x004f:
            kotlinx.coroutines.internal.v r4 = r2.b(r6)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x003e
            r5.size = r1     // Catch:{ all -> 0x006b }
            ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x006b }
            r0.unlock()
            r2.j(r6)
            java.lang.Object r6 = r2.g()
            return r6
        L_0x0064:
            r5.z(r1, r6)     // Catch:{ all -> 0x006b }
            r0.unlock()
            return r3
        L_0x006b:
            r6 = move-exception
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.d.l(java.lang.Object):java.lang.Object");
    }

    public final boolean q(r<? super E> rVar) {
        ReentrantLock reentrantLock = this.B;
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
        return this.size == 0;
    }

    public final boolean v() {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            return super.v();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void w(boolean z10) {
        l<E, m> lVar = this.f4014a;
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            int i8 = this.size;
            b0 b0Var = null;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = this.C[this.D];
                v vVar = b.f8932b;
                if (!(lVar == null || obj == vVar)) {
                    b0Var = o.a(lVar, obj, b0Var);
                }
                Object[] objArr = this.C;
                int i11 = this.D;
                objArr[i11] = vVar;
                this.D = (i11 + 1) % objArr.length;
            }
            this.size = 0;
            m mVar = m.f8717a;
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
        Object obj;
        boolean z10;
        v vVar;
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            int i8 = this.size;
            Object obj2 = b.f8935e;
            if (i8 == 0) {
                Object d10 = d();
                if (d10 != null) {
                    obj2 = d10;
                }
                return obj2;
            }
            Object[] objArr = this.C;
            int i10 = this.D;
            Object obj3 = objArr[i10];
            v vVar2 = null;
            objArr[i10] = null;
            this.size = i8 - 1;
            if (i8 == this.f4018d) {
                while (true) {
                    vVar = p();
                    if (vVar == null) {
                        break;
                    } else if (vVar.z() != null) {
                        obj = vVar.x();
                        z10 = true;
                        break;
                    } else {
                        vVar.A();
                        vVar2 = vVar;
                    }
                }
            }
            obj = obj2;
            v vVar3 = vVar2;
            z10 = false;
            vVar = vVar3;
            if (obj != obj2 && !(obj instanceof j)) {
                this.size = i8;
                Object[] objArr2 = this.C;
                objArr2[(this.D + i8) % objArr2.length] = obj;
            }
            this.D = (this.D + 1) % this.C.length;
            m mVar = m.f8717a;
            reentrantLock.unlock();
            if (z10) {
                j.c(vVar);
                vVar.w();
            }
            return obj3;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void z(int i8, E e10) {
        int i10 = this.f4018d;
        if (i8 < i10) {
            Object[] objArr = this.C;
            if (i8 >= objArr.length) {
                int min = Math.min(objArr.length * 2, i10);
                Object[] objArr2 = new Object[min];
                for (int i11 = 0; i11 < i8; i11++) {
                    Object[] objArr3 = this.C;
                    objArr2[i11] = objArr3[(this.D + i11) % objArr3.length];
                }
                Arrays.fill(objArr2, i8, min, b.f8932b);
                this.C = objArr2;
                this.D = 0;
            }
            Object[] objArr4 = this.C;
            objArr4[(this.D + i8) % objArr4.length] = e10;
            return;
        }
        Object[] objArr5 = this.C;
        int i12 = this.D;
        objArr5[i12 % objArr5.length] = null;
        objArr5[(i8 + i12) % objArr5.length] = e10;
        this.D = (i12 + 1) % objArr5.length;
    }
}
