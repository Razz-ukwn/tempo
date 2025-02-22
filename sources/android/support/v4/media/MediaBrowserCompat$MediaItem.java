package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f520a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaDescriptionCompat f521b;

    public static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public final Object createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public final Object[] newArray(int i8) {
            return new MediaBrowserCompat$MediaItem[i8];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f520a = parcel.readInt();
        this.f521b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f520a + ", mDescription=" + this.f521b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f520a);
        this.f521b.writeToParcel(parcel, i8);
    }
}
