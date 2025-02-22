package xd;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.tabs.shop.ShopViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.tabs.shop.ShopViewModel$getEarnings$1", f = "ShopViewModel.kt", l = {31}, m = "invokeSuspend")
public final class f extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17068a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ShopViewModel f17069b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(ShopViewModel shopViewModel, d<? super f> dVar) {
        super(2, dVar);
        this.f17069b = shopViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new f(this.f17069b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f17068a;
        ShopViewModel shopViewModel = this.f17069b;
        if (i8 == 0) {
            b.J(obj);
            if (zd.a.g(shopViewModel)) {
                mc.d dVar = shopViewModel.f7146g;
                this.f17068a = 1;
                obj = dVar.f11382a.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                shopViewModel.f7147h.k(new g.a(shopViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                shopViewModel.f7147h.k(new g.a(shopViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        shopViewModel.f7147h.k(shopViewModel.f((b0) obj));
        return m.f8717a;
    }
}
