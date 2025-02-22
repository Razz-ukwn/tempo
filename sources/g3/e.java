package g3;

import android.view.Choreographer;

public final /* synthetic */ class e implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f8818a;

    public /* synthetic */ e(Runnable runnable) {
        this.f8818a = runnable;
    }

    public final void doFrame(long j10) {
        this.f8818a.run();
    }
}
