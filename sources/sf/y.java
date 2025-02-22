package sf;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import rf.d;
import rf.e;
import rf.f;
import rf.g;
import rf.h;
import rf.i;
import rf.j;
import rf.k;
import rf.l;
import rf.m;
import rf.n;
import rf.o;
import rf.p;
import rf.q;
import rf.r;
import rf.s;
import rf.t;
import rf.u;
import rf.v;
import rf.w;
import tf.a;
import tf.b;
import tf.c;

public final class y {
    public static Collection a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof a) || (abstractCollection instanceof b)) {
            return abstractCollection;
        }
        d(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Map b(AbstractMap abstractMap) {
        if (!(abstractMap instanceof a) || (abstractMap instanceof c)) {
            return abstractMap;
        }
        d(abstractMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void c(int i8, Object obj) {
        if (obj != null) {
            boolean z10 = false;
            if (obj instanceof ff.a) {
                if ((obj instanceof g ? ((g) obj).getArity() : obj instanceof rf.a ? 0 : obj instanceof l ? 1 : obj instanceof p ? 2 : obj instanceof q ? 3 : obj instanceof r ? 4 : obj instanceof s ? 5 : obj instanceof t ? 6 : obj instanceof u ? 7 : obj instanceof v ? 8 : obj instanceof w ? 9 : obj instanceof rf.b ? 10 : obj instanceof rf.c ? 11 : obj instanceof d ? 12 : obj instanceof e ? 13 : obj instanceof f ? 14 : obj instanceof g ? 15 : obj instanceof h ? 16 : obj instanceof i ? 17 : obj instanceof j ? 18 : obj instanceof k ? 19 : obj instanceof m ? 20 : obj instanceof n ? 21 : obj instanceof o ? 22 : -1) == i8) {
                    z10 = true;
                }
            }
            if (!z10) {
                d(obj, "kotlin.jvm.functions.Function" + i8);
                throw null;
            }
        }
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(h0.e.b(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        j.j(y.class.getName(), classCastException);
        throw classCastException;
    }
}
