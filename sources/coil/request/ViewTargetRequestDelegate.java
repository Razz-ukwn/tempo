package coil.request;

import ag.f1;
import ag.f2;
import ag.n1;
import ag.s0;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import h4.h;
import h4.q;
import j4.b;
import java.util.concurrent.CancellationException;
import jf.d;
import kotlinx.coroutines.internal.m;
import m4.c;
import x3.f;

public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final f f4042a;

    /* renamed from: b  reason: collision with root package name */
    public final h f4043b;

    /* renamed from: c  reason: collision with root package name */
    public final b<?> f4044c;

    /* renamed from: d  reason: collision with root package name */
    public final j f4045d;

    /* renamed from: e  reason: collision with root package name */
    public final n1 f4046e;

    public ViewTargetRequestDelegate(f fVar, h hVar, b<?> bVar, j jVar, n1 n1Var) {
        super(0);
        this.f4042a = fVar;
        this.f4043b = hVar;
        this.f4044c = bVar;
        this.f4045d = jVar;
        this.f4046e = n1Var;
    }

    public final void a() {
        b bVar = this.f4044c;
        if (!bVar.a().isAttachedToWindow()) {
            q c3 = c.c(bVar.a());
            ViewTargetRequestDelegate viewTargetRequestDelegate = c3.f9224c;
            if (viewTargetRequestDelegate != null) {
                viewTargetRequestDelegate.f4046e.e((CancellationException) null);
                b<?> bVar2 = viewTargetRequestDelegate.f4044c;
                boolean z10 = bVar2 instanceof o;
                j jVar = viewTargetRequestDelegate.f4045d;
                if (z10) {
                    jVar.c((o) bVar2);
                }
                jVar.c(viewTargetRequestDelegate);
            }
            c3.f9224c = this;
            throw new CancellationException("'ViewTarget.view' must be attached to a window.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [j4.b<?>, j4.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r5 = this;
            androidx.lifecycle.j r0 = r5.f4045d
            r0.a(r5)
            j4.b<?> r1 = r5.f4044c
            boolean r2 = r1 instanceof androidx.lifecycle.o
            if (r2 == 0) goto L_0x0014
            r2 = r1
            androidx.lifecycle.o r2 = (androidx.lifecycle.o) r2
            r0.c(r2)
            r0.a(r2)
        L_0x0014:
            android.view.View r0 = r1.a()
            h4.q r0 = m4.c.c(r0)
            coil.request.ViewTargetRequestDelegate r1 = r0.f9224c
            if (r1 == 0) goto L_0x0036
            r2 = 0
            ag.n1 r3 = r1.f4046e
            r3.e(r2)
            j4.b<?> r2 = r1.f4044c
            boolean r3 = r2 instanceof androidx.lifecycle.o
            androidx.lifecycle.j r4 = r1.f4045d
            if (r3 == 0) goto L_0x0033
            androidx.lifecycle.o r2 = (androidx.lifecycle.o) r2
            r4.c(r2)
        L_0x0033:
            r4.c(r1)
        L_0x0036:
            r0.f9224c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.request.ViewTargetRequestDelegate.f():void");
    }

    public final void o(p pVar) {
        q c3 = c.c(this.f4044c.a());
        synchronized (c3) {
            f2 f2Var = c3.f9223b;
            if (f2Var != null) {
                f2Var.e((CancellationException) null);
            }
            f1 f1Var = f1.f418a;
            kotlinx.coroutines.scheduling.c cVar = s0.f480a;
            c3.f9223b = cb.b.D(f1Var, m.f10728a.J0(), 0, new h4.p(c3, (d<? super h4.p>) null), 2);
            c3.f9222a = null;
        }
    }
}
