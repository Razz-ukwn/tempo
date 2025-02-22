package com.quickkonnect.silencio.models.request.auth;

import android.os.Parcel;
import android.os.Parcelable;
import s0.b0;
import sf.e;
import sf.j;

public final class VerifyEmailRequestModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VerifyEmailRequestModel> CREATOR = new Creator();
    private final String code;
    private final String email;

    public static final class Creator implements Parcelable.Creator<VerifyEmailRequestModel> {
        public final VerifyEmailRequestModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new VerifyEmailRequestModel(parcel.readString(), parcel.readString());
        }

        public final VerifyEmailRequestModel[] newArray(int i8) {
            return new VerifyEmailRequestModel[i8];
        }
    }

    public VerifyEmailRequestModel() {
        this((String) null, (String) null, 3, (e) null);
    }

    public VerifyEmailRequestModel(String str, String str2) {
        this.email = str;
        this.code = str2;
    }

    public static /* synthetic */ VerifyEmailRequestModel copy$default(VerifyEmailRequestModel verifyEmailRequestModel, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = verifyEmailRequestModel.email;
        }
        if ((i8 & 2) != 0) {
            str2 = verifyEmailRequestModel.code;
        }
        return verifyEmailRequestModel.copy(str, str2);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.code;
    }

    public final VerifyEmailRequestModel copy(String str, String str2) {
        return new VerifyEmailRequestModel(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyEmailRequestModel)) {
            return false;
        }
        VerifyEmailRequestModel verifyEmailRequestModel = (VerifyEmailRequestModel) obj;
        return j.a(this.email, verifyEmailRequestModel.email) && j.a(this.code, verifyEmailRequestModel.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        String str = this.email;
        int i8 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return hashCode + i8;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerifyEmailRequestModel(email=");
        sb2.append(this.email);
        sb2.append(", code=");
        return b0.a(sb2, this.code, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeString(this.email);
        parcel.writeString(this.code);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyEmailRequestModel(String str, String str2, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2);
    }
}
