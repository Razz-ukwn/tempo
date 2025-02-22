package a2;

import a2.e;
import android.view.View;
import android.view.ViewTreeObserver;

public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.b f75a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f76b;

    public c(e.b bVar, View view) {
        this.f75a = bVar;
        this.f76b = view;
    }

    public final boolean onPreDraw() {
        e.b bVar = this.f75a;
        if (bVar.f83b.a()) {
            return false;
        }
        this.f76b.getViewTreeObserver().removeOnPreDrawListener(this);
        bVar.getClass();
        return true;
    }
}
