package jc;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import b3.d0;
import b3.f0;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.R;
import nc.a;
import nc.y0;
import sf.j;
import zd.h;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9958a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9959b;

    public /* synthetic */ m(MainActivity mainActivity, int i8) {
        this.f9958a = i8;
        this.f9959b = mainActivity;
    }

    public final void onClick(View view) {
        int i8 = this.f9958a;
        MainActivity mainActivity = this.f9959b;
        switch (i8) {
            case 0:
                int i10 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                y0 y0Var = mainActivity.Y;
                j.c(y0Var);
                ((a) y0Var.f11875c).f11623a.setSelectedItemId(R.id.homeFragment);
                return;
            case 1:
                int i11 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                zd.j.a(mainActivity, "https://www.silencio.network/whitepaper");
                return;
            case 2:
                int i12 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                SharedPreferences sharedPreferences = h.f17950a;
                if (sharedPreferences == null) {
                    j.l("prefs");
                    throw null;
                } else if (sharedPreferences.getBoolean("HOW_TO_MEASURE", false)) {
                    d0 d0Var = mainActivity.Z;
                    if (d0Var != null) {
                        d0Var.l(R.id.measuringBottomSheet, (Bundle) null, (f0) null);
                        return;
                    } else {
                        j.l("navController");
                        throw null;
                    }
                } else {
                    d0 d0Var2 = mainActivity.Z;
                    if (d0Var2 != null) {
                        d0Var2.l(R.id.howToMeasureBottomSheet, (Bundle) null, (f0) null);
                        return;
                    } else {
                        j.l("navController");
                        throw null;
                    }
                }
            default:
                int i13 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                d0 d0Var3 = mainActivity.Z;
                if (d0Var3 != null) {
                    d0Var3.l(R.id.historyFragment, (Bundle) null, (f0) null);
                    y0 y0Var2 = mainActivity.Y;
                    j.c(y0Var2);
                    ((DrawerLayout) y0Var2.f11874b).b();
                    return;
                }
                j.l("navController");
                throw null;
        }
    }
}
