package jd;

import android.os.Bundle;
import androidx.appcompat.app.b;
import b3.f0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorBottomSheet;
import ff.m;
import java.util.Arrays;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class e extends k implements l<g<StopRecordingResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinSourceIndoorBottomSheet f9983a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ClaimCoinSourceIndoorBottomSheet claimCoinSourceIndoorBottomSheet) {
        super(1);
        this.f9983a = claimCoinSourceIndoorBottomSheet;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        ClaimCoinSourceIndoorBottomSheet claimCoinSourceIndoorBottomSheet = this.f9983a;
        if (z10) {
            b bVar = claimCoinSourceIndoorBottomSheet.T0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = claimCoinSourceIndoorBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(claimCoinSourceIndoorBottomSheet, string, str, "OK", (String) null, false, c.f9981a, d.f9982a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = claimCoinSourceIndoorBottomSheet.T0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = claimCoinSourceIndoorBottomSheet.T0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    b3.m c3 = ag.m.c(claimCoinSourceIndoorBottomSheet);
                    String format = String.format("%.2f", Arrays.copyOf(new Object[]{((f) claimCoinSourceIndoorBottomSheet.S0.getValue()).f9984a.getEarnedAmount()}, 1));
                    j.e(format, "format(format, *args)");
                    Bundle bundle = new Bundle();
                    bundle.putString("earnedCoins", format);
                    bundle.putBoolean("isCapReached", false);
                    bundle.putBoolean("hasMicInterrupt", false);
                    bundle.putBoolean("isSpeedCapReached", false);
                    c3.l(R.id.action_claimCoinSourceBottomSheet_to_claimCoinCongratulationBottomSheet, bundle, (f0) null);
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}
