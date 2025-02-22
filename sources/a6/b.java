package a6;

import androidx.activity.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f117a;

    public b(String str) {
        if (str != null) {
            this.f117a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f117a.equals(((b) obj).f117a);
    }

    public final int hashCode() {
        return this.f117a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return g.a(new StringBuilder("Encoding{name=\""), this.f117a, "\"}");
    }
}
