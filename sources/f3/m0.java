package f3;

import sf.j;

public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8363a;

    public static final class a extends m0 {

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f8364b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(false);
            j.f(th, "error");
            this.f8364b = th;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r3 = (f3.m0.a) r3;
            r0 = r3.f8363a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                boolean r0 = r3 instanceof f3.m0.a
                if (r0 == 0) goto L_0x0018
                f3.m0$a r3 = (f3.m0.a) r3
                boolean r0 = r3.f8363a
                boolean r1 = r2.f8363a
                if (r1 != r0) goto L_0x0018
                java.lang.Throwable r0 = r2.f8364b
                java.lang.Throwable r3 = r3.f8364b
                boolean r3 = sf.j.a(r0, r3)
                if (r3 == 0) goto L_0x0018
                r3 = 1
                goto L_0x0019
            L_0x0018:
                r3 = 0
            L_0x0019:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.m0.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return this.f8364b.hashCode() + Boolean.hashCode(this.f8363a);
        }

        public final String toString() {
            return "Error(endOfPaginationReached=" + this.f8363a + ", error=" + this.f8364b + ')';
        }
    }

    public static final class b extends m0 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f8365b = new b();

        public b() {
            super(false);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r2 = ((f3.m0.b) r2).f8363a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                boolean r0 = r2 instanceof f3.m0.b
                if (r0 == 0) goto L_0x000e
                f3.m0$b r2 = (f3.m0.b) r2
                boolean r2 = r2.f8363a
                boolean r0 = r1.f8363a
                if (r0 != r2) goto L_0x000e
                r2 = 1
                goto L_0x000f
            L_0x000e:
                r2 = 0
            L_0x000f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.m0.b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f8363a);
        }

        public final String toString() {
            return "Loading(endOfPaginationReached=" + this.f8363a + ')';
        }
    }

    public static final class c extends m0 {

        /* renamed from: b  reason: collision with root package name */
        public static final c f8366b = new c(true);

        /* renamed from: c  reason: collision with root package name */
        public static final c f8367c = new c(false);

        public c(boolean z10) {
            super(z10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r2 = ((f3.m0.c) r2).f8363a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                boolean r0 = r2 instanceof f3.m0.c
                if (r0 == 0) goto L_0x000e
                f3.m0$c r2 = (f3.m0.c) r2
                boolean r2 = r2.f8363a
                boolean r0 = r1.f8363a
                if (r0 != r2) goto L_0x000e
                r2 = 1
                goto L_0x000f
            L_0x000e:
                r2 = 0
            L_0x000f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.m0.c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f8363a);
        }

        public final String toString() {
            return "NotLoading(endOfPaginationReached=" + this.f8363a + ')';
        }
    }

    public m0(boolean z10) {
        this.f8363a = z10;
    }
}
