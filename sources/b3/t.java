package b3;

import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import sf.j;

public final class t extends j0 implements i0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f3172e = new a();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f3173d = new LinkedHashMap();

    public static final class a implements m0.b {
        public final <T extends j0> T a(Class<T> cls) {
            return new t();
        }
    }

    public final o0 a(String str) {
        j.f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f3173d;
        o0 o0Var = (o0) linkedHashMap.get(str);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0();
        linkedHashMap.put(str, o0Var2);
        return o0Var2;
    }

    public final void c() {
        LinkedHashMap linkedHashMap = this.f3173d;
        for (o0 a10 : linkedHashMap.values()) {
            a10.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f3173d.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        j.e(sb3, "sb.toString()");
        return sb3;
    }
}
