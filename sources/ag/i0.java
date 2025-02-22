package ag;

import cb.b;
import e5.h;
import e5.i;
import jf.d;
import kotlinx.coroutines.internal.f;
import s5.g;
import v5.c;
import w5.e;

public final class i0 implements h {
    public static float c(e eVar, c cVar) {
        float yChartMax = cVar.getYChartMax();
        float yChartMin = cVar.getYChartMin();
        g lineData = cVar.getLineData();
        if (eVar.g() > 0.0f && eVar.p() < 0.0f) {
            return 0.0f;
        }
        if (lineData.f14721a > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.f14722b < 0.0f) {
            yChartMin = 0.0f;
        }
        return eVar.p() >= 0.0f ? yChartMin : yChartMax;
    }

    public static final String d(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String e(d dVar) {
        String str;
        if (dVar instanceof f) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + d(dVar);
        } catch (Throwable th) {
            str = b.u(th);
        }
        Throwable a10 = ff.h.a(str);
        String str2 = str;
        if (a10 != null) {
            str2 = dVar.getClass().getName() + '@' + d(dVar);
        }
        return (String) str2;
    }

    public final void a(i iVar) {
        iVar.a();
    }

    public final void b(i iVar) {
    }
}
