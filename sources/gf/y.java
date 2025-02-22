package gf;

import d2.f1;
import ff.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import sf.j;

public class y extends f1 {
    public static final Object R(Object obj, Map map) {
        j.f(map, "<this>");
        if (map instanceof x) {
            return ((x) map).f();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final Map S(g... gVarArr) {
        if (gVarArr.length <= 0) {
            return t.f8979a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(f1.B(gVarArr.length));
        U(linkedHashMap, gVarArr);
        return linkedHashMap;
    }

    public static final LinkedHashMap T(g... gVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f1.B(gVarArr.length));
        U(linkedHashMap, gVarArr);
        return linkedHashMap;
    }

    public static final void U(HashMap hashMap, g[] gVarArr) {
        for (g gVar : gVarArr) {
            hashMap.put(gVar.f8706a, gVar.f8707b);
        }
    }

    public static final Map V(ArrayList arrayList) {
        t tVar = t.f8979a;
        int size = arrayList.size();
        if (size == 0) {
            return tVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(f1.B(arrayList.size()));
            X(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        g gVar = (g) arrayList.get(0);
        j.f(gVar, "pair");
        Map singletonMap = Collections.singletonMap(gVar.f8706a, gVar.f8707b);
        j.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final Map W(Map map) {
        j.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? Y(map) : f1.O(map) : t.f8979a;
    }

    public static final void X(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            linkedHashMap.put(gVar.f8706a, gVar.f8707b);
        }
    }

    public static final LinkedHashMap Y(Map map) {
        j.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
