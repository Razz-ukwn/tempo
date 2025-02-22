package jc;

import android.app.Application;
import b1.b;
import ef.a;

public final class z implements a {
    public static Application a(fe.a aVar) {
        Application d10 = b.d(aVar.f8700a);
        if (d10 != null) {
            return d10;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
