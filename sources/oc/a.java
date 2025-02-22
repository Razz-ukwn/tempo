package oc;

import jg.c0;
import jg.s;
import jg.x;
import og.f;
import zd.c;
import zd.h;

public final class a implements s {
    public a(c cVar) {
    }

    public final c0 a(f fVar) {
        boolean z10 = h.a("ACCESS_TOKEN").length() > 0;
        x xVar = fVar.f12369e;
        if (z10) {
            xVar.getClass();
            x.a aVar = new x.a(xVar);
            aVar.c("x-auth", h.a("ACCESS_TOKEN"));
            aVar.c("Accept", "application/json");
            aVar.c("Content-Type", "application/json");
            return fVar.c(aVar.a());
        }
        xVar.getClass();
        x.a aVar2 = new x.a(xVar);
        aVar2.c("Accept", "application/json");
        aVar2.c("Content-Type", "application/json");
        return fVar.c(aVar2.a());
    }
}
