package od;

import com.quickkonnect.silencio.ui.measure.result.ResultBottomSheet;
import ff.m;
import rf.a;
import sf.j;
import sf.k;

public final class e extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ResultBottomSheet f12297a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ResultBottomSheet resultBottomSheet) {
        super(0);
        this.f12297a = resultBottomSheet;
    }

    public final Object d() {
        ResultBottomSheet resultBottomSheet = this.f12297a;
        j.f(resultBottomSheet, "<this>");
        try {
            ag.m.c(resultBottomSheet).o();
        } catch (Exception e10) {
            bh.a.f3654a.c(e10);
        }
        return m.f8717a;
    }
}
