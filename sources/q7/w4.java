package q7;

import com.google.android.gms.internal.measurement.kc;

public final class w4 implements Runnable {
    public final /* synthetic */ h B;
    public final /* synthetic */ a5 C;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f13401a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f13402b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13403c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f13404d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f13405e;

    public w4(a5 a5Var, h hVar, long j10, int i8, long j11, boolean z10, h hVar2) {
        this.C = a5Var;
        this.f13401a = hVar;
        this.f13402b = j10;
        this.f13403c = i8;
        this.f13404d = j11;
        this.f13405e = z10;
        this.B = hVar2;
    }

    public final void run() {
        a5 a5Var = this.C;
        h hVar = this.f13401a;
        a5Var.w(hVar);
        a5Var.s(false, this.f13402b);
        a5.D(this.C, this.f13401a, this.f13403c, this.f13404d, true, this.f13405e);
        kc.b();
        if (((x3) a5Var.f13121a).C.r((String) null, g2.f13043k0)) {
            a5.C(a5Var, hVar, this.B);
        }
    }
}
