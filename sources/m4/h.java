package m4;

import androidx.fragment.app.z;
import i4.a;
import i4.e;

public final class h extends z {
    public final boolean e(e eVar) {
        a aVar = eVar.f9573a;
        int i8 = Integer.MAX_VALUE;
        if ((aVar instanceof a.C0176a ? ((a.C0176a) aVar).f9566a : Integer.MAX_VALUE) > 100) {
            a aVar2 = eVar.f9574b;
            if (aVar2 instanceof a.C0176a) {
                i8 = ((a.C0176a) aVar2).f9566a;
            }
            if (i8 > 100) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r11 = this;
            m4.e r0 = m4.e.f11195a
            monitor-enter(r0)
            int r1 = m4.e.f11197c     // Catch:{ all -> 0x0042 }
            int r2 = r1 + 1
            m4.e.f11197c = r2     // Catch:{ all -> 0x0042 }
            r2 = 1
            r3 = 30
            r4 = 0
            if (r1 >= r3) goto L_0x0020
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0042 }
            long r7 = m4.e.f11198d     // Catch:{ all -> 0x0042 }
            r1 = 30000(0x7530, float:4.2039E-41)
            long r9 = (long) r1     // Catch:{ all -> 0x0042 }
            long r7 = r7 + r9
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r1 = r4
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            if (r1 == 0) goto L_0x003e
            m4.e.f11197c = r4     // Catch:{ all -> 0x0042 }
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0042 }
            m4.e.f11198d = r5     // Catch:{ all -> 0x0042 }
            java.io.File r1 = m4.e.f11196b     // Catch:{ all -> 0x0042 }
            java.lang.String[] r1 = r1.list()     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0035
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x0042 }
        L_0x0035:
            int r1 = r1.length     // Catch:{ all -> 0x0042 }
            r3 = 800(0x320, float:1.121E-42)
            if (r1 >= r3) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r2 = r4
        L_0x003c:
            m4.e.f11199e = r2     // Catch:{ all -> 0x0042 }
        L_0x003e:
            boolean r1 = m4.e.f11199e     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)
            return r1
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.h.f():boolean");
    }
}
