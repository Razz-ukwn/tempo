package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import l1.d;
import l1.j;
import o1.f;

public class Flow extends f {
    public l1.f G;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.G = new l1.f();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gf.f4584c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 0) {
                    this.G.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    l1.f fVar = this.G;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar.f10919u0 = dimensionPixelSize;
                    fVar.f10920v0 = dimensionPixelSize;
                    fVar.f10921w0 = dimensionPixelSize;
                    fVar.f10922x0 = dimensionPixelSize;
                } else if (index == 18) {
                    l1.f fVar2 = this.G;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar2.f10921w0 = dimensionPixelSize2;
                    fVar2.f10923y0 = dimensionPixelSize2;
                    fVar2.f10924z0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.G.f10922x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.G.f10923y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.G.f10919u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.G.f10924z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.G.f10920v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.G.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.G.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.G.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.G.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.G.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.G.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.G.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.G.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.G.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.G.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.G.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.G.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.G.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.G.T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.G.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.G.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.G.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.G.W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1602d = this.G;
        k();
    }

    public final void j(d dVar, boolean z10) {
        l1.f fVar = this.G;
        int i8 = fVar.f10921w0;
        if (i8 <= 0 && fVar.f10922x0 <= 0) {
            return;
        }
        if (z10) {
            fVar.f10923y0 = fVar.f10922x0;
            fVar.f10924z0 = i8;
            return;
        }
        fVar.f10923y0 = i8;
        fVar.f10924z0 = fVar.f10922x0;
    }

    public final void l(j jVar, int i8, int i10) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (jVar != null) {
            jVar.S(mode, size, mode2, size2);
            setMeasuredDimension(jVar.B0, jVar.C0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i8, int i10) {
        l(this.G, i8, i10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.G.N0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i8) {
        this.G.H0 = i8;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.G.O0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i8) {
        this.G.I0 = i8;
        requestLayout();
    }

    public void setHorizontalAlign(int i8) {
        this.G.T0 = i8;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.G.L0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i8) {
        this.G.R0 = i8;
        requestLayout();
    }

    public void setHorizontalStyle(int i8) {
        this.G.F0 = i8;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.G.P0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i8) {
        this.G.J0 = i8;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.G.Q0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i8) {
        this.G.K0 = i8;
        requestLayout();
    }

    public void setMaxElementsWrap(int i8) {
        this.G.W0 = i8;
        requestLayout();
    }

    public void setOrientation(int i8) {
        this.G.X0 = i8;
        requestLayout();
    }

    public void setPadding(int i8) {
        l1.f fVar = this.G;
        fVar.f10919u0 = i8;
        fVar.f10920v0 = i8;
        fVar.f10921w0 = i8;
        fVar.f10922x0 = i8;
        requestLayout();
    }

    public void setPaddingBottom(int i8) {
        this.G.f10920v0 = i8;
        requestLayout();
    }

    public void setPaddingLeft(int i8) {
        this.G.f10923y0 = i8;
        requestLayout();
    }

    public void setPaddingRight(int i8) {
        this.G.f10924z0 = i8;
        requestLayout();
    }

    public void setPaddingTop(int i8) {
        this.G.f10919u0 = i8;
        requestLayout();
    }

    public void setVerticalAlign(int i8) {
        this.G.U0 = i8;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.G.M0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i8) {
        this.G.S0 = i8;
        requestLayout();
    }

    public void setVerticalStyle(int i8) {
        this.G.G0 = i8;
        requestLayout();
    }

    public void setWrapMode(int i8) {
        this.G.V0 = i8;
        requestLayout();
    }
}
