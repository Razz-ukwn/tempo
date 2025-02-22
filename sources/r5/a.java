package r5;

import android.graphics.DashPathEffect;
import java.util.ArrayList;
import t5.c;
import z5.f;

public abstract class a extends b {
    public float A = 0.0f;
    public float B = 0.0f;
    public float C = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public t5.a f14015f;

    /* renamed from: g  reason: collision with root package name */
    public int f14016g = -7829368;

    /* renamed from: h  reason: collision with root package name */
    public final float f14017h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public final int f14018i = -7829368;

    /* renamed from: j  reason: collision with root package name */
    public final float f14019j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public float[] f14020k = new float[0];

    /* renamed from: l  reason: collision with root package name */
    public int f14021l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public final int f14022n = 6;

    /* renamed from: o  reason: collision with root package name */
    public float f14023o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14024p = false;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f14025q = true;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f14026r = true;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f14027s = true;

    /* renamed from: t  reason: collision with root package name */
    public DashPathEffect f14028t = null;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f14029u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f14030v = true;

    /* renamed from: w  reason: collision with root package name */
    public float f14031w = 0.0f;

    /* renamed from: x  reason: collision with root package name */
    public float f14032x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    public boolean f14033y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14034z = false;

    public a() {
        this.f14038d = f.c(10.0f);
        this.f14036b = f.c(5.0f);
        this.f14037c = f.c(5.0f);
        this.f14029u = new ArrayList();
    }

    public void a(float f10, float f11) {
        float f12 = this.f14033y ? this.B : f10 - this.f14031w;
        float f13 = this.f14034z ? this.A : f11 + this.f14032x;
        if (Math.abs(f13 - f12) == 0.0f) {
            f13 += 1.0f;
            f12 -= 1.0f;
        }
        this.B = f12;
        this.A = f13;
        this.C = Math.abs(f13 - f12);
    }

    public final String b(int i8) {
        return (i8 < 0 || i8 >= this.f14020k.length) ? "" : d().a(this.f14020k[i8]);
    }

    public final String c() {
        String str = "";
        for (int i8 = 0; i8 < this.f14020k.length; i8++) {
            String b10 = b(i8);
            if (b10 != null && str.length() < b10.length()) {
                str = b10;
            }
        }
        return str;
    }

    public final c d() {
        t5.a aVar = this.f14015f;
        if (aVar == null || aVar.f15369b != this.m) {
            this.f14015f = new t5.a(this.m);
        }
        return this.f14015f;
    }
}
