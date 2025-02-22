package androidx.compose.ui.platform;

import ff.m;
import rf.p;
import sf.k;
import t.e0;
import t.h;
import z.b;

public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final z.a f1289a = b.c(-1759434350, a.f1290a, false);

    public static final class a extends k implements p<h, Integer, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1290a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            h hVar = (h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.h()) {
                e0.b bVar = e0.f15020a;
            } else {
                hVar.j();
            }
            return m.f8717a;
        }
    }
}
