package p2;

import android.view.View;
import java.util.ArrayList;
import p2.a;
import p2.b;
import p8.i;

public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: l  reason: collision with root package name */
    public static final C0241b f12409l = new C0241b();
    public static final c m = new c();

    /* renamed from: n  reason: collision with root package name */
    public static final d f12410n = new d();

    /* renamed from: o  reason: collision with root package name */
    public static final e f12411o = new e();

    /* renamed from: p  reason: collision with root package name */
    public static final f f12412p = new f();

    /* renamed from: q  reason: collision with root package name */
    public static final a f12413q = new a();

    /* renamed from: a  reason: collision with root package name */
    public float f12414a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f12415b = Float.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12416c = false;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12417d;

    /* renamed from: e  reason: collision with root package name */
    public final c f12418e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12419f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float f12420g = -3.4028235E38f;

    /* renamed from: h  reason: collision with root package name */
    public long f12421h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final float f12422i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<h> f12423j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<i> f12424k = new ArrayList<>();

    public static class a extends j {
        public a() {
            super("alpha");
        }

        public final float c(Object obj) {
            return ((View) obj).getAlpha();
        }

        public final void e(float f10, Object obj) {
            ((View) obj).setAlpha(f10);
        }
    }

    /* renamed from: p2.b$b  reason: collision with other inner class name */
    public static class C0241b extends j {
        public C0241b() {
            super("scaleX");
        }

        public final float c(Object obj) {
            return ((View) obj).getScaleX();
        }

        public final void e(float f10, Object obj) {
            ((View) obj).setScaleX(f10);
        }
    }

    public static class c extends j {
        public c() {
            super("scaleY");
        }

        public final float c(Object obj) {
            return ((View) obj).getScaleY();
        }

        public final void e(float f10, Object obj) {
            ((View) obj).setScaleY(f10);
        }
    }

    public static class d extends j {
        public d() {
            super("rotation");
        }

        public final float c(Object obj) {
            return ((View) obj).getRotation();
        }

        public final void e(float f10, Object obj) {
            ((View) obj).setRotation(f10);
        }
    }

    public static class e extends j {
        public e() {
            super("rotationX");
        }

        public final float c(Object obj) {
            return ((View) obj).getRotationX();
        }

        public final void e(float f10, Object obj) {
            ((View) obj).setRotationX(f10);
        }
    }

    public static class f extends j {
        public f() {
            super("rotationY");
        }

        public final float c(Object obj) {
            return ((View) obj).getRotationY();
        }

        public final void e(float f10, Object obj) {
            ((View) obj).setRotationY(f10);
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public float f12425a;

        /* renamed from: b  reason: collision with root package name */
        public float f12426b;
    }

    public interface h {
        void a();
    }

    public interface i {
        void a();
    }

    public static abstract class j extends c {
        public j(String str) {
            super(str);
        }
    }

    public b(Object obj) {
        i.a aVar = p8.i.M;
        this.f12417d = obj;
        this.f12418e = aVar;
        if (aVar == f12410n || aVar == f12411o || aVar == f12412p) {
            this.f12422i = 0.1f;
        } else if (aVar == f12413q) {
            this.f12422i = 0.00390625f;
        } else if (aVar == f12409l || aVar == m) {
            this.f12422i = 0.00390625f;
        } else {
            this.f12422i = 1.0f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            long r3 = r0.f12421h
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0015
            r0.f12421h = r1
            float r1 = r0.f12415b
            r0.b(r1)
            return r8
        L_0x0015:
            long r14 = r1 - r3
            r0.f12421h = r1
            r1 = r0
            p2.d r1 = (p2.d) r1
            boolean r2 = r1.f12430t
            r3 = 1
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = 0
            if (r2 == 0) goto L_0x003f
            float r2 = r1.f12429s
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0032
            p2.e r9 = r1.f12428r
            double r10 = (double) r2
            r9.f12439i = r10
            r1.f12429s = r4
        L_0x0032:
            p2.e r2 = r1.f12428r
            double r9 = r2.f12439i
            float r2 = (float) r9
            r1.f12415b = r2
            r1.f12414a = r7
            r1.f12430t = r8
            goto L_0x00d4
        L_0x003f:
            float r2 = r1.f12429s
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0081
            p2.e r2 = r1.f12428r
            double r9 = r2.f12439i
            float r9 = r1.f12415b
            double r9 = (double) r9
            float r11 = r1.f12414a
            double r11 = (double) r11
            r16 = 2
            long r23 = r14 / r16
            r16 = r2
            r17 = r9
            r19 = r11
            r21 = r23
            p2.b$g r2 = r16.a(r17, r19, r21)
            p2.e r9 = r1.f12428r
            float r10 = r1.f12429s
            double r10 = (double) r10
            r9.f12439i = r10
            r1.f12429s = r4
            float r10 = r2.f12425a
            double r10 = (double) r10
            float r2 = r2.f12426b
            double r12 = (double) r2
            r18 = r9
            r19 = r10
            r21 = r12
            p2.b$g r2 = r18.a(r19, r21, r23)
            float r9 = r2.f12425a
            r1.f12415b = r9
            float r2 = r2.f12426b
            r1.f12414a = r2
            goto L_0x0095
        L_0x0081:
            p2.e r9 = r1.f12428r
            float r2 = r1.f12415b
            double r10 = (double) r2
            float r2 = r1.f12414a
            double r12 = (double) r2
            p2.b$g r2 = r9.a(r10, r12, r14)
            float r9 = r2.f12425a
            r1.f12415b = r9
            float r2 = r2.f12426b
            r1.f12414a = r2
        L_0x0095:
            float r2 = r1.f12415b
            float r9 = r1.f12420g
            float r2 = java.lang.Math.max(r2, r9)
            r1.f12415b = r2
            float r2 = java.lang.Math.min(r2, r4)
            r1.f12415b = r2
            float r9 = r1.f12414a
            p2.e r10 = r1.f12428r
            r10.getClass()
            float r9 = java.lang.Math.abs(r9)
            double r11 = (double) r9
            double r13 = r10.f12435e
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x00c8
            double r11 = r10.f12439i
            float r9 = (float) r11
            float r2 = r2 - r9
            float r2 = java.lang.Math.abs(r2)
            double r11 = (double) r2
            double r9 = r10.f12434d
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c8
            r2 = r3
            goto L_0x00c9
        L_0x00c8:
            r2 = r8
        L_0x00c9:
            if (r2 == 0) goto L_0x00d6
            p2.e r2 = r1.f12428r
            double r9 = r2.f12439i
            float r2 = (float) r9
            r1.f12415b = r2
            r1.f12414a = r7
        L_0x00d4:
            r1 = r3
            goto L_0x00d7
        L_0x00d6:
            r1 = r8
        L_0x00d7:
            float r2 = r0.f12415b
            float r2 = java.lang.Math.min(r2, r4)
            r0.f12415b = r2
            float r4 = r0.f12420g
            float r2 = java.lang.Math.max(r2, r4)
            r0.f12415b = r2
            r0.b(r2)
            if (r1 == 0) goto L_0x0147
            r0.f12419f = r8
            java.lang.ThreadLocal<p2.a> r2 = p2.a.f12398f
            java.lang.Object r4 = r2.get()
            if (r4 != 0) goto L_0x00fe
            p2.a r4 = new p2.a
            r4.<init>()
            r2.set(r4)
        L_0x00fe:
            java.lang.Object r2 = r2.get()
            p2.a r2 = (p2.a) r2
            o.f<p2.a$b, java.lang.Long> r4 = r2.f12399a
            r4.remove(r0)
            java.util.ArrayList<p2.a$b> r4 = r2.f12400b
            int r7 = r4.indexOf(r0)
            if (r7 < 0) goto L_0x0117
            r9 = 0
            r4.set(r7, r9)
            r2.f12403e = r3
        L_0x0117:
            r0.f12421h = r5
            r0.f12416c = r8
        L_0x011b:
            java.util.ArrayList<p2.b$h> r2 = r0.f12423j
            int r3 = r2.size()
            if (r8 >= r3) goto L_0x0135
            java.lang.Object r3 = r2.get(r8)
            if (r3 == 0) goto L_0x0132
            java.lang.Object r2 = r2.get(r8)
            p2.b$h r2 = (p2.b.h) r2
            r2.a()
        L_0x0132:
            int r8 = r8 + 1
            goto L_0x011b
        L_0x0135:
            int r3 = r2.size()
        L_0x0139:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0147
            java.lang.Object r4 = r2.get(r3)
            if (r4 != 0) goto L_0x0139
            r2.remove(r3)
            goto L_0x0139
        L_0x0147:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.b.a(long):boolean");
    }

    public final void b(float f10) {
        ArrayList<i> arrayList;
        this.f12418e.e(f10, this.f12417d);
        int i8 = 0;
        while (true) {
            arrayList = this.f12424k;
            if (i8 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i8) != null) {
                arrayList.get(i8).a();
            }
            i8++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
