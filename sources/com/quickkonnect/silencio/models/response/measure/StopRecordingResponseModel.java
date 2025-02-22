package com.quickkonnect.silencio.models.response.measure;

import bb.b;
import com.quickkonnect.silencio.models.response.BaseResponse;
import sf.e;
import sf.j;

public final class StopRecordingResponseModel extends BaseResponse {
    public static final int $stable = 8;
    @b("data")
    private final StartRecordingCreatedDataModel data;

    public StopRecordingResponseModel() {
        this((StartRecordingCreatedDataModel) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StopRecordingResponseModel(StartRecordingCreatedDataModel startRecordingCreatedDataModel, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : startRecordingCreatedDataModel);
    }

    public static /* synthetic */ StopRecordingResponseModel copy$default(StopRecordingResponseModel stopRecordingResponseModel, StartRecordingCreatedDataModel startRecordingCreatedDataModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            startRecordingCreatedDataModel = stopRecordingResponseModel.data;
        }
        return stopRecordingResponseModel.copy(startRecordingCreatedDataModel);
    }

    public final StartRecordingCreatedDataModel component1() {
        return this.data;
    }

    public final StopRecordingResponseModel copy(StartRecordingCreatedDataModel startRecordingCreatedDataModel) {
        return new StopRecordingResponseModel(startRecordingCreatedDataModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StopRecordingResponseModel) && j.a(this.data, ((StopRecordingResponseModel) obj).data);
    }

    public final StartRecordingCreatedDataModel getData() {
        return this.data;
    }

    public int hashCode() {
        StartRecordingCreatedDataModel startRecordingCreatedDataModel = this.data;
        if (startRecordingCreatedDataModel == null) {
            return 0;
        }
        return startRecordingCreatedDataModel.hashCode();
    }

    public String toString() {
        return "StopRecordingResponseModel(data=" + this.data + ')';
    }

    public StopRecordingResponseModel(StartRecordingCreatedDataModel startRecordingCreatedDataModel) {
        this.data = startRecordingCreatedDataModel;
    }
}
