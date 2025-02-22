package androidx.emoji2.text;

import android.annotation.SuppressLint;
import java.util.Collections;
import java.util.Set;

public final class j {
    @SuppressLint({"BanUncheckedReflection"})
    public static Set<int[]> a() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke((Object) null, new Object[0]);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<int[]> set = (Set) invoke;
            for (int[] iArr : set) {
                if (!(iArr instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }
}
