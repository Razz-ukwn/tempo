package qg;

import sf.j;
import wg.i;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final i f13617d = i.a.b(":");

    /* renamed from: e  reason: collision with root package name */
    public static final i f13618e = i.a.b(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final i f13619f = i.a.b(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final i f13620g = i.a.b(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final i f13621h = i.a.b(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final i f13622i = i.a.b(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final i f13623a;

    /* renamed from: b  reason: collision with root package name */
    public final i f13624b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13625c;

    static {
        i iVar = i.f16760d;
    }

    public c(i iVar, i iVar2) {
        j.f(iVar, "name");
        j.f(iVar2, "value");
        this.f13623a = iVar;
        this.f13624b = iVar2;
        this.f13625c = iVar2.d() + iVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.a(this.f13623a, cVar.f13623a) && j.a(this.f13624b, cVar.f13624b);
    }

    public final int hashCode() {
        return this.f13624b.hashCode() + (this.f13623a.hashCode() * 31);
    }

    public final String toString() {
        return this.f13623a.q() + ": " + this.f13624b.q();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(i.a.b(str), i.a.b(str2));
        j.f(str, "name");
        j.f(str2, "value");
        i iVar = i.f16760d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(i iVar, String str) {
        this(iVar, i.a.b(str));
        j.f(iVar, "name");
        j.f(str, "value");
        i iVar2 = i.f16760d;
    }
}
