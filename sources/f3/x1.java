package f3;

import f3.y0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.i;
import sf.j;

public final class x1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<y0<T>> f8543a;

    /* renamed from: b  reason: collision with root package name */
    public final t2 f8544b;

    public static final class a implements t2 {
        public final void a(v2 v2Var) {
        }
    }

    static {
        new x1(new i(y0.b.f8549g), new a());
    }

    public x1(f<? extends y0<T>> fVar, t2 t2Var) {
        j.f(fVar, "flow");
        j.f(t2Var, "receiver");
        this.f8543a = fVar;
        this.f8544b = t2Var;
    }
}
