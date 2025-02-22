package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final MediaDescriptionCompat f530a;

        /* renamed from: b  reason: collision with root package name */
        public final long f531b;

        public static class a implements Parcelable.Creator<QueueItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final Object[] newArray(int i8) {
                return new QueueItem[i8];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f530a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f531b = parcel.readLong();
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.f530a + ", Id=" + this.f531b + " }";
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            this.f530a.writeToParcel(parcel, i8);
            parcel.writeLong(this.f531b);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final ResultReceiver f532a;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public final Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final Object[] newArray(int i8) {
                return new ResultReceiverWrapper[i8];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f532a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            this.f532a.writeToParcel(parcel, i8);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Object f533a;

        public static class a implements Parcelable.Creator<Token> {
            public final Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public final Object[] newArray(int i8) {
                return new Token[i8];
            }
        }

        public Token(Parcelable parcelable) {
            this.f533a = parcelable;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f533a;
            if (obj2 == null) {
                return token.f533a == null;
            }
            Object obj3 = token.f533a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.f533a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable((Parcelable) this.f533a, i8);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
