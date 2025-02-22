package c7;

import android.os.IBinder;
import c7.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import u6.q;

public final class b<T> extends a.C0059a {

    /* renamed from: b  reason: collision with root package name */
    public final Object f3842b;

    public b(Object obj) {
        this.f3842b = obj;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T P(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f3842b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i8 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i8++;
                field = field2;
            }
        }
        if (i8 == 1) {
            q.i(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(androidx.fragment.app.q.a("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
    }
}
