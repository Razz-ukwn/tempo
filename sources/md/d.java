package md;

import android.media.AudioManager;
import androidx.fragment.app.q;
import bh.a;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import sf.j;

public final /* synthetic */ class d implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11392a;

    public /* synthetic */ d(MeasuringBottomSheet measuringBottomSheet) {
        this.f11392a = measuringBottomSheet;
    }

    public final void onAudioFocusChange(int i8) {
        int i10 = MeasuringBottomSheet.f6988h1;
        MeasuringBottomSheet measuringBottomSheet = this.f11392a;
        j.f(measuringBottomSheet, "this$0");
        a.f3654a.b(q.a("==== audio focus ", i8), new Object[0]);
        if ((i8 == -2 || i8 == -1) && measuringBottomSheet.Y0) {
            measuringBottomSheet.Z0 = true;
            measuringBottomSheet.F0();
            measuringBottomSheet.B0().getClass();
            measuringBottomSheet.D0();
        }
    }
}
