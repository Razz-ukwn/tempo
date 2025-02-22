package t;

import androidx.activity.f;
import b7.a;
import ff.m;
import gf.l;
import java.util.ArrayList;
import rf.q;
import sf.j;
import sf.k;

public final class d0 extends k implements q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15013a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(int i8) {
        super(3);
        this.f15013a = i8;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        int i8;
        int i10;
        p2 p2Var = (p2) obj2;
        f.e((c) obj, "<anonymous parameter 0>", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
        if (p2Var.m == 0) {
            int i11 = this.f15013a;
            if (i11 >= 0) {
                if (i11 != 0) {
                    int i12 = p2Var.f15203r;
                    int i13 = p2Var.f15204s;
                    int i14 = p2Var.f15193g;
                    int i15 = i12;
                    while (i11 > 0) {
                        i15 += a.e(p2Var.f15188b, p2Var.n(i15));
                        if (i15 <= i14) {
                            i11--;
                        } else {
                            e0.c("Parameter offset is out of bounds".toString());
                            throw null;
                        }
                    }
                    int e10 = a.e(p2Var.f15188b, p2Var.n(i15));
                    int i16 = p2Var.f15194h;
                    int g10 = p2Var.g(p2Var.f15188b, p2Var.n(i15));
                    int i17 = i15 + e10;
                    int g11 = p2Var.g(p2Var.f15188b, p2Var.n(i17));
                    int i18 = g11 - g10;
                    p2Var.r(i18, Math.max(p2Var.f15203r - 1, 0));
                    p2Var.q(e10);
                    int[] iArr = p2Var.f15188b;
                    int n2 = p2Var.n(i17) * 5;
                    l.U(p2Var.n(i12) * 5, n2, (e10 * 5) + n2, iArr, iArr);
                    if (i18 > 0) {
                        Object[] objArr = p2Var.f15189c;
                        l.V(i16, p2Var.h(g10 + i18), p2Var.h(g11 + i18), objArr, objArr);
                    }
                    int i19 = g10 + i18;
                    int i20 = i19 - i16;
                    int i21 = p2Var.f15196j;
                    int i22 = p2Var.f15197k;
                    int length = p2Var.f15189c.length;
                    int i23 = p2Var.f15198l;
                    int i24 = i12 + e10;
                    int i25 = i12;
                    while (i25 < i24) {
                        int n10 = p2Var.n(i25);
                        int i26 = i21;
                        int g12 = p2Var.g(iArr, n10) - i20;
                        if (i23 < n10) {
                            i8 = i20;
                            i10 = 0;
                        } else {
                            i8 = i20;
                            i10 = i26;
                        }
                        if (g12 > i10) {
                            g12 = -(((length - i22) - g12) + 1);
                        }
                        int i27 = p2Var.f15196j;
                        int i28 = i22;
                        int i29 = p2Var.f15197k;
                        int i30 = length;
                        int length2 = p2Var.f15189c.length;
                        if (g12 > i27) {
                            g12 = -(((length2 - i29) - g12) + 1);
                        }
                        iArr[(n10 * 5) + 4] = g12;
                        i25++;
                        i21 = i26;
                        i20 = i8;
                        length = i30;
                        i22 = i28;
                    }
                    int i31 = e10 + i17;
                    int m = p2Var.m();
                    int h3 = a.h(p2Var.f15190d, i17, m);
                    ArrayList arrayList = new ArrayList();
                    if (h3 >= 0) {
                        while (h3 < p2Var.f15190d.size()) {
                            b bVar = p2Var.f15190d.get(h3);
                            j.e(bVar, "anchors[index]");
                            b bVar2 = bVar;
                            int c3 = p2Var.c(bVar2);
                            if (c3 < i17 || c3 >= i31) {
                                break;
                            }
                            arrayList.add(bVar2);
                            p2Var.f15190d.remove(h3);
                        }
                    }
                    int i32 = i12 - i17;
                    int size = arrayList.size();
                    for (int i33 = 0; i33 < size; i33++) {
                        b bVar3 = (b) arrayList.get(i33);
                        int c10 = p2Var.c(bVar3) + i32;
                        if (c10 >= p2Var.f15191e) {
                            bVar3.f14988a = -(m - c10);
                        } else {
                            bVar3.f14988a = c10;
                        }
                        p2Var.f15190d.add(a.h(p2Var.f15190d, c10, m), bVar3);
                    }
                    if (!p2Var.D(i17, e10)) {
                        p2Var.l(i13, p2Var.f15193g, i12);
                        if (i18 > 0) {
                            p2Var.E(i19, i18, i17 - 1);
                        }
                    } else {
                        e0.c("Unexpectedly removed anchors".toString());
                        throw null;
                    }
                }
                return m.f8717a;
            }
            e0.c("Parameter offset is out of bounds".toString());
            throw null;
        }
        e0.c("Cannot move a group while inserting".toString());
        throw null;
    }
}
