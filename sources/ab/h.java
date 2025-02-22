package ab;

import hb.a;
import hb.b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

public final class h extends a0<AtomicLongArray> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f245a;

    public h(a0 a0Var) {
        this.f245a = a0Var;
    }

    public final Object a(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.F()) {
            arrayList.add(Long.valueOf(((Number) this.f245a.a(aVar)).longValue()));
        }
        aVar.p();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            atomicLongArray.set(i8, ((Long) arrayList.get(i8)).longValue());
        }
        return atomicLongArray;
    }

    public final void b(b bVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        bVar.d();
        int length = atomicLongArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            this.f245a.b(bVar, Long.valueOf(atomicLongArray.get(i8)));
        }
        bVar.p();
    }
}
