package nb;

import android.os.Parcel;
import android.os.Parcelable;
import h0.e;
import sf.j;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public long B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public final long f11618a;

    /* renamed from: b  reason: collision with root package name */
    public String f11619b;

    /* renamed from: c  reason: collision with root package name */
    public String f11620c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11621d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11622e;

    public static final class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new b(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i8) {
            return new b[i8];
        }
    }

    public b() {
        this(0, (String) null, (String) null, 0, (String) null, 0, false, 127);
    }

    public b(long j10, String str, String str2, long j11, String str3, long j12, boolean z10) {
        this.f11618a = j10;
        this.f11619b = str;
        this.f11620c = str2;
        this.f11621d = j11;
        this.f11622e = str3;
        this.B = j12;
        this.C = z10;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11618a == bVar.f11618a && j.a(this.f11619b, bVar.f11619b) && j.a(this.f11620c, bVar.f11620c) && this.f11621d == bVar.f11621d && j.a(this.f11622e, bVar.f11622e) && this.B == bVar.B && this.C == bVar.C;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f11618a) * 31;
        String str = this.f11619b;
        int i8 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11620c;
        int a10 = e.a(this.f11621d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f11622e;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        int a11 = e.a(this.B, (a10 + i8) * 31, 31);
        boolean z10 = this.C;
        if (z10) {
            z10 = true;
        }
        return a11 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "MiMedia(id=" + this.f11618a + ", name=" + this.f11619b + ", path=" + this.f11620c + ", duration=" + this.f11621d + ", thumb=" + this.f11622e + ", fileSize=" + this.B + ", doesUri=" + this.C + ')';
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeLong(this.f11618a);
        parcel.writeString(this.f11619b);
        parcel.writeString(this.f11620c);
        parcel.writeLong(this.f11621d);
        parcel.writeString(this.f11622e);
        parcel.writeLong(this.B);
        parcel.writeInt(this.C ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(long r11, java.lang.String r13, java.lang.String r14, long r15, java.lang.String r17, long r18, boolean r20, int r21) {
        /*
            r10 = this;
            r0 = r21 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r11
        L_0x0009:
            r0 = r21 & 2
            r5 = 0
            if (r0 == 0) goto L_0x0010
            r0 = r5
            goto L_0x0011
        L_0x0010:
            r0 = r13
        L_0x0011:
            r6 = r21 & 4
            if (r6 == 0) goto L_0x0017
            r6 = r5
            goto L_0x0018
        L_0x0017:
            r6 = r14
        L_0x0018:
            r7 = r21 & 8
            if (r7 == 0) goto L_0x001e
            r7 = r1
            goto L_0x001f
        L_0x001e:
            r7 = r15
        L_0x001f:
            r9 = r21 & 16
            if (r9 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r5 = r17
        L_0x0026:
            r9 = r21 & 32
            if (r9 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r1 = r18
        L_0x002d:
            r9 = r21 & 64
            if (r9 == 0) goto L_0x0033
            r9 = 0
            goto L_0x0035
        L_0x0033:
            r9 = r20
        L_0x0035:
            r11 = r10
            r12 = r3
            r14 = r0
            r15 = r6
            r16 = r7
            r18 = r5
            r19 = r1
            r21 = r9
            r11.<init>(r12, r14, r15, r16, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.b.<init>(long, java.lang.String, java.lang.String, long, java.lang.String, long, boolean, int):void");
    }
}
