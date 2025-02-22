package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.h1;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.j1;
import h.f;
import java.util.WeakHashMap;
import m8.h;
import m8.i;
import m8.m;
import t1.a;
import v8.f;
import v8.i;
import v8.j;

public class NavigationView extends m {
    public static final int[] P = {16842912};
    public static final int[] Q = {-16842910};
    public final h D;
    public final i E;
    public final int F;
    public final int[] G = new int[2];
    public f H;
    public o8.h I;
    public boolean J = true;
    public boolean K = true;
    public final int L = 0;
    public final int M = 0;
    public Path N;
    public final RectF O = new RectF();

    public interface a {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = 2130904003(0x7f0303c3, float:1.741484E38)
            r9 = 2132018003(0x7f140353, float:1.96743E38)
            r1 = r17
            android.content.Context r1 = c9.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            m8.i r10 = new m8.i
            r10.<init>()
            r0.E = r10
            r11 = 2
            int[] r1 = new int[r11]
            r0.G = r1
            r12 = 1
            r0.J = r12
            r0.K = r12
            r13 = 0
            r0.L = r13
            r0.M = r13
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.O = r1
            android.content.Context r14 = r16.getContext()
            m8.h r15 = new m8.h
            r15.<init>(r14)
            r0.D = r15
            int[] r3 = ag.n2.f453c0
            r5 = 2132018003(0x7f140353, float:1.96743E38)
            int[] r6 = new int[r13]
            r4 = 2130904003(0x7f0303c3, float:1.741484E38)
            r1 = r14
            r2 = r18
            androidx.appcompat.widget.h1 r1 = m8.s.e(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.l(r12)
            if (r2 == 0) goto L_0x005b
            android.graphics.drawable.Drawable r2 = r1.e(r12)
            java.util.WeakHashMap<android.view.View, d2.d1> r3 = d2.i0.f7217a
            d2.i0.d.q(r0, r2)
        L_0x005b:
            r2 = 7
            int r2 = r1.d(r2, r13)
            r0.M = r2
            int r2 = r1.h(r13, r13)
            r0.L = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            if (r2 == 0) goto L_0x0076
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x00a1
        L_0x0076:
            v8.i$a r2 = v8.i.b(r14, r7, r8, r9)
            v8.i r3 = new v8.i
            r3.<init>(r2)
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            v8.f r4 = new v8.f
            r4.<init>((v8.i) r3)
            boolean r3 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r3 == 0) goto L_0x0099
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.m(r2)
        L_0x0099:
            r4.j(r14)
            java.util.WeakHashMap<android.view.View, d2.d1> r2 = d2.i0.f7217a
            d2.i0.d.q(r0, r4)
        L_0x00a1:
            r2 = 8
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x00b1
            int r2 = r1.d(r2, r13)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00b1:
            boolean r2 = r1.a(r11, r13)
            r0.setFitsSystemWindows(r2)
            r2 = 3
            int r2 = r1.d(r2, r13)
            r0.F = r2
            r2 = 30
            boolean r3 = r1.l(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cd
            android.content.res.ColorStateList r2 = r1.b(r2)
            goto L_0x00ce
        L_0x00cd:
            r2 = r4
        L_0x00ce:
            r3 = 33
            boolean r5 = r1.l(r3)
            if (r5 == 0) goto L_0x00db
            int r3 = r1.i(r3, r13)
            goto L_0x00dc
        L_0x00db:
            r3 = r13
        L_0x00dc:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00e7
            if (r2 != 0) goto L_0x00e7
            android.content.res.ColorStateList r2 = r0.b(r5)
        L_0x00e7:
            r6 = 14
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x00f4
            android.content.res.ColorStateList r5 = r1.b(r6)
            goto L_0x00f8
        L_0x00f4:
            android.content.res.ColorStateList r5 = r0.b(r5)
        L_0x00f8:
            r6 = 24
            boolean r7 = r1.l(r6)
            if (r7 == 0) goto L_0x0105
            int r6 = r1.i(r6, r13)
            goto L_0x0106
        L_0x0105:
            r6 = r13
        L_0x0106:
            r7 = 13
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x0115
            int r7 = r1.d(r7, r13)
            r0.setItemIconSize(r7)
        L_0x0115:
            r7 = 25
            boolean r8 = r1.l(r7)
            if (r8 == 0) goto L_0x0122
            android.content.res.ColorStateList r7 = r1.b(r7)
            goto L_0x0123
        L_0x0122:
            r7 = r4
        L_0x0123:
            if (r6 != 0) goto L_0x012e
            if (r7 != 0) goto L_0x012e
            r7 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r7 = r0.b(r7)
        L_0x012e:
            r8 = 10
            android.graphics.drawable.Drawable r8 = r1.e(r8)
            if (r8 != 0) goto L_0x0174
            r9 = 17
            boolean r9 = r1.l(r9)
            if (r9 != 0) goto L_0x0149
            r9 = 18
            boolean r9 = r1.l(r9)
            if (r9 == 0) goto L_0x0147
            goto L_0x0149
        L_0x0147:
            r9 = r13
            goto L_0x014a
        L_0x0149:
            r9 = r12
        L_0x014a:
            if (r9 == 0) goto L_0x0174
            android.content.Context r8 = r16.getContext()
            r9 = 19
            android.content.res.ColorStateList r8 = r8.c.b(r8, r1, r9)
            android.graphics.drawable.InsetDrawable r8 = r0.c(r1, r8)
            r9 = 16
            android.content.res.ColorStateList r9 = r8.c.b(r14, r1, r9)
            if (r9 == 0) goto L_0x0174
            android.graphics.drawable.InsetDrawable r11 = r0.c(r1, r4)
            android.graphics.drawable.RippleDrawable r12 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = s8.a.c(r9)
            r12.<init>(r9, r4, r11)
            r10.I = r12
            r10.d(r13)
        L_0x0174:
            r4 = 11
            boolean r9 = r1.l(r4)
            if (r9 == 0) goto L_0x0183
            int r4 = r1.d(r4, r13)
            r0.setItemHorizontalPadding(r4)
        L_0x0183:
            r4 = 26
            boolean r9 = r1.l(r4)
            if (r9 == 0) goto L_0x0192
            int r4 = r1.d(r4, r13)
            r0.setItemVerticalPadding(r4)
        L_0x0192:
            r4 = 6
            int r4 = r1.d(r4, r13)
            r0.setDividerInsetStart(r4)
            r4 = 5
            int r4 = r1.d(r4, r13)
            r0.setDividerInsetEnd(r4)
            r4 = 32
            int r4 = r1.d(r4, r13)
            r0.setSubheaderInsetStart(r4)
            r4 = 31
            int r4 = r1.d(r4, r13)
            r0.setSubheaderInsetEnd(r4)
            r4 = 34
            boolean r9 = r0.J
            boolean r4 = r1.a(r4, r9)
            r0.setTopInsetScrimEnabled(r4)
            r4 = 4
            boolean r9 = r0.K
            boolean r4 = r1.a(r4, r9)
            r0.setBottomInsetScrimEnabled(r4)
            r4 = 12
            int r4 = r1.d(r4, r13)
            r9 = 15
            r11 = 1
            int r9 = r1.h(r9, r11)
            r0.setItemMaxLines(r9)
            com.google.android.material.navigation.a r9 = new com.google.android.material.navigation.a
            r9.<init>(r0)
            r15.f726e = r9
            r10.f11263d = r11
            r10.h(r14, r15)
            if (r3 == 0) goto L_0x01ec
            r10.C = r3
            r10.d(r13)
        L_0x01ec:
            r10.D = r2
            r10.d(r13)
            r10.G = r5
            r10.d(r13)
            int r2 = r16.getOverScrollMode()
            r10.W = r2
            com.google.android.material.internal.NavigationMenuView r3 = r10.f11260a
            if (r3 == 0) goto L_0x0203
            r3.setOverScrollMode(r2)
        L_0x0203:
            if (r6 == 0) goto L_0x020a
            r10.E = r6
            r10.d(r13)
        L_0x020a:
            r10.F = r7
            r10.d(r13)
            r10.H = r8
            r10.d(r13)
            r10.L = r4
            r10.d(r13)
            android.content.Context r2 = r15.f722a
            r15.b(r10, r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f11260a
            if (r2 != 0) goto L_0x0264
            android.view.LayoutInflater r2 = r10.B
            r3 = 2131492948(0x7f0c0054, float:1.8609362E38)
            android.view.View r2 = r2.inflate(r3, r0, r13)
            com.google.android.material.internal.NavigationMenuView r2 = (com.google.android.material.internal.NavigationMenuView) r2
            r10.f11260a = r2
            m8.i$h r3 = new m8.i$h
            com.google.android.material.internal.NavigationMenuView r4 = r10.f11260a
            r3.<init>(r4)
            r2.setAccessibilityDelegateCompat(r3)
            m8.i$c r2 = r10.f11264e
            if (r2 != 0) goto L_0x0244
            m8.i$c r2 = new m8.i$c
            r2.<init>()
            r10.f11264e = r2
        L_0x0244:
            int r2 = r10.W
            r3 = -1
            if (r2 == r3) goto L_0x024e
            com.google.android.material.internal.NavigationMenuView r3 = r10.f11260a
            r3.setOverScrollMode(r2)
        L_0x024e:
            android.view.LayoutInflater r2 = r10.B
            r3 = 2131492945(0x7f0c0051, float:1.8609356E38)
            com.google.android.material.internal.NavigationMenuView r4 = r10.f11260a
            android.view.View r2 = r2.inflate(r3, r4, r13)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r10.f11261b = r2
            com.google.android.material.internal.NavigationMenuView r2 = r10.f11260a
            m8.i$c r3 = r10.f11264e
            r2.setAdapter(r3)
        L_0x0264:
            com.google.android.material.internal.NavigationMenuView r2 = r10.f11260a
            r0.addView(r2)
            r2 = 27
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x028c
            int r2 = r1.i(r2, r13)
            m8.i$c r3 = r10.f11264e
            if (r3 == 0) goto L_0x027c
            r4 = 1
            r3.B = r4
        L_0x027c:
            android.view.MenuInflater r3 = r16.getMenuInflater()
            r3.inflate(r2, r15)
            m8.i$c r2 = r10.f11264e
            if (r2 == 0) goto L_0x0289
            r2.B = r13
        L_0x0289:
            r10.d(r13)
        L_0x028c:
            r2 = 9
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x02ae
            int r2 = r1.i(r2, r13)
            android.view.LayoutInflater r3 = r10.B
            android.widget.LinearLayout r4 = r10.f11261b
            android.view.View r2 = r3.inflate(r2, r4, r13)
            android.widget.LinearLayout r3 = r10.f11261b
            r3.addView(r2)
            com.google.android.material.internal.NavigationMenuView r2 = r10.f11260a
            int r3 = r2.getPaddingBottom()
            r2.setPadding(r13, r13, r13, r3)
        L_0x02ae:
            r1.n()
            o8.h r1 = new o8.h
            r1.<init>(r0)
            r0.I = r1
            android.view.ViewTreeObserver r1 = r16.getViewTreeObserver()
            o8.h r2 = r0.I
            r1.addOnGlobalLayoutListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.H == null) {
            this.H = new f(getContext());
        }
        return this.H;
    }

    public final void a(j1 j1Var) {
        i iVar = this.E;
        iVar.getClass();
        int d10 = j1Var.d();
        if (iVar.U != d10) {
            iVar.U = d10;
            int i8 = (iVar.f11261b.getChildCount() != 0 || !iVar.S) ? 0 : iVar.U;
            NavigationMenuView navigationMenuView = iVar.f11260a;
            navigationMenuView.setPadding(0, i8, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = iVar.f11260a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, j1Var.a());
        i0.b(iVar.f11261b, j1Var);
    }

    public final ColorStateList b(int i8) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i8, typedValue, true)) {
            return null;
        }
        ColorStateList b10 = t1.a.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = b10.getDefaultColor();
        int[] iArr = Q;
        return new ColorStateList(new int[][]{iArr, P, FrameLayout.EMPTY_STATE_SET}, new int[]{b10.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    public final InsetDrawable c(h1 h1Var, ColorStateList colorStateList) {
        v8.f fVar = new v8.f(new v8.i(v8.i.a(getContext(), h1Var.i(17, 0), h1Var.i(18, 0), new v8.a((float) 0))));
        fVar.m(colorStateList);
        return new InsetDrawable(fVar, h1Var.d(22, 0), h1Var.d(23, 0), h1Var.d(21, 0), h1Var.d(20, 0));
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.N == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.N);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.E.f11264e.f11267e;
    }

    public int getDividerInsetEnd() {
        return this.E.O;
    }

    public int getDividerInsetStart() {
        return this.E.N;
    }

    public int getHeaderCount() {
        return this.E.f11261b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.E.H;
    }

    public int getItemHorizontalPadding() {
        return this.E.J;
    }

    public int getItemIconPadding() {
        return this.E.L;
    }

    public ColorStateList getItemIconTintList() {
        return this.E.G;
    }

    public int getItemMaxLines() {
        return this.E.T;
    }

    public ColorStateList getItemTextColor() {
        return this.E.F;
    }

    public int getItemVerticalPadding() {
        return this.E.K;
    }

    public Menu getMenu() {
        return this.D;
    }

    public int getSubheaderInsetEnd() {
        return this.E.Q;
    }

    public int getSubheaderInsetStart() {
        return this.E.P;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1.b.k(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.I);
    }

    public final void onMeasure(int i8, int i10) {
        int mode = View.MeasureSpec.getMode(i8);
        int i11 = this.F;
        if (mode == Integer.MIN_VALUE) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i8), i11), 1073741824);
        } else if (mode == 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i8, i10);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f10267a);
        this.D.t(bVar.f6012c);
    }

    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f6012c = bundle;
        this.D.v(bundle);
        return bVar;
    }

    public final void onSizeChanged(int i8, int i10, int i11, int i12) {
        int i13;
        super.onSizeChanged(i8, i10, i11, i12);
        boolean z10 = getParent() instanceof DrawerLayout;
        RectF rectF = this.O;
        if (!z10 || (i13 = this.M) <= 0 || !(getBackground() instanceof v8.f)) {
            this.N = null;
            rectF.setEmpty();
            return;
        }
        v8.f fVar = (v8.f) getBackground();
        v8.i iVar = fVar.f16250a.f16256a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (Gravity.getAbsoluteGravity(this.L, i0.e.d(this)) == 3) {
            float f10 = (float) i13;
            aVar.f(f10);
            aVar.d(f10);
        } else {
            float f11 = (float) i13;
            aVar.e(f11);
            aVar.c(f11);
        }
        fVar.setShapeAppearanceModel(new v8.i(aVar));
        if (this.N == null) {
            this.N = new Path();
        }
        this.N.reset();
        rectF.set(0.0f, 0.0f, (float) i8, (float) i10);
        j jVar = j.a.f16313a;
        f.b bVar = fVar.f16250a;
        jVar.a(bVar.f16256a, bVar.f16265j, rectF, (f.a) null, this.N);
        invalidate();
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.K = z10;
    }

    public void setCheckedItem(int i8) {
        MenuItem findItem = this.D.findItem(i8);
        if (findItem != null) {
            this.E.f11264e.q((androidx.appcompat.view.menu.h) findItem);
        }
    }

    public void setDividerInsetEnd(int i8) {
        m8.i iVar = this.E;
        iVar.O = i8;
        iVar.d(false);
    }

    public void setDividerInsetStart(int i8) {
        m8.i iVar = this.E;
        iVar.N = i8;
        iVar.d(false);
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        b1.b.i(this, f10);
    }

    public void setItemBackground(Drawable drawable) {
        m8.i iVar = this.E;
        iVar.H = drawable;
        iVar.d(false);
    }

    public void setItemBackgroundResource(int i8) {
        Context context = getContext();
        Object obj = t1.a.f15323a;
        setItemBackground(a.c.b(context, i8));
    }

    public void setItemHorizontalPadding(int i8) {
        m8.i iVar = this.E;
        iVar.J = i8;
        iVar.d(false);
    }

    public void setItemHorizontalPaddingResource(int i8) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i8);
        m8.i iVar = this.E;
        iVar.J = dimensionPixelSize;
        iVar.d(false);
    }

    public void setItemIconPadding(int i8) {
        m8.i iVar = this.E;
        iVar.L = i8;
        iVar.d(false);
    }

    public void setItemIconPaddingResource(int i8) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i8);
        m8.i iVar = this.E;
        iVar.L = dimensionPixelSize;
        iVar.d(false);
    }

    public void setItemIconSize(int i8) {
        m8.i iVar = this.E;
        if (iVar.M != i8) {
            iVar.M = i8;
            iVar.R = true;
            iVar.d(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        m8.i iVar = this.E;
        iVar.G = colorStateList;
        iVar.d(false);
    }

    public void setItemMaxLines(int i8) {
        m8.i iVar = this.E;
        iVar.T = i8;
        iVar.d(false);
    }

    public void setItemTextAppearance(int i8) {
        m8.i iVar = this.E;
        iVar.E = i8;
        iVar.d(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        m8.i iVar = this.E;
        iVar.F = colorStateList;
        iVar.d(false);
    }

    public void setItemVerticalPadding(int i8) {
        m8.i iVar = this.E;
        iVar.K = i8;
        iVar.d(false);
    }

    public void setItemVerticalPaddingResource(int i8) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i8);
        m8.i iVar = this.E;
        iVar.K = dimensionPixelSize;
        iVar.d(false);
    }

    public void setNavigationItemSelectedListener(a aVar) {
    }

    public void setOverScrollMode(int i8) {
        super.setOverScrollMode(i8);
        m8.i iVar = this.E;
        if (iVar != null) {
            iVar.W = i8;
            NavigationMenuView navigationMenuView = iVar.f11260a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i8);
            }
        }
    }

    public void setSubheaderInsetEnd(int i8) {
        m8.i iVar = this.E;
        iVar.Q = i8;
        iVar.d(false);
    }

    public void setSubheaderInsetStart(int i8) {
        m8.i iVar = this.E;
        iVar.P = i8;
        iVar.d(false);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.J = z10;
    }

    public static class b extends k2.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f6012c;

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
            this.f6012c = parcel.readBundle(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeBundle(this.f6012c);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.D.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.E.f11264e.q((androidx.appcompat.view.menu.h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
