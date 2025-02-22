package com.quickkonnect.silencio.models.response.measure;

import com.quickkonnect.silencio.models.request.measure.StartLocation;
import s0.b0;
import sf.e;
import sf.j;

public final class StartRecordingCreatedDataModel {
    public static final int $stable = 8;
    private final Double avgDb;
    private final Double coinsEarned;
    private final String createdAt;
    private final String endTime;

    /* renamed from: id  reason: collision with root package name */
    private final String f6679id;
    private final Boolean isDeleted;
    private final Boolean isSurveyCompleted;
    private final String length;
    private final Double maxDb;
    private final Double minDb;
    private final String placeOfMeasurement;
    private final StartLocation startLocation;
    private final String startTime;
    private final String typeOfPlace;
    private final String updatedAt;
    private final String userId;

    public StartRecordingCreatedDataModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (StartLocation) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, 65535, (e) null);
    }

    public StartRecordingCreatedDataModel(String str, String str2, String str3, String str4, String str5, String str6, StartLocation startLocation2, Double d10, Double d11, Double d12, Double d13, Boolean bool, Boolean bool2, String str7, String str8, String str9) {
        this.f6679id = str;
        this.createdAt = str2;
        this.updatedAt = str3;
        this.startTime = str4;
        this.endTime = str5;
        this.length = str6;
        this.startLocation = startLocation2;
        this.minDb = d10;
        this.maxDb = d11;
        this.avgDb = d12;
        this.coinsEarned = d13;
        this.isSurveyCompleted = bool;
        this.isDeleted = bool2;
        this.typeOfPlace = str7;
        this.placeOfMeasurement = str8;
        this.userId = str9;
    }

    public static /* synthetic */ StartRecordingCreatedDataModel copy$default(StartRecordingCreatedDataModel startRecordingCreatedDataModel, String str, String str2, String str3, String str4, String str5, String str6, StartLocation startLocation2, Double d10, Double d11, Double d12, Double d13, Boolean bool, Boolean bool2, String str7, String str8, String str9, int i8, Object obj) {
        StartRecordingCreatedDataModel startRecordingCreatedDataModel2 = startRecordingCreatedDataModel;
        int i10 = i8;
        return startRecordingCreatedDataModel.copy((i10 & 1) != 0 ? startRecordingCreatedDataModel2.f6679id : str, (i10 & 2) != 0 ? startRecordingCreatedDataModel2.createdAt : str2, (i10 & 4) != 0 ? startRecordingCreatedDataModel2.updatedAt : str3, (i10 & 8) != 0 ? startRecordingCreatedDataModel2.startTime : str4, (i10 & 16) != 0 ? startRecordingCreatedDataModel2.endTime : str5, (i10 & 32) != 0 ? startRecordingCreatedDataModel2.length : str6, (i10 & 64) != 0 ? startRecordingCreatedDataModel2.startLocation : startLocation2, (i10 & 128) != 0 ? startRecordingCreatedDataModel2.minDb : d10, (i10 & 256) != 0 ? startRecordingCreatedDataModel2.maxDb : d11, (i10 & 512) != 0 ? startRecordingCreatedDataModel2.avgDb : d12, (i10 & 1024) != 0 ? startRecordingCreatedDataModel2.coinsEarned : d13, (i10 & 2048) != 0 ? startRecordingCreatedDataModel2.isSurveyCompleted : bool, (i10 & 4096) != 0 ? startRecordingCreatedDataModel2.isDeleted : bool2, (i10 & 8192) != 0 ? startRecordingCreatedDataModel2.typeOfPlace : str7, (i10 & 16384) != 0 ? startRecordingCreatedDataModel2.placeOfMeasurement : str8, (i10 & 32768) != 0 ? startRecordingCreatedDataModel2.userId : str9);
    }

    public final String component1() {
        return this.f6679id;
    }

    public final Double component10() {
        return this.avgDb;
    }

    public final Double component11() {
        return this.coinsEarned;
    }

    public final Boolean component12() {
        return this.isSurveyCompleted;
    }

    public final Boolean component13() {
        return this.isDeleted;
    }

    public final String component14() {
        return this.typeOfPlace;
    }

    public final String component15() {
        return this.placeOfMeasurement;
    }

    public final String component16() {
        return this.userId;
    }

    public final String component2() {
        return this.createdAt;
    }

    public final String component3() {
        return this.updatedAt;
    }

    public final String component4() {
        return this.startTime;
    }

    public final String component5() {
        return this.endTime;
    }

    public final String component6() {
        return this.length;
    }

    public final StartLocation component7() {
        return this.startLocation;
    }

    public final Double component8() {
        return this.minDb;
    }

    public final Double component9() {
        return this.maxDb;
    }

    public final StartRecordingCreatedDataModel copy(String str, String str2, String str3, String str4, String str5, String str6, StartLocation startLocation2, Double d10, Double d11, Double d12, Double d13, Boolean bool, Boolean bool2, String str7, String str8, String str9) {
        return new StartRecordingCreatedDataModel(str, str2, str3, str4, str5, str6, startLocation2, d10, d11, d12, d13, bool, bool2, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartRecordingCreatedDataModel)) {
            return false;
        }
        StartRecordingCreatedDataModel startRecordingCreatedDataModel = (StartRecordingCreatedDataModel) obj;
        return j.a(this.f6679id, startRecordingCreatedDataModel.f6679id) && j.a(this.createdAt, startRecordingCreatedDataModel.createdAt) && j.a(this.updatedAt, startRecordingCreatedDataModel.updatedAt) && j.a(this.startTime, startRecordingCreatedDataModel.startTime) && j.a(this.endTime, startRecordingCreatedDataModel.endTime) && j.a(this.length, startRecordingCreatedDataModel.length) && j.a(this.startLocation, startRecordingCreatedDataModel.startLocation) && j.a(this.minDb, startRecordingCreatedDataModel.minDb) && j.a(this.maxDb, startRecordingCreatedDataModel.maxDb) && j.a(this.avgDb, startRecordingCreatedDataModel.avgDb) && j.a(this.coinsEarned, startRecordingCreatedDataModel.coinsEarned) && j.a(this.isSurveyCompleted, startRecordingCreatedDataModel.isSurveyCompleted) && j.a(this.isDeleted, startRecordingCreatedDataModel.isDeleted) && j.a(this.typeOfPlace, startRecordingCreatedDataModel.typeOfPlace) && j.a(this.placeOfMeasurement, startRecordingCreatedDataModel.placeOfMeasurement) && j.a(this.userId, startRecordingCreatedDataModel.userId);
    }

    public final Double getAvgDb() {
        return this.avgDb;
    }

    public final Double getCoinsEarned() {
        return this.coinsEarned;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getId() {
        return this.f6679id;
    }

    public final String getLength() {
        return this.length;
    }

    public final Double getMaxDb() {
        return this.maxDb;
    }

    public final Double getMinDb() {
        return this.minDb;
    }

    public final String getPlaceOfMeasurement() {
        return this.placeOfMeasurement;
    }

    public final StartLocation getStartLocation() {
        return this.startLocation;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTypeOfPlace() {
        return this.typeOfPlace;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.f6679id;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.createdAt;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updatedAt;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endTime;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.length;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        StartLocation startLocation2 = this.startLocation;
        int hashCode7 = (hashCode6 + (startLocation2 == null ? 0 : startLocation2.hashCode())) * 31;
        Double d10 = this.minDb;
        int hashCode8 = (hashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.maxDb;
        int hashCode9 = (hashCode8 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.avgDb;
        int hashCode10 = (hashCode9 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.coinsEarned;
        int hashCode11 = (hashCode10 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Boolean bool = this.isSurveyCompleted;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDeleted;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.typeOfPlace;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.placeOfMeasurement;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userId;
        if (str9 != null) {
            i8 = str9.hashCode();
        }
        return hashCode15 + i8;
    }

    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    public final Boolean isSurveyCompleted() {
        return this.isSurveyCompleted;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StartRecordingCreatedDataModel(id=");
        sb2.append(this.f6679id);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", updatedAt=");
        sb2.append(this.updatedAt);
        sb2.append(", startTime=");
        sb2.append(this.startTime);
        sb2.append(", endTime=");
        sb2.append(this.endTime);
        sb2.append(", length=");
        sb2.append(this.length);
        sb2.append(", startLocation=");
        sb2.append(this.startLocation);
        sb2.append(", minDb=");
        sb2.append(this.minDb);
        sb2.append(", maxDb=");
        sb2.append(this.maxDb);
        sb2.append(", avgDb=");
        sb2.append(this.avgDb);
        sb2.append(", coinsEarned=");
        sb2.append(this.coinsEarned);
        sb2.append(", isSurveyCompleted=");
        sb2.append(this.isSurveyCompleted);
        sb2.append(", isDeleted=");
        sb2.append(this.isDeleted);
        sb2.append(", typeOfPlace=");
        sb2.append(this.typeOfPlace);
        sb2.append(", placeOfMeasurement=");
        sb2.append(this.placeOfMeasurement);
        sb2.append(", userId=");
        return b0.a(sb2, this.userId, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StartRecordingCreatedDataModel(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.quickkonnect.silencio.models.request.measure.StartLocation r24, java.lang.Double r25, java.lang.Double r26, java.lang.Double r27, java.lang.Double r28, java.lang.Boolean r29, java.lang.Boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, sf.e r35) {
        /*
            r17 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r18
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r19
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r20
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r21
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r22
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r23
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r24
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r25
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r26
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r27
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r28
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r29
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r30
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r31
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r32
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0085
        L_0x0083:
            r0 = r33
        L_0x0085:
            r18 = r17
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r2
            r34 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.response.measure.StartRecordingCreatedDataModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.quickkonnect.silencio.models.request.measure.StartLocation, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, int, sf.e):void");
    }
}
