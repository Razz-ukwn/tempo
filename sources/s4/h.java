package s4;

import ag.b1;
import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p2.c;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f<a, Object> f14675a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f14676b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f14677c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f14678d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f14679e;

    /* renamed from: f  reason: collision with root package name */
    public int f14680f;

    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final b f14681a;

        /* renamed from: b  reason: collision with root package name */
        public int f14682b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f14683c;

        public a(b bVar) {
            this.f14681a = bVar;
        }

        public final void a() {
            this.f14681a.d(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14682b == aVar.f14682b && this.f14683c == aVar.f14683c;
        }

        public final int hashCode() {
            int i8 = this.f14682b * 31;
            Class<?> cls = this.f14683c;
            return i8 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f14682b + "array=" + this.f14683c + '}';
        }
    }

    public static final class b extends c {
        public final k a() {
            return new a(this);
        }
    }

    public h(int i8) {
        this.f14679e = i8;
    }

    public final synchronized void a(int i8) {
        if (i8 >= 40) {
            try {
                b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i8 >= 20 || i8 == 15) {
            f(this.f14679e / 2);
        }
    }

    public final synchronized void b() {
        f(0);
    }

    public final synchronized <T> T c(int i8, Class<T> cls) {
        a aVar;
        boolean z10;
        Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i8));
        boolean z11 = false;
        if (ceilingKey != null) {
            int i10 = this.f14680f;
            if (i10 != 0) {
                if (this.f14679e / i10 < 2) {
                    z10 = false;
                    if (z10 || ceilingKey.intValue() <= i8 * 8) {
                        z11 = true;
                    }
                }
            }
            z10 = true;
            z11 = true;
        }
        if (z11) {
            b bVar = this.f14676b;
            int intValue = ceilingKey.intValue();
            aVar = (a) bVar.b();
            aVar.f14682b = intValue;
            aVar.f14683c = cls;
        } else {
            a aVar2 = (a) this.f14676b.b();
            aVar2.f14682b = i8;
            aVar2.f14683c = cls;
            aVar = aVar2;
        }
        return h(aVar, cls);
    }

    public final synchronized Object d() {
        Object h3;
        Class cls = byte[].class;
        synchronized (this) {
            a aVar = (a) this.f14676b.b();
            aVar.f14682b = 8;
            aVar.f14683c = cls;
            h3 = h(aVar, cls);
        }
        return h3;
    }

    public final void e(int i8, Class<?> cls) {
        NavigableMap<Integer, Integer> i10 = i(cls);
        Integer num = i10.get(Integer.valueOf(i8));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i8 + ", this: " + this);
        } else if (num.intValue() == 1) {
            i10.remove(Integer.valueOf(i8));
        } else {
            i10.put(Integer.valueOf(i8), Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void f(int i8) {
        while (this.f14680f > i8) {
            Object c3 = this.f14675a.c();
            b1.b(c3);
            a<?> g10 = g(c3.getClass());
            this.f14680f -= g10.a() * g10.c(c3);
            e(g10.c(c3), c3.getClass());
            if (Log.isLoggable(g10.b(), 2)) {
                Log.v(g10.b(), "evicted: " + g10.c(c3));
            }
        }
    }

    public final <T> a<T> g(Class<T> cls) {
        HashMap hashMap = this.f14678d;
        a<T> aVar = (a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new g();
            } else if (cls.equals(byte[].class)) {
                aVar = new e();
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        a<T> g10 = g(cls);
        T a10 = this.f14675a.a(aVar);
        if (a10 != null) {
            this.f14680f -= g10.a() * g10.c(a10);
            e(g10.c(a10), cls);
        }
        if (a10 != null) {
            return a10;
        }
        if (Log.isLoggable(g10.b(), 2)) {
            Log.v(g10.b(), "Allocated " + aVar.f14682b + " bytes");
        }
        return g10.newArray(aVar.f14682b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.f14677c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void put(T t2) {
        Class<?> cls = t2.getClass();
        a<?> g10 = g(cls);
        int c3 = g10.c(t2);
        int a10 = g10.a() * c3;
        int i8 = 1;
        if (a10 <= this.f14679e / 2) {
            a aVar = (a) this.f14676b.b();
            aVar.f14682b = c3;
            aVar.f14683c = cls;
            this.f14675a.b(aVar, t2);
            NavigableMap<Integer, Integer> i10 = i(cls);
            Integer num = i10.get(Integer.valueOf(aVar.f14682b));
            Integer valueOf = Integer.valueOf(aVar.f14682b);
            if (num != null) {
                i8 = 1 + num.intValue();
            }
            i10.put(valueOf, Integer.valueOf(i8));
            this.f14680f += a10;
            f(this.f14679e);
        }
    }
}
