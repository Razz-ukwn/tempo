package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.activity.d;
import androidx.fragment.app.t;
import androidx.savedstate.a;
import ff.g;
import gf.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.k0;
import sf.j;

public final class b0 {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<? extends Object>[] f2241f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f2242a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f2243b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f2244c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f2245d;

    /* renamed from: e  reason: collision with root package name */
    public final a.b f2246e;

    public static final class a {
        public static b0 a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        Object obj = parcelableArrayList.get(i8);
                        j.d(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i8));
                    }
                    return new b0(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new b0();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    j.e(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new b0(hashMap);
            }
        }
    }

    public b0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f2242a = linkedHashMap;
        this.f2243b = new LinkedHashMap();
        this.f2244c = new LinkedHashMap();
        this.f2245d = new LinkedHashMap();
        this.f2246e = new d(this, 1);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(b0 b0Var) {
        j.f(b0Var, "this$0");
        Iterator it = y.W(b0Var.f2243b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = b0Var.f2242a;
            boolean z10 = true;
            if (hasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Bundle a10 = ((a.b) entry.getValue()).a();
                j.f(str, "key");
                if (a10 != null) {
                    Class<? extends Object>[] clsArr = f2241f;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= 29) {
                            z10 = false;
                            break;
                        }
                        Class<? extends Object> cls = clsArr[i8];
                        j.c(cls);
                        if (cls.isInstance(a10)) {
                            break;
                        }
                        i8++;
                    }
                }
                if (z10) {
                    Object obj = b0Var.f2244c.get(str);
                    v vVar = obj instanceof v ? (v) obj : null;
                    if (vVar != null) {
                        vVar.k(a10);
                    } else {
                        linkedHashMap.put(str, a10);
                    }
                    k0 k0Var = (k0) b0Var.f2245d.get(str);
                    if (k0Var != null) {
                        k0Var.setValue(a10);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Can't put value with type ");
                    j.c(a10);
                    sb2.append(a10.getClass());
                    sb2.append(" into saved state");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str2 : keySet) {
                    arrayList.add(str2);
                    arrayList2.add(linkedHashMap.get(str2));
                }
                return y1.d.a(new g("keys", arrayList), new g("values", arrayList2));
            }
        }
    }

    public b0() {
        this.f2242a = new LinkedHashMap();
        this.f2243b = new LinkedHashMap();
        this.f2244c = new LinkedHashMap();
        this.f2245d = new LinkedHashMap();
        this.f2246e = new t(this, 1);
    }
}
