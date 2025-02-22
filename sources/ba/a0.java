package ba;

import ba.d0;

public final class a0 extends d0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f3419a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3420b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3421c;

    public a0(String str, String str2, boolean z10) {
        if (str != null) {
            this.f3419a = str;
            if (str2 != null) {
                this.f3420b = str2;
                this.f3421c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean a() {
        return this.f3421c;
    }

    public final String b() {
        return this.f3420b;
    }

    public final String c() {
        return this.f3419a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.c)) {
            return false;
        }
        d0.c cVar = (d0.c) obj;
        return this.f3419a.equals(cVar.c()) && this.f3420b.equals(cVar.b()) && this.f3421c == cVar.a();
    }

    public final int hashCode() {
        return ((((this.f3419a.hashCode() ^ 1000003) * 1000003) ^ this.f3420b.hashCode()) * 1000003) ^ (this.f3421c ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f3419a + ", osCodeName=" + this.f3420b + ", isRooted=" + this.f3421c + "}";
    }
}
