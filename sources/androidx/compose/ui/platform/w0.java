package androidx.compose.ui.platform;

import ag.c0;
import ag.s0;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ff.j;
import gf.k;
import java.util.ArrayList;
import java.util.List;
import jf.d;
import jf.f;
import kotlinx.coroutines.internal.m;
import y1.g;

public final class w0 extends c0 {
    public static final j I = b7.a.x(a.f1488a);
    public static final b J = new b();
    public final k<Runnable> B = new k<>();
    public List<Choreographer.FrameCallback> C = new ArrayList();
    public List<Choreographer.FrameCallback> D = new ArrayList();
    public boolean E;
    public boolean F;
    public final c G = new c(this);
    public final x0 H;

    /* renamed from: c  reason: collision with root package name */
    public final Choreographer f1485c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1486d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1487e = new Object();

    public static final class a extends sf.k implements rf.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1488a = new a();

        public a() {
            super(0);
        }

        public final Object d() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                kotlinx.coroutines.scheduling.c cVar = s0.f480a;
                choreographer = (Choreographer) cb.b.G(m.f10728a, new v0((d<? super v0>) null));
            }
            sf.j.e(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler a10 = g.a(Looper.getMainLooper());
            sf.j.e(a10, "createAsync(Looper.getMainLooper())");
            w0 w0Var = new w0(choreographer, a10);
            return w0Var.n0(w0Var.H);
        }
    }

    public static final class b extends ThreadLocal<f> {
        public final Object initialValue() {
            Choreographer instance = Choreographer.getInstance();
            sf.j.e(instance, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a10 = g.a(myLooper);
                sf.j.e(a10, "createAsync(\n           …d\")\n                    )");
                w0 w0Var = new w0(instance, a10);
                return w0Var.n0(w0Var.H);
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    public static final class c implements Choreographer.FrameCallback, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w0 f1489a;

        public c(w0 w0Var) {
            this.f1489a = w0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
            r0 = r3.size();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (r2 >= r0) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
            r3.get(r2).doFrame(r6);
            r2 = r2 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            r3.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void doFrame(long r6) {
            /*
                r5 = this;
                androidx.compose.ui.platform.w0 r0 = r5.f1489a
                android.os.Handler r0 = r0.f1486d
                r0.removeCallbacks(r5)
                androidx.compose.ui.platform.w0 r0 = r5.f1489a
                androidx.compose.ui.platform.w0.J0(r0)
                androidx.compose.ui.platform.w0 r0 = r5.f1489a
                java.lang.Object r1 = r0.f1487e
                monitor-enter(r1)
                boolean r2 = r0.F     // Catch:{ all -> 0x0039 }
                if (r2 != 0) goto L_0x0017
                monitor-exit(r1)
                goto L_0x0038
            L_0x0017:
                r2 = 0
                r0.F = r2     // Catch:{ all -> 0x0039 }
                java.util.List<android.view.Choreographer$FrameCallback> r3 = r0.C     // Catch:{ all -> 0x0039 }
                java.util.List<android.view.Choreographer$FrameCallback> r4 = r0.D     // Catch:{ all -> 0x0039 }
                r0.C = r4     // Catch:{ all -> 0x0039 }
                r0.D = r3     // Catch:{ all -> 0x0039 }
                monitor-exit(r1)
                int r0 = r3.size()
            L_0x0027:
                if (r2 >= r0) goto L_0x0035
                java.lang.Object r1 = r3.get(r2)
                android.view.Choreographer$FrameCallback r1 = (android.view.Choreographer.FrameCallback) r1
                r1.doFrame(r6)
                int r2 = r2 + 1
                goto L_0x0027
            L_0x0035:
                r3.clear()
            L_0x0038:
                return
            L_0x0039:
                r6 = move-exception
                monitor-exit(r1)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.w0.c.doFrame(long):void");
        }

        public final void run() {
            w0.J0(this.f1489a);
            w0 w0Var = this.f1489a;
            synchronized (w0Var.f1487e) {
                if (w0Var.C.isEmpty()) {
                    w0Var.f1485c.removeFrameCallback(this);
                    w0Var.F = false;
                }
                ff.m mVar = ff.m.f8717a;
            }
        }
    }

    public w0(Choreographer choreographer, Handler handler) {
        this.f1485c = choreographer;
        this.f1486d = handler;
        this.H = new x0(choreographer);
    }

    public static final void J0(w0 w0Var) {
        Runnable removeFirst;
        boolean z10;
        do {
            synchronized (w0Var.f1487e) {
                k<Runnable> kVar = w0Var.B;
                removeFirst = kVar.isEmpty() ? null : kVar.removeFirst();
            }
            while (removeFirst != null) {
                removeFirst.run();
                synchronized (w0Var.f1487e) {
                    k<Runnable> kVar2 = w0Var.B;
                    removeFirst = kVar2.isEmpty() ? null : kVar2.removeFirst();
                }
            }
            synchronized (w0Var.f1487e) {
                if (w0Var.B.isEmpty()) {
                    z10 = false;
                    w0Var.E = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    public final void F0(f fVar, Runnable runnable) {
        sf.j.f(fVar, "context");
        sf.j.f(runnable, "block");
        synchronized (this.f1487e) {
            this.B.addLast(runnable);
            if (!this.E) {
                this.E = true;
                this.f1486d.post(this.G);
                if (!this.F) {
                    this.F = true;
                    this.f1485c.postFrameCallback(this.G);
                }
            }
            ff.m mVar = ff.m.f8717a;
        }
    }
}
