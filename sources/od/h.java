package od;

import android.view.View;
import cb.b;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.ui.measure.result.ResultBottomSheet;
import com.quickkonnect.silencio.ui.measure.result.ResultViewModel;
import ff.m;
import java.util.List;
import jf.d;
import jf.f;
import rf.l;
import sf.e;
import sf.j;
import sf.k;

public final class h extends k implements l<View, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ResultBottomSheet f12300a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ResultBottomSheet resultBottomSheet) {
        super(1);
        this.f12300a = resultBottomSheet;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        int i8 = ResultBottomSheet.U0;
        ResultBottomSheet resultBottomSheet = this.f12300a;
        ResultViewModel resultViewModel = (ResultViewModel) resultBottomSheet.R0.getValue();
        ClaimCoinRequestModel claimCoinRequestModel = new ClaimCoinRequestModel(resultBottomSheet.u0().f12303a.getSampleId(), (String) null, (String) null, (List) null, Double.valueOf((double) resultBottomSheet.u0().f12304b), 14, (e) null);
        resultViewModel.getClass();
        b.D(gc.b.o(resultViewModel), (f.b) null, 0, new m(resultViewModel, claimCoinRequestModel, (d<? super m>) null), 3);
        return m.f8717a;
    }
}
