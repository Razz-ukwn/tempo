package bh;

import java.util.ArrayList;
import java.util.Arrays;
import sf.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0053a f3654a = new C0053a();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b[] f3655b = new b[0];

    /* renamed from: bh.a$a  reason: collision with other inner class name */
    public static final class C0053a extends b {
        public final void a(String str, Object... objArr) {
            j.f(objArr, "args");
            for (b a10 : a.f3655b) {
                a10.a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void b(String str, Object... objArr) {
            j.f(objArr, "args");
            for (b b10 : a.f3655b) {
                b10.b(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void c(Throwable th) {
            for (b c3 : a.f3655b) {
                c3.c(th);
            }
        }
    }

    public static abstract class b {
        public b() {
            new ThreadLocal();
        }

        public abstract void a(String str, Object... objArr);

        public abstract void b(String str, Object... objArr);

        public abstract void c(Throwable th);
    }

    static {
        new ArrayList();
    }
}
