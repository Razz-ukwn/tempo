package androidx.lifecycle;

import androidx.lifecycle.j;
import sf.j;

public final class DefaultLifecycleObserverAdapter implements n {

    /* renamed from: a  reason: collision with root package name */
    public final e f2181a;

    /* renamed from: b  reason: collision with root package name */
    public final n f2182b;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2183a;

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
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.j$a r1 = androidx.lifecycle.j.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
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
                f2183a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.DefaultLifecycleObserverAdapter.a.<clinit>():void");
        }
    }

    public DefaultLifecycleObserverAdapter(e eVar, n nVar) {
        j.f(eVar, "defaultLifecycleObserver");
        this.f2181a = eVar;
        this.f2182b = nVar;
    }

    public final void d(p pVar, j.a aVar) {
        int i8 = a.f2183a[aVar.ordinal()];
        e eVar = this.f2181a;
        switch (i8) {
            case 1:
                eVar.getClass();
                break;
            case 2:
                eVar.s(pVar);
                break;
            case 3:
                eVar.b(pVar);
                break;
            case 4:
                eVar.getClass();
                break;
            case 5:
                eVar.l(pVar);
                break;
            case 6:
                eVar.o(pVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        n nVar = this.f2182b;
        if (nVar != null) {
            nVar.d(pVar, aVar);
        }
    }
}
