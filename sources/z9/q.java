package z9;

import java.util.concurrent.Callable;

public final class q implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f17879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f17880b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f17881c;

    public q(p pVar, long j10, String str) {
        this.f17881c = pVar;
        this.f17879a = j10;
        this.f17880b = str;
    }

    public final Object call() {
        p pVar = this.f17881c;
        b0 b0Var = pVar.f17874l;
        if (b0Var != null && b0Var.f17801e.get()) {
            return null;
        }
        pVar.f17870h.f219b.c(this.f17880b, this.f17879a);
        return null;
    }
}
