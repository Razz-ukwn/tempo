package q7;

import java.util.concurrent.atomic.AtomicReference;

public final class u4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13360a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13361b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13362c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a5 f13363d;

    public u4(a5 a5Var, AtomicReference atomicReference, String str, String str2) {
        this.f13363d = a5Var;
        this.f13360a = atomicReference;
        this.f13361b = str;
        this.f13362c = str2;
    }

    public final void run() {
        x5 u7 = ((x3) this.f13363d.f13121a).u();
        AtomicReference atomicReference = this.f13360a;
        String str = this.f13361b;
        String str2 = this.f13362c;
        u7.i();
        u7.j();
        u7.u(new s5(u7, atomicReference, str, str2, u7.r(false)));
    }
}
