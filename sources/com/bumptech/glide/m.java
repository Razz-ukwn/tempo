package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import c5.c;
import e5.b;
import e5.d;
import e5.e;
import e5.h;
import e5.i;
import e5.j;
import e5.n;
import e5.r;
import h5.f;
import h5.g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l5.l;

public final class m implements ComponentCallbacks2, i {
    public static final g G;
    public final r B = new r();
    public final a C;
    public final e5.b D;
    public final CopyOnWriteArrayList<f<Object>> E;
    public g F;

    /* renamed from: a  reason: collision with root package name */
    public final b f4127a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4128b;

    /* renamed from: c  reason: collision with root package name */
    public final h f4129c;

    /* renamed from: d  reason: collision with root package name */
    public final n f4130d;

    /* renamed from: e  reason: collision with root package name */
    public final e5.m f4131e;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            m mVar = m.this;
            mVar.f4129c.a(mVar);
        }
    }

    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final n f4133a;

        public b(n nVar) {
            this.f4133a = nVar;
        }

        public final void a(boolean z10) {
            if (z10) {
                synchronized (m.this) {
                    this.f4133a.b();
                }
            }
        }
    }

    static {
        g gVar = (g) new g().f(Bitmap.class);
        gVar.P = true;
        G = gVar;
        ((g) new g().f(c.class)).P = true;
        g gVar2 = (g) ((g) ((g) new g().g(r4.m.f13931b)).m()).r();
    }

    public m(b bVar, h hVar, e5.m mVar, Context context) {
        g gVar;
        n nVar = new n();
        e5.c cVar = bVar.C;
        a aVar = new a();
        this.C = aVar;
        this.f4127a = bVar;
        this.f4129c = hVar;
        this.f4131e = mVar;
        this.f4130d = nVar;
        this.f4128b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(nVar);
        ((e) cVar).getClass();
        boolean z10 = false;
        boolean z11 = t1.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z11 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        e5.b dVar = z11 ? new d(applicationContext, bVar2) : new j();
        this.D = dVar;
        char[] cArr = l.f11007a;
        if (!(Looper.myLooper() == Looper.getMainLooper() ? true : z10)) {
            l.e().post(aVar);
        } else {
            hVar.a(this);
        }
        hVar.a(dVar);
        this.E = new CopyOnWriteArrayList<>(bVar.f4056c.f4064e);
        h hVar2 = bVar.f4056c;
        synchronized (hVar2) {
            if (hVar2.f4069j == null) {
                ((c) hVar2.f4063d).getClass();
                g gVar2 = new g();
                gVar2.P = true;
                hVar2.f4069j = gVar2;
            }
            gVar = hVar2.f4069j;
        }
        synchronized (this) {
            g gVar3 = (g) gVar.clone();
            if (gVar3.P) {
                if (!gVar3.R) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
            }
            gVar3.R = true;
            gVar3.P = true;
            this.F = gVar3;
        }
        synchronized (bVar.D) {
            if (!bVar.D.contains(this)) {
                bVar.D.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final synchronized void a() {
        n();
        this.B.a();
    }

    public final synchronized void e() {
        this.B.e();
        Iterator it = l.d(this.B.f7845a).iterator();
        while (it.hasNext()) {
            l((i5.g) it.next());
        }
        this.B.f7845a.clear();
        n nVar = this.f4130d;
        Iterator it2 = l.d(nVar.f7823a).iterator();
        while (it2.hasNext()) {
            nVar.a((h5.d) it2.next());
        }
        nVar.f7824b.clear();
        this.f4129c.b(this);
        this.f4129c.b(this.D);
        l.e().removeCallbacks(this.C);
        this.f4127a.d(this);
    }

    public final synchronized void h() {
        m();
        this.B.h();
    }

    public final void l(i5.g<?> gVar) {
        boolean z10;
        if (gVar != null) {
            boolean o10 = o(gVar);
            h5.d b10 = gVar.b();
            if (!o10) {
                b bVar = this.f4127a;
                synchronized (bVar.D) {
                    Iterator it = bVar.D.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((m) it.next()).o(gVar)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (!z10 && b10 != null) {
                    gVar.i((h5.d) null);
                    b10.clear();
                }
            }
        }
    }

    public final synchronized void m() {
        n nVar = this.f4130d;
        nVar.f7825c = true;
        Iterator it = l.d(nVar.f7823a).iterator();
        while (it.hasNext()) {
            h5.d dVar = (h5.d) it.next();
            if (dVar.isRunning()) {
                dVar.pause();
                nVar.f7824b.add(dVar);
            }
        }
    }

    public final synchronized void n() {
        n nVar = this.f4130d;
        nVar.f7825c = false;
        Iterator it = l.d(nVar.f7823a).iterator();
        while (it.hasNext()) {
            h5.d dVar = (h5.d) it.next();
            if (!dVar.i() && !dVar.isRunning()) {
                dVar.h();
            }
        }
        nVar.f7824b.clear();
    }

    public final synchronized boolean o(i5.g<?> gVar) {
        h5.d b10 = gVar.b();
        if (b10 == null) {
            return true;
        }
        if (!this.f4130d.a(b10)) {
            return false;
        }
        this.B.f7845a.remove(gVar);
        gVar.i((h5.d) null);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i8) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f4130d + ", treeNode=" + this.f4131e + "}";
    }
}
