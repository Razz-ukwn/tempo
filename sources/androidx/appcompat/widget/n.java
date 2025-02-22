package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.quickkonnect.silencio.R;

public class n extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public final e f1084a;

    /* renamed from: b  reason: collision with root package name */
    public final o f1085b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1086c;

    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1084a;
        if (eVar != null) {
            eVar.a();
        }
        o oVar = this.f1085b;
        if (oVar != null) {
            oVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1084a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1084a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f1 f1Var;
        o oVar = this.f1085b;
        if (oVar == null || (f1Var = oVar.f1095b) == null) {
            return null;
        }
        return f1Var.f997a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f1 f1Var;
        o oVar = this.f1085b;
        if (oVar == null || (f1Var = oVar.f1095b) == null) {
            return null;
        }
        return f1Var.f998b;
    }

    public final boolean hasOverlappingRendering() {
        return ((this.f1085b.f1094a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1084a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f1084a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        o oVar = this.f1085b;
        if (oVar != null) {
            oVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        o oVar = this.f1085b;
        if (!(oVar == null || drawable == null || this.f1086c)) {
            oVar.f1096c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (oVar != null) {
            oVar.a();
            if (!this.f1086c) {
                ImageView imageView = oVar.f1094a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(oVar.f1096c);
                }
            }
        }
    }

    public void setImageLevel(int i8) {
        super.setImageLevel(i8);
        this.f1086c = true;
    }

    public void setImageResource(int i8) {
        this.f1085b.c(i8);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        o oVar = this.f1085b;
        if (oVar != null) {
            oVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1084a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1084a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        o oVar = this.f1085b;
        if (oVar != null) {
            if (oVar.f1095b == null) {
                oVar.f1095b = new f1();
            }
            f1 f1Var = oVar.f1095b;
            f1Var.f997a = colorStateList;
            f1Var.f1000d = true;
            oVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1085b;
        if (oVar != null) {
            if (oVar.f1095b == null) {
                oVar.f1095b = new f1();
            }
            f1 f1Var = oVar.f1095b;
            f1Var.f998b = mode;
            f1Var.f999c = true;
            oVar.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        e1.a(context);
        this.f1086c = false;
        c1.a(this, getContext());
        e eVar = new e(this);
        this.f1084a = eVar;
        eVar.d(attributeSet, i8);
        o oVar = new o(this);
        this.f1085b = oVar;
        oVar.b(attributeSet, i8);
    }
}
