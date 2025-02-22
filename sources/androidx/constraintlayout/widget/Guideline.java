package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1598a = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int i8, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f1598a = z10;
    }

    public void setGuidelineBegin(int i8) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1598a || aVar.f1547a != i8) {
            aVar.f1547a = i8;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelineEnd(int i8) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1598a || aVar.f1549b != i8) {
            aVar.f1549b = i8;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1598a || aVar.f1551c != f10) {
            aVar.f1551c = f10;
            setLayoutParams(aVar);
        }
    }

    public void setVisibility(int i8) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
