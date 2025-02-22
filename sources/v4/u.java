package v4;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import p4.h;
import v4.n;

public final class u<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final u<?> f16218a = new u<>();

    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f16219a = new a<>();

        public final n<Model, Model> a(r rVar) {
            return u.f16218a;
        }
    }

    public static class b<Model> implements d<Model> {

        /* renamed from: a  reason: collision with root package name */
        public final Model f16220a;

        public b(Model model) {
            this.f16220a = model;
        }

        public final Class<Model> a() {
            return this.f16220a.getClass();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final p4.a d() {
            return p4.a.f12446a;
        }

        public final void e(j jVar, d.a<? super Model> aVar) {
            aVar.f(this.f16220a);
        }
    }

    public final n.a<Model> a(Model model, int i8, int i10, h hVar) {
        return new n.a<>(new k5.b(model), new b(model));
    }

    public final boolean b(Model model) {
        return true;
    }
}
