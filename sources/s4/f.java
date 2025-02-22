package s4;

import java.util.ArrayList;
import java.util.HashMap;
import s4.k;

public final class f<K extends k, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f14669a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f14670b = new HashMap();

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f14671a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f14672b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f14673c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f14674d;

        public a() {
            this((Object) null);
        }

        public a(K k10) {
            this.f14674d = this;
            this.f14673c = this;
            this.f14671a = k10;
        }
    }

    public final V a(K k10) {
        HashMap hashMap = this.f14670b;
        a<K, V> aVar = (a) hashMap.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            hashMap.put(k10, aVar);
        } else {
            k10.a();
        }
        a<K, V> aVar2 = aVar.f14674d;
        aVar2.f14673c = aVar.f14673c;
        aVar.f14673c.f14674d = aVar2;
        a<K, V> aVar3 = this.f14669a;
        aVar.f14674d = aVar3;
        a<K, V> aVar4 = aVar3.f14673c;
        aVar.f14673c = aVar4;
        aVar4.f14674d = aVar;
        aVar.f14674d.f14673c = aVar;
        ArrayList arrayList = aVar.f14672b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return aVar.f14672b.remove(size - 1);
        }
        return null;
    }

    public final void b(K k10, V v3) {
        HashMap hashMap = this.f14670b;
        a<K, V> aVar = (a) hashMap.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            a<K, V> aVar2 = aVar.f14674d;
            aVar2.f14673c = aVar.f14673c;
            aVar.f14673c.f14674d = aVar2;
            a<K, V> aVar3 = this.f14669a;
            aVar.f14674d = aVar3.f14674d;
            aVar.f14673c = aVar3;
            aVar3.f14674d = aVar;
            aVar.f14674d.f14673c = aVar;
            hashMap.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f14672b == null) {
            aVar.f14672b = new ArrayList();
        }
        aVar.f14672b.add(v3);
    }

    public final V c() {
        a<K, V> aVar = this.f14669a;
        a<K, V> aVar2 = aVar.f14674d;
        while (true) {
            V v3 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f14672b;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v3 = aVar2.f14672b.remove(size - 1);
            }
            if (v3 != null) {
                return v3;
            }
            a<K, V> aVar3 = aVar2.f14674d;
            aVar3.f14673c = aVar2.f14673c;
            aVar2.f14673c.f14674d = aVar3;
            HashMap hashMap = this.f14670b;
            K k10 = aVar2.f14671a;
            hashMap.remove(k10);
            ((k) k10).a();
            aVar2 = aVar2.f14674d;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f14669a;
        a<K, V> aVar2 = aVar.f14673c;
        boolean z10 = false;
        while (!aVar2.equals(aVar)) {
            sb2.append('{');
            sb2.append(aVar2.f14671a);
            sb2.append(':');
            ArrayList arrayList = aVar2.f14672b;
            sb2.append(arrayList != null ? arrayList.size() : 0);
            sb2.append("}, ");
            aVar2 = aVar2.f14673c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
