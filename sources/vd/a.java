package vd;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;
import com.quickkonnect.silencio.ui.tabs.map.MapFragment;
import sf.j;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16417a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16418b;

    public /* synthetic */ a(Object obj, int i8) {
        this.f16417a = i8;
        this.f16418b = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i8) {
        int i10 = this.f16417a;
        Object obj = this.f16418b;
        switch (i10) {
            case 0:
                rf.a aVar = (rf.a) obj;
                int i11 = MapFragment.B0;
                j.f(aVar, "$onPositiveClick");
                dialogInterface.dismiss();
                aVar.d();
                return;
            case 1:
                rf.a aVar2 = (rf.a) obj;
                j.f(aVar2, "$onNegativeClick");
                dialogInterface.dismiss();
                aVar2.d();
                return;
            default:
                SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
                int i12 = d.f16421b;
                j.c(sslErrorHandler);
                sslErrorHandler.proceed();
                return;
        }
    }
}
