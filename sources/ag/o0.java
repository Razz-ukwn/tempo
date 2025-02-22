package ag;

import jf.f;

public final class o0 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final f f468a;

    public o0(f fVar) {
        this.f468a = fVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f468a.toString();
    }
}
