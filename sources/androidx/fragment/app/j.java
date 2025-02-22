package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f2009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2010b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Rect f2011c;

    public j(x0 x0Var, View view, Rect rect) {
        this.f2009a = x0Var;
        this.f2010b = view;
        this.f2011c = rect;
    }

    public final void run() {
        this.f2009a.getClass();
        x0.g(this.f2010b, this.f2011c);
    }
}
