package ed;

import android.os.Bundle;
import android.os.Parcelable;
import b3.f;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import java.io.Serializable;
import s0.b0;
import sf.j;

public final class m implements f {

    /* renamed from: a  reason: collision with root package name */
    public final VerifyNumberRequestModel f7965a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7966b;

    public m(VerifyNumberRequestModel verifyNumberRequestModel, String str) {
        this.f7965a = verifyNumberRequestModel;
        this.f7966b = str;
    }

    public static final m fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(m.class.getClassLoader());
        if (bundle.containsKey("numberDetail")) {
            Class<VerifyNumberRequestModel> cls = VerifyNumberRequestModel.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                VerifyNumberRequestModel verifyNumberRequestModel = (VerifyNumberRequestModel) bundle.get("numberDetail");
                if (verifyNumberRequestModel == null) {
                    throw new IllegalArgumentException("Argument \"numberDetail\" is marked as non-null but was passed a null value.");
                } else if (bundle.containsKey("registrationType")) {
                    String string = bundle.getString("registrationType");
                    if (string != null) {
                        return new m(verifyNumberRequestModel, string);
                    }
                    throw new IllegalArgumentException("Argument \"registrationType\" is marked as non-null but was passed a null value.");
                } else {
                    throw new IllegalArgumentException("Required argument \"registrationType\" is missing and does not have an android:defaultValue");
                }
            } else {
                throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
        } else {
            throw new IllegalArgumentException("Required argument \"numberDetail\" is missing and does not have an android:defaultValue");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return j.a(this.f7965a, mVar.f7965a) && j.a(this.f7966b, mVar.f7966b);
    }

    public final int hashCode() {
        return this.f7966b.hashCode() + (this.f7965a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationBottomSheetArgs(numberDetail=");
        sb2.append(this.f7965a);
        sb2.append(", registrationType=");
        return b0.a(sb2, this.f7966b, ')');
    }
}
