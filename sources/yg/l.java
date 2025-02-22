package yg;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Method f17489a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f17490b;

    public l(Method method, ArrayList arrayList) {
        this.f17489a = method;
        this.f17490b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f17489a;
        return String.format("%s.%s() %s", new Object[]{method.getDeclaringClass().getName(), method.getName(), this.f17490b});
    }
}
