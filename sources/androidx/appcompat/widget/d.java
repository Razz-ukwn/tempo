package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.quickkonnect.silencio.R;
import f.a;
import h2.l;

public class d extends AutoCompleteTextView {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f963d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final e f964a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f965b;

    /* renamed from: c  reason: collision with root package name */
    public final l f966c;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f964a;
        if (eVar != null) {
            eVar.a();
        }
        a0 a0Var = this.f965b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof l.f ? ((l.f) customSelectionActionModeCallback).f9105a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f964a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f964a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f965b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f965b.e();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        cb.d.V(this, editorInfo, onCreateInputConnection);
        return this.f966c.f(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f964a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f964a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f965b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f965b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.d(callback, this));
    }

    public void setDropDownBackgroundResource(int i8) {
        setDropDownBackgroundDrawable(a.a(getContext(), i8));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f966c.g(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f966c.b(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f964a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f964a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f965b;
        a0Var.k(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f965b;
        a0Var.l(mode);
        a0Var.b();
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        a0 a0Var = this.f965b;
        if (a0Var != null) {
            a0Var.g(context, i8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        e1.a(context);
        c1.a(this, getContext());
        h1 m = h1.m(getContext(), attributeSet, f963d, R.attr.autoCompleteTextViewStyle);
        if (m.l(0)) {
            setDropDownBackgroundDrawable(m.e(0));
        }
        m.n();
        e eVar = new e(this);
        this.f964a = eVar;
        eVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        a0 a0Var = new a0(this);
        this.f965b = a0Var;
        a0Var.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        a0Var.b();
        l lVar = new l((EditText) this);
        this.f966c = lVar;
        lVar.e(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener b10 = lVar.b(keyListener);
            if (b10 != keyListener) {
                super.setKeyListener(b10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }
}
