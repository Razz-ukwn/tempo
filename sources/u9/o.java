package u9;

import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import u6.q;

public final class o implements Executor {
    public static final Logger B = Logger.getLogger(o.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final Executor f15931a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f15932b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public int f15933c = 1;

    /* renamed from: d  reason: collision with root package name */
    public long f15934d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final b f15935e = new b();

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f15936a;

        public a(Runnable runnable) {
            this.f15936a = runnable;
        }

        public final void run() {
            this.f15936a.run();
        }

        public final String toString() {
            return this.f15936a.toString();
        }
    }

    public final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public Runnable f15937a;

        public b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r10.f15937a.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            u9.o.B.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.f15937a, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r10 = this;
                r0 = 0
                r1 = r0
            L_0x0002:
                u9.o r2 = u9.o.this     // Catch:{ all -> 0x0076 }
                java.util.ArrayDeque r2 = r2.f15932b     // Catch:{ all -> 0x0076 }
                monitor-enter(r2)     // Catch:{ all -> 0x0076 }
                r3 = 1
                if (r0 != 0) goto L_0x0026
                u9.o r0 = u9.o.this     // Catch:{ all -> 0x0073 }
                int r4 = r0.f15933c     // Catch:{ all -> 0x0073 }
                r5 = 4
                if (r4 != r5) goto L_0x001c
                monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                if (r1 == 0) goto L_0x001b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001b:
                return
            L_0x001c:
                long r6 = r0.f15934d     // Catch:{ all -> 0x0073 }
                r8 = 1
                long r6 = r6 + r8
                r0.f15934d = r6     // Catch:{ all -> 0x0073 }
                r0.f15933c = r5     // Catch:{ all -> 0x0073 }
                r0 = r3
            L_0x0026:
                u9.o r4 = u9.o.this     // Catch:{ all -> 0x0073 }
                java.util.ArrayDeque r4 = r4.f15932b     // Catch:{ all -> 0x0073 }
                java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0073 }
                java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ all -> 0x0073 }
                r10.f15937a = r4     // Catch:{ all -> 0x0073 }
                if (r4 != 0) goto L_0x0043
                u9.o r0 = u9.o.this     // Catch:{ all -> 0x0073 }
                r0.f15933c = r3     // Catch:{ all -> 0x0073 }
                monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                if (r1 == 0) goto L_0x0042
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x0042:
                return
            L_0x0043:
                monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0076 }
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r10.f15937a     // Catch:{ RuntimeException -> 0x0052 }
                r3.run()     // Catch:{ RuntimeException -> 0x0052 }
                goto L_0x006d
            L_0x0050:
                r0 = move-exception
                goto L_0x0070
            L_0x0052:
                r3 = move-exception
                java.util.logging.Logger r4 = u9.o.B     // Catch:{ all -> 0x0050 }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0050 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
                r6.<init>()     // Catch:{ all -> 0x0050 }
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch:{ all -> 0x0050 }
                java.lang.Runnable r7 = r10.f15937a     // Catch:{ all -> 0x0050 }
                r6.append(r7)     // Catch:{ all -> 0x0050 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0050 }
                r4.log(r5, r6, r3)     // Catch:{ all -> 0x0050 }
            L_0x006d:
                r10.f15937a = r2     // Catch:{ all -> 0x0076 }
                goto L_0x0002
            L_0x0070:
                r10.f15937a = r2     // Catch:{ all -> 0x0076 }
                throw r0     // Catch:{ all -> 0x0076 }
            L_0x0073:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0073 }
                throw r0     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r0 = move-exception
                if (r1 == 0) goto L_0x0080
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0080:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: u9.o.b.a():void");
        }

        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (o.this.f15932b) {
                    o.this.f15933c = 1;
                    throw e10;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f15937a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + j1.b(o.this.f15933c) + "}";
        }
    }

    public o(Executor executor) {
        q.i(executor);
        this.f15931a = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r8.f15931a.execute(r8.f15935e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r8.f15933c == 2) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r0 == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        r6 = r8.f15932b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r8.f15934d != r3) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r8.f15933c != 2) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r8.f15933c = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
        monitor-enter(r8.f15932b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4 = r8.f15933c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004d, code lost:
        if (r4 == 1) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005d, code lost:
        if ((r2 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0063, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r9) {
        /*
            r8 = this;
            u6.q.i(r9)
            java.util.ArrayDeque r0 = r8.f15932b
            monitor-enter(r0)
            int r1 = r8.f15933c     // Catch:{ all -> 0x006e }
            r2 = 4
            if (r1 == r2) goto L_0x0067
            r2 = 3
            if (r1 != r2) goto L_0x000f
            goto L_0x0067
        L_0x000f:
            long r3 = r8.f15934d     // Catch:{ all -> 0x006e }
            u9.o$a r1 = new u9.o$a     // Catch:{ all -> 0x006e }
            r1.<init>(r9)     // Catch:{ all -> 0x006e }
            java.util.ArrayDeque r9 = r8.f15932b     // Catch:{ all -> 0x006e }
            r9.add(r1)     // Catch:{ all -> 0x006e }
            r9 = 2
            r8.f15933c = r9     // Catch:{ all -> 0x006e }
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            r0 = 1
            r5 = 0
            java.util.concurrent.Executor r6 = r8.f15931a     // Catch:{ RuntimeException -> 0x0047, Error -> 0x0045 }
            u9.o$b r7 = r8.f15935e     // Catch:{ RuntimeException -> 0x0047, Error -> 0x0045 }
            r6.execute(r7)     // Catch:{ RuntimeException -> 0x0047, Error -> 0x0045 }
            int r1 = r8.f15933c
            if (r1 == r9) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = r5
        L_0x002e:
            if (r0 == 0) goto L_0x0031
            return
        L_0x0031:
            java.util.ArrayDeque r6 = r8.f15932b
            monitor-enter(r6)
            long r0 = r8.f15934d     // Catch:{ all -> 0x0042 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            int r0 = r8.f15933c     // Catch:{ all -> 0x0042 }
            if (r0 != r9) goto L_0x0040
            r8.f15933c = r2     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r6)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r9 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0042 }
            throw r9
        L_0x0045:
            r2 = move-exception
            goto L_0x0048
        L_0x0047:
            r2 = move-exception
        L_0x0048:
            java.util.ArrayDeque r3 = r8.f15932b
            monitor-enter(r3)
            int r4 = r8.f15933c     // Catch:{ all -> 0x0064 }
            if (r4 == r0) goto L_0x0051
            if (r4 != r9) goto L_0x005a
        L_0x0051:
            java.util.ArrayDeque r9 = r8.f15932b     // Catch:{ all -> 0x0064 }
            boolean r9 = r9.removeLastOccurrence(r1)     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r0 = r5
        L_0x005b:
            boolean r9 = r2 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0063
            if (r0 != 0) goto L_0x0063
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            return
        L_0x0063:
            throw r2     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            throw r9
        L_0x0067:
            java.util.ArrayDeque r1 = r8.f15932b     // Catch:{ all -> 0x006e }
            r1.add(r9)     // Catch:{ all -> 0x006e }
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            return
        L_0x006e:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.o.execute(java.lang.Runnable):void");
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f15931a + "}";
    }
}
