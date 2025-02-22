package u6;

import android.os.Looper;
import android.text.TextUtils;
import h7.i;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class q {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(i iVar) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != iVar.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = iVar.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name2 + " thread, but got " + name + ".");
        }
    }

    public static void e(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    @EnsuresNonNull({"#1"})
    public static void g(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    public static void i(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    @EnsuresNonNull({"#1"})
    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void k(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }
}
