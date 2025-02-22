package sf;

import xf.b;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final x f14958a;

    /* renamed from: b  reason: collision with root package name */
    public static final b[] f14959b = new b[0];

    static {
        x xVar = null;
        try {
            xVar = (x) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (xVar == null) {
            xVar = new x();
        }
        f14958a = xVar;
    }

    public static d a(Class cls) {
        f14958a.getClass();
        return new d(cls);
    }
}
