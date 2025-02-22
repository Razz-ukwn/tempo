package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

public final /* synthetic */ class j1 implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f1036a;

    public /* synthetic */ j1(Runnable runnable) {
        this.f1036a = runnable;
    }

    public final void onBackInvoked() {
        this.f1036a.run();
    }
}
