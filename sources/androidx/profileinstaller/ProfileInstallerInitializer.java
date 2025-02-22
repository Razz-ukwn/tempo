package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import g3.e;
import java.util.Collections;
import java.util.List;

public class ProfileInstallerInitializer implements p3.b<c> {

    public static class a {
        public static void a(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new e(runnable));
        }
    }

    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    public final List<Class<? extends p3.b<?>>> a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        a.a(new a2.a(2, this, context.getApplicationContext()));
        return new c();
    }
}
