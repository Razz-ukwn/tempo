package k7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import v6.a;

public final class q extends a {
    public static final Parcelable.Creator<q> CREATOR = new g0();
    public final String B;
    public final q C;
    public final c0 D;

    /* renamed from: a  reason: collision with root package name */
    public final int f10378a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10379b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10380c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10381d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10382e;

    static {
        Process.myUid();
        Process.myPid();
    }

    public q(int i8, int i10, String str, String str2, String str3, int i11, List list, q qVar) {
        c0 c0Var;
        d0 d0Var;
        this.f10378a = i8;
        this.f10379b = i10;
        this.f10380c = str;
        this.f10381d = str2;
        this.B = str3;
        this.f10382e = i11;
        a0 a0Var = c0.f10356b;
        if (list instanceof z) {
            c0Var = ((z) list).d();
            if (c0Var.f()) {
                Object[] array = c0Var.toArray();
                int length = array.length;
                if (length == 0) {
                    c0Var = d0.f10358e;
                } else {
                    d0Var = new d0(length, array);
                }
            }
            this.D = c0Var;
            this.C = qVar;
        }
        Object[] array2 = list.toArray();
        int length2 = array2.length;
        int i12 = 0;
        while (i12 < length2) {
            if (array2[i12] != null) {
                i12++;
            } else {
                throw new NullPointerException(androidx.fragment.app.q.a("at index ", i12));
            }
        }
        if (length2 == 0) {
            c0Var = d0.f10358e;
            this.D = c0Var;
            this.C = qVar;
        }
        d0Var = new d0(length2, array2);
        c0Var = d0Var;
        this.D = c0Var;
        this.C = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (k7.q) r3;
        r0 = r3.f10378a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof k7.q
            if (r0 == 0) goto L_0x004c
            k7.q r3 = (k7.q) r3
            int r0 = r3.f10378a
            int r1 = r2.f10378a
            if (r1 != r0) goto L_0x004c
            int r0 = r2.f10379b
            int r1 = r3.f10379b
            if (r0 != r1) goto L_0x004c
            int r0 = r2.f10382e
            int r1 = r3.f10382e
            if (r0 != r1) goto L_0x004c
            java.lang.String r0 = r2.f10380c
            java.lang.String r1 = r3.f10380c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r2.f10381d
            java.lang.String r1 = r3.f10381d
            boolean r0 = androidx.fragment.app.z0.j(r0, r1)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r2.B
            java.lang.String r1 = r3.B
            boolean r0 = androidx.fragment.app.z0.j(r0, r1)
            if (r0 == 0) goto L_0x004c
            k7.q r0 = r2.C
            k7.q r1 = r3.C
            boolean r0 = androidx.fragment.app.z0.j(r0, r1)
            if (r0 == 0) goto L_0x004c
            k7.c0 r0 = r2.D
            k7.c0 r3 = r3.D
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x004c
            r3 = 1
            return r3
        L_0x004c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.q.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10378a), this.f10380c, this.f10381d, this.B});
    }

    public final String toString() {
        String str = this.f10380c;
        int length = str.length() + 18;
        String str2 = this.f10381d;
        if (str2 != null) {
            length += str2.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f10378a);
        sb2.append("/");
        sb2.append(str);
        if (str2 != null) {
            sb2.append("[");
            if (str2.startsWith(str)) {
                sb2.append(str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        String str3 = this.B;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f10378a);
        m.j(parcel, 2, this.f10379b);
        m.n(parcel, 3, this.f10380c);
        m.n(parcel, 4, this.f10381d);
        m.j(parcel, 5, this.f10382e);
        m.n(parcel, 6, this.B);
        m.m(parcel, 7, this.C, i8);
        m.q(parcel, 8, this.D);
        m.E(parcel, s10);
    }
}
