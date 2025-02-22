package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.s0;
import androidx.appcompat.widget.t0;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class b extends i.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final boolean B;
    public final Handler C;
    public final ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final a F = new a();
    public final C0011b G = new C0011b();
    public final c H = new c();
    public int I;
    public int J;
    public View K;
    public View L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public j.a T;
    public ViewTreeObserver U;
    public PopupWindow.OnDismissListener V;
    public boolean W;

    /* renamed from: b  reason: collision with root package name */
    public final Context f695b;

    /* renamed from: c  reason: collision with root package name */
    public final int f696c;

    /* renamed from: d  reason: collision with root package name */
    public final int f697d;

    /* renamed from: e  reason: collision with root package name */
    public final int f698e;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.a()) {
                ArrayList arrayList = bVar.E;
                if (arrayList.size() > 0 && !((d) arrayList.get(0)).f702a.U) {
                    View view = bVar.L;
                    if (view == null || !view.isShown()) {
                        bVar.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f702a.b();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    public class C0011b implements View.OnAttachStateChangeListener {
        public C0011b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.U;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.U = view.getViewTreeObserver();
                }
                bVar.U.removeGlobalOnLayoutListener(bVar.F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements s0 {
        public c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(androidx.appcompat.view.menu.f r8, androidx.appcompat.view.menu.h r9) {
            /*
                r7 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                android.os.Handler r1 = r0.C
                r2 = 0
                r1.removeCallbacksAndMessages(r2)
                java.util.ArrayList r1 = r0.E
                int r3 = r1.size()
                r4 = 0
            L_0x000f:
                r5 = -1
                if (r4 >= r3) goto L_0x0020
                java.lang.Object r6 = r1.get(r4)
                androidx.appcompat.view.menu.b$d r6 = (androidx.appcompat.view.menu.b.d) r6
                androidx.appcompat.view.menu.f r6 = r6.f703b
                if (r8 != r6) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r4 = r4 + 1
                goto L_0x000f
            L_0x0020:
                r4 = r5
            L_0x0021:
                if (r4 != r5) goto L_0x0024
                return
            L_0x0024:
                int r4 = r4 + 1
                int r3 = r1.size()
                if (r4 >= r3) goto L_0x0033
                java.lang.Object r1 = r1.get(r4)
                r2 = r1
                androidx.appcompat.view.menu.b$d r2 = (androidx.appcompat.view.menu.b.d) r2
            L_0x0033:
                androidx.appcompat.view.menu.c r1 = new androidx.appcompat.view.menu.c
                r1.<init>(r7, r2, r9, r8)
                long r2 = android.os.SystemClock.uptimeMillis()
                r4 = 200(0xc8, double:9.9E-322)
                long r2 = r2 + r4
                android.os.Handler r9 = r0.C
                r9.postAtTime(r1, r8, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.c.d(androidx.appcompat.view.menu.f, androidx.appcompat.view.menu.h):void");
        }

        public final void g(f fVar, MenuItem menuItem) {
            b.this.C.removeCallbacksAndMessages(fVar);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final t0 f702a;

        /* renamed from: b  reason: collision with root package name */
        public final f f703b;

        /* renamed from: c  reason: collision with root package name */
        public final int f704c;

        public d(t0 t0Var, f fVar, int i8) {
            this.f702a = t0Var;
            this.f703b = fVar;
            this.f704c = i8;
        }
    }

    public b(Context context, View view, int i8, int i10, boolean z10) {
        int i11 = 0;
        this.I = 0;
        this.J = 0;
        this.f695b = context;
        this.K = view;
        this.f697d = i8;
        this.f698e = i10;
        this.B = z10;
        this.R = false;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        this.M = i0.e.d(view) != 1 ? 1 : i11;
        Resources resources = context.getResources();
        this.f696c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.C = new Handler();
    }

    public final boolean a() {
        ArrayList arrayList = this.E;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f702a.a();
    }

    public final void b() {
        if (!a()) {
            ArrayList arrayList = this.D;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x((f) it.next());
            }
            arrayList.clear();
            View view = this.K;
            this.L = view;
            if (view != null) {
                boolean z10 = this.U == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.U = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.F);
                }
                this.L.addOnAttachStateChangeListener(this.G);
            }
        }
    }

    public final void c(f fVar, boolean z10) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i8)).f703b) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            int i10 = i8 + 1;
            if (i10 < arrayList.size()) {
                ((d) arrayList.get(i10)).f703b.c(false);
            }
            d dVar = (d) arrayList.remove(i8);
            dVar.f703b.r(this);
            boolean z11 = this.W;
            t0 t0Var = dVar.f702a;
            if (z11) {
                t0.a.b(t0Var.V, (Transition) null);
                t0Var.V.setAnimationStyle(0);
            }
            t0Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.M = ((d) arrayList.get(size2 - 1)).f704c;
            } else {
                View view = this.K;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                this.M = i0.e.d(view) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                j.a aVar = this.T;
                if (aVar != null) {
                    aVar.c(fVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.U;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.U.removeGlobalOnLayoutListener(this.F);
                    }
                    this.U = null;
                }
                this.L.removeOnAttachStateChangeListener(this.G);
                this.V.onDismiss();
            } else if (z10) {
                ((d) arrayList.get(0)).f703b.c(false);
            }
        }
    }

    public final void d(boolean z10) {
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f702a.f1104c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    public final void dismiss() {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    d dVar = dVarArr[size];
                    if (dVar.f702a.a()) {
                        dVar.f702a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f(j.a aVar) {
        this.T = aVar;
    }

    public final void i(Parcelable parcelable) {
    }

    public final k0 j() {
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f702a.f1104c;
    }

    public final boolean k(m mVar) {
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f703b) {
                dVar.f702a.f1104c.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        n(mVar);
        j.a aVar = this.T;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    public final Parcelable l() {
        return null;
    }

    public final void n(f fVar) {
        fVar.b(this, this.f695b);
        if (a()) {
            x(fVar);
        } else {
            this.D.add(fVar);
        }
    }

    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i8);
            if (!dVar.f702a.a()) {
                break;
            }
            i8++;
        }
        if (dVar != null) {
            dVar.f703b.c(false);
        }
    }

    public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i8 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(View view) {
        if (this.K != view) {
            this.K = view;
            int i8 = this.I;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            this.J = Gravity.getAbsoluteGravity(i8, i0.e.d(view));
        }
    }

    public final void q(boolean z10) {
        this.R = z10;
    }

    public final void r(int i8) {
        if (this.I != i8) {
            this.I = i8;
            View view = this.K;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            this.J = Gravity.getAbsoluteGravity(i8, i0.e.d(view));
        }
    }

    public final void s(int i8) {
        this.N = true;
        this.P = i8;
    }

    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.V = onDismissListener;
    }

    public final void u(boolean z10) {
        this.S = z10;
    }

    public final void v(int i8) {
        this.O = true;
        this.Q = i8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(androidx.appcompat.view.menu.f r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r2 = r0.f695b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.e r4 = new androidx.appcompat.view.menu.e
            boolean r5 = r0.B
            r6 = 2131492875(0x7f0c000b, float:1.8609214E38)
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r18.a()
            r6 = 1
            if (r5 != 0) goto L_0x0022
            boolean r5 = r0.R
            if (r5 == 0) goto L_0x0022
            r4.f718c = r6
            goto L_0x002e
        L_0x0022:
            boolean r5 = r18.a()
            if (r5 == 0) goto L_0x002e
            boolean r5 = i.d.w(r19)
            r4.f718c = r5
        L_0x002e:
            int r5 = r0.f696c
            int r5 = i.d.o(r4, r2, r5)
            androidx.appcompat.widget.t0 r7 = new androidx.appcompat.widget.t0
            int r8 = r0.f697d
            int r9 = r0.f698e
            r7.<init>(r2, r8, r9)
            androidx.appcompat.view.menu.b$c r2 = r0.H
            r7.Y = r2
            r7.L = r0
            androidx.appcompat.widget.q r2 = r7.V
            r2.setOnDismissListener(r0)
            android.view.View r8 = r0.K
            r7.K = r8
            int r8 = r0.J
            r7.H = r8
            r7.U = r6
            r2.setFocusable(r6)
            r8 = 2
            r2.setInputMethodMode(r8)
            r7.p(r4)
            r7.r(r5)
            int r4 = r0.J
            r7.H = r4
            java.util.ArrayList r4 = r0.E
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x00e0
            int r9 = r4.size()
            int r9 = r9 - r6
            java.lang.Object r9 = r4.get(r9)
            androidx.appcompat.view.menu.b$d r9 = (androidx.appcompat.view.menu.b.d) r9
            androidx.appcompat.view.menu.f r12 = r9.f703b
            int r13 = r12.size()
            r14 = 0
        L_0x007d:
            if (r14 >= r13) goto L_0x0094
            android.view.MenuItem r15 = r12.getItem(r14)
            boolean r16 = r15.hasSubMenu()
            if (r16 == 0) goto L_0x0090
            android.view.SubMenu r8 = r15.getSubMenu()
            if (r1 != r8) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            int r14 = r14 + 1
            r8 = 2
            goto L_0x007d
        L_0x0094:
            r15 = 0
        L_0x0095:
            if (r15 != 0) goto L_0x0099
        L_0x0097:
            r6 = 0
            goto L_0x00e2
        L_0x0099:
            androidx.appcompat.widget.t0 r8 = r9.f702a
            androidx.appcompat.widget.k0 r8 = r8.f1104c
            android.widget.ListAdapter r12 = r8.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00b2
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            androidx.appcompat.view.menu.e r12 = (androidx.appcompat.view.menu.e) r12
            goto L_0x00b5
        L_0x00b2:
            androidx.appcompat.view.menu.e r12 = (androidx.appcompat.view.menu.e) r12
            r13 = 0
        L_0x00b5:
            int r14 = r12.getCount()
            r10 = 0
        L_0x00ba:
            r11 = -1
            if (r10 >= r14) goto L_0x00c8
            androidx.appcompat.view.menu.h r6 = r12.getItem(r10)
            if (r15 != r6) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            int r10 = r10 + 1
            r6 = 1
            goto L_0x00ba
        L_0x00c8:
            r10 = r11
        L_0x00c9:
            if (r10 != r11) goto L_0x00cc
            goto L_0x0097
        L_0x00cc:
            int r10 = r10 + r13
            int r6 = r8.getFirstVisiblePosition()
            int r10 = r10 - r6
            if (r10 < 0) goto L_0x0097
            int r6 = r8.getChildCount()
            if (r10 < r6) goto L_0x00db
            goto L_0x0097
        L_0x00db:
            android.view.View r6 = r8.getChildAt(r10)
            goto L_0x00e2
        L_0x00e0:
            r6 = 0
            r9 = 0
        L_0x00e2:
            if (r6 == 0) goto L_0x017b
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r8 > r10) goto L_0x0102
            java.lang.reflect.Method r8 = androidx.appcompat.widget.t0.Z
            if (r8 == 0) goto L_0x0106
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00fa }
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00fa }
            r12 = 0
            r11[r12] = r10     // Catch:{ Exception -> 0x00fa }
            r8.invoke(r2, r11)     // Catch:{ Exception -> 0x00fa }
            goto L_0x0106
        L_0x00fa:
            java.lang.String r8 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r8, r10)
            goto L_0x0106
        L_0x0102:
            r8 = 0
            androidx.appcompat.widget.t0.b.a(r2, r8)
        L_0x0106:
            r8 = 0
            androidx.appcompat.widget.t0.a.a(r2, r8)
            int r2 = r4.size()
            r8 = 1
            int r2 = r2 - r8
            java.lang.Object r2 = r4.get(r2)
            androidx.appcompat.view.menu.b$d r2 = (androidx.appcompat.view.menu.b.d) r2
            androidx.appcompat.widget.t0 r2 = r2.f702a
            androidx.appcompat.widget.k0 r2 = r2.f1104c
            r8 = 2
            int[] r8 = new int[r8]
            r2.getLocationOnScreen(r8)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r11 = r0.L
            r11.getWindowVisibleDisplayFrame(r10)
            int r11 = r0.M
            r12 = 1
            if (r11 != r12) goto L_0x0140
            r17 = 0
            r8 = r8[r17]
            int r2 = r2.getWidth()
            int r2 = r2 + r8
            int r2 = r2 + r5
            int r8 = r10.right
            if (r2 <= r8) goto L_0x0147
            r2 = r17
            goto L_0x0148
        L_0x0140:
            r17 = 0
            r2 = r8[r17]
            int r2 = r2 - r5
            if (r2 >= 0) goto L_0x014a
        L_0x0147:
            r2 = 1
        L_0x0148:
            r8 = 1
            goto L_0x014c
        L_0x014a:
            r2 = 0
            goto L_0x0148
        L_0x014c:
            if (r2 != r8) goto L_0x0150
            r8 = 1
            goto L_0x0151
        L_0x0150:
            r8 = 0
        L_0x0151:
            r0.M = r2
            r7.K = r6
            int r2 = r0.J
            r10 = 5
            r2 = r2 & r10
            if (r2 != r10) goto L_0x0165
            if (r8 == 0) goto L_0x015f
            r2 = 0
            goto L_0x016c
        L_0x015f:
            r2 = 0
            int r5 = r6.getWidth()
            goto L_0x016e
        L_0x0165:
            r2 = 0
            if (r8 == 0) goto L_0x016e
            int r5 = r6.getWidth()
        L_0x016c:
            int r5 = r5 + r2
            goto L_0x0170
        L_0x016e:
            int r5 = 0 - r5
        L_0x0170:
            r7.B = r5
            r5 = 1
            r7.G = r5
            r7.F = r5
            r7.l(r2)
            goto L_0x0199
        L_0x017b:
            boolean r2 = r0.N
            if (r2 == 0) goto L_0x0183
            int r2 = r0.P
            r7.B = r2
        L_0x0183:
            boolean r2 = r0.O
            if (r2 == 0) goto L_0x018c
            int r2 = r0.Q
            r7.l(r2)
        L_0x018c:
            android.graphics.Rect r2 = r0.f9356a
            if (r2 == 0) goto L_0x0196
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r2)
            goto L_0x0197
        L_0x0196:
            r8 = 0
        L_0x0197:
            r7.T = r8
        L_0x0199:
            androidx.appcompat.view.menu.b$d r2 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.M
            r2.<init>(r7, r1, r5)
            r4.add(r2)
            r7.b()
            androidx.appcompat.widget.k0 r2 = r7.f1104c
            r2.setOnKeyListener(r0)
            if (r9 != 0) goto L_0x01d7
            boolean r4 = r0.S
            if (r4 == 0) goto L_0x01d7
            java.lang.CharSequence r4 = r1.m
            if (r4 == 0) goto L_0x01d7
            r4 = 2131492882(0x7f0c0012, float:1.8609228E38)
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r2, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r5)
            java.lang.CharSequence r1 = r1.m
            r4.setText(r1)
            r1 = 0
            r2.addHeaderView(r3, r1, r5)
            r7.b()
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.x(androidx.appcompat.view.menu.f):void");
    }
}
