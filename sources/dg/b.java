package dg;

import dg.c;
import ff.m;
import java.util.Arrays;
import jf.d;
import sf.j;

public abstract class b<S extends c<?>> {

    /* renamed from: a  reason: collision with root package name */
    public S[] f7526a;

    /* renamed from: b  reason: collision with root package name */
    public int f7527b;

    /* renamed from: c  reason: collision with root package name */
    public int f7528c;

    /* renamed from: d  reason: collision with root package name */
    public w f7529d;

    public final S d() {
        S s10;
        w wVar;
        synchronized (this) {
            S[] sArr = this.f7526a;
            if (sArr == null) {
                sArr = f();
                this.f7526a = sArr;
            } else if (this.f7527b >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                j.e(copyOf, "copyOf(this, newSize)");
                this.f7526a = (c[]) copyOf;
                sArr = (c[]) copyOf;
            }
            int i8 = this.f7528c;
            do {
                s10 = sArr[i8];
                if (s10 == null) {
                    s10 = e();
                    sArr[i8] = s10;
                }
                i8++;
                if (i8 >= sArr.length) {
                    i8 = 0;
                }
            } while (!s10.a(this));
            this.f7528c = i8;
            this.f7527b++;
            wVar = this.f7529d;
        }
        if (wVar != null) {
            synchronized (wVar) {
                Object[] objArr = wVar.D;
                j.c(objArr);
                wVar.h(Integer.valueOf(((Number) objArr[((int) ((wVar.E + ((long) ((int) ((wVar.q() + ((long) wVar.G)) - wVar.E)))) - 1)) & (objArr.length - 1)]).intValue() + 1));
            }
        }
        return s10;
    }

    public abstract S e();

    public abstract c[] f();

    public final void g(S s10) {
        w wVar;
        int i8;
        d[] b10;
        synchronized (this) {
            int i10 = this.f7527b - 1;
            this.f7527b = i10;
            wVar = this.f7529d;
            if (i10 == 0) {
                this.f7528c = 0;
            }
            b10 = s10.b(this);
        }
        for (d dVar : b10) {
            if (dVar != null) {
                dVar.resumeWith(m.f8717a);
            }
        }
        if (wVar != null) {
            synchronized (wVar) {
                Object[] objArr = wVar.D;
                j.c(objArr);
                wVar.h(Integer.valueOf(((Number) objArr[((int) ((wVar.E + ((long) ((int) ((wVar.q() + ((long) wVar.G)) - wVar.E)))) - 1)) & (objArr.length - 1)]).intValue() - 1));
            }
        }
    }

    public final w j() {
        w wVar;
        synchronized (this) {
            wVar = this.f7529d;
            if (wVar == null) {
                wVar = new w(this.f7527b);
                this.f7529d = wVar;
            }
        }
        return wVar;
    }
}
