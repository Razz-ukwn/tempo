package com.quickkonnect.silencio.models.response.menu;

import bb.b;
import com.quickkonnect.silencio.models.response.BaseResponse;
import sf.e;
import sf.j;

public final class MeasurementResponse extends BaseResponse {
    public static final int $stable = 0;
    @b("data")
    private final MeasurementModel data;

    public MeasurementResponse() {
        this((MeasurementModel) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeasurementResponse(MeasurementModel measurementModel, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : measurementModel);
    }

    public static /* synthetic */ MeasurementResponse copy$default(MeasurementResponse measurementResponse, MeasurementModel measurementModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            measurementModel = measurementResponse.data;
        }
        return measurementResponse.copy(measurementModel);
    }

    public final MeasurementModel component1() {
        return this.data;
    }

    public final MeasurementResponse copy(MeasurementModel measurementModel) {
        return new MeasurementResponse(measurementModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MeasurementResponse) && j.a(this.data, ((MeasurementResponse) obj).data);
    }

    public final MeasurementModel getData() {
        return this.data;
    }

    public int hashCode() {
        MeasurementModel measurementModel = this.data;
        if (measurementModel == null) {
            return 0;
        }
        return measurementModel.hashCode();
    }

    public String toString() {
        return "MeasurementResponse(data=" + this.data + ')';
    }

    public MeasurementResponse(MeasurementModel measurementModel) {
        this.data = measurementModel;
    }
}
