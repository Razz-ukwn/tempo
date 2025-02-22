package y1;

import android.os.Bundle;
import android.os.IBinder;
import sf.j;

public final class b {
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        j.f(bundle, "bundle");
        j.f(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
