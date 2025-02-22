package cb;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class n implements s<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Constructor f3919a;

    public n(Constructor constructor) {
        this.f3919a = constructor;
    }

    public final Object g() {
        Constructor constructor = this.f3919a;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e11.getTargetException());
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e12);
        }
    }
}
