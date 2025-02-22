package cb;

import androidx.fragment.app.z;
import java.lang.reflect.Method;

public final class u extends z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f3951b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3952c;

    public u(Method method, Object obj) {
        this.f3951b = method;
        this.f3952c = obj;
    }

    public final <T> T m(Class<T> cls) {
        z.c(cls);
        return this.f3951b.invoke(this.f3952c, new Object[]{cls});
    }
}
