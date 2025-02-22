package pg;

import jg.q;
import sf.j;
import wg.h;
import zf.n;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final h f12610a;

    /* renamed from: b  reason: collision with root package name */
    public long f12611b = 262144;

    public a(h hVar) {
        this.f12610a = hVar;
    }

    public final q a() {
        q.a aVar = new q.a();
        while (true) {
            String G = this.f12610a.G(this.f12611b);
            this.f12611b -= (long) G.length();
            if (G.length() == 0) {
                return aVar.c();
            }
            int F0 = n.F0(G, ':', 1, false, 4);
            if (F0 != -1) {
                String substring = G.substring(0, F0);
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = G.substring(F0 + 1);
                j.e(substring2, "this as java.lang.String).substring(startIndex)");
                aVar.b(substring, substring2);
            } else if (G.charAt(0) == ':') {
                String substring3 = G.substring(1);
                j.e(substring3, "this as java.lang.String).substring(startIndex)");
                aVar.b("", substring3);
            } else {
                aVar.b("", G);
            }
        }
    }
}
