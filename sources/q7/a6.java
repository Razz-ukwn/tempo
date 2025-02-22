package q7;

import android.content.Intent;

public final /* synthetic */ class a6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c6 f12901a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12902b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s2 f12903c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Intent f12904d;

    public /* synthetic */ a6(c6 c6Var, int i8, s2 s2Var, Intent intent) {
        this.f12901a = c6Var;
        this.f12902b = i8;
        this.f12903c = s2Var;
        this.f12904d = intent;
    }

    public final void run() {
        c6 c6Var = this.f12901a;
        b6 b6Var = (b6) c6Var.f12947a;
        int i8 = this.f12902b;
        if (b6Var.a(i8)) {
            this.f12903c.J.c(Integer.valueOf(i8), "Local AppMeasurementService processed last upload request. StartId");
            c6Var.c().J.b("Completed wakeful intent.");
            b6Var.b(this.f12904d);
        }
    }
}
