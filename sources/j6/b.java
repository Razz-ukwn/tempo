package j6;

import a6.d;
import j6.e;
import java.util.Map;
import m6.a;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final a f9798a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<d, e.a> f9799b;

    public b(a aVar, Map<d, e.a> map) {
        if (aVar != null) {
            this.f9798a = aVar;
            if (map != null) {
                this.f9799b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final a a() {
        return this.f9798a;
    }

    public final Map<d, e.a> c() {
        return this.f9799b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9798a.equals(eVar.a()) && this.f9799b.equals(eVar.c());
    }

    public final int hashCode() {
        return ((this.f9798a.hashCode() ^ 1000003) * 1000003) ^ this.f9799b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f9798a + ", values=" + this.f9799b + "}";
    }
}
