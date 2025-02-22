package sb;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.webkit.SslErrorHandler;
import androidx.fragment.app.x;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.ui.tabs.map.MapFragment;
import ec.e;
import rf.a;
import sf.j;
import vd.d;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14882a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14883b;

    public /* synthetic */ c(Object obj, int i8) {
        this.f14882a = i8;
        this.f14883b = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i8) {
        int i10 = this.f14882a;
        Object obj = this.f14883b;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                int i11 = e.C0;
                j.f(eVar, "this$0");
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                x o10 = eVar.o();
                intent.setData(Uri.fromParts("package", o10 != null ? o10.getPackageName() : null, (String) null));
                eVar.A0.a(intent);
                return;
            case 1:
                e eVar2 = (e) obj;
                int i12 = e.G0;
                j.f(eVar2, "this$0");
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                x o11 = eVar2.o();
                intent2.setData(Uri.fromParts("package", o11 != null ? o11.getPackageName() : null, (String) null));
                eVar2.C0.a(intent2);
                return;
            case 2:
                MainActivity mainActivity = (MainActivity) obj;
                int i13 = MainActivity.f6650h0;
                j.f(mainActivity, "this$0");
                dialogInterface.dismiss();
                zd.j.b(mainActivity);
                return;
            case 3:
                a aVar = (a) obj;
                int i14 = MapFragment.B0;
                j.f(aVar, "$onNegativeClick");
                dialogInterface.dismiss();
                aVar.d();
                return;
            default:
                SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
                int i15 = d.f16421b;
                j.c(sslErrorHandler);
                sslErrorHandler.cancel();
                return;
        }
    }
}
