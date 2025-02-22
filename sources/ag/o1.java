package ag;

import java.util.concurrent.CancellationException;
import sf.j;

public final class o1 extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient n1 f469a;

    public o1(String str, Throwable th, n1 n1Var) {
        super(str);
        this.f469a = n1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o1) {
                o1 o1Var = (o1) obj;
                if (!j.a(o1Var.getMessage(), getMessage()) || !j.a(o1Var.f469a, this.f469a) || !j.a(o1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        j.c(message);
        int hashCode = (this.f469a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f469a;
    }
}
