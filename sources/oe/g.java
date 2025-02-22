package oe;

import ag.g0;
import cb.b;
import ff.m;
import gf.n;
import java.util.ArrayList;
import java.util.Comparator;
import jf.d;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "droidninja.filepicker.viewmodels.VMMediaPicker$getMedia$1", f = "VMMediaPicker.kt", l = {52}, m = "invokeSuspend")
public final class g extends i implements p<g0, d<? super m>, Object> {
    public final /* synthetic */ String B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: a  reason: collision with root package name */
    public g0 f12334a;

    /* renamed from: b  reason: collision with root package name */
    public g0 f12335b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f12336c;

    /* renamed from: d  reason: collision with root package name */
    public int f12337d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f12338e;

    public static final class a<T> implements Comparator<me.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12339a = new a();

        public final int compare(Object obj, Object obj2) {
            return (int) (((me.d) obj2).f11471d - ((me.d) obj).f11471d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(i iVar, String str, int i8, int i10, int i11, d dVar) {
        super(2, dVar);
        this.f12338e = iVar;
        this.B = str;
        this.C = i8;
        this.D = i10;
        this.E = i11;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        j.f(dVar, "completion");
        g gVar = new g(this.f12338e, this.B, this.C, this.D, this.E, dVar);
        gVar.f12334a = (g0) obj;
        return gVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create(obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f12337d;
        if (i8 == 0) {
            b.J(obj);
            g0 g0Var = this.f12334a;
            ArrayList arrayList2 = new ArrayList();
            i iVar = this.f12338e;
            String str = this.B;
            int i10 = this.C;
            int i11 = this.D;
            int i12 = this.E;
            this.f12335b = g0Var;
            this.f12336c = arrayList2;
            this.f12337d = 1;
            obj = iVar.i(str, i10, i11, i12, this);
            if (obj == aVar) {
                return aVar;
            }
            arrayList = arrayList2;
        } else if (i8 == 1) {
            arrayList = this.f12336c;
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<me.e> iterable = (Iterable) obj;
        ArrayList arrayList3 = new ArrayList(gf.m.n0(iterable));
        for (me.e eVar : iterable) {
            arrayList3.add(Boolean.valueOf(arrayList.addAll(eVar.B)));
        }
        n.o0(arrayList, a.f12339a);
        i iVar2 = this.f12338e;
        iVar2.f12345h.i(arrayList);
        i.g(iVar2);
        return m.f8717a;
    }
}
