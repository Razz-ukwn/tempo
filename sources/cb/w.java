package cb;

import androidx.fragment.app.z;
import java.lang.reflect.Method;

public final class w extends z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f3955b;

    public w(Method method) {
        this.f3955b = method;
    }

    public final <T> T m(Class<T> cls) {
        z.c(cls);
        return this.f3955b.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
