package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i0;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q;
import androidx.lifecycle.s0;
import androidx.lifecycle.v;
import b3.l0;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import t1.a;
import u2.c;

public class p implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.p, p0, h, l3.b {

    /* renamed from: u0  reason: collision with root package name */
    public static final Object f2058u0 = new Object();
    public String B;
    public Bundle C;
    public p D;
    public String E;
    public int F;
    public Boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public i0 P;
    public c0<?> Q;
    public j0 R;
    public p S;
    public int T;
    public int U;
    public String V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public int f2059a;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2060a0;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f2061b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2062b0;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<Parcelable> f2063c;

    /* renamed from: c0  reason: collision with root package name */
    public ViewGroup f2064c0;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f2065d;

    /* renamed from: d0  reason: collision with root package name */
    public View f2066d0;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f2067e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2068e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f2069f0;

    /* renamed from: g0  reason: collision with root package name */
    public c f2070g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f2071h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f2072i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f2073j0;

    /* renamed from: k0  reason: collision with root package name */
    public j.b f2074k0;

    /* renamed from: l0  reason: collision with root package name */
    public q f2075l0;

    /* renamed from: m0  reason: collision with root package name */
    public y0 f2076m0;

    /* renamed from: n0  reason: collision with root package name */
    public final v<androidx.lifecycle.p> f2077n0;

    /* renamed from: o0  reason: collision with root package name */
    public f0 f2078o0;

    /* renamed from: p0  reason: collision with root package name */
    public l3.a f2079p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f2080q0;

    /* renamed from: r0  reason: collision with root package name */
    public final AtomicInteger f2081r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ArrayList<e> f2082s0;

    /* renamed from: t0  reason: collision with root package name */
    public final a f2083t0;

    public class a extends e {
        public a() {
        }

        public final void a() {
            p pVar = p.this;
            pVar.f2079p0.a();
            c0.b(pVar);
        }
    }

    public class b extends z {
        public b() {
        }

        public final View r(int i8) {
            p pVar = p.this;
            View view = pVar.f2066d0;
            if (view != null) {
                return view.findViewById(i8);
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " does not have a view"));
        }

        public final boolean z() {
            return p.this.f2066d0 != null;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2086a;

        /* renamed from: b  reason: collision with root package name */
        public int f2087b;

        /* renamed from: c  reason: collision with root package name */
        public int f2088c;

        /* renamed from: d  reason: collision with root package name */
        public int f2089d;

        /* renamed from: e  reason: collision with root package name */
        public int f2090e;

        /* renamed from: f  reason: collision with root package name */
        public int f2091f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f2092g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f2093h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f2094i;

        /* renamed from: j  reason: collision with root package name */
        public final Object f2095j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f2096k;

        /* renamed from: l  reason: collision with root package name */
        public float f2097l = 1.0f;
        public View m = null;

        public c() {
            Object obj = p.f2058u0;
            this.f2094i = obj;
            this.f2095j = obj;
            this.f2096k = obj;
        }
    }

    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class e {
        public abstract void a();
    }

    public p() {
        this.f2059a = -1;
        this.B = UUID.randomUUID().toString();
        this.E = null;
        this.G = null;
        this.R = new j0();
        this.f2060a0 = true;
        this.f2069f0 = true;
        this.f2074k0 = j.b.f2281e;
        this.f2077n0 = new v<>();
        this.f2081r0 = new AtomicInteger();
        this.f2082s0 = new ArrayList<>();
        this.f2083t0 = new a();
        A();
    }

    public final void A() {
        this.f2075l0 = new q(this);
        this.f2079p0 = new l3.a(this);
        this.f2078o0 = null;
        ArrayList<e> arrayList = this.f2082s0;
        a aVar = this.f2083t0;
        if (arrayList.contains(aVar)) {
            return;
        }
        if (this.f2059a >= 0) {
            aVar.a();
        } else {
            arrayList.add(aVar);
        }
    }

    public final void B() {
        A();
        this.f2073j0 = this.B;
        this.B = UUID.randomUUID().toString();
        this.H = false;
        this.I = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.O = 0;
        this.P = null;
        this.R = new j0();
        this.Q = null;
        this.T = 0;
        this.U = 0;
        this.V = null;
        this.W = false;
        this.X = false;
    }

    public final boolean C() {
        return this.Q != null && this.H;
    }

    public final boolean D() {
        if (!this.W) {
            i0 i0Var = this.P;
            if (i0Var == null) {
                return false;
            }
            p pVar = this.S;
            i0Var.getClass();
            return pVar == null ? false : pVar.D();
        }
    }

    public final boolean E() {
        return this.O > 0;
    }

    @Deprecated
    public void F(Bundle bundle) {
        this.f2062b0 = true;
    }

    @Deprecated
    public void G(int i8, int i10, Intent intent) {
        if (i0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i8 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    @Deprecated
    public void H(Activity activity) {
        this.f2062b0 = true;
    }

    public void I(Context context) {
        this.f2062b0 = true;
        c0<?> c0Var = this.Q;
        Activity activity = c0Var == null ? null : c0Var.f1914b;
        if (activity != null) {
            this.f2062b0 = false;
            H(activity);
        }
    }

    public void J(Bundle bundle) {
        Parcelable parcelable;
        this.f2062b0 = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.R.X(parcelable);
            j0 j0Var = this.R;
            j0Var.F = false;
            j0Var.G = false;
            j0Var.M.f2026i = false;
            j0Var.t(1);
        }
        j0 j0Var2 = this.R;
        if (!(j0Var2.f1984t >= 1)) {
            j0Var2.F = false;
            j0Var2.G = false;
            j0Var2.M.f2026i = false;
            j0Var2.t(1);
        }
    }

    @Deprecated
    public void K(Menu menu, MenuInflater menuInflater) {
    }

    public View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8 = this.f2080q0;
        if (i8 != 0) {
            return layoutInflater.inflate(i8, viewGroup, false);
        }
        return null;
    }

    public void M() {
        this.f2062b0 = true;
    }

    public void N() {
        this.f2062b0 = true;
    }

    public void O() {
        this.f2062b0 = true;
    }

    public LayoutInflater P(Bundle bundle) {
        c0<?> c0Var = this.Q;
        if (c0Var != null) {
            LayoutInflater H2 = c0Var.H();
            H2.setFactory2(this.R.f1971f);
            return H2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void Q(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f2062b0 = true;
        c0<?> c0Var = this.Q;
        if ((c0Var == null ? null : c0Var.f1914b) != null) {
            this.f2062b0 = true;
        }
    }

    @Deprecated
    public boolean R(MenuItem menuItem) {
        return false;
    }

    public void S() {
        this.f2062b0 = true;
    }

    @Deprecated
    public void T(Menu menu) {
    }

    public void U(boolean z10) {
    }

    public void V() {
        this.f2062b0 = true;
    }

    public void W(Bundle bundle) {
    }

    public void X() {
        this.f2062b0 = true;
    }

    public void Y() {
        this.f2062b0 = true;
    }

    public void Z(View view) {
    }

    public void a0(Bundle bundle) {
        this.f2062b0 = true;
    }

    public final j b() {
        return this.f2075l0;
    }

    public void b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.R.Q();
        boolean z10 = true;
        this.N = true;
        this.f2076m0 = new y0(this, s());
        View L2 = L(layoutInflater, viewGroup, bundle);
        this.f2066d0 = L2;
        if (L2 != null) {
            this.f2076m0.c();
            s0.c(this.f2066d0, this.f2076m0);
            View view = this.f2066d0;
            y0 y0Var = this.f2076m0;
            sf.j.f(view, "<this>");
            view.setTag(R.id.view_tree_view_model_store_owner, y0Var);
            l0.d(this.f2066d0, this.f2076m0);
            this.f2077n0.k(this.f2076m0);
            return;
        }
        if (this.f2076m0.f2172d == null) {
            z10 = false;
        }
        if (!z10) {
            this.f2076m0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final androidx.activity.result.c c0(androidx.activity.result.b bVar, c.a aVar) {
        r rVar = new r(this);
        if (this.f2059a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            s sVar = new s(this, rVar, atomicReference, aVar, bVar);
            if (this.f2059a >= 0) {
                sVar.a();
            } else {
                this.f2082s0.add(sVar);
            }
            return new o(atomicReference);
        }
        throw new IllegalStateException(q.b("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public final x d0() {
        x o10 = o();
        if (o10 != null) {
            return o10;
        }
        throw new IllegalStateException(q.b("Fragment ", this, " not attached to an activity."));
    }

    public final Context e0() {
        Context q10 = q();
        if (q10 != null) {
            return q10;
        }
        throw new IllegalStateException(q.b("Fragment ", this, " not attached to a context."));
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final View f0() {
        View view = this.f2066d0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(q.b("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void g0(int i8, int i10, int i11, int i12) {
        if (this.f2070g0 != null || i8 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
            n().f2087b = i8;
            n().f2088c = i10;
            n().f2089d = i11;
            n().f2090e = i12;
        }
    }

    public final void h0(Bundle bundle) {
        i0 i0Var = this.P;
        if (i0Var != null) {
            if (i0Var == null ? false : i0Var.O()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.C = bundle;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Deprecated
    public final void i0(boolean z10) {
        if (this.Z != z10) {
            this.Z = z10;
            if (C() && !D()) {
                this.Q.J();
            }
        }
    }

    public z j() {
        return new b();
    }

    public final void j0(boolean z10) {
        if (this.f2060a0 != z10) {
            this.f2060a0 = z10;
            if (this.Z && C() && !D()) {
                this.Q.J();
            }
        }
    }

    public m0.b k() {
        Application application;
        if (this.P != null) {
            if (this.f2078o0 == null) {
                Context applicationContext = e0().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && i0.J(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + e0().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f2078o0 = new f0(application, this, this.C);
            }
            return this.f2078o0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Deprecated
    public final void k0(boolean z10) {
        c.b bVar = u2.c.f15701a;
        u2.e eVar = new u2.e(this, z10);
        u2.c.c(eVar);
        c.b a10 = u2.c.a(this);
        if (a10.f15708a.contains(c.a.f15706e) && u2.c.e(a10, getClass(), u2.e.class)) {
            u2.c.b(a10, eVar);
        }
        boolean z11 = true;
        if (!this.f2069f0 && z10 && this.f2059a < 5 && this.P != null && C() && this.f2072i0) {
            i0 i0Var = this.P;
            o0 f10 = i0Var.f(this);
            p pVar = f10.f2054c;
            if (pVar.f2068e0) {
                if (i0Var.f1967b) {
                    i0Var.I = true;
                } else {
                    pVar.f2068e0 = false;
                    f10.k();
                }
            }
        }
        this.f2069f0 = z10;
        if (this.f2059a >= 5 || z10) {
            z11 = false;
        }
        this.f2068e0 = z11;
        if (this.f2061b != null) {
            this.f2067e = Boolean.valueOf(z10);
        }
    }

    public final x2.a l() {
        Application application;
        Context applicationContext = e0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && i0.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + e0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        x2.c cVar = new x2.c(0);
        LinkedHashMap linkedHashMap = cVar.f16911a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.l0.f2292a, application);
        }
        linkedHashMap.put(c0.f2254a, this);
        linkedHashMap.put(c0.f2255b, this);
        Bundle bundle = this.C;
        if (bundle != null) {
            linkedHashMap.put(c0.f2256c, bundle);
        }
        return cVar;
    }

    public final boolean l0(String str) {
        c0<?> c0Var = this.Q;
        if (c0Var != null) {
            return c0Var.I(str);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0137, code lost:
        r1 = r2.E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.T
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.U
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.V
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.f2059a
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.B
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.O
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.H
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.I
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.K
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.L
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.W
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.X
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.f2060a0
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            boolean r0 = r2.Z
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.Y
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.f2069f0
            r5.println(r0)
            androidx.fragment.app.i0 r0 = r2.P
            if (r0 == 0) goto L_0x00c8
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            androidx.fragment.app.i0 r0 = r2.P
            r5.println(r0)
        L_0x00c8:
            androidx.fragment.app.c0<?> r0 = r2.Q
            if (r0 == 0) goto L_0x00d9
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            androidx.fragment.app.c0<?> r0 = r2.Q
            r5.println(r0)
        L_0x00d9:
            androidx.fragment.app.p r0 = r2.S
            if (r0 == 0) goto L_0x00ea
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            androidx.fragment.app.p r0 = r2.S
            r5.println(r0)
        L_0x00ea:
            android.os.Bundle r0 = r2.C
            if (r0 == 0) goto L_0x00fb
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.C
            r5.println(r0)
        L_0x00fb:
            android.os.Bundle r0 = r2.f2061b
            if (r0 == 0) goto L_0x010c
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f2061b
            r5.println(r0)
        L_0x010c:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f2063c
            if (r0 == 0) goto L_0x011d
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f2063c
            r5.println(r0)
        L_0x011d:
            android.os.Bundle r0 = r2.f2065d
            if (r0 == 0) goto L_0x012e
            r5.print(r3)
            java.lang.String r0 = "mSavedViewRegistryState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f2065d
            r5.println(r0)
        L_0x012e:
            androidx.fragment.app.p r0 = r2.D
            if (r0 == 0) goto L_0x0133
            goto L_0x0141
        L_0x0133:
            androidx.fragment.app.i0 r0 = r2.P
            if (r0 == 0) goto L_0x0140
            java.lang.String r1 = r2.E
            if (r1 == 0) goto L_0x0140
            androidx.fragment.app.p r0 = r0.A(r1)
            goto L_0x0141
        L_0x0140:
            r0 = 0
        L_0x0141:
            if (r0 == 0) goto L_0x0158
            r5.print(r3)
            java.lang.String r1 = "mTarget="
            r5.print(r1)
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.F
            r5.println(r0)
        L_0x0158:
            r5.print(r3)
            java.lang.String r0 = "mPopDirection="
            r5.print(r0)
            androidx.fragment.app.p$c r0 = r2.f2070g0
            r1 = 0
            if (r0 != 0) goto L_0x0167
            r0 = r1
            goto L_0x0169
        L_0x0167:
            boolean r0 = r0.f2086a
        L_0x0169:
            r5.println(r0)
            androidx.fragment.app.p$c r0 = r2.f2070g0
            if (r0 != 0) goto L_0x0172
            r0 = r1
            goto L_0x0174
        L_0x0172:
            int r0 = r0.f2087b
        L_0x0174:
            if (r0 == 0) goto L_0x0189
            r5.print(r3)
            java.lang.String r0 = "getEnterAnim="
            r5.print(r0)
            androidx.fragment.app.p$c r0 = r2.f2070g0
            if (r0 != 0) goto L_0x0184
            r0 = r1
            goto L_0x0186
        L_0x0184:
            int r0 = r0.f2087b
        L_0x0186:
            r5.println(r0)
        L_0x0189:
            androidx.fragment.app.p$c r0 = r2.f2070g0
            if (r0 != 0) goto L_0x018f
            r0 = r1
            goto L_0x0191
        L_0x018f:
            int r0 = r0.f2088c
        L_0x0191:
            if (r0 == 0) goto L_0x01a6
            r5.print(r3)
            java.lang.String r0 = "getExitAnim="
            r5.print(r0)
            androidx.fragment.app.p$c r0 = r2.f2070g0
            if (r0 != 0) goto L_0x01a1
            r0 = r1
            goto L_0x01a3
        L_0x01a1:
            int r0 = r0.f2088c
        L_0x01a3:
            r5.println(r0)
        L_0x01a6:
            androidx.fragment.app.p$c r0 = r2.f2070g0
            if (r0 != 0) goto L_0x01ac
            r0 = r1
            goto L_0x01ae
        L_0x01ac:
            int r0 = r0.f2089d
        L_0x01ae:
            if (r0 == 0) goto L_0x01c3
            r5.print(r3)
            java.lang.String r0 = "getPopEnterAnim="
            r5.print(r0)
            androidx.fragment.app.p$c r0 = r2.f2070g0
            if (r0 != 0) goto L_0x01be
            r0 = r1
            goto L_0x01c0
        L_0x01be:
            int r0 = r0.f2089d
        L_0x01c0:
            r5.println(r0)
        L_0x01c3:
            androidx.fragment.app.p$c r0 = r2.f2070g0
            if (r0 != 0) goto L_0x01c9
            r0 = r1
            goto L_0x01cb
        L_0x01c9:
            int r0 = r0.f2090e
        L_0x01cb:
            if (r0 == 0) goto L_0x01df
            r5.print(r3)
            java.lang.String r0 = "getPopExitAnim="
            r5.print(r0)
            androidx.fragment.app.p$c r0 = r2.f2070g0
            if (r0 != 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            int r1 = r0.f2090e
        L_0x01dc:
            r5.println(r1)
        L_0x01df:
            android.view.ViewGroup r0 = r2.f2064c0
            if (r0 == 0) goto L_0x01f0
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.f2064c0
            r5.println(r0)
        L_0x01f0:
            android.view.View r0 = r2.f2066d0
            if (r0 == 0) goto L_0x0201
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.f2066d0
            r5.println(r0)
        L_0x0201:
            android.content.Context r0 = r2.q()
            if (r0 == 0) goto L_0x020e
            y2.b r0 = y2.a.a(r2)
            r0.b(r3, r5)
        L_0x020e:
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Child "
            r0.<init>(r1)
            androidx.fragment.app.j0 r1 = r2.R
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            androidx.fragment.app.j0 r0 = r2.R
            java.lang.String r1 = "  "
            java.lang.String r3 = h4.a.c(r3, r1)
            r0.u(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p.m(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void m0(@SuppressLint({"UnknownNullness"}) Intent intent) {
        c0<?> c0Var = this.Q;
        if (c0Var != null) {
            Object obj = t1.a.f15323a;
            a.C0282a.b(c0Var.f1915c, intent, (Bundle) null);
            return;
        }
        throw new IllegalStateException(q.b("Fragment ", this, " not attached to Activity"));
    }

    public final c n() {
        if (this.f2070g0 == null) {
            this.f2070g0 = new c();
        }
        return this.f2070g0;
    }

    public final x o() {
        c0<?> c0Var = this.Q;
        if (c0Var == null) {
            return null;
        }
        return (x) c0Var.f1914b;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f2062b0 = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        d0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void onLowMemory() {
        this.f2062b0 = true;
    }

    public final i0 p() {
        if (this.Q != null) {
            return this.R;
        }
        throw new IllegalStateException(q.b("Fragment ", this, " has not been attached yet."));
    }

    public Context q() {
        c0<?> c0Var = this.Q;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f1915c;
    }

    public final Object r() {
        c0<?> c0Var = this.Q;
        if (c0Var == null) {
            return null;
        }
        return c0Var.G();
    }

    public final o0 s() {
        if (this.P == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (t() != 1) {
            HashMap<String, o0> hashMap = this.P.M.f2023f;
            o0 o0Var = hashMap.get(this.B);
            if (o0Var != null) {
                return o0Var;
            }
            o0 o0Var2 = new o0();
            hashMap.put(this.B, o0Var2);
            return o0Var2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i8) {
        if (this.Q != null) {
            i0 u7 = u();
            if (u7.A != null) {
                u7.D.addLast(new i0.l(i8, this.B));
                u7.A.a(intent);
                return;
            }
            c0<?> c0Var = u7.f1985u;
            c0Var.getClass();
            if (i8 == -1) {
                Object obj = t1.a.f15323a;
                a.C0282a.b(c0Var.f1915c, intent, (Bundle) null);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(q.b("Fragment ", this, " not attached to Activity"));
    }

    public final int t() {
        j.b bVar = this.f2074k0;
        return (bVar == j.b.f2278b || this.S == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.S.t());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.B);
        if (this.T != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.T));
        }
        if (this.V != null) {
            sb2.append(" tag=");
            sb2.append(this.V);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final i0 u() {
        i0 i0Var = this.P;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException(q.b("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources v() {
        return e0().getResources();
    }

    public final androidx.savedstate.a w() {
        return this.f2079p0.f10968b;
    }

    public final String x(int i8) {
        return v().getString(i8);
    }

    public final String y(int i8, Object... objArr) {
        return v().getString(i8, objArr);
    }

    public final y0 z() {
        y0 y0Var = this.f2076m0;
        if (y0Var != null) {
            return y0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f2098a;

        public class a implements Parcelable.ClassLoaderCreator<f> {
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new f[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }
        }

        public f(Bundle bundle) {
            this.f2098a = bundle;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeBundle(this.f2098a);
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2098a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    public p(int i8) {
        this();
        this.f2080q0 = i8;
    }
}
