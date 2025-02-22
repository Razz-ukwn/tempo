package com.google.android.material.textfield;

import a9.g;
import a9.q;
import a9.r;
import a9.t;
import a9.x;
import ag.v1;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.j0;
import b2.k;
import com.google.android.material.internal.CheckableImageButton;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.p;
import j0.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m8.v;
import t1.a;
import v8.f;
import v8.i;

public class TextInputLayout extends LinearLayout {
    public static final int[][] U0 = {new int[]{16842919}, new int[0]};
    public int A0;
    public int B = -1;
    public Drawable B0;
    public int C = -1;
    public ColorStateList C0;
    public int D = -1;
    public ColorStateList D0;
    public int E = -1;
    public int E0;
    public final q F = new q(this);
    public int F0;
    public boolean G;
    public int G0;
    public int H;
    public ColorStateList H0;
    public boolean I;
    public int I0;
    public f J = new o(3);
    public int J0;
    public d0 K;
    public int K0;
    public int L;
    public int L0;
    public int M;
    public int M0;
    public CharSequence N;
    public boolean N0;
    public boolean O;
    public final m8.c O0;
    public d0 P;
    public boolean P0;
    public ColorStateList Q;
    public boolean Q0;
    public int R;
    public ValueAnimator R0;
    public r3.d S;
    public boolean S0;
    public r3.d T;
    public boolean T0;
    public ColorStateList U;
    public ColorStateList V;
    public boolean W;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f6171a;

    /* renamed from: a0  reason: collision with root package name */
    public CharSequence f6172a0;

    /* renamed from: b  reason: collision with root package name */
    public final x f6173b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6174b0;

    /* renamed from: c  reason: collision with root package name */
    public final a f6175c;

    /* renamed from: c0  reason: collision with root package name */
    public v8.f f6176c0;

    /* renamed from: d  reason: collision with root package name */
    public EditText f6177d;

    /* renamed from: d0  reason: collision with root package name */
    public v8.f f6178d0;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f6179e;

    /* renamed from: e0  reason: collision with root package name */
    public StateListDrawable f6180e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f6181f0;

    /* renamed from: g0  reason: collision with root package name */
    public v8.f f6182g0;

    /* renamed from: h0  reason: collision with root package name */
    public v8.f f6183h0;

    /* renamed from: i0  reason: collision with root package name */
    public v8.i f6184i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f6185j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f6186k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f6187l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f6188m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f6189n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f6190o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f6191p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f6192q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f6193r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Rect f6194s0 = new Rect();

    /* renamed from: t0  reason: collision with root package name */
    public final Rect f6195t0 = new Rect();

    /* renamed from: u0  reason: collision with root package name */
    public final RectF f6196u0 = new RectF();

    /* renamed from: v0  reason: collision with root package name */
    public Typeface f6197v0;

    /* renamed from: w0  reason: collision with root package name */
    public ColorDrawable f6198w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f6199x0;

    /* renamed from: y0  reason: collision with root package name */
    public final LinkedHashSet<g> f6200y0 = new LinkedHashSet<>();

    /* renamed from: z0  reason: collision with root package name */
    public ColorDrawable f6201z0;

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.t(!textInputLayout.T0, false);
            if (textInputLayout.G) {
                textInputLayout.n(editable);
            }
            if (textInputLayout.O) {
                textInputLayout.u(editable);
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        }

        public final void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f6175c.C;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            TextInputLayout.this.f6177d.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.O0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends d2.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f6206d;

        public e(TextInputLayout textInputLayout) {
            this.f6206d = textInputLayout;
        }

        public final void d(View view, e2.i iVar) {
            e2.i iVar2 = iVar;
            View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
            AccessibilityNodeInfo accessibilityNodeInfo = iVar2.f7779a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f6206d;
            EditText editText = textInputLayout.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !textInputLayout.N0;
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z11 ? hint.toString() : "";
            x xVar = textInputLayout.f6173b;
            d0 d0Var = xVar.f210b;
            if (d0Var.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(d0Var);
                accessibilityNodeInfo.setTraversalAfter(d0Var);
            } else {
                accessibilityNodeInfo.setTraversalAfter(xVar.f212d);
            }
            if (z10) {
                iVar2.q(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                iVar2.q(charSequence);
                if (z12 && placeholderText != null) {
                    iVar2.q(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                iVar2.q(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                accessibilityNodeInfo.setHintText(charSequence);
                accessibilityNodeInfo.setShowingHintText(true ^ z10);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            d0 d0Var2 = textInputLayout.F.f191y;
            if (d0Var2 != null) {
                accessibilityNodeInfo.setLabelFor(d0Var2);
            }
            textInputLayout.f6175c.b().n(iVar2);
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f6206d.f6175c.b().o(accessibilityEvent);
        }
    }

    public interface f {
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    public interface h {
        void a();
    }

    public static class i extends k2.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f6207c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6208d;

        public class a implements Parcelable.ClassLoaderCreator<i> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new i[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f6207c + "}";
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            TextUtils.writeToParcel(this.f6207c, parcel, i8);
            parcel.writeInt(this.f6208d ? 1 : 0);
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6207c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6208d = parcel.readInt() != 1 ? false : true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r20
            r8 = 2130904300(0x7f0304ec, float:1.7415442E38)
            r9 = 2132018008(0x7f140358, float:1.967431E38)
            r1 = r19
            android.content.Context r1 = c9.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.B = r10
            r0.C = r10
            r0.D = r10
            r0.E = r10
            a9.q r1 = new a9.q
            r1.<init>(r0)
            r0.F = r1
            j0.o r1 = new j0.o
            r11 = 3
            r1.<init>(r11)
            r0.J = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6194s0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6195t0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f6196u0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f6200y0 = r1
            m8.c r1 = new m8.c
            r1.<init>(r0)
            r0.O0 = r1
            android.content.Context r12 = r18.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r14 = 0
            r0.setWillNotDraw(r14)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r12)
            r0.f6171a = r15
            r15.setAddStatesFromChildren(r13)
            android.view.animation.LinearInterpolator r2 = v7.a.f16228a
            r1.Q = r2
            r1.h(r14)
            r1.P = r2
            r1.h(r14)
            int r2 = r1.f11235g
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r2 == r3) goto L_0x007f
            r1.f11235g = r3
            r1.h(r14)
        L_0x007f:
            int[] r3 = ag.n2.f465m0
            r5 = 2132018008(0x7f140358, float:1.967431E38)
            r6 = 5
            int[] r4 = new int[r6]
            r4 = {22, 20, 38, 43, 47} // fill-array
            r16 = 2130904300(0x7f0304ec, float:1.7415442E38)
            r1 = r12
            r2 = r20
            r17 = r4
            r4 = r16
            r14 = r6
            r6 = r17
            androidx.appcompat.widget.h1 r1 = m8.s.e(r1, r2, r3, r4, r5, r6)
            a9.x r2 = new a9.x
            r2.<init>(r0, r1)
            r0.f6173b = r2
            r3 = 46
            boolean r3 = r1.a(r3, r13)
            r0.W = r3
            r3 = 4
            java.lang.CharSequence r3 = r1.k(r3)
            r0.setHint((java.lang.CharSequence) r3)
            r3 = 45
            boolean r3 = r1.a(r3, r13)
            r0.Q0 = r3
            r3 = 40
            boolean r3 = r1.a(r3, r13)
            r0.P0 = r3
            r3 = 6
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x00d1
            int r3 = r1.h(r3, r10)
            r0.setMinEms(r3)
            goto L_0x00de
        L_0x00d1:
            boolean r3 = r1.l(r11)
            if (r3 == 0) goto L_0x00de
            int r3 = r1.d(r11, r10)
            r0.setMinWidth(r3)
        L_0x00de:
            boolean r3 = r1.l(r14)
            r4 = 2
            if (r3 == 0) goto L_0x00ed
            int r3 = r1.h(r14, r10)
            r0.setMaxEms(r3)
            goto L_0x00fa
        L_0x00ed:
            boolean r3 = r1.l(r4)
            if (r3 == 0) goto L_0x00fa
            int r3 = r1.d(r4, r10)
            r0.setMaxWidth(r3)
        L_0x00fa:
            v8.i$a r3 = v8.i.b(r12, r7, r8, r9)
            v8.i r5 = new v8.i
            r5.<init>(r3)
            r0.f6184i0 = r5
            android.content.res.Resources r3 = r12.getResources()
            r5 = 2131100335(0x7f0602af, float:1.7813049E38)
            int r3 = r3.getDimensionPixelOffset(r5)
            r0.f6186k0 = r3
            r3 = 9
            r5 = 0
            int r3 = r1.c(r3, r5)
            r0.f6188m0 = r3
            android.content.res.Resources r3 = r12.getResources()
            r5 = 2131100336(0x7f0602b0, float:1.781305E38)
            int r3 = r3.getDimensionPixelSize(r5)
            r5 = 16
            int r3 = r1.d(r5, r3)
            r0.f6190o0 = r3
            android.content.res.Resources r3 = r12.getResources()
            r5 = 2131100337(0x7f0602b1, float:1.7813053E38)
            int r3 = r3.getDimensionPixelSize(r5)
            r5 = 17
            int r3 = r1.d(r5, r3)
            r0.f6191p0 = r3
            int r3 = r0.f6190o0
            r0.f6189n0 = r3
            android.content.res.TypedArray r3 = r1.f1015b
            r5 = 13
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r3.getDimension(r5, r6)
            r7 = 12
            float r7 = r3.getDimension(r7, r6)
            r8 = 10
            float r8 = r3.getDimension(r8, r6)
            r9 = 11
            float r6 = r3.getDimension(r9, r6)
            v8.i r9 = r0.f6184i0
            r9.getClass()
            v8.i$a r11 = new v8.i$a
            r11.<init>(r9)
            r9 = 0
            int r14 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r14 < 0) goto L_0x0173
            r11.e(r5)
        L_0x0173:
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x017a
            r11.f(r7)
        L_0x017a:
            int r5 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0181
            r11.d(r8)
        L_0x0181:
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0188
            r11.c(r6)
        L_0x0188:
            v8.i r5 = new v8.i
            r5.<init>(r11)
            r0.f6184i0 = r5
            r5 = 7
            android.content.res.ColorStateList r5 = r8.c.b(r12, r1, r5)
            if (r5 == 0) goto L_0x01ed
            int r6 = r5.getDefaultColor()
            r0.I0 = r6
            r0.f6193r0 = r6
            boolean r6 = r5.isStateful()
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r6 == 0) goto L_0x01c9
            int[] r6 = new int[r13]
            r8 = 0
            r6[r8] = r7
            int r6 = r5.getColorForState(r6, r10)
            r0.J0 = r6
            int[] r6 = new int[r4]
            r6 = {16842908, 16842910} // fill-array
            int r6 = r5.getColorForState(r6, r10)
            r0.K0 = r6
            int[] r6 = new int[r4]
            r6 = {16843623, 16842910} // fill-array
            int r5 = r5.getColorForState(r6, r10)
            r0.L0 = r5
            goto L_0x01f8
        L_0x01c9:
            int r5 = r0.I0
            r0.K0 = r5
            r5 = 2131034736(0x7f050270, float:1.7679998E38)
            android.content.res.ColorStateList r5 = t1.a.b(r12, r5)
            int[] r6 = new int[r13]
            r8 = 0
            r6[r8] = r7
            int r6 = r5.getColorForState(r6, r10)
            r0.J0 = r6
            int[] r6 = new int[r13]
            r7 = 16843623(0x1010367, float:2.3696E-38)
            r6[r8] = r7
            int r5 = r5.getColorForState(r6, r10)
            r0.L0 = r5
            goto L_0x01f8
        L_0x01ed:
            r8 = 0
            r0.f6193r0 = r8
            r0.I0 = r8
            r0.J0 = r8
            r0.K0 = r8
            r0.L0 = r8
        L_0x01f8:
            boolean r5 = r1.l(r13)
            if (r5 == 0) goto L_0x0206
            android.content.res.ColorStateList r5 = r1.b(r13)
            r0.D0 = r5
            r0.C0 = r5
        L_0x0206:
            r5 = 14
            android.content.res.ColorStateList r6 = r8.c.b(r12, r1, r5)
            r7 = 0
            int r3 = r3.getColor(r5, r7)
            r0.G0 = r3
            java.lang.Object r3 = t1.a.f15323a
            r3 = 2131034763(0x7f05028b, float:1.7680053E38)
            int r3 = t1.a.d.a(r12, r3)
            r0.E0 = r3
            r3 = 2131034764(0x7f05028c, float:1.7680055E38)
            int r3 = t1.a.d.a(r12, r3)
            r0.M0 = r3
            r3 = 2131034767(0x7f05028f, float:1.768006E38)
            int r3 = t1.a.d.a(r12, r3)
            r0.F0 = r3
            if (r6 == 0) goto L_0x0235
            r0.setBoxStrokeColorStateList(r6)
        L_0x0235:
            r3 = 15
            boolean r5 = r1.l(r3)
            if (r5 == 0) goto L_0x0244
            android.content.res.ColorStateList r3 = r8.c.b(r12, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x0244:
            r3 = 47
            int r5 = r1.i(r3, r10)
            if (r5 == r10) goto L_0x0255
            r5 = 0
            int r3 = r1.i(r3, r5)
            r0.setHintTextAppearance(r3)
            goto L_0x0256
        L_0x0255:
            r5 = 0
        L_0x0256:
            r3 = 38
            int r3 = r1.i(r3, r5)
            r6 = 33
            java.lang.CharSequence r6 = r1.k(r6)
            r7 = 32
            int r7 = r1.h(r7, r13)
            r8 = 34
            boolean r8 = r1.a(r8, r5)
            r9 = 43
            int r9 = r1.i(r9, r5)
            r11 = 42
            boolean r11 = r1.a(r11, r5)
            r12 = 41
            java.lang.CharSequence r12 = r1.k(r12)
            r14 = 55
            int r14 = r1.i(r14, r5)
            r4 = 54
            java.lang.CharSequence r4 = r1.k(r4)
            r13 = 18
            boolean r13 = r1.a(r13, r5)
            r5 = 19
            int r5 = r1.h(r5, r10)
            r0.setCounterMaxLength(r5)
            r5 = 22
            r10 = 0
            int r5 = r1.i(r5, r10)
            r0.M = r5
            r5 = 20
            int r5 = r1.i(r5, r10)
            r0.L = r5
            r5 = 8
            int r5 = r1.h(r5, r10)
            r0.setBoxBackgroundMode(r5)
            r0.setErrorContentDescription(r6)
            r0.setErrorAccessibilityLiveRegion(r7)
            int r5 = r0.L
            r0.setCounterOverflowTextAppearance(r5)
            r0.setHelperTextTextAppearance(r9)
            r0.setErrorTextAppearance(r3)
            int r3 = r0.M
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r4)
            r0.setPlaceholderTextAppearance(r14)
            r3 = 39
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x02e0
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setErrorTextColor(r3)
        L_0x02e0:
            r3 = 44
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x02ef
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setHelperTextColor(r3)
        L_0x02ef:
            r3 = 48
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x02fe
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setHintTextColor(r3)
        L_0x02fe:
            r3 = 23
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x030d
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setCounterTextColor(r3)
        L_0x030d:
            r3 = 21
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x031c
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x031c:
            r3 = 56
            boolean r4 = r1.l(r3)
            if (r4 == 0) goto L_0x032b
            android.content.res.ColorStateList r3 = r1.b(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x032b:
            com.google.android.material.textfield.a r3 = new com.google.android.material.textfield.a
            r3.<init>(r0, r1)
            r0.f6175c = r3
            r4 = 1
            r5 = 0
            boolean r5 = r1.a(r5, r4)
            r1.n()
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            r1 = 2
            d2.i0.d.s(r0, r1)
            d2.i0.l.l(r0, r4)
            r15.addView(r2)
            r15.addView(r3)
            r0.addView(r15)
            r0.setEnabled(r5)
            r0.setHelperTextEnabled(r11)
            r0.setErrorEnabled(r8)
            r0.setCounterEnabled(r13)
            r0.setHelperText(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        int i8;
        EditText editText = this.f6177d;
        if (editText instanceof AutoCompleteTextView) {
            if (!(editText.getInputType() != 0)) {
                int f10 = b1.b.f(this.f6177d, R.attr.colorControlHighlight);
                int i10 = this.f6187l0;
                int[][] iArr = U0;
                if (i10 == 2) {
                    Context context = getContext();
                    v8.f fVar = this.f6176c0;
                    TypedValue c3 = r8.b.c(R.attr.colorSurface, context, "TextInputLayout");
                    int i11 = c3.resourceId;
                    if (i11 != 0) {
                        Object obj = t1.a.f15323a;
                        i8 = a.d.a(context, i11);
                    } else {
                        i8 = c3.data;
                    }
                    v8.f fVar2 = new v8.f(fVar.f16250a.f16256a);
                    int h3 = b1.b.h(0.1f, f10, i8);
                    fVar2.m(new ColorStateList(iArr, new int[]{h3, 0}));
                    fVar2.setTint(i8);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h3, i8});
                    v8.f fVar3 = new v8.f(fVar.f16250a.f16256a);
                    fVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fVar2, fVar3), fVar});
                } else if (i10 != 1) {
                    return null;
                } else {
                    v8.f fVar4 = this.f6176c0;
                    int i12 = this.f6193r0;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{b1.b.h(0.1f, f10, i12), i12}), fVar4, fVar4);
                }
            }
        }
        return this.f6176c0;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f6180e0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f6180e0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f6180e0.addState(new int[0], f(false));
        }
        return this.f6180e0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f6178d0 == null) {
            this.f6178d0 = f(true);
        }
        return this.f6178d0;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f6177d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f6177d = editText;
            int i8 = this.B;
            if (i8 != -1) {
                setMinEms(i8);
            } else {
                setMinWidth(this.D);
            }
            int i10 = this.C;
            if (i10 != -1) {
                setMaxEms(i10);
            } else {
                setMaxWidth(this.E);
            }
            this.f6181f0 = false;
            i();
            setTextInputAccessibilityDelegate(new e(this));
            Typeface typeface = this.f6177d.getTypeface();
            m8.c cVar = this.O0;
            cVar.m(typeface);
            float textSize = this.f6177d.getTextSize();
            if (cVar.f11236h != textSize) {
                cVar.f11236h = textSize;
                cVar.h(false);
            }
            float letterSpacing = this.f6177d.getLetterSpacing();
            if (cVar.W != letterSpacing) {
                cVar.W = letterSpacing;
                cVar.h(false);
            }
            int gravity = this.f6177d.getGravity();
            int i11 = (gravity & -113) | 48;
            if (cVar.f11235g != i11) {
                cVar.f11235g = i11;
                cVar.h(false);
            }
            if (cVar.f11233f != gravity) {
                cVar.f11233f = gravity;
                cVar.h(false);
            }
            this.f6177d.addTextChangedListener(new a());
            if (this.C0 == null) {
                this.C0 = this.f6177d.getHintTextColors();
            }
            if (this.W) {
                if (TextUtils.isEmpty(this.f6172a0)) {
                    CharSequence hint = this.f6177d.getHint();
                    this.f6179e = hint;
                    setHint(hint);
                    this.f6177d.setHint((CharSequence) null);
                }
                this.f6174b0 = true;
            }
            if (this.K != null) {
                n(this.f6177d.getText());
            }
            q();
            this.F.b();
            this.f6173b.bringToFront();
            a aVar = this.f6175c;
            aVar.bringToFront();
            Iterator<g> it = this.f6200y0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            aVar.l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f6172a0)) {
            this.f6172a0 = charSequence;
            m8.c cVar = this.O0;
            if (charSequence == null || !TextUtils.equals(cVar.A, charSequence)) {
                cVar.A = charSequence;
                cVar.B = null;
                Bitmap bitmap = cVar.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.E = null;
                }
                cVar.h(false);
            }
            if (!this.N0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.O != z10) {
            if (z10) {
                d0 d0Var = this.P;
                if (d0Var != null) {
                    this.f6171a.addView(d0Var);
                    this.P.setVisibility(0);
                }
            } else {
                d0 d0Var2 = this.P;
                if (d0Var2 != null) {
                    d0Var2.setVisibility(8);
                }
                this.P = null;
            }
            this.O = z10;
        }
    }

    public final void a(float f10) {
        m8.c cVar = this.O0;
        if (cVar.f11225b != f10) {
            if (this.R0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.R0 = valueAnimator;
                valueAnimator.setInterpolator(n8.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, v7.a.f16229b));
                this.R0.setDuration((long) n8.a.c(getContext(), R.attr.motionDurationMedium4, 167));
                this.R0.addUpdateListener(new d());
            }
            this.R0.setFloatValues(new float[]{cVar.f11225b, f10});
            this.R0.start();
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.f6171a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            s();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i8, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r7 = this;
            v8.f r0 = r7.f6176c0
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            v8.f$b r1 = r0.f16250a
            v8.i r1 = r1.f16256a
            v8.i r2 = r7.f6184i0
            if (r1 == r2) goto L_0x0010
            r0.setShapeAppearanceModel(r2)
        L_0x0010:
            int r0 = r7.f6187l0
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0027
            int r0 = r7.f6189n0
            if (r0 <= r2) goto L_0x0022
            int r0 = r7.f6192q0
            if (r0 == 0) goto L_0x0022
            r0 = r4
            goto L_0x0023
        L_0x0022:
            r0 = r3
        L_0x0023:
            if (r0 == 0) goto L_0x0027
            r0 = r4
            goto L_0x0028
        L_0x0027:
            r0 = r3
        L_0x0028:
            if (r0 == 0) goto L_0x004b
            v8.f r0 = r7.f6176c0
            int r1 = r7.f6189n0
            float r1 = (float) r1
            int r5 = r7.f6192q0
            v8.f$b r6 = r0.f16250a
            r6.f16266k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            v8.f$b r5 = r0.f16250a
            android.content.res.ColorStateList r6 = r5.f16259d
            if (r6 == r1) goto L_0x004b
            r5.f16259d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L_0x004b:
            int r0 = r7.f6193r0
            int r1 = r7.f6187l0
            if (r1 != r4) goto L_0x0062
            android.content.Context r0 = r7.getContext()
            r1 = 2130903407(0x7f03016f, float:1.7413631E38)
            int r0 = b1.b.e(r0, r1, r3)
            int r1 = r7.f6193r0
            int r0 = v1.d.b(r1, r0)
        L_0x0062:
            r7.f6193r0 = r0
            v8.f r1 = r7.f6176c0
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.m(r0)
            v8.f r0 = r7.f6182g0
            if (r0 == 0) goto L_0x00a7
            v8.f r1 = r7.f6183h0
            if (r1 != 0) goto L_0x0076
            goto L_0x00a7
        L_0x0076:
            int r1 = r7.f6189n0
            if (r1 <= r2) goto L_0x007f
            int r1 = r7.f6192q0
            if (r1 == 0) goto L_0x007f
            r3 = r4
        L_0x007f:
            if (r3 == 0) goto L_0x00a4
            android.widget.EditText r1 = r7.f6177d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L_0x0090
            int r1 = r7.E0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L_0x0096
        L_0x0090:
            int r1 = r7.f6192q0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L_0x0096:
            r0.m(r1)
            v8.f r0 = r7.f6183h0
            int r1 = r7.f6192q0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m(r1)
        L_0x00a4:
            r7.invalidate()
        L_0x00a7:
            r7.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float d10;
        if (!this.W) {
            return 0;
        }
        int i8 = this.f6187l0;
        m8.c cVar = this.O0;
        if (i8 == 0) {
            d10 = cVar.d();
        } else if (i8 != 2) {
            return 0;
        } else {
            d10 = cVar.d() / 2.0f;
        }
        return (int) d10;
    }

    public final r3.d d() {
        r3.d dVar = new r3.d();
        dVar.f13836c = (long) n8.a.c(getContext(), R.attr.motionDurationShort2, 87);
        dVar.f13837d = n8.a.d(getContext(), R.attr.motionEasingLinearInterpolator, v7.a.f16228a);
        return dVar;
    }

    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i8) {
        EditText editText = this.f6177d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i8);
            return;
        }
        if (this.f6179e != null) {
            boolean z10 = this.f6174b0;
            this.f6174b0 = false;
            CharSequence hint = editText.getHint();
            this.f6177d.setHint(this.f6179e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i8);
            } finally {
                this.f6177d.setHint(hint);
                this.f6174b0 = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i8);
            onProvideAutofillVirtualStructure(viewStructure, i8);
            FrameLayout frameLayout = this.f6171a;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
                View childAt = frameLayout.getChildAt(i10);
                ViewStructure newChild = viewStructure.newChild(i10);
                childAt.dispatchProvideAutofillStructure(newChild, i8);
                if (childAt == this.f6177d) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.T0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.T0 = false;
    }

    public final void draw(Canvas canvas) {
        v8.f fVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z10 = this.W;
        m8.c cVar = this.O0;
        if (z10) {
            cVar.getClass();
            int save = canvas.save();
            if (cVar.B != null) {
                RectF rectF = cVar.f11231e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = cVar.N;
                    textPaint.setTextSize(cVar.G);
                    float f10 = cVar.f11243p;
                    float f11 = cVar.f11244q;
                    float f12 = cVar.F;
                    if (f12 != 1.0f) {
                        canvas2.scale(f12, f12, f10, f11);
                    }
                    boolean z11 = true;
                    if (cVar.f11230d0 <= 1 || cVar.C) {
                        z11 = false;
                    }
                    if (z11) {
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(cVar.f11243p - ((float) cVar.Y.getLineStart(0)), f11);
                        float f13 = (float) alpha;
                        textPaint.setAlpha((int) (cVar.f11226b0 * f13));
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 31) {
                            textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, b1.b.b(cVar.K, textPaint.getAlpha()));
                        }
                        cVar.Y.draw(canvas2);
                        textPaint.setAlpha((int) (cVar.f11224a0 * f13));
                        if (i8 >= 31) {
                            textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, b1.b.b(cVar.K, textPaint.getAlpha()));
                        }
                        int lineBaseline = cVar.Y.getLineBaseline(0);
                        CharSequence charSequence = cVar.f11228c0;
                        float f14 = (float) lineBaseline;
                        float f15 = f14;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, textPaint);
                        if (i8 >= 31) {
                            textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                        }
                        String trim = cVar.f11228c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(cVar.Y.getLineEnd(0), str.length()), 0.0f, f15, textPaint);
                    } else {
                        canvas2.translate(f10, f11);
                        cVar.Y.draw(canvas2);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f6183h0 != null && (fVar = this.f6182g0) != null) {
            fVar.draw(canvas2);
            if (this.f6177d.isFocused()) {
                Rect bounds = this.f6183h0.getBounds();
                Rect bounds2 = this.f6182g0.getBounds();
                float f16 = cVar.f11225b;
                int centerX = bounds2.centerX();
                bounds.left = v7.a.b(f16, centerX, bounds2.left);
                bounds.right = v7.a.b(f16, centerX, bounds2.right);
                this.f6183h0.draw(canvas2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r3.f11238j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.S0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.S0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            m8.c r3 = r4.O0
            if (r3 == 0) goto L_0x0037
            r3.L = r1
            android.content.res.ColorStateList r1 = r3.f11239k
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.f11238j
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r3.h(r2)
            r1 = r0
            goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            r1 = r1 | r2
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            android.widget.EditText r3 = r4.f6177d
            if (r3 == 0) goto L_0x004f
            java.util.WeakHashMap<android.view.View, d2.d1> r3 = d2.i0.f7217a
            boolean r3 = d2.i0.g.c(r4)
            if (r3 == 0) goto L_0x004b
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r2
        L_0x004c:
            r4.t(r0, r2)
        L_0x004f:
            r4.q()
            r4.w()
            if (r1 == 0) goto L_0x005a
            r4.invalidate()
        L_0x005a:
            r4.S0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.W && !TextUtils.isEmpty(this.f6172a0) && (this.f6176c0 instanceof a9.g);
    }

    public final v8.f f(boolean z10) {
        int i8;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f6177d;
        float popupElevation = editText instanceof t ? ((t) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i.a aVar = new i.a();
        aVar.e(f10);
        aVar.f(f10);
        aVar.c(dimensionPixelOffset);
        aVar.d(dimensionPixelOffset);
        v8.i iVar = new v8.i(aVar);
        Context context = getContext();
        Paint paint = v8.f.S;
        TypedValue c3 = r8.b.c(R.attr.colorSurface, context, v8.f.class.getSimpleName());
        int i10 = c3.resourceId;
        if (i10 != 0) {
            Object obj = t1.a.f15323a;
            i8 = a.d.a(context, i10);
        } else {
            i8 = c3.data;
        }
        v8.f fVar = new v8.f();
        fVar.j(context);
        fVar.m(ColorStateList.valueOf(i8));
        fVar.l(popupElevation);
        fVar.setShapeAppearanceModel(iVar);
        f.b bVar = fVar.f16250a;
        if (bVar.f16263h == null) {
            bVar.f16263h = new Rect();
        }
        fVar.f16250a.f16263h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        fVar.invalidateSelf();
        return fVar;
    }

    public final int g(int i8, boolean z10) {
        int compoundPaddingLeft = this.f6177d.getCompoundPaddingLeft() + i8;
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public int getBaseline() {
        EditText editText = this.f6177d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public v8.f getBoxBackground() {
        int i8 = this.f6187l0;
        if (i8 == 1 || i8 == 2) {
            return this.f6176c0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f6193r0;
    }

    public int getBoxBackgroundMode() {
        return this.f6187l0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f6188m0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean c3 = v.c(this);
        RectF rectF = this.f6196u0;
        return c3 ? this.f6184i0.f16284h.a(rectF) : this.f6184i0.f16283g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean c3 = v.c(this);
        RectF rectF = this.f6196u0;
        return c3 ? this.f6184i0.f16283g.a(rectF) : this.f6184i0.f16284h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean c3 = v.c(this);
        RectF rectF = this.f6196u0;
        return c3 ? this.f6184i0.f16281e.a(rectF) : this.f6184i0.f16282f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean c3 = v.c(this);
        RectF rectF = this.f6196u0;
        return c3 ? this.f6184i0.f16282f.a(rectF) : this.f6184i0.f16281e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.G0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.H0;
    }

    public int getBoxStrokeWidth() {
        return this.f6190o0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f6191p0;
    }

    public int getCounterMaxLength() {
        return this.H;
    }

    public CharSequence getCounterOverflowDescription() {
        d0 d0Var;
        if (!this.G || !this.I || (d0Var = this.K) == null) {
            return null;
        }
        return d0Var.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.V;
    }

    public ColorStateList getCounterTextColor() {
        return this.U;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.C0;
    }

    public EditText getEditText() {
        return this.f6177d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f6175c.C.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f6175c.C.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f6175c.I;
    }

    public int getEndIconMode() {
        return this.f6175c.E;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f6175c.J;
    }

    public CheckableImageButton getEndIconView() {
        return this.f6175c.C;
    }

    public CharSequence getError() {
        q qVar = this.F;
        if (qVar.f183q) {
            return qVar.f182p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.F.f186t;
    }

    public CharSequence getErrorContentDescription() {
        return this.F.f185s;
    }

    public int getErrorCurrentTextColors() {
        d0 d0Var = this.F.f184r;
        if (d0Var != null) {
            return d0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f6175c.f6211c.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.F;
        if (qVar.f190x) {
            return qVar.f189w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        d0 d0Var = this.F.f191y;
        if (d0Var != null) {
            return d0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.W) {
            return this.f6172a0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.O0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        m8.c cVar = this.O0;
        return cVar.e(cVar.f11239k);
    }

    public ColorStateList getHintTextColor() {
        return this.D0;
    }

    public f getLengthCounter() {
        return this.J;
    }

    public int getMaxEms() {
        return this.C;
    }

    public int getMaxWidth() {
        return this.E;
    }

    public int getMinEms() {
        return this.B;
    }

    public int getMinWidth() {
        return this.D;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f6175c.C.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f6175c.C.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.O) {
            return this.N;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.R;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.Q;
    }

    public CharSequence getPrefixText() {
        return this.f6173b.f211c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6173b.f210b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f6173b.f210b;
    }

    public v8.i getShapeAppearanceModel() {
        return this.f6184i0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f6173b.f212d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f6173b.f212d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f6173b.C;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f6173b.D;
    }

    public CharSequence getSuffixText() {
        return this.f6175c.L;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f6175c.M.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f6175c.M;
    }

    public Typeface getTypeface() {
        return this.f6197v0;
    }

    public final int h(int i8, boolean z10) {
        int compoundPaddingRight = i8 - this.f6177d.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public final void i() {
        int i8 = this.f6187l0;
        if (i8 == 0) {
            this.f6176c0 = null;
            this.f6182g0 = null;
            this.f6183h0 = null;
        } else if (i8 == 1) {
            this.f6176c0 = new v8.f(this.f6184i0);
            this.f6182g0 = new v8.f();
            this.f6183h0 = new v8.f();
        } else if (i8 == 2) {
            if (!this.W || (this.f6176c0 instanceof a9.g)) {
                this.f6176c0 = new v8.f(this.f6184i0);
            } else {
                v8.i iVar = this.f6184i0;
                int i10 = a9.g.U;
                this.f6176c0 = new g.a(iVar);
            }
            this.f6182g0 = null;
            this.f6183h0 = null;
        } else {
            throw new IllegalArgumentException(b3.x.b(new StringBuilder(), this.f6187l0, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        r();
        w();
        boolean z10 = false;
        if (this.f6187l0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f6188m0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (r8.c.e(getContext())) {
                this.f6188m0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f6177d != null && this.f6187l0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z10 = true;
            }
            if (z10) {
                EditText editText = this.f6177d;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.e.k(editText, i0.e.f(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), i0.e.e(this.f6177d), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (r8.c.e(getContext())) {
                EditText editText2 = this.f6177d;
                WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                i0.e.k(editText2, i0.e.f(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), i0.e.e(this.f6177d), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f6187l0 != 0) {
            s();
        }
        EditText editText3 = this.f6177d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f6187l0;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r0 = r12.f6177d
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.f6177d
            int r1 = r1.getGravity()
            m8.c r2 = r12.O0
            java.lang.CharSequence r3 = r2.A
            boolean r3 = r2.b(r3)
            r2.C = r3
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 5
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.f11229d
            if (r1 == r8) goto L_0x004f
            r10 = r1 & 7
            if (r10 != r7) goto L_0x002f
            goto L_0x004f
        L_0x002f:
            r10 = r1 & r6
            if (r10 == r6) goto L_0x0043
            r10 = r1 & 5
            if (r10 != r5) goto L_0x0038
            goto L_0x0043
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.Z
            goto L_0x0054
        L_0x0040:
            int r3 = r9.left
            goto L_0x0047
        L_0x0043:
            if (r3 == 0) goto L_0x0049
            int r3 = r9.left
        L_0x0047:
            float r3 = (float) r3
            goto L_0x0055
        L_0x0049:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.Z
            goto L_0x0054
        L_0x004f:
            float r3 = (float) r0
            float r3 = r3 / r4
            float r10 = r2.Z
            float r10 = r10 / r4
        L_0x0054:
            float r3 = r3 - r10
        L_0x0055:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.f6196u0
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L_0x008c
            r8 = r1 & 7
            if (r8 != r7) goto L_0x006c
            goto L_0x008c
        L_0x006c:
            r0 = r1 & r6
            if (r0 == r6) goto L_0x0080
            r0 = r1 & 5
            if (r0 != r5) goto L_0x0075
            goto L_0x0080
        L_0x0075:
            boolean r0 = r2.C
            if (r0 == 0) goto L_0x007c
            int r0 = r9.right
            goto L_0x008a
        L_0x007c:
            float r0 = r2.Z
            float r0 = r0 + r3
            goto L_0x0092
        L_0x0080:
            boolean r0 = r2.C
            if (r0 == 0) goto L_0x0088
            float r0 = r2.Z
            float r0 = r0 + r3
            goto L_0x0092
        L_0x0088:
            int r0 = r9.right
        L_0x008a:
            float r0 = (float) r0
            goto L_0x0092
        L_0x008c:
            float r0 = (float) r0
            float r0 = r0 / r4
            float r1 = r2.Z
            float r1 = r1 / r4
            float r0 = r0 + r1
        L_0x0092:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.d()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b7
            goto L_0x00ef
        L_0x00b7:
            float r0 = r10.left
            int r1 = r12.f6186k0
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r4
            float r1 = r1 - r2
            int r2 = r12.f6189n0
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            v8.f r0 = r12.f6176c0
            a9.g r0 = (a9.g) r0
            r0.getClass()
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.right
            float r4 = r10.bottom
            r0.s(r1, r2, r3, r4)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(TextView textView, int i8) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i8);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(2132017578);
            Context context = getContext();
            Object obj = t1.a.f15323a;
            textView.setTextColor(a.d.a(context, R.color.design_error));
        }
    }

    public final boolean m() {
        q qVar = this.F;
        return qVar.f181o == 1 && qVar.f184r != null && !TextUtils.isEmpty(qVar.f182p);
    }

    public final void n(Editable editable) {
        ((o) this.J).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z10 = this.I;
        int i8 = this.H;
        String str = null;
        if (i8 == -1) {
            this.K.setText(String.valueOf(length));
            this.K.setContentDescription((CharSequence) null);
            this.I = false;
        } else {
            this.I = length > i8;
            this.K.setContentDescription(getContext().getString(this.I ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(length), Integer.valueOf(this.H)}));
            if (z10 != this.I) {
                o();
            }
            String str2 = b2.a.f3000d;
            Locale locale = Locale.getDefault();
            int i10 = k.f3023a;
            b2.a aVar = k.a.a(locale) == 1 ? b2.a.f3003g : b2.a.f3002f;
            d0 d0Var = this.K;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(length), Integer.valueOf(this.H)});
            if (string == null) {
                aVar.getClass();
            } else {
                str = aVar.c(string, aVar.f3006c).toString();
            }
            d0Var.setText(str);
        }
        if (this.f6177d != null && z10 != this.I) {
            t(false, false);
            w();
            q();
        }
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        d0 d0Var = this.K;
        if (d0Var != null) {
            l(d0Var, this.I ? this.L : this.M);
            if (!this.I && (colorStateList2 = this.U) != null) {
                this.K.setTextColor(colorStateList2);
            }
            if (this.I && (colorStateList = this.V) != null) {
                this.K.setTextColor(colorStateList);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.O0.g(configuration);
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        EditText editText = this.f6177d;
        if (editText != null) {
            Rect rect = this.f6194s0;
            m8.d.a(this, editText, rect);
            v8.f fVar = this.f6182g0;
            if (fVar != null) {
                int i13 = rect.bottom;
                fVar.setBounds(rect.left, i13 - this.f6190o0, rect.right, i13);
            }
            v8.f fVar2 = this.f6183h0;
            if (fVar2 != null) {
                int i14 = rect.bottom;
                fVar2.setBounds(rect.left, i14 - this.f6191p0, rect.right, i14);
            }
            if (this.W) {
                float textSize = this.f6177d.getTextSize();
                m8.c cVar = this.O0;
                if (cVar.f11236h != textSize) {
                    cVar.f11236h = textSize;
                    cVar.h(false);
                }
                int gravity = this.f6177d.getGravity();
                int i15 = (gravity & -113) | 48;
                if (cVar.f11235g != i15) {
                    cVar.f11235g = i15;
                    cVar.h(false);
                }
                if (cVar.f11233f != gravity) {
                    cVar.f11233f = gravity;
                    cVar.h(false);
                }
                if (this.f6177d != null) {
                    boolean c3 = v.c(this);
                    int i16 = rect.bottom;
                    Rect rect2 = this.f6195t0;
                    rect2.bottom = i16;
                    int i17 = this.f6187l0;
                    if (i17 == 1) {
                        rect2.left = g(rect.left, c3);
                        rect2.top = rect.top + this.f6188m0;
                        rect2.right = h(rect.right, c3);
                    } else if (i17 != 2) {
                        rect2.left = g(rect.left, c3);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, c3);
                    } else {
                        rect2.left = this.f6177d.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.f6177d.getPaddingRight();
                    }
                    int i18 = rect2.left;
                    int i19 = rect2.top;
                    int i20 = rect2.right;
                    int i21 = rect2.bottom;
                    Rect rect3 = cVar.f11229d;
                    if (!(rect3.left == i18 && rect3.top == i19 && rect3.right == i20 && rect3.bottom == i21)) {
                        rect3.set(i18, i19, i20, i21);
                        cVar.M = true;
                    }
                    if (this.f6177d != null) {
                        TextPaint textPaint = cVar.O;
                        textPaint.setTextSize(cVar.f11236h);
                        textPaint.setTypeface(cVar.f11248u);
                        textPaint.setLetterSpacing(cVar.W);
                        float f10 = -textPaint.ascent();
                        rect2.left = this.f6177d.getCompoundPaddingLeft() + rect.left;
                        rect2.top = this.f6187l0 == 1 && this.f6177d.getMinLines() <= 1 ? (int) (((float) rect.centerY()) - (f10 / 2.0f)) : rect.top + this.f6177d.getCompoundPaddingTop();
                        rect2.right = rect.right - this.f6177d.getCompoundPaddingRight();
                        int compoundPaddingBottom = this.f6187l0 == 1 && this.f6177d.getMinLines() <= 1 ? (int) (((float) rect2.top) + f10) : rect.bottom - this.f6177d.getCompoundPaddingBottom();
                        rect2.bottom = compoundPaddingBottom;
                        int i22 = rect2.left;
                        int i23 = rect2.top;
                        int i24 = rect2.right;
                        Rect rect4 = cVar.f11227c;
                        if (!(rect4.left == i22 && rect4.top == i23 && rect4.right == i24 && rect4.bottom == compoundPaddingBottom)) {
                            rect4.set(i22, i23, i24, compoundPaddingBottom);
                            cVar.M = true;
                        }
                        cVar.h(false);
                        if (e() && !this.N0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i8, int i10) {
        boolean z10;
        EditText editText;
        int max;
        super.onMeasure(i8, i10);
        EditText editText2 = this.f6177d;
        a aVar = this.f6175c;
        if (editText2 != null && this.f6177d.getMeasuredHeight() < (max = Math.max(aVar.getMeasuredHeight(), this.f6173b.getMeasuredHeight()))) {
            this.f6177d.setMinimumHeight(max);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean p10 = p();
        if (z10 || p10) {
            this.f6177d.post(new c());
        }
        if (!(this.P == null || (editText = this.f6177d) == null)) {
            this.P.setGravity(editText.getGravity());
            this.P.setPadding(this.f6177d.getCompoundPaddingLeft(), this.f6177d.getCompoundPaddingTop(), this.f6177d.getCompoundPaddingRight(), this.f6177d.getCompoundPaddingBottom());
        }
        aVar.l();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f10267a);
        setError(iVar.f6207c);
        if (iVar.f6208d) {
            post(new b());
        }
        requestLayout();
    }

    public final void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        boolean z10 = true;
        if (i8 != 1) {
            z10 = false;
        }
        if (z10 != this.f6185j0) {
            v8.c cVar = this.f6184i0.f16281e;
            RectF rectF = this.f6196u0;
            float a10 = cVar.a(rectF);
            float a11 = this.f6184i0.f16282f.a(rectF);
            float a12 = this.f6184i0.f16284h.a(rectF);
            float a13 = this.f6184i0.f16283g.a(rectF);
            v8.i iVar = this.f6184i0;
            v1 v1Var = iVar.f16277a;
            i.a aVar = new i.a();
            v1 v1Var2 = iVar.f16278b;
            aVar.f16289a = v1Var2;
            float b10 = i.a.b(v1Var2);
            if (b10 != -1.0f) {
                aVar.e(b10);
            }
            aVar.f16290b = v1Var;
            float b11 = i.a.b(v1Var);
            if (b11 != -1.0f) {
                aVar.f(b11);
            }
            v1 v1Var3 = iVar.f16279c;
            aVar.f16292d = v1Var3;
            float b12 = i.a.b(v1Var3);
            if (b12 != -1.0f) {
                aVar.c(b12);
            }
            v1 v1Var4 = iVar.f16280d;
            aVar.f16291c = v1Var4;
            float b13 = i.a.b(v1Var4);
            if (b13 != -1.0f) {
                aVar.d(b13);
            }
            aVar.e(a11);
            aVar.f(a10);
            aVar.c(a13);
            aVar.d(a12);
            v8.i iVar2 = new v8.i(aVar);
            this.f6185j0 = z10;
            setShapeAppearanceModel(iVar2);
        }
    }

    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        if (m()) {
            iVar.f6207c = getError();
        }
        a aVar = this.f6175c;
        boolean z10 = true;
        if (!(aVar.E != 0) || !aVar.C.isChecked()) {
            z10 = false;
        }
        iVar.f6208d = z10;
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0093, code lost:
        if (r3.c() != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        if (r3.L != null) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f6177d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            a9.x r3 = r10.f6173b
            if (r0 != 0) goto L_0x001f
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x0027
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0027
        L_0x001f:
            int r0 = r3.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0027
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            r4 = 2
            r5 = 0
            r6 = 3
            if (r0 == 0) goto L_0x0064
            int r0 = r3.getMeasuredWidth()
            android.widget.EditText r3 = r10.f6177d
            int r3 = r3.getPaddingLeft()
            int r0 = r0 - r3
            android.graphics.drawable.ColorDrawable r3 = r10.f6198w0
            if (r3 == 0) goto L_0x0040
            int r3 = r10.f6199x0
            if (r3 == r0) goto L_0x004c
        L_0x0040:
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>()
            r10.f6198w0 = r3
            r10.f6199x0 = r0
            r3.setBounds(r1, r1, r0, r2)
        L_0x004c:
            android.widget.EditText r0 = r10.f6177d
            android.graphics.drawable.Drawable[] r0 = h2.l.b.a(r0)
            r3 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f6198w0
            if (r3 == r7) goto L_0x007d
            android.widget.EditText r3 = r10.f6177d
            r8 = r0[r2]
            r9 = r0[r4]
            r0 = r0[r6]
            h2.l.b.e(r3, r7, r8, r9, r0)
            goto L_0x007b
        L_0x0064:
            android.graphics.drawable.ColorDrawable r0 = r10.f6198w0
            if (r0 == 0) goto L_0x007d
            android.widget.EditText r0 = r10.f6177d
            android.graphics.drawable.Drawable[] r0 = h2.l.b.a(r0)
            android.widget.EditText r3 = r10.f6177d
            r7 = r0[r2]
            r8 = r0[r4]
            r0 = r0[r6]
            h2.l.b.e(r3, r5, r7, r8, r0)
            r10.f6198w0 = r5
        L_0x007b:
            r0 = r2
            goto L_0x007e
        L_0x007d:
            r0 = r1
        L_0x007e:
            com.google.android.material.textfield.a r3 = r10.f6175c
            boolean r7 = r3.d()
            if (r7 != 0) goto L_0x0099
            int r7 = r3.E
            if (r7 == 0) goto L_0x008c
            r7 = r2
            goto L_0x008d
        L_0x008c:
            r7 = r1
        L_0x008d:
            if (r7 == 0) goto L_0x0095
            boolean r7 = r3.c()
            if (r7 != 0) goto L_0x0099
        L_0x0095:
            java.lang.CharSequence r7 = r3.L
            if (r7 == 0) goto L_0x00a1
        L_0x0099:
            int r7 = r3.getMeasuredWidth()
            if (r7 <= 0) goto L_0x00a1
            r7 = r2
            goto L_0x00a2
        L_0x00a1:
            r7 = r1
        L_0x00a2:
            if (r7 == 0) goto L_0x0123
            androidx.appcompat.widget.d0 r7 = r3.M
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.f6177d
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r3.d()
            if (r8 == 0) goto L_0x00ba
            com.google.android.material.internal.CheckableImageButton r5 = r3.f6211c
            goto L_0x00cb
        L_0x00ba:
            int r8 = r3.E
            if (r8 == 0) goto L_0x00c0
            r8 = r2
            goto L_0x00c1
        L_0x00c0:
            r8 = r1
        L_0x00c1:
            if (r8 == 0) goto L_0x00cb
            boolean r8 = r3.c()
            if (r8 == 0) goto L_0x00cb
            com.google.android.material.internal.CheckableImageButton r5 = r3.C
        L_0x00cb:
            if (r5 == 0) goto L_0x00de
            int r3 = r5.getMeasuredWidth()
            int r3 = r3 + r7
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r5 = d2.p.c(r5)
            int r7 = r5 + r3
        L_0x00de:
            android.widget.EditText r3 = r10.f6177d
            android.graphics.drawable.Drawable[] r3 = h2.l.b.a(r3)
            android.graphics.drawable.ColorDrawable r5 = r10.f6201z0
            if (r5 == 0) goto L_0x00ff
            int r8 = r10.A0
            if (r8 == r7) goto L_0x00ff
            r10.A0 = r7
            r5.setBounds(r1, r1, r7, r2)
            android.widget.EditText r0 = r10.f6177d
            r1 = r3[r1]
            r4 = r3[r2]
            android.graphics.drawable.ColorDrawable r5 = r10.f6201z0
            r3 = r3[r6]
            h2.l.b.e(r0, r1, r4, r5, r3)
            goto L_0x0144
        L_0x00ff:
            if (r5 != 0) goto L_0x010d
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            r5.<init>()
            r10.f6201z0 = r5
            r10.A0 = r7
            r5.setBounds(r1, r1, r7, r2)
        L_0x010d:
            r4 = r3[r4]
            android.graphics.drawable.ColorDrawable r5 = r10.f6201z0
            if (r4 == r5) goto L_0x0121
            r10.B0 = r4
            android.widget.EditText r0 = r10.f6177d
            r1 = r3[r1]
            r4 = r3[r2]
            r3 = r3[r6]
            h2.l.b.e(r0, r1, r4, r5, r3)
            goto L_0x0144
        L_0x0121:
            r2 = r0
            goto L_0x0144
        L_0x0123:
            android.graphics.drawable.ColorDrawable r3 = r10.f6201z0
            if (r3 == 0) goto L_0x0145
            android.widget.EditText r3 = r10.f6177d
            android.graphics.drawable.Drawable[] r3 = h2.l.b.a(r3)
            r4 = r3[r4]
            android.graphics.drawable.ColorDrawable r7 = r10.f6201z0
            if (r4 != r7) goto L_0x0141
            android.widget.EditText r0 = r10.f6177d
            r1 = r3[r1]
            r4 = r3[r2]
            android.graphics.drawable.Drawable r7 = r10.B0
            r3 = r3[r6]
            h2.l.b.e(r0, r1, r4, r7, r3)
            goto L_0x0142
        L_0x0141:
            r2 = r0
        L_0x0142:
            r10.f6201z0 = r5
        L_0x0144:
            r0 = r2
        L_0x0145:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        d0 d0Var;
        EditText editText = this.f6177d;
        if (editText != null && this.f6187l0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = j0.f1034a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(j.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.I || (d0Var = this.K) == null) {
                mutate.clearColorFilter();
                this.f6177d.refreshDrawableState();
            } else {
                mutate.setColorFilter(j.c(d0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void r() {
        EditText editText = this.f6177d;
        if (editText != null && this.f6176c0 != null) {
            if ((this.f6181f0 || editText.getBackground() == null) && this.f6187l0 != 0) {
                EditText editText2 = this.f6177d;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.q(editText2, editTextBoxBackground);
                this.f6181f0 = true;
            }
        }
    }

    public final void s() {
        if (this.f6187l0 != 1) {
            FrameLayout frameLayout = this.f6171a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c3 = c();
            if (c3 != layoutParams.topMargin) {
                layoutParams.topMargin = c3;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i8) {
        if (this.f6193r0 != i8) {
            this.f6193r0 = i8;
            this.I0 = i8;
            this.K0 = i8;
            this.L0 = i8;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i8) {
        Context context = getContext();
        Object obj = t1.a.f15323a;
        setBoxBackgroundColor(a.d.a(context, i8));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.I0 = defaultColor;
        this.f6193r0 = defaultColor;
        this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.K0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.L0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i8) {
        if (i8 != this.f6187l0) {
            this.f6187l0 = i8;
            if (this.f6177d != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i8) {
        this.f6188m0 = i8;
    }

    public void setBoxCornerFamily(int i8) {
        v8.i iVar = this.f6184i0;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        v8.c cVar = this.f6184i0.f16281e;
        v1 c3 = b1.b.c(i8);
        aVar.f16289a = c3;
        float b10 = i.a.b(c3);
        if (b10 != -1.0f) {
            aVar.e(b10);
        }
        aVar.f16293e = cVar;
        v8.c cVar2 = this.f6184i0.f16282f;
        v1 c10 = b1.b.c(i8);
        aVar.f16290b = c10;
        float b11 = i.a.b(c10);
        if (b11 != -1.0f) {
            aVar.f(b11);
        }
        aVar.f16294f = cVar2;
        v8.c cVar3 = this.f6184i0.f16284h;
        v1 c11 = b1.b.c(i8);
        aVar.f16292d = c11;
        float b12 = i.a.b(c11);
        if (b12 != -1.0f) {
            aVar.c(b12);
        }
        aVar.f16296h = cVar3;
        v8.c cVar4 = this.f6184i0.f16283g;
        v1 c12 = b1.b.c(i8);
        aVar.f16291c = c12;
        float b13 = i.a.b(c12);
        if (b13 != -1.0f) {
            aVar.d(b13);
        }
        aVar.f16295g = cVar4;
        this.f6184i0 = new v8.i(aVar);
        b();
    }

    public void setBoxStrokeColor(int i8) {
        if (this.G0 != i8) {
            this.G0 = i8;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.E0 = colorStateList.getDefaultColor();
            this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.F0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.G0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.G0 != colorStateList.getDefaultColor()) {
            this.G0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i8) {
        this.f6190o0 = i8;
        w();
    }

    public void setBoxStrokeWidthFocused(int i8) {
        this.f6191p0 = i8;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i8) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i8));
    }

    public void setBoxStrokeWidthResource(int i8) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i8));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.G != z10) {
            Editable editable = null;
            q qVar = this.F;
            if (z10) {
                d0 d0Var = new d0(getContext(), (AttributeSet) null);
                this.K = d0Var;
                d0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f6197v0;
                if (typeface != null) {
                    this.K.setTypeface(typeface);
                }
                this.K.setMaxLines(1);
                qVar.a(this.K, 2);
                p.h((ViewGroup.MarginLayoutParams) this.K.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.K != null) {
                    EditText editText = this.f6177d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                qVar.g(this.K, 2);
                this.K = null;
            }
            this.G = z10;
        }
    }

    public void setCounterMaxLength(int i8) {
        if (this.H != i8) {
            if (i8 > 0) {
                this.H = i8;
            } else {
                this.H = -1;
            }
            if (this.G && this.K != null) {
                EditText editText = this.f6177d;
                n(editText == null ? null : editText.getText());
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i8) {
        if (this.L != i8) {
            this.L = i8;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i8) {
        if (this.M != i8) {
            this.M = i8;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.C0 = colorStateList;
        this.D0 = colorStateList;
        if (this.f6177d != null) {
            t(false, false);
        }
    }

    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f6175c.C.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f6175c.C.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i8) {
        a aVar = this.f6175c;
        CharSequence text = i8 != 0 ? aVar.getResources().getText(i8) : null;
        CheckableImageButton checkableImageButton = aVar.C;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i8) {
        a aVar = this.f6175c;
        Drawable a10 = i8 != 0 ? f.a.a(aVar.getContext(), i8) : null;
        CheckableImageButton checkableImageButton = aVar.C;
        checkableImageButton.setImageDrawable(a10);
        if (a10 != null) {
            ColorStateList colorStateList = aVar.G;
            PorterDuff.Mode mode = aVar.H;
            TextInputLayout textInputLayout = aVar.f6209a;
            a9.p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            a9.p.c(textInputLayout, checkableImageButton, aVar.G);
        }
    }

    public void setEndIconMinSize(int i8) {
        a aVar = this.f6175c;
        if (i8 < 0) {
            aVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i8 != aVar.I) {
            aVar.I = i8;
            CheckableImageButton checkableImageButton = aVar.C;
            checkableImageButton.setMinimumWidth(i8);
            checkableImageButton.setMinimumHeight(i8);
            CheckableImageButton checkableImageButton2 = aVar.f6211c;
            checkableImageButton2.setMinimumWidth(i8);
            checkableImageButton2.setMinimumHeight(i8);
        }
    }

    public void setEndIconMode(int i8) {
        this.f6175c.f(i8);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        a aVar = this.f6175c;
        View.OnLongClickListener onLongClickListener = aVar.K;
        CheckableImageButton checkableImageButton = aVar.C;
        checkableImageButton.setOnClickListener(onClickListener);
        a9.p.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        a aVar = this.f6175c;
        aVar.K = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.C;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a9.p.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        a aVar = this.f6175c;
        aVar.J = scaleType;
        aVar.C.setScaleType(scaleType);
        aVar.f6211c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        a aVar = this.f6175c;
        if (aVar.G != colorStateList) {
            aVar.G = colorStateList;
            a9.p.a(aVar.f6209a, aVar.C, colorStateList, aVar.H);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        a aVar = this.f6175c;
        if (aVar.H != mode) {
            aVar.H = mode;
            a9.p.a(aVar.f6209a, aVar.C, aVar.G, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f6175c.g(z10);
    }

    public void setError(CharSequence charSequence) {
        q qVar = this.F;
        if (!qVar.f183q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            qVar.c();
            qVar.f182p = charSequence;
            qVar.f184r.setText(charSequence);
            int i8 = qVar.f180n;
            if (i8 != 1) {
                qVar.f181o = 1;
            }
            qVar.i(i8, qVar.f181o, qVar.h(qVar.f184r, charSequence));
            return;
        }
        qVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i8) {
        q qVar = this.F;
        qVar.f186t = i8;
        d0 d0Var = qVar.f184r;
        if (d0Var != null) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.g.f(d0Var, i8);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.F;
        qVar.f185s = charSequence;
        d0 d0Var = qVar.f184r;
        if (d0Var != null) {
            d0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        q qVar = this.F;
        if (qVar.f183q != z10) {
            qVar.c();
            TextInputLayout textInputLayout = qVar.f175h;
            if (z10) {
                d0 d0Var = new d0(qVar.f174g, (AttributeSet) null);
                qVar.f184r = d0Var;
                d0Var.setId(R.id.textinput_error);
                qVar.f184r.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f184r.setTypeface(typeface);
                }
                int i8 = qVar.f187u;
                qVar.f187u = i8;
                d0 d0Var2 = qVar.f184r;
                if (d0Var2 != null) {
                    textInputLayout.l(d0Var2, i8);
                }
                ColorStateList colorStateList = qVar.f188v;
                qVar.f188v = colorStateList;
                d0 d0Var3 = qVar.f184r;
                if (!(d0Var3 == null || colorStateList == null)) {
                    d0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = qVar.f185s;
                qVar.f185s = charSequence;
                d0 d0Var4 = qVar.f184r;
                if (d0Var4 != null) {
                    d0Var4.setContentDescription(charSequence);
                }
                int i10 = qVar.f186t;
                qVar.f186t = i10;
                d0 d0Var5 = qVar.f184r;
                if (d0Var5 != null) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.g.f(d0Var5, i10);
                }
                qVar.f184r.setVisibility(4);
                qVar.a(qVar.f184r, 0);
            } else {
                qVar.f();
                qVar.g(qVar.f184r, 0);
                qVar.f184r = null;
                textInputLayout.q();
                textInputLayout.w();
            }
            qVar.f183q = z10;
        }
    }

    public void setErrorIconDrawable(int i8) {
        a aVar = this.f6175c;
        aVar.h(i8 != 0 ? f.a.a(aVar.getContext(), i8) : null);
        a9.p.c(aVar.f6209a, aVar.f6211c, aVar.f6212d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        a aVar = this.f6175c;
        CheckableImageButton checkableImageButton = aVar.f6211c;
        View.OnLongClickListener onLongClickListener = aVar.B;
        checkableImageButton.setOnClickListener(onClickListener);
        a9.p.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        a aVar = this.f6175c;
        aVar.B = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f6211c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a9.p.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        a aVar = this.f6175c;
        if (aVar.f6212d != colorStateList) {
            aVar.f6212d = colorStateList;
            a9.p.a(aVar.f6209a, aVar.f6211c, colorStateList, aVar.f6213e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        a aVar = this.f6175c;
        if (aVar.f6213e != mode) {
            aVar.f6213e = mode;
            a9.p.a(aVar.f6209a, aVar.f6211c, aVar.f6212d, mode);
        }
    }

    public void setErrorTextAppearance(int i8) {
        q qVar = this.F;
        qVar.f187u = i8;
        d0 d0Var = qVar.f184r;
        if (d0Var != null) {
            qVar.f175h.l(d0Var, i8);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.F;
        qVar.f188v = colorStateList;
        d0 d0Var = qVar.f184r;
        if (d0Var != null && colorStateList != null) {
            d0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.P0 != z10) {
            this.P0 = z10;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.F;
        if (!isEmpty) {
            if (!qVar.f190x) {
                setHelperTextEnabled(true);
            }
            qVar.c();
            qVar.f189w = charSequence;
            qVar.f191y.setText(charSequence);
            int i8 = qVar.f180n;
            if (i8 != 2) {
                qVar.f181o = 2;
            }
            qVar.i(i8, qVar.f181o, qVar.h(qVar.f191y, charSequence));
        } else if (qVar.f190x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.F;
        qVar.A = colorStateList;
        d0 d0Var = qVar.f191y;
        if (d0Var != null && colorStateList != null) {
            d0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        q qVar = this.F;
        if (qVar.f190x != z10) {
            qVar.c();
            if (z10) {
                d0 d0Var = new d0(qVar.f174g, (AttributeSet) null);
                qVar.f191y = d0Var;
                d0Var.setId(R.id.textinput_helper_text);
                qVar.f191y.setTextAlignment(5);
                Typeface typeface = qVar.B;
                if (typeface != null) {
                    qVar.f191y.setTypeface(typeface);
                }
                qVar.f191y.setVisibility(4);
                d0 d0Var2 = qVar.f191y;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.g.f(d0Var2, 1);
                int i8 = qVar.f192z;
                qVar.f192z = i8;
                d0 d0Var3 = qVar.f191y;
                if (d0Var3 != null) {
                    d0Var3.setTextAppearance(i8);
                }
                ColorStateList colorStateList = qVar.A;
                qVar.A = colorStateList;
                d0 d0Var4 = qVar.f191y;
                if (!(d0Var4 == null || colorStateList == null)) {
                    d0Var4.setTextColor(colorStateList);
                }
                qVar.a(qVar.f191y, 1);
                qVar.f191y.setAccessibilityDelegate(new r(qVar));
            } else {
                qVar.c();
                int i10 = qVar.f180n;
                if (i10 == 2) {
                    qVar.f181o = 0;
                }
                qVar.i(i10, qVar.f181o, qVar.h(qVar.f191y, ""));
                qVar.g(qVar.f191y, 1);
                qVar.f191y = null;
                TextInputLayout textInputLayout = qVar.f175h;
                textInputLayout.q();
                textInputLayout.w();
            }
            qVar.f190x = z10;
        }
    }

    public void setHelperTextTextAppearance(int i8) {
        q qVar = this.F;
        qVar.f192z = i8;
        d0 d0Var = qVar.f191y;
        if (d0Var != null) {
            d0Var.setTextAppearance(i8);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.W) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.Q0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.W) {
            this.W = z10;
            if (!z10) {
                this.f6174b0 = false;
                if (!TextUtils.isEmpty(this.f6172a0) && TextUtils.isEmpty(this.f6177d.getHint())) {
                    this.f6177d.setHint(this.f6172a0);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f6177d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f6172a0)) {
                        setHint(hint);
                    }
                    this.f6177d.setHint((CharSequence) null);
                }
                this.f6174b0 = true;
            }
            if (this.f6177d != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i8) {
        m8.c cVar = this.O0;
        View view = cVar.f11223a;
        r8.d dVar = new r8.d(view.getContext(), i8);
        ColorStateList colorStateList = dVar.f14100j;
        if (colorStateList != null) {
            cVar.f11239k = colorStateList;
        }
        float f10 = dVar.f14101k;
        if (f10 != 0.0f) {
            cVar.f11237i = f10;
        }
        ColorStateList colorStateList2 = dVar.f14091a;
        if (colorStateList2 != null) {
            cVar.U = colorStateList2;
        }
        cVar.S = dVar.f14095e;
        cVar.T = dVar.f14096f;
        cVar.R = dVar.f14097g;
        cVar.V = dVar.f14099i;
        r8.a aVar = cVar.f11252y;
        if (aVar != null) {
            aVar.f14090d = true;
        }
        m8.b bVar = new m8.b(cVar);
        dVar.a();
        cVar.f11252y = new r8.a(bVar, dVar.f14103n);
        dVar.c(view.getContext(), cVar.f11252y);
        cVar.h(false);
        this.D0 = cVar.f11239k;
        if (this.f6177d != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            if (this.C0 == null) {
                m8.c cVar = this.O0;
                if (cVar.f11239k != colorStateList) {
                    cVar.f11239k = colorStateList;
                    cVar.h(false);
                }
            }
            this.D0 = colorStateList;
            if (this.f6177d != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.J = fVar;
    }

    public void setMaxEms(int i8) {
        this.C = i8;
        EditText editText = this.f6177d;
        if (editText != null && i8 != -1) {
            editText.setMaxEms(i8);
        }
    }

    public void setMaxWidth(int i8) {
        this.E = i8;
        EditText editText = this.f6177d;
        if (editText != null && i8 != -1) {
            editText.setMaxWidth(i8);
        }
    }

    public void setMaxWidthResource(int i8) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i8));
    }

    public void setMinEms(int i8) {
        this.B = i8;
        EditText editText = this.f6177d;
        if (editText != null && i8 != -1) {
            editText.setMinEms(i8);
        }
    }

    public void setMinWidth(int i8) {
        this.D = i8;
        EditText editText = this.f6177d;
        if (editText != null && i8 != -1) {
            editText.setMinWidth(i8);
        }
    }

    public void setMinWidthResource(int i8) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i8));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i8) {
        a aVar = this.f6175c;
        aVar.C.setContentDescription(i8 != 0 ? aVar.getResources().getText(i8) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i8) {
        a aVar = this.f6175c;
        aVar.C.setImageDrawable(i8 != 0 ? f.a.a(aVar.getContext(), i8) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        a aVar = this.f6175c;
        if (z10 && aVar.E != 1) {
            aVar.f(1);
        } else if (!z10) {
            aVar.f(0);
        } else {
            aVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        a aVar = this.f6175c;
        aVar.G = colorStateList;
        a9.p.a(aVar.f6209a, aVar.C, colorStateList, aVar.H);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        a aVar = this.f6175c;
        aVar.H = mode;
        a9.p.a(aVar.f6209a, aVar.C, aVar.G, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.P == null) {
            d0 d0Var = new d0(getContext(), (AttributeSet) null);
            this.P = d0Var;
            d0Var.setId(R.id.textinput_placeholder);
            d0 d0Var2 = this.P;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.s(d0Var2, 2);
            r3.d d10 = d();
            this.S = d10;
            d10.f13835b = 67;
            this.T = d();
            setPlaceholderTextAppearance(this.R);
            setPlaceholderTextColor(this.Q);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.O) {
                setPlaceholderTextEnabled(true);
            }
            this.N = charSequence;
        }
        EditText editText = this.f6177d;
        if (editText != null) {
            editable = editText.getText();
        }
        u(editable);
    }

    public void setPlaceholderTextAppearance(int i8) {
        this.R = i8;
        d0 d0Var = this.P;
        if (d0Var != null) {
            d0Var.setTextAppearance(i8);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            d0 d0Var = this.P;
            if (d0Var != null && colorStateList != null) {
                d0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        x xVar = this.f6173b;
        xVar.getClass();
        xVar.f211c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        xVar.f210b.setText(charSequence);
        xVar.d();
    }

    public void setPrefixTextAppearance(int i8) {
        this.f6173b.f210b.setTextAppearance(i8);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f6173b.f210b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(v8.i iVar) {
        v8.f fVar = this.f6176c0;
        if (fVar != null && fVar.f16250a.f16256a != iVar) {
            this.f6184i0 = iVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f6173b.f212d.setCheckable(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f6173b.f212d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i8) {
        setStartIconDrawable(i8 != 0 ? f.a.a(getContext(), i8) : null);
    }

    public void setStartIconMinSize(int i8) {
        x xVar = this.f6173b;
        if (i8 < 0) {
            xVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i8 != xVar.C) {
            xVar.C = i8;
            CheckableImageButton checkableImageButton = xVar.f212d;
            checkableImageButton.setMinimumWidth(i8);
            checkableImageButton.setMinimumHeight(i8);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        x xVar = this.f6173b;
        View.OnLongClickListener onLongClickListener = xVar.E;
        CheckableImageButton checkableImageButton = xVar.f212d;
        checkableImageButton.setOnClickListener(onClickListener);
        a9.p.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        x xVar = this.f6173b;
        xVar.E = onLongClickListener;
        CheckableImageButton checkableImageButton = xVar.f212d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a9.p.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        x xVar = this.f6173b;
        xVar.D = scaleType;
        xVar.f212d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        x xVar = this.f6173b;
        if (xVar.f213e != colorStateList) {
            xVar.f213e = colorStateList;
            a9.p.a(xVar.f209a, xVar.f212d, colorStateList, xVar.B);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        x xVar = this.f6173b;
        if (xVar.B != mode) {
            xVar.B = mode;
            a9.p.a(xVar.f209a, xVar.f212d, xVar.f213e, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f6173b.b(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        a aVar = this.f6175c;
        aVar.getClass();
        aVar.L = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.M.setText(charSequence);
        aVar.m();
    }

    public void setSuffixTextAppearance(int i8) {
        this.f6175c.M.setTextAppearance(i8);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f6175c.M.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f6177d;
        if (editText != null) {
            i0.n(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f6197v0) {
            this.f6197v0 = typeface;
            this.O0.m(typeface);
            q qVar = this.F;
            if (typeface != qVar.B) {
                qVar.B = typeface;
                d0 d0Var = qVar.f184r;
                if (d0Var != null) {
                    d0Var.setTypeface(typeface);
                }
                d0 d0Var2 = qVar.f191y;
                if (d0Var2 != null) {
                    d0Var2.setTypeface(typeface);
                }
            }
            d0 d0Var3 = this.K;
            if (d0Var3 != null) {
                d0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        d0 d0Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.f6177d;
        boolean z12 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f6177d;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.C0;
        m8.c cVar = this.O0;
        if (colorStateList2 != null) {
            cVar.i(colorStateList2);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.C0;
            cVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.M0) : this.M0));
        } else if (m()) {
            d0 d0Var2 = this.F.f184r;
            cVar.i(d0Var2 != null ? d0Var2.getTextColors() : null);
        } else if (this.I && (d0Var = this.K) != null) {
            cVar.i(d0Var.getTextColors());
        } else if (!(!z13 || (colorStateList = this.D0) == null || cVar.f11239k == colorStateList)) {
            cVar.f11239k = colorStateList;
            cVar.h(false);
        }
        a aVar = this.f6175c;
        x xVar = this.f6173b;
        if (z12 || !this.P0 || (isEnabled() && z13)) {
            if (z11 || this.N0) {
                ValueAnimator valueAnimator = this.R0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.R0.cancel();
                }
                if (!z10 || !this.Q0) {
                    cVar.k(1.0f);
                } else {
                    a(1.0f);
                }
                this.N0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f6177d;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                u(editable);
                xVar.F = false;
                xVar.d();
                aVar.N = false;
                aVar.m();
            }
        } else if (z11 || !this.N0) {
            ValueAnimator valueAnimator2 = this.R0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.R0.cancel();
            }
            if (!z10 || !this.Q0) {
                cVar.k(0.0f);
            } else {
                a(0.0f);
            }
            if (e() && (!((a9.g) this.f6176c0).T.isEmpty()) && e()) {
                ((a9.g) this.f6176c0).s(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.N0 = true;
            d0 d0Var3 = this.P;
            if (d0Var3 != null && this.O) {
                d0Var3.setText((CharSequence) null);
                r3.o.a(this.f6171a, this.T);
                this.P.setVisibility(4);
            }
            xVar.F = true;
            xVar.d();
            aVar.N = true;
            aVar.m();
        }
    }

    public final void u(Editable editable) {
        ((o) this.J).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f6171a;
        if (length != 0 || this.N0) {
            d0 d0Var = this.P;
            if (d0Var != null && this.O) {
                d0Var.setText((CharSequence) null);
                r3.o.a(frameLayout, this.T);
                this.P.setVisibility(4);
            }
        } else if (this.P != null && this.O && !TextUtils.isEmpty(this.N)) {
            this.P.setText(this.N);
            r3.o.a(frameLayout, this.S);
            this.P.setVisibility(0);
            this.P.bringToFront();
            announceForAccessibility(this.N);
        }
    }

    public final void v(boolean z10, boolean z11) {
        int defaultColor = this.H0.getDefaultColor();
        int colorForState = this.H0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.H0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f6192q0 = colorForState2;
        } else if (z11) {
            this.f6192q0 = colorForState;
        } else {
            this.f6192q0 = defaultColor;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r7.f6177d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w() {
        /*
            r7 = this;
            v8.f r0 = r7.f6176c0
            if (r0 == 0) goto L_0x0182
            int r0 = r7.f6187l0
            if (r0 != 0) goto L_0x000a
            goto L_0x0182
        L_0x000a:
            boolean r0 = r7.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r7.f6177d
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r7.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r7.f6177d
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r7.m()
            if (r4 != 0) goto L_0x0042
            androidx.appcompat.widget.d0 r4 = r7.K
            if (r4 == 0) goto L_0x0043
            boolean r4 = r7.I
            if (r4 == 0) goto L_0x0043
        L_0x0042:
            r1 = r2
        L_0x0043:
            boolean r4 = r7.isEnabled()
            if (r4 != 0) goto L_0x004e
            int r4 = r7.M0
            r7.f6192q0 = r4
            goto L_0x008c
        L_0x004e:
            boolean r4 = r7.m()
            if (r4 == 0) goto L_0x0063
            android.content.res.ColorStateList r4 = r7.H0
            if (r4 == 0) goto L_0x005c
            r7.v(r0, r3)
            goto L_0x008c
        L_0x005c:
            int r4 = r7.getErrorCurrentTextColors()
            r7.f6192q0 = r4
            goto L_0x008c
        L_0x0063:
            boolean r4 = r7.I
            if (r4 == 0) goto L_0x007a
            androidx.appcompat.widget.d0 r4 = r7.K
            if (r4 == 0) goto L_0x007a
            android.content.res.ColorStateList r5 = r7.H0
            if (r5 == 0) goto L_0x0073
            r7.v(r0, r3)
            goto L_0x008c
        L_0x0073:
            int r4 = r4.getCurrentTextColor()
            r7.f6192q0 = r4
            goto L_0x008c
        L_0x007a:
            if (r0 == 0) goto L_0x0081
            int r4 = r7.G0
            r7.f6192q0 = r4
            goto L_0x008c
        L_0x0081:
            if (r3 == 0) goto L_0x0088
            int r4 = r7.F0
            r7.f6192q0 = r4
            goto L_0x008c
        L_0x0088:
            int r4 = r7.E0
            r7.f6192q0 = r4
        L_0x008c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x00d7
            android.content.Context r4 = r7.getContext()
            r5 = 2130903375(0x7f03014f, float:1.7413566E38)
            android.util.TypedValue r5 = r8.b.a(r4, r5)
            if (r5 != 0) goto L_0x00a0
            goto L_0x00b2
        L_0x00a0:
            int r6 = r5.resourceId
            if (r6 == 0) goto L_0x00a9
            android.content.res.ColorStateList r4 = t1.a.b(r4, r6)
            goto L_0x00b3
        L_0x00a9:
            int r4 = r5.data
            if (r4 == 0) goto L_0x00b2
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            goto L_0x00b3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            android.widget.EditText r5 = r7.f6177d
            if (r5 == 0) goto L_0x00d7
            android.graphics.drawable.Drawable r5 = r5.getTextCursorDrawable()
            if (r5 == 0) goto L_0x00d7
            if (r4 != 0) goto L_0x00c0
            goto L_0x00d7
        L_0x00c0:
            android.widget.EditText r5 = r7.f6177d
            android.graphics.drawable.Drawable r5 = r5.getTextCursorDrawable()
            if (r1 == 0) goto L_0x00d4
            android.content.res.ColorStateList r1 = r7.H0
            if (r1 == 0) goto L_0x00cd
            goto L_0x00d3
        L_0x00cd:
            int r1 = r7.f6192q0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L_0x00d3:
            r4 = r1
        L_0x00d4:
            w1.a.b.h(r5, r4)
        L_0x00d7:
            com.google.android.material.textfield.a r1 = r7.f6175c
            r1.k()
            com.google.android.material.internal.CheckableImageButton r4 = r1.f6211c
            android.content.res.ColorStateList r5 = r1.f6212d
            com.google.android.material.textfield.TextInputLayout r6 = r1.f6209a
            a9.p.c(r6, r4, r5)
            android.content.res.ColorStateList r4 = r1.G
            com.google.android.material.internal.CheckableImageButton r5 = r1.C
            a9.p.c(r6, r5, r4)
            a9.o r4 = r1.b()
            boolean r4 = r4 instanceof a9.n
            if (r4 == 0) goto L_0x011a
            boolean r4 = r6.m()
            if (r4 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r4 = r5.getDrawable()
            if (r4 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r1 = r5.getDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            int r4 = r6.getErrorCurrentTextColors()
            w1.a.b.g(r1, r4)
            r5.setImageDrawable(r1)
            goto L_0x011a
        L_0x0113:
            android.content.res.ColorStateList r4 = r1.G
            android.graphics.PorterDuff$Mode r1 = r1.H
            a9.p.a(r6, r5, r4, r1)
        L_0x011a:
            a9.x r1 = r7.f6173b
            com.google.android.material.internal.CheckableImageButton r4 = r1.f212d
            android.content.res.ColorStateList r5 = r1.f213e
            com.google.android.material.textfield.TextInputLayout r1 = r1.f209a
            a9.p.c(r1, r4, r5)
            int r1 = r7.f6187l0
            r4 = 2
            if (r1 != r4) goto L_0x015c
            int r1 = r7.f6189n0
            if (r0 == 0) goto L_0x0139
            boolean r4 = r7.isEnabled()
            if (r4 == 0) goto L_0x0139
            int r4 = r7.f6191p0
            r7.f6189n0 = r4
            goto L_0x013d
        L_0x0139:
            int r4 = r7.f6190o0
            r7.f6189n0 = r4
        L_0x013d:
            int r4 = r7.f6189n0
            if (r4 == r1) goto L_0x015c
            boolean r1 = r7.e()
            if (r1 == 0) goto L_0x015c
            boolean r1 = r7.N0
            if (r1 != 0) goto L_0x015c
            boolean r1 = r7.e()
            if (r1 == 0) goto L_0x0159
            v8.f r1 = r7.f6176c0
            a9.g r1 = (a9.g) r1
            r4 = 0
            r1.s(r4, r4, r4, r4)
        L_0x0159:
            r7.j()
        L_0x015c:
            int r1 = r7.f6187l0
            if (r1 != r2) goto L_0x017f
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x016b
            int r0 = r7.J0
            r7.f6193r0 = r0
            goto L_0x017f
        L_0x016b:
            if (r3 == 0) goto L_0x0174
            if (r0 != 0) goto L_0x0174
            int r0 = r7.L0
            r7.f6193r0 = r0
            goto L_0x017f
        L_0x0174:
            if (r0 == 0) goto L_0x017b
            int r0 = r7.K0
            r7.f6193r0 = r0
            goto L_0x017f
        L_0x017b:
            int r0 = r7.I0
            r7.f6193r0 = r0
        L_0x017f:
            r7.b()
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.w():void");
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f6173b.a(drawable);
    }

    public void setHint(int i8) {
        setHint(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setStartIconContentDescription(int i8) {
        setStartIconContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f6175c.C.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f6175c.C.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f6175c.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f6175c.C;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        a aVar = this.f6175c;
        CheckableImageButton checkableImageButton = aVar.C;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = aVar.G;
            PorterDuff.Mode mode = aVar.H;
            TextInputLayout textInputLayout = aVar.f6209a;
            a9.p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            a9.p.c(textInputLayout, checkableImageButton, aVar.G);
        }
    }
}
