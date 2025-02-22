package k5;

import ag.b1;
import java.security.MessageDigest;
import p4.f;

public final class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f10294b;

    public b(Object obj) {
        b1.b(obj);
        this.f10294b = obj;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f10294b.toString().getBytes(f.f12458a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f10294b.equals(((b) obj).f10294b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10294b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f10294b + '}';
    }
}
