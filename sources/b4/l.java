package b4;

import q.g;
import sf.j;
import y3.k;

public final class l extends g {

    /* renamed from: a  reason: collision with root package name */
    public final k f3245a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3246b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3247c;

    public l(k kVar, String str, int i8) {
        this.f3245a = kVar;
        this.f3246b = str;
        this.f3247c = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return j.a(this.f3245a, lVar.f3245a) && j.a(this.f3246b, lVar.f3246b) && this.f3247c == lVar.f3247c;
        }
    }

    public final int hashCode() {
        int hashCode = this.f3245a.hashCode() * 31;
        String str = this.f3246b;
        return g.c(this.f3247c) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
