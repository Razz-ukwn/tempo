package ad;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import b3.x;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import java.io.Serializable;
import sf.j;

public final class p implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterUserRequestModel f316a;

    /* renamed from: b  reason: collision with root package name */
    public final String f317b = "";

    /* renamed from: c  reason: collision with root package name */
    public final boolean f318c = false;

    /* renamed from: d  reason: collision with root package name */
    public final int f319d = R.id.action_registerEmailOtpVerificationBottomSheet_to_createAccountBottomSheet;

    public p(RegisterUserRequestModel registerUserRequestModel) {
        this.f316a = registerUserRequestModel;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<RegisterUserRequestModel> cls = RegisterUserRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        RegisterUserRequestModel registerUserRequestModel = this.f316a;
        if (isAssignableFrom) {
            j.d(registerUserRequestModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("registerUser", registerUserRequestModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            j.d(registerUserRequestModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("registerUser", (Serializable) registerUserRequestModel);
        } else {
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putString("email", this.f317b);
        bundle.putBoolean("isGoogleLogin", this.f318c);
        return bundle;
    }

    public final int b() {
        return this.f319d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return j.a(this.f316a, pVar.f316a) && j.a(this.f317b, pVar.f317b) && this.f318c == pVar.f318c;
    }

    public final int hashCode() {
        int a10 = x.a(this.f317b, this.f316a.hashCode() * 31, 31);
        boolean z10 = this.f318c;
        if (z10) {
            z10 = true;
        }
        return a10 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "ActionRegisterEmailOtpVerificationBottomSheetToCreateAccountBottomSheet(registerUser=" + this.f316a + ", email=" + this.f317b + ", isGoogleLogin=" + this.f318c + ')';
    }
}
