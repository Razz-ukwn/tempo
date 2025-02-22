package aa;

import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final a f238a = new a(false);

    /* renamed from: b  reason: collision with root package name */
    public final a f239b = new a(true);

    /* renamed from: c  reason: collision with root package name */
    public final AtomicMarkableReference<String> f240c = new AtomicMarkableReference<>((Object) null, false);

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicMarkableReference<b> f241a;

        public a(boolean z10) {
            new AtomicReference((Object) null);
            this.f241a = new AtomicMarkableReference<>(new b(z10 ? 8192 : 1024), false);
        }
    }
}
