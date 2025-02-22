package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final int B;
    public final CharSequence C;
    public final long D;
    public final ArrayList E;
    public final long F;
    public final Bundle G;

    /* renamed from: a  reason: collision with root package name */
    public final int f539a;

    /* renamed from: b  reason: collision with root package name */
    public final long f540b;

    /* renamed from: c  reason: collision with root package name */
    public final long f541c;

    /* renamed from: d  reason: collision with root package name */
    public final float f542d;

    /* renamed from: e  reason: collision with root package name */
    public final long f543e;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f544a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f545b;

        /* renamed from: c  reason: collision with root package name */
        public final int f546c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f547d;

        public static class a implements Parcelable.Creator<CustomAction> {
            public final Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final Object[] newArray(int i8) {
                return new CustomAction[i8];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f544a = parcel.readString();
            this.f545b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f546c = parcel.readInt();
            this.f547d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f545b + ", mIcon=" + this.f546c + ", mExtras=" + this.f547d;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f544a);
            TextUtils.writeToParcel(this.f545b, parcel, i8);
            parcel.writeInt(this.f546c);
            parcel.writeBundle(this.f547d);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final Object[] newArray(int i8) {
            return new PlaybackStateCompat[i8];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f539a = parcel.readInt();
        this.f540b = parcel.readLong();
        this.f542d = parcel.readFloat();
        this.D = parcel.readLong();
        this.f541c = parcel.readLong();
        this.f543e = parcel.readLong();
        this.C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.E = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.F = parcel.readLong();
        this.G = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.B = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f539a + ", position=" + this.f540b + ", buffered position=" + this.f541c + ", speed=" + this.f542d + ", updated=" + this.D + ", actions=" + this.f543e + ", error code=" + this.B + ", error message=" + this.C + ", custom actions=" + this.E + ", active item id=" + this.F + "}";
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f539a);
        parcel.writeLong(this.f540b);
        parcel.writeFloat(this.f542d);
        parcel.writeLong(this.D);
        parcel.writeLong(this.f541c);
        parcel.writeLong(this.f543e);
        TextUtils.writeToParcel(this.C, parcel, i8);
        parcel.writeTypedList(this.E);
        parcel.writeLong(this.F);
        parcel.writeBundle(this.G);
        parcel.writeInt(this.B);
    }
}
