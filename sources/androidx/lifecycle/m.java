package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.a0;
import java.util.concurrent.atomic.AtomicBoolean;
import sf.j;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f2293a = new AtomicBoolean(false);

    public static final class a extends f {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            j.f(activity, "activity");
            int i8 = a0.f2238b;
            a0.b.b(activity);
        }
    }
}
