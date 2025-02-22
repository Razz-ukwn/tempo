package u6;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

public final class u implements a.c {

    /* renamed from: b  reason: collision with root package name */
    public static final u f15865b = new u();

    /* renamed from: a  reason: collision with root package name */
    public final String f15866a = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return o.a(this.f15866a, ((u) obj).f15866a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15866a});
    }
}
