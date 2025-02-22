package dg;

import cg.e;
import jf.g;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.scheduling.b;

public interface o<T> extends f<T> {

    public static final class a {
        public static /* synthetic */ f a(o oVar, b bVar, int i8, e eVar, int i10) {
            jf.f fVar = bVar;
            if ((i10 & 1) != 0) {
                fVar = g.f10014a;
            }
            if ((i10 & 2) != 0) {
                i8 = -3;
            }
            if ((i10 & 4) != 0) {
                eVar = e.f4020a;
            }
            return oVar.b(fVar, i8, eVar);
        }
    }

    f<T> b(jf.f fVar, int i8, e eVar);
}
