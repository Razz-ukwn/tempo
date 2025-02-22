package jc;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b3.m;
import b3.z;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.R;
import nc.a;
import nc.y0;
import sf.j;

public final class t implements m.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9969a;

    public t(MainActivity mainActivity) {
        this.f9969a = mainActivity;
    }

    public final void a(m mVar, z zVar) {
        j.f(mVar, "<anonymous parameter 0>");
        j.f(zVar, "destination");
        int i8 = zVar.D;
        MainActivity mainActivity = this.f9969a;
        switch (i8) {
            case R.id.homeFragment /*2131296822*/:
            case R.id.mapFragment /*2131296945*/:
            case R.id.shopFragment /*2131297144*/:
            case R.id.walletFragment /*2131297463*/:
                y0 y0Var = mainActivity.Y;
                j.c(y0Var);
                ConstraintLayout constraintLayout = ((a) y0Var.f11875c).f11624b;
                j.e(constraintLayout, "binding.activityMain.clBottomNav");
                constraintLayout.setVisibility(0);
                y0 y0Var2 = mainActivity.Y;
                j.c(y0Var2);
                ImageView imageView = ((a) y0Var2.f11875c).f11625c;
                j.e(imageView, "binding.activityMain.ivFabBottomNav");
                imageView.setVisibility(0);
                break;
            default:
                y0 y0Var3 = mainActivity.Y;
                j.c(y0Var3);
                ConstraintLayout constraintLayout2 = ((a) y0Var3.f11875c).f11624b;
                j.e(constraintLayout2, "binding.activityMain.clBottomNav");
                constraintLayout2.setVisibility(8);
                y0 y0Var4 = mainActivity.Y;
                j.c(y0Var4);
                ImageView imageView2 = ((a) y0Var4.f11875c).f11625c;
                j.e(imageView2, "binding.activityMain.ivFabBottomNav");
                imageView2.setVisibility(8);
                break;
        }
        y0 y0Var5 = mainActivity.Y;
        j.c(y0Var5);
        ((a) y0Var5.f11875c).f11626d.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_home_unselected, 0, 0);
        y0 y0Var6 = mainActivity.Y;
        j.c(y0Var6);
        ((a) y0Var6.f11875c).f11629g.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_wallet_unselected, 0, 0);
        y0 y0Var7 = mainActivity.Y;
        j.c(y0Var7);
        ((a) y0Var7.f11875c).f11627e.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_map_unselected, 0, 0);
        y0 y0Var8 = mainActivity.Y;
        j.c(y0Var8);
        ((a) y0Var8.f11875c).f11628f.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_shop_unselected, 0, 0);
        switch (zVar.D) {
            case R.id.homeFragment /*2131296822*/:
                y0 y0Var9 = mainActivity.Y;
                j.c(y0Var9);
                ((a) y0Var9.f11875c).f11626d.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_home_selected, 0, 0);
                return;
            case R.id.mapFragment /*2131296945*/:
                y0 y0Var10 = mainActivity.Y;
                j.c(y0Var10);
                ((a) y0Var10.f11875c).f11627e.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_map_selected, 0, 0);
                return;
            case R.id.shopFragment /*2131297144*/:
                y0 y0Var11 = mainActivity.Y;
                j.c(y0Var11);
                ((a) y0Var11.f11875c).f11628f.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_shop_selected, 0, 0);
                return;
            case R.id.walletFragment /*2131297463*/:
                y0 y0Var12 = mainActivity.Y;
                j.c(y0Var12);
                ((a) y0Var12.f11875c).f11629g.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_wallet_selected, 0, 0);
                return;
            default:
                return;
        }
    }
}
