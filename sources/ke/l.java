package ke;

import android.net.Uri;
import droidninja.filepicker.views.SmoothCheckBox;
import je.e;
import ke.i;
import me.d;
import sf.j;

public final class l implements SmoothCheckBox.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f10457a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f10458b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i.a f10459c;

    public l(i.a aVar, i iVar, d dVar) {
        this.f10457a = iVar;
        this.f10458b = dVar;
        this.f10459c = aVar;
    }

    public final void a(SmoothCheckBox smoothCheckBox, boolean z10) {
        j.f(smoothCheckBox, "checkBox");
        i iVar = this.f10457a;
        d dVar = this.f10458b;
        iVar.s(dVar);
        i.a aVar = this.f10459c;
        aVar.f10450x.setVisibility(z10 ? 0 : 8);
        Uri uri = dVar.B;
        SmoothCheckBox smoothCheckBox2 = aVar.f10447u;
        if (z10) {
            smoothCheckBox2.setVisibility(0);
            int i8 = e.f9993a;
            e.b(uri, 1);
        } else {
            smoothCheckBox2.setVisibility(8);
            int i10 = e.f9993a;
            e.d(uri, 1);
        }
        a aVar2 = iVar.G;
        if (aVar2 != null) {
            aVar2.a();
        }
    }
}
