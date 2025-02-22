package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.p;
import androidx.activity.result.g;
import androidx.activity.result.h;
import androidx.fragment.app.i0;
import androidx.lifecycle.j;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l3.b;
import s1.a;
import s1.y;
import t1.c;
import t1.d;

public class x extends ComponentActivity implements a.e {
    public final a0 P = new a0(new a());
    public final q Q = new q(this);
    public boolean R;
    public boolean S;
    public boolean T = true;

    public class a extends c0<x> implements c, d, s1.x, y, p0, p, h, b, m0, d2.q {
        public a() {
            super(x.this);
        }

        public final void B(v vVar) {
            x.this.B(vVar);
        }

        public final void C(i0.c cVar) {
            x.this.C(cVar);
        }

        public final void E(u uVar) {
            x.this.E(uVar);
        }

        public final void F(PrintWriter printWriter, String[] strArr) {
            x.this.dump("  ", (FileDescriptor) null, printWriter, strArr);
        }

        public final x G() {
            return x.this;
        }

        public final LayoutInflater H() {
            x xVar = x.this;
            return xVar.getLayoutInflater().cloneInContext(xVar);
        }

        public final boolean I(String str) {
            int i8 = s1.a.f14472c;
            if (!y1.a.a() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
            int i10 = Build.VERSION.SDK_INT;
            x xVar = x.this;
            return i10 >= 32 ? a.d.a(xVar, str) : i10 == 31 ? a.c.b(xVar, str) : a.b.c(xVar, str);
        }

        public final void J() {
            x.this.invalidateOptionsMenu();
        }

        public final void a(i0 i0Var, p pVar) {
            x.this.getClass();
        }

        public final j b() {
            return x.this.Q;
        }

        public final OnBackPressedDispatcher d() {
            return x.this.D;
        }

        public final void i(c2.a<Configuration> aVar) {
            x.this.i(aVar);
        }

        public final void n(g0 g0Var) {
            x.this.n(g0Var);
        }

        public final void o(f0 f0Var) {
            x.this.o(f0Var);
        }

        public final void p(v vVar) {
            x.this.p(vVar);
        }

        public final g q() {
            return x.this.H;
        }

        public final View r(int i8) {
            return x.this.findViewById(i8);
        }

        public final o0 s() {
            return x.this.s();
        }

        public final void u(g0 g0Var) {
            x.this.u(g0Var);
        }

        public final void v(u uVar) {
            x.this.v(uVar);
        }

        public final androidx.savedstate.a w() {
            return x.this.f551e.f10968b;
        }

        public final void x(i0.c cVar) {
            x.this.x(cVar);
        }

        public final boolean z() {
            Window window = x.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public x() {
        this.f551e.f10968b.c("android:support:lifecycle", new t(this, 0));
        i(new u(this, 0));
        this.K.add(new v(this, 0));
        G(new w(this));
    }

    public static boolean J(i0 i0Var) {
        j.b bVar = j.b.f2279c;
        boolean z10 = false;
        for (p pVar : i0Var.f1968c.h()) {
            if (pVar != null) {
                if (pVar.r() != null) {
                    z10 |= J(pVar.p());
                }
                y0 y0Var = pVar.f2076m0;
                j.b bVar2 = j.b.f2280d;
                if (y0Var != null) {
                    y0Var.c();
                    if (y0Var.f2172d.f2304d.compareTo(bVar2) >= 0) {
                        pVar.f2076m0.f2172d.h(bVar);
                        z10 = true;
                    }
                }
                if (pVar.f2075l0.f2304d.compareTo(bVar2) >= 0) {
                    pVar.f2075l0.h(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Deprecated
    public final void A() {
    }

    public final j0 I() {
        return this.P.f1901a.f1917e;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            r5 = this;
            super.dump(r6, r7, r8, r9)
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L_0x0065
            int r2 = r9.length
            if (r2 <= 0) goto L_0x0065
            r2 = r9[r0]
            r2.getClass()
            int r3 = r2.hashCode()
            r4 = -1
            switch(r3) {
                case -645125871: goto L_0x0044;
                case 100470631: goto L_0x0039;
                case 472614934: goto L_0x002e;
                case 1159329357: goto L_0x0023;
                case 1455016274: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x004e
        L_0x0018:
            java.lang.String r3 = "--autofill"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0021
            goto L_0x004e
        L_0x0021:
            r4 = 4
            goto L_0x004e
        L_0x0023:
            java.lang.String r3 = "--contentcapture"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x002c
            goto L_0x004e
        L_0x002c:
            r4 = 3
            goto L_0x004e
        L_0x002e:
            java.lang.String r3 = "--list-dumpables"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0037
            goto L_0x004e
        L_0x0037:
            r4 = 2
            goto L_0x004e
        L_0x0039:
            java.lang.String r3 = "--dump-dumpable"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0042
            goto L_0x004e
        L_0x0042:
            r4 = r1
            goto L_0x004e
        L_0x0044:
            java.lang.String r3 = "--translation"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r4 = r0
        L_0x004e:
            switch(r4) {
                case 0: goto L_0x005e;
                case 1: goto L_0x0059;
                case 2: goto L_0x0059;
                case 3: goto L_0x0052;
                case 4: goto L_0x0064;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0065
        L_0x0052:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L_0x0065
            goto L_0x0064
        L_0x0059:
            boolean r0 = y1.a.a()
            goto L_0x0065
        L_0x005e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L_0x0065
        L_0x0064:
            r0 = r1
        L_0x0065:
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0069
            return
        L_0x0069:
            r8.print(r6)
            java.lang.String r0 = "Local FragmentActivity "
            r8.print(r0)
            int r0 = java.lang.System.identityHashCode(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " State:"
            r8.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.print(r0)
            java.lang.String r1 = "mCreated="
            r8.print(r1)
            boolean r1 = r5.R
            r8.print(r1)
            java.lang.String r1 = " mResumed="
            r8.print(r1)
            boolean r1 = r5.S
            r8.print(r1)
            java.lang.String r1 = " mStopped="
            r8.print(r1)
            boolean r1 = r5.T
            r8.print(r1)
            android.app.Application r1 = r5.getApplication()
            if (r1 == 0) goto L_0x00c0
            y2.b r1 = y2.a.a(r5)
            r1.b(r0, r8)
        L_0x00c0:
            androidx.fragment.app.a0 r0 = r5.P
            androidx.fragment.app.c0<?> r0 = r0.f1901a
            androidx.fragment.app.j0 r0 = r0.f1917e
            r0.u(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public void onActivityResult(int i8, int i10, Intent intent) {
        this.P.a();
        super.onActivityResult(i8, i10, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Q.f(j.a.ON_CREATE);
        j0 j0Var = this.P.f1901a.f1917e;
        j0Var.F = false;
        j0Var.G = false;
        j0Var.M.f2026i = false;
        j0Var.t(1);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.P.f1901a.f1917e.f1971f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.P.f1901a.f1917e.k();
        this.Q.f(j.a.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        if (i8 == 6) {
            return this.P.f1901a.f1917e.i();
        }
        return false;
    }

    public final void onPause() {
        super.onPause();
        this.S = false;
        this.P.f1901a.f1917e.t(5);
        this.Q.f(j.a.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        this.Q.f(j.a.ON_RESUME);
        j0 j0Var = this.P.f1901a.f1917e;
        j0Var.F = false;
        j0Var.G = false;
        j0Var.M.f2026i = false;
        j0Var.t(7);
    }

    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        this.P.a();
        super.onRequestPermissionsResult(i8, strArr, iArr);
    }

    public void onResume() {
        a0 a0Var = this.P;
        a0Var.a();
        super.onResume();
        this.S = true;
        a0Var.f1901a.f1917e.x(true);
    }

    public void onStart() {
        a0 a0Var = this.P;
        a0Var.a();
        super.onStart();
        this.T = false;
        boolean z10 = this.R;
        c0<?> c0Var = a0Var.f1901a;
        if (!z10) {
            this.R = true;
            j0 j0Var = c0Var.f1917e;
            j0Var.F = false;
            j0Var.G = false;
            j0Var.M.f2026i = false;
            j0Var.t(4);
        }
        c0Var.f1917e.x(true);
        this.Q.f(j.a.ON_START);
        j0 j0Var2 = c0Var.f1917e;
        j0Var2.F = false;
        j0Var2.G = false;
        j0Var2.M.f2026i = false;
        j0Var2.t(5);
    }

    public final void onStateNotSaved() {
        this.P.a();
    }

    public void onStop() {
        super.onStop();
        this.T = true;
        do {
        } while (J(I()));
        j0 j0Var = this.P.f1901a.f1917e;
        j0Var.G = true;
        j0Var.M.f2026i = true;
        j0Var.t(4);
        this.Q.f(j.a.ON_STOP);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.P.f1901a.f1917e.f1971f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
