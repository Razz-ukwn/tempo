package androidx.activity;

import androidx.lifecycle.v;
import bg.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.internal.l;
import sf.j;
import t.c;
import t.i2;
import t.p2;
import zd.g;

public final /* synthetic */ class f {
    public static /* synthetic */ Iterator a() {
        try {
            return Arrays.asList(new l[]{new a()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* bridge */ /* synthetic */ void b(int i8, int i10, Class cls) {
        throw null;
    }

    public static void c(v vVar) {
        vVar.k(new g.c());
    }

    public static /* synthetic */ void d(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void e(c cVar, String str, p2 p2Var, String str2, i2 i2Var, String str3) {
        j.f(cVar, str);
        j.f(p2Var, str2);
        j.f(i2Var, str3);
    }

    public static /* synthetic */ String f(int i8) {
        return i8 == 1 ? "FROM_NUMBER_WITH_PLUS_SIGN" : i8 == 2 ? "FROM_NUMBER_WITH_IDD" : i8 == 3 ? "FROM_NUMBER_WITHOUT_PLUS_SIGN" : i8 == 4 ? "FROM_DEFAULT_COUNTRY" : i8 == 5 ? "UNSPECIFIED" : "null";
    }
}
