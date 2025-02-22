package t;

import ag.g0;
import ag.n1;
import b0.g;
import b0.h;
import d2.f1;
import ff.m;
import java.util.ArrayList;
import java.util.Set;
import jf.d;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import rf.p;
import rf.q;
import sf.j;
import sf.k;
import t.z1;
import v.c;

@e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {898}, m = "invokeSuspend")
public final class e2 extends i implements p<g0, d<? super m>, Object> {
    public final /* synthetic */ e1 B;

    /* renamed from: a  reason: collision with root package name */
    public g f15038a;

    /* renamed from: b  reason: collision with root package name */
    public int f15039b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f15040c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z1 f15041d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q<g0, e1, d<? super m>, Object> f15042e;

    @e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {899}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f15043a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f15044b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ q<g0, e1, d<? super m>, Object> f15045c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e1 f15046d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(q<? super g0, ? super e1, ? super d<? super m>, ? extends Object> qVar, e1 e1Var, d<? super a> dVar) {
            super(2, dVar);
            this.f15045c = qVar;
            this.f15046d = e1Var;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f15045c, this.f15046d, dVar);
            aVar.f15044b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f15043a;
            if (i8 == 0) {
                cb.b.J(obj);
                this.f15043a = 1;
                if (this.f15045c.e((g0) this.f15044b, this.f15046d, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8717a;
        }
    }

    public static final class b extends k implements p<Set<? extends Object>, h, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z1 f15047a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(z1 z1Var) {
            super(2);
            this.f15047a = z1Var;
        }

        public final Object invoke(Object obj, Object obj2) {
            ag.k<m> kVar;
            Set set = (Set) obj;
            j.f(set, "changed");
            j.f((h) obj2, "<anonymous parameter 1>");
            z1 z1Var = this.f15047a;
            synchronized (z1Var.f15298b) {
                if (((z1.d) z1Var.f15310o.getValue()).compareTo(z1.d.f15318e) >= 0) {
                    z1Var.f15302f.addAll(set);
                    kVar = z1Var.o();
                } else {
                    kVar = null;
                }
            }
            if (kVar != null) {
                kVar.resumeWith(m.f8717a);
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e2(z1 z1Var, q<? super g0, ? super e1, ? super d<? super m>, ? extends Object> qVar, e1 e1Var, d<? super e2> dVar) {
        super(2, dVar);
        this.f15041d = z1Var;
        this.f15042e = qVar;
        this.B = e1Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        e2 e2Var = new e2(this.f15041d, this.f15042e, this.B, dVar);
        e2Var.f15040c = obj;
        return e2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e2) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        n1 n1Var;
        g gVar;
        y0 y0Var;
        c cVar;
        Object remove;
        y0 y0Var2;
        c cVar2;
        Object remove2;
        y0 y0Var3;
        c cVar3;
        Object t2;
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f15039b;
        if (i8 == 0) {
            cb.b.J(obj);
            n1Var = cb.d.G(((g0) this.f15040c).f0());
            z1 z1Var = this.f15041d;
            synchronized (z1Var.f15298b) {
                Throwable th = z1Var.f15300d;
                if (th != null) {
                    throw th;
                } else if (((z1.d) z1Var.f15310o.getValue()).compareTo(z1.d.f15315b) <= 0) {
                    throw new IllegalStateException("Recomposer shut down".toString());
                } else if (z1Var.f15299c == null) {
                    z1Var.f15299c = n1Var;
                    z1Var.o();
                } else {
                    throw new IllegalStateException("Recomposer already running".toString());
                }
            }
            b bVar = new b(this.f15041d);
            b0.m.f(b0.m.f2940a);
            synchronized (b0.m.f2942c) {
                b0.m.f2946g.add(bVar);
            }
            g gVar2 = new g(bVar);
            y0 y0Var4 = z1.f15295s;
            z1.c cVar4 = this.f15041d.f15313r;
            do {
                y0Var3 = z1.f15295s;
                cVar3 = (c) y0Var3.getValue();
                t2 = cVar3.t(cVar4);
                if (cVar3 != t2) {
                    Object obj2 = m9.b.f11323d;
                    if (t2 == null) {
                        t2 = obj2;
                    }
                }
                break;
            } while (!y0Var3.i(cVar3, t2));
            try {
                break;
                z1 z1Var2 = this.f15041d;
                synchronized (z1Var2.f15298b) {
                    ArrayList arrayList = z1Var2.f15301e;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((m0) arrayList.get(i10)).w();
                    }
                    m mVar = m.f8717a;
                }
                a aVar2 = new a(this.f15042e, this.B, (d<? super a>) null);
                this.f15040c = n1Var;
                this.f15038a = gVar2;
                this.f15039b = 1;
                if (f1.v(aVar2, this) == aVar) {
                    return aVar;
                }
                gVar = gVar2;
            } catch (Throwable th2) {
                th = th2;
                gVar = gVar2;
                gVar.a();
                z1 z1Var3 = this.f15041d;
                synchronized (z1Var3.f15298b) {
                    if (z1Var3.f15299c == n1Var) {
                        z1Var3.f15299c = null;
                    }
                    z1Var3.o();
                }
                y0 y0Var5 = z1.f15295s;
                z1.c cVar5 = this.f15041d.f15313r;
                do {
                    y0Var = z1.f15295s;
                    cVar = (c) y0Var.getValue();
                    remove = cVar.remove(cVar5);
                    if (cVar == remove) {
                        break;
                    }
                    Object obj3 = m9.b.f11323d;
                    if (remove == null) {
                        remove = obj3;
                    }
                } while (!y0Var.i(cVar, remove));
                throw th;
            }
        } else if (i8 == 1) {
            gVar = this.f15038a;
            n1Var = (n1) this.f15040c;
            try {
                cb.b.J(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gVar.a();
        z1 z1Var4 = this.f15041d;
        synchronized (z1Var4.f15298b) {
            if (z1Var4.f15299c == n1Var) {
                z1Var4.f15299c = null;
            }
            z1Var4.o();
        }
        y0 y0Var6 = z1.f15295s;
        z1.c cVar6 = this.f15041d.f15313r;
        do {
            y0Var2 = z1.f15295s;
            cVar2 = (c) y0Var2.getValue();
            remove2 = cVar2.remove(cVar6);
            if (cVar2 == remove2) {
                break;
            }
            Object obj4 = m9.b.f11323d;
            if (remove2 == null) {
                remove2 = obj4;
            }
        } while (!y0Var2.i(cVar2, remove2));
        return m.f8717a;
    }
}
