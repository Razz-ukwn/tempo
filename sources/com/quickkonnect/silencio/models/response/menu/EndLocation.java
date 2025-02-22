package com.quickkonnect.silencio.models.response.menu;

import android.os.Parcel;
import android.os.Parcelable;
import bb.b;
import java.util.List;
import s0.b0;
import sf.e;
import sf.j;

public final class EndLocation implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EndLocation> CREATOR = new Creator();
    @b("coordinates")
    private final List<String> coordinates;
    @b("type")
    private final String type;

    public static final class Creator implements Parcelable.Creator<EndLocation> {
        public final EndLocation createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new EndLocation(parcel.createStringArrayList(), parcel.readString());
        }

        public final EndLocation[] newArray(int i8) {
            return new EndLocation[i8];
        }
    }

    public EndLocation() {
        this((List) null, (String) null, 3, (e) null);
    }

    public EndLocation(List<String> list, String str) {
        this.coordinates = list;
        this.type = str;
    }

    public static /* synthetic */ EndLocation copy$default(EndLocation endLocation, List<String> list, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = endLocation.coordinates;
        }
        if ((i8 & 2) != 0) {
            str = endLocation.type;
        }
        return endLocation.copy(list, str);
    }

    public final List<String> component1() {
        return this.coordinates;
    }

    public final String component2() {
        return this.type;
    }

    public final EndLocation copy(List<String> list, String str) {
        return new EndLocation(list, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndLocation)) {
            return false;
        }
        EndLocation endLocation = (EndLocation) obj;
        return j.a(this.coordinates, endLocation.coordinates) && j.a(this.type, endLocation.type);
    }

    public final List<String> getCoordinates() {
        return this.coordinates;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        List<String> list = this.coordinates;
        int i8 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.type;
        if (str != null) {
            i8 = str.hashCode();
        }
        return hashCode + i8;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EndLocation(coordinates=");
        sb2.append(this.coordinates);
        sb2.append(", type=");
        return b0.a(sb2, this.type, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeStringList(this.coordinates);
        parcel.writeString(this.type);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EndLocation(List list, String str, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : list, (i8 & 2) != 0 ? null : str);
    }
}
