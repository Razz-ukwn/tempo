package jc;

import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import bc.e;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.UpdateCheckData;
import com.quickkonnect.silencio.models.response.UpdateCheckResponse;
import ff.m;
import rf.l;
import sf.j;
import sf.k;
import zd.g;

public final class w extends k implements l<g<UpdateCheckResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f9971a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(MainActivity mainActivity) {
        super(1);
        this.f9971a = mainActivity;
    }

    public final Object invoke(Object obj) {
        UpdateCheckResponse updateCheckResponse;
        UpdateCheckData data;
        g gVar = (g) obj;
        if (!(gVar instanceof g.a) && !(gVar instanceof g.b) && !(gVar instanceof g.c) && (gVar instanceof g.d) && (updateCheckResponse = (UpdateCheckResponse) gVar.f17948a) != null && (data = updateCheckResponse.getData()) != null) {
            MainActivity mainActivity = this.f9971a;
            b.a aVar = new b.a(mainActivity);
            String string = mainActivity.getString(R.string.alert_title);
            AlertController.b bVar = aVar.f681a;
            bVar.f664d = string;
            bVar.f666f = ((UpdateCheckResponse) gVar.f17948a).getMessage();
            e eVar = new e(mainActivity, 1);
            bVar.f667g = "Update";
            bVar.f668h = eVar;
            bVar.f671k = false;
            if (j.a(data.isForceUpdate(), Boolean.FALSE)) {
                bVar.f671k = true;
                v vVar = new v();
                bVar.f669i = "Cancel";
                bVar.f670j = vVar;
            }
            aVar.a().show();
        }
        return m.f8717a;
    }
}
