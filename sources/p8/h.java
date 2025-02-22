package p8;

import ag.n2;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.quickkonnect.silencio.R;
import m8.s;
import r8.c;

public final class h extends c {

    /* renamed from: g  reason: collision with root package name */
    public int f12508g;

    /* renamed from: h  reason: collision with root package name */
    public int f12509h;

    /* renamed from: i  reason: collision with root package name */
    public int f12510i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i8 = CircularProgressIndicator.I;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray d10 = s.d(context, attributeSet, n2.I, R.attr.circularProgressIndicatorStyle, 2132018208, new int[0]);
        this.f12508g = Math.max(c.c(context, d10, 2, dimensionPixelSize), this.f12484a * 2);
        this.f12509h = c.c(context, d10, 1, dimensionPixelSize2);
        this.f12510i = d10.getInt(0, 0);
        d10.recycle();
    }
}
