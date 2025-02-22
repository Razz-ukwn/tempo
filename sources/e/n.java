package e;

import android.app.Dialog;

public class n extends androidx.fragment.app.n {
    public n() {
    }

    public Dialog p0() {
        return new m(q(), this.A0);
    }

    public final void r0(Dialog dialog, int i8) {
        if (dialog instanceof m) {
            m mVar = (m) dialog;
            if (!(i8 == 1 || i8 == 2)) {
                if (i8 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            mVar.e().t(1);
            return;
        }
        super.r0(dialog, i8);
    }

    public n(int i8) {
        super(i8);
    }
}
