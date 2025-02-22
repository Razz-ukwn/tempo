package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import sf.j;

@SuppressLint({"BanParcelableUsage"})
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final IntentSender f629a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f630b;

    /* renamed from: c  reason: collision with root package name */
    public final int f631c;

    /* renamed from: d  reason: collision with root package name */
    public final int f632d;

    public static final class a implements Parcelable.Creator<i> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "inParcel");
            Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            j.c(readParcelable);
            return new i((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i8) {
            return new i[i8];
        }
    }

    public i(IntentSender intentSender, Intent intent, int i8, int i10) {
        j.f(intentSender, "intentSender");
        this.f629a = intentSender;
        this.f630b = intent;
        this.f631c = i8;
        this.f632d = i10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "dest");
        parcel.writeParcelable(this.f629a, i8);
        parcel.writeParcelable(this.f630b, i8);
        parcel.writeInt(this.f631c);
        parcel.writeInt(this.f632d);
    }
}
