package t9;

import java.lang.annotation.Annotation;

public final class u<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? extends Annotation> f15495a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<T> f15496b;

    public @interface a {
    }

    public u(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f15495a = cls;
        this.f15496b = cls2;
    }

    public static <T> u<T> a(Class<T> cls) {
        return new u<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.f15496b.equals(uVar.f15496b)) {
            return false;
        }
        return this.f15495a.equals(uVar.f15495a);
    }

    public final int hashCode() {
        return this.f15495a.hashCode() + (this.f15496b.hashCode() * 31);
    }

    public final String toString() {
        Class<a> cls = a.class;
        Class<T> cls2 = this.f15496b;
        Class<? extends Annotation> cls3 = this.f15495a;
        if (cls3 == cls) {
            return cls2.getName();
        }
        return "@" + cls3.getName() + " " + cls2.getName();
    }
}
