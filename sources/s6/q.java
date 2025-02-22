package s6;

import android.os.Bundle;

public final class q extends r<Void> {
    public q(int i8, Bundle bundle) {
        super(i8, 2, bundle);
    }

    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d((Bundle) null);
        } else {
            c(new s("Invalid response to one way request", (SecurityException) null));
        }
    }

    public final boolean b() {
        return true;
    }
}
