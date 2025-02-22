package f3;

import ff.e;
import sf.j;
import zf.f;

public abstract class v2 {

    /* renamed from: a  reason: collision with root package name */
    public final int f8519a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8520b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8521c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8522d;

    public static final class a extends v2 {

        /* renamed from: e  reason: collision with root package name */
        public final int f8523e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8524f;

        public a(int i8, int i10, int i11, int i12, int i13, int i14) {
            super(i11, i12, i13, i14);
            this.f8523e = i8;
            this.f8524f = i10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r1 = r5.f8519a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            r1 = r5.f8520b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            r1 = r5.f8521c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
            r5 = r5.f8522d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof f3.v2.a
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                f3.v2$a r5 = (f3.v2.a) r5
                int r1 = r5.f8523e
                int r3 = r4.f8523e
                if (r3 != r1) goto L_0x0031
                int r1 = r4.f8524f
                int r3 = r5.f8524f
                if (r1 != r3) goto L_0x0031
                int r1 = r5.f8519a
                int r3 = r4.f8519a
                if (r3 != r1) goto L_0x0031
                int r1 = r5.f8520b
                int r3 = r4.f8520b
                if (r3 != r1) goto L_0x0031
                int r1 = r5.f8521c
                int r3 = r4.f8521c
                if (r3 != r1) goto L_0x0031
                int r5 = r5.f8522d
                int r1 = r4.f8522d
                if (r1 != r5) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r0 = r2
            L_0x0032:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.v2.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8524f) + Integer.hashCode(this.f8523e) + v2.super.hashCode();
        }

        public final String toString() {
            return f.n0("ViewportHint.Access(\n            |    pageOffset=" + this.f8523e + ",\n            |    indexInPage=" + this.f8524f + ",\n            |    presentedItemsBefore=" + this.f8519a + ",\n            |    presentedItemsAfter=" + this.f8520b + ",\n            |    originalPageOffsetFirst=" + this.f8521c + ",\n            |    originalPageOffsetLast=" + this.f8522d + ",\n            |)");
        }
    }

    public static final class b extends v2 {
        public b(int i8, int i10, int i11, int i12) {
            super(i8, i10, i11, i12);
        }

        public final String toString() {
            return f.n0("ViewportHint.Initial(\n            |    presentedItemsBefore=" + this.f8519a + ",\n            |    presentedItemsAfter=" + this.f8520b + ",\n            |    originalPageOffsetFirst=" + this.f8521c + ",\n            |    originalPageOffsetLast=" + this.f8522d + ",\n            |)");
        }
    }

    public v2(int i8, int i10, int i11, int i12) {
        this.f8519a = i8;
        this.f8520b = i10;
        this.f8521c = i11;
        this.f8522d = i12;
    }

    public final int a(o0 o0Var) {
        j.f(o0Var, "loadType");
        int ordinal = o0Var.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        } else if (ordinal == 1) {
            return this.f8519a;
        } else {
            if (ordinal == 2) {
                return this.f8520b;
            }
            throw new e();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.f8519a == v2Var.f8519a && this.f8520b == v2Var.f8520b && this.f8521c == v2Var.f8521c && this.f8522d == v2Var.f8522d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f8522d) + Integer.hashCode(this.f8521c) + Integer.hashCode(this.f8520b) + Integer.hashCode(this.f8519a);
    }
}
