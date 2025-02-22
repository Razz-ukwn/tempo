package q7;

import com.google.android.gms.internal.measurement.kc;

public final class x4 implements Runnable {
    public final /* synthetic */ a5 B;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f13427a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13428b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13429c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f13430d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f13431e;

    public x4(a5 a5Var, h hVar, int i8, long j10, boolean z10, h hVar2) {
        this.B = a5Var;
        this.f13427a = hVar;
        this.f13428b = i8;
        this.f13429c = j10;
        this.f13430d = z10;
        this.f13431e = hVar2;
    }

    public final void run() {
        a5 a5Var = this.B;
        h hVar = this.f13427a;
        a5Var.w(hVar);
        a5.D(this.B, this.f13427a, this.f13428b, this.f13429c, false, this.f13430d);
        kc.b();
        if (((x3) a5Var.f13121a).C.r((String) null, g2.f13043k0)) {
            a5.C(a5Var, hVar, this.f13431e);
        }
    }
}
