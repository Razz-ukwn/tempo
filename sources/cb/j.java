package cb;

import ab.o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

public final class j implements s<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f3915a;

    public j(Type type) {
        this.f3915a = type;
    }

    public final Object g() {
        Type type = this.f3915a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new o("Invalid EnumSet type: " + type.toString());
        }
        throw new o("Invalid EnumSet type: " + type.toString());
    }
}
