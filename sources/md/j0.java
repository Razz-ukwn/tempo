package md;

import android.content.Intent;
import android.net.Uri;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import rf.a;
import sf.j;
import sf.k;

public final class j0 extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11407a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(MeasuringBottomSheet measuringBottomSheet) {
        super(0);
        this.f11407a = measuringBottomSheet;
    }

    public final Object d() {
        int i8 = MeasuringBottomSheet.f6988h1;
        MeasuringBottomSheet measuringBottomSheet = this.f11407a;
        measuringBottomSheet.C0();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Uri fromParts = Uri.fromParts("package", measuringBottomSheet.e0().getPackageName(), (String) null);
        j.e(fromParts, "fromParts(\"package\", req…text().packageName, null)");
        intent.setData(fromParts);
        measuringBottomSheet.m0(intent);
        return m.f8717a;
    }
}
