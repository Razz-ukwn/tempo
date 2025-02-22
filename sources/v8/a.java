package v8;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f16247a;

    public a(float f10) {
        this.f16247a = f10;
    }

    public final float a(RectF rectF) {
        return this.f16247a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f16247a == ((a) obj).f16247a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f16247a)});
    }
}
