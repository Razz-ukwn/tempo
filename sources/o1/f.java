package o1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import l1.j;

public abstract class f extends a {
    public boolean E;
    public boolean F;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gf.f4584c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 6) {
                    this.E = true;
                } else if (index == 22) {
                    this.F = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void l(j jVar, int i8, int i10) {
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E || this.F) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i8 = 0; i8 < this.f1600b; i8++) {
                    View view = constraintLayout.f1542a.get(this.f1599a[i8]);
                    if (view != null) {
                        if (this.E) {
                            view.setVisibility(visibility);
                        }
                        if (this.F && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }
}
