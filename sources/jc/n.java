package jc;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.MainViewModel;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import gf.q;
import java.util.List;
import sb.c;
import sf.j;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9960a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9961b;

    public /* synthetic */ n(MainActivity mainActivity, int i8) {
        this.f9960a = i8;
        this.f9961b = mainActivity;
    }

    public final void onClick(View view) {
        UserModel userModel;
        int i8 = this.f9960a;
        MainActivity mainActivity = this.f9961b;
        switch (i8) {
            case 0:
                int i10 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                zd.j.a(mainActivity, "https://www.videoask.com/fqrg8ofpm");
                return;
            case 1:
                int i11 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                List d10 = ((MainViewModel) mainActivity.f6653c0.getValue()).f6669i.d();
                if (d10 != null && (userModel = (UserModel) q.x0(0, d10)) != null) {
                    String string = mainActivity.getString(R.string.invite_string_formatter, new Object[]{userModel.getNickName()});
                    j.e(string, "getString(R.string.invit…g_formatter, it.nickName)");
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", string);
                    mainActivity.startActivity(Intent.createChooser(intent, "Share using"));
                    return;
                }
                return;
            default:
                int i12 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                b.a aVar = new b.a(mainActivity);
                AlertController.b bVar = aVar.f681a;
                bVar.f664d = "Logout";
                bVar.f666f = "Are you sure you want to logout";
                c cVar = new c(mainActivity, 2);
                bVar.f667g = "Yes";
                bVar.f668h = cVar;
                r rVar = new r();
                bVar.f669i = "No";
                bVar.f670j = rVar;
                aVar.a().show();
                return;
        }
    }
}
