package we;

import java.util.LinkedList;
import te.b;

public final class d implements b, a {

    /* renamed from: a  reason: collision with root package name */
    public LinkedList f16710a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f16711b;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r1.hasNext() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((te.b) r1.next()).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        e9.c.m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r2 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r2.size() != 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        throw bf.a.a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        throw new ue.a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            boolean r0 = r4.f16711b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r4)
            boolean r0 = r4.f16711b     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            return
        L_0x000c:
            r0 = 1
            r4.f16711b = r0     // Catch:{ all -> 0x0056 }
            java.util.LinkedList r1 = r4.f16710a     // Catch:{ all -> 0x0056 }
            r2 = 0
            r4.f16710a = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0055
        L_0x0018:
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r1.next()
            te.b r3 = (te.b) r3
            r3.a()     // Catch:{ all -> 0x002c }
            goto L_0x001c
        L_0x002c:
            r3 = move-exception
            e9.c.m(r3)
            if (r2 != 0) goto L_0x0037
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0037:
            r2.add(r3)
            goto L_0x001c
        L_0x003b:
            if (r2 == 0) goto L_0x0055
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004f
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = bf.a.a(r0)
            throw r0
        L_0x004f:
            ue.a r0 = new ue.a
            r0.<init>(r2)
            throw r0
        L_0x0055:
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: we.d.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0020, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(te.b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            if (r3 == 0) goto L_0x0024
            boolean r0 = r2.f16711b
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            monitor-enter(r2)
            boolean r0 = r2.f16711b     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return r1
        L_0x0011:
            java.util.LinkedList r0 = r2.f16710a     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0021 }
            if (r3 != 0) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            r3 = 1
            return r3
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return r1
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0024:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: we.d.b(te.b):boolean");
    }

    public final boolean c(b bVar) {
        if (!this.f16711b) {
            synchronized (this) {
                if (!this.f16711b) {
                    LinkedList linkedList = this.f16710a;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f16710a = linkedList;
                    }
                    linkedList.add(bVar);
                    return true;
                }
            }
        }
        bVar.a();
        return false;
    }
}
