package u5;

import r5.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f15727a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    public final float f15728b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    public final float f15729c;

    /* renamed from: d  reason: collision with root package name */
    public final float f15730d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15731e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final int f15732f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15733g = -1;

    /* renamed from: h  reason: collision with root package name */
    public final i.a f15734h;

    public b(float f10, float f11, float f12, float f13, int i8, i.a aVar) {
        this.f15727a = f10;
        this.f15728b = f11;
        this.f15729c = f12;
        this.f15730d = f13;
        this.f15732f = i8;
        this.f15734h = aVar;
    }

    public final boolean a(b bVar) {
        return bVar != null && this.f15732f == bVar.f15732f && this.f15727a == bVar.f15727a && this.f15733g == bVar.f15733g && this.f15731e == bVar.f15731e;
    }

    public final String toString() {
        return "Highlight, x: " + this.f15727a + ", y: " + this.f15728b + ", dataSetIndex: " + this.f15732f + ", stackIndex (only stacked barentry): " + this.f15733g;
    }
}
