package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.i0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new a();
    public final ArrayList<String> B = new ArrayList<>();
    public final ArrayList<c> C = new ArrayList<>();
    public ArrayList<i0.l> D;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<String> f2013a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f2014b;

    /* renamed from: c  reason: collision with root package name */
    public b[] f2015c;

    /* renamed from: d  reason: collision with root package name */
    public int f2016d;

    /* renamed from: e  reason: collision with root package name */
    public String f2017e = null;

    public class a implements Parcelable.Creator<k0> {
        public final Object createFromParcel(Parcel parcel) {
            return new k0(parcel);
        }

        public final Object[] newArray(int i8) {
            return new k0[i8];
        }
    }

    public k0() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeStringList(this.f2013a);
        parcel.writeStringList(this.f2014b);
        parcel.writeTypedArray(this.f2015c, i8);
        parcel.writeInt(this.f2016d);
        parcel.writeString(this.f2017e);
        parcel.writeStringList(this.B);
        parcel.writeTypedList(this.C);
        parcel.writeTypedList(this.D);
    }

    public k0(Parcel parcel) {
        this.f2013a = parcel.createStringArrayList();
        this.f2014b = parcel.createStringArrayList();
        this.f2015c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2016d = parcel.readInt();
        this.f2017e = parcel.readString();
        this.B = parcel.createStringArrayList();
        this.C = parcel.createTypedArrayList(c.CREATOR);
        this.D = parcel.createTypedArrayList(i0.l.CREATOR);
    }
}
