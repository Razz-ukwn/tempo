package gf;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import rf.l;
import sf.j;
import sf.k;
import w.n;
import w.p;
import w.r;

public abstract class d<K, V> implements Map<K, V>, tf.a {

    public static final class a extends k implements l<Map.Entry<? extends K, ? extends V>, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d<K, V> f8969a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d<K, ? extends V> dVar) {
            super(1);
            this.f8969a = dVar;
        }

        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            j.f(entry, "it");
            d<K, V> dVar = this.f8969a;
            dVar.getClass();
            StringBuilder sb2 = new StringBuilder();
            Object key = entry.getKey();
            String str = "(this Map)";
            sb2.append(key == dVar ? str : String.valueOf(key));
            sb2.append('=');
            Object value = entry.getValue();
            if (value != dVar) {
                str = String.valueOf(value);
            }
            sb2.append(str);
            return sb2.toString();
        }
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (j.a(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new n((w.d) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = r6
            w.d r1 = (w.d) r1
            java.util.Map r7 = (java.util.Map) r7
            int r3 = r7.size()
            int r4 = r1.f16439b
            if (r4 == r3) goto L_0x0018
            return r2
        L_0x0018:
            java.util.Set r7 = r7.entrySet()
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0027
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L_0x0027
            goto L_0x005b
        L_0x0027:
            java.util.Iterator r7 = r7.iterator()
        L_0x002b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            r3 = r2
            goto L_0x0058
        L_0x003b:
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r5 = r1.get(r4)
            boolean r3 = sf.j.a(r3, r5)
            if (r3 != 0) goto L_0x004e
            goto L_0x0039
        L_0x004e:
            if (r5 != 0) goto L_0x0057
            boolean r3 = r1.containsKey(r4)
            if (r3 != 0) goto L_0x0057
            goto L_0x0039
        L_0x0057:
            r3 = r0
        L_0x0058:
            if (r3 != 0) goto L_0x002b
            r0 = r2
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public final boolean isEmpty() {
        return ((w.d) this).f16439b == 0;
    }

    public final Set<K> keySet() {
        return new p((w.d) this);
    }

    public final V put(K k10, V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return ((w.d) this).f16439b;
    }

    public final String toString() {
        return q.A0(entrySet(), ", ", "{", "}", new a(this), 24);
    }

    public final Collection<V> values() {
        return new r((w.d) this);
    }
}
