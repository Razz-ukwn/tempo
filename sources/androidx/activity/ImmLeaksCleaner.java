package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;

final class ImmLeaksCleaner implements n {

    /* renamed from: a  reason: collision with root package name */
    public static int f562a;

    public ImmLeaksCleaner() {
        throw null;
    }

    public final void d(p pVar, j.a aVar) {
        if (aVar == j.a.ON_DESTROY) {
            if (f562a == 0) {
                Class<InputMethodManager> cls = InputMethodManager.class;
                try {
                    f562a = 2;
                    cls.getDeclaredField("mServedView").setAccessible(true);
                    cls.getDeclaredField("mNextServedView").setAccessible(true);
                    cls.getDeclaredField("mH").setAccessible(true);
                    f562a = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (f562a == 1) {
                throw null;
            }
        }
    }
}
