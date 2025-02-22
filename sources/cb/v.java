package cb;

import androidx.fragment.app.z;
import java.lang.reflect.Method;

public final class v extends z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f3953b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3954c;

    public v(int i8, Method method) {
        this.f3953b = method;
        this.f3954c = i8;
    }

    public final <T> T m(Class<T> cls) {
        z.c(cls);
        return this.f3953b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f3954c)});
    }
}
