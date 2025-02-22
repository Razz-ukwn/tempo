package yg;

import androidx.emoji2.text.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import jg.x;
import yg.c;

public final class i extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f17477a;

    public static final class a<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f17478a;

        /* renamed from: b  reason: collision with root package name */
        public final b<T> f17479b;

        /* renamed from: yg.i$a$a  reason: collision with other inner class name */
        public class C0325a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f17480a;

            public C0325a(d dVar) {
                this.f17480a = dVar;
            }

            public final void a(b<T> bVar, b0<T> b0Var) {
                a.this.f17478a.execute(new g(5, this, this.f17480a, b0Var));
            }

            public final void b(b<T> bVar, Throwable th) {
                a.this.f17478a.execute(new h(this, this.f17480a, th));
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f17478a = executor;
            this.f17479b = bVar;
        }

        public final boolean c() {
            return this.f17479b.c();
        }

        public final void cancel() {
            this.f17479b.cancel();
        }

        public final x d() {
            return this.f17479b.d();
        }

        public final void e(d<T> dVar) {
            this.f17479b.e(new C0325a(dVar));
        }

        public final b<T> clone() {
            return new a(this.f17478a, this.f17479b.clone());
        }
    }

    public i(Executor executor) {
        this.f17477a = executor;
    }

    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (g0.e(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d10 = g0.d(0, (ParameterizedType) type);
            if (!g0.h(annotationArr, e0.class)) {
                executor = this.f17477a;
            }
            return new g(d10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
