package q7;

import android.os.Bundle;

public final class h5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f5 f13104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f5 f13105b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13106c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f13107d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j5 f13108e;

    public h5(j5 j5Var, f5 f5Var, f5 f5Var2, long j10, boolean z10) {
        this.f13108e = j5Var;
        this.f13104a = f5Var;
        this.f13105b = f5Var2;
        this.f13106c = j10;
        this.f13107d = z10;
    }

    public final void run() {
        this.f13108e.m(this.f13104a, this.f13105b, this.f13106c, this.f13107d, (Bundle) null);
    }
}
