package db;

import ab.a0;
import ab.b0;
import ab.i;
import ab.l;
import ab.n;
import ab.o;
import ab.p;
import ab.q;
import ab.u;
import androidx.fragment.app.z;
import cb.s;
import hb.b;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

public final class h implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final cb.h f7421a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7422b = false;

    public final class a<K, V> extends a0<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final p f7423a;

        /* renamed from: b  reason: collision with root package name */
        public final p f7424b;

        /* renamed from: c  reason: collision with root package name */
        public final s<? extends Map<K, V>> f7425c;

        public a(i iVar, Type type, a0<K> a0Var, Type type2, a0<V> a0Var2, s<? extends Map<K, V>> sVar) {
            this.f7423a = new p(iVar, a0Var, type);
            this.f7424b = new p(iVar, a0Var2, type2);
            this.f7425c = sVar;
        }

        public final Object a(hb.a aVar) {
            int k02 = aVar.k0();
            if (k02 == 9) {
                aVar.d0();
                return null;
            }
            Map map = (Map) this.f7425c.g();
            p pVar = this.f7424b;
            p pVar2 = this.f7423a;
            if (k02 == 1) {
                aVar.c();
                while (aVar.F()) {
                    aVar.c();
                    Object a10 = pVar2.a(aVar);
                    if (map.put(a10, pVar.a(aVar)) == null) {
                        aVar.p();
                    } else {
                        throw new u(c4.a.c("duplicate key: ", a10));
                    }
                }
                aVar.p();
            } else {
                aVar.d();
                while (aVar.F()) {
                    z.f2174a.F(aVar);
                    Object a11 = pVar2.a(aVar);
                    if (map.put(a11, pVar.a(aVar)) != null) {
                        throw new u(c4.a.c("duplicate key: ", a11));
                    }
                }
                aVar.q();
            }
            return map;
        }

        public final void b(b bVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                bVar.z();
                return;
            }
            boolean z10 = h.this.f7422b;
            p pVar = this.f7424b;
            if (!z10) {
                bVar.e();
                for (Map.Entry entry : map.entrySet()) {
                    bVar.s(String.valueOf(entry.getKey()));
                    pVar.b(bVar, entry.getValue());
                }
                bVar.q();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i8 = 0;
            boolean z11 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                Object key = entry2.getKey();
                p pVar2 = this.f7423a;
                pVar2.getClass();
                try {
                    g gVar = new g();
                    pVar2.b(gVar, key);
                    ArrayList arrayList3 = gVar.I;
                    if (arrayList3.isEmpty()) {
                        n nVar = gVar.K;
                        arrayList.add(nVar);
                        arrayList2.add(entry2.getValue());
                        nVar.getClass();
                        z11 |= (nVar instanceof l) || (nVar instanceof q);
                    } else {
                        throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                    }
                } catch (IOException e10) {
                    throw new o((Exception) e10);
                }
            }
            if (z11) {
                bVar.d();
                int size = arrayList.size();
                while (i8 < size) {
                    bVar.d();
                    q.f7484z.b(bVar, (n) arrayList.get(i8));
                    pVar.b(bVar, arrayList2.get(i8));
                    bVar.p();
                    i8++;
                }
                bVar.p();
                return;
            }
            bVar.e();
            int size2 = arrayList.size();
            while (i8 < size2) {
                n nVar2 = (n) arrayList.get(i8);
                nVar2.getClass();
                boolean z12 = nVar2 instanceof ab.s;
                if (z12) {
                    if (z12) {
                        ab.s sVar = (ab.s) nVar2;
                        Serializable serializable = sVar.f276a;
                        if (serializable instanceof Number) {
                            str = String.valueOf(sVar.b());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(sVar.a());
                        } else if (serializable instanceof String) {
                            str = sVar.c();
                        } else {
                            throw new AssertionError();
                        }
                    } else {
                        throw new IllegalStateException("Not a JSON Primitive: " + nVar2);
                    }
                } else if (nVar2 instanceof p) {
                    str = "null";
                } else {
                    throw new AssertionError();
                }
                bVar.s(str);
                pVar.b(bVar, arrayList2.get(i8));
                i8++;
            }
            bVar.q();
        }
    }

    public h(cb.h hVar) {
        this.f7421a = hVar;
    }

    public final <T> a0<T> a(i iVar, gb.a<T> aVar) {
        Type[] typeArr;
        Type type = aVar.f8929b;
        Class<Map> cls = Map.class;
        Class<? super T> cls2 = aVar.f8928a;
        if (!cls.isAssignableFrom(cls2)) {
            return null;
        }
        if (type == Properties.class) {
            Class<String> cls3 = String.class;
            typeArr = new Type[]{cls3, cls3};
        } else {
            Type g10 = cb.a.g(type, cls2, cls);
            if (g10 instanceof ParameterizedType) {
                typeArr = ((ParameterizedType) g10).getActualTypeArguments();
            } else {
                Class<Object> cls4 = Object.class;
                typeArr = new Type[]{cls4, cls4};
            }
        }
        Type type2 = typeArr[0];
        return new a(iVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? q.f7462c : iVar.c(new gb.a(type2)), typeArr[1], iVar.c(new gb.a(typeArr[1])), this.f7421a.a(aVar));
    }
}
