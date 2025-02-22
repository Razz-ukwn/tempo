package y1;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import sf.j;

public final class c {
    public static final void a(Bundle bundle, String str, Size size) {
        j.f(bundle, "bundle");
        j.f(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        j.f(bundle, "bundle");
        j.f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
