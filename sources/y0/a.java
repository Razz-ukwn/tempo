package y0;

import cb.c;
import ff.m;
import java.util.HashMap;
import java.util.LinkedHashSet;

public final class a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final c f17104a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<K, V> f17105b = new HashMap<>(0, 0.75f);

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<K> f17106c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public int f17107d;

    /* renamed from: e  reason: collision with root package name */
    public int f17108e;

    /* renamed from: f  reason: collision with root package name */
    public int f17109f;

    public final V a(K k10) {
        synchronized (this.f17104a) {
            V v3 = this.f17105b.get(k10);
            if (v3 != null) {
                this.f17106c.remove(k10);
                this.f17106c.add(k10);
                this.f17108e++;
                return v3;
            }
            this.f17109f++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V b(K r5, V r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x00b9
            if (r6 == 0) goto L_0x00b9
            cb.c r1 = r4.f17104a
            monitor-enter(r1)
            int r2 = r4.d()     // Catch:{ all -> 0x00b6 }
            int r2 = r2 + 1
            r4.f17107d = r2     // Catch:{ all -> 0x00b6 }
            java.util.HashMap<K, V> r2 = r4.f17105b     // Catch:{ all -> 0x00b6 }
            java.lang.Object r6 = r2.put(r5, r6)     // Catch:{ all -> 0x00b6 }
            if (r6 == 0) goto L_0x0020
            int r2 = r4.d()     // Catch:{ all -> 0x00b6 }
            int r2 = r2 + -1
            r4.f17107d = r2     // Catch:{ all -> 0x00b6 }
        L_0x0020:
            java.util.LinkedHashSet<K> r2 = r4.f17106c     // Catch:{ all -> 0x00b6 }
            boolean r2 = r2.contains(r5)     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x002d
            java.util.LinkedHashSet<K> r2 = r4.f17106c     // Catch:{ all -> 0x00b6 }
            r2.remove(r5)     // Catch:{ all -> 0x00b6 }
        L_0x002d:
            java.util.LinkedHashSet<K> r2 = r4.f17106c     // Catch:{ all -> 0x00b6 }
            r2.add(r5)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)
        L_0x0033:
            cb.c r5 = r4.f17104a
            monitor-enter(r5)
            int r1 = r4.d()     // Catch:{ all -> 0x00b3 }
            if (r1 < 0) goto L_0x00ab
            java.util.HashMap<K, V> r1 = r4.f17105b     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x004a
            int r1 = r4.d()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x00ab
        L_0x004a:
            java.util.HashMap<K, V> r1 = r4.f17105b     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b3 }
            java.util.LinkedHashSet<K> r2 = r4.f17106c     // Catch:{ all -> 0x00b3 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b3 }
            if (r1 != r2) goto L_0x00ab
            int r1 = r4.d()     // Catch:{ all -> 0x00b3 }
            r2 = 16
            if (r1 <= r2) goto L_0x009a
            java.util.HashMap<K, V> r1 = r4.f17105b     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x009a
            java.util.LinkedHashSet<K> r1 = r4.f17106c     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = gf.q.t0(r1)     // Catch:{ all -> 0x00b3 }
            java.util.HashMap<K, V> r2 = r4.f17105b     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0092
            java.util.HashMap<K, V> r3 = r4.f17105b     // Catch:{ all -> 0x00b3 }
            sf.y.b(r3)     // Catch:{ all -> 0x00b3 }
            r3.remove(r1)     // Catch:{ all -> 0x00b3 }
            java.util.LinkedHashSet<K> r3 = r4.f17106c     // Catch:{ all -> 0x00b3 }
            sf.y.a(r3)     // Catch:{ all -> 0x00b3 }
            r3.remove(r1)     // Catch:{ all -> 0x00b3 }
            int r3 = r4.d()     // Catch:{ all -> 0x00b3 }
            sf.j.c(r1)     // Catch:{ all -> 0x00b3 }
            int r3 = r3 + -1
            r4.f17107d = r3     // Catch:{ all -> 0x00b3 }
            goto L_0x009c
        L_0x0092:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "inconsistent state"
            r6.<init>(r0)     // Catch:{ all -> 0x00b3 }
            throw r6     // Catch:{ all -> 0x00b3 }
        L_0x009a:
            r1 = r0
            r2 = r1
        L_0x009c:
            ff.m r3 = ff.m.f8717a     // Catch:{ all -> 0x00b3 }
            monitor-exit(r5)
            if (r1 != 0) goto L_0x00a4
            if (r2 != 0) goto L_0x00a4
            return r6
        L_0x00a4:
            sf.j.c(r1)
            sf.j.c(r2)
            goto L_0x0033
        L_0x00ab:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "map/keySet size inconsistency"
            r6.<init>(r0)     // Catch:{ all -> 0x00b3 }
            throw r6     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x00b6:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L_0x00b9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.a.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final V c(K k10) {
        V remove;
        k10.getClass();
        synchronized (this.f17104a) {
            remove = this.f17105b.remove(k10);
            this.f17106c.remove(k10);
            if (remove != null) {
                this.f17107d = d() - 1;
            }
            m mVar = m.f8717a;
        }
        return remove;
    }

    public final int d() {
        int i8;
        synchronized (this.f17104a) {
            i8 = this.f17107d;
        }
        return i8;
    }

    public final String toString() {
        String str;
        synchronized (this.f17104a) {
            int i8 = this.f17108e;
            int i10 = this.f17109f + i8;
            str = "LruCache[maxSize=16,hits=" + this.f17108e + ",misses=" + this.f17109f + ",hitRate=" + (i10 != 0 ? (i8 * 100) / i10 : 0) + "%]";
        }
        return str;
    }
}
