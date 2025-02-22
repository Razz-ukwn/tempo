package ab;

import ab.b;
import ab.v;
import ab.x;
import cb.h;
import cb.o;
import db.c;
import db.e;
import db.j;
import db.k;
import db.l;
import db.n;
import db.q;
import db.r;
import db.s;
import fb.d;
import hb.b;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class i {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f246o = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Map<gb.a<?>, a<?>>> f247a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f248b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final h f249c;

    /* renamed from: d  reason: collision with root package name */
    public final e f250d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b0> f251e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Type, k<?>> f252f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f253g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f254h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f255i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f256j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f257k;

    /* renamed from: l  reason: collision with root package name */
    public final List<b0> f258l;
    public final List<b0> m;

    /* renamed from: n  reason: collision with root package name */
    public final List<w> f259n;

    public static class a<T> extends a0<T> {

        /* renamed from: a  reason: collision with root package name */
        public a0<T> f260a;

        public final T a(hb.a aVar) {
            a0<T> a0Var = this.f260a;
            if (a0Var != null) {
                return a0Var.a(aVar);
            }
            throw new IllegalStateException();
        }

        public final void b(b bVar, T t2) {
            a0<T> a0Var = this.f260a;
            if (a0Var != null) {
                a0Var.b(bVar, t2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        new gb.a(Object.class);
    }

    public i(o oVar, b.a aVar, Map map, boolean z10, boolean z11, v.a aVar2, List list, List list2, List list3, x.a aVar3, x.b bVar, List list4) {
        this.f252f = map;
        h hVar = new h(list4, map, z11);
        this.f249c = hVar;
        this.f253g = false;
        this.f254h = false;
        this.f255i = z10;
        this.f256j = false;
        this.f257k = false;
        this.f258l = list;
        this.m = list2;
        this.f259n = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(q.A);
        arrayList.add(aVar3 == x.f279a ? l.f7431c : new k(aVar3));
        arrayList.add(oVar);
        arrayList.addAll(list3);
        arrayList.add(q.f7474p);
        arrayList.add(q.f7466g);
        arrayList.add(q.f7463d);
        arrayList.add(q.f7464e);
        arrayList.add(q.f7465f);
        a0 fVar = aVar2 == v.f277a ? q.f7470k : new f();
        arrayList.add(new s(Long.TYPE, Long.class, fVar));
        arrayList.add(new s(Double.TYPE, Double.class, new d()));
        arrayList.add(new s(Float.TYPE, Float.class, new e()));
        arrayList.add(bVar == x.f280b ? j.f7428b : new db.i(new j(bVar)));
        arrayList.add(q.f7467h);
        arrayList.add(q.f7468i);
        arrayList.add(new r(AtomicLong.class, new z(new g(fVar))));
        arrayList.add(new r(AtomicLongArray.class, new z(new h(fVar))));
        arrayList.add(q.f7469j);
        arrayList.add(q.f7471l);
        arrayList.add(q.f7475q);
        arrayList.add(q.f7476r);
        arrayList.add(new r(BigDecimal.class, q.m));
        arrayList.add(new r(BigInteger.class, q.f7472n));
        arrayList.add(new r(cb.q.class, q.f7473o));
        arrayList.add(q.f7477s);
        arrayList.add(q.f7478t);
        arrayList.add(q.f7480v);
        arrayList.add(q.f7481w);
        arrayList.add(q.f7483y);
        arrayList.add(q.f7479u);
        arrayList.add(q.f7461b);
        arrayList.add(c.f7414b);
        arrayList.add(q.f7482x);
        if (d.f8671a) {
            arrayList.add(d.f8675e);
            arrayList.add(d.f8674d);
            arrayList.add(d.f8676f);
        }
        arrayList.add(db.a.f7408c);
        arrayList.add(q.f7460a);
        arrayList.add(new db.b(hVar));
        arrayList.add(new db.h(hVar));
        e eVar = new e(hVar);
        this.f250d = eVar;
        arrayList.add(eVar);
        arrayList.add(q.B);
        arrayList.add(new n(hVar, aVar, oVar, eVar, list4));
        this.f251e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        Object obj = null;
        if (str != null) {
            hb.a aVar = new hb.a(new StringReader(str));
            boolean z10 = this.f257k;
            aVar.f9288b = true;
            try {
                aVar.k0();
                obj = c(new gb.a(cls)).a(aVar);
            } catch (EOFException e10) {
                if (1 == 0) {
                    throw new u((Exception) e10);
                }
            } catch (IllegalStateException e11) {
                throw new u((Exception) e11);
            } catch (IOException e12) {
                throw new u((Exception) e12);
            } catch (AssertionError e13) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e13.getMessage());
                assertionError.initCause(e13);
                throw assertionError;
            } catch (Throwable th) {
                aVar.f9288b = z10;
                throw th;
            }
            aVar.f9288b = z10;
            if (obj != null) {
                try {
                    if (aVar.k0() != 10) {
                        throw new u("JSON document was not fully consumed.");
                    }
                } catch (hb.c e14) {
                    throw new u((Exception) e14);
                } catch (IOException e15) {
                    throw new o((Exception) e15);
                }
            }
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(obj);
    }

    public final <T> a0<T> c(gb.a<T> aVar) {
        boolean z10;
        ConcurrentHashMap concurrentHashMap = this.f248b;
        a0<T> a0Var = (a0) concurrentHashMap.get(aVar);
        if (a0Var != null) {
            return a0Var;
        }
        ThreadLocal<Map<gb.a<?>, a<?>>> threadLocal = this.f247a;
        Map map = threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar2 = (a) map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a aVar3 = new a();
            map.put(aVar, aVar3);
            for (b0 a10 : this.f251e) {
                a0<T> a11 = a10.a(this, aVar);
                if (a11 != null) {
                    if (aVar3.f260a == null) {
                        aVar3.f260a = a11;
                        concurrentHashMap.put(aVar, a11);
                        return a11;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.9.1) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                threadLocal.remove();
            }
        }
    }

    public final <T> a0<T> d(b0 b0Var, gb.a<T> aVar) {
        List<b0> list = this.f251e;
        if (!list.contains(b0Var)) {
            b0Var = this.f250d;
        }
        boolean z10 = false;
        for (b0 next : list) {
            if (z10) {
                a0<T> a10 = next.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            } else if (next == b0Var) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final String toString() {
        return "{serializeNulls:" + this.f253g + ",factories:" + this.f251e + ",instanceCreators:" + this.f249c + "}";
    }
}
