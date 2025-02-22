package bc;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.x;
import bh.a;
import com.quickkonnect.silencio.MainActivity;
import sf.j;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3614a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3615b;

    public /* synthetic */ e(Object obj, int i8) {
        this.f3614a = i8;
        this.f3615b = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i8) {
        int i10 = this.f3614a;
        Object obj = this.f3615b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                int i11 = f.F0;
                j.f(fVar, "this$0");
                x o10 = fVar.o();
                if (o10 != null) {
                    o10.onBackPressed();
                    return;
                }
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                j.f(mainActivity, "this$0");
                try {
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + mainActivity.getPackageName())));
                } catch (ActivityNotFoundException unused) {
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + mainActivity.getPackageName())));
                } catch (Exception e10) {
                    a.f3654a.c(e10);
                }
                mainActivity.finish();
                return;
            default:
                rf.a aVar = (rf.a) obj;
                j.f(aVar, "$onPositiveClick");
                dialogInterface.dismiss();
                aVar.d();
                return;
        }
    }
}
