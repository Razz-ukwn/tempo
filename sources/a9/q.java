package a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import com.google.android.material.textfield.TextInputLayout;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r8.c;

public final class q {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f168a;

    /* renamed from: b  reason: collision with root package name */
    public final int f169b;

    /* renamed from: c  reason: collision with root package name */
    public final int f170c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f171d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f172e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f173f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f174g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f175h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f176i;

    /* renamed from: j  reason: collision with root package name */
    public int f177j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f178k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f179l;
    public final float m;

    /* renamed from: n  reason: collision with root package name */
    public int f180n;

    /* renamed from: o  reason: collision with root package name */
    public int f181o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f182p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f183q;

    /* renamed from: r  reason: collision with root package name */
    public d0 f184r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f185s;

    /* renamed from: t  reason: collision with root package name */
    public int f186t;

    /* renamed from: u  reason: collision with root package name */
    public int f187u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f188v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f189w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f190x;

    /* renamed from: y  reason: collision with root package name */
    public d0 f191y;

    /* renamed from: z  reason: collision with root package name */
    public int f192z;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f193a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f194b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f195c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f196d;

        public a(int i8, TextView textView, int i10, TextView textView2) {
            this.f193a = i8;
            this.f194b = textView;
            this.f195c = i10;
            this.f196d = textView2;
        }

        public final void onAnimationEnd(Animator animator) {
            d0 d0Var;
            int i8 = this.f193a;
            q qVar = q.this;
            qVar.f180n = i8;
            qVar.f179l = null;
            TextView textView = this.f194b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f195c == 1 && (d0Var = qVar.f184r) != null) {
                    d0Var.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f196d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f196d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f174g = context;
        this.f175h = textInputLayout;
        this.m = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f168a = n8.a.c(context, R.attr.motionDurationShort4, 217);
        this.f169b = n8.a.c(context, R.attr.motionDurationMedium4, 167);
        this.f170c = n8.a.c(context, R.attr.motionDurationShort4, 167);
        this.f171d = n8.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, v7.a.f16231d);
        LinearInterpolator linearInterpolator = v7.a.f16228a;
        this.f172e = n8.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f173f = n8.a.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i8) {
        if (this.f176i == null && this.f178k == null) {
            Context context = this.f174g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f176i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f176i;
            TextInputLayout textInputLayout = this.f175h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f178k = new FrameLayout(context);
            this.f176i.addView(this.f178k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i8 == 0 || i8 == 1) {
            this.f178k.setVisibility(0);
            this.f178k.addView(textView);
        } else {
            this.f176i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f176i.setVisibility(0);
        this.f177j++;
    }

    public final void b() {
        LinearLayout linearLayout = this.f176i;
        TextInputLayout textInputLayout = this.f175h;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f174g;
            boolean e10 = c.e(context);
            LinearLayout linearLayout2 = this.f176i;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            int f10 = i0.e.f(editText);
            if (e10) {
                f10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (e10) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e11 = i0.e.e(editText);
            if (e10) {
                e11 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            i0.e.k(linearLayout2, f10, dimensionPixelSize, e11, 0);
        }
    }

    public final void c() {
        Animator animator = this.f179l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i8, int i10, int i11) {
        if (textView != null && z10) {
            if (i8 == i11 || i8 == i10) {
                boolean z11 = i11 == i8;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z11 ? 1.0f : 0.0f});
                int i12 = this.f170c;
                ofFloat.setDuration((long) (z11 ? this.f169b : i12));
                ofFloat.setInterpolator(z11 ? this.f172e : this.f173f);
                if (i8 == i11 && i10 != 0) {
                    ofFloat.setStartDelay((long) i12);
                }
                arrayList.add(ofFloat);
                if (i11 == i8 && i10 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.m, 0.0f});
                    ofFloat2.setDuration((long) this.f168a);
                    ofFloat2.setInterpolator(this.f171d);
                    ofFloat2.setStartDelay((long) i12);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i8) {
        if (i8 == 1) {
            return this.f184r;
        }
        if (i8 != 2) {
            return null;
        }
        return this.f191y;
    }

    public final void f() {
        this.f182p = null;
        c();
        if (this.f180n == 1) {
            if (!this.f190x || TextUtils.isEmpty(this.f189w)) {
                this.f181o = 0;
            } else {
                this.f181o = 2;
            }
        }
        i(this.f180n, this.f181o, h(this.f184r, ""));
    }

    public final void g(TextView textView, int i8) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f176i;
        if (linearLayout != null) {
            boolean z10 = true;
            if (!(i8 == 0 || i8 == 1)) {
                z10 = false;
            }
            if (!z10 || (frameLayout = this.f178k) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i10 = this.f177j - 1;
            this.f177j = i10;
            LinearLayout linearLayout2 = this.f176i;
            if (i10 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        TextInputLayout textInputLayout = this.f175h;
        return i0.g.c(textInputLayout) && textInputLayout.isEnabled() && (this.f181o != this.f180n || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i8, int i10, boolean z10) {
        TextView e10;
        TextView e11;
        int i11 = i8;
        int i12 = i10;
        boolean z11 = z10;
        if (i11 != i12) {
            if (z11) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f179l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i13 = i8;
                int i14 = i10;
                d(arrayList2, this.f190x, this.f191y, 2, i13, i14);
                d(arrayList2, this.f183q, this.f184r, 1, i13, i14);
                cb.c.k(animatorSet, arrayList);
                animatorSet.addListener(new a(i10, e(i8), i8, e(i12)));
                animatorSet.start();
            } else if (i11 != i12) {
                if (!(i12 == 0 || (e11 = e(i12)) == null)) {
                    e11.setVisibility(0);
                    e11.setAlpha(1.0f);
                }
                if (!(i11 == 0 || (e10 = e(i8)) == null)) {
                    e10.setVisibility(4);
                    if (i11 == 1) {
                        e10.setText((CharSequence) null);
                    }
                }
                this.f180n = i12;
            }
            TextInputLayout textInputLayout = this.f175h;
            textInputLayout.q();
            textInputLayout.t(z11, false);
            textInputLayout.w();
        }
    }
}
