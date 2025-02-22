package i4;

public abstract class a {

    /* renamed from: i4.a$a  reason: collision with other inner class name */
    public static final class C0176a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9566a;

        public C0176a(int i8) {
            this.f9566a = i8;
            if (!(i8 > 0)) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
            r3 = ((i4.a.C0176a) r3).f9566a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                r0 = 1
                if (r2 != r3) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r3 instanceof i4.a.C0176a
                if (r1 == 0) goto L_0x0011
                i4.a$a r3 = (i4.a.C0176a) r3
                int r3 = r3.f9566a
                int r1 = r2.f9566a
                if (r1 != r3) goto L_0x0011
                goto L_0x0012
            L_0x0011:
                r0 = 0
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i4.a.C0176a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return this.f9566a;
        }

        public final String toString() {
            return String.valueOf(this.f9566a);
        }
    }

    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9567a = new b();

        public final String toString() {
            return "Dimension.Undefined";
        }
    }
}
