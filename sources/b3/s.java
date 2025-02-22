package b3;

import android.os.Bundle;
import ff.m;
import java.util.ArrayList;
import java.util.List;
import rf.l;
import sf.j;
import sf.k;
import sf.r;
import sf.t;

public final class s extends k implements l<j, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f3167a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<j> f3168b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f3169c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m f3170d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Bundle f3171e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(r rVar, ArrayList arrayList, t tVar, m mVar, Bundle bundle) {
        super(1);
        this.f3167a = rVar;
        this.f3168b = arrayList;
        this.f3169c = tVar;
        this.f3170d = mVar;
        this.f3171e = bundle;
    }

    public final Object invoke(Object obj) {
        List<j> list;
        j jVar = (j) obj;
        j.f(jVar, "entry");
        this.f3167a.f14953a = true;
        List<j> list2 = this.f3168b;
        int indexOf = list2.indexOf(jVar);
        if (indexOf != -1) {
            t tVar = this.f3169c;
            int i8 = indexOf + 1;
            list = list2.subList(tVar.f14955a, i8);
            tVar.f14955a = i8;
        } else {
            list = gf.s.f8978a;
        }
        this.f3170d.a(jVar.f3084b, this.f3171e, jVar, list);
        return m.f8717a;
    }
}
