package p8;

import ag.n2;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b1.b;
import com.quickkonnect.silencio.R;
import m8.s;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public int f12484a;

    /* renamed from: b  reason: collision with root package name */
    public int f12485b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f12486c = new int[0];

    /* renamed from: d  reason: collision with root package name */
    public int f12487d;

    /* renamed from: e  reason: collision with root package name */
    public int f12488e;

    /* renamed from: f  reason: collision with root package name */
    public int f12489f;

    public c(Context context, AttributeSet attributeSet) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray d10 = s.d(context, attributeSet, n2.D, R.attr.circularProgressIndicatorStyle, 2132018208, new int[0]);
        this.f12484a = r8.c.c(context, d10, 8, dimensionPixelSize);
        this.f12485b = Math.min(r8.c.c(context, d10, 7, 0), this.f12484a / 2);
        this.f12488e = d10.getInt(4, 0);
        this.f12489f = d10.getInt(1, 0);
        if (!d10.hasValue(2)) {
            this.f12486c = new int[]{b.e(context, R.attr.colorPrimary, -1)};
        } else if (d10.peekValue(2).type != 1) {
            this.f12486c = new int[]{d10.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(d10.getResourceId(2, -1));
            this.f12486c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (d10.hasValue(6)) {
            this.f12487d = d10.getColor(6, -1);
        } else {
            this.f12487d = this.f12486c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f10 = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.f12487d = b.b(this.f12487d, (int) (f10 * 255.0f));
        }
        d10.recycle();
    }
}
