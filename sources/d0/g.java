package d0;

import rf.l;
import rf.p;
import s0.h;
import s0.o0;
import s0.s0;
import sf.j;

public interface g {

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f7176a = new a();

        public final <R> R a(R r10, p<? super R, ? super b, ? extends R> pVar) {
            j.f(pVar, "operation");
            return r10;
        }

        public final boolean b(l<? super b, Boolean> lVar) {
            j.f(lVar, "predicate");
            return true;
        }

        public final g k(g gVar) {
            j.f(gVar, "other");
            return gVar;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    public interface b extends g {
        <R> R a(R r10, p<? super R, ? super b, ? extends R> pVar) {
            j.f(pVar, "operation");
            return pVar.invoke(r10, this);
        }

        boolean b(l<? super b, Boolean> lVar) {
            j.f(lVar, "predicate");
            return lVar.invoke(this).booleanValue();
        }
    }

    public static abstract class c implements h {
        public o0 B;
        public s0 C;
        public boolean D;
        public boolean E;
        public boolean F;

        /* renamed from: a  reason: collision with root package name */
        public final c f7177a = this;

        /* renamed from: b  reason: collision with root package name */
        public int f7178b;

        /* renamed from: c  reason: collision with root package name */
        public int f7179c;

        /* renamed from: d  reason: collision with root package name */
        public c f7180d;

        /* renamed from: e  reason: collision with root package name */
        public c f7181e;

        public void A() {
        }

        public void B() {
        }

        public final c s() {
            return this.f7177a;
        }

        public final void y() {
            if (this.F) {
                if (this.C != null) {
                    A();
                    this.F = false;
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public void z() {
        }
    }

    <R> R a(R r10, p<? super R, ? super b, ? extends R> pVar);

    boolean b(l<? super b, Boolean> lVar);

    g k(g gVar) {
        j.f(gVar, "other");
        return gVar == a.f7176a ? this : new c(this, gVar);
    }
}
