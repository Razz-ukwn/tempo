package we;

import java.util.concurrent.atomic.AtomicReference;

public enum b implements te.b {
    ;

    /* access modifiers changed from: public */
    b() {
    }

    public static void b(AtomicReference atomicReference) {
        te.b bVar;
        te.b bVar2 = (te.b) atomicReference.get();
        b bVar3 = f16706a;
        if (bVar2 != bVar3 && (bVar = (te.b) atomicReference.getAndSet(bVar3)) != bVar3 && bVar != null) {
            bVar.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.util.concurrent.atomic.AtomicReference r1, te.b r2) {
        /*
        L_0x0000:
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L_0x0009
            r0 = 1
            goto L_0x0010
        L_0x0009:
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0000
            r0 = 0
        L_0x0010:
            if (r0 != 0) goto L_0x0025
            r2.a()
            java.lang.Object r1 = r1.get()
            we.b r2 = f16706a
            if (r1 == r2) goto L_0x0025
            ue.c r1 = new ue.c
            r1.<init>()
            cf.a.b(r1)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we.b.c(java.util.concurrent.atomic.AtomicReference, te.b):void");
    }

    public final void a() {
    }
}
