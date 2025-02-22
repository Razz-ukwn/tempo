package jc;

import android.widget.ImageView;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import e9.c;
import ff.m;
import gf.q;
import h4.h;
import java.util.List;
import k4.a;
import k4.b;
import nc.y0;
import nc.z0;
import rf.l;
import sf.j;
import sf.k;
import x3.f;

public final class u extends k implements l<List<? extends UserModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9970a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(MainActivity mainActivity) {
        super(1);
        this.f9970a = mainActivity;
    }

    public final Object invoke(Object obj) {
        List list = (List) obj;
        j.e(list, "it");
        UserModel userModel = (UserModel) q.x0(0, list);
        if (userModel != null) {
            MainActivity mainActivity = this.f9970a;
            y0 y0Var = mainActivity.Y;
            j.c(y0Var);
            ImageView imageView = ((z0) y0Var.f11877e).f11879b;
            j.e(imageView, "binding.includeDrawerNavigationView.ivUserImg");
            String profileImg = userModel.getProfileImg();
            f e10 = cb.f.e(imageView.getContext());
            h.a aVar = new h.a(imageView.getContext());
            aVar.f9171c = profileImg;
            aVar.c(imageView);
            aVar.b(true);
            aVar.F = Integer.valueOf(R.drawable.user_img);
            aVar.G = null;
            aVar.m = c.n(gf.l.f0(new b[]{new a()}));
            e10.a(aVar.a());
            y0 y0Var2 = mainActivity.Y;
            j.c(y0Var2);
            ((z0) y0Var2.f11877e).f11888k.setText(userModel.getNickName());
        }
        return m.f8717a;
    }
}
