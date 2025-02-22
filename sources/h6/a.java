package h6;

import android.util.Log;

public final class a {
    public static void a(Object obj, String str, String str2) {
        String c3 = c(str);
        if (Log.isLoggable(c3, 3)) {
            Log.d(c3, String.format(str2, new Object[]{obj}));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String c3 = c(str);
        if (Log.isLoggable(c3, 6)) {
            Log.e(c3, str2, exc);
        }
    }

    public static String c(String str) {
        return "TRuntime.".concat(str);
    }
}
