package i0;

import androidx.databinding.a;
import h0.c;
import h0.e;

public final class s {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f9389d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f9390a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9391b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9392c;

    static {
        a.f(4278190080L);
        int i8 = c.f9071e;
    }

    public s(long j10, long j11, float f10) {
        this.f9390a = j10;
        this.f9391b = j11;
        this.f9392c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!i.b(this.f9390a, sVar.f9390a) || !c.a(this.f9391b, sVar.f9391b)) {
            return false;
        }
        return (this.f9392c > sVar.f9392c ? 1 : (this.f9392c == sVar.f9392c ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        int i8 = i.f9377f;
        int i10 = c.f9071e;
        return Float.hashCode(this.f9392c) + e.a(this.f9391b, Long.hashCode(this.f9390a) * 31, 31);
    }

    public final String toString() {
        return "Shadow(color=" + i.h(this.f9390a) + ", offset=" + c.d(this.f9391b) + ", blurRadius=" + this.f9392c + ')';
    }
}
