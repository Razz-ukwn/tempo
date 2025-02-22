package com.quickkonnect.silencio.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import s0.b0;
import sf.j;

public final class HomeModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<HomeModel> CREATOR = new Creator();

    /* renamed from: id  reason: collision with root package name */
    private final int f6676id;
    private final String name;

    public static final class Creator implements Parcelable.Creator<HomeModel> {
        public final HomeModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new HomeModel(parcel.readInt(), parcel.readString());
        }

        public final HomeModel[] newArray(int i8) {
            return new HomeModel[i8];
        }
    }

    public HomeModel(int i8, String str) {
        j.f(str, "name");
        this.f6676id = i8;
        this.name = str;
    }

    public static /* synthetic */ HomeModel copy$default(HomeModel homeModel, int i8, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = homeModel.f6676id;
        }
        if ((i10 & 2) != 0) {
            str = homeModel.name;
        }
        return homeModel.copy(i8, str);
    }

    public final int component1() {
        return this.f6676id;
    }

    public final String component2() {
        return this.name;
    }

    public final HomeModel copy(int i8, String str) {
        j.f(str, "name");
        return new HomeModel(i8, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeModel)) {
            return false;
        }
        HomeModel homeModel = (HomeModel) obj;
        return this.f6676id == homeModel.f6676id && j.a(this.name, homeModel.name);
    }

    public final int getId() {
        return this.f6676id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.f6676id) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HomeModel(id=");
        sb2.append(this.f6676id);
        sb2.append(", name=");
        return b0.a(sb2, this.name, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeInt(this.f6676id);
        parcel.writeString(this.name);
    }
}
