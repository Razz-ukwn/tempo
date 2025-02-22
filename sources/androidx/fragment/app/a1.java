package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class a1 extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final String f1902a = "FragmentManager";

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f1903b = new StringBuilder(128);

    public final void c() {
        StringBuilder sb2 = this.f1903b;
        if (sb2.length() > 0) {
            Log.d(this.f1902a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    public final void close() {
        c();
    }

    public final void flush() {
        c();
    }

    public final void write(char[] cArr, int i8, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c3 = cArr[i8 + i11];
            if (c3 == 10) {
                c();
            } else {
                this.f1903b.append(c3);
            }
        }
    }
}
