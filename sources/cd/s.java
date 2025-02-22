package cd;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import java.io.Serializable;
import sf.j;

public final class s implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterUserRequestModel f3996a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3997b = R.id.action_registerBottomSheet_to_phoneNumberBottomSheet;

    public s(RegisterUserRequestModel registerUserRequestModel) {
        this.f3996a = registerUserRequestModel;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<RegisterUserRequestModel> cls = RegisterUserRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        RegisterUserRequestModel registerUserRequestModel = this.f3996a;
        if (isAssignableFrom) {
            j.d(registerUserRequestModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("registerUser", registerUserRequestModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            j.d(registerUserRequestModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("registerUser", (Serializable) registerUserRequestModel);
        } else {
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final int b() {
        return this.f3997b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && j.a(this.f3996a, ((s) obj).f3996a);
    }

    public final int hashCode() {
        return this.f3996a.hashCode();
    }

    public final String toString() {
        return "ActionRegisterBottomSheetToPhoneNumberBottomSheet(registerUser=" + this.f3996a + ')';
    }
}
