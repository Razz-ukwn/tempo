package androidx.lifecycle;

import androidx.lifecycle.i0;
import java.util.Iterator;
import java.util.Map;
import k.b;

public final class t<T> extends v<T> {

    /* renamed from: l  reason: collision with root package name */
    public final b<LiveData<?>, a<?>> f2319l = new b<>();

    public static class a<V> implements w<V> {

        /* renamed from: a  reason: collision with root package name */
        public final LiveData<V> f2320a;

        /* renamed from: b  reason: collision with root package name */
        public final w<? super V> f2321b;

        /* renamed from: c  reason: collision with root package name */
        public int f2322c = -1;

        public a(v vVar, i0.a aVar) {
            this.f2320a = vVar;
            this.f2321b = aVar;
        }

        public final void b(V v3) {
            int i8 = this.f2322c;
            int i10 = this.f2320a.f2195g;
            if (i8 != i10) {
                this.f2322c = i10;
                this.f2321b.b(v3);
            }
        }
    }

    public final void g() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2319l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.f2320a.f(aVar);
            } else {
                return;
            }
        }
    }

    public final void h() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2319l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                a aVar = (a) ((Map.Entry) eVar.next()).getValue();
                aVar.f2320a.j(aVar);
            } else {
                return;
            }
        }
    }
}
