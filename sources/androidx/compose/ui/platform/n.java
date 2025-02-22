package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;
import sf.j;

public final /* synthetic */ class n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f1354a;

    public /* synthetic */ n(AndroidComposeView androidComposeView) {
        this.f1354a = androidComposeView;
    }

    public final void onGlobalLayout() {
        Class<?> cls = AndroidComposeView.L0;
        AndroidComposeView androidComposeView = this.f1354a;
        j.f(androidComposeView, "this$0");
        androidComposeView.L();
    }
}
