package com.quickkonnect.silencio.models.request.measure;

import sf.j;

public final class MeasureStartRecordingRequestModel {
    public static final int $stable = 8;
    private final StartLocation startLocation;

    public MeasureStartRecordingRequestModel(StartLocation startLocation2) {
        j.f(startLocation2, "startLocation");
        this.startLocation = startLocation2;
    }

    public static /* synthetic */ MeasureStartRecordingRequestModel copy$default(MeasureStartRecordingRequestModel measureStartRecordingRequestModel, StartLocation startLocation2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            startLocation2 = measureStartRecordingRequestModel.startLocation;
        }
        return measureStartRecordingRequestModel.copy(startLocation2);
    }

    public final StartLocation component1() {
        return this.startLocation;
    }

    public final MeasureStartRecordingRequestModel copy(StartLocation startLocation2) {
        j.f(startLocation2, "startLocation");
        return new MeasureStartRecordingRequestModel(startLocation2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MeasureStartRecordingRequestModel) && j.a(this.startLocation, ((MeasureStartRecordingRequestModel) obj).startLocation);
    }

    public final StartLocation getStartLocation() {
        return this.startLocation;
    }

    public int hashCode() {
        return this.startLocation.hashCode();
    }

    public String toString() {
        return "MeasureStartRecordingRequestModel(startLocation=" + this.startLocation + ')';
    }
}
