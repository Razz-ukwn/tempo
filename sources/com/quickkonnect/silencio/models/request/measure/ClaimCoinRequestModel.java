package com.quickkonnect.silencio.models.request.measure;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import sf.e;
import sf.j;

public final class ClaimCoinRequestModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ClaimCoinRequestModel> CREATOR = new Creator();
    private final Double earnedAmount;
    private final String placeOfMeasurement;
    private final String sampleId;
    private final List<String> sourcesOfNoise;
    private final String typeOfPlace;

    public static final class Creator implements Parcelable.Creator<ClaimCoinRequestModel> {
        public final ClaimCoinRequestModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new ClaimCoinRequestModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        public final ClaimCoinRequestModel[] newArray(int i8) {
            return new ClaimCoinRequestModel[i8];
        }
    }

    public ClaimCoinRequestModel() {
        this((String) null, (String) null, (String) null, (List) null, (Double) null, 31, (e) null);
    }

    public ClaimCoinRequestModel(String str, String str2, String str3, List<String> list, Double d10) {
        this.sampleId = str;
        this.typeOfPlace = str2;
        this.placeOfMeasurement = str3;
        this.sourcesOfNoise = list;
        this.earnedAmount = d10;
    }

    public static /* synthetic */ ClaimCoinRequestModel copy$default(ClaimCoinRequestModel claimCoinRequestModel, String str, String str2, String str3, List<String> list, Double d10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = claimCoinRequestModel.sampleId;
        }
        if ((i8 & 2) != 0) {
            str2 = claimCoinRequestModel.typeOfPlace;
        }
        String str4 = str2;
        if ((i8 & 4) != 0) {
            str3 = claimCoinRequestModel.placeOfMeasurement;
        }
        String str5 = str3;
        if ((i8 & 8) != 0) {
            list = claimCoinRequestModel.sourcesOfNoise;
        }
        List<String> list2 = list;
        if ((i8 & 16) != 0) {
            d10 = claimCoinRequestModel.earnedAmount;
        }
        return claimCoinRequestModel.copy(str, str4, str5, list2, d10);
    }

    public final String component1() {
        return this.sampleId;
    }

    public final String component2() {
        return this.typeOfPlace;
    }

    public final String component3() {
        return this.placeOfMeasurement;
    }

    public final List<String> component4() {
        return this.sourcesOfNoise;
    }

    public final Double component5() {
        return this.earnedAmount;
    }

    public final ClaimCoinRequestModel copy(String str, String str2, String str3, List<String> list, Double d10) {
        return new ClaimCoinRequestModel(str, str2, str3, list, d10);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimCoinRequestModel)) {
            return false;
        }
        ClaimCoinRequestModel claimCoinRequestModel = (ClaimCoinRequestModel) obj;
        return j.a(this.sampleId, claimCoinRequestModel.sampleId) && j.a(this.typeOfPlace, claimCoinRequestModel.typeOfPlace) && j.a(this.placeOfMeasurement, claimCoinRequestModel.placeOfMeasurement) && j.a(this.sourcesOfNoise, claimCoinRequestModel.sourcesOfNoise) && j.a(this.earnedAmount, claimCoinRequestModel.earnedAmount);
    }

    public final Double getEarnedAmount() {
        return this.earnedAmount;
    }

    public final String getPlaceOfMeasurement() {
        return this.placeOfMeasurement;
    }

    public final String getSampleId() {
        return this.sampleId;
    }

    public final List<String> getSourcesOfNoise() {
        return this.sourcesOfNoise;
    }

    public final String getTypeOfPlace() {
        return this.typeOfPlace;
    }

    public int hashCode() {
        String str = this.sampleId;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.typeOfPlace;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeOfMeasurement;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.sourcesOfNoise;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Double d10 = this.earnedAmount;
        if (d10 != null) {
            i8 = d10.hashCode();
        }
        return hashCode4 + i8;
    }

    public String toString() {
        return "ClaimCoinRequestModel(sampleId=" + this.sampleId + ", typeOfPlace=" + this.typeOfPlace + ", placeOfMeasurement=" + this.placeOfMeasurement + ", sourcesOfNoise=" + this.sourcesOfNoise + ", earnedAmount=" + this.earnedAmount + ')';
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeString(this.sampleId);
        parcel.writeString(this.typeOfPlace);
        parcel.writeString(this.placeOfMeasurement);
        parcel.writeStringList(this.sourcesOfNoise);
        Double d10 = this.earnedAmount;
        if (d10 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d10.doubleValue());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ClaimCoinRequestModel(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.List r8, java.lang.Double r9, int r10, sf.e r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Double, int, sf.e):void");
    }
}
