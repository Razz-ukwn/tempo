package wa;

import android.util.Log;
import h0.e;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class c0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f16565d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f16566a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16567b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16568c;

    public c0(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str}));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f16565d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f16566a = str3;
        this.f16567b = str;
        this.f16568c = e.b(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f16566a.equals(c0Var.f16566a) && this.f16567b.equals(c0Var.f16567b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16567b, this.f16566a});
    }
}
