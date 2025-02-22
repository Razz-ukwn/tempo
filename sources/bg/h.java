package bg;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import cb.b;
import ff.h;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3653a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new f(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = b.u(th);
        }
        if (obj instanceof h.a) {
            obj = null;
        }
        g gVar = (g) obj;
    }

    public static final Handler a(Looper looper) {
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
