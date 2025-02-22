package s5;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import s5.f;

public abstract class i<T extends f> extends j<T> implements w5.f<T> {
    public float A = 2.5f;
    public boolean B = false;

    /* renamed from: x  reason: collision with root package name */
    public final int f14740x = Color.rgb(140, 234, 255);

    /* renamed from: y  reason: collision with root package name */
    public Drawable f14741y;

    /* renamed from: z  reason: collision with root package name */
    public final int f14742z = 85;

    public i(ArrayList arrayList) {
        super(arrayList);
    }

    public final boolean A() {
        return this.B;
    }

    public final int c() {
        return this.f14740x;
    }

    public final int d() {
        return this.f14742z;
    }

    public final float h() {
        return this.A;
    }

    public final Drawable s() {
        return this.f14741y;
    }
}
