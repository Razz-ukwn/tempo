package id;

import android.os.Bundle;
import android.os.Parcelable;
import b3.f;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import java.io.Serializable;
import sf.j;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final ClaimCoinRequestModel f9657a;

    public c(ClaimCoinRequestModel claimCoinRequestModel) {
        this.f9657a = claimCoinRequestModel;
    }

    public static final c fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(c.class.getClassLoader());
        if (bundle.containsKey("claimCoin")) {
            Class<ClaimCoinRequestModel> cls = ClaimCoinRequestModel.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                ClaimCoinRequestModel claimCoinRequestModel = (ClaimCoinRequestModel) bundle.get("claimCoin");
                if (claimCoinRequestModel != null) {
                    return new c(claimCoinRequestModel);
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
        return (obj instanceof c) && j.a(this.f9657a, ((c) obj).f9657a);
    }

    public final int hashCode() {
        return this.f9657a.hashCode();
    }

    public final String toString() {
        return "ClaimCoinPlaceOutdoorBottomSheetArgs(claimCoin=" + this.f9657a + ')';
    }
}
