package ub;

import androidx.fragment.app.z;
import java.util.HashMap;
import tb.c;
import tb.d;
import tb.h;
import tb.l;

public final class o extends z {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<d, String> f15977b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<l, String> f15978c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<c, Integer> f15979d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<h, String> f15980e;

    static {
        HashMap<d, String> hashMap = new HashMap<>();
        f15977b = hashMap;
        HashMap<l, String> hashMap2 = new HashMap<>();
        f15978c = hashMap2;
        HashMap<c, Integer> hashMap3 = new HashMap<>();
        f15979d = hashMap3;
        HashMap<h, String> hashMap4 = new HashMap<>();
        f15980e = hashMap4;
        hashMap.put(d.OFF, "off");
        hashMap.put(d.ON, "on");
        hashMap.put(d.AUTO, "auto");
        hashMap.put(d.TORCH, "torch");
        hashMap3.put(c.BACK, 0);
        hashMap3.put(c.FRONT, 1);
        hashMap2.put(l.AUTO, "auto");
        hashMap2.put(l.INCANDESCENT, "incandescent");
        hashMap2.put(l.FLUORESCENT, "fluorescent");
        hashMap2.put(l.DAYLIGHT, "daylight");
        hashMap2.put(l.CLOUDY, "cloudy-daylight");
        hashMap4.put(h.OFF, "auto");
        hashMap4.put(h.ON, "hdr");
    }

    public static Object I(HashMap hashMap, Object obj) {
        for (Object next : hashMap.keySet()) {
            if (hashMap.get(next).equals(obj)) {
                return next;
            }
        }
        return null;
    }

    public final <T> T F(d dVar) {
        return f15977b.get(dVar);
    }

    public final <T> T G(h hVar) {
        return f15980e.get(hVar);
    }

    public final <T> T H(l lVar) {
        return f15978c.get(lVar);
    }
}
