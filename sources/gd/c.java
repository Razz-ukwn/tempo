package gd;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import java.io.Serializable;
import sf.j;

public final class c implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final ClaimCoinRequestModel f8954a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8955b = R.id.action_calimCoinLoacationBottomSheet_to_claimCoinPlaceOutdoorBottomSheet;

    public c(ClaimCoinRequestModel claimCoinRequestModel) {
        this.f8954a = claimCoinRequestModel;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<ClaimCoinRequestModel> cls = ClaimCoinRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        ClaimCoinRequestModel claimCoinRequestModel = this.f8954a;
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
        return this.f8955b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && j.a(this.f8954a, ((c) obj).f8954a);
    }

    public final int hashCode() {
        return this.f8954a.hashCode();
    }

    public final String toString() {
        return "ActionCalimCoinLoacationBottomSheetToClaimCoinPlaceOutdoorBottomSheet(claimCoin=" + this.f8954a + ')';
    }
}
