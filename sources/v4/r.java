package v4;

import ag.b1;
import c2.d;
import com.bumptech.glide.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m5.a;
import p4.h;
import v4.n;

public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f16202e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final a f16203f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16204a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f16205b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f16206c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final d<List<Throwable>> f16207d;

    public static class a implements n<Object, Object> {
        public final n.a<Object> a(Object obj, int i8, int i10, h hVar) {
            return null;
        }

        public final boolean b(Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f16208a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f16209b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f16210c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f16208a = cls;
            this.f16209b = cls2;
            this.f16210c = oVar;
        }
    }

    public static class c {
    }

    public r(a.c cVar) {
        c cVar2 = f16202e;
        this.f16207d = cVar;
        this.f16205b = cVar2;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f16204a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f16206c.contains(bVar)) {
                    if (bVar.f16208a.isAssignableFrom(cls)) {
                        this.f16206c.add(bVar);
                        n<? extends Model, ? extends Data> a10 = bVar.f16210c.a(this);
                        b1.b(a10);
                        arrayList.add(a10);
                        this.f16206c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f16206c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f16204a.iterator();
            boolean z10 = false;
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                b bVar = (b) it.next();
                if (this.f16206c.contains(bVar)) {
                    z10 = true;
                } else {
                    if (!bVar.f16208a.isAssignableFrom(cls) || !bVar.f16209b.isAssignableFrom(cls2)) {
                        z11 = false;
                    }
                    if (z11) {
                        this.f16206c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f16206c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f16205b;
                d<List<Throwable>> dVar = this.f16207d;
                cVar.getClass();
                return new q(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z10) {
                return f16203f;
            } else {
                throw new k.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f16206c.clear();
            throw th;
        }
    }

    public final <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        n<? extends Model, ? extends Data> a10 = bVar.f16210c.a(this);
        b1.b(a10);
        return a10;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f16204a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f16209b) && bVar.f16208a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f16209b);
            }
        }
        return arrayList;
    }
}
