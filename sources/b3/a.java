package b3;

import android.os.Bundle;
import rb.b;
import sf.j;

public final class a implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3024a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f3025b = new Bundle();

    public a(int i8) {
        this.f3024a = i8;
    }

    public final Bundle a() {
        return this.f3025b;
    }

    public final int b() {
        return this.f3024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.a(a.class, obj.getClass())) {
            return false;
        }
        return this.f3024a == ((a) obj).f3024a;
    }

    public final int hashCode() {
        return 31 + this.f3024a;
    }

    public final String toString() {
        return b.a(new StringBuilder("ActionOnlyNavDirections(actionId="), this.f3024a, ')');
    }
}
