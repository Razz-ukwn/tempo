package i4;

import ag.l;
import android.view.View;
import android.view.ViewTreeObserver;
import e9.c;
import i4.g;
import x3.i;

public final class d<T extends View> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f9570a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9571b;

    public d(T t2, boolean z10) {
        this.f9570a = t2;
        this.f9571b = z10;
    }

    public final T a() {
        return this.f9570a;
    }

    public final boolean b() {
        return this.f9571b;
    }

    public final Object c(i iVar) {
        e a10 = g.a.a(this);
        if (a10 != null) {
            return a10;
        }
        l lVar = new l(1, c.g(iVar));
        lVar.t();
        ViewTreeObserver viewTreeObserver = this.f9570a.getViewTreeObserver();
        i iVar2 = new i(this, viewTreeObserver, lVar);
        viewTreeObserver.addOnPreDrawListener(iVar2);
        lVar.v(new h(this, viewTreeObserver, iVar2));
        return lVar.s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r4 = r4.f9571b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof i4.d
            if (r1 == 0) goto L_0x001b
            i4.d r4 = (i4.d) r4
            T r1 = r4.f9570a
            T r2 = r3.f9570a
            boolean r1 = sf.j.a(r2, r1)
            if (r1 == 0) goto L_0x001b
            boolean r4 = r4.f9571b
            boolean r1 = r3.f9571b
            if (r1 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9571b) + (this.f9570a.hashCode() * 31);
    }
}
