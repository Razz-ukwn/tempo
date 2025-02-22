package com.quickkonnect.silencio.models.request.measure;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import sf.e;
import sf.j;

public final class StopRecordingRequestModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<StopRecordingRequestModel> CREATOR = new Creator();
    private final Double avgDb;
    private final StartLocation endLocation;
    private final Long endTime;
    private final Double length;
    private final Double maxDb;
    private final Double minDb;
    private final String sampleId;
    private final List<VoiceRecordingSamples> voiceRecording;

    public static final class Creator implements Parcelable.Creator<StopRecordingRequestModel> {
        public final StopRecordingRequestModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            StartLocation createFromParcel = parcel.readInt() == 0 ? null : StartLocation.CREATOR.createFromParcel(parcel);
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(VoiceRecordingSamples.CREATOR.createFromParcel(parcel));
                }
            }
            return new StopRecordingRequestModel(readString, valueOf, createFromParcel, valueOf2, valueOf3, valueOf4, valueOf5, arrayList);
        }

        public final StopRecordingRequestModel[] newArray(int i8) {
            return new StopRecordingRequestModel[i8];
        }
    }

    public StopRecordingRequestModel() {
        this((String) null, (Double) null, (StartLocation) null, (Double) null, (Double) null, (Double) null, (Long) null, (List) null, 255, (e) null);
    }

    public StopRecordingRequestModel(String str, Double d10, StartLocation startLocation, Double d11, Double d12, Double d13, Long l10, List<VoiceRecordingSamples> list) {
        this.sampleId = str;
        this.length = d10;
        this.endLocation = startLocation;
        this.minDb = d11;
        this.maxDb = d12;
        this.avgDb = d13;
        this.endTime = l10;
        this.voiceRecording = list;
    }

    public static /* synthetic */ StopRecordingRequestModel copy$default(StopRecordingRequestModel stopRecordingRequestModel, String str, Double d10, StartLocation startLocation, Double d11, Double d12, Double d13, Long l10, List list, int i8, Object obj) {
        StopRecordingRequestModel stopRecordingRequestModel2 = stopRecordingRequestModel;
        int i10 = i8;
        return stopRecordingRequestModel.copy((i10 & 1) != 0 ? stopRecordingRequestModel2.sampleId : str, (i10 & 2) != 0 ? stopRecordingRequestModel2.length : d10, (i10 & 4) != 0 ? stopRecordingRequestModel2.endLocation : startLocation, (i10 & 8) != 0 ? stopRecordingRequestModel2.minDb : d11, (i10 & 16) != 0 ? stopRecordingRequestModel2.maxDb : d12, (i10 & 32) != 0 ? stopRecordingRequestModel2.avgDb : d13, (i10 & 64) != 0 ? stopRecordingRequestModel2.endTime : l10, (i10 & 128) != 0 ? stopRecordingRequestModel2.voiceRecording : list);
    }

    public final String component1() {
        return this.sampleId;
    }

    public final Double component2() {
        return this.length;
    }

    public final StartLocation component3() {
        return this.endLocation;
    }

    public final Double component4() {
        return this.minDb;
    }

    public final Double component5() {
        return this.maxDb;
    }

    public final Double component6() {
        return this.avgDb;
    }

    public final Long component7() {
        return this.endTime;
    }

    public final List<VoiceRecordingSamples> component8() {
        return this.voiceRecording;
    }

    public final StopRecordingRequestModel copy(String str, Double d10, StartLocation startLocation, Double d11, Double d12, Double d13, Long l10, List<VoiceRecordingSamples> list) {
        return new StopRecordingRequestModel(str, d10, startLocation, d11, d12, d13, l10, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopRecordingRequestModel)) {
            return false;
        }
        StopRecordingRequestModel stopRecordingRequestModel = (StopRecordingRequestModel) obj;
        return j.a(this.sampleId, stopRecordingRequestModel.sampleId) && j.a(this.length, stopRecordingRequestModel.length) && j.a(this.endLocation, stopRecordingRequestModel.endLocation) && j.a(this.minDb, stopRecordingRequestModel.minDb) && j.a(this.maxDb, stopRecordingRequestModel.maxDb) && j.a(this.avgDb, stopRecordingRequestModel.avgDb) && j.a(this.endTime, stopRecordingRequestModel.endTime) && j.a(this.voiceRecording, stopRecordingRequestModel.voiceRecording);
    }

    public final Double getAvgDb() {
        return this.avgDb;
    }

    public final StartLocation getEndLocation() {
        return this.endLocation;
    }

    public final Long getEndTime() {
        return this.endTime;
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

    public final String getSampleId() {
        return this.sampleId;
    }

    public final List<VoiceRecordingSamples> getVoiceRecording() {
        return this.voiceRecording;
    }

    public int hashCode() {
        String str = this.sampleId;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.length;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        StartLocation startLocation = this.endLocation;
        int hashCode3 = (hashCode2 + (startLocation == null ? 0 : startLocation.hashCode())) * 31;
        Double d11 = this.minDb;
        int hashCode4 = (hashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.maxDb;
        int hashCode5 = (hashCode4 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.avgDb;
        int hashCode6 = (hashCode5 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Long l10 = this.endTime;
        int hashCode7 = (hashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        List<VoiceRecordingSamples> list = this.voiceRecording;
        if (list != null) {
            i8 = list.hashCode();
        }
        return hashCode7 + i8;
    }

    public String toString() {
        return "StopRecordingRequestModel(sampleId=" + this.sampleId + ", length=" + this.length + ", endLocation=" + this.endLocation + ", minDb=" + this.minDb + ", maxDb=" + this.maxDb + ", avgDb=" + this.avgDb + ", endTime=" + this.endTime + ", voiceRecording=" + this.voiceRecording + ')';
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeString(this.sampleId);
        Double d10 = this.length;
        if (d10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d10.doubleValue());
        }
        StartLocation startLocation = this.endLocation;
        if (startLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            startLocation.writeToParcel(parcel, i8);
        }
        Double d11 = this.minDb;
        if (d11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
        Double d12 = this.maxDb;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d12.doubleValue());
        }
        Double d13 = this.avgDb;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d13.doubleValue());
        }
        Long l10 = this.endTime;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        List<VoiceRecordingSamples> list = this.voiceRecording;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (VoiceRecordingSamples writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i8);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StopRecordingRequestModel(java.lang.String r10, java.lang.Double r11, com.quickkonnect.silencio.models.request.measure.StartLocation r12, java.lang.Double r13, java.lang.Double r14, java.lang.Double r15, java.lang.Long r16, java.util.List r17, int r18, sf.e r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.request.measure.StopRecordingRequestModel.<init>(java.lang.String, java.lang.Double, com.quickkonnect.silencio.models.request.measure.StartLocation, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.Long, java.util.List, int, sf.e):void");
    }
}
