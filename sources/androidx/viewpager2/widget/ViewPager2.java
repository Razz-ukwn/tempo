package androidx.viewpager2.widget;

import ag.b1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import androidx.viewpager2.widget.c;
import d2.d1;
import d2.i0;
import e2.i;
import e2.m;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class ViewPager2 extends ViewGroup {
    public final a B;
    public d C;
    public int D;
    public Parcelable E;
    public i F;
    public h G;
    public c H;
    public a I;
    public w3.c J;
    public b K;
    public RecyclerView.j L;
    public boolean M;
    public boolean N;
    public int O;
    public f P;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f2843a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f2844b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final a f2845c;

    /* renamed from: d  reason: collision with root package name */
    public int f2846d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2847e;

    public class a extends c {
        public a() {
            super(0);
        }

        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f2847e = true;
            viewPager2.H.f2873l = true;
        }
    }

    public abstract class b {
    }

    public static abstract class c extends RecyclerView.g {
        public c(int i8) {
        }

        public abstract void a();

        public final void b() {
            a();
        }

        public final void c(Object obj, int i8, int i10) {
            a();
        }

        public final void d(int i8, int i10) {
            a();
        }

        public final void e(int i8, int i10) {
            a();
        }

        public final void f(int i8, int i10) {
            a();
        }
    }

    public class d extends LinearLayoutManager {
        public d() {
            super(1);
        }

        public final void D0(RecyclerView.y yVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.D0(yVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public final void V(RecyclerView.t tVar, RecyclerView.y yVar, e2.i iVar) {
            super.V(tVar, yVar, iVar);
            ViewPager2.this.P.getClass();
        }

        public final boolean i0(RecyclerView.t tVar, RecyclerView.y yVar, int i8, Bundle bundle) {
            ViewPager2.this.P.getClass();
            return super.i0(tVar, yVar, i8, bundle);
        }

        public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    public static abstract class e {
        public void a(int i8) {
        }

        public void b(float f10, int i8, int i10) {
        }

        public void c(int i8) {
        }
    }

    public class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f2849a = new a();

        /* renamed from: b  reason: collision with root package name */
        public final b f2850b = new b();

        /* renamed from: c  reason: collision with root package name */
        public f f2851c;

        public class a implements m {
            public a() {
            }

            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.N) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
        }

        public class b implements m {
            public b() {
            }

            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.N) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.s(recyclerView, 2);
            this.f2851c = new f(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (i0.d.c(viewPager2) == 0) {
                i0.d.s(viewPager2, 1);
            }
        }

        public final void b() {
            int d10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i8 = 16908360;
            i0.k(viewPager2, 16908360);
            boolean z10 = false;
            i0.h(viewPager2, 0);
            i0.k(viewPager2, 16908361);
            i0.h(viewPager2, 0);
            i0.k(viewPager2, 16908358);
            i0.h(viewPager2, 0);
            i0.k(viewPager2, 16908359);
            i0.h(viewPager2, 0);
            if (viewPager2.getAdapter() != null && (d10 = viewPager2.getAdapter().d()) != 0 && viewPager2.N) {
                int orientation = viewPager2.getOrientation();
                b bVar = this.f2850b;
                a aVar = this.f2849a;
                if (orientation == 0) {
                    if (viewPager2.C.A() == 1) {
                        z10 = true;
                    }
                    int i10 = z10 ? 16908360 : 16908361;
                    if (z10) {
                        i8 = 16908361;
                    }
                    if (viewPager2.f2846d < d10 - 1) {
                        i0.l(viewPager2, new i.a(i10, (String) null), aVar);
                    }
                    if (viewPager2.f2846d > 0) {
                        i0.l(viewPager2, new i.a(i8, (String) null), bVar);
                        return;
                    }
                    return;
                }
                if (viewPager2.f2846d < d10 - 1) {
                    i0.l(viewPager2, new i.a(16908359, (String) null), aVar);
                }
                if (viewPager2.f2846d > 0) {
                    i0.l(viewPager2, new i.a(16908358, (String) null), bVar);
                }
            }
        }
    }

    public interface g {
    }

    public class h extends v {
        public h() {
        }

        public final View c(RecyclerView.m mVar) {
            if (((c) ViewPager2.this.J.f16473b).m) {
                return null;
            }
            return super.c(mVar);
        }
    }

    public class i extends RecyclerView {
        public i(Context context) {
            super(context, (AttributeSet) null);
        }

        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.P.getClass();
            return super.getAccessibilityClassName();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f2846d);
            accessibilityEvent.setToIndex(viewPager2.f2846d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.N && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.N && super.onTouchEvent(motionEvent);
        }
    }

    public static class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f2859a;

        /* renamed from: b  reason: collision with root package name */
        public final RecyclerView f2860b;

        public k(int i8, RecyclerView recyclerView) {
            this.f2859a = i8;
            this.f2860b = recyclerView;
        }

        public final void run() {
            this.f2860b.c0(this.f2859a);
        }
    }

    /* JADX INFO: finally extract failed */
    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a();
        this.f2845c = aVar;
        this.f2847e = false;
        this.B = new a();
        this.D = -1;
        this.L = null;
        this.M = false;
        this.N = true;
        this.O = -1;
        this.P = new f();
        i iVar = new i(context);
        this.F = iVar;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        iVar.setId(i0.e.a());
        this.F.setDescendantFocusability(131072);
        d dVar = new d();
        this.C = dVar;
        this.F.setLayoutManager(dVar);
        this.F.setScrollingTouchSlop(1);
        int[] iArr = b1.f398d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.F.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            i iVar2 = this.F;
            w3.d dVar2 = new w3.d();
            if (iVar2.f2404b0 == null) {
                iVar2.f2404b0 = new ArrayList();
            }
            iVar2.f2404b0.add(dVar2);
            c cVar = new c(this);
            this.H = cVar;
            this.J = new w3.c(this, cVar, this.F);
            h hVar = new h();
            this.G = hVar;
            hVar.a(this.F);
            this.F.h(this.H);
            a aVar2 = new a();
            this.I = aVar2;
            this.H.f2862a = aVar2;
            d dVar3 = new d(this);
            e eVar = new e(this);
            this.I.f2861a.add(dVar3);
            this.I.f2861a.add(eVar);
            this.P.a(this.F);
            this.I.f2861a.add(aVar);
            b bVar = new b(this.C);
            this.K = bVar;
            this.I.f2861a.add(bVar);
            i iVar3 = this.F;
            attachViewToParent(iVar3, 0, iVar3.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        RecyclerView.e adapter;
        if (this.D != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.E;
            if (parcelable != null) {
                if (adapter instanceof androidx.viewpager2.adapter.g) {
                    ((androidx.viewpager2.adapter.g) adapter).b(parcelable);
                }
                this.E = null;
            }
            int max = Math.max(0, Math.min(this.D, adapter.d() - 1));
            this.f2846d = max;
            this.D = -1;
            this.F.a0(max);
            this.P.b();
        }
    }

    public final void b(int i8, boolean z10) {
        RecyclerView.e adapter = getAdapter();
        boolean z11 = false;
        if (adapter == null) {
            if (this.D != -1) {
                this.D = Math.max(i8, 0);
            }
        } else if (adapter.d() > 0) {
            int min = Math.min(Math.max(i8, 0), adapter.d() - 1);
            int i10 = this.f2846d;
            if (min == i10) {
                if (this.H.f2867f == 0) {
                    return;
                }
            }
            if (min != i10 || !z10) {
                double d10 = (double) i10;
                this.f2846d = min;
                this.P.b();
                c cVar = this.H;
                if (!(cVar.f2867f == 0)) {
                    cVar.f();
                    c.a aVar = cVar.f2868g;
                    d10 = ((double) aVar.f2874a) + ((double) aVar.f2875b);
                }
                c cVar2 = this.H;
                cVar2.getClass();
                cVar2.f2866e = z10 ? 2 : 3;
                cVar2.m = false;
                if (cVar2.f2870i != min) {
                    z11 = true;
                }
                cVar2.f2870i = min;
                cVar2.d(2);
                if (z11) {
                    cVar2.c(min);
                }
                if (!z10) {
                    this.F.a0(min);
                    return;
                }
                double d11 = (double) min;
                if (Math.abs(d11 - d10) > 3.0d) {
                    this.F.a0(d11 > d10 ? min - 3 : min + 3);
                    i iVar = this.F;
                    iVar.post(new k(min, iVar));
                    return;
                }
                this.F.c0(min);
            }
        }
    }

    public final void c() {
        h hVar = this.G;
        if (hVar != null) {
            View c3 = hVar.c(this.C);
            if (c3 != null) {
                this.C.getClass();
                int G2 = RecyclerView.m.G(c3);
                if (G2 != this.f2846d && getScrollState() == 0) {
                    this.I.c(G2);
                }
                this.f2847e = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final boolean canScrollHorizontally(int i8) {
        return this.F.canScrollHorizontally(i8);
    }

    public final boolean canScrollVertically(int i8) {
        return this.F.canScrollVertically(i8);
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i8 = ((j) parcelable).f2856a;
            sparseArray.put(this.F.getId(), sparseArray.get(i8));
            sparseArray.remove(i8);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    public CharSequence getAccessibilityClassName() {
        this.P.getClass();
        this.P.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.e getAdapter() {
        return this.F.getAdapter();
    }

    public int getCurrentItem() {
        return this.f2846d;
    }

    public int getItemDecorationCount() {
        return this.F.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.O;
    }

    public int getOrientation() {
        return this.C.f2366p;
    }

    public int getPageSize() {
        int i8;
        int i10;
        i iVar = this.F;
        if (getOrientation() == 0) {
            i8 = iVar.getWidth() - iVar.getPaddingLeft();
            i10 = iVar.getPaddingRight();
        } else {
            i8 = iVar.getHeight() - iVar.getPaddingTop();
            i10 = iVar.getPaddingBottom();
        }
        return i8 - i10;
    }

    public int getScrollState() {
        return this.H.f2867f;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i8;
        int i10;
        int d10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            i10 = 0;
            i8 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i10 = viewPager2.getAdapter().d();
            i8 = 0;
        } else {
            i8 = viewPager2.getAdapter().d();
            i10 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i.c.a(i10, i8, 0).f7797a);
        RecyclerView.e adapter = viewPager2.getAdapter();
        if (adapter != null && (d10 = adapter.d()) != 0 && viewPager2.N) {
            if (viewPager2.f2846d > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.f2846d < d10 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        int measuredWidth = this.F.getMeasuredWidth();
        int measuredHeight = this.F.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f2843a;
        rect.left = paddingLeft;
        rect.right = (i11 - i8) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i12 - i10) - getPaddingBottom();
        Rect rect2 = this.f2844b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.F.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f2847e) {
            c();
        }
    }

    public final void onMeasure(int i8, int i10) {
        measureChild(this.F, i8, i10);
        int measuredWidth = this.F.getMeasuredWidth();
        int measuredHeight = this.F.getMeasuredHeight();
        int measuredState = this.F.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i8, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i10, measuredState << 16));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.D = jVar.f2857b;
        this.E = jVar.f2858c;
    }

    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f2856a = this.F.getId();
        int i8 = this.D;
        if (i8 == -1) {
            i8 = this.f2846d;
        }
        jVar.f2857b = i8;
        Parcelable parcelable = this.E;
        if (parcelable != null) {
            jVar.f2858c = parcelable;
        } else {
            RecyclerView.e adapter = this.F.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                jVar.f2858c = ((androidx.viewpager2.adapter.g) adapter).a();
            }
        }
        return jVar;
    }

    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final boolean performAccessibilityAction(int i8, Bundle bundle) {
        this.P.getClass();
        boolean z10 = false;
        if (!(i8 == 8192 || i8 == 4096)) {
            return super.performAccessibilityAction(i8, bundle);
        }
        f fVar = this.P;
        fVar.getClass();
        if (i8 == 8192 || i8 == 4096) {
            z10 = true;
        }
        if (z10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int currentItem = i8 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
            if (viewPager2.N) {
                viewPager2.b(currentItem, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    public void setAdapter(RecyclerView.e eVar) {
        RecyclerView.e adapter = this.F.getAdapter();
        f fVar = this.P;
        if (adapter != null) {
            adapter.f2459a.unregisterObserver(fVar.f2851c);
        } else {
            fVar.getClass();
        }
        a aVar = this.B;
        if (adapter != null) {
            adapter.f2459a.unregisterObserver(aVar);
        }
        this.F.setAdapter(eVar);
        this.f2846d = 0;
        a();
        f fVar2 = this.P;
        fVar2.b();
        if (eVar != null) {
            eVar.o(fVar2.f2851c);
        }
        if (eVar != null) {
            eVar.o(aVar);
        }
    }

    public void setCurrentItem(int i8) {
        if (!((c) this.J.f16473b).m) {
            b(i8, true);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setLayoutDirection(int i8) {
        super.setLayoutDirection(i8);
        this.P.b();
    }

    public void setOffscreenPageLimit(int i8) {
        if (i8 >= 1 || i8 == -1) {
            this.O = i8;
            this.F.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i8) {
        this.C.d1(i8);
        this.P.b();
    }

    public void setPageTransformer(g gVar) {
        if (gVar != null) {
            if (!this.M) {
                this.L = this.F.getItemAnimator();
                this.M = true;
            }
            this.F.setItemAnimator((RecyclerView.j) null);
        } else if (this.M) {
            this.F.setItemAnimator(this.L);
            this.L = null;
            this.M = false;
        }
        this.K.getClass();
        if (gVar != null) {
            this.K.getClass();
            this.K.getClass();
        }
    }

    public void setUserInputEnabled(boolean z10) {
        this.N = z10;
        this.P.b();
    }

    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2856a;

        /* renamed from: b  reason: collision with root package name */
        public int f2857b;

        /* renamed from: c  reason: collision with root package name */
        public Parcelable f2858c;

        public static class a implements Parcelable.ClassLoaderCreator<j> {
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new j[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j() {
            throw null;
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2856a = parcel.readInt();
            this.f2857b = parcel.readInt();
            this.f2858c = parcel.readParcelable(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f2856a);
            parcel.writeInt(this.f2857b);
            parcel.writeParcelable(this.f2858c, i8);
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
