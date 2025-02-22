package zc;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import b3.x;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import java.io.Serializable;
import sf.j;

public final class l implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterUserRequestModel f17938a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17939b = "";

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17940c = false;

    /* renamed from: d  reason: collision with root package name */
    public final int f17941d = R.id.action_registerOtpVerificationBottomSheet_to_createAccountBottomSheet;

    public l(RegisterUserRequestModel registerUserRequestModel) {
        this.f17938a = registerUserRequestModel;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<RegisterUserRequestModel> cls = RegisterUserRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        RegisterUserRequestModel registerUserRequestModel = this.f17938a;
        if (isAssignableFrom) {
            j.d(registerUserRequestModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("registerUser", registerUserRequestModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            j.d(registerUserRequestModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("registerUser", (Serializable) registerUserRequestModel);
        } else {
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putString("email", this.f17939b);
        bundle.putBoolean("isGoogleLogin", this.f17940c);
        return bundle;
    }

    public final int b() {
        return this.f17941d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return j.a(this.f17938a, lVar.f17938a) && j.a(this.f17939b, lVar.f17939b) && this.f17940c == lVar.f17940c;
    }

    public final int hashCode() {
        int a10 = x.a(this.f17939b, this.f17938a.hashCode() * 31, 31);
        boolean z10 = this.f17940c;
        if (z10) {
            z10 = true;
        }
        return a10 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "ActionRegisterOtpVerificationBottomSheetToCreateAccountBottomSheet(registerUser=" + this.f17938a + ", email=" + this.f17939b + ", isGoogleLogin=" + this.f17940c + ')';
    }
}
