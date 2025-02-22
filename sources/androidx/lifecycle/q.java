package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.j;
import j.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k.b;

public final class q extends j {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2302b = true;

    /* renamed from: c  reason: collision with root package name */
    public k.a<o, a> f2303c = new k.a<>();

    /* renamed from: d  reason: collision with root package name */
    public j.b f2304d = j.b.f2278b;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<p> f2305e;

    /* renamed from: f  reason: collision with root package name */
    public int f2306f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2307g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2308h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<j.b> f2309i = new ArrayList<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public j.b f2310a;

        /* renamed from: b  reason: collision with root package name */
        public final n f2311b;

        public a(o oVar, j.b bVar) {
            n nVar;
            sf.j.c(oVar);
            HashMap hashMap = s.f2314a;
            boolean z10 = oVar instanceof n;
            boolean z11 = oVar instanceof e;
            if (z10 && z11) {
                nVar = new DefaultLifecycleObserverAdapter((e) oVar, (n) oVar);
            } else if (z11) {
                nVar = new DefaultLifecycleObserverAdapter((e) oVar, (n) null);
            } else if (z10) {
                nVar = (n) oVar;
            } else {
                Class<?> cls = oVar.getClass();
                if (s.b(cls) == 2) {
                    Object obj = s.f2315b.get(cls);
                    sf.j.c(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        nVar = new SingleGeneratedAdapterObserver(s.a((Constructor) list.get(0), oVar));
                    } else {
                        int size = list.size();
                        g[] gVarArr = new g[size];
                        for (int i8 = 0; i8 < size; i8++) {
                            gVarArr[i8] = s.a((Constructor) list.get(i8), oVar);
                        }
                        nVar = new CompositeGeneratedAdaptersObserver(gVarArr);
                    }
                } else {
                    nVar = new ReflectiveGenericLifecycleObserver(oVar);
                }
            }
            this.f2311b = nVar;
            this.f2310a = bVar;
        }

        public final void a(p pVar, j.a aVar) {
            j.b a10 = aVar.a();
            j.b bVar = this.f2310a;
            sf.j.f(bVar, "state1");
            if (a10.compareTo(bVar) < 0) {
                bVar = a10;
            }
            this.f2310a = bVar;
            this.f2311b.d(pVar, aVar);
            this.f2310a = a10;
        }
    }

    public q(p pVar) {
        sf.j.f(pVar, "provider");
        this.f2305e = new WeakReference<>(pVar);
    }

    public final void a(o oVar) {
        p pVar;
        sf.j.f(oVar, "observer");
        e("addObserver");
        j.b bVar = this.f2304d;
        j.b bVar2 = j.b.f2277a;
        if (bVar != bVar2) {
            bVar2 = j.b.f2278b;
        }
        a aVar = new a(oVar, bVar2);
        if (this.f2303c.b(oVar, aVar) == null && (pVar = this.f2305e.get()) != null) {
            boolean z10 = this.f2306f != 0 || this.f2307g;
            j.b d10 = d(oVar);
            this.f2306f++;
            while (aVar.f2310a.compareTo(d10) < 0 && this.f2303c.f10234e.containsKey(oVar)) {
                j.b bVar3 = aVar.f2310a;
                ArrayList<j.b> arrayList = this.f2309i;
                arrayList.add(bVar3);
                j.a.C0026a aVar2 = j.a.Companion;
                j.b bVar4 = aVar.f2310a;
                aVar2.getClass();
                j.a b10 = j.a.C0026a.b(bVar4);
                if (b10 != null) {
                    aVar.a(pVar, b10);
                    arrayList.remove(arrayList.size() - 1);
                    d10 = d(oVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f2310a);
                }
            }
            if (!z10) {
                i();
            }
            this.f2306f--;
        }
    }

    public final j.b b() {
        return this.f2304d;
    }

    public final void c(o oVar) {
        sf.j.f(oVar, "observer");
        e("removeObserver");
        this.f2303c.c(oVar);
    }

    public final j.b d(o oVar) {
        a aVar;
        k.a<o, a> aVar2 = this.f2303c;
        j.b bVar = null;
        b.c<K, V> cVar = aVar2.f10234e.containsKey(oVar) ? aVar2.f10234e.get(oVar).f10242d : null;
        j.b bVar2 = (cVar == null || (aVar = (a) cVar.f10240b) == null) ? null : aVar.f2310a;
        ArrayList<j.b> arrayList = this.f2309i;
        if (!arrayList.isEmpty()) {
            bVar = arrayList.get(arrayList.size() - 1);
        }
        j.b bVar3 = this.f2304d;
        sf.j.f(bVar3, "state1");
        if (bVar2 == null || bVar2.compareTo(bVar3) >= 0) {
            bVar2 = bVar3;
        }
        return (bVar == null || bVar.compareTo(bVar2) >= 0) ? bVar2 : bVar;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        if (this.f2302b && !c.F().G()) {
            throw new IllegalStateException(b2.c.a("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void f(j.a aVar) {
        sf.j.f(aVar, "event");
        e("handleLifecycleEvent");
        g(aVar.a());
    }

    public final void g(j.b bVar) {
        j.b bVar2 = this.f2304d;
        if (bVar2 != bVar) {
            j.b bVar3 = j.b.f2278b;
            j.b bVar4 = j.b.f2277a;
            if ((bVar2 == bVar3 && bVar == bVar4) ? false : true) {
                this.f2304d = bVar;
                if (this.f2307g || this.f2306f != 0) {
                    this.f2308h = true;
                    return;
                }
                this.f2307g = true;
                i();
                this.f2307g = false;
                if (this.f2304d == bVar4) {
                    this.f2303c = new k.a<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f2304d + " in component " + this.f2305e.get()).toString());
        }
    }

    public final void h(j.b bVar) {
        sf.j.f(bVar, "state");
        e("setCurrentState");
        g(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0162 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.p> r0 = r7.f2305e
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.p r0 = (androidx.lifecycle.p) r0
            if (r0 == 0) goto L_0x0165
        L_0x000a:
            k.a<androidx.lifecycle.o, androidx.lifecycle.q$a> r1 = r7.f2303c
            int r2 = r1.f10238d
            r3 = 0
            if (r2 != 0) goto L_0x0012
            goto L_0x0030
        L_0x0012:
            k.b$c<K, V> r1 = r1.f10235a
            sf.j.c(r1)
            V r1 = r1.f10240b
            androidx.lifecycle.q$a r1 = (androidx.lifecycle.q.a) r1
            androidx.lifecycle.j$b r1 = r1.f2310a
            k.a<androidx.lifecycle.o, androidx.lifecycle.q$a> r2 = r7.f2303c
            k.b$c<K, V> r2 = r2.f10236b
            sf.j.c(r2)
            V r2 = r2.f10240b
            androidx.lifecycle.q$a r2 = (androidx.lifecycle.q.a) r2
            androidx.lifecycle.j$b r2 = r2.f2310a
            if (r1 != r2) goto L_0x0032
            androidx.lifecycle.j$b r1 = r7.f2304d
            if (r1 != r2) goto L_0x0032
        L_0x0030:
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = r3
        L_0x0033:
            if (r1 != 0) goto L_0x0162
            r7.f2308h = r3
            androidx.lifecycle.j$b r1 = r7.f2304d
            k.a<androidx.lifecycle.o, androidx.lifecycle.q$a> r2 = r7.f2303c
            k.b$c<K, V> r2 = r2.f10235a
            sf.j.c(r2)
            V r2 = r2.f10240b
            androidx.lifecycle.q$a r2 = (androidx.lifecycle.q.a) r2
            androidx.lifecycle.j$b r2 = r2.f2310a
            int r1 = r1.compareTo(r2)
            java.util.ArrayList<androidx.lifecycle.j$b> r2 = r7.f2309i
            if (r1 >= 0) goto L_0x00d0
            k.a<androidx.lifecycle.o, androidx.lifecycle.q$a> r1 = r7.f2303c
            k.b$b r3 = new k.b$b
            k.b$c<K, V> r4 = r1.f10236b
            k.b$c<K, V> r5 = r1.f10235a
            r3.<init>(r4, r5)
            java.util.WeakHashMap<k.b$f<K, V>, java.lang.Boolean> r1 = r1.f10237c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.put(r3, r4)
        L_0x0060:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00d0
            boolean r1 = r7.f2308h
            if (r1 != 0) goto L_0x00d0
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r4 = "next()"
            sf.j.e(r1, r4)
            java.lang.Object r4 = r1.getKey()
            androidx.lifecycle.o r4 = (androidx.lifecycle.o) r4
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.q$a r1 = (androidx.lifecycle.q.a) r1
        L_0x0081:
            androidx.lifecycle.j$b r5 = r1.f2310a
            androidx.lifecycle.j$b r6 = r7.f2304d
            int r5 = r5.compareTo(r6)
            if (r5 <= 0) goto L_0x0060
            boolean r5 = r7.f2308h
            if (r5 != 0) goto L_0x0060
            k.a<androidx.lifecycle.o, androidx.lifecycle.q$a> r5 = r7.f2303c
            java.util.HashMap<K, k.b$c<K, V>> r5 = r5.f10234e
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0060
            androidx.lifecycle.j$a$a r5 = androidx.lifecycle.j.a.Companion
            androidx.lifecycle.j$b r6 = r1.f2310a
            r5.getClass()
            androidx.lifecycle.j$a r5 = androidx.lifecycle.j.a.C0026a.a(r6)
            if (r5 == 0) goto L_0x00ba
            androidx.lifecycle.j$b r6 = r5.a()
            r2.add(r6)
            r1.a(r0, r5)
            int r5 = r2.size()
            int r5 = r5 + -1
            r2.remove(r5)
            goto L_0x0081
        L_0x00ba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event down from "
            r2.<init>(r3)
            androidx.lifecycle.j$b r1 = r1.f2310a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d0:
            k.a<androidx.lifecycle.o, androidx.lifecycle.q$a> r1 = r7.f2303c
            k.b$c<K, V> r1 = r1.f10236b
            boolean r3 = r7.f2308h
            if (r3 != 0) goto L_0x000a
            if (r1 == 0) goto L_0x000a
            androidx.lifecycle.j$b r3 = r7.f2304d
            V r1 = r1.f10240b
            androidx.lifecycle.q$a r1 = (androidx.lifecycle.q.a) r1
            androidx.lifecycle.j$b r1 = r1.f2310a
            int r1 = r3.compareTo(r1)
            if (r1 <= 0) goto L_0x000a
            k.a<androidx.lifecycle.o, androidx.lifecycle.q$a> r1 = r7.f2303c
            r1.getClass()
            k.b$d r3 = new k.b$d
            r3.<init>()
            java.util.WeakHashMap<k.b$f<K, V>, java.lang.Boolean> r1 = r1.f10237c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.put(r3, r4)
        L_0x00f9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x000a
            boolean r1 = r7.f2308h
            if (r1 != 0) goto L_0x000a
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            androidx.lifecycle.o r4 = (androidx.lifecycle.o) r4
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.q$a r1 = (androidx.lifecycle.q.a) r1
        L_0x0115:
            androidx.lifecycle.j$b r5 = r1.f2310a
            androidx.lifecycle.j$b r6 = r7.f2304d
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L_0x00f9
            boolean r5 = r7.f2308h
            if (r5 != 0) goto L_0x00f9
            k.a<androidx.lifecycle.o, androidx.lifecycle.q$a> r5 = r7.f2303c
            java.util.HashMap<K, k.b$c<K, V>> r5 = r5.f10234e
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x00f9
            androidx.lifecycle.j$b r5 = r1.f2310a
            r2.add(r5)
            androidx.lifecycle.j$a$a r5 = androidx.lifecycle.j.a.Companion
            androidx.lifecycle.j$b r6 = r1.f2310a
            r5.getClass()
            androidx.lifecycle.j$a r5 = androidx.lifecycle.j.a.C0026a.b(r6)
            if (r5 == 0) goto L_0x014c
            r1.a(r0, r5)
            int r5 = r2.size()
            int r5 = r5 + -1
            r2.remove(r5)
            goto L_0x0115
        L_0x014c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event up from "
            r2.<init>(r3)
            androidx.lifecycle.j$b r1 = r1.f2310a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0162:
            r7.f2308h = r3
            return
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.q.i():void");
    }
}
