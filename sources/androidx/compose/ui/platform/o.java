package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;
import sf.j;

public final /* synthetic */ class o implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f1359a;

    public /* synthetic */ o(AndroidComposeView androidComposeView) {
        this.f1359a = androidComposeView;
    }

    public final void onScrollChanged() {
        Class<?> cls = AndroidComposeView.L0;
        AndroidComposeView androidComposeView = this.f1359a;
        j.f(androidComposeView, "this$0");
        androidComposeView.L();
    }
}
