package o;

import java.util.LinkedHashMap;
import java.util.Locale;

public class e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f12023a;

    /* renamed from: b  reason: collision with root package name */
    public int f12024b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12025c;

    /* renamed from: d  reason: collision with root package name */
    public int f12026d;

    /* renamed from: e  reason: collision with root package name */
    public int f12027e;

    public e(int i8) {
        if (i8 > 0) {
            this.f12025c = i8;
            this.f12023a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V a(K k10) {
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = r4.f12023a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r4.f12023a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        r4.f12024b += f(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        b(r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        h(r4.f12025c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V c(K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x004d
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f12023a     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0013
            int r5 = r4.f12026d     // Catch:{ all -> 0x004a }
            int r5 = r5 + 1
            r4.f12026d = r5     // Catch:{ all -> 0x004a }
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
            return r0
        L_0x0013:
            int r0 = r4.f12027e     // Catch:{ all -> 0x004a }
            int r0 = r0 + 1
            r4.f12027e = r0     // Catch:{ all -> 0x004a }
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r4.a(r5)
            if (r0 != 0) goto L_0x0022
            r5 = 0
            return r5
        L_0x0022:
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r1 = r4.f12023a     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0031
            java.util.LinkedHashMap<K, V> r2 = r4.f12023a     // Catch:{ all -> 0x0047 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0047 }
            goto L_0x003a
        L_0x0031:
            int r2 = r4.f12024b     // Catch:{ all -> 0x0047 }
            int r3 = r4.f(r5, r0)     // Catch:{ all -> 0x0047 }
            int r2 = r2 + r3
            r4.f12024b = r2     // Catch:{ all -> 0x0047 }
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0041
            r4.b(r5, r0, r1)
            return r1
        L_0x0041:
            int r5 = r4.f12025c
            r4.h(r5)
            return r0
        L_0x0047:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0047 }
            throw r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004a }
            throw r5
        L_0x004d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.c(java.lang.Object):java.lang.Object");
    }

    public final V d(K k10, V v3) {
        V put;
        if (k10 != null) {
            synchronized (this) {
                this.f12024b += f(k10, v3);
                put = this.f12023a.put(k10, v3);
                if (put != null) {
                    this.f12024b -= f(k10, put);
                }
            }
            if (put != null) {
                b(k10, put, v3);
            }
            h(this.f12025c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final void e(Object obj) {
        V remove;
        if (obj != null) {
            synchronized (this) {
                remove = this.f12023a.remove(obj);
                if (remove != null) {
                    this.f12024b -= f(obj, remove);
                }
            }
            if (remove != null) {
                b(obj, remove, (Object) null);
                return;
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    public final int f(K k10, V v3) {
        int g10 = g(k10, v3);
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v3);
    }

    public int g(K k10, V v3) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f12024b     // Catch:{ all -> 0x006b }
            if (r0 < 0) goto L_0x004c
            java.util.LinkedHashMap<K, V> r0 = r4.f12023a     // Catch:{ all -> 0x006b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f12024b     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x004c
        L_0x0011:
            int r0 = r4.f12024b     // Catch:{ all -> 0x006b }
            if (r0 <= r5) goto L_0x004a
            java.util.LinkedHashMap<K, V> r0 = r4.f12023a     // Catch:{ all -> 0x006b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x001e
            goto L_0x004a
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f12023a     // Catch:{ all -> 0x006b }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006b }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006b }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x006b }
            java.util.LinkedHashMap<K, V> r2 = r4.f12023a     // Catch:{ all -> 0x006b }
            r2.remove(r1)     // Catch:{ all -> 0x006b }
            int r2 = r4.f12024b     // Catch:{ all -> 0x006b }
            int r3 = r4.f(r1, r0)     // Catch:{ all -> 0x006b }
            int r2 = r2 - r3
            r4.f12024b = r2     // Catch:{ all -> 0x006b }
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            r2 = 0
            r4.b(r1, r0, r2)
            goto L_0x0000
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            return
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x006b }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x006b }
            r0.append(r1)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006b }
            r5.<init>(r0)     // Catch:{ all -> 0x006b }
            throw r5     // Catch:{ all -> 0x006b }
        L_0x006b:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.h(int):void");
    }

    public final synchronized String toString() {
        int i8;
        int i10;
        i8 = this.f12026d;
        i10 = this.f12027e + i8;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f12025c), Integer.valueOf(this.f12026d), Integer.valueOf(this.f12027e), Integer.valueOf(i10 != 0 ? (i8 * 100) / i10 : 0)});
    }
}
