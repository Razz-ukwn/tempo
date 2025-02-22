package z5;

import z5.d.a;

public final class d<T extends a> {

    /* renamed from: g  reason: collision with root package name */
    public static int f17731g;

    /* renamed from: a  reason: collision with root package name */
    public int f17732a;

    /* renamed from: b  reason: collision with root package name */
    public int f17733b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f17734c;

    /* renamed from: d  reason: collision with root package name */
    public int f17735d;

    /* renamed from: e  reason: collision with root package name */
    public final T f17736e;

    /* renamed from: f  reason: collision with root package name */
    public float f17737f;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public int f17738a = -1;

        public abstract a a();
    }

    public d(int i8, T t2) {
        if (i8 > 0) {
            this.f17733b = i8;
            this.f17734c = new Object[i8];
            this.f17735d = 0;
            this.f17736e = t2;
            this.f17737f = 1.0f;
            d();
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    public static synchronized d a(int i8, a aVar) {
        d dVar;
        synchronized (d.class) {
            dVar = new d(i8, aVar);
            int i10 = f17731g;
            dVar.f17732a = i10;
            f17731g = i10 + 1;
        }
        return dVar;
    }

    public final synchronized T b() {
        T t2;
        if (this.f17735d == -1 && this.f17737f > 0.0f) {
            d();
        }
        T[] tArr = this.f17734c;
        int i8 = this.f17735d;
        t2 = (a) tArr[i8];
        t2.f17738a = -1;
        this.f17735d = i8 - 1;
        return t2;
    }

    public final synchronized void c(T t2) {
        int i8 = t2.f17738a;
        if (i8 == -1) {
            int i10 = this.f17735d + 1;
            this.f17735d = i10;
            if (i10 >= this.f17734c.length) {
                int i11 = this.f17733b;
                int i12 = i11 * 2;
                this.f17733b = i12;
                Object[] objArr = new Object[i12];
                for (int i13 = 0; i13 < i11; i13++) {
                    objArr[i13] = this.f17734c[i13];
                }
                this.f17734c = objArr;
            }
            t2.f17738a = this.f17732a;
            this.f17734c[this.f17735d] = t2;
        } else if (i8 == this.f17732a) {
            throw new IllegalArgumentException("The object passed is already stored in this pool!");
        } else {
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t2.f17738a + ".  Object cannot belong to two different pool instances simultaneously!");
        }
    }

    public final void d() {
        float f10 = this.f17737f;
        int i8 = this.f17733b;
        int i10 = (int) (((float) i8) * f10);
        if (i10 < 1) {
            i8 = 1;
        } else if (i10 <= i8) {
            i8 = i10;
        }
        for (int i11 = 0; i11 < i8; i11++) {
            this.f17734c[i11] = this.f17736e.a();
        }
        this.f17735d = i8 - 1;
    }
}
