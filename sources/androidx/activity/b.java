package androidx.activity;

import a9.e;
import android.content.Context;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.profileinstaller.c;
import ff.m;
import g3.d;
import i3.k;
import i3.p;
import i3.t;
import java.util.Arrays;
import java.util.concurrent.Executor;
import m3.f;
import sf.j;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f579b;

    public /* synthetic */ b(Object obj, int i8) {
        this.f578a = i8;
        this.f579b = obj;
    }

    public final void run() {
        Executor executor;
        boolean z10 = true;
        switch (this.f578a) {
            case 0:
                ((ComponentActivity) this.f579b).invalidateOptionsMenu();
                return;
            case 1:
                k.a((k) this.f579b);
                return;
            case 2:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f579b;
                Class<?> cls = AndroidComposeView.L0;
                j.f(androidComposeView, "this$0");
                androidComposeView.G0 = false;
                MotionEvent motionEvent = androidComposeView.A0;
                j.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    z10 = false;
                }
                if (z10) {
                    androidComposeView.J(motionEvent);
                    return;
                }
                throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
            case 3:
                c.b((Context) this.f579b, new d(0), c.f2353a, false);
                return;
            case 4:
                f.d(this.f579b);
                j.f((Object) null, "this$0");
                throw null;
            case 5:
                k kVar = (k) this.f579b;
                synchronized (kVar.m) {
                    kVar.f9472g = false;
                    k.b bVar = kVar.f9474i;
                    synchronized (bVar) {
                        Arrays.fill(bVar.f9480b, false);
                        bVar.f9482d = true;
                        m mVar = m.f8717a;
                    }
                    f fVar = kVar.f9473h;
                    if (fVar != null) {
                        fVar.close();
                    }
                }
                return;
            case 6:
                f.d(this.f579b);
                j.f((Object) null, "this$0");
                throw null;
            case 7:
                t tVar = (t) this.f579b;
                int i8 = t.f9547v;
                j.f(tVar, "this$0");
                boolean z11 = tVar.f2191c > 0;
                if (tVar.f9552q.compareAndSet(false, true) && z11) {
                    boolean z12 = tVar.f9549n;
                    p pVar = tVar.f9548l;
                    if (z12) {
                        executor = pVar.f9509c;
                        if (executor == null) {
                            j.l("internalTransactionExecutor");
                            throw null;
                        }
                    } else {
                        executor = pVar.f9508b;
                        if (executor == null) {
                            j.l("internalQueryExecutor");
                            throw null;
                        }
                    }
                    executor.execute(tVar.f9555t);
                    return;
                }
                return;
            case 8:
                ((e) this.f579b).t(true);
                return;
            case 9:
                ((com.google.android.material.timepicker.c) this.f579b).i();
                return;
            default:
                Object obj = ra.e.m;
                ((ra.e) this.f579b).b(false);
                return;
        }
    }
}
