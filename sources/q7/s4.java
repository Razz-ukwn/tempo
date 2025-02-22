package q7;

import androidx.appcompat.widget.l;
import java.util.concurrent.atomic.AtomicReference;

public final class s4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13320a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f13321b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x2 f13322c;

    public /* synthetic */ s4(x2 x2Var, long j10, int i8) {
        this.f13320a = i8;
        this.f13322c = x2Var;
        this.f13321b = j10;
    }

    public final void run() {
        int i8 = this.f13320a;
        x2 x2Var = this.f13322c;
        switch (i8) {
            case 0:
                a5 a5Var = (a5) x2Var;
                a5Var.s(true, this.f13321b);
                ((x3) a5Var.f13121a).u().y(new AtomicReference());
                return;
            default:
                i6 i6Var = (i6) x2Var;
                long j10 = this.f13321b;
                i6Var.i();
                i6Var.m();
                x3 x3Var = (x3) i6Var.f13121a;
                s2 s2Var = x3Var.E;
                x3.l(s2Var);
                s2Var.J.c(Long.valueOf(j10), "Activity paused, time");
                l lVar = i6Var.B;
                i6 i6Var2 = (i6) lVar.f1059c;
                ((x3) i6Var2.f13121a).J.getClass();
                e6 e6Var = new e6(lVar, System.currentTimeMillis(), j10);
                lVar.f1058b = e6Var;
                i6Var2.f13124c.postDelayed(e6Var, 2000);
                if (x3Var.C.s()) {
                    i6Var.f13126e.f13087c.a();
                    return;
                }
                return;
        }
    }
}
