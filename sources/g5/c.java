package g5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8862a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8863b = new HashMap();

    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f8864a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f8865b;

        /* renamed from: c  reason: collision with root package name */
        public final j<T, R> f8866c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f8864a = cls;
            this.f8865b = cls2;
            this.f8866c = jVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f8862a.contains(str)) {
            this.f8862a.add(str);
        }
        list = (List) this.f8863b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f8863b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f8862a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f8863b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.f8864a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f8865b)) && !arrayList.contains(aVar.f8865b)) {
                        arrayList.add(aVar.f8865b);
                    }
                }
            }
        }
        return arrayList;
    }
}
