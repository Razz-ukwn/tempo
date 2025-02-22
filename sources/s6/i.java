package s6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import q7.c7;
import q7.s;
import q7.x5;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ Object B;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14761a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14762b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14763c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Parcelable f14764d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f14765e;

    public i(x5 x5Var, c7 c7Var, boolean z10, s sVar, String str) {
        this.B = x5Var;
        this.f14763c = c7Var;
        this.f14762b = z10;
        this.f14764d = sVar;
        this.f14765e = str;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [v6.a] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f14761a
            boolean r1 = r8.f14762b
            r2 = 0
            java.lang.Object r3 = r8.B
            android.os.Parcelable r4 = r8.f14764d
            java.lang.Object r5 = r8.f14763c
            switch(r0) {
                case 0: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0042
        L_0x000f:
            s6.b r5 = (s6.b) r5
            android.content.Intent r4 = (android.content.Intent) r4
            java.lang.Object r0 = r8.f14765e
            android.content.Context r0 = (android.content.Context) r0
            android.content.BroadcastReceiver$PendingResult r3 = (android.content.BroadcastReceiver.PendingResult) r3
            r5.getClass()
            java.lang.String r6 = "wrapped_intent"
            android.os.Parcelable r6 = r4.getParcelableExtra(r6)     // Catch:{ all -> 0x003d }
            boolean r7 = r6 instanceof android.content.Intent     // Catch:{ all -> 0x003d }
            if (r7 == 0) goto L_0x0029
            r2 = r6
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x003d }
        L_0x0029:
            if (r2 == 0) goto L_0x0030
            int r0 = r5.d(r0, r2)     // Catch:{ all -> 0x003d }
            goto L_0x0034
        L_0x0030:
            int r0 = r5.c(r0, r4)     // Catch:{ all -> 0x003d }
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r3.setResultCode(r0)     // Catch:{ all -> 0x003d }
        L_0x0039:
            r3.finish()
            return
        L_0x003d:
            r0 = move-exception
            r3.finish()
            throw r0
        L_0x0042:
            q7.x5 r3 = (q7.x5) r3
            q7.j2 r0 = r3.f13433d
            if (r0 != 0) goto L_0x0059
            q7.k4 r0 = r3.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            java.lang.String r1 = "Discarding data. Failed to send event to service"
            q7.q2 r0 = r0.B
            r0.b(r1)
            goto L_0x006a
        L_0x0059:
            q7.c7 r5 = (q7.c7) r5
            u6.q.i(r5)
            if (r1 == 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r2 = r4
            q7.s r2 = (q7.s) r2
        L_0x0064:
            r3.m(r0, r2, r5)
            r3.t()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.i.run():void");
    }

    public /* synthetic */ i(b bVar, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f14763c = bVar;
        this.f14764d = intent;
        this.f14765e = context;
        this.f14762b = z10;
        this.B = pendingResult;
    }
}
