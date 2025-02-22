package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0010a();

    /* renamed from: a  reason: collision with root package name */
    public final int f609a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f610b;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    public class C0010a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(Intent intent, int i8) {
        this.f609a = i8;
        this.f610b = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i8 = this.f609a;
        sb2.append(i8 != -1 ? i8 != 0 ? String.valueOf(i8) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f610b);
        sb2.append('}');
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f609a);
        Intent intent = this.f610b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i8);
        }
    }

    public a(Parcel parcel) {
        this.f609a = parcel.readInt();
        this.f610b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
