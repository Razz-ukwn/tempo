package q7;

import java.lang.Thread;

public final class t3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f13336a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w3 f13337b;

    public t3(w3 w3Var, String str) {
        this.f13337b = w3Var;
        this.f13336a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        s2 s2Var = ((x3) this.f13337b.f13121a).E;
        x3.l(s2Var);
        s2Var.B.c(th, this.f13336a);
    }
}
