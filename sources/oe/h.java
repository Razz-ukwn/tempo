package oe;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.R;
import ff.m;
import java.util.Collection;
import java.util.List;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "droidninja.filepicker.viewmodels.VMMediaPicker$getPhotoDirs$1", f = "VMMediaPicker.kt", l = {64}, m = "invokeSuspend")
public final class h extends i implements p<g0, d<? super m>, Object> {
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: a  reason: collision with root package name */
    public g0 f12340a;

    /* renamed from: b  reason: collision with root package name */
    public g0 f12341b;

    /* renamed from: c  reason: collision with root package name */
    public int f12342c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f12343d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f12344e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, int i8, int i10, int i11, d dVar) {
        super(2, dVar);
        this.f12343d = iVar;
        this.f12344e = str;
        this.B = i8;
        this.C = i10;
        this.D = i11;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        j.f(dVar, "completion");
        h hVar = new h(this.f12343d, this.f12344e, this.B, this.C, this.D, dVar);
        hVar.f12340a = (g0) obj;
        return hVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create(obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f12342c;
        if (i8 == 0) {
            b.J(obj);
            g0 g0Var = this.f12340a;
            i iVar = this.f12343d;
            String str = this.f12344e;
            int i10 = this.B;
            int i11 = this.C;
            int i12 = this.D;
            this.f12341b = g0Var;
            this.f12342c = 1;
            obj = iVar.i(str, i10, i11, i12, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        me.e eVar = new me.e(0);
        eVar.f11474b = null;
        i iVar2 = this.f12343d;
        int i13 = this.B;
        if (i13 == 1) {
            eVar.f11476d = iVar2.e().getApplicationContext().getString(R.string.all_photos);
        } else if (i13 != 3) {
            eVar.f11476d = iVar2.e().getApplicationContext().getString(R.string.all_files);
        } else {
            eVar.f11476d = iVar2.e().getApplicationContext().getString(R.string.all_videos);
        }
        Collection collection = list;
        if ((true ^ collection.isEmpty()) && ((me.e) list.get(0)).B.size() > 0) {
            eVar.f11477e = ((me.e) list.get(0)).f11477e;
            eVar.f11475c = ((me.e) list.get(0)).B.get(0).B;
        }
        int size = collection.size();
        for (int i14 = 0; i14 < size; i14++) {
            eVar.B.addAll(((me.e) list.get(i14)).B);
        }
        list.add(0, eVar);
        iVar2.f12346i.i(list);
        i.g(iVar2);
        return m.f8717a;
    }
}
