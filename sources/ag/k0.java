package ag;

import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.scheduling.c;

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f428a;

    static {
        String str;
        n0 n0Var;
        int i8 = w.f10739a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (!(str != null ? Boolean.parseBoolean(str) : false)) {
            n0Var = j0.E;
        } else {
            c cVar = s0.f480a;
            x1 x1Var = m.f10728a;
            x1Var.J0();
            n0Var = !(x1Var instanceof n0) ? j0.E : (n0) x1Var;
        }
        f428a = n0Var;
    }
}
