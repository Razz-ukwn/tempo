package v8;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f16248a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16249b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f16248a;
            f10 += ((b) cVar).f16249b;
        }
        this.f16248a = cVar;
        this.f16249b = f10;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f16248a.a(rectF) + this.f16249b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16248a.equals(bVar.f16248a) && this.f16249b == bVar.f16249b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16248a, Float.valueOf(this.f16249b)});
    }
}
