package rd;

import android.widget.EditText;
import android.widget.TextView;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import ff.m;
import gf.q;
import java.util.List;
import kotlinx.coroutines.flow.y0;
import nc.e1;
import rf.l;
import sf.j;
import sf.k;

public final class e extends k implements l<List<? extends UserModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f14216a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ProfileFragment profileFragment) {
        super(1);
        this.f14216a = profileFragment;
    }

    public final Object invoke(Object obj) {
        List list = (List) obj;
        j.e(list, "users");
        UserModel userModel = (UserModel) q.v0(list);
        if (userModel != null) {
            ProfileFragment profileFragment = this.f14216a;
            e1 e1Var = profileFragment.A0;
            j.c(e1Var);
            e1Var.w(userModel);
            e1 e1Var2 = profileFragment.A0;
            j.c(e1Var2);
            e1Var2.Z.setText(userModel.getCountryCode() + ' ' + userModel.getPhone());
            y0 y0Var = profileFragment.o0().f7092j;
            String firstName = userModel.getFirstName();
            String str = "";
            if (firstName == null) {
                firstName = str;
            }
            y0Var.setValue(firstName);
            y0 y0Var2 = profileFragment.o0().f7093k;
            String lastName = userModel.getLastName();
            if (lastName != null) {
                str = lastName;
            }
            y0Var2.setValue(str);
            if (j.a(userModel.getRegistrationType(), "google")) {
                e1 e1Var3 = profileFragment.A0;
                j.c(e1Var3);
                e1Var3.f11666d0.setVisibility(4);
                e1 e1Var4 = profileFragment.A0;
                j.c(e1Var4);
                TextView textView = e1Var4.f11671i0;
                j.e(textView, "binding.tvProfilePhoneNumber");
                textView.setVisibility(8);
                e1 e1Var5 = profileFragment.A0;
                j.c(e1Var5);
                EditText editText = e1Var5.Z;
                j.e(editText, "binding.etProfilePhoneNumber");
                editText.setVisibility(8);
                e1 e1Var6 = profileFragment.A0;
                j.c(e1Var6);
                TextView textView2 = e1Var6.f11668f0;
                j.e(textView2, "binding.tvProfileEmail");
                textView2.setVisibility(0);
                e1 e1Var7 = profileFragment.A0;
                j.c(e1Var7);
                EditText editText2 = e1Var7.W;
                j.e(editText2, "binding.etProfileEmail");
                editText2.setVisibility(0);
                e1 e1Var8 = profileFragment.A0;
                j.c(e1Var8);
                e1Var8.W.setText(userModel.getEmail());
            } else if (j.a(userModel.getRegistrationType(), "email")) {
                e1 e1Var9 = profileFragment.A0;
                j.c(e1Var9);
                TextView textView3 = e1Var9.f11666d0;
                j.e(textView3, "binding.tvProfileChangePassword");
                textView3.setVisibility(0);
                e1 e1Var10 = profileFragment.A0;
                j.c(e1Var10);
                TextView textView4 = e1Var10.f11671i0;
                j.e(textView4, "binding.tvProfilePhoneNumber");
                textView4.setVisibility(8);
                e1 e1Var11 = profileFragment.A0;
                j.c(e1Var11);
                EditText editText3 = e1Var11.Z;
                j.e(editText3, "binding.etProfilePhoneNumber");
                editText3.setVisibility(8);
                e1 e1Var12 = profileFragment.A0;
                j.c(e1Var12);
                TextView textView5 = e1Var12.f11668f0;
                j.e(textView5, "binding.tvProfileEmail");
                textView5.setVisibility(0);
                e1 e1Var13 = profileFragment.A0;
                j.c(e1Var13);
                EditText editText4 = e1Var13.W;
                j.e(editText4, "binding.etProfileEmail");
                editText4.setVisibility(0);
                e1 e1Var14 = profileFragment.A0;
                j.c(e1Var14);
                e1Var14.W.setText(userModel.getEmail());
            } else {
                e1 e1Var15 = profileFragment.A0;
                j.c(e1Var15);
                TextView textView6 = e1Var15.f11666d0;
                j.e(textView6, "binding.tvProfileChangePassword");
                textView6.setVisibility(0);
                e1 e1Var16 = profileFragment.A0;
                j.c(e1Var16);
                TextView textView7 = e1Var16.f11671i0;
                j.e(textView7, "binding.tvProfilePhoneNumber");
                textView7.setVisibility(0);
                e1 e1Var17 = profileFragment.A0;
                j.c(e1Var17);
                EditText editText5 = e1Var17.Z;
                j.e(editText5, "binding.etProfilePhoneNumber");
                editText5.setVisibility(0);
                e1 e1Var18 = profileFragment.A0;
                j.c(e1Var18);
                TextView textView8 = e1Var18.f11668f0;
                j.e(textView8, "binding.tvProfileEmail");
                textView8.setVisibility(8);
                e1 e1Var19 = profileFragment.A0;
                j.c(e1Var19);
                EditText editText6 = e1Var19.W;
                j.e(editText6, "binding.etProfileEmail");
                editText6.setVisibility(8);
            }
        }
        return m.f8717a;
    }
}
