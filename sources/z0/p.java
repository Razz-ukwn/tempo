package z0;

import androidx.fragment.app.q;
import cb.d;
import java.util.List;
import rb.b;
import sf.j;

public final class p implements Comparable<p> {

    /* renamed from: b  reason: collision with root package name */
    public static final p f17605b;

    /* renamed from: c  reason: collision with root package name */
    public static final p f17606c;

    /* renamed from: d  reason: collision with root package name */
    public static final List<p> f17607d;

    /* renamed from: a  reason: collision with root package name */
    public final int f17608a;

    static {
        p pVar = new p(100);
        p pVar2 = new p(200);
        p pVar3 = new p(300);
        p pVar4 = new p(400);
        p pVar5 = new p(500);
        p pVar6 = new p(600);
        f17605b = pVar6;
        p pVar7 = new p(700);
        p pVar8 = new p(800);
        p pVar9 = new p(900);
        f17606c = pVar4;
        f17607d = d.P(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9);
    }

    public p(int i8) {
        this.f17608a = i8;
        boolean z10 = false;
        if (1 <= i8 && i8 < 1001) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(q.a("Font weight can be in range [1, 1000]. Current value: ", i8).toString());
        }
    }

    /* renamed from: a */
    public final int compareTo(p pVar) {
        j.f(pVar, "other");
        return j.h(this.f17608a, pVar.f17608a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r4 = ((z0.p) r4).f17608a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof z0.p
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            z0.p r4 = (z0.p) r4
            int r4 = r4.f17608a
            int r1 = r3.f17608a
            if (r1 == r4) goto L_0x0013
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.p.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f17608a;
    }

    public final String toString() {
        return b.a(new StringBuilder("FontWeight(weight="), this.f17608a, ')');
    }
}
