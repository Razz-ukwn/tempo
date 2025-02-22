package hd;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import java.io.Serializable;
import sf.j;

public final class d implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final ClaimCoinRequestModel f9304a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9305b = R.id.action_claimCoinPlaceBottomSheet_to_claimCoinSourceBottomSheet;

    public d(ClaimCoinRequestModel claimCoinRequestModel) {
        this.f9304a = claimCoinRequestModel;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<ClaimCoinRequestModel> cls = ClaimCoinRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        ClaimCoinRequestModel claimCoinRequestModel = this.f9304a;
        if (isAssignableFrom) {
            j.d(claimCoinRequestModel, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("claimCoin", claimCoinRequestModel);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            j.d(claimCoinRequestModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("claimCoin", (Serializable) claimCoinRequestModel);
        } else {
            throw new UnsupportedOperationException(cls.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public final int b() {
        return this.f9305b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && j.a(this.f9304a, ((d) obj).f9304a);
    }

    public final int hashCode() {
        return this.f9304a.hashCode();
    }

    public final String toString() {
        return "ActionClaimCoinPlaceBottomSheetToClaimCoinSourceBottomSheet(claimCoin=" + this.f9304a + ')';
    }
}
