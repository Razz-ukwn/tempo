package od;

import android.view.View;
import b3.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.result.ResultBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class i extends k implements l<View, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ResultBottomSheet f12301a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(ResultBottomSheet resultBottomSheet) {
        super(1);
        this.f12301a = resultBottomSheet;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        try {
            ag.m.c(this.f12301a).n(new a(R.id.action_resultBottomSheet_to_infoBottomSheet));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return m.f8717a;
    }
}
