package q;

import cb.b;
import d2.f1;
import ff.m;
import java.util.concurrent.CancellationException;
import jf.d;
import lf.e;
import lf.i;
import rf.l;
import sf.j;
import sf.k;
import sf.r;
import t.n1;

@e(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
public final class a extends i implements l<d<? super h<Object, p>>, Object> {
    public final /* synthetic */ f<Object, p> B;
    public final /* synthetic */ long C;
    public final /* synthetic */ l<b<Object, p>, m> D;

    /* renamed from: a  reason: collision with root package name */
    public k f12633a;

    /* renamed from: b  reason: collision with root package name */
    public r f12634b;

    /* renamed from: c  reason: collision with root package name */
    public int f12635c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b<Object, p> f12636d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f12637e;

    /* renamed from: q.a$a  reason: collision with other inner class name */
    public static final class C0249a extends k implements l<i<Object, p>, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b<Object, p> f12638a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k<Object, p> f12639b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ l<b<Object, p>, m> f12640c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ r f12641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0249a(b<Object, p> bVar, k<Object, p> kVar, l<? super b<Object, p>, m> lVar, r rVar) {
            super(1);
            this.f12638a = bVar;
            this.f12639b = kVar;
            this.f12640c = lVar;
            this.f12641d = rVar;
        }

        public final Object invoke(Object obj) {
            i iVar = (i) obj;
            j.f(iVar, "$this$animate");
            b<Object, p> bVar = this.f12638a;
            j0.e(iVar, bVar.f12648c);
            n1 n1Var = iVar.f12703e;
            T value = n1Var.getValue();
            V v3 = bVar.f12652g;
            V v10 = bVar.f12654i;
            boolean a10 = j.a(v10, v3);
            V v11 = bVar.f12655j;
            if (!a10 || !j.a(v11, bVar.f12653h)) {
                l0<T, V> l0Var = bVar.f12646a;
                p pVar = (p) l0Var.a().invoke(value);
                int b10 = pVar.b();
                boolean z10 = false;
                for (int i8 = 0; i8 < b10; i8++) {
                    if (pVar.a(i8) < v10.a(i8) || pVar.a(i8) > v11.a(i8)) {
                        pVar.e(i8, f1.p(pVar.a(i8), v10.a(i8), v11.a(i8)));
                        z10 = true;
                    }
                }
                if (z10) {
                    value = l0Var.b().invoke(pVar);
                }
            }
            boolean a11 = j.a(value, n1Var.getValue());
            l<b<Object, p>, m> lVar = this.f12640c;
            if (!a11) {
                bVar.f12648c.f12710b.setValue(value);
                this.f12639b.f12710b.setValue(value);
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                iVar.f12707i.setValue(Boolean.FALSE);
                iVar.f12702d.d();
                this.f12641d.f14953a = true;
            } else if (lVar != null) {
                lVar.invoke(bVar);
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b<Object, p> bVar, Object obj, f<Object, p> fVar, long j10, l<? super b<Object, p>, m> lVar, d<? super a> dVar) {
        super(1, dVar);
        this.f12636d = bVar;
        this.f12637e = obj;
        this.B = fVar;
        this.C = j10;
        this.D = lVar;
    }

    public final d<m> create(d<?> dVar) {
        return new a(this.f12636d, this.f12637e, this.B, this.C, this.D, dVar);
    }

    public final Object invoke(Object obj) {
        return ((a) create((d) obj)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        k kVar;
        r rVar;
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f12635c;
        int i10 = 1;
        b<Object, p> bVar = this.f12636d;
        if (i8 == 0) {
            b.J(obj);
            k<T, V> kVar2 = bVar.f12648c;
            V v3 = (p) bVar.f12646a.a().invoke(this.f12637e);
            kVar2.getClass();
            j.f(v3, "<set-?>");
            kVar2.f12711c = v3;
            bVar.f12650e.setValue(this.B.g());
            bVar.f12649d.setValue(Boolean.TRUE);
            k<T, V> kVar3 = bVar.f12648c;
            k kVar4 = new k(kVar3.f12709a, kVar3.getValue(), b.t(kVar3.f12711c), kVar3.f12712d, Long.MIN_VALUE, kVar3.B);
            r rVar2 = new r();
            f<Object, p> fVar = this.B;
            long j10 = this.C;
            C0249a aVar2 = new C0249a(bVar, kVar4, this.D, rVar2);
            this.f12633a = kVar4;
            this.f12634b = rVar2;
            this.f12635c = 1;
            k kVar5 = kVar4;
            if (j0.a(kVar4, fVar, j10, aVar2, this) == aVar) {
                return aVar;
            }
            rVar = rVar2;
            kVar = kVar5;
        } else if (i8 == 1) {
            rVar = this.f12634b;
            kVar = this.f12633a;
            try {
                b.J(obj);
            } catch (CancellationException e10) {
                k<T, V> kVar6 = bVar.f12648c;
                kVar6.f12711c.d();
                kVar6.f12712d = Long.MIN_VALUE;
                bVar.f12649d.setValue(Boolean.FALSE);
                throw e10;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!rVar.f14953a) {
            i10 = 2;
        }
        k<T, V> kVar7 = bVar.f12648c;
        kVar7.f12711c.d();
        kVar7.f12712d = Long.MIN_VALUE;
        bVar.f12649d.setValue(Boolean.FALSE);
        return new h(kVar, i10);
    }
}
