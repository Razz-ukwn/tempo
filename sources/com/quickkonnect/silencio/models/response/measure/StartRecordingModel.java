package com.quickkonnect.silencio.models.response.measure;

import s0.b0;
import sf.e;
import sf.j;

public final class StartRecordingModel {
    public static final int $stable = 8;
    private final String coinsPerMinute;
    private final String coinsPerSecond;
    private final StartRecordingCreatedDataModel createdData;

    public StartRecordingModel() {
        this((StartRecordingCreatedDataModel) null, (String) null, (String) null, 7, (e) null);
    }

    public StartRecordingModel(StartRecordingCreatedDataModel startRecordingCreatedDataModel, String str, String str2) {
        this.createdData = startRecordingCreatedDataModel;
        this.coinsPerSecond = str;
        this.coinsPerMinute = str2;
    }

    public static /* synthetic */ StartRecordingModel copy$default(StartRecordingModel startRecordingModel, StartRecordingCreatedDataModel startRecordingCreatedDataModel, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            startRecordingCreatedDataModel = startRecordingModel.createdData;
        }
        if ((i8 & 2) != 0) {
            str = startRecordingModel.coinsPerSecond;
        }
        if ((i8 & 4) != 0) {
            str2 = startRecordingModel.coinsPerMinute;
        }
        return startRecordingModel.copy(startRecordingCreatedDataModel, str, str2);
    }

    public final StartRecordingCreatedDataModel component1() {
        return this.createdData;
    }

    public final String component2() {
        return this.coinsPerSecond;
    }

    public final String component3() {
        return this.coinsPerMinute;
    }

    public final StartRecordingModel copy(StartRecordingCreatedDataModel startRecordingCreatedDataModel, String str, String str2) {
        return new StartRecordingModel(startRecordingCreatedDataModel, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartRecordingModel)) {
            return false;
        }
        StartRecordingModel startRecordingModel = (StartRecordingModel) obj;
        return j.a(this.createdData, startRecordingModel.createdData) && j.a(this.coinsPerSecond, startRecordingModel.coinsPerSecond) && j.a(this.coinsPerMinute, startRecordingModel.coinsPerMinute);
    }

    public final String getCoinsPerMinute() {
        return this.coinsPerMinute;
    }

    public final String getCoinsPerSecond() {
        return this.coinsPerSecond;
    }

    public final StartRecordingCreatedDataModel getCreatedData() {
        return this.createdData;
    }

    public int hashCode() {
        StartRecordingCreatedDataModel startRecordingCreatedDataModel = this.createdData;
        int i8 = 0;
        int hashCode = (startRecordingCreatedDataModel == null ? 0 : startRecordingCreatedDataModel.hashCode()) * 31;
        String str = this.coinsPerSecond;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coinsPerMinute;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return hashCode2 + i8;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StartRecordingModel(createdData=");
        sb2.append(this.createdData);
        sb2.append(", coinsPerSecond=");
        sb2.append(this.coinsPerSecond);
        sb2.append(", coinsPerMinute=");
        return b0.a(sb2, this.coinsPerMinute, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StartRecordingModel(StartRecordingCreatedDataModel startRecordingCreatedDataModel, String str, String str2, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : startRecordingCreatedDataModel, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2);
    }
}
