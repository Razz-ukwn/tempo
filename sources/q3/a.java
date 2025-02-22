package q3;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f12836a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f12837b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        try {
            if (f12837b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        Class<Trace> cls = Trace.class;
        try {
            if (f12837b == null) {
                f12836a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f12837b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f12837b.invoke((Object) null, new Object[]{Long.valueOf(f12836a)})).booleanValue();
        } catch (Exception e10) {
            if (e10 instanceof InvocationTargetException) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
            return false;
        }
    }
}
