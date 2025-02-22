package s4;

import android.graphics.Bitmap;
import h0.e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class l implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f14694d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f14695e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f14696f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f14697g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f14698h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final c f14699a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final f<b, Bitmap> f14700b = new f<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f14701c = new HashMap();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14702a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14702a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14702a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14702a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14702a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s4.l.a.<clinit>():void");
        }
    }

    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final c f14703a;

        /* renamed from: b  reason: collision with root package name */
        public int f14704b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f14705c;

        public b(c cVar) {
            this.f14703a = cVar;
        }

        public final void a() {
            this.f14703a.d(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14704b == bVar.f14704b && l5.l.b(this.f14705c, bVar.f14705c);
        }

        public final int hashCode() {
            int i8 = this.f14704b * 31;
            Bitmap.Config config = this.f14705c;
            return i8 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return l.c(this.f14704b, this.f14705c);
        }
    }

    public static class c extends p2.c {
        public final k a() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f14694d = configArr;
        f14695e = configArr;
    }

    public static String c(int i8, Bitmap.Config config) {
        return "[" + i8 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = d10.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d10.remove(num);
        } else {
            d10.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [s4.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            char[] r0 = l5.l.f11007a
            int r0 = r11 * r12
            if (r13 != 0) goto L_0x0009
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            int[] r2 = l5.l.a.f11010a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L_0x0025
            if (r1 == r4) goto L_0x0023
            if (r1 == r3) goto L_0x0023
            if (r1 == r2) goto L_0x0020
            r1 = r2
            goto L_0x0026
        L_0x0020:
            r1 = 8
            goto L_0x0026
        L_0x0023:
            r1 = r4
            goto L_0x0026
        L_0x0025:
            r1 = r5
        L_0x0026:
            int r1 = r1 * r0
            s4.l$c r0 = r10.f14699a
            s4.k r6 = r0.b()
            s4.l$b r6 = (s4.l.b) r6
            r6.f14704b = r1
            r6.f14705c = r13
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGBA_F16
            boolean r7 = r7.equals(r13)
            r8 = 0
            if (r7 == 0) goto L_0x003f
            android.graphics.Bitmap$Config[] r2 = f14695e
            goto L_0x005f
        L_0x003f:
            int[] r7 = s4.l.a.f14702a
            int r9 = r13.ordinal()
            r7 = r7[r9]
            if (r7 == r5) goto L_0x005d
            if (r7 == r4) goto L_0x005a
            if (r7 == r3) goto L_0x0057
            if (r7 == r2) goto L_0x0054
            android.graphics.Bitmap$Config[] r2 = new android.graphics.Bitmap.Config[r5]
            r2[r8] = r13
            goto L_0x005f
        L_0x0054:
            android.graphics.Bitmap$Config[] r2 = f14698h
            goto L_0x005f
        L_0x0057:
            android.graphics.Bitmap$Config[] r2 = f14697g
            goto L_0x005f
        L_0x005a:
            android.graphics.Bitmap$Config[] r2 = f14696f
            goto L_0x005f
        L_0x005d:
            android.graphics.Bitmap$Config[] r2 = f14694d
        L_0x005f:
            int r3 = r2.length
        L_0x0060:
            if (r8 >= r3) goto L_0x00a3
            r4 = r2[r8]
            java.util.NavigableMap r5 = r10.d(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.Object r5 = r5.ceilingKey(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x00a0
            int r7 = r5.intValue()
            int r9 = r1 * 8
            if (r7 > r9) goto L_0x00a0
            int r2 = r5.intValue()
            if (r2 != r1) goto L_0x008d
            if (r4 != 0) goto L_0x0087
            if (r13 == 0) goto L_0x00a3
            goto L_0x008d
        L_0x0087:
            boolean r1 = r4.equals(r13)
            if (r1 != 0) goto L_0x00a3
        L_0x008d:
            r0.d(r6)
            int r1 = r5.intValue()
            s4.k r0 = r0.b()
            r6 = r0
            s4.l$b r6 = (s4.l.b) r6
            r6.f14704b = r1
            r6.f14705c = r4
            goto L_0x00a3
        L_0x00a0:
            int r8 = r8 + 1
            goto L_0x0060
        L_0x00a3:
            s4.f<s4.l$b, android.graphics.Bitmap> r0 = r10.f14700b
            java.lang.Object r0 = r0.a(r6)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x00b9
            int r1 = r6.f14704b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.l.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.f14701c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final String e(Bitmap bitmap) {
        return c(l5.l.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c3 = l5.l.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) this.f14699a.b();
        bVar.f14704b = c3;
        bVar.f14705c = config;
        this.f14700b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = d10.get(Integer.valueOf(bVar.f14704b));
        Integer valueOf = Integer.valueOf(bVar.f14704b);
        int i8 = 1;
        if (num != null) {
            i8 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i8));
    }

    public final String toString() {
        StringBuilder c3 = e.c("SizeConfigStrategy{groupedMap=");
        c3.append(this.f14700b);
        c3.append(", sortedSizes=(");
        HashMap hashMap = this.f14701c;
        for (Map.Entry entry : hashMap.entrySet()) {
            c3.append(entry.getKey());
            c3.append('[');
            c3.append(entry.getValue());
            c3.append("], ");
        }
        if (!hashMap.isEmpty()) {
            c3.replace(c3.length() - 2, c3.length(), "");
        }
        c3.append(")}");
        return c3.toString();
    }
}
