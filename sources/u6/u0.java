package u6;

import android.os.Looper;
import j7.b;

public final class u0 extends b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f15867a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(b bVar, Looper looper) {
        super(looper);
        this.f15867a = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (r0 == 5) goto L_0x004e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            u6.b r0 = r10.f15867a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f15764w
            int r0 = r0.get()
            int r1 = r11.arg1
            r2 = 0
            r3 = 7
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == r1) goto L_0x003c
            int r0 = r11.what
            if (r0 == r4) goto L_0x0019
            if (r0 == r5) goto L_0x0019
            if (r0 != r3) goto L_0x001a
        L_0x0019:
            r2 = r5
        L_0x001a:
            if (r2 == 0) goto L_0x003b
            java.lang.Object r11 = r11.obj
            u6.v0 r11 = (u6.v0) r11
            r11.b()
            monitor-enter(r11)
            r11.f15868a = r6     // Catch:{ all -> 0x0038 }
            monitor-exit(r11)     // Catch:{ all -> 0x0038 }
            u6.b r0 = r11.f15870c
            java.util.ArrayList r0 = r0.f15754l
            monitor-enter(r0)
            u6.b r1 = r11.f15870c     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r1 = r1.f15754l     // Catch:{ all -> 0x0035 }
            r1.remove(r11)     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r11
        L_0x0038:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0038 }
            throw r0
        L_0x003b:
            return
        L_0x003c:
            int r0 = r11.what
            r1 = 4
            r7 = 5
            if (r0 == r5) goto L_0x004e
            if (r0 == r3) goto L_0x004e
            if (r0 != r1) goto L_0x004c
            u6.b r0 = r10.f15867a
            r0.getClass()
            goto L_0x004e
        L_0x004c:
            if (r0 != r7) goto L_0x0056
        L_0x004e:
            u6.b r0 = r10.f15867a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x01a9
        L_0x0056:
            int r0 = r11.what
            r8 = 8
            r9 = 3
            if (r0 != r1) goto L_0x00b2
            u6.b r0 = r10.f15867a
            t6.b r1 = new t6.b
            int r11 = r11.arg2
            r1.<init>(r11)
            r0.f15761t = r1
            u6.b r11 = r10.f15867a
            boolean r0 = r11.f15762u
            if (r0 == 0) goto L_0x006f
            goto L_0x0089
        L_0x006f:
            java.lang.String r0 = r11.y()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x007a
            goto L_0x0089
        L_0x007a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            java.lang.String r11 = r11.y()     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.Class.forName(r11)     // Catch:{ ClassNotFoundException -> 0x0089 }
            r2 = r5
        L_0x0089:
            if (r2 == 0) goto L_0x0096
            u6.b r11 = r10.f15867a
            boolean r0 = r11.f15762u
            if (r0 == 0) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            r11.E(r9, r6)
            return
        L_0x0096:
            u6.b r11 = r10.f15867a
            t6.b r11 = r11.f15761t
            if (r11 == 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            t6.b r11 = new t6.b
            r11.<init>(r8)
        L_0x00a2:
            u6.b r0 = r10.f15867a
            u6.b$c r0 = r0.f15752j
            r0.a(r11)
            u6.b r11 = r10.f15867a
            r11.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00b2:
            if (r0 != r7) goto L_0x00d0
            u6.b r11 = r10.f15867a
            t6.b r11 = r11.f15761t
            if (r11 == 0) goto L_0x00bb
            goto L_0x00c0
        L_0x00bb:
            t6.b r11 = new t6.b
            r11.<init>(r8)
        L_0x00c0:
            u6.b r0 = r10.f15867a
            u6.b$c r0 = r0.f15752j
            r0.a(r11)
            u6.b r11 = r10.f15867a
            r11.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00d0:
            if (r0 != r9) goto L_0x00f2
            java.lang.Object r0 = r11.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00db
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00db:
            t6.b r0 = new t6.b
            int r11 = r11.arg2
            r0.<init>(r11, r6)
            u6.b r11 = r10.f15867a
            u6.b$c r11 = r11.f15752j
            r11.a(r0)
            u6.b r11 = r10.f15867a
            r11.getClass()
            java.lang.System.currentTimeMillis()
            return
        L_0x00f2:
            r1 = 6
            if (r0 != r1) goto L_0x0110
            u6.b r0 = r10.f15867a
            r0.E(r7, r6)
            u6.b r0 = r10.f15867a
            u6.b$a r0 = r0.f15756o
            if (r0 == 0) goto L_0x0105
            int r11 = r11.arg2
            r0.b(r11)
        L_0x0105:
            u6.b r11 = r10.f15867a
            r11.B()
            u6.b r11 = r10.f15867a
            u6.b.D(r11, r7, r5, r6)
            return
        L_0x0110:
            if (r0 != r4) goto L_0x013b
            u6.b r0 = r10.f15867a
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x011b
            goto L_0x013b
        L_0x011b:
            java.lang.Object r11 = r11.obj
            r0 = r11
            u6.v0 r0 = (u6.v0) r0
            r0.b()
            monitor-enter(r0)
            r0.f15868a = r6     // Catch:{ all -> 0x0138 }
            monitor-exit(r0)     // Catch:{ all -> 0x0138 }
            u6.b r11 = r0.f15870c
            java.util.ArrayList r11 = r11.f15754l
            monitor-enter(r11)
            u6.b r1 = r0.f15870c     // Catch:{ all -> 0x0135 }
            java.util.ArrayList r1 = r1.f15754l     // Catch:{ all -> 0x0135 }
            r1.remove(r0)     // Catch:{ all -> 0x0135 }
            monitor-exit(r11)     // Catch:{ all -> 0x0135 }
            return
        L_0x0135:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0135 }
            throw r0
        L_0x0138:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0138 }
            throw r11
        L_0x013b:
            int r0 = r11.what
            if (r0 == r4) goto L_0x0143
            if (r0 == r5) goto L_0x0143
            if (r0 != r3) goto L_0x0144
        L_0x0143:
            r2 = r5
        L_0x0144:
            if (r2 == 0) goto L_0x0198
            java.lang.Object r11 = r11.obj
            u6.v0 r11 = (u6.v0) r11
            java.lang.String r0 = "Callback proxy "
            monitor-enter(r11)
            java.lang.Object r1 = r11.f15868a     // Catch:{ all -> 0x0195 }
            boolean r2 = r11.f15869b     // Catch:{ all -> 0x0195 }
            if (r2 == 0) goto L_0x016d
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = r11.toString()     // Catch:{ all -> 0x0195 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0195 }
            r4.<init>(r0)     // Catch:{ all -> 0x0195 }
            r4.append(r3)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = " being reused. This is not safe."
            r4.append(r0)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0195 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0195 }
        L_0x016d:
            monitor-exit(r11)     // Catch:{ all -> 0x0195 }
            if (r1 == 0) goto L_0x0176
            r11.a()     // Catch:{ RuntimeException -> 0x0174 }
            goto L_0x0176
        L_0x0174:
            r11 = move-exception
            throw r11
        L_0x0176:
            monitor-enter(r11)
            r11.f15869b = r5     // Catch:{ all -> 0x0192 }
            monitor-exit(r11)     // Catch:{ all -> 0x0192 }
            monitor-enter(r11)
            r11.f15868a = r6     // Catch:{ all -> 0x018f }
            monitor-exit(r11)     // Catch:{ all -> 0x018f }
            u6.b r0 = r11.f15870c
            java.util.ArrayList r0 = r0.f15754l
            monitor-enter(r0)
            u6.b r1 = r11.f15870c     // Catch:{ all -> 0x018c }
            java.util.ArrayList r1 = r1.f15754l     // Catch:{ all -> 0x018c }
            r1.remove(r11)     // Catch:{ all -> 0x018c }
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            return
        L_0x018c:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018c }
            throw r11
        L_0x018f:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x018f }
            throw r0
        L_0x0192:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0192 }
            throw r0
        L_0x0195:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0195 }
            throw r0
        L_0x0198:
            java.lang.String r11 = "Don't know how to handle message: "
            java.lang.String r11 = androidx.fragment.app.q.a(r11, r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r11, r0)
            return
        L_0x01a9:
            java.lang.Object r11 = r11.obj
            u6.v0 r11 = (u6.v0) r11
            r11.b()
            monitor-enter(r11)
            r11.f15868a = r6     // Catch:{ all -> 0x01c5 }
            monitor-exit(r11)     // Catch:{ all -> 0x01c5 }
            u6.b r0 = r11.f15870c
            java.util.ArrayList r0 = r0.f15754l
            monitor-enter(r0)
            u6.b r1 = r11.f15870c     // Catch:{ all -> 0x01c2 }
            java.util.ArrayList r1 = r1.f15754l     // Catch:{ all -> 0x01c2 }
            r1.remove(r11)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c2 }
            return
        L_0x01c2:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c2 }
            throw r11
        L_0x01c5:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01c5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.u0.handleMessage(android.os.Message):void");
    }
}
