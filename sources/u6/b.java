package u6;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import t6.f;

public abstract class b<T extends IInterface> {

    /* renamed from: x  reason: collision with root package name */
    public static final t6.d[] f15742x = new t6.d[0];

    /* renamed from: a  reason: collision with root package name */
    public volatile String f15743a = null;

    /* renamed from: b  reason: collision with root package name */
    public j1 f15744b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f15745c;

    /* renamed from: d  reason: collision with root package name */
    public final h f15746d;

    /* renamed from: e  reason: collision with root package name */
    public final f f15747e;

    /* renamed from: f  reason: collision with root package name */
    public final u0 f15748f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f15749g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Object f15750h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public l f15751i;

    /* renamed from: j  reason: collision with root package name */
    public c f15752j;

    /* renamed from: k  reason: collision with root package name */
    public IInterface f15753k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f15754l = new ArrayList();
    public x0 m;

    /* renamed from: n  reason: collision with root package name */
    public int f15755n = 1;

    /* renamed from: o  reason: collision with root package name */
    public final a f15756o;

    /* renamed from: p  reason: collision with root package name */
    public final C0293b f15757p;

    /* renamed from: q  reason: collision with root package name */
    public final int f15758q;

    /* renamed from: r  reason: collision with root package name */
    public final String f15759r;

    /* renamed from: s  reason: collision with root package name */
    public volatile String f15760s;

    /* renamed from: t  reason: collision with root package name */
    public t6.b f15761t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15762u = false;

    /* renamed from: v  reason: collision with root package name */
    public volatile a1 f15763v = null;

    /* renamed from: w  reason: collision with root package name */
    public final AtomicInteger f15764w = new AtomicInteger(0);

    public interface a {
        void b(int i8);

        void c();
    }

    /* renamed from: u6.b$b  reason: collision with other inner class name */
    public interface C0293b {
        void a(t6.b bVar);
    }

    public interface c {
        void a(t6.b bVar);
    }

    public class d implements c {
        public d() {
        }

        public final void a(t6.b bVar) {
            boolean z10 = bVar.f15379b == 0;
            b bVar2 = b.this;
            if (z10) {
                bVar2.n((j) null, bVar2.w());
                return;
            }
            C0293b bVar3 = bVar2.f15757p;
            if (bVar3 != null) {
                bVar3.a(bVar);
            }
        }
    }

    public b(Context context, Looper looper, h1 h1Var, f fVar, int i8, a aVar, C0293b bVar, String str) {
        if (context != null) {
            this.f15745c = context;
            if (looper == null) {
                throw new NullPointerException("Looper must not be null");
            } else if (h1Var != null) {
                this.f15746d = h1Var;
                q.j(fVar, "API availability must not be null");
                this.f15747e = fVar;
                this.f15748f = new u0(this, looper);
                this.f15758q = i8;
                this.f15756o = aVar;
                this.f15757p = bVar;
                this.f15759r = str;
            } else {
                throw new NullPointerException("Supervisor must not be null");
            }
        } else {
            throw new NullPointerException("Context must not be null");
        }
    }

    public static /* bridge */ /* synthetic */ boolean D(b bVar, int i8, int i10, IInterface iInterface) {
        synchronized (bVar.f15749g) {
            if (bVar.f15755n != i8) {
                return false;
            }
            bVar.E(i10, iInterface);
            return true;
        }
    }

    public boolean A() {
        return j() >= 211700000;
    }

    public void B() {
        System.currentTimeMillis();
    }

    public boolean C() {
        return this instanceof f7.a;
    }

    public final void E(int i8, IInterface iInterface) {
        j1 j1Var;
        boolean z10 = false;
        if ((i8 == 4) == (iInterface != null)) {
            z10 = true;
        }
        q.a(z10);
        synchronized (this.f15749g) {
            try {
                this.f15755n = i8;
                this.f15753k = iInterface;
                if (i8 == 1) {
                    x0 x0Var = this.m;
                    if (x0Var != null) {
                        h hVar = this.f15746d;
                        String str = this.f15744b.f15833a;
                        q.i(str);
                        this.f15744b.getClass();
                        if (this.f15759r == null) {
                            this.f15745c.getClass();
                        }
                        hVar.b(str, "com.google.android.gms", x0Var, this.f15744b.f15834b);
                        this.m = null;
                    }
                } else if (i8 == 2 || i8 == 3) {
                    x0 x0Var2 = this.m;
                    if (!(x0Var2 == null || (j1Var = this.f15744b) == null)) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + j1Var.f15833a + " on com.google.android.gms");
                        h hVar2 = this.f15746d;
                        String str2 = this.f15744b.f15833a;
                        q.i(str2);
                        this.f15744b.getClass();
                        if (this.f15759r == null) {
                            this.f15745c.getClass();
                        }
                        hVar2.b(str2, "com.google.android.gms", x0Var2, this.f15744b.f15834b);
                        this.f15764w.incrementAndGet();
                    }
                    x0 x0Var3 = new x0(this, this.f15764w.get());
                    this.m = x0Var3;
                    String z11 = z();
                    boolean A = A();
                    this.f15744b = new j1(z11, A);
                    if (A) {
                        if (j() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f15744b.f15833a)));
                        }
                    }
                    h hVar3 = this.f15746d;
                    String str3 = this.f15744b.f15833a;
                    q.i(str3);
                    this.f15744b.getClass();
                    String str4 = this.f15759r;
                    if (str4 == null) {
                        str4 = this.f15745c.getClass().getName();
                    }
                    boolean z12 = this.f15744b.f15834b;
                    u();
                    if (!hVar3.c(new e1(str3, "com.google.android.gms", z12), x0Var3, str4, (Executor) null)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f15744b.f15833a + " on com.google.android.gms");
                        int i10 = this.f15764w.get();
                        z0 z0Var = new z0(this, 16);
                        u0 u0Var = this.f15748f;
                        u0Var.sendMessage(u0Var.obtainMessage(7, i10, -1, z0Var));
                    }
                } else if (i8 == 4) {
                    q.i(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str) {
        this.f15743a = str;
        g();
    }

    public final void d(a0 a0Var) {
        a0Var.f4211a.f4228n.m.post(new z(a0Var));
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f15749g) {
            int i8 = this.f15755n;
            z10 = true;
            if (i8 != 2) {
                if (i8 != 3) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public final String f() {
        if (h() && this.f15744b != null) {
            return "com.google.android.gms";
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public final void g() {
        this.f15764w.incrementAndGet();
        synchronized (this.f15754l) {
            try {
                int size = this.f15754l.size();
                for (int i8 = 0; i8 < size; i8++) {
                    v0 v0Var = (v0) this.f15754l.get(i8);
                    synchronized (v0Var) {
                        v0Var.f15868a = null;
                    }
                }
                this.f15754l.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.f15750h) {
            this.f15751i = null;
        }
        E(1, (IInterface) null);
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f15749g) {
            z10 = this.f15755n == 4;
        }
        return z10;
    }

    public final boolean i() {
        return true;
    }

    public int j() {
        return f.f15395a;
    }

    public final t6.d[] k() {
        a1 a1Var = this.f15763v;
        if (a1Var == null) {
            return null;
        }
        return a1Var.f15739b;
    }

    public final String l() {
        return this.f15743a;
    }

    public boolean m() {
        return false;
    }

    public final void n(j jVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle v3 = v();
        int i8 = this.f15758q;
        String str = this.f15760s;
        int i10 = f.f15395a;
        Scope[] scopeArr = f.K;
        Bundle bundle = new Bundle();
        t6.d[] dVarArr = f.L;
        f fVar = r3;
        f fVar2 = new f(6, i8, i10, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, dVarArr, dVarArr, true, 0, false, str);
        f fVar3 = fVar;
        fVar3.f15796d = this.f15745c.getPackageName();
        fVar3.C = v3;
        if (set2 != null) {
            fVar3.B = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (m()) {
            Account s10 = s();
            if (s10 == null) {
                s10 = new Account("<<default account>>", "com.google");
            }
            fVar3.D = s10;
            if (jVar != null) {
                fVar3.f15797e = jVar.asBinder();
            }
        }
        fVar3.E = f15742x;
        fVar3.F = t();
        if (C()) {
            fVar3.I = true;
        }
        try {
            synchronized (this.f15750h) {
                l lVar = this.f15751i;
                if (lVar != null) {
                    lVar.p(new w0(this, this.f15764w.get()), fVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            u0 u0Var = this.f15748f;
            u0Var.sendMessage(u0Var.obtainMessage(6, this.f15764w.get(), 3));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            int i11 = this.f15764w.get();
            y0 y0Var = new y0(this, 8, (IBinder) null, (Bundle) null);
            u0 u0Var2 = this.f15748f;
            u0Var2.sendMessage(u0Var2.obtainMessage(1, i11, -1, y0Var));
        }
    }

    public final void p(c cVar) {
        this.f15752j = cVar;
        E(2, (IInterface) null);
    }

    public final void q() {
        int c3 = this.f15747e.c(this.f15745c, j());
        if (c3 != 0) {
            E(1, (IInterface) null);
            this.f15752j = new d();
            int i8 = this.f15764w.get();
            u0 u0Var = this.f15748f;
            u0Var.sendMessage(u0Var.obtainMessage(3, i8, c3, (Object) null));
            return;
        }
        p(new d());
    }

    public abstract T r(IBinder iBinder);

    public Account s() {
        return null;
    }

    public t6.d[] t() {
        return f15742x;
    }

    public void u() {
    }

    public Bundle v() {
        return new Bundle();
    }

    public Set<Scope> w() {
        return Collections.emptySet();
    }

    public final T x() {
        T t2;
        synchronized (this.f15749g) {
            try {
                if (this.f15755n == 5) {
                    throw new DeadObjectException();
                } else if (h()) {
                    t2 = this.f15753k;
                    q.j(t2, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t2;
    }

    public abstract String y();

    public abstract String z();
}
