package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f534a;

    /* renamed from: b  reason: collision with root package name */
    public final int f535b;

    /* renamed from: c  reason: collision with root package name */
    public final int f536c;

    /* renamed from: d  reason: collision with root package name */
    public final int f537d;

    /* renamed from: e  reason: collision with root package name */
    public final int f538e;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final Object[] newArray(int i8) {
            return new ParcelableVolumeInfo[i8];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f534a = parcel.readInt();
        this.f536c = parcel.readInt();
        this.f537d = parcel.readInt();
        this.f538e = parcel.readInt();
        this.f535b = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f534a);
        parcel.writeInt(this.f536c);
        parcel.writeInt(this.f537d);
        parcel.writeInt(this.f538e);
        parcel.writeInt(this.f535b);
    }
}
