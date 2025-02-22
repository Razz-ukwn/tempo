package s0;

import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class o0 implements c1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14397b = a.f14399a;

    /* renamed from: a  reason: collision with root package name */
    public final w0 f14398a;

    public static final class a extends k implements l<o0, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14399a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            o0 o0Var = (o0) obj;
            j.f(o0Var, "it");
            if (o0Var.j()) {
                o0Var.f14398a.u();
            }
            return m.f8717a;
        }
    }

    public o0(w0 w0Var) {
        j.f(w0Var, "observerNode");
        this.f14398a = w0Var;
    }

    public final boolean j() {
        return this.f14398a.s().F;
    }
}
