package q8;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import com.quickkonnect.silencio.R;
import h2.b;
import r8.c;

public final class a extends s {
    public static final int[][] C = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public boolean B;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f13469e;

    public a(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.radioButtonStyle, 2132018214), attributeSet);
        Context context2 = getContext();
        TypedArray d10 = m8.s.d(context2, attributeSet, n2.V, R.attr.radioButtonStyle, 2132018214, new int[0]);
        if (d10.hasValue(0)) {
            b.c(this, c.a(context2, d10, 0));
        }
        this.B = d10.getBoolean(1, false);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f13469e == null) {
            int f10 = b1.b.f(this, R.attr.colorControlActivated);
            int f11 = b1.b.f(this, R.attr.colorOnSurface);
            int f12 = b1.b.f(this, R.attr.colorSurface);
            this.f13469e = new ColorStateList(C, new int[]{b1.b.h(1.0f, f12, f10), b1.b.h(0.54f, f12, f11), b1.b.h(0.38f, f12, f11), b1.b.h(0.38f, f12, f11)});
        }
        return this.f13469e;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.B = z10;
        if (z10) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, (ColorStateList) null);
        }
    }
}
