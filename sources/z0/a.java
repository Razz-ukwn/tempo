package z0;

import rb.b;

public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public final int f17591a;

    public a(int i8) {
        this.f17591a = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f17591a == ((a) obj).f17591a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17591a);
    }

    public final String toString() {
        return b.a(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f17591a, ')');
    }
}
