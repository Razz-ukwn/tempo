package md;

import android.os.Bundle;
import b3.a0;
import com.quickkonnect.silencio.R;
import sf.j;

public final class u0 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11430a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11431b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11432c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11433d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11434e = R.id.action_measuringBottomSheet_to_claimCoinCongratulationBottomSheet;

    public u0(String str, boolean z10, boolean z11, boolean z12) {
        this.f11430a = str;
        this.f11431b = z10;
        this.f11432c = z11;
        this.f11433d = z12;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("earnedCoins", this.f11430a);
        bundle.putBoolean("isCapReached", this.f11431b);
        bundle.putBoolean("hasMicInterrupt", this.f11432c);
        bundle.putBoolean("isSpeedCapReached", this.f11433d);
        return bundle;
    }

    public final int b() {
        return this.f11434e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return j.a(this.f11430a, u0Var.f11430a) && this.f11431b == u0Var.f11431b && this.f11432c == u0Var.f11432c && this.f11433d == u0Var.f11433d;
    }

    public final int hashCode() {
        int hashCode = this.f11430a.hashCode() * 31;
        boolean z10 = true;
        boolean z11 = this.f11431b;
        if (z11) {
            z11 = true;
        }
        int i8 = (hashCode + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.f11432c;
        if (z12) {
            z12 = true;
        }
        int i10 = (i8 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f11433d;
        if (!z13) {
            z10 = z13;
        }
        return i10 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "ActionMeasuringBottomSheetToClaimCoinCongratulationBottomSheet(earnedCoins=" + this.f11430a + ", isCapReached=" + this.f11431b + ", hasMicInterrupt=" + this.f11432c + ", isSpeedCapReached=" + this.f11433d + ')';
    }
}
