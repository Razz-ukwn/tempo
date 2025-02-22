package ed;

import android.os.Bundle;
import b3.a0;
import com.quickkonnect.silencio.R;
import s0.b0;
import sf.j;

public final class n implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f7967a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7968b = R.id.action_verificationBottomSheet_to_resetPasswordBottomSheet;

    public n(String str) {
        this.f7967a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("userId", this.f7967a);
        return bundle;
    }

    public final int b() {
        return this.f7968b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && j.a(this.f7967a, ((n) obj).f7967a);
    }

    public final int hashCode() {
        return this.f7967a.hashCode();
    }

    public final String toString() {
        return b0.a(new StringBuilder("ActionVerificationBottomSheetToResetPasswordBottomSheet(userId="), this.f7967a, ')');
    }
}
