package a9;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.h1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.p;
import java.util.WeakHashMap;
import m8.v;
import r8.c;

@SuppressLint({"ViewConstructor"})
public final class x extends LinearLayout {
    public PorterDuff.Mode B;
    public int C;
    public ImageView.ScaleType D;
    public View.OnLongClickListener E;
    public boolean F;

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f209a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f210b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f211c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f212d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f213e;

    public x(TextInputLayout textInputLayout, h1 h1Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f209a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.f212d = checkableImageButton;
        CharSequence charSequence = null;
        d0 d0Var = new d0(getContext(), (AttributeSet) null);
        this.f210b = d0Var;
        if (c.e(getContext())) {
            p.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.E;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        p.d(checkableImageButton, onLongClickListener);
        this.E = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        p.d(checkableImageButton, (View.OnLongClickListener) null);
        if (h1Var.l(67)) {
            this.f213e = c.b(getContext(), h1Var, 67);
        }
        if (h1Var.l(68)) {
            this.B = v.d(h1Var.h(68, -1), (PorterDuff.Mode) null);
        }
        if (h1Var.l(64)) {
            a(h1Var.e(64));
            if (h1Var.l(63) && checkableImageButton.getContentDescription() != (k10 = h1Var.k(63))) {
                checkableImageButton.setContentDescription(k10);
            }
            checkableImageButton.setCheckable(h1Var.a(62, true));
        }
        int d10 = h1Var.d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.C) {
                this.C = d10;
                checkableImageButton.setMinimumWidth(d10);
                checkableImageButton.setMinimumHeight(d10);
            }
            if (h1Var.l(66)) {
                ImageView.ScaleType b10 = p.b(h1Var.h(66, -1));
                this.D = b10;
                checkableImageButton.setScaleType(b10);
            }
            d0Var.setVisibility(8);
            d0Var.setId(R.id.textinput_prefix_text);
            d0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.g.f(d0Var, 1);
            d0Var.setTextAppearance(h1Var.i(58, 0));
            if (h1Var.l(59)) {
                d0Var.setTextColor(h1Var.b(59));
            }
            CharSequence k11 = h1Var.k(57);
            this.f211c = !TextUtils.isEmpty(k11) ? k11 : charSequence;
            d0Var.setText(k11);
            d();
            addView(checkableImageButton);
            addView(d0Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f212d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f213e;
            PorterDuff.Mode mode = this.B;
            TextInputLayout textInputLayout = this.f209a;
            p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            p.c(textInputLayout, checkableImageButton, this.f213e);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.E;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        p.d(checkableImageButton, onLongClickListener);
        this.E = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        p.d(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void b(boolean z10) {
        CheckableImageButton checkableImageButton = this.f212d;
        int i8 = 0;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            if (!z10) {
                i8 = 8;
            }
            checkableImageButton.setVisibility(i8);
            c();
            d();
        }
    }

    public final void c() {
        EditText editText = this.f209a.f6177d;
        if (editText != null) {
            int i8 = 0;
            if (!(this.f212d.getVisibility() == 0)) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i8 = i0.e.f(editText);
            }
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
            i0.e.k(this.f210b, i8, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void d() {
        int i8 = 8;
        int i10 = (this.f211c == null || this.F) ? 8 : 0;
        if (this.f212d.getVisibility() == 0 || i10 == 0) {
            i8 = 0;
        }
        setVisibility(i8);
        this.f210b.setVisibility(i10);
        this.f209a.p();
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
        c();
    }
}
