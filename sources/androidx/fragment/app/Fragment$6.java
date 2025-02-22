package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;

class Fragment$6 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f1892a;

    public Fragment$6(p pVar) {
        this.f1892a = pVar;
    }

    public final void d(p pVar, j.a aVar) {
        View view;
        if (aVar == j.a.ON_STOP && (view = this.f1892a.f2066d0) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
