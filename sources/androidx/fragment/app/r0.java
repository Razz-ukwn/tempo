package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import r3.f;

public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final t0 f2131a = new t0();

    /* renamed from: b  reason: collision with root package name */
    public static final x0 f2132b;

    static {
        x0 x0Var;
        try {
            x0Var = f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            x0Var = null;
        }
        f2132b = x0Var;
    }

    public static void a(ArrayList<View> arrayList, int i8) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i8);
            }
        }
    }
}
