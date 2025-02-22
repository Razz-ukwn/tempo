package com.quickkonnect.silencio.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import bb.b;
import java.util.List;
import java.util.Map;
import sf.j;

public class BaseResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BaseResponse> CREATOR = new Creator();
    @b("errorData")
    private final Map<String, List<String>> errors;
    @b("message")
    private final String message;
    @b("status")
    private final String status;

    public static final class Creator implements Parcelable.Creator<BaseResponse> {
        public final BaseResponse createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            parcel.readInt();
            return new BaseResponse();
        }

        public final BaseResponse[] newArray(int i8) {
            return new BaseResponse[i8];
        }
    }

    public int describeContents() {
        return 0;
    }

    public final Map<String, List<String>> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStatus() {
        return this.status;
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeInt(1);
    }
}
