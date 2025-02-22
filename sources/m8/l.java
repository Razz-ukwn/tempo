package m8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public final class l extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    public class a implements Parcelable.ClassLoaderCreator<l> {
        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new l(parcel, classLoader);
        }

        public final Object[] newArray(int i8) {
            return new l[i8];
        }

        public final Object createFromParcel(Parcel parcel) {
            return new l(parcel, (ClassLoader) null);
        }
    }

    public l() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = keyAt(i10);
            parcelableArr[i10] = (Parcelable) valueAt(i10);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i8);
    }

    public l(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i8 = 0; i8 < readInt; i8++) {
            put(iArr[i8], readParcelableArray[i8]);
        }
    }
}
