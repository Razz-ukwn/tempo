package e1;

import f1.k;
import f1.l;

public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7772c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f7773a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7774b;

    static {
        float f10 = (float) 0;
        Float.floatToIntBits(f10);
        l[] lVarArr = k.f8042b;
        Float.floatToIntBits(f10);
    }

    public h(long j10, long j11) {
        this.f7773a = j10;
        this.f7774b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.a(this.f7773a, hVar.f7773a) && k.a(this.f7774b, hVar.f7774b);
    }

    public final int hashCode() {
        l[] lVarArr = k.f8042b;
        return Long.hashCode(this.f7774b) + (Long.hashCode(this.f7773a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + k.d(this.f7773a) + ", restLine=" + k.d(this.f7774b) + ')';
    }
}
