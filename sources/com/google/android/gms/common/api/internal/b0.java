package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import h7.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import r7.f;
import s6.m;
import s6.w;
import t6.b;
import u6.d;
import u6.e0;
import u6.o;
import u6.q;

public final class b0 implements d.a, d.b {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f4217a = new LinkedList();
    @NotOnlyInitialized

    /* renamed from: b  reason: collision with root package name */
    public final a.e f4218b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4219c;

    /* renamed from: e  reason: collision with root package name */
    public final s f4220e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f4221f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f4222g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final int f4223h;

    /* renamed from: i  reason: collision with root package name */
    public final r0 f4224i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4225j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4226k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public b f4227l = null;
    public int m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ e f4228n;

    public b0(e eVar, c cVar) {
        this.f4228n = eVar;
        Looper looper = eVar.m.getLooper();
        d.a a10 = cVar.a();
        u6.d dVar = new u6.d(a10.f15777a, a10.f15778b, a10.f15779c, a10.f15780d);
        a.C0067a aVar = cVar.f4185c.f4180a;
        q.i(aVar);
        a.e a11 = aVar.a(cVar.f4183a, looper, dVar, cVar.f4186d, this, this);
        String str = cVar.f4184b;
        if (str != null && (a11 instanceof u6.b)) {
            ((u6.b) a11).f15760s = str;
        }
        if (str != null && (a11 instanceof j)) {
            ((j) a11).getClass();
        }
        this.f4218b = a11;
        this.f4219c = cVar.f4187e;
        this.f4220e = new s();
        this.f4223h = cVar.f4189g;
        if (a11.m()) {
            Context context = eVar.f4244e;
            i iVar = eVar.m;
            d.a a12 = cVar.a();
            this.f4224i = new r0(context, iVar, new u6.d(a12.f15777a, a12.f15778b, a12.f15779c, a12.f15780d));
            return;
        }
        this.f4224i = null;
    }

    public final void a(b bVar) {
        q(bVar, (RuntimeException) null);
    }

    public final void b(int i8) {
        Looper myLooper = Looper.myLooper();
        e eVar = this.f4228n;
        if (myLooper == eVar.m.getLooper()) {
            j(i8);
        } else {
            eVar.m.post(new y(this, i8));
        }
    }

    public final void c() {
        Looper myLooper = Looper.myLooper();
        e eVar = this.f4228n;
        if (myLooper == eVar.m.getLooper()) {
            i();
        } else {
            eVar.m.post(new w(this, 1));
        }
    }

    public final t6.d d(t6.d[] dVarArr) {
        if (!(dVarArr == null || dVarArr.length == 0)) {
            t6.d[] k10 = this.f4218b.k();
            if (k10 == null) {
                k10 = new t6.d[0];
            }
            o.a aVar = new o.a(r3);
            for (t6.d dVar : k10) {
                aVar.put(dVar.f15389a, Long.valueOf(dVar.w()));
            }
            for (t6.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.getOrDefault(dVar2.f15389a, null);
                if (l10 == null || l10.longValue() < dVar2.w()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void e(b bVar) {
        HashSet hashSet = this.f4221f;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if (o.a(bVar, b.f15377e)) {
                this.f4218b.f();
            }
            a1Var.getClass();
            throw null;
        }
        hashSet.clear();
    }

    public final void f(Status status) {
        q.d(this.f4228n.m);
        g(status, (RuntimeException) null, false);
    }

    public final void g(Status status, RuntimeException runtimeException, boolean z10) {
        q.d(this.f4228n.m);
        boolean z11 = false;
        boolean z12 = status == null;
        if (runtimeException == null) {
            z11 = true;
        }
        if (z12 != z11) {
            Iterator it = this.f4217a.iterator();
            while (it.hasNext()) {
                z0 z0Var = (z0) it.next();
                if (!z10 || z0Var.f4345a == 2) {
                    if (status != null) {
                        z0Var.a(status);
                    } else {
                        z0Var.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void h() {
        LinkedList linkedList = this.f4217a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            z0 z0Var = (z0) arrayList.get(i8);
            if (this.f4218b.h()) {
                if (l(z0Var)) {
                    linkedList.remove(z0Var);
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final void i() {
        a.e eVar = this.f4218b;
        e eVar2 = this.f4228n;
        q.d(eVar2.m);
        this.f4227l = null;
        e(b.f15377e);
        if (this.f4225j) {
            i iVar = eVar2.m;
            a aVar = this.f4219c;
            iVar.removeMessages(11, aVar);
            eVar2.m.removeMessages(9, aVar);
            this.f4225j = false;
        }
        Iterator it = this.f4222g.values().iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (d(m0Var.f4307a.f4298b) != null) {
                it.remove();
            } else {
                try {
                    l lVar = m0Var.f4307a;
                    ((o0) lVar).f4311d.f4303a.c(eVar, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    b(3);
                    eVar.b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        h();
        k();
    }

    public final void j(int i8) {
        e eVar = this.f4228n;
        q.d(eVar.m);
        this.f4227l = null;
        this.f4225j = true;
        String l10 = this.f4218b.l();
        s sVar = this.f4220e;
        sVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i8 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i8 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (l10 != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(l10);
        }
        sVar.a(true, new Status(20, sb2.toString()));
        i iVar = eVar.m;
        a aVar = this.f4219c;
        iVar.sendMessageDelayed(Message.obtain(iVar, 9, aVar), 5000);
        i iVar2 = eVar.m;
        iVar2.sendMessageDelayed(Message.obtain(iVar2, 11, aVar), 120000);
        eVar.f4246g.f15787a.clear();
        for (m0 m0Var : this.f4222g.values()) {
            m0Var.f4309c.run();
        }
    }

    public final void k() {
        e eVar = this.f4228n;
        i iVar = eVar.m;
        a aVar = this.f4219c;
        iVar.removeMessages(12, aVar);
        i iVar2 = eVar.m;
        iVar2.sendMessageDelayed(iVar2.obtainMessage(12, aVar), eVar.f4240a);
    }

    public final boolean l(z0 z0Var) {
        if (!(z0Var instanceof h0)) {
            a.e eVar = this.f4218b;
            z0Var.d(this.f4220e, eVar.m());
            try {
                z0Var.c(this);
            } catch (DeadObjectException unused) {
                b(1);
                eVar.b("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        h0 h0Var = (h0) z0Var;
        t6.d d10 = d(h0Var.g(this));
        if (d10 == null) {
            a.e eVar2 = this.f4218b;
            z0Var.d(this.f4220e, eVar2.m());
            try {
                z0Var.c(this);
            } catch (DeadObjectException unused2) {
                b(1);
                eVar2.b("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.f4218b.getClass().getName();
        String str = d10.f15389a;
        long w10 = d10.w();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + str + ", " + w10 + ").");
        if (!this.f4228n.f4252n || !h0Var.f(this)) {
            h0Var.b(new j(d10));
            return true;
        }
        c0 c0Var = new c0(this.f4219c, d10);
        int indexOf = this.f4226k.indexOf(c0Var);
        if (indexOf >= 0) {
            c0 c0Var2 = (c0) this.f4226k.get(indexOf);
            this.f4228n.m.removeMessages(15, c0Var2);
            i iVar = this.f4228n.m;
            Message obtain = Message.obtain(iVar, 15, c0Var2);
            this.f4228n.getClass();
            iVar.sendMessageDelayed(obtain, 5000);
            return false;
        }
        this.f4226k.add(c0Var);
        i iVar2 = this.f4228n.m;
        Message obtain2 = Message.obtain(iVar2, 15, c0Var);
        this.f4228n.getClass();
        iVar2.sendMessageDelayed(obtain2, 5000);
        i iVar3 = this.f4228n.m;
        Message obtain3 = Message.obtain(iVar3, 16, c0Var);
        this.f4228n.getClass();
        iVar3.sendMessageDelayed(obtain3, 120000);
        b bVar = new b(2, (PendingIntent) null);
        if (m(bVar)) {
            return false;
        }
        this.f4228n.b(bVar, this.f4223h);
        return false;
    }

    public final boolean m(b bVar) {
        synchronized (e.f4238q) {
            this.f4228n.getClass();
        }
        return false;
    }

    public final boolean n(boolean z10) {
        q.d(this.f4228n.m);
        a.e eVar = this.f4218b;
        if (!eVar.h() || this.f4222g.size() != 0) {
            return false;
        }
        s sVar = this.f4220e;
        if (!sVar.f4330a.isEmpty() || !sVar.f4331b.isEmpty()) {
            if (z10) {
                k();
            }
            return false;
        }
        eVar.b("Timing out service connection.");
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [com.google.android.gms.common.api.a$e, r7.f] */
    public final void o() {
        e eVar = this.f4228n;
        q.d(eVar.m);
        a.e eVar2 = this.f4218b;
        if (!eVar2.h() && !eVar2.e()) {
            try {
                e0 e0Var = eVar.f4246g;
                Context context = eVar.f4244e;
                e0Var.getClass();
                q.i(context);
                int i8 = 0;
                if (eVar2.i()) {
                    int j10 = eVar2.j();
                    SparseIntArray sparseIntArray = e0Var.f15787a;
                    int i10 = sparseIntArray.get(j10, -1);
                    if (i10 != -1) {
                        i8 = i10;
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= sparseIntArray.size()) {
                                i8 = -1;
                                break;
                            }
                            int keyAt = sparseIntArray.keyAt(i11);
                            if (keyAt > j10 && sparseIntArray.get(keyAt) == 0) {
                                break;
                            }
                            i11++;
                        }
                        if (i8 == -1) {
                            i8 = e0Var.f15788b.c(context, j10);
                        }
                        sparseIntArray.put(j10, i8);
                    }
                }
                if (i8 != 0) {
                    b bVar = new b(i8, (PendingIntent) null);
                    Log.w("GoogleApiManager", "The service for " + eVar2.getClass().getName() + " is not available: " + bVar.toString());
                    q(bVar, (RuntimeException) null);
                    return;
                }
                e0 e0Var2 = new e0(eVar, eVar2, this.f4219c);
                if (eVar2.m()) {
                    r0 r0Var = this.f4224i;
                    q.i(r0Var);
                    f fVar = r0Var.f4328h;
                    if (fVar != null) {
                        fVar.g();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(r0Var));
                    u6.d dVar = r0Var.f4327g;
                    dVar.f15776h = valueOf;
                    r7.b bVar2 = r0Var.f4325e;
                    Context context2 = r0Var.f4323b;
                    Handler handler = r0Var.f4324c;
                    r0Var.f4328h = bVar2.a(context2, handler.getLooper(), dVar, dVar.f15775g, r0Var, r0Var);
                    r0Var.f4329i = e0Var2;
                    Set set = r0Var.f4326f;
                    if (set == null || set.isEmpty()) {
                        handler.post(new m(r0Var, 1));
                    } else {
                        r0Var.f4328h.o();
                    }
                }
                try {
                    eVar2.p(e0Var2);
                } catch (SecurityException e10) {
                    q(new b(10), e10);
                }
            } catch (IllegalStateException e11) {
                q(new b(10), e11);
            }
        }
    }

    public final void p(z0 z0Var) {
        q.d(this.f4228n.m);
        boolean h3 = this.f4218b.h();
        LinkedList linkedList = this.f4217a;
        if (!h3) {
            linkedList.add(z0Var);
            b bVar = this.f4227l;
            if (bVar != null) {
                if ((bVar.f15379b == 0 || bVar.f15380c == null) ? false : true) {
                    q(bVar, (RuntimeException) null);
                    return;
                }
            }
            o();
        } else if (l(z0Var)) {
            k();
        } else {
            linkedList.add(z0Var);
        }
    }

    public final void q(b bVar, RuntimeException runtimeException) {
        f fVar;
        q.d(this.f4228n.m);
        r0 r0Var = this.f4224i;
        if (!(r0Var == null || (fVar = r0Var.f4328h) == null)) {
            fVar.g();
        }
        q.d(this.f4228n.m);
        this.f4227l = null;
        this.f4228n.f4246g.f15787a.clear();
        e(bVar);
        if ((this.f4218b instanceof w6.d) && bVar.f15379b != 24) {
            e eVar = this.f4228n;
            eVar.f4241b = true;
            i iVar = eVar.m;
            iVar.sendMessageDelayed(iVar.obtainMessage(19), 300000);
        }
        if (bVar.f15379b == 4) {
            f(e.f4237p);
        } else if (this.f4217a.isEmpty()) {
            this.f4227l = bVar;
        } else if (runtimeException != null) {
            q.d(this.f4228n.m);
            g((Status) null, runtimeException, false);
        } else if (this.f4228n.f4252n) {
            g(e.c(this.f4219c, bVar), (RuntimeException) null, true);
            if (!this.f4217a.isEmpty() && !m(bVar) && !this.f4228n.b(bVar, this.f4223h)) {
                if (bVar.f15379b == 18) {
                    this.f4225j = true;
                }
                if (this.f4225j) {
                    i iVar2 = this.f4228n.m;
                    Message obtain = Message.obtain(iVar2, 9, this.f4219c);
                    this.f4228n.getClass();
                    iVar2.sendMessageDelayed(obtain, 5000);
                    return;
                }
                f(e.c(this.f4219c, bVar));
            }
        } else {
            f(e.c(this.f4219c, bVar));
        }
    }

    public final void r() {
        q.d(this.f4228n.m);
        Status status = e.f4236o;
        f(status);
        s sVar = this.f4220e;
        sVar.getClass();
        sVar.a(false, status);
        for (i.a y0Var : (i.a[]) this.f4222g.keySet().toArray(new i.a[0])) {
            p(new y0(y0Var, new TaskCompletionSource()));
        }
        e(new b(4));
        a.e eVar = this.f4218b;
        if (eVar.h()) {
            eVar.d(new a0(this));
        }
    }
}
