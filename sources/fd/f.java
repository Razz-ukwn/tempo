package fd;

import android.os.Bundle;
import sf.j;

public final class f implements b3.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f8693a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8694b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8695c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8696d;

    public f(String str, boolean z10, boolean z11, boolean z12) {
        this.f8693a = str;
        this.f8694b = z10;
        this.f8695c = z11;
        this.f8696d = z12;
    }

    public static final f fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(f.class.getClassLoader());
        if (bundle.containsKey("earnedCoins")) {
            String string = bundle.getString("earnedCoins");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"earnedCoins\" is marked as non-null but was passed a null value.");
            } else if (bundle.containsKey("isCapReached")) {
                boolean z10 = bundle.getBoolean("isCapReached");
                if (bundle.containsKey("hasMicInterrupt")) {
                    boolean z11 = bundle.getBoolean("hasMicInterrupt");
                    if (bundle.containsKey("isSpeedCapReached")) {
                        return new f(string, z10, z11, bundle.getBoolean("isSpeedCapReached"));
                    }
                    throw new IllegalArgumentException("Required argument \"isSpeedCapReached\" is missing and does not have an android:defaultValue");
                }
                throw new IllegalArgumentException("Required argument \"hasMicInterrupt\" is missing and does not have an android:defaultValue");
            } else {
                throw new IllegalArgumentException("Required argument \"isCapReached\" is missing and does not have an android:defaultValue");
            }
        } else {
            throw new IllegalArgumentException("Required argument \"earnedCoins\" is missing and does not have an android:defaultValue");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return j.a(this.f8693a, fVar.f8693a) && this.f8694b == fVar.f8694b && this.f8695c == fVar.f8695c && this.f8696d == fVar.f8696d;
    }

    public final int hashCode() {
        int hashCode = this.f8693a.hashCode() * 31;
        boolean z10 = true;
        boolean z11 = this.f8694b;
        if (z11) {
            z11 = true;
        }
        int i8 = (hashCode + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.f8695c;
        if (z12) {
            z12 = true;
        }
        int i10 = (i8 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f8696d;
        if (!z13) {
            z10 = z13;
        }
        return i10 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "ClaimCoinCongratulationBottomSheetArgs(earnedCoins=" + this.f8693a + ", isCapReached=" + this.f8694b + ", hasMicInterrupt=" + this.f8695c + ", isSpeedCapReached=" + this.f8696d + ')';
    }
}
