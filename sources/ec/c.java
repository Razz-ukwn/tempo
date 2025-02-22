package ec;

import android.widget.TextView;
import androidx.lifecycle.w;
import com.quickkonnect.silencio.R;
import sf.j;

public final /* synthetic */ class c implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f7912a;

    public /* synthetic */ c(e eVar) {
        this.f7912a = eVar;
    }

    public final void b(Object obj) {
        Boolean bool = (Boolean) obj;
        int i8 = e.G0;
        e eVar = this.f7912a;
        j.f(eVar, "this$0");
        j.e(bool, "it");
        if (bool.booleanValue()) {
            ((TextView) eVar.u0(R.id.tvNoDataFound)).setVisibility(0);
        } else {
            ((TextView) eVar.u0(R.id.tvNoDataFound)).setVisibility(8);
        }
    }
}
