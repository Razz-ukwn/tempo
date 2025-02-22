package com.quickkonnect.silencio.models.response.measure;

import bb.b;
import com.quickkonnect.silencio.models.response.BaseResponse;
import sf.e;
import sf.j;

public final class StartRecordingResponseModel extends BaseResponse {
    public static final int $stable = 8;
    @b("data")
    private final StartRecordingModel data;

    public StartRecordingResponseModel() {
        this((StartRecordingModel) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StartRecordingResponseModel(StartRecordingModel startRecordingModel, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : startRecordingModel);
    }

    public static /* synthetic */ StartRecordingResponseModel copy$default(StartRecordingResponseModel startRecordingResponseModel, StartRecordingModel startRecordingModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            startRecordingModel = startRecordingResponseModel.data;
        }
        return startRecordingResponseModel.copy(startRecordingModel);
    }

    public final StartRecordingModel component1() {
        return this.data;
    }

    public final StartRecordingResponseModel copy(StartRecordingModel startRecordingModel) {
        return new StartRecordingResponseModel(startRecordingModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartRecordingResponseModel) && j.a(this.data, ((StartRecordingResponseModel) obj).data);
    }

    public final StartRecordingModel getData() {
        return this.data;
    }

    public int hashCode() {
        StartRecordingModel startRecordingModel = this.data;
        if (startRecordingModel == null) {
            return 0;
        }
        return startRecordingModel.hashCode();
    }

    public String toString() {
        return "StartRecordingResponseModel(data=" + this.data + ')';
    }

    public StartRecordingResponseModel(StartRecordingModel startRecordingModel) {
        this.data = startRecordingModel;
    }
}
