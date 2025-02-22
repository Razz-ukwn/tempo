package i3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.q;
import ff.m;
import gf.s;
import gf.t;
import gf.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m3.e;
import sf.j;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public volatile m3.b f9507a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f9508b;

    /* renamed from: c  reason: collision with root package name */
    public x f9509c;

    /* renamed from: d  reason: collision with root package name */
    public m3.c f9510d;

    /* renamed from: e  reason: collision with root package name */
    public final k f9511e = c();

    /* renamed from: f  reason: collision with root package name */
    public boolean f9512f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends b> f9513g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f9514h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final ReentrantReadWriteLock f9515i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    public final ThreadLocal<Integer> f9516j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f9517k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f9518l;

    public static class a<T extends p> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f9519a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f9520b;

        /* renamed from: c  reason: collision with root package name */
        public final String f9521c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f9522d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f9523e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f9524f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public Executor f9525g;

        /* renamed from: h  reason: collision with root package name */
        public Executor f9526h;

        /* renamed from: i  reason: collision with root package name */
        public final int f9527i = 1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f9528j = true;

        /* renamed from: k  reason: collision with root package name */
        public boolean f9529k;

        /* renamed from: l  reason: collision with root package name */
        public final long f9530l = -1;
        public final c m = new c();

        /* renamed from: n  reason: collision with root package name */
        public final LinkedHashSet f9531n = new LinkedHashSet();

        /* renamed from: o  reason: collision with root package name */
        public HashSet f9532o;

        public a(Context context, Class<T> cls, String str) {
            j.f(context, "context");
            this.f9519a = context;
            this.f9520b = cls;
            this.f9521c = str;
        }

        public final void a(j3.a... aVarArr) {
            if (this.f9532o == null) {
                this.f9532o = new HashSet();
            }
            for (j3.a aVar : aVarArr) {
                HashSet hashSet = this.f9532o;
                j.c(hashSet);
                hashSet.add(Integer.valueOf(aVar.f9789a));
                HashSet hashSet2 = this.f9532o;
                j.c(hashSet2);
                hashSet2.add(Integer.valueOf(aVar.f9790b));
            }
            this.m.a((j3.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }

        public final T b() {
            String str;
            Executor executor = this.f9525g;
            if (executor == null && this.f9526h == null) {
                j.b bVar = j.c.f9669d;
                this.f9526h = bVar;
                this.f9525g = bVar;
            } else if (executor != null && this.f9526h == null) {
                this.f9526h = executor;
            } else if (executor == null) {
                this.f9525g = this.f9526h;
            }
            HashSet hashSet = this.f9532o;
            LinkedHashSet linkedHashSet = this.f9531n;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (!(!linkedHashSet.contains(Integer.valueOf(intValue)))) {
                        throw new IllegalArgumentException(q.a("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                    }
                }
            }
            b7.a aVar = new b7.a();
            if (this.f9530l <= 0) {
                String str2 = this.f9521c;
                c cVar = this.m;
                ArrayList arrayList = this.f9522d;
                int i8 = this.f9527i;
                if (i8 != 0) {
                    Context context = this.f9519a;
                    j.f(context, "context");
                    if (i8 == 1) {
                        Object systemService = context.getSystemService("activity");
                        j.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                        i8 = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
                    }
                    int i10 = i8;
                    Executor executor2 = this.f9525g;
                    if (executor2 != null) {
                        Executor executor3 = this.f9526h;
                        if (executor3 != null) {
                            f fVar = r2;
                            f fVar2 = new f(context, str2, aVar, cVar, arrayList, i10, executor2, executor3, this.f9528j, this.f9529k, linkedHashSet, this.f9523e, this.f9524f);
                            Class<T> cls = this.f9520b;
                            j.f(cls, "klass");
                            Package packageR = cls.getPackage();
                            j.c(packageR);
                            String name = packageR.getName();
                            String canonicalName = cls.getCanonicalName();
                            j.c(canonicalName);
                            j.e(name, "fullPackage");
                            boolean z10 = false;
                            if (!(name.length() == 0)) {
                                canonicalName = canonicalName.substring(name.length() + 1);
                                j.e(canonicalName, "this as java.lang.String).substring(startIndex)");
                            }
                            String replace = canonicalName.replace('.', '_');
                            j.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
                            String concat = replace.concat("_Impl");
                            try {
                                if (name.length() == 0) {
                                    z10 = true;
                                }
                                if (z10) {
                                    str = concat;
                                } else {
                                    str = name + '.' + concat;
                                }
                                Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
                                j.d(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                                T t2 = (p) cls2.newInstance();
                                t2.j(fVar);
                                return t2;
                            } catch (ClassNotFoundException unused) {
                                throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + concat + " does not exist");
                            } catch (IllegalAccessException unused2) {
                                throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
                            } catch (InstantiationException unused3) {
                                throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw null;
                }
            } else if (this.f9521c != null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else {
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
            }
        }
    }

    public static abstract class b {
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f9533a = new LinkedHashMap();

        public final void a(j3.a... aVarArr) {
            j.f(aVarArr, "migrations");
            for (j3.a aVar : aVarArr) {
                int i8 = aVar.f9789a;
                LinkedHashMap linkedHashMap = this.f9533a;
                Integer valueOf = Integer.valueOf(i8);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new TreeMap();
                    linkedHashMap.put(valueOf, obj);
                }
                TreeMap treeMap = (TreeMap) obj;
                int i10 = aVar.f9790b;
                if (treeMap.containsKey(Integer.valueOf(i10))) {
                    Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i10)) + " with " + aVar);
                }
                treeMap.put(Integer.valueOf(i10), aVar);
            }
        }
    }

    public p() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        j.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f9517k = synchronizedMap;
        this.f9518l = new LinkedHashMap();
    }

    public static Object o(Class cls, m3.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof g) {
            return o(cls, ((g) cVar).c());
        }
        return null;
    }

    public final void a() {
        if (!this.f9512f) {
            if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
            }
        }
    }

    public final void b() {
        if (!(i() || this.f9516j.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public abstract k c();

    public abstract m3.c d(f fVar);

    public List e(LinkedHashMap linkedHashMap) {
        j.f(linkedHashMap, "autoMigrationSpecs");
        return s.f8978a;
    }

    public final m3.c f() {
        m3.c cVar = this.f9510d;
        if (cVar != null) {
            return cVar;
        }
        j.l("internalOpenHelper");
        throw null;
    }

    public Set<Class<Object>> g() {
        return u.f8980a;
    }

    public Map<Class<?>, List<Class<?>>> h() {
        return t.f8979a;
    }

    public final boolean i() {
        return f().N().o0();
    }

    public final void j(f fVar) {
        boolean z10;
        this.f9510d = d(fVar);
        Set<Class<Object>> g10 = g();
        BitSet bitSet = new BitSet();
        Iterator<Class<Object>> it = g10.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.f9514h;
            int i8 = -1;
            boolean z11 = true;
            List<Object> list = fVar.f9461p;
            if (hasNext) {
                Class next = it.next();
                int size = list.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (next.isAssignableFrom(list.get(size).getClass())) {
                            bitSet.set(size);
                            i8 = size;
                            break;
                        } else if (i10 < 0) {
                            break;
                        } else {
                            size = i10;
                        }
                    }
                }
                if (i8 < 0) {
                    z11 = false;
                }
                if (z11) {
                    linkedHashMap.put(next, list.get(i8));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i11 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size2 = i11;
                        }
                    }
                }
                for (j3.a aVar : e(linkedHashMap)) {
                    int i12 = aVar.f9789a;
                    c cVar = fVar.f9450d;
                    LinkedHashMap linkedHashMap2 = cVar.f9533a;
                    if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                        if (map == null) {
                            map = t.f8979a;
                        }
                        z10 = map.containsKey(Integer.valueOf(aVar.f9790b));
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        cVar.a(aVar);
                    }
                }
                u uVar = (u) o(u.class, f());
                if (uVar != null) {
                    uVar.getClass();
                }
                a aVar2 = (a) o(a.class, f());
                k kVar = this.f9511e;
                if (aVar2 == null) {
                    f().setWriteAheadLoggingEnabled(fVar.f9453g == 3);
                    this.f9513g = fVar.f9451e;
                    this.f9508b = fVar.f9454h;
                    this.f9509c = new x(fVar.f9455i);
                    this.f9512f = fVar.f9452f;
                    Intent intent = fVar.f9456j;
                    if (intent != null) {
                        String str = fVar.f9448b;
                        if (str != null) {
                            kVar.getClass();
                            Context context = fVar.f9447a;
                            j.f(context, "context");
                            Executor executor = kVar.f9466a.f9508b;
                            if (executor != null) {
                                new m(context, str, intent, kVar, executor);
                            } else {
                                j.l("internalQueryExecutor");
                                throw null;
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    Map<Class<?>, List<Class<?>>> h3 = h();
                    BitSet bitSet2 = new BitSet();
                    Iterator<Map.Entry<Class<?>, List<Class<?>>>> it2 = h3.entrySet().iterator();
                    while (true) {
                        boolean hasNext2 = it2.hasNext();
                        List<Object> list2 = fVar.f9460o;
                        if (hasNext2) {
                            Map.Entry next2 = it2.next();
                            Class cls = (Class) next2.getKey();
                            Iterator it3 = ((List) next2.getValue()).iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Class cls2 = (Class) it3.next();
                                    int size3 = list2.size() - 1;
                                    if (size3 >= 0) {
                                        while (true) {
                                            int i13 = size3 - 1;
                                            if (cls2.isAssignableFrom(list2.get(size3).getClass())) {
                                                bitSet2.set(size3);
                                                break;
                                            } else if (i13 < 0) {
                                                break;
                                            } else {
                                                size3 = i13;
                                            }
                                        }
                                    }
                                    size3 = -1;
                                    if (size3 >= 0) {
                                        this.f9518l.put(cls2, list2.get(size3));
                                    } else {
                                        throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + cls.getCanonicalName() + " is missing in the database configuration.").toString());
                                    }
                                }
                            }
                        } else {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i14 = size4 - 1;
                                    if (!bitSet2.get(size4)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    } else if (i14 >= 0) {
                                        size4 = i14;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                } else {
                    kVar.getClass();
                    j.f((Object) null, "autoCloser");
                    throw null;
                }
            }
        }
    }

    public final void k() {
        f().N().U();
        if (!i()) {
            k kVar = this.f9511e;
            if (kVar.f9471f.compareAndSet(false, true)) {
                Executor executor = kVar.f9466a.f9508b;
                if (executor != null) {
                    executor.execute(kVar.f9478n);
                } else {
                    j.l("internalQueryExecutor");
                    throw null;
                }
            }
        }
    }

    public final void l(n3.c cVar) {
        k kVar = this.f9511e;
        kVar.getClass();
        synchronized (kVar.m) {
            if (kVar.f9472g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            cVar.l("PRAGMA temp_store = MEMORY;");
            cVar.l("PRAGMA recursive_triggers='ON';");
            cVar.l("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            kVar.f(cVar);
            kVar.f9473h = cVar.o("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            kVar.f9472g = true;
            m mVar = m.f8717a;
        }
    }

    public final boolean m() {
        m3.b bVar = this.f9507a;
        return bVar != null && bVar.isOpen();
    }

    public final Cursor n(e eVar, CancellationSignal cancellationSignal) {
        j.f(eVar, "query");
        a();
        b();
        return cancellationSignal != null ? f().N().Z(eVar, cancellationSignal) : f().N().u0(eVar);
    }
}
