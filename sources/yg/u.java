package yg;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import jg.d0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import yg.f;

@IgnoreJRERequirement
public final class u extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final u f17514a = new u();

    @IgnoreJRERequirement
    public static final class a<T> implements f<d0, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<d0, T> f17515a;

        public a(f<d0, T> fVar) {
            this.f17515a = fVar;
        }

        public final Object a(Object obj) {
            return Optional.ofNullable(this.f17515a.a((d0) obj));
        }
    }

    public final f<d0, ?> b(Type type, Annotation[] annotationArr, c0 c0Var) {
        if (g0.e(type) != Optional.class) {
            return null;
        }
        return new a(c0Var.e(g0.d(0, (ParameterizedType) type), annotationArr));
    }
}
