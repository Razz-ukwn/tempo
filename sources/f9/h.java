package f9;

import h7.b;

public abstract class h extends b {
    public h() {
        super(2, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.os.Parcelable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: android.os.Parcelable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(int r8, android.os.Parcel r9, android.os.Parcel r10, int r11) {
        /*
            r7 = this;
            r10 = 0
            r11 = 2
            r0 = 0
            if (r8 == r11) goto L_0x005b
            r11 = 3
            if (r8 == r11) goto L_0x0009
            return r0
        L_0x0009:
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            int r11 = f9.d.f8613a
            int r11 = r9.readInt()
            if (r11 != 0) goto L_0x0014
            goto L_0x001b
        L_0x0014:
            java.lang.Object r8 = r8.createFromParcel(r9)
            r10 = r8
            android.os.Parcelable r10 = (android.os.Parcelable) r10
        L_0x001b:
            android.os.Bundle r10 = (android.os.Bundle) r10
            int r8 = r9.dataAvail()
            if (r8 > 0) goto L_0x004f
            r8 = r7
            e9.g r8 = (e9.g) r8
            e9.h r9 = r8.f7885e
            f9.t r9 = r9.f7889a
            com.google.android.gms.tasks.TaskCompletionSource r10 = r8.f7884c
            java.lang.Object r11 = r9.f8635f
            monitor-enter(r11)
            java.util.HashSet r1 = r9.f8634e     // Catch:{ all -> 0x004c }
            r1.remove(r10)     // Catch:{ all -> 0x004c }
            monitor-exit(r11)     // Catch:{ all -> 0x004c }
            f9.o r10 = new f9.o
            r10.<init>(r9)
            android.os.Handler r9 = r9.a()
            r9.post(r10)
            java.lang.Object[] r9 = new java.lang.Object[r0]
            f9.k r8 = r8.f7883b
            java.lang.String r10 = "onCompleteUpdate"
            r8.a(r10, r9)
            goto L_0x0175
        L_0x004c:
            r8 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x004c }
            throw r8
        L_0x004f:
            android.os.BadParcelableException r9 = new android.os.BadParcelableException
            java.lang.String r10 = "Parcel data not fully consumed, unread size: "
            java.lang.String r8 = androidx.fragment.app.q.a(r10, r8)
            r9.<init>(r8)
            throw r9
        L_0x005b:
            android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
            int r11 = f9.d.f8613a
            int r11 = r9.readInt()
            if (r11 != 0) goto L_0x0066
            goto L_0x006d
        L_0x0066:
            java.lang.Object r8 = r8.createFromParcel(r9)
            r10 = r8
            android.os.Parcelable r10 = (android.os.Parcelable) r10
        L_0x006d:
            android.os.Bundle r10 = (android.os.Bundle) r10
            int r8 = r9.dataAvail()
            if (r8 > 0) goto L_0x017a
            r8 = r7
            e9.g r8 = (e9.g) r8
            e9.h r9 = r8.f7885e
            f9.t r9 = r9.f7889a
            com.google.android.gms.tasks.TaskCompletionSource r11 = r8.f7884c
            java.lang.Object r1 = r9.f8635f
            monitor-enter(r1)
            java.util.HashSet r2 = r9.f8634e     // Catch:{ all -> 0x0177 }
            r2.remove(r11)     // Catch:{ all -> 0x0177 }
            monitor-exit(r1)     // Catch:{ all -> 0x0177 }
            f9.o r1 = new f9.o
            r1.<init>(r9)
            android.os.Handler r9 = r9.a()
            r9.post(r1)
            java.lang.Object[] r9 = new java.lang.Object[r0]
            f9.k r1 = r8.f7883b
            java.lang.String r2 = "onRequestInfo"
            r1.a(r2, r9)
            java.lang.String r9 = "error.code"
            r1 = -2
            int r2 = r10.getInt(r9, r1)
            if (r2 == 0) goto L_0x00b3
            g9.a r8 = new g9.a
            int r9 = r10.getInt(r9, r1)
            r8.<init>(r9)
            r11.trySetException(r8)
            goto L_0x0175
        L_0x00b3:
            java.lang.String r9 = "version.code"
            r1 = -1
            int r9 = r10.getInt(r9, r1)
            java.lang.String r2 = "update.availability"
            int r2 = r10.getInt(r2)
            java.lang.String r3 = "install.status"
            r10.getInt(r3, r0)
            java.lang.String r3 = "client.version.staleness"
            int r4 = r10.getInt(r3, r1)
            if (r4 != r1) goto L_0x00ce
            goto L_0x00d1
        L_0x00ce:
            r10.getInt(r3)
        L_0x00d1:
            java.lang.String r1 = "in.app.update.priority"
            r10.getInt(r1, r0)
            java.lang.String r0 = "bytes.downloaded"
            r10.getLong(r0)
            java.lang.String r0 = "total.bytes.to.download"
            r10.getLong(r0)
            java.lang.String r0 = "additional.size.required"
            r10.getLong(r0)
            e9.h r8 = r8.f7886f
            e9.i r8 = r8.f7892d
            r8.getClass()
            java.io.File r0 = new java.io.File
            android.content.Context r8 = r8.f7893a
            java.io.File r8 = r8.getFilesDir()
            java.lang.String r1 = "assetpacks"
            r0.<init>(r8, r1)
            e9.i.a(r0)
            java.lang.String r8 = "blocking.intent"
            android.os.Parcelable r0 = r10.getParcelable(r8)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            java.lang.String r0 = "nonblocking.intent"
            android.os.Parcelable r1 = r10.getParcelable(r0)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            java.lang.String r1 = "blocking.destructive.intent"
            android.os.Parcelable r3 = r10.getParcelable(r1)
            android.app.PendingIntent r3 = (android.app.PendingIntent) r3
            java.lang.String r3 = "nonblocking.destructive.intent"
            android.os.Parcelable r4 = r10.getParcelable(r3)
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "update.precondition.failures:blocking.destructive.intent"
            java.util.ArrayList r5 = r10.getIntegerArrayList(r5)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            if (r5 == 0) goto L_0x0131
            r6.addAll(r5)
        L_0x0131:
            r4.put(r1, r6)
            java.lang.String r1 = "update.precondition.failures:nonblocking.destructive.intent"
            java.util.ArrayList r1 = r10.getIntegerArrayList(r1)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            if (r1 == 0) goto L_0x0144
            r5.addAll(r1)
        L_0x0144:
            r4.put(r3, r5)
            java.lang.String r1 = "update.precondition.failures:blocking.intent"
            java.util.ArrayList r1 = r10.getIntegerArrayList(r1)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            if (r1 == 0) goto L_0x0157
            r3.addAll(r1)
        L_0x0157:
            r4.put(r8, r3)
            java.lang.String r8 = "update.precondition.failures:nonblocking.intent"
            java.util.ArrayList r8 = r10.getIntegerArrayList(r8)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            if (r8 == 0) goto L_0x016a
            r10.addAll(r8)
        L_0x016a:
            r4.put(r0, r10)
            e9.a r8 = new e9.a
            r8.<init>(r9, r2, r4)
            r11.trySetResult(r8)
        L_0x0175:
            r8 = 1
            return r8
        L_0x0177:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0177 }
            throw r8
        L_0x017a:
            android.os.BadParcelableException r9 = new android.os.BadParcelableException
            java.lang.String r10 = "Parcel data not fully consumed, unread size: "
            java.lang.String r8 = androidx.fragment.app.q.a(r10, r8)
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.h.M(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
