package v0;

import androidx.compose.ui.platform.v1;
import java.util.concurrent.atomic.AtomicInteger;
import sf.j;

public final class m extends v1 implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicInteger f16065c = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final j f16066b;

    public m() {
        throw null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(androidx.compose.ui.platform.AndroidComposeView.l r3) {
        /*
            r2 = this;
            androidx.compose.ui.platform.t1$a r0 = androidx.compose.ui.platform.t1.f1463a
            java.lang.String r1 = "properties"
            sf.j.f(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            sf.j.f(r0, r1)
            r2.<init>(r0)
            v0.j r0 = new v0.j
            r0.<init>()
            r1 = 0
            r0.f16062b = r1
            r0.f16063c = r1
            r3.invoke(r0)
            r2.f16066b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.m.<init>(androidx.compose.ui.platform.AndroidComposeView$l):void");
    }

    public final j c() {
        return this.f16066b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return j.a(this.f16066b, ((m) obj).f16066b);
    }

    public final int hashCode() {
        return this.f16066b.hashCode();
    }
}
