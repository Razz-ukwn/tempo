package a9;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.q;
import com.google.android.material.textfield.TextInputLayout;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.Locale;
import java.util.WeakHashMap;
import m8.s;
import r8.c;
import w1.a;

public final class t extends d {
    public final AccessibilityManager B;
    public final Rect C = new Rect();
    public final int D;
    public final float E;
    public int F;
    public ColorStateList G;

    /* renamed from: e  reason: collision with root package name */
    public final p0 f200e;

    public class a<T> extends ArrayAdapter<String> {

        /* renamed from: a  reason: collision with root package name */
        public ColorStateList f201a;

        /* renamed from: b  reason: collision with root package name */
        public ColorStateList f202b;

        public a(Context context, int i8, String[] strArr) {
            super(context, i8, strArr);
            b();
        }

        public final void b() {
            ColorStateList colorStateList;
            t tVar = t.this;
            ColorStateList colorStateList2 = tVar.G;
            ColorStateList colorStateList3 = null;
            if (!(colorStateList2 != null)) {
                colorStateList = null;
            } else {
                int[] iArr = {16842919};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            }
            this.f202b = colorStateList;
            if (tVar.F != 0) {
                if (tVar.G != null) {
                    int[] iArr2 = {16843623, -16842919};
                    int[] iArr3 = {16842913, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{v1.d.b(tVar.G.getColorForState(iArr3, 0), tVar.F), v1.d.b(tVar.G.getColorForState(iArr2, 0), tVar.F), tVar.F});
                }
            }
            this.f201a = colorStateList3;
        }

        public final View getView(int i8, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i8, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                t tVar = t.this;
                RippleDrawable rippleDrawable = null;
                if (tVar.getText().toString().contentEquals(textView.getText())) {
                    if (tVar.F != 0) {
                        ColorDrawable colorDrawable = new ColorDrawable(tVar.F);
                        if (this.f202b != null) {
                            a.b.h(colorDrawable, this.f201a);
                            rippleDrawable = new RippleDrawable(this.f202b, colorDrawable, (Drawable) null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.q(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public t(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, n2.O, R.attr.autoCompleteTextViewStyle, 2132017933, new int[0]);
        if (d10.hasValue(0) && d10.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.D = d10.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.E = (float) d10.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.F = d10.getColor(3, 0);
        this.G = c.a(context2, d10, 4);
        this.B = (AccessibilityManager) context2.getSystemService("accessibility");
        p0 p0Var = new p0(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.f200e = p0Var;
        p0Var.U = true;
        q qVar = p0Var.V;
        qVar.setFocusable(true);
        p0Var.K = this;
        qVar.setInputMethodMode(2);
        p0Var.p(getAdapter());
        p0Var.L = new s(this);
        if (d10.hasValue(5)) {
            setSimpleItems(d10.getResourceId(5, 0));
        }
        d10.recycle();
    }

    public static void a(t tVar, Object obj) {
        tVar.setText(tVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.B;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f200e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public CharSequence getHint() {
        TextInputLayout b10 = b();
        return (b10 == null || !b10.f6174b0) ? super.getHint() : b10.getHint();
    }

    public float getPopupElevation() {
        return this.E;
    }

    public int getSimpleItemSelectedColor() {
        return this.F;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.G;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.f6174b0 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f200e.dismiss();
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
        if (View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i11 = 0;
            if (!(adapter == null || b10 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                p0 p0Var = this.f200e;
                int min = Math.min(adapter.getCount(), Math.max(0, !p0Var.a() ? -1 : p0Var.f1104c.getSelectedItemPosition()) + 15);
                View view = null;
                int i12 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i11) {
                        view = null;
                        i11 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 = Math.max(i12, view.getMeasuredWidth());
                }
                Drawable h3 = p0Var.h();
                if (h3 != null) {
                    Rect rect = this.C;
                    h3.getPadding(rect);
                    i12 += rect.left + rect.right;
                }
                i11 = b10.getEndIconView().getMeasuredWidth() + i12;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i11), View.MeasureSpec.getSize(i8)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z10) {
        AccessibilityManager accessibilityManager = this.B;
        if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
            super.onWindowFocusChanged(z10);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f200e.p(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        p0 p0Var = this.f200e;
        if (p0Var != null) {
            p0Var.k(drawable);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f200e.M = getOnItemSelectedListener();
    }

    public void setRawInputType(int i8) {
        super.setRawInputType(i8);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.r();
        }
    }

    public void setSimpleItemSelectedColor(int i8) {
        this.F = i8;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i8) {
        setSimpleItems(getResources().getStringArray(i8));
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.B;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f200e.b();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.D, strArr));
    }
}
