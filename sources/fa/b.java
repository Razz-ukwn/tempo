package fa;

import a6.h;
import com.google.android.gms.tasks.TaskCompletionSource;
import z9.a0;

public final /* synthetic */ class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f8647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8648b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f8649c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a0 f8650d;

    public /* synthetic */ b(c cVar, TaskCompletionSource taskCompletionSource, boolean z10, a0 a0Var) {
        this.f8647a = cVar;
        this.f8648b = taskCompletionSource;
        this.f8649c = z10;
        this.f8650d = a0Var;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.Exception r9) {
        /*
            r8 = this;
            fa.c r0 = r8.f8647a
            r0.getClass()
            com.google.android.gms.tasks.TaskCompletionSource r1 = r8.f8648b
            if (r9 == 0) goto L_0x000d
            r1.trySetException(r9)
            goto L_0x005f
        L_0x000d:
            boolean r9 = r8.f8649c
            if (r9 == 0) goto L_0x005a
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r9.<init>(r2)
            java.lang.Thread r3 = new java.lang.Thread
            u2.b r4 = new u2.b
            r5 = 5
            r4.<init>(r5, r0, r9)
            r3.<init>(r4)
            r3.start()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ExecutorService r3 = z9.j0.f17848a
            r3 = 2
            r5 = 0
            long r3 = r0.toNanos(r3)     // Catch:{ all -> 0x004e }
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004e }
            long r6 = r6 + r3
        L_0x0035:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0044 }
            r9.await(r3, r0)     // Catch:{ InterruptedException -> 0x0044 }
            if (r5 == 0) goto L_0x005a
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
            goto L_0x005a
        L_0x0044:
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004c }
            long r3 = r6 - r3
            r5 = r2
            goto L_0x0035
        L_0x004c:
            r9 = move-exception
            goto L_0x0050
        L_0x004e:
            r9 = move-exception
            r2 = r5
        L_0x0050:
            if (r2 == 0) goto L_0x0059
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0059:
            throw r9
        L_0x005a:
            z9.a0 r9 = r8.f8650d
            r1.trySetResult(r9)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.b.d(java.lang.Exception):void");
    }
}
