package gd;

import android.os.Bundle;
import android.os.Parcelable;
import b3.f;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import java.io.Serializable;
import sf.j;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final ClaimCoinRequestModel f8951a;

    public a(ClaimCoinRequestModel claimCoinRequestModel) {
        this.f8951a = claimCoinRequestModel;
    }

    public static final a fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(a.class.getClassLoader());
        if (bundle.containsKey("claimCoin")) {
            Class<ClaimCoinRequestModel> cls = ClaimCoinRequestModel.class;
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                ClaimCoinRequestModel claimCoinRequestModel = (ClaimCoinRequestModel) bundle.get("claimCoin");
                if (claimCoinRequestModel != null) {
                    return new a(claimCoinRequestModel);
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
        return (obj instanceof a) && j.a(this.f8951a, ((a) obj).f8951a);
    }

    public final int hashCode() {
        return this.f8951a.hashCode();
    }

    public final String toString() {
        return "CalimCoinLoacationBottomSheetArgs(claimCoin=" + this.f8951a + ')';
    }
}
