package b3;

import b2.c;
import b3.m0;
import cb.d;
import java.util.Iterator;
import java.util.List;
import sf.j;

@m0.b("navigation")
public class c0 extends m0<b0> {

    /* renamed from: c  reason: collision with root package name */
    public final o0 f3037c;

    public c0(o0 o0Var) {
        this.f3037c = o0Var;
    }

    public final z a() {
        return new b0(this);
    }

    public final void d(List list, f0 f0Var) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            b0 b0Var = (b0) jVar.f3084b;
            int i8 = b0Var.H;
            String str2 = b0Var.J;
            if (!((i8 == 0 && str2 == null) ? false : true)) {
                StringBuilder sb2 = new StringBuilder("no start destination defined via app:startDestination for ");
                int i10 = b0Var.D;
                if (i10 != 0) {
                    str = b0Var.f3203c;
                    if (str == null) {
                        str = String.valueOf(i10);
                    }
                } else {
                    str = "the root navigation";
                }
                sb2.append(str);
                throw new IllegalStateException(sb2.toString().toString());
            }
            z k10 = str2 != null ? b0Var.k(str2, false) : b0Var.j(i8, false);
            if (k10 == null) {
                if (b0Var.I == null) {
                    String str3 = b0Var.J;
                    if (str3 == null) {
                        str3 = String.valueOf(b0Var.H);
                    }
                    b0Var.I = str3;
                }
                String str4 = b0Var.I;
                j.c(str4);
                throw new IllegalArgumentException(c.a("navigation destination ", str4, " is not a direct child of this NavGraph"));
            }
            this.f3037c.b(k10.f3201a).d(d.O(b().a(k10, k10.b(jVar.f3085c))), f0Var);
        }
    }
}
