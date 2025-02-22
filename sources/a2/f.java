package a2;

import a2.e;
import android.view.View;
import android.view.ViewTreeObserver;

public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.a f84a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f85b;

    public f(e.a aVar, View view) {
        this.f84a = aVar;
        this.f85b = view;
    }

    public final boolean onPreDraw() {
        if (this.f84a.f83b.a()) {
            return false;
        }
        this.f85b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
