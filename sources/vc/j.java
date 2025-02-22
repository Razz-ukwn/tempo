package vc;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import java.io.Serializable;
import s0.b0;

public final class j implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final VerifyNumberRequestModel f16410a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16411b = "phone";

    /* renamed from: c  reason: collision with root package name */
    public final int f16412c = R.id.action_forgotPasswordBottomSheet_to_verificationBottomSheet;

    public j(VerifyNumberRequestModel verifyNumberRequestModel) {
        this.f16410a = verifyNumberRequestModel;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<VerifyNumberRequestModel> cls = VerifyNumberRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        VerifyNumberRequestModel verifyNumberRequestModel = this.f16410a;
        if (isAssignableFrom) {
            sf.j.d(verifyNumberRequestModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("numberDetail", verifyNumberRequestModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            sf.j.d(verifyNumberRequestModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("numberDetail", (Serializable) verifyNumberRequestModel);
        } else {
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putString("registrationType", this.f16411b);
        return bundle;
    }

    public final int b() {
        return this.f16412c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return sf.j.a(this.f16410a, jVar.f16410a) && sf.j.a(this.f16411b, jVar.f16411b);
    }

    public final int hashCode() {
        return this.f16411b.hashCode() + (this.f16410a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionForgotPasswordBottomSheetToVerificationBottomSheet(numberDetail=");
        sb2.append(this.f16410a);
        sb2.append(", registrationType=");
        return b0.a(sb2, this.f16411b, ')');
    }
}
