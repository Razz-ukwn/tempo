package dd;

import android.os.Bundle;
import s0.b0;
import sf.j;

public final class f implements b3.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f7516a;

    public f(String str) {
        this.f7516a = str;
    }

    public static final f fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(f.class.getClassLoader());
        if (bundle.containsKey("userId")) {
            String string = bundle.getString("userId");
            if (string != null) {
                return new f(string);
            }
            throw new IllegalArgumentException("Argument \"userId\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"userId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && j.a(this.f7516a, ((f) obj).f7516a);
    }

    public final int hashCode() {
        return this.f7516a.hashCode();
    }

    public final String toString() {
        return b0.a(new StringBuilder("ResetPasswordBottomSheetArgs(userId="), this.f7516a, ')');
    }
}
