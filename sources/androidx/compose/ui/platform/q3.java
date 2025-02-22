package androidx.compose.ui.platform;

import android.view.View;
import sf.j;
import t.z1;

public final class q3 implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1404a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z1 f1405b;

    public q3(View view, z1 z1Var) {
        this.f1404a = view;
        this.f1405b = z1Var;
    }

    public final void onViewAttachedToWindow(View view) {
        j.f(view, "v");
    }

    public final void onViewDetachedFromWindow(View view) {
        j.f(view, "v");
        this.f1404a.removeOnAttachStateChangeListener(this);
        this.f1405b.n();
    }
}
