package td;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.tabs.home.HomeViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.tabs.home.HomeViewModel$getEarnings$1", f = "HomeViewModel.kt", l = {59}, m = "invokeSuspend")
public final class j extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f15620a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f15621b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(HomeViewModel homeViewModel, d<? super j> dVar) {
        super(2, dVar);
        this.f15621b = homeViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new j(this.f15621b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f15620a;
        HomeViewModel homeViewModel = this.f15621b;
        if (i8 == 0) {
            b.J(obj);
            if (zd.a.g(homeViewModel)) {
                mc.d dVar = homeViewModel.f7115g;
                this.f15620a = 1;
                obj = dVar.f11382a.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return m.f8717a;
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                homeViewModel.f7117i.k(new g.a(homeViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        homeViewModel.f7117i.k(homeViewModel.f((b0) obj));
        return m.f8717a;
    }
}
