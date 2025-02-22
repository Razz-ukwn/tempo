package com.quickkonnect.silencio.models.request.measure;

import android.os.Parcel;
import android.os.Parcelable;
import h0.e;
import sf.j;

public final class VoiceRecordingSamples implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VoiceRecordingSamples> CREATOR = new Creator();
    private final Float accuracy;
    private final double dbValue;
    private final StartLocation location;
    private final long timeStamp;

    public static final class Creator implements Parcelable.Creator<VoiceRecordingSamples> {
        public final VoiceRecordingSamples createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new VoiceRecordingSamples(parcel.readInt() == 0 ? null : StartLocation.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readLong(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        public final VoiceRecordingSamples[] newArray(int i8) {
            return new VoiceRecordingSamples[i8];
        }
    }

    public VoiceRecordingSamples(StartLocation startLocation, double d10, long j10, Float f10) {
        this.location = startLocation;
        this.dbValue = d10;
        this.timeStamp = j10;
        this.accuracy = f10;
    }

    public static /* synthetic */ VoiceRecordingSamples copy$default(VoiceRecordingSamples voiceRecordingSamples, StartLocation startLocation, double d10, long j10, Float f10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            startLocation = voiceRecordingSamples.location;
        }
        if ((i8 & 2) != 0) {
            d10 = voiceRecordingSamples.dbValue;
        }
        double d11 = d10;
        if ((i8 & 4) != 0) {
            j10 = voiceRecordingSamples.timeStamp;
        }
        long j11 = j10;
        if ((i8 & 8) != 0) {
            f10 = voiceRecordingSamples.accuracy;
        }
        return voiceRecordingSamples.copy(startLocation, d11, j11, f10);
    }

    public final StartLocation component1() {
        return this.location;
    }

    public final double component2() {
        return this.dbValue;
    }

    public final long component3() {
        return this.timeStamp;
    }

    public final Float component4() {
        return this.accuracy;
    }

    public final VoiceRecordingSamples copy(StartLocation startLocation, double d10, long j10, Float f10) {
        return new VoiceRecordingSamples(startLocation, d10, j10, f10);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceRecordingSamples)) {
            return false;
        }
        VoiceRecordingSamples voiceRecordingSamples = (VoiceRecordingSamples) obj;
        return j.a(this.location, voiceRecordingSamples.location) && Double.compare(this.dbValue, voiceRecordingSamples.dbValue) == 0 && this.timeStamp == voiceRecordingSamples.timeStamp && j.a(this.accuracy, voiceRecordingSamples.accuracy);
    }

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final double getDbValue() {
        return this.dbValue;
    }

    public final StartLocation getLocation() {
        return this.location;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        StartLocation startLocation = this.location;
        int i8 = 0;
        int hashCode = startLocation == null ? 0 : startLocation.hashCode();
        int a10 = e.a(this.timeStamp, (Double.hashCode(this.dbValue) + (hashCode * 31)) * 31, 31);
        Float f10 = this.accuracy;
        if (f10 != null) {
            i8 = f10.hashCode();
        }
        return a10 + i8;
    }

    public String toString() {
        return "VoiceRecordingSamples(location=" + this.location + ", dbValue=" + this.dbValue + ", timeStamp=" + this.timeStamp + ", accuracy=" + this.accuracy + ')';
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        StartLocation startLocation = this.location;
        if (startLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            startLocation.writeToParcel(parcel, i8);
        }
        parcel.writeDouble(this.dbValue);
        parcel.writeLong(this.timeStamp);
        Float f10 = this.accuracy;
        if (f10 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeFloat(f10.floatValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VoiceRecordingSamples(StartLocation startLocation, double d10, long j10, Float f10, int i8, sf.e eVar) {
        this((i8 & 1) != 0 ? null : startLocation, d10, j10, (i8 & 8) != 0 ? null : f10);
    }
}
