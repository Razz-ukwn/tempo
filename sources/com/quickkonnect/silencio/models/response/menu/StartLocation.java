package com.quickkonnect.silencio.models.response.menu;

import android.os.Parcel;
import android.os.Parcelable;
import bb.b;
import java.util.List;
import s0.b0;
import sf.e;
import sf.j;

public final class StartLocation implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<StartLocation> CREATOR = new Creator();
    @b("coordinates")
    private final List<String> coordinates;
    @b("type")
    private final String type;

    public static final class Creator implements Parcelable.Creator<StartLocation> {
        public final StartLocation createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new StartLocation(parcel.createStringArrayList(), parcel.readString());
        }

        public final StartLocation[] newArray(int i8) {
            return new StartLocation[i8];
        }
    }

    public StartLocation() {
        this((List) null, (String) null, 3, (e) null);
    }

    public StartLocation(List<String> list, String str) {
        this.coordinates = list;
        this.type = str;
    }

    public static /* synthetic */ StartLocation copy$default(StartLocation startLocation, List<String> list, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = startLocation.coordinates;
        }
        if ((i8 & 2) != 0) {
            str = startLocation.type;
        }
        return startLocation.copy(list, str);
    }

    public final List<String> component1() {
        return this.coordinates;
    }

    public final String component2() {
        return this.type;
    }

    public final StartLocation copy(List<String> list, String str) {
        return new StartLocation(list, str);
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
        return j.a(this.coordinates, startLocation.coordinates) && j.a(this.type, startLocation.type);
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
        StringBuilder sb2 = new StringBuilder("StartLocation(coordinates=");
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
    public /* synthetic */ StartLocation(List list, String str, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : list, (i8 & 2) != 0 ? null : str);
    }
}
