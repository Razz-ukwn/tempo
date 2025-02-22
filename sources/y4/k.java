package y4;

import p4.g;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final e f17192a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final c f17193b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final d f17194c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f17195d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final d f17196e;

    /* renamed from: f  reason: collision with root package name */
    public static final g<k> f17197f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f17198g = true;

    public static class a extends k {
        public final int a(int i8, int i10, int i11, int i12) {
            return 2;
        }

        public final float b(int i8, int i10, int i11, int i12) {
            int min = Math.min(i10 / i12, i8 / i11);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    public static class b extends k {
        public final int a(int i8, int i10, int i11, int i12) {
            return 1;
        }

        public final float b(int i8, int i10, int i11, int i12) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i10) / ((float) i12), ((float) i8) / ((float) i11)));
            int i13 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i13 = 0;
            }
            return 1.0f / ((float) (max << i13));
        }
    }

    public static class c extends k {
        public final int a(int i8, int i10, int i11, int i12) {
            if (b(i8, i10, i11, i12) == 1.0f) {
                return 2;
            }
            return k.f17192a.a(i8, i10, i11, i12);
        }

        public final float b(int i8, int i10, int i11, int i12) {
            return Math.min(1.0f, k.f17192a.b(i8, i10, i11, i12));
        }
    }

    public static class d extends k {
        public final int a(int i8, int i10, int i11, int i12) {
            return 2;
        }

        public final float b(int i8, int i10, int i11, int i12) {
            return Math.max(((float) i11) / ((float) i8), ((float) i12) / ((float) i10));
        }
    }

    public static class e extends k {
        public final int a(int i8, int i10, int i11, int i12) {
            return k.f17198g ? 2 : 1;
        }

        public final float b(int i8, int i10, int i11, int i12) {
            if (k.f17198g) {
                return Math.min(((float) i11) / ((float) i8), ((float) i12) / ((float) i10));
            }
            int max = Math.max(i10 / i12, i8 / i11);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    public static class f extends k {
        public final int a(int i8, int i10, int i11, int i12) {
            return 2;
        }

        public final float b(int i8, int i10, int i11, int i12) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        d dVar = new d();
        f17194c = dVar;
        f17196e = dVar;
        f17197f = g.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    public abstract int a(int i8, int i10, int i11, int i12);

    public abstract float b(int i8, int i10, int i11, int i12);
}
