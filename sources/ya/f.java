package ya;

import android.content.Context;
import t9.b;
import t9.l;

public final class f {

    public interface a<T> {
        String c(Context context);
    }

    public static b<?> a(String str, String str2) {
        a aVar = new a(str, str2);
        b.a<d> a10 = b.a(d.class);
        a10.f15459e = 1;
        a10.f15460f = new t9.a(aVar);
        return a10.b();
    }

    public static b<?> b(String str, a<Context> aVar) {
        b.a<d> a10 = b.a(d.class);
        a10.f15459e = 1;
        a10.a(l.a(Context.class));
        a10.f15460f = new e(str, aVar);
        return a10.b();
    }
}
