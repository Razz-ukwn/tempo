package u8;

import android.graphics.Paint;
import android.graphics.Path;
import v1.d;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f15883i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f15884j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f15885k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f15886l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f15887a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f15888b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f15889c;

    /* renamed from: d  reason: collision with root package name */
    public int f15890d;

    /* renamed from: e  reason: collision with root package name */
    public int f15891e;

    /* renamed from: f  reason: collision with root package name */
    public int f15892f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f15893g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f15894h;

    public a() {
        Paint paint = new Paint();
        this.f15894h = paint;
        this.f15887a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f15888b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f15889c = new Paint(paint2);
    }

    public final void a(int i8) {
        this.f15890d = d.c(i8, 68);
        this.f15891e = d.c(i8, 20);
        this.f15892f = d.c(i8, 0);
        this.f15887a.setColor(this.f15890d);
    }
}
