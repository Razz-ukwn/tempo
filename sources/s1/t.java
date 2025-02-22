package s1;

import android.os.Bundle;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public s f14530a;

    public void a(Bundle bundle) {
        String c3 = c();
        if (c3 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c3);
        }
    }

    public abstract void b(u uVar);

    public abstract String c();
}
