package k7;

import android.os.Parcelable;

public final class v implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r18
            int r1 = v6.b.o(r18)
            r2 = 0
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = r2
            r8 = r7
            r11 = r8
            r14 = r11
            r9 = r3
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r4
        L_0x0016:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L_0x0062
            int r2 = r18.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x0058
            r4 = 5
            if (r3 == r4) goto L_0x0051
            switch(r3) {
                case 8: goto L_0x004c;
                case 9: goto L_0x0047;
                case 10: goto L_0x0042;
                case 11: goto L_0x003d;
                case 12: goto L_0x0038;
                case 13: goto L_0x0033;
                case 14: goto L_0x002e;
                default: goto L_0x002a;
            }
        L_0x002a:
            v6.b.n(r0, r2)
            goto L_0x0016
        L_0x002e:
            long r15 = v6.b.k(r0, r2)
            goto L_0x0016
        L_0x0033:
            java.lang.String r14 = v6.b.c(r0, r2)
            goto L_0x0016
        L_0x0038:
            boolean r13 = v6.b.h(r0, r2)
            goto L_0x0016
        L_0x003d:
            boolean r12 = v6.b.h(r0, r2)
            goto L_0x0016
        L_0x0042:
            java.lang.String r11 = v6.b.c(r0, r2)
            goto L_0x0016
        L_0x0047:
            boolean r10 = v6.b.h(r0, r2)
            goto L_0x0016
        L_0x004c:
            boolean r9 = v6.b.h(r0, r2)
            goto L_0x0016
        L_0x0051:
            android.os.Parcelable$Creator<u6.c> r3 = u6.c.CREATOR
            java.util.ArrayList r8 = v6.b.f(r0, r2, r3)
            goto L_0x0016
        L_0x0058:
            android.os.Parcelable$Creator<com.google.android.gms.location.LocationRequest> r3 = com.google.android.gms.location.LocationRequest.CREATOR
            android.os.Parcelable r2 = v6.b.b(r0, r2, r3)
            r7 = r2
            com.google.android.gms.location.LocationRequest r7 = (com.google.android.gms.location.LocationRequest) r7
            goto L_0x0016
        L_0x0062:
            v6.b.g(r0, r1)
            k7.u r0 = new k7.u
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.v.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new u[i8];
    }
}
