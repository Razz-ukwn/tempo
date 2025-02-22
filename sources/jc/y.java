package jc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.MainViewModel;
import com.quickkonnect.silencio.models.request.UpdateCheckRequestModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;

@e(c = "com.quickkonnect.silencio.MainViewModel$checkUpdate$1", f = "MainViewModel.kt", l = {37}, m = "invokeSuspend")
public final class y extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9972a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainViewModel f9973b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9974c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(MainViewModel mainViewModel, int i8, d<? super y> dVar) {
        super(2, dVar);
        this.f9973b = mainViewModel;
        this.f9974c = i8;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new y(this.f9973b, this.f9974c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f9972a;
        MainViewModel mainViewModel = this.f9973b;
        if (i8 == 0) {
            b.J(obj);
            mc.a aVar2 = mainViewModel.f6668h;
            UpdateCheckRequestModel updateCheckRequestModel = new UpdateCheckRequestModel(String.valueOf(this.f9974c), (String) null, 2, (sf.e) null);
            this.f9972a = 1;
            obj = aVar2.f11379a.g(updateCheckRequestModel, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                bh.a.f3654a.c(e10);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mainViewModel.f6670j.k(mainViewModel.f((b0) obj));
        return m.f8717a;
    }
}
