package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import cb.d;
import ff.m;
import java.lang.ref.WeakReference;
import rf.p;
import s0.b1;
import sf.j;
import sf.k;
import t.e0;
import t.f0;
import t.g0;
import t.h;
import t.z1;
import z.b;

public abstract class a extends ViewGroup {
    public boolean B;
    public boolean C;
    public boolean D;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<g0> f1248a;

    /* renamed from: b  reason: collision with root package name */
    public IBinder f1249b;

    /* renamed from: c  reason: collision with root package name */
    public f0 f1250c;

    /* renamed from: d  reason: collision with root package name */
    public g0 f1251d;

    /* renamed from: e  reason: collision with root package name */
    public rf.a<m> f1252e;

    /* renamed from: androidx.compose.ui.platform.a$a  reason: collision with other inner class name */
    public static final class C0015a extends k implements p<h, Integer, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f1253a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0015a(a aVar) {
            super(2);
            this.f1253a = aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            h hVar = (h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.h()) {
                e0.b bVar = e0.f15020a;
                this.f1253a.a(hVar, 8);
            } else {
                hVar.j();
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static boolean f(g0 g0Var) {
        return !(g0Var instanceof z1) || ((z1.d) ((z1) g0Var).f15310o.getValue()).compareTo(z1.d.f15315b) > 0;
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(g0 g0Var) {
        if (this.f1251d != g0Var) {
            this.f1251d = g0Var;
            if (g0Var != null) {
                this.f1248a = null;
            }
            f0 f0Var = this.f1250c;
            if (f0Var != null) {
                f0Var.a();
                this.f1250c = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f1249b != iBinder) {
            this.f1249b = iBinder;
            this.f1248a = null;
        }
    }

    public abstract void a(h hVar, int i8);

    public final void addView(View view) {
        b();
        super.addView(view);
    }

    public final boolean addViewInLayout(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i8, layoutParams);
    }

    public final void b() {
        if (!this.C) {
            throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    /* JADX INFO: finally extract failed */
    public final void c() {
        if (this.f1250c == null) {
            try {
                this.C = true;
                this.f1250c = z3.a(this, g(), b.c(-656146368, new C0015a(this), true));
                this.C = false;
            } catch (Throwable th) {
                this.C = false;
                throw th;
            }
        }
    }

    public void d(boolean z10, int i8, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i8) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    public void e(int i8, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i8, i10);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i8)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r2 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0021, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t.g0 g() {
        /*
            r9 = this;
            t.g0 r0 = r9.f1251d
            if (r0 != 0) goto L_0x00f5
            t.g0 r0 = androidx.compose.ui.platform.t3.b(r9)
            if (r0 == 0) goto L_0x000b
            goto L_0x0021
        L_0x000b:
            android.view.ViewParent r1 = r9.getParent()
        L_0x000f:
            if (r0 != 0) goto L_0x0021
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L_0x0021
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            t.g0 r0 = androidx.compose.ui.platform.t3.b(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x000f
        L_0x0021:
            r1 = 0
            if (r0 == 0) goto L_0x0037
            boolean r2 = f(r0)
            if (r2 == 0) goto L_0x002c
            r2 = r0
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            if (r2 == 0) goto L_0x0038
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r9.f1248a = r3
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            if (r0 != 0) goto L_0x00f5
            java.lang.ref.WeakReference<t.g0> r0 = r9.f1248a
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r0.get()
            t.g0 r0 = (t.g0) r0
            if (r0 == 0) goto L_0x004d
            boolean r2 = f(r0)
            if (r2 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r1
        L_0x004e:
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r9.isAttachedToWindow()
            if (r0 == 0) goto L_0x00d8
            android.view.ViewParent r0 = r9.getParent()
            r2 = r9
        L_0x005b:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L_0x0073
            android.view.View r0 = (android.view.View) r0
            int r3 = r0.getId()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r3 != r4) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            android.view.ViewParent r2 = r0.getParent()
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x005b
        L_0x0073:
            t.g0 r0 = androidx.compose.ui.platform.t3.b(r2)
            if (r0 != 0) goto L_0x00b5
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.platform.m3> r0 = androidx.compose.ui.platform.p3.f1393a
            java.lang.Object r0 = r0.get()
            androidx.compose.ui.platform.m3 r0 = (androidx.compose.ui.platform.m3) r0
            t.z1 r0 = r0.a(r2)
            r3 = 2131296463(0x7f0900cf, float:1.8210843E38)
            r2.setTag(r3, r0)
            ag.f1 r3 = ag.f1.f418a
            android.os.Handler r4 = r2.getHandler()
            java.lang.String r5 = "rootView.handler"
            sf.j.e(r4, r5)
            int r5 = bg.h.f3653a
            bg.f r5 = new bg.f
            java.lang.String r6 = "windowRecomposer cleanup"
            r7 = 0
            r5.<init>(r4, r6, r7)
            androidx.compose.ui.platform.o3 r4 = new androidx.compose.ui.platform.o3
            r4.<init>(r0, r2, r1)
            r6 = 2
            bg.f r5 = r5.B
            ag.f2 r3 = cb.b.D(r3, r5, r7, r4, r6)
            androidx.compose.ui.platform.n3 r4 = new androidx.compose.ui.platform.n3
            r4.<init>(r3)
            r2.addOnAttachStateChangeListener(r4)
            goto L_0x00bb
        L_0x00b5:
            boolean r2 = r0 instanceof t.z1
            if (r2 == 0) goto L_0x00cc
            t.z1 r0 = (t.z1) r0
        L_0x00bb:
            boolean r2 = f(r0)
            if (r2 == 0) goto L_0x00c2
            r1 = r0
        L_0x00c2:
            if (r1 == 0) goto L_0x00f5
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r9.f1248a = r2
            goto L_0x00f5
        L_0x00cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "root viewTreeParentCompositionContext is not a Recomposer"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot locate windowRecomposer; View "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = " is not attached to a window"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.a.g():t.g0");
    }

    public final boolean getHasComposition() {
        return this.f1250c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.B;
    }

    public final boolean isTransitionGroup() {
        return !this.D || super.isTransitionGroup();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        d(z10, i8, i10, i11, i12);
    }

    public final void onMeasure(int i8, int i10) {
        c();
        e(i8, i10);
    }

    public final void onRtlPropertiesChanged(int i8) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i8);
        }
    }

    public final void setParentCompositionContext(g0 g0Var) {
        setParentContext(g0Var);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.B = z10;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((b1) childAt).setShowLayoutBounds(z10);
        }
    }

    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.D = true;
    }

    public final void setViewCompositionStrategy(c3 c3Var) {
        j.f(c3Var, "strategy");
        rf.a<m> aVar = this.f1252e;
        if (aVar != null) {
            aVar.d();
        }
        this.f1252e = c3Var.a(this);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        j.f(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        a3 a3Var = new a3(this);
        addOnAttachStateChangeListener(a3Var);
        b3 b3Var = new b3();
        d.K(this).f9788a.add(b3Var);
        this.f1252e = new z2(this, a3Var, b3Var);
    }

    public final void addView(View view, int i8) {
        b();
        super.addView(view, i8);
    }

    public final boolean addViewInLayout(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i8, layoutParams, z10);
    }

    public final void addView(View view, int i8, int i10) {
        b();
        super.addView(view, i8, i10);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i8, layoutParams);
    }
}
