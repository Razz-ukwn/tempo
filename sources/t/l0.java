package t;

import cb.b;
import ff.m;
import java.util.Arrays;
import rf.p;
import sf.j;
import sf.k;
import t.e0;

public final class l0 {

    public static final class a extends k implements p<h, Integer, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v1<?>[] f15138a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p<h, Integer, m> f15139b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f15140c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v1<?>[] v1VarArr, p<? super h, ? super Integer, m> pVar, int i8) {
            super(2);
            this.f15138a = v1VarArr;
            this.f15139b = pVar;
            this.f15140c = i8;
        }

        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            v1<?>[] v1VarArr = this.f15138a;
            v1[] v1VarArr2 = (v1[]) Arrays.copyOf(v1VarArr, v1VarArr.length);
            int L = b.L(this.f15140c | 1);
            l0.a(v1VarArr2, this.f15139b, (h) obj, L);
            return m.f8717a;
        }
    }

    public static final void a(v1<?>[] v1VarArr, p<? super h, ? super Integer, m> pVar, h hVar, int i8) {
        j.f(v1VarArr, "values");
        j.f(pVar, "content");
        i g10 = hVar.g(-1390796515);
        e0.b bVar = e0.f15020a;
        g10.d0(v1VarArr);
        pVar.invoke(g10, Integer.valueOf((i8 >> 3) & 14));
        g10.F();
        y1 G = g10.G();
        if (G != null) {
            G.f15286d = new a(v1VarArr, pVar, i8);
        }
    }

    public static final z2 b(rf.a aVar) {
        j.f(aVar, "defaultFactory");
        return new z2(aVar);
    }
}
