package d5;

import java.util.ArrayList;
import java.util.Iterator;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7300a = new ArrayList();

    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f7301a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f7302b;

        /* renamed from: c  reason: collision with root package name */
        public final b<Z, R> f7303c;

        public a(Class<Z> cls, Class<R> cls2, b<Z, R> bVar) {
            this.f7301a = cls;
            this.f7302b = cls2;
            this.f7303c = bVar;
        }
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f7300a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if ((aVar.f7301a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f7302b)) && !arrayList.contains(aVar.f7302b)) {
                arrayList.add(aVar.f7302b);
            }
        }
        return arrayList;
    }
}
