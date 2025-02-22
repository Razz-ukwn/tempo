package coil.request;

import ag.n1;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import java.util.concurrent.CancellationException;

public final class BaseRequestDelegate extends RequestDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final j f4040a;

    /* renamed from: b  reason: collision with root package name */
    public final n1 f4041b;

    public BaseRequestDelegate(j jVar, n1 n1Var) {
        super(0);
        this.f4040a = jVar;
        this.f4041b = n1Var;
    }

    public final void e() {
        this.f4040a.c(this);
    }

    public final void f() {
        this.f4040a.a(this);
    }

    public final void o(p pVar) {
        this.f4041b.e((CancellationException) null);
    }
}
