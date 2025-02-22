package androidx.compose.ui.platform;

import android.view.ViewTreeObserver;
import m0.a;
import m0.c;
import sf.j;

public final /* synthetic */ class p implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f1386a;

    public /* synthetic */ p(AndroidComposeView androidComposeView) {
        this.f1386a = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z10) {
        Class<?> cls = AndroidComposeView.L0;
        AndroidComposeView androidComposeView = this.f1386a;
        j.f(androidComposeView, "this$0");
        int i8 = z10 ? 1 : 2;
        c cVar = androidComposeView.f1209x0;
        cVar.getClass();
        cVar.f11118b.setValue(new a(i8));
    }
}
