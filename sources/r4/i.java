package r4;

import ag.n2;
import androidx.compose.ui.platform.j3;
import com.bumptech.glide.h;
import com.bumptech.glide.k;
import d5.b;
import d5.c;
import g5.a;
import g5.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o.a;
import p4.d;
import p4.f;
import p4.l;
import r4.j;
import v4.n;
import v4.p;

public final class i<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f13893a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13894b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public h f13895c;

    /* renamed from: d  reason: collision with root package name */
    public Object f13896d;

    /* renamed from: e  reason: collision with root package name */
    public int f13897e;

    /* renamed from: f  reason: collision with root package name */
    public int f13898f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f13899g;

    /* renamed from: h  reason: collision with root package name */
    public j.d f13900h;

    /* renamed from: i  reason: collision with root package name */
    public p4.h f13901i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, l<?>> f13902j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f13903k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13904l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public f f13905n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.j f13906o;

    /* renamed from: p  reason: collision with root package name */
    public m f13907p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f13908q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f13909r;

    public final ArrayList a() {
        boolean z10 = this.m;
        ArrayList arrayList = this.f13894b;
        if (!z10) {
            this.m = true;
            arrayList.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i8 = 0; i8 < size; i8++) {
                n.a aVar = (n.a) b10.get(i8);
                if (!arrayList.contains(aVar.f16188a)) {
                    arrayList.add(aVar.f16188a);
                }
                int i10 = 0;
                while (true) {
                    List<f> list = aVar.f16189b;
                    if (i10 >= list.size()) {
                        break;
                    }
                    if (!arrayList.contains(list.get(i10))) {
                        arrayList.add(list.get(i10));
                    }
                    i10++;
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f13904l;
        ArrayList arrayList = this.f13893a;
        if (!z10) {
            this.f13904l = true;
            arrayList.clear();
            List e10 = this.f13895c.f4061b.e(this.f13896d);
            int size = e10.size();
            for (int i8 = 0; i8 < size; i8++) {
                n.a a10 = ((n) e10.get(i8)).a(this.f13896d, this.f13897e, this.f13898f, this.f13901i);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
        }
        return arrayList;
    }

    public final <Data> u<Data, ?, Transcode> c(Class<Data> cls) {
        u<Data, ?, Transcode> orDefault;
        ArrayList arrayList;
        boolean z10;
        b bVar;
        Class<Data> cls2 = cls;
        k kVar = this.f13895c.f4061b;
        Class<?> cls3 = this.f13899g;
        Class<Transcode> cls4 = this.f13903k;
        g5.b bVar2 = kVar.f4085i;
        l5.k andSet = bVar2.f8861b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new l5.k();
        }
        andSet.f11004a = cls2;
        andSet.f11005b = cls3;
        andSet.f11006c = cls4;
        synchronized (bVar2.f8860a) {
            orDefault = bVar2.f8860a.getOrDefault(andSet, null);
        }
        bVar2.f8861b.set(andSet);
        kVar.f4085i.getClass();
        if (g5.b.f8859c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = kVar.f4079c.b(cls2, cls3).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = kVar.f4082f.a(cls5, cls4).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    c cVar = kVar.f4079c;
                    synchronized (cVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = cVar.f8862a.iterator();
                        while (it3.hasNext()) {
                            List<c.a> list = (List) cVar.f8863b.get((String) it3.next());
                            if (list != null) {
                                for (c.a aVar : list) {
                                    if (aVar.f8864a.isAssignableFrom(cls2) && cls5.isAssignableFrom(aVar.f8865b)) {
                                        arrayList.add(aVar.f8866c);
                                    }
                                }
                            }
                        }
                    }
                    d5.c cVar2 = kVar.f4082f;
                    synchronized (cVar2) {
                        if (cls6.isAssignableFrom(cls5)) {
                            bVar = n2.f450b;
                        } else {
                            Iterator it4 = cVar2.f7300a.iterator();
                            while (it4.hasNext()) {
                                c.a aVar2 = (c.a) it4.next();
                                if (!aVar2.f7301a.isAssignableFrom(cls5) || !cls6.isAssignableFrom(aVar2.f7302b)) {
                                    z10 = false;
                                    continue;
                                } else {
                                    z10 = true;
                                    continue;
                                }
                                if (z10) {
                                    bVar = aVar2.f7303c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                    }
                    l lVar = r2;
                    l lVar2 = new l(cls, cls5, cls6, arrayList, bVar, kVar.f4086j);
                    arrayList2.add(lVar);
                }
            }
        }
        u<Data, ?, Transcode> uVar = arrayList2.isEmpty() ? null : new u<>(cls, cls3, cls4, arrayList2, kVar.f4086j);
        g5.b bVar3 = kVar.f4085i;
        synchronized (bVar3.f8860a) {
            bVar3.f8860a.put(new l5.k(cls2, cls3, cls4), uVar != null ? uVar : g5.b.f8859c);
        }
        return uVar;
    }

    public final List<Class<?>> d() {
        List<Class<?>> list;
        ArrayList d10;
        k kVar = this.f13895c.f4061b;
        Class<?> cls = this.f13896d.getClass();
        Class<?> cls2 = this.f13899g;
        Class<Transcode> cls3 = this.f13903k;
        j3 j3Var = kVar.f4084h;
        l5.k kVar2 = (l5.k) ((AtomicReference) j3Var.f1338a).getAndSet((Object) null);
        if (kVar2 == null) {
            kVar2 = new l5.k(cls, cls2, cls3);
        } else {
            kVar2.f11004a = cls;
            kVar2.f11005b = cls2;
            kVar2.f11006c = cls3;
        }
        synchronized (((a) j3Var.f1339b)) {
            list = (List) ((a) j3Var.f1339b).getOrDefault(kVar2, null);
        }
        ((AtomicReference) j3Var.f1338a).set(kVar2);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            p pVar = kVar.f4077a;
            synchronized (pVar) {
                d10 = pVar.f16191a.d(cls);
            }
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                Iterator it2 = kVar.f4079c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!kVar.f4082f.a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            j3 j3Var2 = kVar.f4084h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((a) j3Var2.f1339b)) {
                ((a) j3Var2.f1339b).put(new l5.k(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final <X> d<X> e(X x10) {
        d<T> dVar;
        g5.a aVar = this.f13895c.f4061b.f4078b;
        Class<?> cls = x10.getClass();
        synchronized (aVar) {
            Iterator it = aVar.f8856a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                a.C0156a aVar2 = (a.C0156a) it.next();
                if (aVar2.f8857a.isAssignableFrom(cls)) {
                    dVar = aVar2.f8858b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new k.e(x10.getClass());
    }

    public final <Z> l<Z> f(Class<Z> cls) {
        l<Z> lVar = this.f13902j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, l<?>>> it = this.f13902j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f13902j.isEmpty() || !this.f13908q) {
            return x4.b.f16962b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
