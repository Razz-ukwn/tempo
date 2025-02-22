package ke;

import android.net.Uri;
import com.quickkonnect.silencio.R;
import droidninja.filepicker.views.SmoothCheckBox;
import ke.b;
import me.b;
import sf.j;

public final class e implements SmoothCheckBox.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f10435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f10436b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b.a f10437c;

    public e(b bVar, me.b bVar2, b.a aVar) {
        this.f10435a = bVar;
        this.f10436b = bVar2;
        this.f10437c = aVar;
    }

    public final void a(SmoothCheckBox smoothCheckBox, boolean z10) {
        j.f(smoothCheckBox, "checkBox");
        b bVar = this.f10435a;
        me.b bVar2 = this.f10436b;
        bVar.s(bVar2);
        Uri uri = bVar2.B;
        if (z10) {
            int i8 = je.e.f9993a;
            je.e.b(uri, 2);
        } else {
            int i10 = je.e.f9993a;
            je.e.d(uri, 2);
        }
        this.f10437c.f2440a.setBackgroundResource(z10 ? R.color.bg_gray : 17170443);
    }
}
