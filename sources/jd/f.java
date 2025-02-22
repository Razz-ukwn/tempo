package jd;

import android.os.Bundle;
import android.os.Parcelable;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import java.io.Serializable;
import sf.j;

public final class f implements b3.f {

    /* renamed from: a  reason: collision with root package name */
    public final ClaimCoinRequestModel f9984a;

    public f(ClaimCoinRequestModel claimCoinRequestModel) {
        this.f9984a = claimCoinRequestModel;
    }

    public static final f fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(f.class.getClassLoader());
        if (bundle.containsKey("claimCoin")) {
            Class<ClaimCoinRequestModel> cls = ClaimCoinRequestModel.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                ClaimCoinRequestModel claimCoinRequestModel = (ClaimCoinRequestModel) bundle.get("claimCoin");
                if (claimCoinRequestModel != null) {
                    return new f(claimCoinRequestModel);
                }
                throw new IllegalArgumentException("Argument \"claimCoin\" is marked as non-null but was passed a null value.");
            }
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        throw new IllegalArgumentException("Required argument \"claimCoin\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && j.a(this.f9984a, ((f) obj).f9984a);
    }

    public final int hashCode() {
        return this.f9984a.hashCode();
    }

    public final String toString() {
        return "ClaimCoinSourceIndoorBottomSheetArgs(claimCoin=" + this.f9984a + ')';
    }
}
