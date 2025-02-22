package ub;

import android.media.MediaRecorder;
import com.lassi.presentation.cameraview.controls.m;

public final class v implements MediaRecorder.OnInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f15988a;

    public v(m mVar) {
        this.f15988a = mVar;
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i8, int i10) {
        m mVar = this.f15988a;
        if (i8 == 800) {
            mVar.f6533b.getClass();
            mVar.a();
        } else if (i8 == 801) {
            mVar.f6533b.getClass();
            mVar.a();
        }
    }
}
