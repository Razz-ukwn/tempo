package d8;

import ag.n2;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.activity.g;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.h1;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m8.s;
import m8.v;
import s3.d;
import s3.e;
import u1.f;
import w1.a;

public final class a extends f {
    public static final int[] U = {R.attr.state_indeterminate};
    public static final int[] V = {R.attr.state_error};
    public static final int[][] W = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @SuppressLint({"DiscouragedApi"})

    /* renamed from: a0  reason: collision with root package name */
    public static final int f7381a0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final LinkedHashSet<b> B = new LinkedHashSet<>();
    public ColorStateList C;
    public boolean D;
    public boolean E;
    public boolean F;
    public CharSequence G;
    public Drawable H;
    public Drawable I;
    public boolean J;
    public ColorStateList K;
    public ColorStateList L;
    public PorterDuff.Mode M;
    public int N;
    public int[] O;
    public boolean P;
    public CharSequence Q;
    public CompoundButton.OnCheckedChangeListener R;
    public final s3.d S;
    public final C0114a T;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet<c> f7382e = new LinkedHashSet<>();

    /* renamed from: d8.a$a  reason: collision with other inner class name */
    public class C0114a extends s3.c {
        public C0114a() {
        }

        public final void a(Drawable drawable) {
            ColorStateList colorStateList = a.this.K;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }

        public final void b(Drawable drawable) {
            a aVar = a.this;
            ColorStateList colorStateList = aVar.K;
            if (colorStateList != null) {
                a.b.g(drawable, colorStateList.getColorForState(aVar.O, colorStateList.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new C0115a();

        /* renamed from: a  reason: collision with root package name */
        public int f7384a;

        /* renamed from: d8.a$d$a  reason: collision with other inner class name */
        public class C0115a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i8 = this.f7384a;
            return g.a(sb2, i8 != 1 ? i8 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeValue(Integer.valueOf(this.f7384a));
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f7384a = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.checkboxStyle, 2132018213), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        s3.d dVar = new s3.d(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = u1.f.f15671a;
        Drawable a10 = f.a.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        dVar.f14610a = a10;
        a10.setCallback(dVar.B);
        new d.c(dVar.f14610a.getConstantState());
        this.S = dVar;
        this.T = new C0114a();
        Context context3 = getContext();
        this.H = h2.c.a(this);
        this.K = getSuperButtonTintList();
        setSupportButtonTintList((ColorStateList) null);
        h1 e10 = s.e(context3, attributeSet, n2.U, R.attr.checkboxStyle, 2132018213, new int[0]);
        this.I = e10.e(2);
        if (this.H != null && r8.b.b(context3, R.attr.isMaterial3Theme, false)) {
            if (e10.i(0, 0) == f7381a0 && e10.i(1, 0) == 0) {
                super.setButtonDrawable((Drawable) null);
                this.H = f.a.a(context3, R.drawable.mtrl_checkbox_button);
                this.J = true;
                if (this.I == null) {
                    this.I = f.a.a(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.L = r8.c.b(context3, e10, 3);
        this.M = v.d(e10.h(4, -1), PorterDuff.Mode.SRC_IN);
        this.D = e10.a(10, false);
        this.E = e10.a(6, true);
        this.F = e10.a(9, false);
        this.G = e10.k(8);
        if (e10.l(7)) {
            setCheckedState(e10.h(7, 0));
        }
        e10.n();
        b();
    }

    private String getButtonStateDescription() {
        int i8 = this.N;
        return i8 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i8 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.C == null) {
            int f10 = b1.b.f(this, R.attr.colorControlActivated);
            int f11 = b1.b.f(this, R.attr.colorError);
            int f12 = b1.b.f(this, R.attr.colorSurface);
            int f13 = b1.b.f(this, R.attr.colorOnSurface);
            this.C = new ColorStateList(W, new int[]{b1.b.h(1.0f, f12, f11), b1.b.h(1.0f, f12, f10), b1.b.h(0.54f, f12, f13), b1.b.h(0.38f, f12, f13), b1.b.h(0.38f, f12, f13)});
        }
        return this.C;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.K;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        int i8;
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e eVar;
        Drawable drawable = this.H;
        ColorStateList colorStateList3 = this.K;
        PorterDuff.Mode b10 = h2.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b10 != null) {
                a.b.i(drawable, b10);
            }
        }
        this.H = drawable;
        Drawable drawable2 = this.I;
        ColorStateList colorStateList4 = this.L;
        PorterDuff.Mode mode = this.M;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                a.b.i(drawable2, mode);
            }
        }
        this.I = drawable2;
        if (this.J) {
            s3.d dVar = this.S;
            if (dVar != null) {
                Drawable drawable3 = dVar.f14610a;
                C0114a aVar = this.T;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f14598a == null) {
                        aVar.f14598a = new s3.b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f14598a);
                }
                ArrayList<s3.c> arrayList = dVar.f14602e;
                d.b bVar = dVar.f14599b;
                if (!(arrayList == null || aVar == null)) {
                    arrayList.remove(aVar);
                    if (dVar.f14602e.size() == 0 && (eVar = dVar.f14601d) != null) {
                        bVar.f14605b.removeListener(eVar);
                        dVar.f14601d = null;
                    }
                }
                Drawable drawable4 = dVar.f14610a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f14598a == null) {
                        aVar.f14598a = new s3.b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f14598a);
                } else if (aVar != null) {
                    if (dVar.f14602e == null) {
                        dVar.f14602e = new ArrayList<>();
                    }
                    if (!dVar.f14602e.contains(aVar)) {
                        dVar.f14602e.add(aVar);
                        if (dVar.f14601d == null) {
                            dVar.f14601d = new e(dVar);
                        }
                        bVar.f14605b.addListener(dVar.f14601d);
                    }
                }
            }
            Drawable drawable5 = this.H;
            if ((drawable5 instanceof AnimatedStateListDrawable) && dVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                ((AnimatedStateListDrawable) this.H).addTransition(R.id.indeterminate, R.id.unchecked, dVar, false);
            }
        }
        Drawable drawable6 = this.H;
        if (!(drawable6 == null || (colorStateList2 = this.K) == null)) {
            a.b.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.I;
        if (!(drawable7 == null || (colorStateList = this.L) == null)) {
            a.b.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.H;
        Drawable drawable9 = this.I;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            if (drawable9.getIntrinsicWidth() == -1 || drawable9.getIntrinsicHeight() == -1) {
                int intrinsicWidth = drawable8.getIntrinsicWidth();
                i8 = drawable8.getIntrinsicHeight();
                i10 = intrinsicWidth;
            } else if (drawable9.getIntrinsicWidth() > drawable8.getIntrinsicWidth() || drawable9.getIntrinsicHeight() > drawable8.getIntrinsicHeight()) {
                float intrinsicWidth2 = ((float) drawable9.getIntrinsicWidth()) / ((float) drawable9.getIntrinsicHeight());
                if (intrinsicWidth2 >= ((float) drawable8.getIntrinsicWidth()) / ((float) drawable8.getIntrinsicHeight())) {
                    i10 = drawable8.getIntrinsicWidth();
                    i8 = (int) (((float) i10) / intrinsicWidth2);
                } else {
                    i8 = drawable8.getIntrinsicHeight();
                    i10 = (int) (intrinsicWidth2 * ((float) i8));
                }
            } else {
                i10 = drawable9.getIntrinsicWidth();
                i8 = drawable9.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, i10, i8);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.H;
    }

    public Drawable getButtonIconDrawable() {
        return this.I;
    }

    public ColorStateList getButtonIconTintList() {
        return this.L;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.M;
    }

    public ColorStateList getButtonTintList() {
        return this.K;
    }

    public int getCheckedState() {
        return this.N;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.G;
    }

    public final boolean isChecked() {
        return this.N == 1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D && this.K == null && this.L == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, U);
        }
        if (this.F) {
            View.mergeDrawableStates(onCreateDrawableState, V);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i11 = onCreateDrawableState[i10];
            if (i11 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i11 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i10] = 16842912;
                break;
            } else {
                i10++;
            }
        }
        this.O = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable a10;
        if (!this.E || !TextUtils.isEmpty(getText()) || (a10 = h2.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * (v.c(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a10.getBounds();
            a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.F) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.G);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f7384a);
    }

    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f7384a = getCheckedState();
        return dVar;
    }

    public void setButtonDrawable(int i8) {
        setButtonDrawable(f.a.a(getContext(), i8));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.I = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i8) {
        setButtonIconDrawable(f.a.a(getContext(), i8));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            b();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.M != mode) {
            this.M = mode;
            b();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            b();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.E = z10;
    }

    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i8) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.N != i8) {
            this.N = i8;
            super.setChecked(i8 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.Q == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.P) {
                this.P = true;
                LinkedHashSet<b> linkedHashSet = this.B;
                if (linkedHashSet != null) {
                    Iterator<b> it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                }
                if (!(this.N == 2 || (onCheckedChangeListener = this.R) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
                if (autofillManager != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.P = false;
            }
        }
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.G = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i8) {
        setErrorAccessibilityLabel(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            refreshDrawableState();
            Iterator<c> it = this.f7382e.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.R = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.Q = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.D = z10;
        if (z10) {
            h2.b.c(this, getMaterialThemeColorsTintList());
        } else {
            h2.b.c(this, (ColorStateList) null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.H = drawable;
        this.J = false;
        b();
    }
}
