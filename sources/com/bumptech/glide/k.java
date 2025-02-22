package com.bumptech.glide;

import ag.b1;
import androidx.compose.ui.platform.j3;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.f;
import d5.c;
import g5.c;
import g5.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m5.a;
import p4.j;
import t.r1;
import v4.n;
import v4.o;
import v4.p;
import v4.r;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final p f4077a;

    /* renamed from: b  reason: collision with root package name */
    public final g5.a f4078b;

    /* renamed from: c  reason: collision with root package name */
    public final g5.c f4079c;

    /* renamed from: d  reason: collision with root package name */
    public final g5.d f4080d;

    /* renamed from: e  reason: collision with root package name */
    public final f f4081e;

    /* renamed from: f  reason: collision with root package name */
    public final d5.c f4082f;

    /* renamed from: g  reason: collision with root package name */
    public final r1 f4083g;

    /* renamed from: h  reason: collision with root package name */
    public final j3 f4084h = new j3(2);

    /* renamed from: i  reason: collision with root package name */
    public final g5.b f4085i = new g5.b();

    /* renamed from: j  reason: collision with root package name */
    public final a.c f4086j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public k() {
        a.c cVar = new a.c(new c2.f(20), new m5.b(), new m5.c());
        this.f4086j = cVar;
        this.f4077a = new p(cVar);
        this.f4078b = new g5.a();
        this.f4079c = new g5.c();
        this.f4080d = new g5.d();
        this.f4081e = new f();
        this.f4082f = new d5.c();
        this.f4083g = new r1(1);
        List<String> asList = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        g5.c cVar2 = this.f4079c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f8862a);
            cVar2.f8862a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f8862a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    cVar2.f8862a.add(str);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, o oVar) {
        p pVar = this.f4077a;
        synchronized (pVar) {
            r rVar = pVar.f16191a;
            synchronized (rVar) {
                r.b bVar = new r.b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f16204a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f16192b.f16193a.clear();
        }
    }

    public final void b(Class cls, p4.k kVar) {
        g5.d dVar = this.f4080d;
        synchronized (dVar) {
            dVar.f8867a.add(new d.a(cls, kVar));
        }
    }

    public final void c(j jVar, Class cls, Class cls2, String str) {
        g5.c cVar = this.f4079c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a(cls, cls2, jVar));
        }
    }

    public final List<ImageHeaderParser> d() {
        List<ImageHeaderParser> list;
        r1 r1Var = this.f4083g;
        synchronized (r1Var) {
            list = r1Var.f15222a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    public final <Model> List<n<Model, ?>> e(Model model) {
        List<n<Model, ?>> list;
        p pVar = this.f4077a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0301a aVar = (p.a.C0301a) pVar.f16192b.f16193a.get(cls);
            list = aVar == null ? null : aVar.f16194a;
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f16191a.a(cls));
                if (((p.a.C0301a) pVar.f16192b.f16193a.put(cls, new p.a.C0301a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i8 = 0; i8 < size; i8++) {
                n nVar = list.get(i8);
                if (nVar.b(model)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i8);
                        z10 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    public final <X> com.bumptech.glide.load.data.e<X> f(X x10) {
        com.bumptech.glide.load.data.e<X> b10;
        f fVar = this.f4081e;
        synchronized (fVar) {
            b1.b(x10);
            e.a aVar = (e.a) fVar.f4110a.get(x10.getClass());
            if (aVar == null) {
                Iterator it = fVar.f4110a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(x10.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f.f4109b;
            }
            b10 = aVar.b(x10);
        }
        return b10;
    }

    public final void g(e.a aVar) {
        f fVar = this.f4081e;
        synchronized (fVar) {
            fVar.f4110a.put(aVar.a(), aVar);
        }
    }

    public final void h(Class cls, Class cls2, d5.b bVar) {
        d5.c cVar = this.f4082f;
        synchronized (cVar) {
            cVar.f7300a.add(new c.a(cls, cls2, bVar));
        }
    }
}
