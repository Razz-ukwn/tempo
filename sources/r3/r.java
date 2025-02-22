package r3;

import android.view.View;
import d.a;
import java.util.ArrayList;
import java.util.HashMap;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f13859a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final View f13860b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<k> f13861c = new ArrayList<>();

    @Deprecated
    public r() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (r3.r) r3;
        r0 = r3.f13860b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof r3.r
            if (r0 == 0) goto L_0x0018
            r3.r r3 = (r3.r) r3
            android.view.View r0 = r3.f13860b
            android.view.View r1 = r2.f13860b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r0 = r2.f13859a
            java.util.HashMap r3 = r3.f13859a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0018
            r3 = 1
            return r3
        L_0x0018:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.r.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f13859a.hashCode() + (this.f13860b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder b10 = a.b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        b10.append(this.f13860b);
        b10.append("\n");
        String c3 = h4.a.c(b10.toString(), "    values:");
        HashMap hashMap = this.f13859a;
        for (String str : hashMap.keySet()) {
            c3 = c3 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return c3;
    }

    public r(View view) {
        this.f13860b = view;
    }
}
