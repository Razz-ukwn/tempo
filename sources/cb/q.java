package cb;

import java.math.BigDecimal;

public final class q extends Number {

    /* renamed from: a  reason: collision with root package name */
    public final String f3932a;

    public q(String str) {
        this.f3932a = str;
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f3932a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        String str = ((q) obj).f3932a;
        String str2 = this.f3932a;
        return str2 == str || str2.equals(str);
    }

    public final float floatValue() {
        return Float.parseFloat(this.f3932a);
    }

    public final int hashCode() {
        return this.f3932a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return new java.math.BigDecimal(r0).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        return (int) java.lang.Long.parseLong(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f3932a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000d }
            int r0 = (int) r0
            return r0
        L_0x000d:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r0)
            int r0 = r1.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.q.intValue():int");
    }

    public final long longValue() {
        String str = this.f3932a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f3932a;
    }
}
