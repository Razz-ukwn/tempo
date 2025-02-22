package i1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a<V> implements Future {
    public static final C0169a B;
    public static final Object C = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f9396d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f9397e;

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f9398a;

    /* renamed from: b  reason: collision with root package name */
    public volatile d f9399b;

    /* renamed from: c  reason: collision with root package name */
    public volatile h f9400c;

    /* renamed from: i1.a$a  reason: collision with other inner class name */
    public static abstract class C0169a {
        public abstract boolean a(a aVar, d dVar);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f9401c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f9402d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f9403a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f9404b;

        static {
            if (a.f9396d) {
                f9402d = null;
                f9401c = null;
                return;
            }
            f9402d = new b((Throwable) null, false);
            f9401c = new b((Throwable) null, true);
        }

        public b(Throwable th, boolean z10) {
            this.f9403a = z10;
            this.f9404b = th;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f9405a;

        /* renamed from: i1.a$c$a  reason: collision with other inner class name */
        public class C0170a extends Throwable {
            public C0170a() {
                super("Failure occurred while trying to finish a future.");
            }

            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0170a());
        }

        public c(Throwable th) {
            boolean z10 = a.f9396d;
            th.getClass();
            this.f9405a = th;
        }
    }

    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final d f9406d = new d();

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f9407a = null;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f9408b = null;

        /* renamed from: c  reason: collision with root package name */
        public d f9409c;
    }

    public static final class e extends C0169a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f9410a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f9411b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f9412c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f9413d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f9414e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f9410a = atomicReferenceFieldUpdater;
            this.f9411b = atomicReferenceFieldUpdater2;
            this.f9412c = atomicReferenceFieldUpdater3;
            this.f9413d = atomicReferenceFieldUpdater4;
            this.f9414e = atomicReferenceFieldUpdater5;
        }

        public final boolean a(a aVar, d dVar) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            d dVar2 = d.f9406d;
            do {
                atomicReferenceFieldUpdater = this.f9413d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f9414e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f9412c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        public final void d(h hVar, h hVar2) {
            this.f9411b.lazySet(hVar, hVar2);
        }

        public final void e(h hVar, Thread thread) {
            this.f9410a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        public final void run() {
            throw null;
        }
    }

    public static final class g extends C0169a {
        public final boolean a(a aVar, d dVar) {
            d dVar2 = d.f9406d;
            synchronized (aVar) {
                if (aVar.f9399b != dVar) {
                    return false;
                }
                aVar.f9399b = dVar2;
                return true;
            }
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f9398a != obj) {
                    return false;
                }
                aVar.f9398a = obj2;
                return true;
            }
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f9400c != hVar) {
                    return false;
                }
                aVar.f9400c = hVar2;
                return true;
            }
        }

        public final void d(h hVar, h hVar2) {
            hVar.f9417b = hVar2;
        }

        public final void e(h hVar, Thread thread) {
            hVar.f9416a = thread;
        }
    }

    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f9415c = new h(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f9416a;

        /* renamed from: b  reason: collision with root package name */
        public volatile h f9417b;

        public h(int i8) {
        }

        public h() {
            a.B.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: i1.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: i1.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: i1.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: i1.a$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<i1.a$h> r0 = i1.a.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f9396d = r1
            java.lang.Class<i1.a> r1 = i1.a.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            f9397e = r2
            i1.a$e r2 = new i1.a$e     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<i1.a$d> r0 = i1.a.d.class
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            i1.a$g r2 = new i1.a$g
            r2.<init>()
        L_0x004e:
            B = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = f9397e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.a.<clinit>():void");
    }

    public static void c(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.f9400c;
        } while (!B.c(aVar, hVar, h.f9415c));
        while (hVar != null) {
            Thread thread = hVar.f9416a;
            if (thread != null) {
                hVar.f9416a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f9417b;
        }
        aVar.b();
        do {
            dVar = aVar.f9399b;
        } while (!B.a(aVar, dVar));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f9409c;
            dVar.f9409c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f9409c;
            Runnable runnable = dVar2.f9407a;
            if (!(runnable instanceof f)) {
                Executor executor = dVar2.f9408b;
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    f9397e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
                }
                dVar2 = dVar4;
            } else {
                ((f) runnable).getClass();
                throw null;
            }
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f9404b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f9405a);
        } else if (obj == C) {
            return null;
        } else {
            return obj;
        }
    }

    public final void a(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (ExecutionException e10) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e10.getCause());
                sb2.append("]");
                return;
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e11) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e11.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    public void b() {
    }

    public final boolean cancel(boolean z10) {
        Object obj = this.f9398a;
        if ((obj == null) || (obj instanceof f)) {
            b bVar = f9396d ? new b(new CancellationException("Future.cancel() was called."), z10) : z10 ? b.f9401c : b.f9402d;
            while (!B.b(this, obj, bVar)) {
                obj = this.f9398a;
                if (!(obj instanceof f)) {
                }
            }
            c(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    public final String e() {
        Object obj = this.f9398a;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb2.append("null");
            sb2.append("]");
            return sb2.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public final void f(h hVar) {
        hVar.f9416a = null;
        while (true) {
            h hVar2 = this.f9400c;
            if (hVar2 != h.f9415c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f9417b;
                    if (hVar2.f9416a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f9417b = hVar4;
                        if (hVar3.f9416a == null) {
                        }
                    } else if (!B.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            long r4 = r3.toNanos(r1)
            boolean r6 = java.lang.Thread.interrupted()
            if (r6 != 0) goto L_0x016b
            java.lang.Object r6 = r0.f9398a
            r7 = 1
            if (r6 == 0) goto L_0x0017
            r8 = r7
            goto L_0x0018
        L_0x0017:
            r8 = 0
        L_0x0018:
            boolean r9 = r6 instanceof i1.a.f
            r9 = r9 ^ r7
            r8 = r8 & r9
            if (r8 == 0) goto L_0x0023
            java.lang.Object r1 = d(r6)
            return r1
        L_0x0023:
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x002f
            long r10 = java.lang.System.nanoTime()
            long r10 = r10 + r4
            goto L_0x0030
        L_0x002f:
            r10 = r8
        L_0x0030:
            r12 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x008d
            i1.a$h r6 = r0.f9400c
            i1.a$h r8 = i1.a.h.f9415c
            if (r6 == r8) goto L_0x0086
            i1.a$h r9 = new i1.a$h
            r9.<init>()
        L_0x0041:
            i1.a$a r14 = B
            r14.d(r9, r6)
            boolean r6 = r14.c(r0, r6, r9)
            if (r6 == 0) goto L_0x0082
        L_0x004c:
            java.util.concurrent.locks.LockSupport.parkNanos(r0, r4)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0079
            java.lang.Object r4 = r0.f9398a
            if (r4 == 0) goto L_0x005b
            r5 = r7
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            boolean r6 = r4 instanceof i1.a.f
            r6 = r6 ^ r7
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0067
            java.lang.Object r1 = d(r4)
            return r1
        L_0x0067:
            long r4 = java.lang.System.nanoTime()
            long r4 = r10 - r4
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x004c
            r0.f(r9)
            r14 = r0
            r15 = r14
            r5 = r4
            r4 = r3
            goto L_0x00b3
        L_0x0079:
            r0.f(r9)
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L_0x0082:
            i1.a$h r6 = r0.f9400c
            if (r6 != r8) goto L_0x0041
        L_0x0086:
            java.lang.Object r1 = r0.f9398a
            java.lang.Object r1 = d(r1)
            return r1
        L_0x008d:
            r14 = r0
            r15 = r14
            r5 = r4
            r4 = r3
        L_0x0091:
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x00bc
            java.lang.Object r5 = r15.f9398a
            if (r5 == 0) goto L_0x009b
            r6 = r7
            goto L_0x009c
        L_0x009b:
            r6 = 0
        L_0x009c:
            boolean r8 = r5 instanceof i1.a.f
            r8 = r8 ^ r7
            r6 = r6 & r8
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r1 = d(r5)
            return r1
        L_0x00a7:
            boolean r5 = java.lang.Thread.interrupted()
            if (r5 != 0) goto L_0x00b6
            long r5 = java.lang.System.nanoTime()
            long r5 = r10 - r5
        L_0x00b3:
            r8 = 0
            goto L_0x0091
        L_0x00b6:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        L_0x00bc:
            java.lang.String r8 = r14.toString()
            java.lang.String r9 = r3.toString()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r15 = "Waited "
            r11.<init>(r15)
            r11.append(r1)
            java.lang.String r1 = " "
            r11.append(r1)
            java.lang.String r2 = r3.toString()
            java.lang.String r2 = r2.toLowerCase(r10)
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            long r10 = r5 + r12
            r15 = 0
            int r3 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x014d
            java.lang.String r3 = " (plus "
            java.lang.String r2 = h4.a.c(r2, r3)
            long r5 = -r5
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r10 = r4.convert(r5, r3)
            long r3 = r4.toNanos(r10)
            long r5 = r5 - r3
            r3 = 0
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x010e
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r7 = 0
        L_0x010e:
            if (r3 <= 0) goto L_0x0131
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r10)
            r3.append(r1)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            if (r7 == 0) goto L_0x012d
            java.lang.String r3 = ","
            java.lang.String r2 = h4.a.c(r2, r3)
        L_0x012d:
            java.lang.String r2 = h4.a.c(r2, r1)
        L_0x0131:
            if (r7 == 0) goto L_0x0147
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " nanoseconds "
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L_0x0147:
            java.lang.String r1 = "delay)"
            java.lang.String r2 = h4.a.c(r2, r1)
        L_0x014d:
            boolean r1 = r14.isDone()
            if (r1 == 0) goto L_0x015f
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = " but future completed as timeout expired"
            java.lang.String r2 = h4.a.c(r2, r3)
            r1.<init>(r2)
            throw r1
        L_0x015f:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = " for "
            java.lang.String r2 = h0.e.b(r2, r3, r8)
            r1.<init>(r2)
            throw r1
        L_0x016b:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.f9398a instanceof b;
    }

    public final boolean isDone() {
        Object obj = this.f9398a;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f9398a instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = e();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9398a;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return d(obj2);
            }
            h hVar = this.f9400c;
            h hVar2 = h.f9415c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    C0169a aVar = B;
                    aVar.d(hVar3, hVar);
                    if (aVar.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9398a;
                            } else {
                                f(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return d(obj);
                    }
                    hVar = this.f9400c;
                } while (hVar != hVar2);
            }
            return d(this.f9398a);
        }
        throw new InterruptedException();
    }
}
