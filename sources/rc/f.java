package rc;

import android.os.Bundle;
import android.os.Parcelable;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import java.io.Serializable;
import sf.j;

public final class f implements b3.f {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterUserRequestModel f14201a;

    public f(RegisterUserRequestModel registerUserRequestModel) {
        this.f14201a = registerUserRequestModel;
    }

    public static final f fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(f.class.getClassLoader());
        if (bundle.containsKey("registerUser")) {
            Class<RegisterUserRequestModel> cls = RegisterUserRequestModel.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                RegisterUserRequestModel registerUserRequestModel = (RegisterUserRequestModel) bundle.get("registerUser");
                if (registerUserRequestModel != null) {
                    return new f(registerUserRequestModel);
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
        return (obj instanceof f) && j.a(this.f14201a, ((f) obj).f14201a);
    }

    public final int hashCode() {
        return this.f14201a.hashCode();
    }

    public final String toString() {
        return "ChoosePasswordBottomSheetArgs(registerUser=" + this.f14201a + ')';
    }
}
