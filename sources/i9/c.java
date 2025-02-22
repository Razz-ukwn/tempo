package i9;

import android.app.PendingIntent;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f9618a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9619b;

    public c(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent != null) {
            this.f9618a = pendingIntent;
            this.f9619b = z10;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final PendingIntent a() {
        return this.f9618a;
    }

    public final boolean c() {
        return this.f9619b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f9618a.equals(bVar.a()) && this.f9619b == bVar.c();
        }
    }

    public final int hashCode() {
        return ((this.f9618a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f9619b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f9618a.toString();
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + this.f9619b + "}";
    }
}
