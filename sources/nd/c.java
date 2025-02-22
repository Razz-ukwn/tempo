package nd;

import android.os.Bundle;
import b3.f;
import sf.j;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11893a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11894b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11895c;

    public c(boolean z10, boolean z11, boolean z12) {
        this.f11893a = z10;
        this.f11894b = z11;
        this.f11895c = z12;
    }

    public static final c fromBundle(Bundle bundle) {
        j.f(bundle, "bundle");
        bundle.setClassLoader(c.class.getClassLoader());
        if (bundle.containsKey("isCapReached")) {
            boolean z10 = bundle.getBoolean("isCapReached");
            if (bundle.containsKey("hasMicInterrupt")) {
                boolean z11 = bundle.getBoolean("hasMicInterrupt");
                if (bundle.containsKey("isSpeedCapReached")) {
                    return new c(z10, z11, bundle.getBoolean("isSpeedCapReached"));
                }
                throw new IllegalArgumentException("Required argument \"isSpeedCapReached\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Required argument \"hasMicInterrupt\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"isCapReached\" is missing and does not have an android:defaultValue");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (nd.c) r5;
        r1 = r5.f11893a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof nd.c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            nd.c r5 = (nd.c) r5
            boolean r1 = r5.f11893a
            boolean r3 = r4.f11893a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.f11894b
            boolean r3 = r5.f11894b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.f11895c
            boolean r5 = r5.f11895c
            if (r1 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        boolean z10 = true;
        boolean z11 = this.f11893a;
        if (z11) {
            z11 = true;
        }
        int i8 = (z11 ? 1 : 0) * true;
        boolean z12 = this.f11894b;
        if (z12) {
            z12 = true;
        }
        int i10 = (i8 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f11895c;
        if (!z13) {
            z10 = z13;
        }
        return i10 + (z10 ? 1 : 0);
    }

    public final String toString() {
        return "PopupBottomSheetArgs(isCapReached=" + this.f11893a + ", hasMicInterrupt=" + this.f11894b + ", isSpeedCapReached=" + this.f11895c + ')';
    }
}
