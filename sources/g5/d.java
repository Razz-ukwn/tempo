package g5;

import java.util.ArrayList;
import p4.k;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8867a = new ArrayList();

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f8868a;

        /* renamed from: b  reason: collision with root package name */
        public final k<T> f8869b;

        public a(Class<T> cls, k<T> kVar) {
            this.f8868a = cls;
            this.f8869b = kVar;
        }
    }

    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.f8867a.size();
        for (int i8 = 0; i8 < size; i8++) {
            a aVar = (a) this.f8867a.get(i8);
            if (aVar.f8868a.isAssignableFrom(cls)) {
                return aVar.f8869b;
            }
        }
        return null;
    }
}
