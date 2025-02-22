package s5;

import android.graphics.Color;
import java.util.ArrayList;
import s5.f;
import w5.b;
import w5.g;

public abstract class j<T extends f> extends e<Object> implements g<T>, b<Object> {

    /* renamed from: t  reason: collision with root package name */
    public final int f14743t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f14744u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f14745v;

    /* renamed from: w  reason: collision with root package name */
    public final float f14746w;

    public j(ArrayList arrayList) {
        super(arrayList);
        this.f14743t = Color.rgb(255, 187, 115);
        this.f14744u = true;
        this.f14745v = true;
        this.f14746w = 0.5f;
        this.f14746w = z5.f.c(0.5f);
    }

    public final void H() {
    }

    public final int S() {
        return this.f14743t;
    }

    public final boolean a0() {
        return this.f14744u;
    }

    public final boolean c0() {
        return this.f14745v;
    }

    public final float o() {
        return this.f14746w;
    }
}
