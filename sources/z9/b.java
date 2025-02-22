package z9;

import ba.b0;
import java.io.File;

public final class b extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f17794a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17795b;

    /* renamed from: c  reason: collision with root package name */
    public final File f17796c;

    public b(ba.b bVar, String str, File file) {
        this.f17794a = bVar;
        if (str != null) {
            this.f17795b = str;
            this.f17796c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final b0 a() {
        return this.f17794a;
    }

    public final File b() {
        return this.f17796c;
    }

    public final String c() {
        return this.f17795b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f17794a.equals(a0Var.a()) && this.f17795b.equals(a0Var.c()) && this.f17796c.equals(a0Var.b());
    }

    public final int hashCode() {
        return ((((this.f17794a.hashCode() ^ 1000003) * 1000003) ^ this.f17795b.hashCode()) * 1000003) ^ this.f17796c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f17794a + ", sessionId=" + this.f17795b + ", reportFile=" + this.f17796c + "}";
    }
}
