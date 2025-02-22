package rd;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel;
import ff.m;
import java.io.File;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;
import zf.n;

@e(c = "com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel$editProfile$1", f = "ProfileViewModel.kt", l = {49}, m = "invokeSuspend")
public final class u extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14242a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProfileViewModel f14243b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f14244c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ File f14245d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(ProfileViewModel profileViewModel, boolean z10, File file, d<? super u> dVar) {
        super(2, dVar);
        this.f14243b = profileViewModel;
        this.f14244c = z10;
        this.f14245d = file;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new u(this.f14243b, this.f14244c, this.f14245d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f14242a;
        ProfileViewModel profileViewModel = this.f14243b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(profileViewModel);
            v<g<LoginWithPhoneResponseModel>> vVar = profileViewModel.f7094l;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = profileViewModel.f7089g;
                String obj2 = n.Z0((String) profileViewModel.f7092j.getValue()).toString();
                String obj3 = n.Z0((String) profileViewModel.f7093k.getValue()).toString();
                boolean z10 = this.f14244c;
                File file = this.f14245d;
                this.f14242a = 1;
                obj = aVar2.a(obj2, obj3, z10, file, this);
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
                profileViewModel.f7094l.k(new g.a(profileViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        profileViewModel.f7094l.k(profileViewModel.f((b0) obj));
        return m.f8717a;
    }
}
