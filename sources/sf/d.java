package sf;

import d2.f1;
import ff.a;
import gf.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import rf.c;
import rf.e;
import rf.f;
import rf.g;
import rf.h;
import rf.i;
import rf.j;
import rf.k;
import rf.l;
import rf.m;
import rf.n;
import rf.o;
import rf.p;
import rf.q;
import rf.r;
import rf.s;
import rf.t;
import rf.u;
import rf.v;
import rf.w;
import xf.b;

public final class d implements b<Object>, c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends a<?>>, Integer> f14949b;

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f14950c;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f14951a;

    static {
        int i8 = 0;
        Iterable P = cb.d.P(rf.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, rf.b.class, c.class, rf.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(gf.m.n0(P));
        for (Object next : P) {
            int i10 = i8 + 1;
            if (i8 >= 0) {
                arrayList.add(new ff.g((Class) next, Integer.valueOf(i8)));
                i8 = i10;
            } else {
                cb.d.i0();
                throw null;
            }
        }
        f14949b = y.V(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        j.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            j.e(str, "kotlinName");
            sb2.append(zf.n.W0(str, '.', str));
            sb2.append("CompanionObject");
            hashMap3.put(sb2.toString(), str.concat(".Companion"));
        }
        for (Map.Entry next2 : f14949b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(f1.B(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object key = entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(key, zf.n.W0(str2, '.', str2));
        }
        f14950c = linkedHashMap;
    }

    public d(Class<?> cls) {
        j.f(cls, "jClass");
        this.f14951a = cls;
    }

    public final Class<?> a() {
        return this.f14951a;
    }

    public final String b() {
        String str;
        Class<?> cls = this.f14951a;
        j.f(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return zf.n.V0(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                return zf.n.U0(simpleName, '$');
            }
            return zf.n.V0(simpleName, enclosingConstructor.getName() + '$');
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = f14950c;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        return str3 == null ? cls.getSimpleName() : str3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && j.a(cb.b.z(this), cb.b.z((b) obj));
    }

    public final int hashCode() {
        return cb.b.z(this).hashCode();
    }

    public final String toString() {
        return this.f14951a.toString() + " (Kotlin reflection is not available)";
    }
}
