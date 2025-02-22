package z1;

import c2.a;
import z1.j;

public final class i implements a<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17643a;

    public i(String str) {
        this.f17643a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 >= r2.size()) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        ((c2.a) r2.get(r0)).accept(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r5) {
        /*
            r4 = this;
            z1.j$a r5 = (z1.j.a) r5
            java.lang.Object r0 = z1.j.f17646c
            monitor-enter(r0)
            o.f<java.lang.String, java.util.ArrayList<c2.a<z1.j$a>>> r1 = z1.j.f17647d     // Catch:{ all -> 0x002e }
            java.lang.String r2 = r4.f17643a     // Catch:{ all -> 0x002e }
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch:{ all -> 0x002e }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            goto L_0x002d
        L_0x0014:
            java.lang.String r3 = r4.f17643a     // Catch:{ all -> 0x002e }
            r1.remove(r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            r0 = 0
        L_0x001b:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002d
            java.lang.Object r1 = r2.get(r0)
            c2.a r1 = (c2.a) r1
            r1.accept(r5)
            int r0 = r0 + 1
            goto L_0x001b
        L_0x002d:
            return
        L_0x002e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.i.accept(java.lang.Object):void");
    }
}
