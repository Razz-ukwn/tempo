package androidx.databinding;

import android.view.Choreographer;

public final class h implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewDataBinding f1772a;

    public h(ViewDataBinding viewDataBinding) {
        this.f1772a = viewDataBinding;
    }

    public final void doFrame(long j10) {
        this.f1772a.D.run();
    }
}
