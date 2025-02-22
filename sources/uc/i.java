package uc;

import android.os.Bundle;
import android.os.Parcelable;
import b3.f;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import java.io.Serializable;
import sf.j;

public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterUserRequestModel f16016a;

    public i(RegisterUserRequestModel registerUserRequestModel) {
        this.f16016a = registerUserRequestModel;
    }

    public static final i fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(i.class.getClassLoader());
        if (bundle.containsKey("registerUser")) {
            Class<RegisterUserRequestModel> cls = RegisterUserRequestModel.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                RegisterUserRequestModel registerUserRequestModel = (RegisterUserRequestModel) bundle.get("registerUser");
                if (registerUserRequestModel != null) {
                    return new i(registerUserRequestModel);
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
        return (obj instanceof i) && j.a(this.f16016a, ((i) obj).f16016a);
    }

    public final int hashCode() {
        return this.f16016a.hashCode();
    }

    public final String toString() {
        return "EmailBottomSheetArgs(registerUser=" + this.f16016a + ')';
    }
}
