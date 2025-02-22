package md;

import android.content.Intent;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import rf.a;
import sf.k;

public final class e extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11394a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(MeasuringBottomSheet measuringBottomSheet) {
        super(0);
        this.f11394a = measuringBottomSheet;
    }

    public final Object d() {
        MeasuringBottomSheet measuringBottomSheet = this.f11394a;
        try {
            measuringBottomSheet.m0(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            measuringBottomSheet.C0();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return m.f8717a;
    }
}
