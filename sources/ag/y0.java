package ag;

import cb.b;
import gf.l;
import kotlinx.coroutines.internal.a;

public abstract class y0 extends c0 {
    public static final /* synthetic */ int B = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f510c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f511d;

    /* renamed from: e  reason: collision with root package name */
    public a<q0<?>> f512e;

    public final c0 I0(int i8) {
        b.r(1);
        return this;
    }

    public final void J0(boolean z10) {
        long j10 = this.f510c - (z10 ? 4294967296L : 1);
        this.f510c = j10;
        if (j10 <= 0 && this.f511d) {
            shutdown();
        }
    }

    public final void K0(q0<?> q0Var) {
        a<q0<?>> aVar = this.f512e;
        if (aVar == null) {
            aVar = new a<>();
            this.f512e = aVar;
        }
        Object[] objArr = aVar.f10697a;
        int i8 = aVar.f10699c;
        objArr[i8] = q0Var;
        int length = (objArr.length - 1) & (i8 + 1);
        aVar.f10699c = length;
        int i10 = aVar.f10698b;
        if (length == i10) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[(length2 << 1)];
            l.X(objArr, objArr2, 0, i10, 0, 10);
            Object[] objArr3 = aVar.f10697a;
            int length3 = objArr3.length;
            int i11 = aVar.f10698b;
            l.X(objArr3, objArr2, length3 - i11, 0, i11, 4);
            aVar.f10697a = objArr2;
            aVar.f10698b = 0;
            aVar.f10699c = length2;
        }
    }

    public final void L0(boolean z10) {
        this.f510c = (z10 ? 4294967296L : 1) + this.f510c;
        if (!z10) {
            this.f511d = true;
        }
    }

    public final boolean M0() {
        return this.f510c >= 4294967296L;
    }

    public long N0() {
        return !O0() ? Long.MAX_VALUE : 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: ag.q0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean O0() {
        /*
            r7 = this;
            kotlinx.coroutines.internal.a<ag.q0<?>> r0 = r7.f512e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r2 = r0.f10698b
            int r3 = r0.f10699c
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x000f
            goto L_0x001f
        L_0x000f:
            java.lang.Object[] r3 = r0.f10697a
            r6 = r3[r2]
            r3[r2] = r5
            int r2 = r2 + r4
            int r3 = r3.length
            int r3 = r3 + -1
            r2 = r2 & r3
            r0.f10698b = r2
            if (r6 == 0) goto L_0x0028
            r5 = r6
        L_0x001f:
            ag.q0 r5 = (ag.q0) r5
            if (r5 != 0) goto L_0x0024
            return r1
        L_0x0024:
            r5.run()
            return r4
        L_0x0028:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.y0.O0():boolean");
    }

    public void shutdown() {
    }
}
