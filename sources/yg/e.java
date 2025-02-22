package yg;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import yg.c;

@IgnoreJRERequirement
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f17458a = new e();

    @IgnoreJRERequirement
    public static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f17459a;

        @IgnoreJRERequirement
        /* renamed from: yg.e$a$a  reason: collision with other inner class name */
        public class C0324a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<R> f17460a;

            public C0324a(b bVar) {
                this.f17460a = bVar;
            }

            public final void a(b<R> bVar, b0<R> b0Var) {
                boolean a10 = b0Var.a();
                CompletableFuture<R> completableFuture = this.f17460a;
                if (a10) {
                    completableFuture.complete(b0Var.f17446b);
                } else {
                    completableFuture.completeExceptionally(new j(b0Var));
                }
            }

            public final void b(b<R> bVar, Throwable th) {
                this.f17460a.completeExceptionally(th);
            }
        }

        public a(Type type) {
            this.f17459a = type;
        }

        public final Object a(t tVar) {
            b bVar = new b(tVar);
            tVar.e(new C0324a(bVar));
            return bVar;
        }

        public final Type b() {
            return this.f17459a;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f17461a;

        public b(t tVar) {
            this.f17461a = tVar;
        }

        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f17461a.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements c<R, CompletableFuture<b0<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f17462a;

        @IgnoreJRERequirement
        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<b0<R>> f17463a;

            public a(b bVar) {
                this.f17463a = bVar;
            }

            public final void a(b<R> bVar, b0<R> b0Var) {
                this.f17463a.complete(b0Var);
            }

            public final void b(b<R> bVar, Throwable th) {
                this.f17463a.completeExceptionally(th);
            }
        }

        public c(Type type) {
            this.f17462a = type;
        }

        public final Object a(t tVar) {
            b bVar = new b(tVar);
            tVar.e(new a(bVar));
            return bVar;
        }

        public final Type b() {
            return this.f17462a;
        }
    }

    public final c a(Type type, Annotation[] annotationArr) {
        if (g0.e(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d10 = g0.d(0, (ParameterizedType) type);
            if (g0.e(d10) != b0.class) {
                return new a(d10);
            }
            if (d10 instanceof ParameterizedType) {
                return new c(g0.d(0, (ParameterizedType) d10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
