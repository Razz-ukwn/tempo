package r3;

import android.os.Build;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f13856a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f13857b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f13858c;

    static {
        int i8 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i8 < 28) {
            z10 = false;
        }
        f13858c = z10;
    }
}
