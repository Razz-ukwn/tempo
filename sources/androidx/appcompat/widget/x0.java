package androidx.appcompat.widget;

public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1138a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1139b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1140c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1141d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1142e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1143f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1144g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1145h = false;

    public final void a(int i8, int i10) {
        this.f1140c = i8;
        this.f1141d = i10;
        this.f1145h = true;
        if (this.f1144g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f1138a = i10;
            }
            if (i8 != Integer.MIN_VALUE) {
                this.f1139b = i8;
                return;
            }
            return;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f1138a = i8;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1139b = i10;
        }
    }
}
