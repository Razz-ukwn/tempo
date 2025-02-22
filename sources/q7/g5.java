package q7;

import android.os.Bundle;
import java.util.List;

public final class g5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f13080a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f5 f13081b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f5 f13082c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f13083d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j5 f13084e;

    public g5(j5 j5Var, Bundle bundle, f5 f5Var, f5 f5Var2, long j10) {
        this.f13084e = j5Var;
        this.f13080a = bundle;
        this.f13081b = f5Var;
        this.f13082c = f5Var2;
        this.f13083d = j10;
    }

    public final void run() {
        f5 f5Var = this.f13081b;
        f5 f5Var2 = this.f13082c;
        long j10 = this.f13083d;
        Bundle bundle = this.f13080a;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        j5 j5Var = this.f13084e;
        a7 a7Var = ((x3) j5Var.f13121a).H;
        x3.j(a7Var);
        j5Var.m(f5Var, f5Var2, j10, true, a7Var.p0("screen_view", bundle, (List) null, false));
    }
}
