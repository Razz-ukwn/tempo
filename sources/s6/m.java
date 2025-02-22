package s6;

import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.r0;
import q7.j5;
import q7.w5;
import q7.x5;
import t6.b;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14770a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14771b;

    public /* synthetic */ m(Object obj, int i8) {
        this.f14770a = i8;
        this.f14771b = obj;
    }

    public final void run() {
        switch (this.f14770a) {
            case 0:
                p pVar = (p) this.f14771b;
                synchronized (pVar) {
                    if (pVar.f14778a == 1) {
                        pVar.a(1, "Timed out while binding");
                    }
                }
                return;
            case 1:
                ((e0) ((r0) this.f14771b).f4329i).b(new b(4));
                return;
            case 2:
                ((j5) this.f14771b).F = null;
                return;
            default:
                x5 x5Var = ((w5) this.f14771b).f13408c;
                x5Var.f13433d = null;
                x5Var.s();
                return;
        }
    }
}
