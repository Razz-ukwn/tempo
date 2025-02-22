package u6;

import h7.b;

public abstract class n0 extends b {
    public n0() {
        super(1, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r6.f15855a >= r4.f15855a) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            r8 = this;
            r12 = -1
            r0 = 0
            r1 = 1
            if (r9 == r1) goto L_0x0094
            r2 = 2
            if (r9 == r2) goto L_0x0079
            r2 = 3
            if (r9 == r2) goto L_0x000d
            r9 = 0
            return r9
        L_0x000d:
            int r9 = r10.readInt()
            android.os.IBinder r2 = r10.readStrongBinder()
            android.os.Parcelable$Creator<u6.a1> r3 = u6.a1.CREATOR
            android.os.Parcelable r3 = j7.a.a(r10, r3)
            u6.a1 r3 = (u6.a1) r3
            j7.a.b(r10)
            r10 = r8
            u6.w0 r10 = (u6.w0) r10
            u6.b r4 = r10.f15871b
            java.lang.String r5 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            u6.q.j(r4, r5)
            u6.q.i(r3)
            r4.f15763v = r3
            boolean r4 = r4.C()
            if (r4 == 0) goto L_0x0058
            u6.e r4 = r3.f15741d
            u6.r r5 = u6.r.a()
            if (r4 != 0) goto L_0x003f
            r4 = r0
            goto L_0x0041
        L_0x003f:
            u6.s r4 = r4.f15782a
        L_0x0041:
            monitor-enter(r5)
            if (r4 != 0) goto L_0x0047
            u6.s r4 = u6.r.f15853c     // Catch:{ all -> 0x0055 }
            goto L_0x0051
        L_0x0047:
            u6.s r6 = r5.f15854a     // Catch:{ all -> 0x0055 }
            if (r6 == 0) goto L_0x0051
            int r6 = r6.f15855a     // Catch:{ all -> 0x0055 }
            int r7 = r4.f15855a     // Catch:{ all -> 0x0055 }
            if (r6 >= r7) goto L_0x0053
        L_0x0051:
            r5.f15854a = r4     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r5)
            goto L_0x0058
        L_0x0055:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L_0x0058:
            android.os.Bundle r3 = r3.f15738a
            u6.b r4 = r10.f15871b
            java.lang.String r5 = "onPostInitComplete can be called only once per call to getRemoteService"
            u6.q.j(r4, r5)
            u6.b r4 = r10.f15871b
            r4.getClass()
            u6.y0 r5 = new u6.y0
            r5.<init>(r4, r9, r2, r3)
            u6.u0 r9 = r4.f15748f
            int r2 = r10.f15872c
            android.os.Message r12 = r9.obtainMessage(r1, r2, r12, r5)
            r9.sendMessage(r12)
            r10.f15871b = r0
            goto L_0x00c8
        L_0x0079:
            r10.readInt()
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = j7.a.a(r10, r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            j7.a.b(r10)
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>()
            java.lang.String r10 = "GmsClient"
            java.lang.String r12 = "received deprecated onAccountValidationComplete callback, ignoring"
            android.util.Log.wtf(r10, r12, r9)
            goto L_0x00c8
        L_0x0094:
            int r9 = r10.readInt()
            android.os.IBinder r2 = r10.readStrongBinder()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = j7.a.a(r10, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            j7.a.b(r10)
            r10 = r8
            u6.w0 r10 = (u6.w0) r10
            u6.b r4 = r10.f15871b
            java.lang.String r5 = "onPostInitComplete can be called only once per call to getRemoteService"
            u6.q.j(r4, r5)
            u6.b r4 = r10.f15871b
            r4.getClass()
            u6.y0 r5 = new u6.y0
            r5.<init>(r4, r9, r2, r3)
            u6.u0 r9 = r4.f15748f
            int r2 = r10.f15872c
            android.os.Message r12 = r9.obtainMessage(r1, r2, r12, r5)
            r9.sendMessage(r12)
            r10.f15871b = r0
        L_0x00c8:
            r11.writeNoException()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.n0.M(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
