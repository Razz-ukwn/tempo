package com.quickkonnect.silencio.models.response.menu;

import android.os.Parcel;
import android.os.Parcelable;
import bb.b;
import s0.b0;
import sf.e;
import sf.j;

public final class AudioHistory implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AudioHistory> CREATOR = new Creator();
    @b("avgDb")
    private final Double avgDb;
    @b("coinsEarned")
    private final Double coinsEarned;
    @b("createdAt")
    private final Long createdAt;
    @b("endLocation")
    private final EndLocation endLocation;
    @b("endTime")
    private final Long endTime;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f6680id;
    @b("isDeleted")
    private final Boolean isDeleted;
    @b("isSurveyCompleted")
    private final Boolean isSurveyCompleted;
    @b("length")
    private final Double length;
    @b("maxDb")
    private final Double maxDb;
    @b("minDb")
    private final Double minDb;
    @b("pathImage")
    private final String pathImage;
    @b("placeOfMeasurement")
    private final String placeOfMeasurement;
    @b("socketId")
    private final String socketId;
    @b("startLocation")
    private final StartLocation startLocation;
    @b("startTime")
    private final Long startTime;
    @b("typeOfPlace")
    private final String typeOfPlace;
    @b("updatedAt")
    private final Long updatedAt;
    @b("userId")
    private final String userId;

    public static final class Creator implements Parcelable.Creator<AudioHistory> {
        public final AudioHistory createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Parcel parcel2 = parcel;
            j.f(parcel2, "parcel");
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            EndLocation createFromParcel = parcel.readInt() == 0 ? null : EndLocation.CREATOR.createFromParcel(parcel2);
            Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString = parcel.readString();
            boolean z10 = true;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                bool2 = Boolean.valueOf(z10);
            }
            return new AudioHistory(valueOf, valueOf2, valueOf3, createFromParcel, valueOf4, readString, bool, bool2, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StartLocation.CREATOR.createFromParcel(parcel2), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        public final AudioHistory[] newArray(int i8) {
            return new AudioHistory[i8];
        }
    }

    public AudioHistory() {
        this((Double) null, (Double) null, (Long) null, (EndLocation) null, (Long) null, (String) null, (Boolean) null, (Boolean) null, (Double) null, (Double) null, (Double) null, (String) null, (String) null, (String) null, (StartLocation) null, (Long) null, (String) null, (Long) null, (String) null, 524287, (e) null);
    }

    public AudioHistory(Double d10, Double d11, Long l10, EndLocation endLocation2, Long l11, String str, Boolean bool, Boolean bool2, Double d12, Double d13, Double d14, String str2, String str3, String str4, StartLocation startLocation2, Long l12, String str5, Long l13, String str6) {
        this.avgDb = d10;
        this.coinsEarned = d11;
        this.createdAt = l10;
        this.endLocation = endLocation2;
        this.endTime = l11;
        this.f6680id = str;
        this.isDeleted = bool;
        this.isSurveyCompleted = bool2;
        this.length = d12;
        this.maxDb = d13;
        this.minDb = d14;
        this.pathImage = str2;
        this.placeOfMeasurement = str3;
        this.socketId = str4;
        this.startLocation = startLocation2;
        this.startTime = l12;
        this.typeOfPlace = str5;
        this.updatedAt = l13;
        this.userId = str6;
    }

    public static /* synthetic */ AudioHistory copy$default(AudioHistory audioHistory, Double d10, Double d11, Long l10, EndLocation endLocation2, Long l11, String str, Boolean bool, Boolean bool2, Double d12, Double d13, Double d14, String str2, String str3, String str4, StartLocation startLocation2, Long l12, String str5, Long l13, String str6, int i8, Object obj) {
        AudioHistory audioHistory2 = audioHistory;
        int i10 = i8;
        return audioHistory.copy((i10 & 1) != 0 ? audioHistory2.avgDb : d10, (i10 & 2) != 0 ? audioHistory2.coinsEarned : d11, (i10 & 4) != 0 ? audioHistory2.createdAt : l10, (i10 & 8) != 0 ? audioHistory2.endLocation : endLocation2, (i10 & 16) != 0 ? audioHistory2.endTime : l11, (i10 & 32) != 0 ? audioHistory2.f6680id : str, (i10 & 64) != 0 ? audioHistory2.isDeleted : bool, (i10 & 128) != 0 ? audioHistory2.isSurveyCompleted : bool2, (i10 & 256) != 0 ? audioHistory2.length : d12, (i10 & 512) != 0 ? audioHistory2.maxDb : d13, (i10 & 1024) != 0 ? audioHistory2.minDb : d14, (i10 & 2048) != 0 ? audioHistory2.pathImage : str2, (i10 & 4096) != 0 ? audioHistory2.placeOfMeasurement : str3, (i10 & 8192) != 0 ? audioHistory2.socketId : str4, (i10 & 16384) != 0 ? audioHistory2.startLocation : startLocation2, (i10 & 32768) != 0 ? audioHistory2.startTime : l12, (i10 & 65536) != 0 ? audioHistory2.typeOfPlace : str5, (i10 & 131072) != 0 ? audioHistory2.updatedAt : l13, (i10 & 262144) != 0 ? audioHistory2.userId : str6);
    }

    public final Double component1() {
        return this.avgDb;
    }

    public final Double component10() {
        return this.maxDb;
    }

    public final Double component11() {
        return this.minDb;
    }

    public final String component12() {
        return this.pathImage;
    }

    public final String component13() {
        return this.placeOfMeasurement;
    }

    public final String component14() {
        return this.socketId;
    }

    public final StartLocation component15() {
        return this.startLocation;
    }

    public final Long component16() {
        return this.startTime;
    }

    public final String component17() {
        return this.typeOfPlace;
    }

    public final Long component18() {
        return this.updatedAt;
    }

    public final String component19() {
        return this.userId;
    }

    public final Double component2() {
        return this.coinsEarned;
    }

    public final Long component3() {
        return this.createdAt;
    }

    public final EndLocation component4() {
        return this.endLocation;
    }

    public final Long component5() {
        return this.endTime;
    }

    public final String component6() {
        return this.f6680id;
    }

    public final Boolean component7() {
        return this.isDeleted;
    }

    public final Boolean component8() {
        return this.isSurveyCompleted;
    }

    public final Double component9() {
        return this.length;
    }

    public final AudioHistory copy(Double d10, Double d11, Long l10, EndLocation endLocation2, Long l11, String str, Boolean bool, Boolean bool2, Double d12, Double d13, Double d14, String str2, String str3, String str4, StartLocation startLocation2, Long l12, String str5, Long l13, String str6) {
        return new AudioHistory(d10, d11, l10, endLocation2, l11, str, bool, bool2, d12, d13, d14, str2, str3, str4, startLocation2, l12, str5, l13, str6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioHistory)) {
            return false;
        }
        AudioHistory audioHistory = (AudioHistory) obj;
        return j.a(this.avgDb, audioHistory.avgDb) && j.a(this.coinsEarned, audioHistory.coinsEarned) && j.a(this.createdAt, audioHistory.createdAt) && j.a(this.endLocation, audioHistory.endLocation) && j.a(this.endTime, audioHistory.endTime) && j.a(this.f6680id, audioHistory.f6680id) && j.a(this.isDeleted, audioHistory.isDeleted) && j.a(this.isSurveyCompleted, audioHistory.isSurveyCompleted) && j.a(this.length, audioHistory.length) && j.a(this.maxDb, audioHistory.maxDb) && j.a(this.minDb, audioHistory.minDb) && j.a(this.pathImage, audioHistory.pathImage) && j.a(this.placeOfMeasurement, audioHistory.placeOfMeasurement) && j.a(this.socketId, audioHistory.socketId) && j.a(this.startLocation, audioHistory.startLocation) && j.a(this.startTime, audioHistory.startTime) && j.a(this.typeOfPlace, audioHistory.typeOfPlace) && j.a(this.updatedAt, audioHistory.updatedAt) && j.a(this.userId, audioHistory.userId);
    }

    public final Double getAvgDb() {
        return this.avgDb;
    }

    public final Double getCoinsEarned() {
        return this.coinsEarned;
    }

    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final EndLocation getEndLocation() {
        return this.endLocation;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getId() {
        return this.f6680id;
    }

    public final Double getLength() {
        return this.length;
    }

    public final Double getMaxDb() {
        return this.maxDb;
    }

    public final Double getMinDb() {
        return this.minDb;
    }

    public final String getPathImage() {
        return this.pathImage;
    }

    public final String getPlaceOfMeasurement() {
        return this.placeOfMeasurement;
    }

    public final String getSocketId() {
        return this.socketId;
    }

    public final StartLocation getStartLocation() {
        return this.startLocation;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getTypeOfPlace() {
        return this.typeOfPlace;
    }

    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Double d10 = this.avgDb;
        int i8 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.coinsEarned;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Long l10 = this.createdAt;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        EndLocation endLocation2 = this.endLocation;
        int hashCode4 = (hashCode3 + (endLocation2 == null ? 0 : endLocation2.hashCode())) * 31;
        Long l11 = this.endTime;
        int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f6680id;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDeleted;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSurveyCompleted;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d12 = this.length;
        int hashCode9 = (hashCode8 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.maxDb;
        int hashCode10 = (hashCode9 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.minDb;
        int hashCode11 = (hashCode10 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str2 = this.pathImage;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeOfMeasurement;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.socketId;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        StartLocation startLocation2 = this.startLocation;
        int hashCode15 = (hashCode14 + (startLocation2 == null ? 0 : startLocation2.hashCode())) * 31;
        Long l12 = this.startTime;
        int hashCode16 = (hashCode15 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str5 = this.typeOfPlace;
        int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l13 = this.updatedAt;
        int hashCode18 = (hashCode17 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str6 = this.userId;
        if (str6 != null) {
            i8 = str6.hashCode();
        }
        return hashCode18 + i8;
    }

    public final Boolean isDeleted() {
        return this.isDeleted;
    }

    public final Boolean isSurveyCompleted() {
        return this.isSurveyCompleted;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioHistory(avgDb=");
        sb2.append(this.avgDb);
        sb2.append(", coinsEarned=");
        sb2.append(this.coinsEarned);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", endLocation=");
        sb2.append(this.endLocation);
        sb2.append(", endTime=");
        sb2.append(this.endTime);
        sb2.append(", id=");
        sb2.append(this.f6680id);
        sb2.append(", isDeleted=");
        sb2.append(this.isDeleted);
        sb2.append(", isSurveyCompleted=");
        sb2.append(this.isSurveyCompleted);
        sb2.append(", length=");
        sb2.append(this.length);
        sb2.append(", maxDb=");
        sb2.append(this.maxDb);
        sb2.append(", minDb=");
        sb2.append(this.minDb);
        sb2.append(", pathImage=");
        sb2.append(this.pathImage);
        sb2.append(", placeOfMeasurement=");
        sb2.append(this.placeOfMeasurement);
        sb2.append(", socketId=");
        sb2.append(this.socketId);
        sb2.append(", startLocation=");
        sb2.append(this.startLocation);
        sb2.append(", startTime=");
        sb2.append(this.startTime);
        sb2.append(", typeOfPlace=");
        sb2.append(this.typeOfPlace);
        sb2.append(", updatedAt=");
        sb2.append(this.updatedAt);
        sb2.append(", userId=");
        return b0.a(sb2, this.userId, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        Double d10 = this.avgDb;
        if (d10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d10.doubleValue());
        }
        Double d11 = this.coinsEarned;
        if (d11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
        Long l10 = this.createdAt;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        EndLocation endLocation2 = this.endLocation;
        if (endLocation2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            endLocation2.writeToParcel(parcel, i8);
        }
        Long l11 = this.endTime;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        parcel.writeString(this.f6680id);
        Boolean bool = this.isDeleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isSurveyCompleted;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Double d12 = this.length;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d12.doubleValue());
        }
        Double d13 = this.maxDb;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d13.doubleValue());
        }
        Double d14 = this.minDb;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d14.doubleValue());
        }
        parcel.writeString(this.pathImage);
        parcel.writeString(this.placeOfMeasurement);
        parcel.writeString(this.socketId);
        StartLocation startLocation2 = this.startLocation;
        if (startLocation2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            startLocation2.writeToParcel(parcel, i8);
        }
        Long l12 = this.startTime;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
        parcel.writeString(this.typeOfPlace);
        Long l13 = this.updatedAt;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l13.longValue());
        }
        parcel.writeString(this.userId);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AudioHistory(java.lang.Double r21, java.lang.Double r22, java.lang.Long r23, com.quickkonnect.silencio.models.response.menu.EndLocation r24, java.lang.Long r25, java.lang.String r26, java.lang.Boolean r27, java.lang.Boolean r28, java.lang.Double r29, java.lang.Double r30, java.lang.Double r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, com.quickkonnect.silencio.models.response.menu.StartLocation r35, java.lang.Long r36, java.lang.String r37, java.lang.Long r38, java.lang.String r39, int r40, sf.e r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r22
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r23
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r24
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r25
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r26
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r27
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r28
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r29
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r30
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r31
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r32
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r33
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r34
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r35
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r36
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r37
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r38
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            goto L_0x00a6
        L_0x00a4:
            r0 = r39
        L_0x00a6:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r15
            r36 = r2
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.response.menu.AudioHistory.<init>(java.lang.Double, java.lang.Double, java.lang.Long, com.quickkonnect.silencio.models.response.menu.EndLocation, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, com.quickkonnect.silencio.models.response.menu.StartLocation, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, int, sf.e):void");
    }
}
