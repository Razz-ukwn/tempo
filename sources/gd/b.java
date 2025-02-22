package gd;

import android.os.Bundle;
import android.os.Parcelable;
import b3.a0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import java.io.Serializable;
import sf.j;

public final class b implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final ClaimCoinRequestModel f8952a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8953b = R.id.action_calimCoinLoacationBottomSheet_to_claimCoinPlaceBottomSheet;

    public b(ClaimCoinRequestModel claimCoinRequestModel) {
        this.f8952a = claimCoinRequestModel;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Class<ClaimCoinRequestModel> cls = ClaimCoinRequestModel.class;
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(cls);
        ClaimCoinRequestModel claimCoinRequestModel = this.f8952a;
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
        return this.f8953b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j.a(this.f8952a, ((b) obj).f8952a);
    }

    public final int hashCode() {
        return this.f8952a.hashCode();
    }

    public final String toString() {
        return "ActionCalimCoinLoacationBottomSheetToClaimCoinPlaceBottomSheet(claimCoin=" + this.f8952a + ')';
    }
}
