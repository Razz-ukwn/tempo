package y;

import rb.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f17103a;

    public a() {
        this(0);
    }

    public a(int i8) {
        this.f17103a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f17103a == ((a) obj).f17103a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17103a);
    }

    public final String toString() {
        return b.a(new StringBuilder("DeltaCounter(count="), this.f17103a, ')');
    }
}
