package ic;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0178a();

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f9650a;

    /* renamed from: ic.a$a  reason: collision with other inner class name */
    public static class C0178a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(Bitmap bitmap) {
        this.f9650a = bitmap;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f9650a.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        parcel.writeByteArray(byteArrayOutputStream.toByteArray());
    }

    public a(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        this.f9650a = BitmapFactory.decodeByteArray(createByteArray, 0, createByteArray.length);
    }
}
