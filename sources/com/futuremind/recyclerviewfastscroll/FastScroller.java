package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cb.c;
import com.quickkonnect.silencio.R;
import o5.b;
import t1.a;

public class FastScroller extends LinearLayout {
    public static final /* synthetic */ int K = 0;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public b I;
    public n5.b J;

    /* renamed from: a  reason: collision with root package name */
    public final a f4136a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f4137b;

    /* renamed from: c  reason: collision with root package name */
    public View f4138c;

    /* renamed from: d  reason: collision with root package name */
    public View f4139d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f4140e;

    public class a implements ViewGroup.OnHierarchyChangeListener {
        public a() {
        }

        public final void onChildViewAdded(View view, View view2) {
            int i8 = FastScroller.K;
            FastScroller.this.b();
        }

        public final void onChildViewRemoved(View view, View view2) {
            int i8 = FastScroller.K;
            FastScroller.this.b();
        }
    }

    /* JADX INFO: finally extract failed */
    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f3887c, R.attr.fastscroll__style, 0);
        try {
            this.D = obtainStyledAttributes.getColor(0, -1);
            this.C = obtainStyledAttributes.getColor(2, -1);
            this.E = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            this.G = getVisibility();
            setViewProvider(new o5.a());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void setRecyclerViewPosition(float f10) {
        TextView textView;
        RecyclerView recyclerView = this.f4137b;
        if (recyclerView != null) {
            int d10 = recyclerView.getAdapter().d();
            int min = (int) Math.min(Math.max(0.0f, (float) ((int) (f10 * ((float) d10)))), (float) (d10 - 1));
            this.f4137b.a0(min);
            n5.b bVar = this.J;
            if (bVar != null && (textView = this.f4140e) != null) {
                textView.setText(bVar.c(min));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        if ((r4.f4137b.getAdapter().d() * r4.f4137b.getChildAt(0).getWidth()) <= r4.f4137b.getWidth()) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if ((r4.f4137b.getAdapter().d() * r4.f4137b.getChildAt(0).getHeight()) <= r4.f4137b.getHeight()) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.f4137b
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x006c
            androidx.recyclerview.widget.RecyclerView r0 = r4.f4137b
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            int r0 = r0.d()
            if (r0 == 0) goto L_0x006c
            androidx.recyclerview.widget.RecyclerView r0 = r4.f4137b
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r4.c()
            r2 = 1
            if (r0 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r0 = r4.f4137b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getHeight()
            androidx.recyclerview.widget.RecyclerView r3 = r4.f4137b
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            int r3 = r3.d()
            int r3 = r3 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.f4137b
            int r0 = r0.getHeight()
            if (r3 > r0) goto L_0x0042
            goto L_0x0061
        L_0x0042:
            r2 = r1
            goto L_0x0061
        L_0x0044:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f4137b
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r3 = r4.f4137b
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            int r3 = r3.d()
            int r3 = r3 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.f4137b
            int r0 = r0.getWidth()
            if (r3 > r0) goto L_0x0042
        L_0x0061:
            if (r2 != 0) goto L_0x006c
            int r0 = r4.G
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            super.setVisibility(r1)
            goto L_0x0070
        L_0x006c:
            r0 = 4
            super.setVisibility(r0)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.b():void");
    }

    public final boolean c() {
        return this.F == 1;
    }

    public b getViewProvider() {
        return this.I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        r3 = r0.f4139d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
        r3 = r0.f4140e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.view.View r1 = r0.f4139d
            n5.a r2 = new n5.a
            r2.<init>(r0)
            r1.setOnTouchListener(r2)
            o5.b r1 = r0.I
            o5.a r1 = (o5.a) r1
            com.futuremind.recyclerviewfastscroll.FastScroller r2 = r1.f12178a
            boolean r2 = r2.c()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L_0x002a
            android.view.View r2 = r1.f12177d
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r3
            android.view.View r1 = r1.f12176c
            int r1 = r1.getHeight()
            goto L_0x0038
        L_0x002a:
            android.view.View r2 = r1.f12177d
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r2 = r2 / r3
            android.view.View r1 = r1.f12176c
            int r1 = r1.getWidth()
        L_0x0038:
            float r1 = (float) r1
            float r2 = r2 - r1
            int r1 = (int) r2
            r0.B = r1
            int r1 = r0.D
            r2 = -1
            if (r1 == r2) goto L_0x0055
            android.widget.TextView r3 = r0.f4140e
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto L_0x004b
            goto L_0x0055
        L_0x004b:
            android.graphics.drawable.Drawable r5 = r4.mutate()
            w1.a.b.g(r5, r1)
            r3.setBackground(r4)
        L_0x0055:
            int r1 = r0.C
            if (r1 == r2) goto L_0x006c
            android.view.View r3 = r0.f4139d
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto L_0x0062
            goto L_0x006c
        L_0x0062:
            android.graphics.drawable.Drawable r5 = r4.mutate()
            w1.a.b.g(r5, r1)
            r3.setBackground(r4)
        L_0x006c:
            int r1 = r0.E
            if (r1 == r2) goto L_0x0075
            android.widget.TextView r2 = r0.f4140e
            r2.setTextAppearance(r1)
        L_0x0075:
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L_0x0082
            com.futuremind.recyclerviewfastscroll.a r1 = r0.f4136a
            androidx.recyclerview.widget.RecyclerView r2 = r0.f4137b
            r1.c(r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.onLayout(boolean, int, int, int, int):void");
    }

    public void setBubbleColor(int i8) {
        this.D = i8;
        invalidate();
    }

    public void setBubbleTextAppearance(int i8) {
        this.E = i8;
        invalidate();
    }

    public void setHandleColor(int i8) {
        this.C = i8;
        invalidate();
    }

    public void setOrientation(int i8) {
        this.F = i8;
        super.setOrientation(i8 == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f4137b = recyclerView;
        if (recyclerView.getAdapter() instanceof n5.b) {
            this.J = (n5.b) recyclerView.getAdapter();
        }
        recyclerView.h(this.f4136a);
        b();
        recyclerView.setOnHierarchyChangeListener(new a());
    }

    public void setScrollerPosition(float f10) {
        if (c()) {
            this.f4138c.setY(Math.min(Math.max(0.0f, (((float) (getHeight() - this.f4139d.getHeight())) * f10) + ((float) this.B)), (float) (getHeight() - this.f4138c.getHeight())));
            this.f4139d.setY(Math.min(Math.max(0.0f, f10 * ((float) (getHeight() - this.f4139d.getHeight()))), (float) (getHeight() - this.f4139d.getHeight())));
            return;
        }
        this.f4138c.setX(Math.min(Math.max(0.0f, (((float) (getWidth() - this.f4139d.getWidth())) * f10) + ((float) this.B)), (float) (getWidth() - this.f4138c.getWidth())));
        this.f4139d.setX(Math.min(Math.max(0.0f, f10 * ((float) (getWidth() - this.f4139d.getWidth()))), (float) (getWidth() - this.f4139d.getWidth())));
    }

    public void setViewProvider(b bVar) {
        removeAllViews();
        this.I = bVar;
        bVar.f12178a = this;
        o5.a aVar = (o5.a) bVar;
        int i8 = 0;
        View inflate = LayoutInflater.from(aVar.b()).inflate(R.layout.fastscroll__default_bubble, this, false);
        aVar.f12176c = inflate;
        this.f4138c = inflate;
        aVar.f12177d = new View(aVar.b());
        int dimensionPixelSize = aVar.f12178a.c() ? 0 : aVar.b().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        if (aVar.f12178a.c()) {
            i8 = aVar.b().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        }
        int i10 = i8;
        Context b10 = aVar.b();
        Object obj = t1.a.f15323a;
        aVar.f12177d.setBackground(new InsetDrawable(a.c.b(b10, R.drawable.fastscroll__default_handle), i10, dimensionPixelSize, i10, dimensionPixelSize));
        Resources resources = aVar.b().getResources();
        boolean c3 = aVar.f12178a.c();
        int i11 = R.dimen.fastscroll__handle_clickable_width;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(c3 ? R.dimen.fastscroll__handle_clickable_width : R.dimen.fastscroll__handle_height);
        Resources resources2 = aVar.b().getResources();
        if (aVar.f12178a.c()) {
            i11 = R.dimen.fastscroll__handle_height;
        }
        aVar.f12177d.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize2, resources2.getDimensionPixelSize(i11)));
        this.f4139d = aVar.f12177d;
        this.f4140e = (TextView) aVar.f12176c;
        addView(this.f4138c);
        addView(this.f4139d);
    }

    public void setVisibility(int i8) {
        this.G = i8;
        b();
    }
}
