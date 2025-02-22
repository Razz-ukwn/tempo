package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o.f;

public final class a extends k2.a {
    public static final Parcelable.Creator<a> CREATOR = new C0322a();

    /* renamed from: c  reason: collision with root package name */
    public final f<String, Bundle> f17319c;

    /* renamed from: y8.a$a  reason: collision with other inner class name */
    public class C0322a implements Parcelable.ClassLoaderCreator<a> {
        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }

        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null);
        }
    }

    public a() {
        throw null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f17319c = new f<>(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f17319c.put(strArr[i8], bundleArr[i8]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f17319c + "}";
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f10267a, i8);
        f<String, Bundle> fVar = this.f17319c;
        int i10 = fVar.f12032c;
        parcel.writeInt(i10);
        String[] strArr = new String[i10];
        Bundle[] bundleArr = new Bundle[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = fVar.i(i11);
            bundleArr[i11] = fVar.m(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
