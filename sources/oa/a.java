package oa;

import java.util.ArrayList;
import java.util.List;

public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final String f12249a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f12250b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f12249a = str;
            this.f12250b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final List<String> a() {
        return this.f12250b;
    }

    public final String b() {
        return this.f12249a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12249a.equals(jVar.b()) && this.f12250b.equals(jVar.a());
    }

    public final int hashCode() {
        return ((this.f12249a.hashCode() ^ 1000003) * 1000003) ^ this.f12250b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f12249a + ", usedDates=" + this.f12250b + "}";
    }
}
