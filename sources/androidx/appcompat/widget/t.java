package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.quickkonnect.silencio.R;

public final class t extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    public final r f1122a;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        c1.a(this, getContext());
        r rVar = new r(this);
        this.f1122a = rVar;
        rVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    public final synchronized void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
        Bitmap bitmap = this.f1122a.f1117b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i8, 0), getMeasuredHeight());
        }
    }
}
