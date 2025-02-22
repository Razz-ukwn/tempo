package u6;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;

public final class d1 implements Parcelable.Creator {
    public static void a(f fVar, Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, fVar.f15793a);
        m.j(parcel, 2, fVar.f15794b);
        m.j(parcel, 3, fVar.f15795c);
        m.n(parcel, 4, fVar.f15796d);
        m.i(parcel, 5, fVar.f15797e);
        m.p(parcel, 6, fVar.B, i8);
        m.h(parcel, 7, fVar.C);
        m.m(parcel, 8, fVar.D, i8);
        m.p(parcel, 10, fVar.E, i8);
        m.p(parcel, 11, fVar.F, i8);
        m.g(parcel, 12, fVar.G);
        m.j(parcel, 13, fVar.H);
        m.g(parcel, 14, fVar.I);
        m.n(parcel, 15, fVar.J);
        m.E(parcel, s10);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = v6.b.o(r23)
            com.google.android.gms.common.api.Scope[] r2 = u6.f.K
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            t6.d[] r4 = u6.f.L
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L_0x0025:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x0093
            int r2 = r23.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x008e;
                case 2: goto L_0x0089;
                case 3: goto L_0x0084;
                case 4: goto L_0x007f;
                case 5: goto L_0x007a;
                case 6: goto L_0x0070;
                case 7: goto L_0x006b;
                case 8: goto L_0x0061;
                case 9: goto L_0x0033;
                case 10: goto L_0x0056;
                case 11: goto L_0x004b;
                case 12: goto L_0x0046;
                case 13: goto L_0x0041;
                case 14: goto L_0x003c;
                case 15: goto L_0x0037;
                default: goto L_0x0033;
            }
        L_0x0033:
            v6.b.n(r0, r2)
            goto L_0x0025
        L_0x0037:
            java.lang.String r21 = v6.b.c(r0, r2)
            goto L_0x0025
        L_0x003c:
            boolean r20 = v6.b.h(r0, r2)
            goto L_0x0025
        L_0x0041:
            int r19 = v6.b.j(r0, r2)
            goto L_0x0025
        L_0x0046:
            boolean r18 = v6.b.h(r0, r2)
            goto L_0x0025
        L_0x004b:
            android.os.Parcelable$Creator<t6.d> r3 = t6.d.CREATOR
            java.lang.Object[] r2 = v6.b.e(r0, r2, r3)
            r17 = r2
            t6.d[] r17 = (t6.d[]) r17
            goto L_0x0025
        L_0x0056:
            android.os.Parcelable$Creator<t6.d> r3 = t6.d.CREATOR
            java.lang.Object[] r2 = v6.b.e(r0, r2, r3)
            r16 = r2
            t6.d[] r16 = (t6.d[]) r16
            goto L_0x0025
        L_0x0061:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = v6.b.b(r0, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x0025
        L_0x006b:
            android.os.Bundle r14 = v6.b.a(r0, r2)
            goto L_0x0025
        L_0x0070:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = v6.b.e(r0, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x0025
        L_0x007a:
            android.os.IBinder r12 = v6.b.i(r0, r2)
            goto L_0x0025
        L_0x007f:
            java.lang.String r11 = v6.b.c(r0, r2)
            goto L_0x0025
        L_0x0084:
            int r10 = v6.b.j(r0, r2)
            goto L_0x0025
        L_0x0089:
            int r9 = v6.b.j(r0, r2)
            goto L_0x0025
        L_0x008e:
            int r8 = v6.b.j(r0, r2)
            goto L_0x0025
        L_0x0093:
            v6.b.g(r0, r1)
            u6.f r0 = new u6.f
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.d1.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new f[i8];
    }
}
