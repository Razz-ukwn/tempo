package com.quickkonnect.silencio.models.request.measure;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import sf.e;
import sf.j;

public final class StartLocation implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<StartLocation> CREATOR = new Creator();
    private final Float accuracy;
    private final List<String> coordinates;
    private final String type;

    public static final class Creator implements Parcelable.Creator<StartLocation> {
        public final StartLocation createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new StartLocation(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        public final StartLocation[] newArray(int i8) {
            return new StartLocation[i8];
        }
    }

    public StartLocation(String str, List<String> list, Float f10) {
        j.f(str, "type");
        j.f(list, "coordinates");
        this.type = str;
        this.coordinates = list;
        this.accuracy = f10;
    }

    public static /* synthetic */ StartLocation copy$default(StartLocation startLocation, String str, List<String> list, Float f10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = startLocation.type;
        }
        if ((i8 & 2) != 0) {
            list = startLocation.coordinates;
        }
        if ((i8 & 4) != 0) {
            f10 = startLocation.accuracy;
        }
        return startLocation.copy(str, list, f10);
    }

    public final String component1() {
        return this.type;
    }

    public final List<String> component2() {
        return this.coordinates;
    }

    public final Float component3() {
        return this.accuracy;
    }

    public final StartLocation copy(String str, List<String> list, Float f10) {
        j.f(str, "type");
        j.f(list, "coordinates");
        return new StartLocation(str, list, f10);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartLocation)) {
            return false;
        }
        StartLocation startLocation = (StartLocation) obj;
        return j.a(this.type, startLocation.type) && j.a(this.coordinates, startLocation.coordinates) && j.a(this.accuracy, startLocation.accuracy);
    }

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final List<String> getCoordinates() {
        return this.coordinates;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.coordinates.hashCode() + (this.type.hashCode() * 31)) * 31;
        Float f10 = this.accuracy;
        return hashCode + (f10 == null ? 0 : f10.hashCode());
    }

    public String toString() {
        return "StartLocation(type=" + this.type + ", coordinates=" + this.coordinates + ", accuracy=" + this.accuracy + ')';
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeStringList(this.coordinates);
        Float f10 = this.accuracy;
        if (f10 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeFloat(f10.floatValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StartLocation(String str, List list, Float f10, int i8, e eVar) {
        this(str, list, (i8 & 4) != 0 ? null : f10);
    }
}
