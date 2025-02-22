package gf;

import cb.d;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import rf.l;
import sf.j;
import sf.y;
import tf.a;
import tf.b;
import wf.e;
import wf.f;

public class o extends n {
    public static final void p0(Iterable iterable, Collection collection) {
        j.f(collection, "<this>");
        j.f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    public static final boolean q0(Iterable iterable, l lVar) {
        Iterator it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue()) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static final void r0(AbstractList abstractList, l lVar) {
        int H;
        j.f(abstractList, "<this>");
        j.f(lVar, "predicate");
        if (abstractList instanceof RandomAccess) {
            int i8 = 0;
            e d10 = new f(0, d.H(abstractList)).iterator();
            while (d10.f16719c) {
                int nextInt = d10.nextInt();
                Object obj = abstractList.get(nextInt);
                if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                    if (i8 != nextInt) {
                        abstractList.set(i8, obj);
                    }
                    i8++;
                }
            }
            if (i8 < abstractList.size() && i8 <= (H = d.H(abstractList))) {
                while (true) {
                    abstractList.remove(H);
                    if (H != i8) {
                        H--;
                    } else {
                        return;
                    }
                }
            }
        } else if (!(abstractList instanceof a) || (abstractList instanceof b)) {
            q0(abstractList, lVar);
        } else {
            y.d(abstractList, "kotlin.collections.MutableIterable");
            throw null;
        }
    }
}
