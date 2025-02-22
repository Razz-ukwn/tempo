package t9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class k {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f15474a;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f15475b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final HashSet f15476c = new HashSet();

        public a(b<?> bVar) {
            this.f15474a = bVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final u<?> f15477a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15478b;

        public b() {
            throw null;
        }

        public b(u uVar, boolean z10) {
            this.f15477a = uVar;
            this.f15478b = z10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f15477a.equals(this.f15477a) && bVar.f15478b == this.f15478b;
        }

        public final int hashCode() {
            return ((this.f15477a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f15478b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i8 = 0;
            if (it.hasNext()) {
                b bVar = (b) it.next();
                a aVar = new a(bVar);
                Iterator<u<? super T>> it2 = bVar.f15449b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        u next = it2.next();
                        boolean z10 = !(bVar.f15452e == 0);
                        b bVar2 = new b(next, z10);
                        if (!hashMap.containsKey(bVar2)) {
                            hashMap.put(bVar2, new HashSet());
                        }
                        Set set = (Set) hashMap.get(bVar2);
                        if (set.isEmpty() || z10) {
                            set.add(aVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next}));
                        }
                    }
                }
            } else {
                for (Set<a> it3 : hashMap.values()) {
                    for (a aVar2 : it3) {
                        for (l next2 : aVar2.f15474a.f15450c) {
                            if (next2.f15481c == 0) {
                                Set<a> set2 = (Set) hashMap.get(new b(next2.f15479a, next2.f15480b == 2));
                                if (set2 != null) {
                                    for (a aVar3 : set2) {
                                        aVar2.f15475b.add(aVar3);
                                        aVar3.f15476c.add(aVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    a aVar4 = (a) it4.next();
                    if (aVar4.f15476c.isEmpty()) {
                        hashSet2.add(aVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar5 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar5);
                    i8++;
                    Iterator it5 = aVar5.f15475b.iterator();
                    while (it5.hasNext()) {
                        a aVar6 = (a) it5.next();
                        aVar6.f15476c.remove(aVar5);
                        if (aVar6.f15476c.isEmpty()) {
                            hashSet2.add(aVar6);
                        }
                    }
                }
                if (i8 != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        a aVar7 = (a) it6.next();
                        if (!aVar7.f15476c.isEmpty() && !aVar7.f15475b.isEmpty()) {
                            arrayList2.add(aVar7.f15474a);
                        }
                    }
                    throw new m(arrayList2);
                }
                return;
            }
        }
    }
}
