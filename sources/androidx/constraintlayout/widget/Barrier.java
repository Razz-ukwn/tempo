package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import l1.a;
import l1.d;

public class Barrier extends a {
    public int E;
    public int F;
    public a G;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.G.f10807v0;
    }

    public int getMargin() {
        return this.G.f10808w0;
    }

    public int getType() {
        return this.E;
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.G = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gf.f4584c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.G.f10807v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.G.f10808w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1602d = this.G;
        k();
    }

    public final void j(d dVar, boolean z10) {
        int i8 = this.E;
        this.F = i8;
        if (z10) {
            if (i8 == 5) {
                this.F = 1;
            } else if (i8 == 6) {
                this.F = 0;
            }
        } else if (i8 == 5) {
            this.F = 0;
        } else if (i8 == 6) {
            this.F = 1;
        }
        if (dVar instanceof a) {
            ((a) dVar).f10806u0 = this.F;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.G.f10807v0 = z10;
    }

    public void setDpMargin(int i8) {
        this.G.f10808w0 = (int) ((((float) i8) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i8) {
        this.G.f10808w0 = i8;
    }

    public void setType(int i8) {
        this.E = i8;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
