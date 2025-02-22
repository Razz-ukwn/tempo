package z6;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public final class f {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
