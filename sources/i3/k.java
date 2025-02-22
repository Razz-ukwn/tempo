package i3;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import f3.v;
import ff.m;
import gf.q;
import gf.u;
import gf.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m3.f;
import sf.j;

public final class k {

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f9465o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    public final p f9466a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f9467b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Set<String>> f9468c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f9469d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f9470e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f9471f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f9472g;

    /* renamed from: h  reason: collision with root package name */
    public volatile f f9473h;

    /* renamed from: i  reason: collision with root package name */
    public final b f9474i;

    /* renamed from: j  reason: collision with root package name */
    public final v f9475j;

    /* renamed from: k  reason: collision with root package name */
    public final k.b<c, d> f9476k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f9477l;
    public final Object m;

    /* renamed from: n  reason: collision with root package name */
    public final l f9478n;

    public static final class a {
        public static String a(String str, String str2) {
            j.f(str, "tableName");
            j.f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f9479a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f9480b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f9481c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f9482d;

        public b(int i8) {
            this.f9479a = new long[i8];
            this.f9480b = new boolean[i8];
            this.f9481c = new int[i8];
        }

        public final int[] a() {
            synchronized (this) {
                if (!this.f9482d) {
                    return null;
                }
                long[] jArr = this.f9479a;
                int length = jArr.length;
                int i8 = 0;
                int i10 = 0;
                while (i8 < length) {
                    int i11 = i10 + 1;
                    int i12 = 1;
                    boolean z10 = jArr[i8] > 0;
                    boolean[] zArr = this.f9480b;
                    if (z10 != zArr[i10]) {
                        int[] iArr = this.f9481c;
                        if (!z10) {
                            i12 = 2;
                        }
                        iArr[i10] = i12;
                    } else {
                        this.f9481c[i10] = 0;
                    }
                    zArr[i10] = z10;
                    i8++;
                    i10 = i11;
                }
                this.f9482d = false;
                int[] iArr2 = (int[]) this.f9481c.clone();
                return iArr2;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f9483a;

        public c(String[] strArr) {
            j.f(strArr, "tables");
            this.f9483a = strArr;
        }

        public abstract void a(Set<String> set);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final c f9484a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f9485b;

        /* renamed from: c  reason: collision with root package name */
        public final String[] f9486c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f9487d;

        public d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            j.f(cVar, "observer");
            this.f9484a = cVar;
            this.f9485b = iArr;
            this.f9486c = strArr;
            boolean z10 = true;
            if (!(strArr.length == 0)) {
                set = Collections.singleton(strArr[0]);
                j.e(set, "singleton(element)");
            } else {
                set = u.f8980a;
            }
            this.f9487d = set;
            if (!(iArr.length != strArr.length ? false : z10)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final void a(Set<Integer> set) {
            int[] iArr = this.f9485b;
            int length = iArr.length;
            Set set2 = u.f8980a;
            hf.f fVar = set2;
            if (length != 0) {
                int i8 = 0;
                if (length != 1) {
                    hf.f fVar2 = new hf.f();
                    int length2 = iArr.length;
                    int i10 = 0;
                    while (i8 < length2) {
                        int i11 = i10 + 1;
                        if (set.contains(Integer.valueOf(iArr[i8]))) {
                            fVar2.add(this.f9486c[i10]);
                        }
                        i8++;
                        i10 = i11;
                    }
                    e9.c.b(fVar2);
                    fVar = fVar2;
                } else {
                    fVar = set2;
                    if (set.contains(Integer.valueOf(iArr[0]))) {
                        fVar = this.f9487d;
                    }
                }
            }
            if (!fVar.isEmpty()) {
                this.f9484a.a(fVar);
            }
        }

        /* JADX WARNING: Failed to insert additional move for type inference */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.lang.String[] r12) {
            /*
                r11 = this;
                java.lang.String[] r0 = r11.f9486c
                int r1 = r0.length
                gf.u r2 = gf.u.f8980a
                r3 = 1
                if (r1 == 0) goto L_0x0046
                r4 = 0
                if (r1 == r3) goto L_0x002f
                hf.f r2 = new hf.f
                r2.<init>()
                int r1 = r12.length
                r5 = r4
            L_0x0012:
                if (r5 >= r1) goto L_0x002b
                r6 = r12[r5]
                int r7 = r0.length
                r8 = r4
            L_0x0018:
                if (r8 >= r7) goto L_0x0028
                r9 = r0[r8]
                boolean r10 = zf.j.s0(r9, r6, r3)
                if (r10 == 0) goto L_0x0025
                r2.add(r9)
            L_0x0025:
                int r8 = r8 + 1
                goto L_0x0018
            L_0x0028:
                int r5 = r5 + 1
                goto L_0x0012
            L_0x002b:
                e9.c.b(r2)
                goto L_0x0046
            L_0x002f:
                int r1 = r12.length
                r5 = r4
            L_0x0031:
                if (r5 >= r1) goto L_0x0042
                r6 = r12[r5]
                r7 = r0[r4]
                boolean r6 = zf.j.s0(r6, r7, r3)
                if (r6 == 0) goto L_0x003f
                r4 = r3
                goto L_0x0042
            L_0x003f:
                int r5 = r5 + 1
                goto L_0x0031
            L_0x0042:
                if (r4 == 0) goto L_0x0046
                java.util.Set<java.lang.String> r2 = r11.f9487d
            L_0x0046:
                boolean r12 = r2.isEmpty()
                r12 = r12 ^ r3
                if (r12 == 0) goto L_0x0052
                i3.k$c r12 = r11.f9484a
                r12.a(r2)
            L_0x0052:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i3.k.d.b(java.lang.String[]):void");
        }
    }

    public static final class e extends c {

        /* renamed from: b  reason: collision with root package name */
        public final k f9488b;

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<c> f9489c;

        public e(k kVar, s sVar) {
            super(sVar.f9483a);
            this.f9488b = kVar;
            this.f9489c = new WeakReference<>(sVar);
        }

        public final void a(Set<String> set) {
            j.f(set, "tables");
            c cVar = this.f9489c.get();
            if (cVar == null) {
                this.f9488b.c(this);
            } else {
                cVar.a(set);
            }
        }
    }

    public k(p pVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        j.f(pVar, "database");
        this.f9466a = pVar;
        this.f9467b = hashMap;
        this.f9468c = hashMap2;
        this.f9474i = new b(strArr.length);
        this.f9475j = new v(pVar);
        this.f9476k = new k.b<>();
        this.f9477l = new Object();
        this.m = new Object();
        this.f9469d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            String str2 = strArr[i8];
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f9469d.put(lowerCase, Integer.valueOf(i8));
            String str3 = this.f9467b.get(strArr[i8]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                j.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i8] = lowerCase;
        }
        this.f9470e = strArr2;
        for (Map.Entry next : this.f9467b.entrySet()) {
            Locale locale2 = Locale.US;
            j.e(locale2, "US");
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            j.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f9469d.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                j.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f9469d;
                linkedHashMap.put(lowerCase3, y.R(lowerCase2, linkedHashMap));
            }
        }
        this.f9478n = new l(this);
    }

    @SuppressLint({"RestrictedApi"})
    public final void a(c cVar) {
        d b10;
        boolean z10;
        j.f(cVar, "observer");
        String[] d10 = d(cVar.f9483a);
        ArrayList arrayList = new ArrayList(d10.length);
        int length = d10.length;
        int i8 = 0;
        while (i8 < length) {
            String str = d10[i8];
            LinkedHashMap linkedHashMap = this.f9469d;
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
                i8++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
        }
        int[] N0 = q.N0(arrayList);
        d dVar = new d(cVar, N0, d10);
        synchronized (this.f9476k) {
            b10 = this.f9476k.b(cVar, dVar);
        }
        if (b10 == null) {
            b bVar = this.f9474i;
            int[] copyOf = Arrays.copyOf(N0, N0.length);
            bVar.getClass();
            j.f(copyOf, "tableIds");
            synchronized (bVar) {
                z10 = false;
                for (int i10 : copyOf) {
                    long[] jArr = bVar.f9479a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        z10 = true;
                        bVar.f9482d = true;
                    }
                }
                m mVar = m.f8717a;
            }
            if (z10) {
                p pVar = this.f9466a;
                if (pVar.m()) {
                    f(pVar.f().N());
                }
            }
        }
    }

    public final boolean b() {
        if (!this.f9466a.m()) {
            return false;
        }
        if (!this.f9472g) {
            this.f9466a.f().N();
        }
        if (this.f9472g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public final void c(c cVar) {
        d c3;
        boolean z10;
        j.f(cVar, "observer");
        synchronized (this.f9476k) {
            c3 = this.f9476k.c(cVar);
        }
        if (c3 != null) {
            b bVar = this.f9474i;
            int[] iArr = c3.f9485b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            bVar.getClass();
            j.f(copyOf, "tableIds");
            synchronized (bVar) {
                z10 = false;
                for (int i8 : copyOf) {
                    long[] jArr = bVar.f9479a;
                    long j10 = jArr[i8];
                    jArr[i8] = j10 - 1;
                    if (j10 == 1) {
                        z10 = true;
                        bVar.f9482d = true;
                    }
                }
                m mVar = m.f8717a;
            }
            if (z10) {
                p pVar = this.f9466a;
                if (pVar.m()) {
                    f(pVar.f().N());
                }
            }
        }
    }

    public final String[] d(String[] strArr) {
        hf.f fVar = new hf.f();
        for (String str : strArr) {
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Map<String, Set<String>> map = this.f9468c;
            if (map.containsKey(lowerCase)) {
                String lowerCase2 = str.toLowerCase(locale);
                j.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map.get(lowerCase2);
                j.c(set);
                fVar.addAll(set);
            } else {
                fVar.add(str);
            }
        }
        e9.c.b(fVar);
        Object[] array = fVar.toArray(new String[0]);
        j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public final void e(m3.b bVar, int i8) {
        bVar.l("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i8 + ", 0)");
        String str = this.f9470e[i8];
        String[] strArr = f9465o;
        for (int i10 = 0; i10 < 3; i10++) {
            String str2 = strArr[i10];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + a.a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i8 + " AND invalidated = 0; END";
            j.e(str3, "StringBuilder().apply(builderAction).toString()");
            bVar.l(str3);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void f(m3.b bVar) {
        j.f(bVar, "database");
        if (!bVar.o0()) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f9466a.f9515i.readLock();
                j.e(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    synchronized (this.f9477l) {
                        int[] a10 = this.f9474i.a();
                        if (a10 != null) {
                            if (bVar.s0()) {
                                bVar.J();
                            } else {
                                bVar.f();
                            }
                            try {
                                int length = a10.length;
                                int i8 = 0;
                                int i10 = 0;
                                while (i8 < length) {
                                    int i11 = a10[i8];
                                    int i12 = i10 + 1;
                                    if (i11 == 1) {
                                        e(bVar, i10);
                                    } else if (i11 == 2) {
                                        String str = this.f9470e[i10];
                                        String[] strArr = f9465o;
                                        for (int i13 = 0; i13 < 3; i13++) {
                                            String str2 = strArr[i13];
                                            String str3 = "DROP TRIGGER IF EXISTS " + a.a(str, str2);
                                            j.e(str3, "StringBuilder().apply(builderAction).toString()");
                                            bVar.l(str3);
                                        }
                                    }
                                    i8++;
                                    i10 = i12;
                                }
                                bVar.I();
                                bVar.U();
                                m mVar = m.f8717a;
                                readLock.unlock();
                            } catch (Throwable th) {
                                bVar.U();
                                throw th;
                            }
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            } catch (SQLiteException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
            }
        }
    }
}
