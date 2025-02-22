package n7;

import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

public final class o implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            int r0 = v6.b.o(r14)
            r1 = 1000(0x3e8, float:1.401E-42)
            r2 = 1
            r3 = 0
            r5 = 0
            r7 = r1
            r8 = r2
            r9 = r8
            r10 = r3
            r12 = r5
        L_0x000f:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x0043
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x003e;
                case 2: goto L_0x0039;
                case 3: goto L_0x0034;
                case 4: goto L_0x002f;
                case 5: goto L_0x0025;
                case 6: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            v6.b.n(r14, r1)
            goto L_0x000f
        L_0x0021:
            v6.b.h(r14, r1)
            goto L_0x000f
        L_0x0025:
            android.os.Parcelable$Creator<n7.e> r2 = n7.e.CREATOR
            java.lang.Object[] r1 = v6.b.e(r14, r1, r2)
            r12 = r1
            n7.e[] r12 = (n7.e[]) r12
            goto L_0x000f
        L_0x002f:
            int r7 = v6.b.j(r14, r1)
            goto L_0x000f
        L_0x0034:
            long r10 = v6.b.k(r14, r1)
            goto L_0x000f
        L_0x0039:
            int r9 = v6.b.j(r14, r1)
            goto L_0x000f
        L_0x003e:
            int r8 = v6.b.j(r14, r1)
            goto L_0x000f
        L_0x0043:
            v6.b.g(r14, r0)
            com.google.android.gms.location.LocationAvailability r14 = new com.google.android.gms.location.LocationAvailability
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.o.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new LocationAvailability[i8];
    }
}
