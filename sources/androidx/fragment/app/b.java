package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.q0;
import androidx.lifecycle.j;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final String B;
    public final int C;
    public final int D;
    public final CharSequence E;
    public final int F;
    public final CharSequence G;
    public final ArrayList<String> H;
    public final ArrayList<String> I;
    public final boolean J;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f1904a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f1905b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f1906c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1907d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1908e;

    public class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i8) {
            return new b[i8];
        }
    }

    public b(a aVar) {
        int size = aVar.f2106a.size();
        this.f1904a = new int[(size * 6)];
        if (aVar.f2112g) {
            this.f1905b = new ArrayList<>(size);
            this.f1906c = new int[size];
            this.f1907d = new int[size];
            int i8 = 0;
            int i10 = 0;
            while (i8 < size) {
                q0.a aVar2 = aVar.f2106a.get(i8);
                int i11 = i10 + 1;
                this.f1904a[i10] = aVar2.f2121a;
                ArrayList<String> arrayList = this.f1905b;
                p pVar = aVar2.f2122b;
                arrayList.add(pVar != null ? pVar.B : null);
                int[] iArr = this.f1904a;
                int i12 = i11 + 1;
                iArr[i11] = aVar2.f2123c;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f2124d;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f2125e;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f2126f;
                iArr[i15] = aVar2.f2127g;
                this.f1906c[i8] = aVar2.f2128h.ordinal();
                this.f1907d[i8] = aVar2.f2129i.ordinal();
                i8++;
                i10 = i15 + 1;
            }
            this.f1908e = aVar.f2111f;
            this.B = aVar.f2114i;
            this.C = aVar.f1899s;
            this.D = aVar.f2115j;
            this.E = aVar.f2116k;
            this.F = aVar.f2117l;
            this.G = aVar.m;
            this.H = aVar.f2118n;
            this.I = aVar.f2119o;
            this.J = aVar.f2120p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(a aVar) {
        int i8 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f1904a;
            boolean z10 = true;
            if (i8 < iArr.length) {
                q0.a aVar2 = new q0.a();
                int i11 = i8 + 1;
                aVar2.f2121a = iArr[i8];
                if (i0.J(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i10 + " base fragment #" + iArr[i11]);
                }
                aVar2.f2128h = j.b.values()[this.f1906c[i10]];
                aVar2.f2129i = j.b.values()[this.f1907d[i10]];
                int i12 = i11 + 1;
                if (iArr[i11] == 0) {
                    z10 = false;
                }
                aVar2.f2123c = z10;
                int i13 = i12 + 1;
                int i14 = iArr[i12];
                aVar2.f2124d = i14;
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                aVar2.f2125e = i16;
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                aVar2.f2126f = i18;
                int i19 = iArr[i17];
                aVar2.f2127g = i19;
                aVar.f2107b = i14;
                aVar.f2108c = i16;
                aVar.f2109d = i18;
                aVar.f2110e = i19;
                aVar.b(aVar2);
                i10++;
                i8 = i17 + 1;
            } else {
                aVar.f2111f = this.f1908e;
                aVar.f2114i = this.B;
                aVar.f2112g = true;
                aVar.f2115j = this.D;
                aVar.f2116k = this.E;
                aVar.f2117l = this.F;
                aVar.m = this.G;
                aVar.f2118n = this.H;
                aVar.f2119o = this.I;
                aVar.f2120p = this.J;
                return;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeIntArray(this.f1904a);
        parcel.writeStringList(this.f1905b);
        parcel.writeIntArray(this.f1906c);
        parcel.writeIntArray(this.f1907d);
        parcel.writeInt(this.f1908e);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        TextUtils.writeToParcel(this.E, parcel, 0);
        parcel.writeInt(this.F);
        TextUtils.writeToParcel(this.G, parcel, 0);
        parcel.writeStringList(this.H);
        parcel.writeStringList(this.I);
        parcel.writeInt(this.J ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f1904a = parcel.createIntArray();
        this.f1905b = parcel.createStringArrayList();
        this.f1906c = parcel.createIntArray();
        this.f1907d = parcel.createIntArray();
        this.f1908e = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.F = parcel.readInt();
        this.G = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.H = parcel.createStringArrayList();
        this.I = parcel.createStringArrayList();
        this.J = parcel.readInt() != 0;
    }
}
