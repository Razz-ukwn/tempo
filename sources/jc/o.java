package jc;

import android.view.View;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.R;
import nc.a;
import nc.y0;
import sf.j;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9962a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9963b;

    public /* synthetic */ o(MainActivity mainActivity, int i8) {
        this.f9962a = i8;
        this.f9963b = mainActivity;
    }

    public final void onClick(View view) {
        int i8 = this.f9962a;
        MainActivity mainActivity = this.f9963b;
        switch (i8) {
            case 0:
                int i10 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                zd.j.a(mainActivity, "https://discord.gg/AZzXMgpJdt");
                return;
            case 1:
                int i11 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                y0 y0Var = mainActivity.Y;
                j.c(y0Var);
                ((a) y0Var.f11875c).f11623a.setSelectedItemId(R.id.walletFragment);
                return;
            default:
                int i12 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                mainActivity.M();
                return;
        }
    }
}
