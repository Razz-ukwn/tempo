package com.lassi.presentation.cameraview.controls;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.lassi.presentation.cameraview.controls.CameraView;
import com.lassi.presentation.cameraview.controls.a;
import com.lassi.presentation.cameraview.controls.k;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.i;
import tb.l;
import ub.m;
import ub.o;
import ub.x;
import ub.y;
import vb.a;
import wb.f;
import wb.j;
import wb.p;
import wb.q;

public abstract class h implements a.C0302a, k.a, Thread.UncaughtExceptionHandler {
    public static final wb.a U = new wb.a(h.class.getSimpleName());
    public int A;
    public long B;
    public int C;
    public int D = 0;
    public final Handler E;
    public int F = Integer.MAX_VALUE;
    public int G = Integer.MAX_VALUE;
    public final u.b H = new u.b();
    public final u.b I = new u.b();
    public final u.b J = new u.b();
    public final u.b K = new u.b();
    public final u.b L = new u.b();
    public final u.b M = new u.b();
    public final u.b N = new u.b();
    public final u.b O = new u.b();
    public y P;
    public y Q;
    public y R;
    public int S;
    public int T;

    /* renamed from: a  reason: collision with root package name */
    public final CameraView.b f6477a;

    /* renamed from: b  reason: collision with root package name */
    public vb.a f6478b;

    /* renamed from: c  reason: collision with root package name */
    public q f6479c;

    /* renamed from: d  reason: collision with root package name */
    public tb.c f6480d;

    /* renamed from: e  reason: collision with root package name */
    public tb.d f6481e;

    /* renamed from: f  reason: collision with root package name */
    public l f6482f;

    /* renamed from: g  reason: collision with root package name */
    public tb.k f6483g;

    /* renamed from: h  reason: collision with root package name */
    public i f6484h;

    /* renamed from: i  reason: collision with root package name */
    public tb.h f6485i;

    /* renamed from: j  reason: collision with root package name */
    public Location f6486j;

    /* renamed from: k  reason: collision with root package name */
    public tb.a f6487k;

    /* renamed from: l  reason: collision with root package name */
    public float f6488l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6489n;

    /* renamed from: o  reason: collision with root package name */
    public int f6490o;

    /* renamed from: p  reason: collision with root package name */
    public j f6491p;

    /* renamed from: q  reason: collision with root package name */
    public o f6492q;

    /* renamed from: r  reason: collision with root package name */
    public final k f6493r;

    /* renamed from: s  reason: collision with root package name */
    public l f6494s;

    /* renamed from: t  reason: collision with root package name */
    public m f6495t;

    /* renamed from: u  reason: collision with root package name */
    public long f6496u;

    /* renamed from: v  reason: collision with root package name */
    public int f6497v;

    /* renamed from: w  reason: collision with root package name */
    public int f6498w;

    /* renamed from: x  reason: collision with root package name */
    public int f6499x;

    /* renamed from: y  reason: collision with root package name */
    public x f6500y;

    /* renamed from: z  reason: collision with root package name */
    public x f6501z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Throwable f6502a;

        public a(Throwable th) {
            this.f6502a = th;
        }

        public final void run() {
            Throwable th = this.f6502a;
            throw (th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th));
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f6503a;

        public b(m mVar) {
            this.f6503a = mVar;
        }

        public final void run() {
            h hVar = h.this;
            hVar.n();
            hVar.f6477a.a(this.f6503a);
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f6505a;

        public c(g gVar) {
            this.f6505a = gVar;
        }

        public final void run() {
            wb.a aVar = h.U;
            h hVar = this.f6505a;
            aVar.a(1, "Start:", "executing. State:", hVar.l());
            if (hVar.D < 1) {
                hVar.D = 1;
                aVar.a(1, "Start:", "about to call onStart()", hVar.l());
                hVar.i();
                aVar.a(1, "Start:", "returned from onStart().", "Dispatching.", hVar.l());
                hVar.D = 2;
                hVar.f6477a.l(hVar.f6491p);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public final void run() {
            wb.a aVar = h.U;
            Object[] objArr = new Object[4];
            objArr[0] = "Restart:";
            objArr[1] = "executing. Needs stopping:";
            h hVar = h.this;
            objArr[2] = Boolean.valueOf(hVar.D > 0);
            objArr[3] = hVar.l();
            aVar.a(1, objArr);
            if (hVar.D > 0) {
                hVar.D = -1;
                hVar.j();
                hVar.D = 0;
                aVar.a(1, "Restart:", "stopped. Dispatching.", hVar.l());
                hVar.f6477a.g();
            }
            aVar.a(1, "Restart: about to start. State:", hVar.l());
            hVar.D = 1;
            hVar.i();
            hVar.D = 2;
            aVar.a(1, "Restart: returned from start. Dispatching. State:", hVar.l());
            hVar.f6477a.l(hVar.f6491p);
        }
    }

    public static class e implements Thread.UncaughtExceptionHandler {
        public final void uncaughtException(Thread thread, Throwable th) {
        }
    }

    public h(CameraView.a aVar) {
        this.f6477a = aVar;
        this.E = new Handler(Looper.getMainLooper());
        q a10 = q.a("CameraViewController");
        this.f6479c = a10;
        a10.f16681a.setUncaughtExceptionHandler(this);
        this.f6493r = new k(this);
    }

    public final x a(i iVar) {
        Set set;
        y yVar;
        boolean d10 = d(0, 1);
        if (iVar == i.PICTURE) {
            yVar = this.Q;
            set = Collections.unmodifiableSet(this.f6491p.f6512e);
        } else {
            yVar = this.R;
            set = Collections.unmodifiableSet(this.f6491p.f6513f);
        }
        y[] yVarArr = {yVar, new wb.i()};
        ArrayList arrayList = new ArrayList(set);
        List<x> list = null;
        for (y a10 : yVarArr) {
            list = a10.a(arrayList);
            if (!list.isEmpty()) {
                break;
            }
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        x xVar = list.get(0);
        U.a(1, "computeCaptureSize:", "result:", xVar, "flip:", Boolean.valueOf(d10), "mode:", iVar);
        return d10 ? xVar.a() : xVar;
    }

    public final x b(ArrayList arrayList) {
        boolean d10 = d(0, 1);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x xVar = (x) it.next();
            if (d10) {
                xVar = xVar.a();
            }
            arrayList2.add(xVar);
        }
        x g10 = g();
        Parcelable.Creator<a> creator = a.CREATOR;
        x xVar2 = this.f6500y;
        a a10 = a.C0082a.a(xVar2.f15991a, xVar2.f15992b);
        if (d10) {
            a10 = a.C0082a.a(a10.f6451b, a10.f6450a);
        }
        wb.a aVar = U;
        aVar.a(1, "size:", "computePreviewStreamSize:", "targetRatio:", a10, "targetMinSize:", g10);
        wb.m mVar = new wb.m(new y[]{new wb.o(new wb.h(a10.a())), new wb.i()});
        wb.m mVar2 = new wb.m(new y[]{new wb.o(new com.google.android.gms.internal.p000firebaseauthapi.o(g10.f15992b)), new wb.o(new f(g10.f15991a)), new j()});
        p pVar = new p(new y[]{new wb.m(new y[]{mVar, mVar2}), mVar2, mVar, new wb.i()});
        y yVar = this.P;
        if (yVar != null) {
            pVar = new p(new y[]{yVar, pVar});
        }
        x xVar3 = pVar.a(arrayList2).get(0);
        if (d10) {
            xVar3 = xVar3.a();
        }
        aVar.a(1, "computePreviewStreamSize:", "result:", xVar3, "flip:", Boolean.valueOf(d10));
        return xVar3;
    }

    public final void c() {
        U.a(1, "destroy:", "state:", l());
        this.f6479c.f16681a.setUncaughtExceptionHandler(new e());
        n();
    }

    public final boolean d(int i8, int i10) {
        return h(i8, i10) % 180 != 0;
    }

    public final x e() {
        if (this.f6500y == null || this.f6484h == i.VIDEO) {
            return null;
        }
        return d(0, 2) ? this.f6500y.a() : this.f6500y;
    }

    public final x f() {
        if (this.f6501z == null) {
            return null;
        }
        return d(0, 1) ? this.f6501z.a() : this.f6501z;
    }

    public final x g() {
        if (this.f6478b == null) {
            return null;
        }
        if (d(1, 1)) {
            vb.a aVar = this.f6478b;
            return new x(aVar.f16356c, aVar.f16355b);
        }
        vb.a aVar2 = this.f6478b;
        return new x(aVar2.f16355b, aVar2.f16356c);
    }

    public final int h(int i8, int i10) {
        if (i8 == i10) {
            return 0;
        }
        if (i8 != 0) {
            return i10 == 0 ? ((-h(i10, i8)) + 360) % 360 : ((h(0, i10) - h(0, i8)) + 360) % 360;
        }
        tb.c cVar = tb.c.FRONT;
        return i10 == 1 ? this.f6480d == cVar ? (360 - ((this.C + this.S) % 360)) % 360 : ((this.C - this.S) + 360) % 360 : this.f6480d == cVar ? ((this.C - this.T) + 360) % 360 : (this.C + this.T) % 360;
    }

    public abstract void i();

    public abstract void j();

    public final void k() {
        U.a(1, "Restart:", "posting runnable");
        this.f6479c.b(new d());
    }

    public final String l() {
        int i8 = this.D;
        return i8 != -1 ? i8 != 0 ? i8 != 1 ? i8 != 2 ? "null" : "STATE_STARTED" : "STATE_STARTING" : "STATE_STOPPED" : "STATE_STOPPING";
    }

    public final void m() {
        U.a(1, "Start:", "posting runnable. State:", l());
        this.f6479c.b(new c((g) this));
    }

    public final void n() {
        wb.a aVar = U;
        try {
            aVar.a(1, "stopImmediately:", "State was:", l());
            if (this.D != 0) {
                this.D = -1;
                j();
                this.D = 0;
                aVar.a(1, "stopImmediately:", "Stopped. State is:", l());
            }
        } catch (Exception e10) {
            aVar.a(1, "stopImmediately:", "Swallowing exception while stopping.", e10);
            this.D = 0;
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z10 = th instanceof m;
        wb.a aVar = U;
        if (!z10) {
            aVar.a(3, "uncaughtException:", "Unexpected exception:", th);
            c();
            this.E.post(new a(th));
            return;
        }
        m mVar = (m) th;
        aVar.a(3, "uncaughtException:", "Interrupting thread with state:", l(), "due to CameraException:", mVar);
        thread.interrupt();
        q a10 = q.a("CameraViewController");
        this.f6479c = a10;
        a10.f16681a.setUncaughtExceptionHandler(this);
        aVar.a(1, "uncaughtException:", "Calling stopImmediately and notifying.");
        this.f6479c.b(new b(mVar));
    }
}
