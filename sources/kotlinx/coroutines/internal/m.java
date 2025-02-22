package kotlinx.coroutines.internal;

import ag.x1;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final x1 f10728a;

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.a();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005b */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = kotlinx.coroutines.internal.w.f10739a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 == 0) goto L_0x0010
            java.lang.Boolean.parseBoolean(r0)
        L_0x0010:
            java.util.Iterator r0 = androidx.activity.f.a()     // Catch:{ all -> 0x006b }
            yf.g r0 = yf.k.n0(r0)     // Catch:{ all -> 0x006b }
            java.util.List r0 = yf.o.r0(r0)     // Catch:{ all -> 0x006b }
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x006b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x006b }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006b }
            if (r3 != 0) goto L_0x002b
            r3 = r1
            goto L_0x0052
        L_0x002b:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006b }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x0036
            goto L_0x0052
        L_0x0036:
            r4 = r3
            kotlinx.coroutines.internal.l r4 = (kotlinx.coroutines.internal.l) r4     // Catch:{ all -> 0x006b }
            int r4 = r4.c()     // Catch:{ all -> 0x006b }
        L_0x003d:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x006b }
            r6 = r5
            kotlinx.coroutines.internal.l r6 = (kotlinx.coroutines.internal.l) r6     // Catch:{ all -> 0x006b }
            int r6 = r6.c()     // Catch:{ all -> 0x006b }
            if (r4 >= r6) goto L_0x004c
            r3 = r5
            r4 = r6
        L_0x004c:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x006b }
            if (r5 != 0) goto L_0x003d
        L_0x0052:
            kotlinx.coroutines.internal.l r3 = (kotlinx.coroutines.internal.l) r3     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x0063
            ag.x1 r1 = r3.b(r0)     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r3.a()     // Catch:{ all -> 0x006b }
        L_0x005e:
            if (r1 == 0) goto L_0x0063
            f10728a = r1
            return
        L_0x0063:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.m.<clinit>():void");
    }
}
