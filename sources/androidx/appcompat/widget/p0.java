package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import d2.d1;
import d2.i0;
import h2.j;
import h2.k;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class p0 implements i.f {
    public static final Method W;
    public static final Method X;
    public int B;
    public int C;
    public final int D = 1002;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H = 0;
    public final int I = Integer.MAX_VALUE;
    public d J;
    public View K;
    public AdapterView.OnItemClickListener L;
    public AdapterView.OnItemSelectedListener M;
    public final g N = new g();
    public final f O = new f();
    public final e P = new e();
    public final c Q = new c();
    public final Handler R;
    public final Rect S = new Rect();
    public Rect T;
    public boolean U;
    public final q V;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1102a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f1103b;

    /* renamed from: c  reason: collision with root package name */
    public k0 f1104c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1105d = -2;

    /* renamed from: e  reason: collision with root package name */
    public int f1106e = -2;

    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i8, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i8, z10);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            k0 k0Var = p0.this.f1104c;
            if (k0Var != null) {
                k0Var.setListSelectionHidden(true);
                k0Var.requestLayout();
            }
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        public final void onChanged() {
            p0 p0Var = p0.this;
            if (p0Var.a()) {
                p0Var.b();
            }
        }

        public final void onInvalidated() {
            p0.this.dismiss();
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        public final void onScroll(AbsListView absListView, int i8, int i10, int i11) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i8) {
            boolean z10 = true;
            if (i8 == 1) {
                p0 p0Var = p0.this;
                if (p0Var.V.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (!z10 && p0Var.V.getContentView() != null) {
                    Handler handler = p0Var.R;
                    g gVar = p0Var.N;
                    handler.removeCallbacks(gVar);
                    gVar.run();
                }
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            q qVar;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            p0 p0Var = p0.this;
            if (action == 0 && (qVar = p0Var.V) != null && qVar.isShowing() && x10 >= 0) {
                q qVar2 = p0Var.V;
                if (x10 < qVar2.getWidth() && y10 >= 0 && y10 < qVar2.getHeight()) {
                    p0Var.R.postDelayed(p0Var.N, 250);
                    return false;
                }
            }
            if (action != 1) {
                return false;
            }
            p0Var.R.removeCallbacks(p0Var.N);
            return false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public final void run() {
            p0 p0Var = p0.this;
            k0 k0Var = p0Var.f1104c;
            if (k0Var != null) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                if (i0.g.b(k0Var) && p0Var.f1104c.getCount() > p0Var.f1104c.getChildCount() && p0Var.f1104c.getChildCount() <= p0Var.I) {
                    p0Var.V.setInputMethodMode(2);
                    p0Var.b();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                W = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                X = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public p0(Context context, AttributeSet attributeSet, int i8, int i10) {
        this.f1102a = context;
        this.R = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cb.e.L, i8, i10);
        this.B = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.C = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.E = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i8, i10);
        this.V = qVar;
        qVar.setInputMethodMode(1);
    }

    public final boolean a() {
        return this.V.isShowing();
    }

    public final void b() {
        int i8;
        int i10;
        k0 k0Var;
        k0 k0Var2 = this.f1104c;
        q qVar = this.V;
        Context context = this.f1102a;
        if (k0Var2 == null) {
            k0 q10 = q(context, !this.U);
            this.f1104c = q10;
            q10.setAdapter(this.f1103b);
            this.f1104c.setOnItemClickListener(this.L);
            this.f1104c.setFocusable(true);
            this.f1104c.setFocusableInTouchMode(true);
            this.f1104c.setOnItemSelectedListener(new o0(this));
            this.f1104c.setOnScrollListener(this.P);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.M;
            if (onItemSelectedListener != null) {
                this.f1104c.setOnItemSelectedListener(onItemSelectedListener);
            }
            qVar.setContentView(this.f1104c);
        } else {
            ViewGroup viewGroup = (ViewGroup) qVar.getContentView();
        }
        Drawable background = qVar.getBackground();
        int i11 = 0;
        Rect rect = this.S;
        if (background != null) {
            background.getPadding(rect);
            int i12 = rect.top;
            i8 = rect.bottom + i12;
            if (!this.E) {
                this.C = -i12;
            }
        } else {
            rect.setEmpty();
            i8 = 0;
        }
        int a10 = a.a(qVar, this.K, this.C, qVar.getInputMethodMode() == 2);
        int i13 = this.f1105d;
        if (i13 == -1) {
            i10 = a10 + i8;
        } else {
            int i14 = this.f1106e;
            int a11 = this.f1104c.a(i14 != -2 ? i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a10 + 0);
            i10 = a11 + (a11 > 0 ? this.f1104c.getPaddingBottom() + this.f1104c.getPaddingTop() + i8 + 0 : 0);
        }
        boolean z10 = qVar.getInputMethodMode() == 2;
        k.d(qVar, this.D);
        if (qVar.isShowing()) {
            View view = this.K;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.g.b(view)) {
                int i15 = this.f1106e;
                if (i15 == -1) {
                    i15 = -1;
                } else if (i15 == -2) {
                    i15 = this.K.getWidth();
                }
                if (i13 == -1) {
                    i13 = z10 ? i10 : -1;
                    if (z10) {
                        qVar.setWidth(this.f1106e == -1 ? -1 : 0);
                        qVar.setHeight(0);
                    } else {
                        if (this.f1106e == -1) {
                            i11 = -1;
                        }
                        qVar.setWidth(i11);
                        qVar.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = i10;
                }
                qVar.setOutsideTouchable(true);
                View view2 = this.K;
                int i16 = this.B;
                int i17 = this.C;
                if (i15 < 0) {
                    i15 = -1;
                }
                qVar.update(view2, i16, i17, i15, i13 < 0 ? -1 : i13);
                return;
            }
            return;
        }
        int i18 = this.f1106e;
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = this.K.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = i10;
        }
        qVar.setWidth(i18);
        qVar.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = W;
            if (method != null) {
                try {
                    method.invoke(qVar, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(qVar, true);
        }
        qVar.setOutsideTouchable(true);
        qVar.setTouchInterceptor(this.O);
        if (this.G) {
            k.c(qVar, this.F);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = X;
            if (method2 != null) {
                try {
                    method2.invoke(qVar, new Object[]{this.T});
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(qVar, this.T);
        }
        j.a(qVar, this.K, this.B, this.C, this.H);
        this.f1104c.setSelection(-1);
        if ((!this.U || this.f1104c.isInTouchMode()) && (k0Var = this.f1104c) != null) {
            k0Var.setListSelectionHidden(true);
            k0Var.requestLayout();
        }
        if (!this.U) {
            this.R.post(this.Q);
        }
    }

    public final int c() {
        return this.B;
    }

    public final void dismiss() {
        q qVar = this.V;
        qVar.dismiss();
        qVar.setContentView((View) null);
        this.f1104c = null;
        this.R.removeCallbacks(this.N);
    }

    public final void e(int i8) {
        this.B = i8;
    }

    public final Drawable h() {
        return this.V.getBackground();
    }

    public final k0 j() {
        return this.f1104c;
    }

    public final void k(Drawable drawable) {
        this.V.setBackgroundDrawable(drawable);
    }

    public final void l(int i8) {
        this.C = i8;
        this.E = true;
    }

    public final int o() {
        if (!this.E) {
            return 0;
        }
        return this.C;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.J;
        if (dVar == null) {
            this.J = new d();
        } else {
            ListAdapter listAdapter2 = this.f1103b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f1103b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.J);
        }
        k0 k0Var = this.f1104c;
        if (k0Var != null) {
            k0Var.setAdapter(this.f1103b);
        }
    }

    public k0 q(Context context, boolean z10) {
        return new k0(context, z10);
    }

    public final void r(int i8) {
        Drawable background = this.V.getBackground();
        if (background != null) {
            Rect rect = this.S;
            background.getPadding(rect);
            this.f1106e = rect.left + rect.right + i8;
            return;
        }
        this.f1106e = i8;
    }
}
