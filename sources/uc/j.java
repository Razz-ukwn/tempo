package uc;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import java.io.Serializable;

public final class j implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterUserRequestModel f16017a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16018b = R.id.action_emailBottomSheet_to_registerEmailOtpVerificationBottomSheet;

    public j(RegisterUserRequestModel registerUserRequestModel) {
        this.f16017a = registerUserRequestModel;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<RegisterUserRequestModel> cls = RegisterUserRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        RegisterUserRequestModel registerUserRequestModel = this.f16017a;
        if (isAssignableFrom) {
            sf.j.d(registerUserRequestModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("registerUser", registerUserRequestModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            sf.j.d(registerUserRequestModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("registerUser", (Serializable) registerUserRequestModel);
        } else {
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final int b() {
        return this.f16018b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && sf.j.a(this.f16017a, ((j) obj).f16017a);
    }

    public final int hashCode() {
        return this.f16017a.hashCode();
    }

    public final String toString() {
        return "ActionEmailBottomSheetToRegisterEmailOtpVerificationBottomSheet(registerUser=" + this.f16017a + ')';
    }
}
