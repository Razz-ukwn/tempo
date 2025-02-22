package zc;

import android.os.Bundle;
import android.os.Parcelable;
import b3.f;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import java.io.Serializable;
import sf.j;

public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterUserRequestModel f17937a;

    public k(RegisterUserRequestModel registerUserRequestModel) {
        this.f17937a = registerUserRequestModel;
    }

    public static final k fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(k.class.getClassLoader());
        if (bundle.containsKey("registerUser")) {
            Class<RegisterUserRequestModel> cls = RegisterUserRequestModel.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                RegisterUserRequestModel registerUserRequestModel = (RegisterUserRequestModel) bundle.get("registerUser");
                if (registerUserRequestModel != null) {
                    return new k(registerUserRequestModel);
                }
                throw new IllegalArgumentException("Argument \"registerUser\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        throw new IllegalArgumentException("Required argument \"registerUser\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && j.a(this.f17937a, ((k) obj).f17937a);
    }

    public final int hashCode() {
        return this.f17937a.hashCode();
    }

    public final String toString() {
        return "RegisterOtpVerificationBottomSheetArgs(registerUser=" + this.f17937a + ')';
    }
}
