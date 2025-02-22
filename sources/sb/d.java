package sb;

import android.content.DialogInterface;
import androidx.fragment.app.x;
import sf.j;
import yb.e;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14884a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f14885b;

    public /* synthetic */ d(e eVar, int i8) {
        this.f14884a = i8;
        this.f14885b = eVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i8) {
        int i10 = this.f14884a;
        e eVar = this.f14885b;
        switch (i10) {
            case 0:
                e eVar2 = (e) eVar;
                int i11 = e.C0;
                j.f(eVar2, "this$0");
                x o10 = eVar2.o();
                if (o10 != null) {
                    o10.onBackPressed();
                    return;
                }
                return;
            default:
                ec.e eVar3 = (ec.e) eVar;
                int i12 = ec.e.G0;
                j.f(eVar3, "this$0");
                x o11 = eVar3.o();
                if (o11 != null) {
                    o11.onBackPressed();
                    return;
                }
                return;
        }
    }
}
