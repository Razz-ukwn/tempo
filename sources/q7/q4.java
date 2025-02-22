package q7;

import android.os.Bundle;

public final class q4 implements Runnable {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ String D = null;
    public final /* synthetic */ a5 E;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13283a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13284b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13285c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f13286d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f13287e;

    public q4(a5 a5Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.E = a5Var;
        this.f13283a = str;
        this.f13284b = str2;
        this.f13285c = j10;
        this.f13286d = bundle;
        this.f13287e = z10;
        this.B = z11;
        this.C = z12;
    }

    public final void run() {
        this.E.r(this.f13283a, this.f13284b, this.f13285c, this.f13286d, this.f13287e, this.B, this.C, this.D);
    }
}
