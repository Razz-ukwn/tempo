package h4;

import ag.f2;
import android.view.View;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import b1.b;
import coil.request.ViewTargetRequestDelegate;
import java.util.concurrent.CancellationException;

public final class q implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public b f9222a;

    /* renamed from: b  reason: collision with root package name */
    public f2 f9223b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTargetRequestDelegate f9224c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9225d;

    public q(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f9224c;
        if (viewTargetRequestDelegate != null) {
            this.f9225d = true;
            viewTargetRequestDelegate.f4042a.a(viewTargetRequestDelegate.f4043b);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f9224c;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.f4046e.e((CancellationException) null);
            j4.b<?> bVar = viewTargetRequestDelegate.f4044c;
            boolean z10 = bVar instanceof o;
            j jVar = viewTargetRequestDelegate.f4045d;
            if (z10) {
                jVar.c((o) bVar);
            }
            jVar.c(viewTargetRequestDelegate);
        }
    }
}
