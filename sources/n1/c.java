package n1;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import n1.d;

public final class c extends a implements d.c {
    public boolean E;
    public boolean F;
    public float G;
    public View[] H;

    public final void a() {
    }

    public final void b() {
    }

    public float getProgress() {
        return this.G;
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gf.E);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 1) {
                    this.E = obtainStyledAttributes.getBoolean(index, this.E);
                } else if (index == 0) {
                    this.F = obtainStyledAttributes.getBoolean(index, this.F);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.G = f10;
        int i8 = 0;
        if (this.f1600b > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.C;
            if (viewArr == null || viewArr.length != this.f1600b) {
                this.C = new View[this.f1600b];
            }
            for (int i10 = 0; i10 < this.f1600b; i10++) {
                this.C[i10] = constraintLayout.f1542a.get(this.f1599a[i10]);
            }
            this.H = this.C;
            while (i8 < this.f1600b) {
                View view = this.H[i8];
                i8++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i8 < childCount) {
            boolean z10 = viewGroup.getChildAt(i8) instanceof c;
            i8++;
        }
    }
}
