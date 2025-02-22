package dg;

import jf.d;
import jf.f;

public final class v<T> implements d<T>, lf.d {

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f7590a;

    /* renamed from: b  reason: collision with root package name */
    public final f f7591b;

    public v(d<? super T> dVar, f fVar) {
        this.f7590a = dVar;
        this.f7591b = fVar;
    }

    public final lf.d getCallerFrame() {
        d<T> dVar = this.f7590a;
        if (dVar instanceof lf.d) {
            return (lf.d) dVar;
        }
        return null;
    }

    public final f getContext() {
        return this.f7591b;
    }

    public final void resumeWith(Object obj) {
        this.f7590a.resumeWith(obj);
    }
}
