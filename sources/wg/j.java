package wg;

import ff.m;
import java.io.Closeable;

public abstract class j implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16764a;

    /* renamed from: b  reason: collision with root package name */
    public int f16765b;

    public static final class a implements i0 {

        /* renamed from: a  reason: collision with root package name */
        public final j f16766a;

        /* renamed from: b  reason: collision with root package name */
        public long f16767b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16768c;

        public a(j jVar, long j10) {
            sf.j.f(jVar, "fileHandle");
            this.f16766a = jVar;
            this.f16767b = j10;
        }

        public final long a0(e eVar, long j10) {
            long j11;
            long j12;
            e eVar2 = eVar;
            long j13 = j10;
            sf.j.f(eVar2, "sink");
            int i8 = 1;
            if (!this.f16768c) {
                long j14 = this.f16767b;
                j jVar = this.f16766a;
                jVar.getClass();
                if (j13 >= 0) {
                    long j15 = j13 + j14;
                    long j16 = j14;
                    while (true) {
                        if (j16 >= j15) {
                            j11 = j14;
                            break;
                        }
                        d0 e02 = eVar2.e0(i8);
                        byte[] bArr = e02.f16744a;
                        int i10 = e02.f16746c;
                        j11 = j14;
                        d0 d0Var = e02;
                        int d10 = jVar.d(j16, bArr, i10, (int) Math.min(j15 - j16, (long) (8192 - i10)));
                        if (d10 == -1) {
                            if (d0Var.f16745b == d0Var.f16746c) {
                                eVar2.f16751a = d0Var.a();
                                e0.a(d0Var);
                            }
                            if (j11 == j16) {
                                j12 = -1;
                            }
                        } else {
                            d0Var.f16746c += d10;
                            long j17 = (long) d10;
                            j16 += j17;
                            eVar2.f16752b += j17;
                            j14 = j11;
                            i8 = 1;
                        }
                    }
                    j12 = j16 - j11;
                    if (j12 != -1) {
                        this.f16767b += j12;
                    }
                    return j12;
                }
                throw new IllegalArgumentException(("byteCount < 0: " + j13).toString());
            }
            throw new IllegalStateException("closed".toString());
        }

        public final j0 b() {
            return j0.f16769d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r3 = this;
                boolean r0 = r3.f16768c
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                r0 = 1
                r3.f16768c = r0
                wg.j r0 = r3.f16766a
                monitor-enter(r0)
                wg.j r1 = r3.f16766a     // Catch:{ all -> 0x0023 }
                int r2 = r1.f16765b     // Catch:{ all -> 0x0023 }
                int r2 = r2 + -1
                r1.f16765b = r2     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x0021
                boolean r2 = r1.f16764a     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x001a
                goto L_0x0021
            L_0x001a:
                ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x0023 }
                monitor-exit(r0)
                r1.c()
                return
            L_0x0021:
                monitor-exit(r0)
                return
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wg.j.a.close():void");
        }
    }

    public abstract void c();

    public final void close() {
        synchronized (this) {
            if (!this.f16764a) {
                this.f16764a = true;
                if (this.f16765b == 0) {
                    m mVar = m.f8717a;
                    c();
                }
            }
        }
    }

    public abstract int d(long j10, byte[] bArr, int i8, int i10);

    public abstract long e();

    public final a j(long j10) {
        synchronized (this) {
            if (!this.f16764a) {
                this.f16765b++;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
        return new a(this, j10);
    }

    public final long size() {
        synchronized (this) {
            if (!this.f16764a) {
                m mVar = m.f8717a;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
        return e();
    }
}
