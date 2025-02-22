package k2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final C0187a f10266b = new C0187a();

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f10267a;

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    public class C0187a extends a {
    }

    public a() {
        this.f10267a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f10267a, i8);
    }

    public class b implements Parcelable.ClassLoaderCreator<a> {
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return a.f10266b;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }

        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f10266b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f10267a = parcelable == f10266b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f10267a = readParcelable == null ? f10266b : readParcelable;
    }
}
