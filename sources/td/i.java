package td;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.tabs.home.HomeViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.tabs.home.HomeViewModel$getDashboard$1", f = "HomeViewModel.kt", l = {81}, m = "invokeSuspend")
public final class i extends lf.i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f15618a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f15619b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(HomeViewModel homeViewModel, d<? super i> dVar) {
        super(2, dVar);
        this.f15619b = homeViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new i(this.f15619b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f15618a;
        HomeViewModel homeViewModel = this.f15619b;
        if (i8 == 0) {
            b.J(obj);
            if (zd.a.g(homeViewModel)) {
                mc.d dVar = homeViewModel.f7115g;
                this.f15618a = 1;
                obj = dVar.f11382a.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                homeViewModel.f7118j.k(new g.a(homeViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                homeViewModel.f7118j.k(new g.a(homeViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        homeViewModel.f7118j.k(homeViewModel.f((b0) obj));
        return m.f8717a;
    }
}
