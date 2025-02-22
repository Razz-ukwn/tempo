package q7;

import java.util.HashSet;
import o.a;

public final class b extends n6 {
    public a B;
    public Long C;
    public Long D;

    /* renamed from: d  reason: collision with root package name */
    public String f12908d;

    /* renamed from: e  reason: collision with root package name */
    public HashSet f12909e;

    public b(t6 t6Var) {
        super(t6Var);
    }

    public final boolean l() {
        return false;
    }

    public final f7 m(Integer num) {
        if (this.B.containsKey(num)) {
            return (f7) this.B.getOrDefault(num, null);
        }
        f7 f7Var = new f7(this, this.f12908d);
        this.B.put(num, f7Var);
        return f7Var;
    }
}
