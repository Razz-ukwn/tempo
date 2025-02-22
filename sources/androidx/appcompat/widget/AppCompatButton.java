package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.quickkonnect.silencio.R;
import h2.l;

public class AppCompatButton extends Button {

    /* renamed from: a  reason: collision with root package name */
    public final e f817a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f818b;

    /* renamed from: c  reason: collision with root package name */
    public m f819c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private m getEmojiTextViewHelper() {
        if (this.f819c == null) {
            this.f819c = new m(this);
        }
        return this.f819c;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.a();
        }
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (q1.f1114b) {
            return super.getAutoSizeMaxTextSize();
        }
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            return Math.round(a0Var.f933i.f985e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (q1.f1114b) {
            return super.getAutoSizeMinTextSize();
        }
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            return Math.round(a0Var.f933i.f984d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (q1.f1114b) {
            return super.getAutoSizeStepGranularity();
        }
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            return Math.round(a0Var.f933i.f983c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (q1.f1114b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        a0 a0Var = this.f818b;
        return a0Var != null ? a0Var.f933i.f986f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (q1.f1114b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            return a0Var.f933i.f981a;
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof l.f ? ((l.f) customSelectionActionModeCallback).f9105a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f817a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f817a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f818b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f818b.e();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        a0 a0Var = this.f818b;
        if (a0Var != null && !q1.f1114b) {
            a0Var.f933i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        super.onTextChanged(charSequence, i8, i10, i11);
        boolean z10 = false;
        a0 a0Var = this.f818b;
        if (a0Var != null && !q1.f1114b) {
            e0 e0Var = a0Var.f933i;
            if (e0Var.i() && e0Var.f981a != 0) {
                z10 = true;
            }
        }
        if (z10) {
            a0Var.f933i.a();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i10, int i11, int i12) {
        if (q1.f1114b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i8, i10, i11, i12);
            return;
        }
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            a0Var.h(i8, i10, i11, i12);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8) {
        if (q1.f1114b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
            return;
        }
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            a0Var.i(iArr, i8);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i8) {
        if (q1.f1114b) {
            super.setAutoSizeTextTypeWithDefaults(i8);
            return;
        }
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            a0Var.j(i8);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.d(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1076b.f13782a.a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            a0Var.f925a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f817a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f818b;
        a0Var.k(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f818b;
        a0Var.l(mode);
        a0Var.b();
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        a0 a0Var = this.f818b;
        if (a0Var != null) {
            a0Var.g(context, i8);
        }
    }

    public final void setTextSize(int i8, float f10) {
        boolean z10 = q1.f1114b;
        if (z10) {
            super.setTextSize(i8, f10);
            return;
        }
        a0 a0Var = this.f818b;
        if (a0Var != null && !z10) {
            e0 e0Var = a0Var.f933i;
            if (!(e0Var.i() && e0Var.f981a != 0)) {
                e0Var.f(i8, f10);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        e1.a(context);
        c1.a(this, getContext());
        e eVar = new e(this);
        this.f817a = eVar;
        eVar.d(attributeSet, i8);
        a0 a0Var = new a0(this);
        this.f818b = a0Var;
        a0Var.f(attributeSet, i8);
        a0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i8);
    }
}
