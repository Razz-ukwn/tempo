package g0;

import ff.e;

public enum r {
    f8777a,
    f8778b,
    f8779c,
    f8780d;

    /* access modifiers changed from: public */
    r() {
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                throw new e();
            }
        }
        return false;
    }
}
