package m5;

public abstract class d {

    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f11218a;

        public final void a() {
            if (this.f11218a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
