package com.google.android.gms.common.api;

import android.os.Parcelable;

public final class m implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = v6.b.o(r10)
            r1 = 0
            r2 = 0
            r6 = r1
            r7 = r6
            r8 = r7
            r4 = r2
            r5 = r4
        L_0x000b:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x004d
            int r1 = r10.readInt()
            char r2 = (char) r1
            r3 = 1
            if (r2 == r3) goto L_0x0048
            r3 = 2
            if (r2 == r3) goto L_0x0043
            r3 = 3
            if (r2 == r3) goto L_0x0039
            r3 = 4
            if (r2 == r3) goto L_0x002f
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L_0x002a
            v6.b.n(r10, r1)
            goto L_0x000b
        L_0x002a:
            int r4 = v6.b.j(r10, r1)
            goto L_0x000b
        L_0x002f:
            android.os.Parcelable$Creator<t6.b> r2 = t6.b.CREATOR
            android.os.Parcelable r1 = v6.b.b(r10, r1, r2)
            r8 = r1
            t6.b r8 = (t6.b) r8
            goto L_0x000b
        L_0x0039:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = v6.b.b(r10, r1, r2)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            goto L_0x000b
        L_0x0043:
            java.lang.String r6 = v6.b.c(r10, r1)
            goto L_0x000b
        L_0x0048:
            int r5 = v6.b.j(r10, r1)
            goto L_0x000b
        L_0x004d:
            v6.b.g(r10, r0)
            com.google.android.gms.common.api.Status r10 = new com.google.android.gms.common.api.Status
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.m.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new Status[i8];
    }
}
