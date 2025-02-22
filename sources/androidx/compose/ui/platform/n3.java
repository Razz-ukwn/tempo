package androidx.compose.ui.platform;

import ag.f2;
import ag.n1;
import android.view.View;
import java.util.concurrent.CancellationException;
import sf.j;

public final class n3 implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n1 f1358a;

    public n3(f2 f2Var) {
        this.f1358a = f2Var;
    }

    public final void onViewAttachedToWindow(View view) {
        j.f(view, "v");
    }

    public final void onViewDetachedFromWindow(View view) {
        j.f(view, "v");
        view.removeOnAttachStateChangeListener(this);
        this.f1358a.e((CancellationException) null);
    }
}
