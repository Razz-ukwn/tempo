package s6;

import android.os.Bundle;

public final class t extends r<Bundle> {
    public t(int i8, Bundle bundle) {
        super(i8, 1, bundle);
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    public final boolean b() {
        return false;
    }
}
