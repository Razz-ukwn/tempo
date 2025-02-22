package ce;

import android.content.Context;
import b1.b;
import cb.d;
import d2.f1;
import java.util.Set;
import sf.j;

public final class a {

    /* renamed from: ce.a$a  reason: collision with other inner class name */
    public interface C0064a {
        Set<Boolean> a();
    }

    public static boolean a(Context context) {
        j.f(context, "context");
        Set<Boolean> a10 = ((C0064a) d.E(C0064a.class, b.d(context.getApplicationContext()))).a();
        f1.n(a10.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (a10.isEmpty()) {
            return true;
        }
        return a10.iterator().next().booleanValue();
    }
}
