package k6;

import f6.b;

public final class h implements b<e> {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final h f10309a = new h();
    }

    public final Object get() {
        a aVar = e.f10306a;
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
