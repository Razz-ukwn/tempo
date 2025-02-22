package wf;

import cb.b;
import tf.a;

public class d implements Iterable<Integer>, a {

    /* renamed from: a  reason: collision with root package name */
    public final int f16714a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16715b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16716c;

    public d(int i8, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i11 != Integer.MIN_VALUE) {
            this.f16714a = i8;
            this.f16715b = b.A(i8, i10, i11);
            this.f16716c = i11;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: d */
    public final e iterator() {
        return new e(this.f16714a, this.f16715b, this.f16716c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (wf.d) r3;
        r0 = r3.f16714a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof wf.d
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            wf.d r0 = (wf.d) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            wf.d r3 = (wf.d) r3
            int r0 = r3.f16714a
            int r1 = r2.f16714a
            if (r1 != r0) goto L_0x0029
            int r0 = r2.f16715b
            int r1 = r3.f16715b
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f16716c
            int r3 = r3.f16716c
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f16714a * 31) + this.f16715b) * 31) + this.f16716c;
    }

    public boolean isEmpty() {
        int i8 = this.f16716c;
        int i10 = this.f16715b;
        int i11 = this.f16714a;
        if (i8 > 0) {
            if (i11 > i10) {
                return true;
            }
        } else if (i11 < i10) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i8 = this.f16715b;
        int i10 = this.f16714a;
        int i11 = this.f16716c;
        if (i11 > 0) {
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i8);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i8);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
