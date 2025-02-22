package b3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.j;
import sf.j;

@SuppressLint({"BanParcelableUsage"})
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f3092a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3093b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f3094c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f3095d;

    public static final class a implements Parcelable.Creator<k> {
        public final Object createFromParcel(Parcel parcel) {
            j.f(parcel, "inParcel");
            return new k(parcel);
        }

        public final Object[] newArray(int i8) {
            return new k[i8];
        }
    }

    public k(j jVar) {
        j.f(jVar, "entry");
        this.f3092a = jVar.B;
        this.f3093b = jVar.f3084b.D;
        this.f3094c = jVar.f3085c;
        Bundle bundle = new Bundle();
        this.f3095d = bundle;
        jVar.E.c(bundle);
    }

    public final j a(Context context, z zVar, j.b bVar, t tVar) {
        sf.j.f(context, "context");
        sf.j.f(bVar, "hostLifecycleState");
        Bundle bundle = this.f3094c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = this.f3095d;
        String str = this.f3092a;
        sf.j.f(str, "id");
        return new j(context, zVar, bundle, bVar, tVar, str, bundle2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        sf.j.f(parcel, "parcel");
        parcel.writeString(this.f3092a);
        parcel.writeInt(this.f3093b);
        parcel.writeBundle(this.f3094c);
        parcel.writeBundle(this.f3095d);
    }

    public k(Parcel parcel) {
        sf.j.f(parcel, "inParcel");
        String readString = parcel.readString();
        sf.j.c(readString);
        this.f3092a = readString;
        this.f3093b = parcel.readInt();
        Class<k> cls = k.class;
        this.f3094c = parcel.readBundle(cls.getClassLoader());
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        sf.j.c(readBundle);
        this.f3095d = readBundle;
    }
}
