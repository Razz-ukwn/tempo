package u6;

import android.os.Parcelable;

public final class c1 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = v6.b.o(r11)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r9 = r7
            r5 = r2
            r6 = r5
            r8 = r6
        L_0x000c:
            int r2 = r11.dataPosition()
            if (r2 >= r0) goto L_0x0061
            int r2 = r11.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0057;
                case 2: goto L_0x0052;
                case 3: goto L_0x004d;
                case 4: goto L_0x0038;
                case 5: goto L_0x0033;
                case 6: goto L_0x001e;
                default: goto L_0x001a;
            }
        L_0x001a:
            v6.b.n(r11, r2)
            goto L_0x000c
        L_0x001e:
            int r2 = v6.b.m(r11, r2)
            int r3 = r11.dataPosition()
            if (r2 != 0) goto L_0x002a
            r9 = r1
            goto L_0x000c
        L_0x002a:
            int[] r9 = r11.createIntArray()
            int r3 = r3 + r2
            r11.setDataPosition(r3)
            goto L_0x000c
        L_0x0033:
            int r8 = v6.b.j(r11, r2)
            goto L_0x000c
        L_0x0038:
            int r2 = v6.b.m(r11, r2)
            int r3 = r11.dataPosition()
            if (r2 != 0) goto L_0x0044
            r7 = r1
            goto L_0x000c
        L_0x0044:
            int[] r7 = r11.createIntArray()
            int r3 = r3 + r2
            r11.setDataPosition(r3)
            goto L_0x000c
        L_0x004d:
            boolean r6 = v6.b.h(r11, r2)
            goto L_0x000c
        L_0x0052:
            boolean r5 = v6.b.h(r11, r2)
            goto L_0x000c
        L_0x0057:
            android.os.Parcelable$Creator<u6.s> r3 = u6.s.CREATOR
            android.os.Parcelable r2 = v6.b.b(r11, r2, r3)
            r4 = r2
            u6.s r4 = (u6.s) r4
            goto L_0x000c
        L_0x0061:
            v6.b.g(r11, r0)
            u6.e r11 = new u6.e
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.c1.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new e[i8];
    }
}
