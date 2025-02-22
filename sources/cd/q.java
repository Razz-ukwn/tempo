package cd;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import b3.x;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import java.io.Serializable;
import sf.j;

public final class q implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterUserRequestModel f3990a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3991b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3992c = true;

    /* renamed from: d  reason: collision with root package name */
    public final int f3993d = R.id.action_registerBottomSheet_to_createAccountBottomSheet;

    public q(RegisterUserRequestModel registerUserRequestModel, String str) {
        this.f3990a = registerUserRequestModel;
        this.f3991b = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<RegisterUserRequestModel> cls = RegisterUserRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        RegisterUserRequestModel registerUserRequestModel = this.f3990a;
        if (isAssignableFrom) {
            j.d(registerUserRequestModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("registerUser", registerUserRequestModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            j.d(registerUserRequestModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("registerUser", (Serializable) registerUserRequestModel);
        } else {
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putString("email", this.f3991b);
        bundle.putBoolean("isGoogleLogin", this.f3992c);
        return bundle;
    }

    public final int b() {
        return this.f3993d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return j.a(this.f3990a, qVar.f3990a) && j.a(this.f3991b, qVar.f3991b) && this.f3992c == qVar.f3992c;
    }

    public final int hashCode() {
        int a10 = x.a(this.f3991b, this.f3990a.hashCode() * 31, 31);
        boolean z10 = this.f3992c;
        if (z10) {
            z10 = true;
        }
        return a10 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "ActionRegisterBottomSheetToCreateAccountBottomSheet(registerUser=" + this.f3990a + ", email=" + this.f3991b + ", isGoogleLogin=" + this.f3992c + ')';
    }
}
