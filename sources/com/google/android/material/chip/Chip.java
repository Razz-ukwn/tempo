package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.f;
import androidx.fragment.app.z;
import b2.k;
import com.google.android.material.chip.a;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import e2.i;
import e8.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import m8.p;
import r8.d;
import v7.g;
import v8.m;
import w1.a;

public class Chip extends f implements a.C0072a, m, Checkable {
    public static final Rect S = new Rect();
    public static final int[] T = {16842913};
    public static final int[] U = {16842911};
    public InsetDrawable B;
    public RippleDrawable C;
    public View.OnClickListener D;
    public CompoundButton.OnCheckedChangeListener E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public CharSequence M;
    public final b N;
    public boolean O;
    public final Rect P = new Rect();
    public final RectF Q = new RectF();
    public final a R = new a();

    /* renamed from: e  reason: collision with root package name */
    public a f5809e;

    public class a extends z {
        public a() {
        }

        public final void t(int i8) {
        }

        public final void y(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            a aVar = chip.f5809e;
            chip.setText(aVar.Z0 ? aVar.f5814a0 : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    public class b extends l2.a {
        public b(Chip chip) {
            super(chip);
        }

        public final void l(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Rect rect = Chip.S;
            Chip chip = Chip.this;
            if (chip.d()) {
                a aVar = chip.f5809e;
                if (aVar != null && aVar.f5822g0) {
                    z10 = true;
                }
                if (z10 && chip.D != null) {
                    arrayList.add(1);
                }
            }
        }

        public final void o(int i8, i iVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
            CharSequence charSequence = "";
            if (i8 == 1) {
                Chip chip = Chip.this;
                CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    iVar.m(closeIconContentDescription);
                } else {
                    CharSequence text = chip.getText();
                    Context context = chip.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    iVar.m(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
                iVar.b(i.a.f7784g);
                accessibilityNodeInfo.setEnabled(chip.isEnabled());
                return;
            }
            iVar.m(charSequence);
            accessibilityNodeInfo.setBoundsInParent(Chip.S);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r1 = 2132018203(0x7f14041b, float:1.9674706E38)
            r2 = 2130903334(0x7f030126, float:1.7413483E38)
            r3 = r18
            android.content.Context r1 = c9.a.a(r3, r7, r2, r1)
            r0.<init>(r1, r7, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.P = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.Q = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.R = r1
            android.content.Context r8 = r17.getContext()
            r9 = 8388627(0x800013, float:1.175497E-38)
            r10 = 1
            if (r7 != 0) goto L_0x0033
            goto L_0x0093
        L_0x0033:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0044:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03b1
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03a9
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x03a3
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x039d
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r10)
            if (r2 == 0) goto L_0x0395
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x0395
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x0395
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x0395
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r9)
            if (r1 == r9) goto L_0x0093
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0093:
            com.google.android.material.chip.a r11 = new com.google.android.material.chip.a
            r11.<init>(r8, r7)
            android.content.Context r1 = r11.A0
            int[] r12 = ag.n2.H
            r13 = 0
            int[] r6 = new int[r13]
            r5 = 2132018203(0x7f14041b, float:1.9674706E38)
            r4 = 2130903334(0x7f030126, float:1.7413483E38)
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = m8.s.d(r1, r2, r3, r4, r5, r6)
            r14 = 37
            boolean r2 = r1.hasValue(r14)
            r11.f5817b1 = r2
            r2 = 24
            android.content.Context r3 = r11.A0
            android.content.res.ColorStateList r2 = r8.c.a(r3, r1, r2)
            android.content.res.ColorStateList r4 = r11.T
            if (r4 == r2) goto L_0x00c9
            r11.T = r2
            int[] r2 = r11.getState()
            r11.onStateChange(r2)
        L_0x00c9:
            r2 = 11
            android.content.res.ColorStateList r2 = r8.c.a(r3, r1, r2)
            android.content.res.ColorStateList r4 = r11.U
            if (r4 == r2) goto L_0x00dc
            r11.U = r2
            int[] r2 = r11.getState()
            r11.onStateChange(r2)
        L_0x00dc:
            r2 = 19
            r4 = 0
            float r2 = r1.getDimension(r2, r4)
            float r5 = r11.V
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00f1
            r11.V = r2
            r11.invalidateSelf()
            r11.z()
        L_0x00f1:
            r2 = 12
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0100
            float r2 = r1.getDimension(r2, r4)
            r11.F(r2)
        L_0x0100:
            r2 = 22
            android.content.res.ColorStateList r2 = r8.c.a(r3, r1, r2)
            r11.K(r2)
            r2 = 23
            float r2 = r1.getDimension(r2, r4)
            r11.L(r2)
            r2 = 36
            android.content.res.ColorStateList r2 = r8.c.a(r3, r1, r2)
            r11.U(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x0124
            java.lang.String r2 = ""
        L_0x0124:
            java.lang.CharSequence r5 = r11.f5814a0
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            m8.p r6 = r11.G0
            if (r5 != 0) goto L_0x0138
            r11.f5814a0 = r2
            r6.f11301d = r10
            r11.invalidateSelf()
            r11.z()
        L_0x0138:
            boolean r2 = r1.hasValue(r13)
            r5 = 0
            if (r2 == 0) goto L_0x014b
            int r2 = r1.getResourceId(r13, r13)
            if (r2 == 0) goto L_0x014b
            r8.d r15 = new r8.d
            r15.<init>(r3, r2)
            goto L_0x014c
        L_0x014b:
            r15 = r5
        L_0x014c:
            float r2 = r15.f14101k
            float r2 = r1.getDimension(r10, r2)
            r15.f14101k = r2
            r6.b(r15, r3)
            r2 = 3
            int r6 = r1.getInt(r2, r13)
            if (r6 == r10) goto L_0x016e
            r15 = 2
            if (r6 == r15) goto L_0x0169
            if (r6 == r2) goto L_0x0164
            goto L_0x0172
        L_0x0164:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r11.Y0 = r2
            goto L_0x0172
        L_0x0169:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            r11.Y0 = r2
            goto L_0x0172
        L_0x016e:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            r11.Y0 = r2
        L_0x0172:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r13)
            r11.J(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0198
            java.lang.String r6 = "chipIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 == 0) goto L_0x0198
            java.lang.String r6 = "chipIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 != 0) goto L_0x0198
            r6 = 15
            boolean r6 = r1.getBoolean(r6, r13)
            r11.J(r6)
        L_0x0198:
            r6 = 14
            android.graphics.drawable.Drawable r6 = r8.c.d(r3, r1, r6)
            r11.G(r6)
            r6 = 17
            boolean r15 = r1.hasValue(r6)
            if (r15 == 0) goto L_0x01b0
            android.content.res.ColorStateList r6 = r8.c.a(r3, r1, r6)
            r11.I(r6)
        L_0x01b0:
            r6 = 16
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r1.getDimension(r6, r15)
            r11.H(r6)
            r6 = 31
            boolean r6 = r1.getBoolean(r6, r13)
            r11.R(r6)
            if (r7 == 0) goto L_0x01df
            java.lang.String r6 = "closeIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 == 0) goto L_0x01df
            java.lang.String r6 = "closeIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 != 0) goto L_0x01df
            r6 = 26
            boolean r6 = r1.getBoolean(r6, r13)
            r11.R(r6)
        L_0x01df:
            r6 = 25
            android.graphics.drawable.Drawable r6 = r8.c.d(r3, r1, r6)
            r11.M(r6)
            r6 = 30
            android.content.res.ColorStateList r6 = r8.c.a(r3, r1, r6)
            r11.Q(r6)
            r6 = 28
            float r6 = r1.getDimension(r6, r4)
            r11.O(r6)
            r6 = 6
            boolean r6 = r1.getBoolean(r6, r13)
            r11.B(r6)
            r6 = 10
            boolean r6 = r1.getBoolean(r6, r13)
            r11.E(r6)
            if (r7 == 0) goto L_0x0226
            java.lang.String r6 = "checkedIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r2, r6)
            if (r6 == 0) goto L_0x0226
            java.lang.String r6 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r6)
            if (r2 != 0) goto L_0x0226
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r13)
            r11.E(r2)
        L_0x0226:
            r2 = 7
            android.graphics.drawable.Drawable r2 = r8.c.d(r3, r1, r2)
            r11.C(r2)
            r2 = 9
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x023d
            android.content.res.ColorStateList r2 = r8.c.a(r3, r1, r2)
            r11.D(r2)
        L_0x023d:
            r2 = 39
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x0250
            int r2 = r1.getResourceId(r2, r13)
            if (r2 == 0) goto L_0x0250
            v7.g r2 = v7.g.a(r3, r2)
            goto L_0x0251
        L_0x0250:
            r2 = r5
        L_0x0251:
            r11.f5832q0 = r2
            r2 = 33
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x0265
            int r2 = r1.getResourceId(r2, r13)
            if (r2 == 0) goto L_0x0265
            v7.g r5 = v7.g.a(r3, r2)
        L_0x0265:
            r11.f5833r0 = r5
            r2 = 21
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f5834s0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x027b
            r11.f5834s0 = r2
            r11.invalidateSelf()
            r11.z()
        L_0x027b:
            r2 = 35
            float r2 = r1.getDimension(r2, r4)
            r11.T(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r4)
            r11.S(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f5837v0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02a1
            r11.f5837v0 = r2
            r11.invalidateSelf()
            r11.z()
        L_0x02a1:
            r2 = 40
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f5838w0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02b5
            r11.f5838w0 = r2
            r11.invalidateSelf()
            r11.z()
        L_0x02b5:
            r2 = 29
            float r2 = r1.getDimension(r2, r4)
            r11.P(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r4)
            r11.N(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r4)
            float r3 = r11.f5841z0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02db
            r11.f5841z0 = r2
            r11.invalidateSelf()
            r11.z()
        L_0x02db:
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r11.f5815a1 = r2
            r1.recycle()
            r15 = 2132018203(0x7f14041b, float:1.9674706E38)
            int[] r6 = new int[r13]
            r16 = 2130903334(0x7f030126, float:1.7413483E38)
            r4 = 2130903334(0x7f030126, float:1.7413483E38)
            r5 = 2132018203(0x7f14041b, float:1.9674706E38)
            r1 = r8
            r2 = r19
            r3 = r12
            android.content.res.TypedArray r1 = m8.s.d(r1, r2, r3, r4, r5, r6)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r13)
            r0.J = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = m8.v.b(r2, r3)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.L = r2
            r1.recycle()
            r0.setChipDrawable(r11)
            float r1 = d2.i0.i.i(r17)
            r11.l(r1)
            int[] r6 = new int[r13]
            r1 = r8
            r2 = r19
            r3 = r12
            r4 = r16
            r5 = r15
            android.content.res.TypedArray r1 = m8.s.d(r1, r2, r3, r4, r5, r6)
            boolean r2 = r1.hasValue(r14)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.N = r1
            r17.e()
            if (r2 != 0) goto L_0x0359
            e8.b r1 = new e8.b
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x0359:
            boolean r1 = r0.F
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r11.f5814a0
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r11.Y0
            r0.setEllipsize(r1)
            r17.h()
            com.google.android.material.chip.a r1 = r0.f5809e
            boolean r1 = r1.Z0
            if (r1 != 0) goto L_0x0377
            r0.setLines(r10)
            r0.setHorizontallyScrolling(r10)
        L_0x0377:
            r0.setGravity(r9)
            r17.g()
            boolean r1 = r0.J
            if (r1 == 0) goto L_0x0386
            int r1 = r0.L
            r0.setMinHeight(r1)
        L_0x0386:
            int r1 = d2.i0.e.d(r17)
            r0.K = r1
            e8.a r1 = new e8.a
            r1.<init>(r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x0395:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x039d:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03a3:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03a9:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03b1:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.Q;
        rectF.setEmpty();
        if (d() && this.D != null) {
            a aVar = this.f5809e;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.X()) {
                float f10 = aVar.f5841z0 + aVar.f5840y0 + aVar.f5826k0 + aVar.f5839x0 + aVar.f5838w0;
                if (a.c.a(aVar) == 0) {
                    float f11 = (float) bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = (float) bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.P;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private d getTextAppearance() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.G0.f11303f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            refreshDrawableState();
        }
    }

    public final void a() {
        c(this.L);
        requestLayout();
        invalidateOutline();
    }

    public final void c(int i8) {
        this.L = i8;
        int i10 = 0;
        if (!this.J) {
            InsetDrawable insetDrawable = this.B;
            if (insetDrawable == null) {
                int[] iArr = s8.a.f14809a;
                f();
            } else if (insetDrawable != null) {
                this.B = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr2 = s8.a.f14809a;
                f();
            }
        } else {
            int max = Math.max(0, i8 - ((int) this.f5809e.V));
            int max2 = Math.max(0, i8 - this.f5809e.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                int i11 = max2 > 0 ? max2 / 2 : 0;
                if (max > 0) {
                    i10 = max / 2;
                }
                int i12 = i10;
                if (this.B != null) {
                    Rect rect = new Rect();
                    this.B.getPadding(rect);
                    if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                        int[] iArr3 = s8.a.f14809a;
                        f();
                        return;
                    }
                }
                if (getMinHeight() != i8) {
                    setMinHeight(i8);
                }
                if (getMinWidth() != i8) {
                    setMinWidth(i8);
                }
                this.B = new InsetDrawable(this.f5809e, i11, i12, i11, i12);
                int[] iArr4 = s8.a.f14809a;
                f();
                return;
            }
            InsetDrawable insetDrawable2 = this.B;
            if (insetDrawable2 == null) {
                int[] iArr5 = s8.a.f14809a;
                f();
            } else if (insetDrawable2 != null) {
                this.B = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr6 = s8.a.f14809a;
                f();
            }
        }
    }

    public final boolean d() {
        a aVar = this.f5809e;
        if (aVar != null) {
            Drawable drawable = aVar.f5823h0;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof w1.b) {
                drawable = ((w1.b) drawable).b();
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.O
            if (r0 != 0) goto L_0x0009
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L_0x0009:
            com.google.android.material.chip.Chip$b r0 = r10.N
            android.view.accessibility.AccessibilityManager r1 = r0.f10933h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0070
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x001c
            goto L_0x0070
        L_0x001c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.794E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L_0x0042
            r6 = 9
            if (r1 == r6) goto L_0x0042
            r6 = 10
            if (r1 == r6) goto L_0x0032
            goto L_0x0070
        L_0x0032:
            int r1 = r0.m
            if (r1 == r7) goto L_0x0070
            if (r1 != r7) goto L_0x0039
            goto L_0x006e
        L_0x0039:
            r0.m = r7
            r0.q(r7, r5)
            r0.q(r1, r2)
            goto L_0x006e
        L_0x0042:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r9 = r8.d()
            if (r9 == 0) goto L_0x005e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L_0x005e
            r1 = r3
            goto L_0x005f
        L_0x005e:
            r1 = r4
        L_0x005f:
            int r6 = r0.m
            if (r6 != r1) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            r0.m = r1
            r0.q(r1, r5)
            r0.q(r6, r2)
        L_0x006c:
            if (r1 == r7) goto L_0x0070
        L_0x006e:
            r0 = r3
            goto L_0x0071
        L_0x0070:
            r0 = r4
        L_0x0071:
            if (r0 != 0) goto L_0x007b
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r4
        L_0x007b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.O) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.N;
        bVar.getClass();
        int i8 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i10 = 33;
                                } else if (keyCode == 21) {
                                    i10 = 17;
                                } else if (keyCode != 22) {
                                    i10 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i11 = 0;
                                while (i8 < repeatCount && bVar.m(i10, (Rect) null)) {
                                    i8++;
                                    i11 = 1;
                                }
                                i8 = i11;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = bVar.f10937l;
                    if (i12 != Integer.MIN_VALUE) {
                        Chip chip = Chip.this;
                        if (i12 == 0) {
                            chip.performClick();
                        } else if (i12 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.D;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.O) {
                                chip.N.q(1, 1);
                            }
                        }
                    }
                    i8 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i8 = bVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i8 = bVar.m(1, (Rect) null);
            }
        }
        if (i8 == 0 || bVar.f10937l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i8;
        super.drawableStateChanged();
        a aVar = this.f5809e;
        boolean z10 = false;
        if (aVar != null && a.y(aVar.f5823h0)) {
            a aVar2 = this.f5809e;
            int isEnabled = isEnabled();
            if (this.I) {
                isEnabled++;
            }
            if (this.H) {
                isEnabled++;
            }
            if (this.G) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (this.I) {
                iArr[i8] = 16842908;
                i8++;
            }
            if (this.H) {
                iArr[i8] = 16843623;
                i8++;
            }
            if (this.G) {
                iArr[i8] = 16842919;
                i8++;
            }
            if (isChecked()) {
                iArr[i8] = 16842913;
            }
            if (!Arrays.equals(aVar2.U0, iArr)) {
                aVar2.U0 = iArr;
                if (aVar2.X()) {
                    z10 = aVar2.A(aVar2.getState(), iArr);
                }
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        if (d()) {
            a aVar = this.f5809e;
            if ((aVar != null && aVar.f5822g0) && this.D != null) {
                i0.n(this, this.N);
                this.O = true;
                return;
            }
        }
        i0.n(this, (d2.a) null);
        this.O = false;
    }

    public final void f() {
        this.C = new RippleDrawable(s8.a.c(this.f5809e.Z), getBackgroundDrawable(), (Drawable) null);
        a aVar = this.f5809e;
        if (aVar.V0) {
            aVar.V0 = false;
            aVar.W0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.C;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.q(this, rippleDrawable);
        g();
    }

    public final void g() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f5809e) != null) {
            int v3 = (int) (aVar.v() + aVar.f5841z0 + aVar.f5838w0);
            a aVar2 = this.f5809e;
            int u7 = (int) (aVar2.u() + aVar2.f5834s0 + aVar2.f5837v0);
            if (this.B != null) {
                Rect rect = new Rect();
                this.B.getPadding(rect);
                u7 += rect.left;
                v3 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.e.k(this, u7, paddingTop, v3, paddingBottom);
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.M)) {
            return this.M;
        }
        a aVar = this.f5809e;
        if (!(aVar != null && aVar.f5828m0)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof c)) {
            return "android.widget.Button";
        }
        ((c) parent).getClass();
        throw null;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.B;
        return insetDrawable == null ? this.f5809e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5830o0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5831p0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.U;
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.w());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f5809e;
    }

    public float getChipEndPadding() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5841z0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        a aVar = this.f5809e;
        if (aVar == null || (drawable = aVar.f5818c0) == null) {
            return null;
        }
        if (drawable instanceof w1.b) {
            drawable = ((w1.b) drawable).b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5820e0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5819d0;
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.V;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5834s0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.X;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.Y;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        a aVar = this.f5809e;
        if (aVar == null || (drawable = aVar.f5823h0) == null) {
            return null;
        }
        if (drawable instanceof w1.b) {
            drawable = ((w1.b) drawable).b();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5827l0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5840y0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5826k0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5839x0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5825j0;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.Y0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.O) {
            b bVar = this.N;
            if (bVar.f10937l == 1 || bVar.f10936k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5833r0;
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5836u0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5835t0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.Z;
        }
        return null;
    }

    public v8.i getShapeAppearanceModel() {
        return this.f5809e.f16250a.f16256a;
    }

    public g getShowMotionSpec() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5832q0;
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5838w0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f5809e;
        if (aVar != null) {
            return aVar.f5837v0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        a aVar = this.f5809e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.R);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1.b.l(this, this.f5809e);
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        a aVar = this.f5809e;
        if (aVar != null && aVar.f5828m0) {
            View.mergeDrawableStates(onCreateDrawableState, U);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z10, int i8, Rect rect) {
        super.onFocusChanged(z10, i8, rect);
        if (this.O) {
            b bVar = this.N;
            int i10 = bVar.f10937l;
            if (i10 != Integer.MIN_VALUE) {
                bVar.j(i10);
            }
            if (z10) {
                bVar.m(i8, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i8;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        a aVar = this.f5809e;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.f5828m0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof c) {
            c cVar = (c) getParent();
            int i10 = -1;
            if (cVar.f11258c) {
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= cVar.getChildCount()) {
                        i12 = -1;
                        break;
                    }
                    View childAt = cVar.getChildAt(i11);
                    if (childAt instanceof Chip) {
                        if (!(cVar.getChildAt(i11).getVisibility() == 0)) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    i11++;
                }
                i8 = i12;
            } else {
                i8 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i10 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) i.d.a(i10, 1, i8, 1, false, isChecked()).f7798a);
        }
    }

    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i8) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        if (this.K != i8) {
            this.K = i8;
            g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0049
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0044
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.G
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x004e
            r5.setCloseIconPressed(r3)
            goto L_0x004e
        L_0x002b:
            boolean r0 = r5.G
            if (r0 == 0) goto L_0x0044
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.D
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            boolean r0 = r5.O
            if (r0 == 0) goto L_0x0042
            com.google.android.material.chip.Chip$b r0 = r5.N
            r0.q(r2, r2)
        L_0x0042:
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            r5.setCloseIconPressed(r3)
            goto L_0x0051
        L_0x0049:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r2)
        L_0x004e:
            r0 = r2
            goto L_0x0051
        L_0x0050:
            r0 = r3
        L_0x0051:
            if (r0 != 0) goto L_0x005b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r2 = r3
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.M = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.C) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i8) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.C) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i8) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.B(z10);
        }
    }

    public void setCheckableResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.B(aVar.A0.getResources().getBoolean(i8));
        }
    }

    public void setChecked(boolean z10) {
        a aVar = this.f5809e;
        if (aVar == null) {
            this.F = z10;
        } else if (aVar.f5828m0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.C(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i8) {
        setCheckedIconVisible(i8);
    }

    public void setCheckedIconResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.C(f.a.a(aVar.A0, i8));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.D(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.D(t1.a.b(aVar.A0, i8));
        }
    }

    public void setCheckedIconVisible(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.E(aVar.A0.getResources().getBoolean(i8));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f5809e;
        if (aVar != null && aVar.U != colorStateList) {
            aVar.U = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i8) {
        ColorStateList b10;
        a aVar = this.f5809e;
        if (aVar != null && aVar.U != (b10 = t1.a.b(aVar.A0, i8))) {
            aVar.U = b10;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.F(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.F(aVar.A0.getResources().getDimension(i8));
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f5809e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.X0 = new WeakReference<>((Object) null);
            }
            this.f5809e = aVar;
            aVar.Z0 = false;
            aVar.X0 = new WeakReference<>(this);
            c(this.L);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f5809e;
        if (aVar != null && aVar.f5841z0 != f10) {
            aVar.f5841z0 = f10;
            aVar.invalidateSelf();
            aVar.z();
        }
    }

    public void setChipEndPaddingResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            float dimension = aVar.A0.getResources().getDimension(i8);
            if (aVar.f5841z0 != dimension) {
                aVar.f5841z0 = dimension;
                aVar.invalidateSelf();
                aVar.z();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.G(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i8) {
        setChipIconVisible(i8);
    }

    public void setChipIconResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.G(f.a.a(aVar.A0, i8));
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.H(f10);
        }
    }

    public void setChipIconSizeResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.H(aVar.A0.getResources().getDimension(i8));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.I(colorStateList);
        }
    }

    public void setChipIconTintResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.I(t1.a.b(aVar.A0, i8));
        }
    }

    public void setChipIconVisible(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.J(aVar.A0.getResources().getBoolean(i8));
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f5809e;
        if (aVar != null && aVar.V != f10) {
            aVar.V = f10;
            aVar.invalidateSelf();
            aVar.z();
        }
    }

    public void setChipMinHeightResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            float dimension = aVar.A0.getResources().getDimension(i8);
            if (aVar.V != dimension) {
                aVar.V = dimension;
                aVar.invalidateSelf();
                aVar.z();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f5809e;
        if (aVar != null && aVar.f5834s0 != f10) {
            aVar.f5834s0 = f10;
            aVar.invalidateSelf();
            aVar.z();
        }
    }

    public void setChipStartPaddingResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            float dimension = aVar.A0.getResources().getDimension(i8);
            if (aVar.f5834s0 != dimension) {
                aVar.f5834s0 = dimension;
                aVar.invalidateSelf();
                aVar.z();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.K(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.K(t1.a.b(aVar.A0, i8));
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.L(f10);
        }
    }

    public void setChipStrokeWidthResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.L(aVar.A0.getResources().getDimension(i8));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i8) {
        setText(getResources().getString(i8));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.M(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f5809e;
        if (aVar != null && aVar.f5827l0 != charSequence) {
            String str = b2.a.f3000d;
            Locale locale = Locale.getDefault();
            int i8 = k.f3023a;
            boolean z10 = true;
            if (k.a.a(locale) != 1) {
                z10 = false;
            }
            b2.a aVar2 = z10 ? b2.a.f3003g : b2.a.f3002f;
            aVar.f5827l0 = aVar2.c(charSequence, aVar2.f3006c);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i8) {
        setCloseIconVisible(i8);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.N(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.N(aVar.A0.getResources().getDimension(i8));
        }
    }

    public void setCloseIconResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.M(f.a.a(aVar.A0, i8));
        }
        e();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.O(f10);
        }
    }

    public void setCloseIconSizeResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.O(aVar.A0.getResources().getDimension(i8));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.P(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.P(aVar.A0.getResources().getDimension(i8));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.Q(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.Q(t1.a.b(aVar.A0, i8));
        }
    }

    public void setCloseIconVisible(int i8) {
        setCloseIconVisible(getResources().getBoolean(i8));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i10, int i11, int i12) {
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i11 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i8, i10, i11, i12);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i8, int i10, int i11, int i12) {
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i11 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i8, i10, i11, i12);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.l(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5809e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f5809e;
                if (aVar != null) {
                    aVar.Y0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.J = z10;
        c(this.L);
    }

    public void setGravity(int i8) {
        if (i8 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i8);
        }
    }

    public void setHideMotionSpec(g gVar) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.f5833r0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.f5833r0 = g.a(aVar.A0, i8);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setIconEndPaddingResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.S(aVar.A0.getResources().getDimension(i8));
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.T(f10);
        }
    }

    public void setIconStartPaddingResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.T(aVar.A0.getResources().getDimension(i8));
        }
    }

    public void setInternalOnCheckedChangeListener(m8.g<Chip> gVar) {
    }

    public void setLayoutDirection(int i8) {
        if (this.f5809e != null) {
            super.setLayoutDirection(i8);
        }
    }

    public void setLines(int i8) {
        if (i8 <= 1) {
            super.setLines(i8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i8) {
        if (i8 <= 1) {
            super.setMaxLines(i8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i8) {
        super.setMaxWidth(i8);
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.f5815a1 = i8;
        }
    }

    public void setMinLines(int i8) {
        if (i8 <= 1) {
            super.setMinLines(i8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.E = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.D = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.U(colorStateList);
        }
        if (!this.f5809e.V0) {
            f();
        }
    }

    public void setRippleColorResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.U(t1.a.b(aVar.A0, i8));
            if (!this.f5809e.V0) {
                f();
            }
        }
    }

    public void setShapeAppearanceModel(v8.i iVar) {
        this.f5809e.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.f5832q0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.f5832q0 = g.a(aVar.A0, i8);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f5809e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.Z0 ? null : charSequence, bufferType);
            a aVar2 = this.f5809e;
            if (aVar2 != null && !TextUtils.equals(aVar2.f5814a0, charSequence)) {
                aVar2.f5814a0 = charSequence;
                aVar2.G0.f11301d = true;
                aVar2.invalidateSelf();
                aVar2.z();
            }
        }
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.G0.b(dVar, aVar.A0);
        }
        h();
    }

    public void setTextAppearanceResource(int i8) {
        setTextAppearance(getContext(), i8);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f5809e;
        if (aVar != null && aVar.f5838w0 != f10) {
            aVar.f5838w0 = f10;
            aVar.invalidateSelf();
            aVar.z();
        }
    }

    public void setTextEndPaddingResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            float dimension = aVar.A0.getResources().getDimension(i8);
            if (aVar.f5838w0 != dimension) {
                aVar.f5838w0 = dimension;
                aVar.invalidateSelf();
                aVar.z();
            }
        }
    }

    public final void setTextSize(int i8, float f10) {
        super.setTextSize(i8, f10);
        a aVar = this.f5809e;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i8, f10, getResources().getDisplayMetrics());
            p pVar = aVar.G0;
            d dVar = pVar.f11303f;
            if (dVar != null) {
                dVar.f14101k = applyDimension;
                pVar.f11298a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f5809e;
        if (aVar != null && aVar.f5837v0 != f10) {
            aVar.f5837v0 = f10;
            aVar.invalidateSelf();
            aVar.z();
        }
    }

    public void setTextStartPaddingResource(int i8) {
        a aVar = this.f5809e;
        if (aVar != null) {
            float dimension = aVar.A0.getResources().getDimension(i8);
            if (aVar.f5837v0 != dimension) {
                aVar.f5837v0 = dimension;
                aVar.invalidateSelf();
                aVar.z();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.R(z10);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.E(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f5809e;
        if (aVar != null) {
            aVar.J(z10);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        a aVar = this.f5809e;
        if (aVar != null) {
            Context context2 = aVar.A0;
            aVar.G0.b(new d(context2, i8), context2);
        }
        h();
    }

    public void setTextAppearance(int i8) {
        super.setTextAppearance(i8);
        a aVar = this.f5809e;
        if (aVar != null) {
            Context context = aVar.A0;
            aVar.G0.b(new d(context, i8), context);
        }
        h();
    }
}
