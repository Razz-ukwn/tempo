package ba;

import androidx.activity.g;
import ba.b0;

public final class w extends b0.e.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f3591a;

    public w(String str) {
        this.f3591a = str;
    }

    public final String a() {
        return this.f3591a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.f) {
            return this.f3591a.equals(((b0.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3591a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return g.a(new StringBuilder("User{identifier="), this.f3591a, "}");
    }
}
