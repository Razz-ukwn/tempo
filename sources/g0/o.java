package g0;

import d0.g;
import rf.l;
import s0.i;
import sf.j;
import u.d;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final o f8774b = new o();

    /* renamed from: c  reason: collision with root package name */
    public static final o f8775c = new o();

    /* renamed from: a  reason: collision with root package name */
    public final d<q> f8776a = new d<>(new q[16]);

    public final boolean a(l<? super s, Boolean> lVar) {
        j.f(lVar, "onFound");
        if (!(!j.a(this, f8774b))) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        } else if (!j.a(this, f8775c)) {
            d<q> dVar = this.f8776a;
            if (dVar.i()) {
                int i8 = dVar.f15640c;
                int i10 = 0;
                if (i8 <= 0) {
                    return false;
                }
                T[] tArr = dVar.f15638a;
                boolean z10 = false;
                do {
                    q qVar = (q) tArr[i10];
                    if (qVar.s().F) {
                        d dVar2 = new d(new g.c[16]);
                        g.c cVar = qVar.s().f7181e;
                        if (cVar == null) {
                            i.a(dVar2, qVar.s());
                        } else {
                            dVar2.b(cVar);
                        }
                        while (true) {
                            if (!dVar2.i()) {
                                break;
                            }
                            g.c cVar2 = (g.c) dVar2.k(dVar2.f15640c - 1);
                            if ((cVar2.f7179c & 1024) == 0) {
                                i.a(dVar2, cVar2);
                            } else {
                                while (true) {
                                    if (cVar2 == null) {
                                        continue;
                                        break;
                                    } else if ((cVar2.f7178b & 1024) == 0) {
                                        cVar2 = cVar2.f7181e;
                                    } else if ((cVar2 instanceof s) && lVar.invoke((s) cVar2).booleanValue()) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        i10++;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } while (i10 < i8);
                return z10;
            }
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        } else {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
    }
}
