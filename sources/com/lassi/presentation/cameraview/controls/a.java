package com.lassi.presentation.cameraview.controls;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import sf.j;

public final class a implements Comparable<a>, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<String, a> f6449c = new HashMap<>(16);

    /* renamed from: a  reason: collision with root package name */
    public final int f6450a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6451b;

    /* renamed from: com.lassi.presentation.cameraview.controls.a$a  reason: collision with other inner class name */
    public static final class C0082a {
        public static a a(int i8, int i10) {
            int i11 = i8;
            int i12 = i10;
            while (i12 != 0) {
                int i13 = i11 % i12;
                i11 = i12;
                i12 = i13;
            }
            int i14 = i8 / i11;
            int i15 = i10 / i11;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14);
            sb2.append(':');
            sb2.append(i15);
            String sb3 = sb2.toString();
            HashMap<String, a> hashMap = a.f6449c;
            a aVar = hashMap.get(sb3);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a(i14, i15);
            hashMap.put(sb3, aVar2);
            return aVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.lassi.presentation.cameraview.controls.a b(java.lang.String r4) {
            /*
                java.lang.String r0 = "string"
                sf.j.f(r4, r0)
                zf.c r0 = new zf.c
                java.lang.String r1 = ":"
                r0.<init>(r1)
                java.util.List r4 = r0.a(r4)
                boolean r0 = r4.isEmpty()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x0043
                int r0 = r4.size()
                java.util.ListIterator r0 = r4.listIterator(r0)
            L_0x0020:
                boolean r3 = r0.hasPrevious()
                if (r3 == 0) goto L_0x0043
                java.lang.Object r3 = r0.previous()
                java.lang.String r3 = (java.lang.String) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0034
                r3 = r2
                goto L_0x0035
            L_0x0034:
                r3 = r1
            L_0x0035:
                if (r3 != 0) goto L_0x0020
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                int r0 = r0.nextIndex()
                int r0 = r0 + r2
                java.util.List r4 = gf.q.K0(r4, r0)
                goto L_0x0045
            L_0x0043:
                gf.s r4 = gf.s.f8978a
            L_0x0045:
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r4 = r4.toArray(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                sf.j.d(r4, r0)
                java.lang.String[] r4 = (java.lang.String[]) r4
                int r0 = r4.length
                r3 = 2
                if (r0 != r3) goto L_0x007b
                r0 = r4[r1]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4 = r4[r2]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.String r1 = "x"
                sf.j.e(r0, r1)
                int r0 = r0.intValue()
                java.lang.String r1 = "y"
                sf.j.e(r4, r1)
                int r4 = r4.intValue()
                com.lassi.presentation.cameraview.controls.a r4 = a(r0, r4)
                return r4
            L_0x007b:
                java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
                java.lang.String r0 = "Illegal AspectRatio string. Must be x:y"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cameraview.controls.a.C0082a.b(java.lang.String):com.lassi.presentation.cameraview.controls.a");
        }
    }

    public static final class b implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new a(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(int i8, int i10) {
        this.f6450a = i8;
        this.f6451b = i10;
    }

    public final float a() {
        return ((float) this.f6450a) / ((float) this.f6451b);
    }

    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        j.f(aVar, "another");
        if (equals(aVar)) {
            return 0;
        }
        return a() - aVar.a() > 0.0f ? 1 : -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6450a == aVar.f6450a && this.f6451b == aVar.f6451b;
    }

    public final int hashCode() {
        int i8 = this.f6450a;
        return ((i8 >>> 16) | (i8 << 16)) ^ this.f6451b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6450a);
        sb2.append(':');
        sb2.append(this.f6451b);
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeInt(this.f6450a);
        parcel.writeInt(this.f6451b);
    }
}
