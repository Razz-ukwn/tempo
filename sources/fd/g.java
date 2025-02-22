package fd;

import android.os.Bundle;
import b3.a0;
import com.quickkonnect.silencio.R;

public final class g implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8697a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8698b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8699c;

    public g(boolean z10, boolean z11, boolean z12) {
        this.f8697a = z10;
        this.f8698b = z11;
        this.f8699c = z12;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isCapReached", this.f8697a);
        bundle.putBoolean("hasMicInterrupt", this.f8698b);
        bundle.putBoolean("isSpeedCapReached", this.f8699c);
        return bundle;
    }

    public final int b() {
        return R.id.action_claimCoinCongratulationBottomSheet_to_popupBottomSheet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (fd.g) r5;
        r1 = r5.f8697a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof fd.g
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            fd.g r5 = (fd.g) r5
            boolean r1 = r5.f8697a
            boolean r3 = r4.f8697a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.f8698b
            boolean r3 = r5.f8698b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.f8699c
            boolean r5 = r5.f8699c
            if (r1 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        boolean z10 = true;
        boolean z11 = this.f8697a;
        if (z11) {
            z11 = true;
        }
        int i8 = (z11 ? 1 : 0) * true;
        boolean z12 = this.f8698b;
        if (z12) {
            z12 = true;
        }
        int i10 = (i8 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f8699c;
        if (!z13) {
            z10 = z13;
        }
        return i10 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "ActionClaimCoinCongratulationBottomSheetToPopupBottomSheet(isCapReached=" + this.f8697a + ", hasMicInterrupt=" + this.f8698b + ", isSpeedCapReached=" + this.f8699c + ')';
    }
}
