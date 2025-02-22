package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.quickkonnect.silencio.R;
import f.a;
import h2.o;

public class f extends CheckBox implements o {

    /* renamed from: a  reason: collision with root package name */
    public final i f993a;

    /* renamed from: b  reason: collision with root package name */
    public final e f994b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f995c;

    /* renamed from: d  reason: collision with root package name */
    public m f996d;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private m getEmojiTextViewHelper() {
        if (this.f996d == null) {
            this.f996d = new m(this);
        }
        return this.f996d;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f994b;
        if (eVar != null) {
            eVar.a();
        }
        a0 a0Var = this.f995c;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f993a;
        if (iVar != null) {
            iVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f994b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f994b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f993a;
        if (iVar != null) {
            return iVar.f1018b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f993a;
        if (iVar != null) {
            return iVar.f1019c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f995c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f995c.e();
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f994b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f994b;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f993a;
        if (iVar == null) {
            return;
        }
        if (iVar.f1022f) {
            iVar.f1022f = false;
            return;
        }
        iVar.f1022f = true;
        iVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f995c;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f995c;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1076b.f13782a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f994b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f994b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f993a;
        if (iVar != null) {
            iVar.f1018b = colorStateList;
            iVar.f1020d = true;
            iVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f993a;
        if (iVar != null) {
            iVar.f1019c = mode;
            iVar.f1021e = true;
            iVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f995c;
        a0Var.k(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f995c;
        a0Var.l(mode);
        a0Var.b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        e1.a(context);
        c1.a(this, getContext());
        i iVar = new i(this);
        this.f993a = iVar;
        iVar.b(attributeSet, i8);
        e eVar = new e(this);
        this.f994b = eVar;
        eVar.d(attributeSet, i8);
        a0 a0Var = new a0(this);
        this.f995c = a0Var;
        a0Var.f(attributeSet, i8);
        getEmojiTextViewHelper().a(attributeSet, i8);
    }

    public void setButtonDrawable(int i8) {
        setButtonDrawable(a.a(getContext(), i8));
    }
}
