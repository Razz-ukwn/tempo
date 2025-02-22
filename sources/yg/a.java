package yg;

import ah.w;
import ff.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import jg.b0;
import jg.d0;
import jg.e0;
import yg.f;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17403a = true;

    /* renamed from: yg.a$a  reason: collision with other inner class name */
    public static final class C0323a implements f<d0, d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0323a f17404a = new C0323a();

        public final Object a(Object obj) {
            d0 d0Var = (d0) obj;
            try {
                wg.e eVar = new wg.e();
                d0Var.e().r(eVar);
                return new e0(d0Var.d(), d0Var.c(), eVar);
            } finally {
                d0Var.close();
            }
        }
    }

    public static final class b implements f<b0, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17405a = new b();

        public final Object a(Object obj) {
            return (b0) obj;
        }
    }

    public static final class c implements f<d0, d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f17406a = new c();

        public final Object a(Object obj) {
            return (d0) obj;
        }
    }

    public static final class d implements f<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f17407a = new d();

        public final Object a(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements f<d0, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f17408a = new e();

        public final Object a(Object obj) {
            ((d0) obj).close();
            return m.f8717a;
        }
    }

    public static final class f implements f<d0, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f17409a = new f();

        public final Object a(Object obj) {
            ((d0) obj).close();
            return null;
        }
    }

    public final f a(Type type) {
        if (b0.class.isAssignableFrom(g0.e(type))) {
            return b.f17405a;
        }
        return null;
    }

    public final f<d0, ?> b(Type type, Annotation[] annotationArr, c0 c0Var) {
        if (type == d0.class) {
            return g0.h(annotationArr, w.class) ? c.f17406a : C0323a.f17404a;
        }
        if (type == Void.class) {
            return f.f17409a;
        }
        if (!this.f17403a || type != m.class) {
            return null;
        }
        try {
            return e.f17408a;
        } catch (NoClassDefFoundError unused) {
            this.f17403a = false;
            return null;
        }
    }
}
