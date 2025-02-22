package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f1912a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f1913b;

    public class a implements Parcelable.Creator<c> {
        public final Object createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        public final Object[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f1912a = arrayList;
        this.f1913b = arrayList2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeStringList(this.f1912a);
        parcel.writeTypedList(this.f1913b);
    }

    public c(Parcel parcel) {
        this.f1912a = parcel.createStringArrayList();
        this.f1913b = parcel.createTypedArrayList(b.CREATOR);
    }
}
