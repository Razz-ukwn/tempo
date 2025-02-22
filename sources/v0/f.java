package v0;

import sf.j;
import wf.a;
import wf.b;

public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final f f16038d = new f(new a());

    /* renamed from: a  reason: collision with root package name */
    public final float f16039a;

    /* renamed from: b  reason: collision with root package name */
    public final b<Float> f16040b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16041c;

    public f() {
        throw null;
    }

    public f(a aVar) {
        this.f16039a = 0.0f;
        this.f16040b = aVar;
        this.f16041c = 0;
        if (!(!Float.isNaN(0.0f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return ((this.f16039a > fVar.f16039a ? 1 : (this.f16039a == fVar.f16039a ? 0 : -1)) == 0) && j.a(this.f16040b, fVar.f16040b) && this.f16041c == fVar.f16041c;
    }

    public final int hashCode() {
        return ((this.f16040b.hashCode() + (Float.hashCode(this.f16039a) * 31)) * 31) + this.f16041c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f16039a);
        sb2.append(", range=");
        sb2.append(this.f16040b);
        sb2.append(", steps=");
        return rb.b.a(sb2, this.f16041c, ')');
    }
}
