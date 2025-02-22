package com.google.android.material.sidesheet;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.activity.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.q;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import e2.i;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l2.c;
import v8.f;
import v8.i;
import w8.d;

public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public w8.a f6025a;

    /* renamed from: b  reason: collision with root package name */
    public f f6026b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f6027c;

    /* renamed from: d  reason: collision with root package name */
    public final i f6028d;

    /* renamed from: e  reason: collision with root package name */
    public final SideSheetBehavior<V>.c f6029e = new c();

    /* renamed from: f  reason: collision with root package name */
    public final float f6030f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6031g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f6032h = 5;

    /* renamed from: i  reason: collision with root package name */
    public l2.c f6033i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6034j;

    /* renamed from: k  reason: collision with root package name */
    public final float f6035k = 0.1f;

    /* renamed from: l  reason: collision with root package name */
    public int f6036l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public WeakReference<V> f6037n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference<View> f6038o;

    /* renamed from: p  reason: collision with root package name */
    public int f6039p = -1;

    /* renamed from: q  reason: collision with root package name */
    public VelocityTracker f6040q;

    /* renamed from: r  reason: collision with root package name */
    public int f6041r;

    /* renamed from: s  reason: collision with root package name */
    public final LinkedHashSet f6042s = new LinkedHashSet();

    /* renamed from: t  reason: collision with root package name */
    public final a f6043t = new a();

    public class a extends c.C0205c {
        public a() {
        }

        public final int a(View view, int i8) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return b7.a.r(i8, sideSheetBehavior.f6025a.a(), sideSheetBehavior.m);
        }

        public final int b(View view, int i8) {
            return view.getTop();
        }

        public final int c(View view) {
            return SideSheetBehavior.this.m;
        }

        public final void h(int i8) {
            if (i8 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f6031g) {
                    sideSheetBehavior.s(1);
                }
            }
        }

        public final void i(View view, int i8, int i10) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f6038o;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (!(view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null)) {
                w8.a aVar = sideSheetBehavior.f6025a;
                int left = view.getLeft();
                view.getRight();
                int i11 = aVar.f16525a.m;
                if (left <= i11) {
                    marginLayoutParams.rightMargin = i11 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet<w8.b> linkedHashSet = sideSheetBehavior.f6042s;
            if (!linkedHashSet.isEmpty()) {
                w8.a aVar2 = sideSheetBehavior.f6025a;
                int i12 = aVar2.f16525a.m;
                aVar2.a();
                for (w8.b b10 : linkedHashSet) {
                    b10.b();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
            if (r6 != false) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
            if (r6 == false) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
            if (java.lang.Math.abs(r9 - r1.a()) < java.lang.Math.abs(r9 - r5.m)) goto L_0x0084;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                w8.a r1 = r0.f6025a
                r1.getClass()
                r2 = 0
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                r4 = 1
                if (r3 >= 0) goto L_0x000f
                goto L_0x0084
            L_0x000f:
                int r3 = r8.getRight()
                float r3 = (float) r3
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r5 = r1.f16525a
                float r6 = r5.f6035k
                float r6 = r6 * r9
                float r6 = r6 + r3
                float r3 = java.lang.Math.abs(r6)
                r6 = 1056964608(0x3f000000, float:0.5)
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                r6 = 0
                if (r3 <= 0) goto L_0x0027
                r3 = r4
                goto L_0x0028
            L_0x0027:
                r3 = r6
            L_0x0028:
                if (r3 == 0) goto L_0x005a
                float r9 = java.lang.Math.abs(r9)
                float r2 = java.lang.Math.abs(r10)
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 <= 0) goto L_0x0038
                r9 = r4
                goto L_0x0039
            L_0x0038:
                r9 = r6
            L_0x0039:
                if (r9 == 0) goto L_0x0044
                r9 = 500(0x1f4, float:7.0E-43)
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x0044
                r9 = r4
                goto L_0x0045
            L_0x0044:
                r9 = r6
            L_0x0045:
                if (r9 != 0) goto L_0x0086
                int r9 = r8.getLeft()
                int r10 = r5.m
                int r1 = r1.a()
                int r10 = r10 - r1
                int r10 = r10 / 2
                if (r9 <= r10) goto L_0x0057
                r6 = r4
            L_0x0057:
                if (r6 == 0) goto L_0x0084
                goto L_0x0086
            L_0x005a:
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 == 0) goto L_0x006d
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x006b
                r6 = r4
            L_0x006b:
                if (r6 != 0) goto L_0x0086
            L_0x006d:
                int r9 = r8.getLeft()
                int r10 = r1.a()
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                int r1 = r5.m
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x0086
            L_0x0084:
                r9 = 3
                goto L_0x0087
            L_0x0086:
                r9 = 5
            L_0x0087:
                r0.t(r8, r9, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.j(android.view.View, float, float):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
            r5 = r5.f6037n;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean k(android.view.View r4, int r5) {
            /*
                r3 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r5 = com.google.android.material.sidesheet.SideSheetBehavior.this
                int r0 = r5.f6032h
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L_0x0009
                return r1
            L_0x0009:
                java.lang.ref.WeakReference<V> r5 = r5.f6037n
                if (r5 == 0) goto L_0x0014
                java.lang.Object r5 = r5.get()
                if (r5 != r4) goto L_0x0014
                r1 = r2
            L_0x0014:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.k(android.view.View, int):boolean");
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public int f6046a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6047b;

        /* renamed from: c  reason: collision with root package name */
        public final j f6048c = new j(this, 9);

        public c() {
        }

        public final void a(int i8) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f6037n;
            if (weakReference != null && weakReference.get() != null) {
                this.f6046a = i8;
                if (!this.f6047b) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.d.m((View) sideSheetBehavior.f6037n.get(), this.f6048c);
                    this.f6047b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
    }

    public final void c(CoordinatorLayout.f fVar) {
        this.f6037n = null;
        this.f6033i = null;
    }

    public final void f() {
        this.f6037n = null;
        this.f6033i = null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        l2.c cVar;
        VelocityTracker velocityTracker;
        if (!((v3.isShown() || i0.e(v3) != null) && this.f6031g)) {
            this.f6034j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f6040q) != null) {
            velocityTracker.recycle();
            this.f6040q = null;
        }
        if (this.f6040q == null) {
            this.f6040q = VelocityTracker.obtain();
        }
        this.f6040q.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f6041r = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f6034j) {
            this.f6034j = false;
            return false;
        }
        return !this.f6034j && (cVar = this.f6033i) != null && cVar.r(motionEvent);
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v3, int i8) {
        int i10;
        View findViewById;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.d.b(coordinatorLayout) && !i0.d.b(v3)) {
            v3.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.f6037n == null) {
            this.f6037n = new WeakReference<>(v3);
            f fVar = this.f6026b;
            if (fVar != null) {
                i0.d.q(v3, fVar);
                f fVar2 = this.f6026b;
                float f10 = this.f6030f;
                if (f10 == -1.0f) {
                    f10 = i0.i.i(v3);
                }
                fVar2.l(f10);
            } else {
                ColorStateList colorStateList = this.f6027c;
                if (colorStateList != null) {
                    i0.i.q(v3, colorStateList);
                }
            }
            int i12 = this.f6032h == 5 ? 4 : 0;
            if (v3.getVisibility() != i12) {
                v3.setVisibility(i12);
            }
            u();
            if (i0.d.c(v3) == 0) {
                i0.d.s(v3, 1);
            }
            if (i0.e(v3) == null) {
                i0.o(v3, v3.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f6033i == null) {
            this.f6033i = new l2.c(coordinatorLayout.getContext(), coordinatorLayout, this.f6043t);
        }
        this.f6025a.getClass();
        int left = v3.getLeft();
        coordinatorLayout.q(v3, i8);
        this.m = coordinatorLayout.getWidth();
        this.f6036l = v3.getWidth();
        int i13 = this.f6032h;
        if (i13 == 1 || i13 == 2) {
            this.f6025a.getClass();
            i11 = left - v3.getLeft();
        } else if (i13 != 3) {
            if (i13 == 5) {
                i11 = this.f6025a.f16525a.m;
            } else {
                throw new IllegalStateException("Unexpected value: " + this.f6032h);
            }
        }
        v3.offsetLeftAndRight(i11);
        if (!(this.f6038o != null || (i10 = this.f6039p) == -1 || (findViewById = coordinatorLayout.findViewById(i10)) == null)) {
            this.f6038o = new WeakReference<>(findViewById);
        }
        for (w8.b bVar : this.f6042s) {
            if (bVar instanceof w8.f) {
                ((w8.f) bVar).getClass();
            }
        }
        return true;
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i8, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    public final void n(View view, Parcelable parcelable) {
        int i8 = ((b) parcelable).f6045c;
        if (i8 == 1 || i8 == 2) {
            i8 = 5;
        }
        this.f6032h = i8;
    }

    public final Parcelable o(View view) {
        return new b(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z10 = false;
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i8 = this.f6032h;
        if (i8 == 1 && actionMasked == 0) {
            return true;
        }
        l2.c cVar = this.f6033i;
        if (cVar != null && (this.f6031g || i8 == 1)) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f6040q) != null) {
            velocityTracker.recycle();
            this.f6040q = null;
        }
        if (this.f6040q == null) {
            this.f6040q = VelocityTracker.obtain();
        }
        this.f6040q.addMovement(motionEvent);
        l2.c cVar2 = this.f6033i;
        if ((cVar2 != null && (this.f6031g || this.f6032h == 1)) && actionMasked == 2 && !this.f6034j) {
            if ((cVar2 != null && (this.f6031g || this.f6032h == 1)) && Math.abs(((float) this.f6041r) - motionEvent.getX()) > ((float) this.f6033i.f10945b)) {
                z10 = true;
            }
            if (z10) {
                this.f6033i.b(v3, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f6034j;
    }

    public final void s(int i8) {
        View view;
        if (this.f6032h != i8) {
            this.f6032h = i8;
            WeakReference<V> weakReference = this.f6037n;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                int i10 = this.f6032h == 5 ? 4 : 0;
                if (view.getVisibility() != i10) {
                    view.setVisibility(i10);
                }
                for (w8.b a10 : this.f6042s) {
                    a10.a();
                }
                u();
            }
        }
    }

    public final void t(View view, int i8, boolean z10) {
        int i10;
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f6025a.f16525a;
        if (i8 == 3) {
            i10 = sideSheetBehavior.f6025a.a();
        } else if (i8 == 5) {
            i10 = sideSheetBehavior.f6025a.f16525a.m;
        } else {
            sideSheetBehavior.getClass();
            throw new IllegalArgumentException(q.a("Invalid state to get outward edge offset: ", i8));
        }
        l2.c cVar = sideSheetBehavior.f6033i;
        if (cVar != null && (!z10 ? cVar.s(view, i10, view.getTop()) : cVar.q(i10, view.getTop()))) {
            s(2);
            this.f6029e.a(i8);
            return;
        }
        s(i8);
    }

    public final void u() {
        View view;
        WeakReference<V> weakReference = this.f6037n;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            i0.k(view, 262144);
            i0.h(view, 0);
            i0.k(view, 1048576);
            i0.h(view, 0);
            if (this.f6032h != 5) {
                i0.l(view, i.a.f7790n, new d(this, 5));
            }
            if (this.f6032h != 3) {
                i0.l(view, i.a.f7789l, new d(this, 3));
            }
        }
    }

    public static class b extends k2.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f6045c;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new b[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6045c = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeInt(this.f6045c);
        }

        public b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f6045c = sideSheetBehavior.f6032h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.f460h0);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f6027c = r8.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f6028d = new v8.i(v8.i.b(context, attributeSet, 0, 2132018142));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f6039p = resourceId;
            WeakReference<View> weakReference = this.f6038o;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f6038o = null;
            WeakReference<V> weakReference2 = this.f6037n;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    if (i0.g.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        v8.i iVar = this.f6028d;
        if (iVar != null) {
            f fVar = new f(iVar);
            this.f6026b = fVar;
            fVar.j(context);
            ColorStateList colorStateList = this.f6027c;
            if (colorStateList != null) {
                this.f6026b.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f6026b.setTint(typedValue.data);
            }
        }
        this.f6030f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f6031g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f6025a == null) {
            this.f6025a = new w8.a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
