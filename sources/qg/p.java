package qg;

import java.util.List;
import jg.c0;
import jg.v;
import jg.w;
import jg.x;
import kg.b;
import ng.e;
import og.d;
import og.f;
import sf.j;
import wg.g0;
import wg.i0;

public final class p implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f13699g = b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f13700h = b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final e f13701a;

    /* renamed from: b  reason: collision with root package name */
    public final f f13702b;

    /* renamed from: c  reason: collision with root package name */
    public final f f13703c;

    /* renamed from: d  reason: collision with root package name */
    public volatile r f13704d;

    /* renamed from: e  reason: collision with root package name */
    public final w f13705e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f13706f;

    public p(v vVar, e eVar, f fVar, f fVar2) {
        j.f(eVar, "connection");
        this.f13701a = eVar;
        this.f13702b = fVar;
        this.f13703c = fVar2;
        w wVar = w.B;
        this.f13705e = !vVar.N.contains(wVar) ? w.f10217e : wVar;
    }

    public final g0 a(x xVar, long j10) {
        r rVar = this.f13704d;
        j.c(rVar);
        return rVar.f();
    }

    public final i0 b(c0 c0Var) {
        r rVar = this.f13704d;
        j.c(rVar);
        return rVar.f13725i;
    }

    public final void c() {
        r rVar = this.f13704d;
        j.c(rVar);
        rVar.f().close();
    }

    public final void cancel() {
        this.f13706f = true;
        r rVar = this.f13704d;
        if (rVar != null) {
            rVar.e(b.CANCEL);
        }
    }

    public final long d(c0 c0Var) {
        if (!og.e.a(c0Var)) {
            return 0;
        }
        return b.k(c0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        r0.f13727k.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final jg.c0.a e(boolean r11) {
        /*
            r10 = this;
            qg.r r0 = r10.f13704d
            sf.j.c(r0)
            monitor-enter(r0)
            qg.r$c r1 = r0.f13727k     // Catch:{ all -> 0x00c1 }
            r1.h()     // Catch:{ all -> 0x00c1 }
        L_0x000b:
            java.util.ArrayDeque<jg.q> r1 = r0.f13723g     // Catch:{ all -> 0x00ba }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x001b
            qg.b r1 = r0.m     // Catch:{ all -> 0x00ba }
            if (r1 != 0) goto L_0x001b
            r0.j()     // Catch:{ all -> 0x00ba }
            goto L_0x000b
        L_0x001b:
            qg.r$c r1 = r0.f13727k     // Catch:{ all -> 0x00c1 }
            r1.l()     // Catch:{ all -> 0x00c1 }
            java.util.ArrayDeque<jg.q> r1 = r0.f13723g     // Catch:{ all -> 0x00c1 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c1 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00ab
            java.util.ArrayDeque<jg.q> r1 = r0.f13723g     // Catch:{ all -> 0x00c1 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "headersQueue.removeFirst()"
            sf.j.e(r1, r2)     // Catch:{ all -> 0x00c1 }
            jg.q r1 = (jg.q) r1     // Catch:{ all -> 0x00c1 }
            monitor-exit(r0)
            jg.w r0 = r10.f13705e
            java.lang.String r2 = "protocol"
            sf.j.f(r0, r2)
            jg.q$a r2 = new jg.q$a
            r2.<init>()
            java.lang.String[] r3 = r1.f10150a
            int r3 = r3.length
            int r3 = r3 / 2
            r4 = 0
            r5 = 0
            r6 = r4
        L_0x004c:
            if (r5 >= r3) goto L_0x0078
            int r7 = r5 + 1
            java.lang.String r8 = r1.c(r5)
            java.lang.String r5 = r1.e(r5)
            java.lang.String r9 = ":status"
            boolean r9 = sf.j.a(r8, r9)
            if (r9 == 0) goto L_0x006b
            java.lang.String r6 = "HTTP/1.1 "
            java.lang.String r5 = sf.j.k(r5, r6)
            og.i r6 = og.i.a.a(r5)
            goto L_0x0076
        L_0x006b:
            java.util.List<java.lang.String> r9 = f13700h
            boolean r9 = r9.contains(r8)
            if (r9 != 0) goto L_0x0076
            r2.b(r8, r5)
        L_0x0076:
            r5 = r7
            goto L_0x004c
        L_0x0078:
            if (r6 == 0) goto L_0x00a3
            jg.c0$a r1 = new jg.c0$a
            r1.<init>()
            r1.f10057b = r0
            int r0 = r6.f12379b
            r1.f10058c = r0
            java.lang.String r0 = r6.f12380c
            java.lang.String r3 = "message"
            sf.j.f(r0, r3)
            r1.f10059d = r0
            jg.q r0 = r2.c()
            jg.q$a r0 = r0.d()
            r1.f10061f = r0
            if (r11 == 0) goto L_0x00a1
            int r11 = r1.f10058c
            r0 = 100
            if (r11 != r0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r4 = r1
        L_0x00a2:
            return r4
        L_0x00a3:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r0 = "Expected ':status' header not present"
            r11.<init>(r0)
            throw r11
        L_0x00ab:
            java.io.IOException r11 = r0.f13729n     // Catch:{ all -> 0x00c1 }
            if (r11 != 0) goto L_0x00b9
            qg.w r11 = new qg.w     // Catch:{ all -> 0x00c1 }
            qg.b r1 = r0.m     // Catch:{ all -> 0x00c1 }
            sf.j.c(r1)     // Catch:{ all -> 0x00c1 }
            r11.<init>(r1)     // Catch:{ all -> 0x00c1 }
        L_0x00b9:
            throw r11     // Catch:{ all -> 0x00c1 }
        L_0x00ba:
            r11 = move-exception
            qg.r$c r1 = r0.f13727k     // Catch:{ all -> 0x00c1 }
            r1.l()     // Catch:{ all -> 0x00c1 }
            throw r11     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.p.e(boolean):jg.c0$a");
    }

    public final e f() {
        return this.f13701a;
    }

    public final void g() {
        this.f13703c.flush();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(jg.x r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            qg.r r2 = r1.f13704d
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            jg.b0 r2 = r0.f10222d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0011
            r2 = r4
            goto L_0x0012
        L_0x0011:
            r2 = r3
        L_0x0012:
            java.util.ArrayList r5 = new java.util.ArrayList
            jg.q r6 = r0.f10221c
            java.lang.String[] r7 = r6.f10150a
            int r7 = r7.length
            int r7 = r7 / 2
            r8 = 4
            int r7 = r7 + r8
            r5.<init>(r7)
            qg.c r7 = new qg.c
            wg.i r9 = qg.c.f13619f
            java.lang.String r10 = r0.f10220b
            r7.<init>((wg.i) r9, (java.lang.String) r10)
            r5.add(r7)
            qg.c r7 = new qg.c
            wg.i r9 = qg.c.f13620g
            java.lang.String r10 = "url"
            jg.r r11 = r0.f10219a
            sf.j.f(r11, r10)
            java.lang.String r10 = r11.b()
            java.lang.String r12 = r11.d()
            if (r12 == 0) goto L_0x0055
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r10 = 63
            r13.append(r10)
            r13.append(r12)
            java.lang.String r10 = r13.toString()
        L_0x0055:
            r7.<init>((wg.i) r9, (java.lang.String) r10)
            r5.add(r7)
            java.lang.String r7 = "Host"
            jg.q r0 = r0.f10221c
            java.lang.String r0 = r0.a(r7)
            if (r0 == 0) goto L_0x006f
            qg.c r7 = new qg.c
            wg.i r9 = qg.c.f13622i
            r7.<init>((wg.i) r9, (java.lang.String) r0)
            r5.add(r7)
        L_0x006f:
            qg.c r0 = new qg.c
            wg.i r7 = qg.c.f13621h
            java.lang.String r9 = r11.f10153a
            r0.<init>((wg.i) r7, (java.lang.String) r9)
            r5.add(r0)
            java.lang.String[] r0 = r6.f10150a
            int r0 = r0.length
            int r0 = r0 / 2
            r7 = r3
        L_0x0081:
            if (r7 >= r0) goto L_0x00c3
            int r9 = r7 + 1
            java.lang.String r10 = r6.c(r7)
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r12 = "US"
            sf.j.e(r11, r12)
            java.lang.String r10 = r10.toLowerCase(r11)
            java.lang.String r11 = "this as java.lang.String).toLowerCase(locale)"
            sf.j.e(r10, r11)
            java.util.List<java.lang.String> r11 = f13699g
            boolean r11 = r11.contains(r10)
            if (r11 == 0) goto L_0x00b5
            java.lang.String r11 = "te"
            boolean r11 = sf.j.a(r10, r11)
            if (r11 == 0) goto L_0x00c1
            java.lang.String r11 = r6.e(r7)
            java.lang.String r12 = "trailers"
            boolean r11 = sf.j.a(r11, r12)
            if (r11 == 0) goto L_0x00c1
        L_0x00b5:
            qg.c r11 = new qg.c
            java.lang.String r7 = r6.e(r7)
            r11.<init>((java.lang.String) r10, (java.lang.String) r7)
            r5.add(r11)
        L_0x00c1:
            r7 = r9
            goto L_0x0081
        L_0x00c3:
            qg.f r6 = r1.f13703c
            r6.getClass()
            r0 = r2 ^ 1
            r16 = 0
            qg.s r7 = r6.U
            monitor-enter(r7)
            monitor-enter(r6)     // Catch:{ all -> 0x01b4 }
            int r9 = r6.B     // Catch:{ all -> 0x01b1 }
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 <= r10) goto L_0x00dc
            qg.b r9 = qg.b.REFUSED_STREAM     // Catch:{ all -> 0x01b1 }
            r6.p(r9)     // Catch:{ all -> 0x01b1 }
        L_0x00dc:
            boolean r9 = r6.C     // Catch:{ all -> 0x01b1 }
            if (r9 != 0) goto L_0x01ab
            int r9 = r6.B     // Catch:{ all -> 0x01b1 }
            int r10 = r9 + 2
            r6.B = r10     // Catch:{ all -> 0x01b1 }
            qg.r r10 = new qg.r     // Catch:{ all -> 0x01b1 }
            r17 = 0
            r12 = r10
            r13 = r9
            r14 = r6
            r15 = r0
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01b1 }
            if (r2 == 0) goto L_0x0106
            long r11 = r6.R     // Catch:{ all -> 0x01b1 }
            long r13 = r6.S     // Catch:{ all -> 0x01b1 }
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0106
            long r11 = r10.f13721e     // Catch:{ all -> 0x01b1 }
            long r13 = r10.f13722f     // Catch:{ all -> 0x01b1 }
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r2 = r3
            goto L_0x0107
        L_0x0106:
            r2 = r4
        L_0x0107:
            boolean r11 = r10.h()     // Catch:{ all -> 0x01b1 }
            if (r11 == 0) goto L_0x0116
            java.util.LinkedHashMap r11 = r6.f13652c     // Catch:{ all -> 0x01b1 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b1 }
            r11.put(r12, r10)     // Catch:{ all -> 0x01b1 }
        L_0x0116:
            ff.m r11 = ff.m.f8717a     // Catch:{ all -> 0x01b1 }
            monitor-exit(r6)     // Catch:{ all -> 0x01b4 }
            qg.s r11 = r6.U     // Catch:{ all -> 0x01b4 }
            monitor-enter(r11)     // Catch:{ all -> 0x01b4 }
            boolean r12 = r11.f13744e     // Catch:{ all -> 0x01a8 }
            if (r12 != 0) goto L_0x01a0
            qg.d$b r12 = r11.B     // Catch:{ all -> 0x01a8 }
            r12.d(r5)     // Catch:{ all -> 0x01a8 }
            wg.e r5 = r11.f13742c     // Catch:{ all -> 0x01a8 }
            long r12 = r5.f16752b     // Catch:{ all -> 0x01a8 }
            int r5 = r11.f13743d     // Catch:{ all -> 0x01a8 }
            long r14 = (long) r5     // Catch:{ all -> 0x01a8 }
            long r14 = java.lang.Math.min(r14, r12)     // Catch:{ all -> 0x01a8 }
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x0135
            r3 = r8
        L_0x0135:
            if (r0 == 0) goto L_0x0139
            r3 = r3 | 1
        L_0x0139:
            int r0 = (int) r14     // Catch:{ all -> 0x01a8 }
            r11.e(r9, r0, r4, r3)     // Catch:{ all -> 0x01a8 }
            wg.g r0 = r11.f13740a     // Catch:{ all -> 0x01a8 }
            wg.e r3 = r11.f13742c     // Catch:{ all -> 0x01a8 }
            r0.B(r3, r14)     // Catch:{ all -> 0x01a8 }
            if (r5 <= 0) goto L_0x014a
            long r12 = r12 - r14
            r11.u(r9, r12)     // Catch:{ all -> 0x01a8 }
        L_0x014a:
            monitor-exit(r11)     // Catch:{ all -> 0x01b4 }
            monitor-exit(r7)
            if (r2 == 0) goto L_0x0167
            qg.s r2 = r6.U
            monitor-enter(r2)
            boolean r0 = r2.f13744e     // Catch:{ all -> 0x0164 }
            if (r0 != 0) goto L_0x015c
            wg.g r0 = r2.f13740a     // Catch:{ all -> 0x0164 }
            r0.flush()     // Catch:{ all -> 0x0164 }
            monitor-exit(r2)
            goto L_0x0167
        L_0x015c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = "closed"
            r0.<init>(r3)     // Catch:{ all -> 0x0164 }
            throw r0     // Catch:{ all -> 0x0164 }
        L_0x0164:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0167:
            r1.f13704d = r10
            boolean r0 = r1.f13706f
            if (r0 != 0) goto L_0x018e
            qg.r r0 = r1.f13704d
            sf.j.c(r0)
            qg.r$c r0 = r0.f13727k
            og.f r2 = r1.f13702b
            int r2 = r2.f12371g
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.g(r2, r4)
            qg.r r0 = r1.f13704d
            sf.j.c(r0)
            qg.r$c r0 = r0.f13728l
            og.f r2 = r1.f13702b
            int r2 = r2.f12372h
            long r2 = (long) r2
            r0.g(r2, r4)
            return
        L_0x018e:
            qg.r r0 = r1.f13704d
            sf.j.c(r0)
            qg.b r2 = qg.b.CANCEL
            r0.e(r2)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x01a0:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01a8 }
            java.lang.String r2 = "closed"
            r0.<init>(r2)     // Catch:{ all -> 0x01a8 }
            throw r0     // Catch:{ all -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01b4 }
            throw r0     // Catch:{ all -> 0x01b4 }
        L_0x01ab:
            qg.a r0 = new qg.a     // Catch:{ all -> 0x01b1 }
            r0.<init>()     // Catch:{ all -> 0x01b1 }
            throw r0     // Catch:{ all -> 0x01b1 }
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01b4 }
            throw r0     // Catch:{ all -> 0x01b4 }
        L_0x01b4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.p.h(jg.x):void");
    }
}
