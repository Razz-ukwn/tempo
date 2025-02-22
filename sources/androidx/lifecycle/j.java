package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<Object> f2275a = new AtomicReference<>();

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        public static final C0026a Companion = null;

        /* renamed from: androidx.lifecycle.j$a$a  reason: collision with other inner class name */
        public static final class C0026a {
            public static a a(b bVar) {
                sf.j.f(bVar, "state");
                int ordinal = bVar.ordinal();
                if (ordinal == 2) {
                    return a.ON_DESTROY;
                }
                if (ordinal == 3) {
                    return a.ON_STOP;
                }
                if (ordinal != 4) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public static a b(b bVar) {
                sf.j.f(bVar, "state");
                int ordinal = bVar.ordinal();
                if (ordinal == 1) {
                    return a.ON_CREATE;
                }
                if (ordinal == 2) {
                    return a.ON_START;
                }
                if (ordinal != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            public static a c(b bVar) {
                sf.j.f(bVar, "state");
                int ordinal = bVar.ordinal();
                if (ordinal == 2) {
                    return a.ON_CREATE;
                }
                if (ordinal == 3) {
                    return a.ON_START;
                }
                if (ordinal != 4) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f2276a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.j$a[] r0 = androidx.lifecycle.j.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f2276a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.j.a.b.<clinit>():void");
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C0026a();
        }

        /* access modifiers changed from: public */
        a() {
        }

        public final b a() {
            switch (b.f2276a[ordinal()]) {
                case 1:
                case 2:
                    return b.f2279c;
                case 3:
                case 4:
                    return b.f2280d;
                case 5:
                    return b.f2281e;
                case 6:
                    return b.f2277a;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum b {
        f2277a,
        f2278b,
        f2279c,
        f2280d,
        f2281e;

        /* access modifiers changed from: public */
        b() {
        }

        public final boolean a(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(o oVar);

    public abstract b b();

    public abstract void c(o oVar);
}
