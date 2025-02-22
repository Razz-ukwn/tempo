package n7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v6.a;

@Deprecated
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    public final int f11605a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11606b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11607c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11608d;

    public e(int i8, int i10, long j10, long j11) {
        this.f11605a = i8;
        this.f11606b = i10;
        this.f11607c = j10;
        this.f11608d = j11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (n7.e) r7;
        r0 = r7.f11605a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof n7.e
            r1 = 0
            if (r0 == 0) goto L_0x0025
            n7.e r7 = (n7.e) r7
            int r0 = r7.f11605a
            int r2 = r6.f11605a
            if (r2 != r0) goto L_0x0025
            int r0 = r6.f11606b
            int r2 = r7.f11606b
            if (r0 != r2) goto L_0x0025
            long r2 = r6.f11607c
            long r4 = r7.f11607c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            long r2 = r6.f11608d
            long r4 = r7.f11608d
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0025
            r7 = 1
            return r7
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11606b), Integer.valueOf(this.f11605a), Long.valueOf(this.f11608d), Long.valueOf(this.f11607c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f11605a + " Cell status: " + this.f11606b + " elapsed time NS: " + this.f11608d + " system time ms: " + this.f11607c;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, this.f11605a);
        m.j(parcel, 2, this.f11606b);
        m.k(parcel, 3, this.f11607c);
        m.k(parcel, 4, this.f11608d);
        m.E(parcel, s10);
    }
}
