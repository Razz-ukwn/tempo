package tc;

import android.os.Bundle;
import android.os.Parcelable;
import b3.f;
import b3.x;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import java.io.Serializable;
import sf.j;

public final class o implements f {

    /* renamed from: a  reason: collision with root package name */
    public final RegisterUserRequestModel f15591a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15592b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15593c;

    public o(RegisterUserRequestModel registerUserRequestModel, String str, boolean z10) {
        this.f15591a = registerUserRequestModel;
        this.f15592b = str;
        this.f15593c = z10;
    }

    public static final o fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(o.class.getClassLoader());
        if (bundle.containsKey("registerUser")) {
            Class<RegisterUserRequestModel> cls = RegisterUserRequestModel.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                RegisterUserRequestModel registerUserRequestModel = (RegisterUserRequestModel) bundle.get("registerUser");
                if (registerUserRequestModel == null) {
                    throw new IllegalArgumentException("Argument \"registerUser\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("email")) {
                    String string = bundle.getString("email");
                    if (string == null) {
                        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
                    } else if (bundle.containsKey("isGoogleLogin")) {
                        return new o(registerUserRequestModel, string, bundle.getBoolean("isGoogleLogin"));
                    } else {
                        throw new IllegalArgumentException("Required argument \"isGoogleLogin\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
        } else {
            throw new IllegalArgumentException("Required argument \"registerUser\" is missing and does not have an android:defaultValue");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return j.a(this.f15591a, oVar.f15591a) && j.a(this.f15592b, oVar.f15592b) && this.f15593c == oVar.f15593c;
    }

    public final int hashCode() {
        int a10 = x.a(this.f15592b, this.f15591a.hashCode() * 31, 31);
        boolean z10 = this.f15593c;
        if (z10) {
            z10 = true;
        }
        return a10 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "CreateAccountBottomSheetArgs(registerUser=" + this.f15591a + ", email=" + this.f15592b + ", isGoogleLogin=" + this.f15593c + ')';
    }
}
