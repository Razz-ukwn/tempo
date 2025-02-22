package rd;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel$deleteAccount$1", f = "ProfileViewModel.kt", l = {79}, m = "invokeSuspend")
public final class t extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14240a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProfileViewModel f14241b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(ProfileViewModel profileViewModel, d<? super t> dVar) {
        super(2, dVar);
        this.f14241b = profileViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new t(this.f14241b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f14240a;
        ProfileViewModel profileViewModel = this.f14241b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(profileViewModel);
            v<g<BaseResponse>> vVar = profileViewModel.m;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = profileViewModel.f7089g;
                this.f14240a = 1;
                obj = aVar2.f11379a.j(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(profileViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                profileViewModel.m.k(new g.a(profileViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        profileViewModel.m.k(profileViewModel.f((b0) obj));
        return m.f8717a;
    }
}
