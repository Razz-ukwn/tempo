package kotlinx.coroutines.flow;

import cg.e;
import cg.q;
import dg.f;
import ff.m;
import rf.p;

public class d<T> extends f<T> {

    /* renamed from: d  reason: collision with root package name */
    public final p<q<? super T>, jf.d<? super m>, Object> f10528d;

    public d(p<? super q<? super T>, ? super jf.d<? super m>, ? extends Object> pVar, jf.f fVar, int i8, e eVar) {
        super(fVar, i8, eVar);
        this.f10528d = pVar;
    }

    public final String toString() {
        return "block[" + this.f10528d + "] -> " + super.toString();
    }
}
