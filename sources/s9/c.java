package s9;

import android.os.Parcelable;

public final class c implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v13, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v15, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v17, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r18
            int r1 = v6.b.o(r18)
            r3 = 0
            r14 = r3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
        L_0x0014:
            int r4 = r18.dataPosition()
            if (r4 >= r1) goto L_0x0094
            int r4 = r18.readInt()
            char r2 = (char) r4
            switch(r2) {
                case 1: goto L_0x008a;
                case 2: goto L_0x0080;
                case 3: goto L_0x007b;
                case 4: goto L_0x0076;
                case 5: goto L_0x006f;
                case 6: goto L_0x006a;
                case 7: goto L_0x0065;
                case 8: goto L_0x004a;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x0031;
                case 12: goto L_0x0026;
                default: goto L_0x0022;
            }
        L_0x0022:
            v6.b.n(r0, r4)
            goto L_0x0014
        L_0x0026:
            android.os.Parcelable$Creator<s9.p> r2 = s9.p.CREATOR
            android.os.Parcelable r2 = v6.b.b(r0, r4, r2)
            r16 = r2
            s9.p r16 = (s9.p) r16
            goto L_0x0014
        L_0x0031:
            android.os.Parcelable$Creator<r9.g0> r2 = r9.g0.CREATOR
            android.os.Parcelable r2 = v6.b.b(r0, r4, r2)
            r15 = r2
            r9.g0 r15 = (r9.g0) r15
            goto L_0x0014
        L_0x003b:
            boolean r14 = v6.b.h(r0, r4)
            goto L_0x0014
        L_0x0040:
            android.os.Parcelable$Creator<s9.d> r2 = s9.d.CREATOR
            android.os.Parcelable r2 = v6.b.b(r0, r4, r2)
            r13 = r2
            s9.d r13 = (s9.d) r13
            goto L_0x0014
        L_0x004a:
            int r2 = v6.b.m(r0, r4)
            if (r2 != 0) goto L_0x0052
            r12 = 0
            goto L_0x0014
        L_0x0052:
            r4 = 4
            v6.b.p(r0, r2, r4)
            int r2 = r18.readInt()
            if (r2 == 0) goto L_0x005e
            r2 = 1
            goto L_0x005f
        L_0x005e:
            r2 = r3
        L_0x005f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r12 = r2
            goto L_0x0014
        L_0x0065:
            java.lang.String r11 = v6.b.c(r0, r4)
            goto L_0x0014
        L_0x006a:
            java.util.ArrayList r10 = v6.b.d(r0, r4)
            goto L_0x0014
        L_0x006f:
            android.os.Parcelable$Creator<s9.m0> r2 = s9.m0.CREATOR
            java.util.ArrayList r9 = v6.b.f(r0, r4, r2)
            goto L_0x0014
        L_0x0076:
            java.lang.String r8 = v6.b.c(r0, r4)
            goto L_0x0014
        L_0x007b:
            java.lang.String r7 = v6.b.c(r0, r4)
            goto L_0x0014
        L_0x0080:
            android.os.Parcelable$Creator<s9.m0> r2 = s9.m0.CREATOR
            android.os.Parcelable r2 = v6.b.b(r0, r4, r2)
            r6 = r2
            s9.m0 r6 = (s9.m0) r6
            goto L_0x0014
        L_0x008a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.m0> r2 = com.google.android.gms.internal.p000firebaseauthapi.m0.CREATOR
            android.os.Parcelable r2 = v6.b.b(r0, r4, r2)
            r5 = r2
            com.google.android.gms.internal.firebase-auth-api.m0 r5 = (com.google.android.gms.internal.p000firebaseauthapi.m0) r5
            goto L_0x0014
        L_0x0094:
            v6.b.g(r0, r1)
            s9.p0 r0 = new s9.p0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.c.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new p0[i8];
    }
}
