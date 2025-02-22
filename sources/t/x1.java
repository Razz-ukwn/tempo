package t;

import ff.m;
import rf.l;
import s6.u;
import sf.j;
import sf.k;
import u.a;
import u.b;

public final class x1 extends k implements l<f0, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y1 f15274a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15275b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f15276c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, int i8, a aVar) {
        super(1);
        this.f15274a = y1Var;
        this.f15275b = i8;
        this.f15276c = aVar;
    }

    public final Object invoke(Object obj) {
        b bVar;
        f0 f0Var = (f0) obj;
        j.f(f0Var, "composition");
        y1 y1Var = this.f15274a;
        int i8 = y1Var.f15287e;
        int i10 = this.f15275b;
        if (i8 == i10) {
            a aVar = y1Var.f15288f;
            a aVar2 = this.f15276c;
            if (j.a(aVar2, aVar) && (f0Var instanceof i0)) {
                int i11 = aVar2.f15628a;
                int i12 = 0;
                int i13 = 0;
                while (i12 < i11) {
                    Object obj2 = aVar2.f15629b[i12];
                    j.d(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i14 = aVar2.f15630c[i12];
                    boolean z10 = i14 != i10;
                    if (z10) {
                        i0 i0Var = (i0) f0Var;
                        u uVar = i0Var.C;
                        uVar.e(obj2, y1Var);
                        o0 o0Var = obj2 instanceof o0 ? (o0) obj2 : null;
                        if (o0Var != null) {
                            if (!uVar.c(o0Var)) {
                                i0Var.E.f(o0Var);
                            }
                            b bVar2 = y1Var.f15289g;
                            if (bVar2 != null) {
                                int b10 = bVar2.b(o0Var);
                                if (b10 >= 0) {
                                    Object[] objArr = (Object[]) bVar2.f15633c;
                                    Object obj3 = objArr[b10];
                                    int i15 = bVar2.f15631a;
                                    Object[] objArr2 = bVar2.f15632b;
                                    int i16 = b10 + 1;
                                    gf.l.V(b10, i16, i15, objArr2, objArr2);
                                    gf.l.V(b10, i16, i15, objArr, objArr);
                                    int i17 = i15 - 1;
                                    bVar = null;
                                    objArr2[i17] = null;
                                    objArr[i17] = null;
                                    bVar2.f15631a = i17;
                                } else {
                                    bVar = null;
                                }
                                if (bVar2.f15631a == 0) {
                                    y1Var.f15289g = bVar;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        if (i13 != i12) {
                            aVar2.f15629b[i13] = obj2;
                            aVar2.f15630c[i13] = i14;
                        }
                        i13++;
                    }
                    i12++;
                }
                int i18 = aVar2.f15628a;
                for (int i19 = i13; i19 < i18; i19++) {
                    aVar2.f15629b[i19] = null;
                }
                aVar2.f15628a = i13;
                if (i13 == 0) {
                    y1Var.f15288f = null;
                }
            }
        }
        return m.f8717a;
    }
}
