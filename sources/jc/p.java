package jc;

import android.view.View;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.R;
import nc.a;
import nc.y0;
import sf.j;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9964a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9965b;

    public /* synthetic */ p(MainActivity mainActivity, int i8) {
        this.f9964a = i8;
        this.f9965b = mainActivity;
    }

    public final void onClick(View view) {
        int i8 = this.f9964a;
        MainActivity mainActivity = this.f9965b;
        switch (i8) {
            case 0:
                int i10 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                zd.j.a(mainActivity, "https://www.silencio.network/academy");
                return;
            case 1:
                int i11 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                y0 y0Var = mainActivity.Y;
                j.c(y0Var);
                ((a) y0Var.f11875c).f11623a.setSelectedItemId(R.id.mapFragment);
                return;
            default:
                int i12 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                mainActivity.M();
                return;
        }
    }
}
