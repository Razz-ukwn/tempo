package oe;

import ag.g0;
import cb.b;
import ff.m;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "droidninja.filepicker.viewmodels.VMDocPicker$getDocs$1", f = "VMDocPicker.kt", l = {30}, m = "invokeSuspend")
public final class c extends i implements p<g0, d<? super m>, Object> {
    public final /* synthetic */ Comparator B;

    /* renamed from: a  reason: collision with root package name */
    public g0 f12318a;

    /* renamed from: b  reason: collision with root package name */
    public g0 f12319b;

    /* renamed from: c  reason: collision with root package name */
    public int f12320c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f12321d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ List f12322e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(f fVar, List list, Comparator comparator, d dVar) {
        super(2, dVar);
        this.f12321d = fVar;
        this.f12322e = list;
        this.B = comparator;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        j.f(dVar, "completion");
        c cVar = new c(this.f12321d, this.f12322e, this.B, dVar);
        cVar.f12318a = (g0) obj;
        return cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create(obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f12320c;
        f fVar = this.f12321d;
        if (i8 == 0) {
            b.J(obj);
            this.f12319b = this.f12318a;
            this.f12320c = 1;
            obj = fVar.g(this.f12322e, this.B, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar.f12333h.i((HashMap) obj);
        return m.f8717a;
    }
}
