package bf;

public final class a {

    /* renamed from: bf.a$a  reason: collision with other inner class name */
    public static final class C0052a extends Throwable {
        public C0052a() {
            super("No further exceptions");
        }

        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    static {
        new C0052a();
    }

    public static RuntimeException a(Throwable th) {
        if (!(th instanceof Error)) {
            return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
        }
        throw ((Error) th);
    }
}
