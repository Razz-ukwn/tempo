package ab;

import cb.q;
import java.math.BigDecimal;

public enum x implements y {
    ;

    /* 'enum' modifier removed */
    public final class a extends x {
        public a() {
            super("DOUBLE", 0);
        }

        public final Number a(hb.a aVar) {
            return Double.valueOf(aVar.R());
        }
    }

    /* 'enum' modifier removed */
    public final class b extends x {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1);
        }

        public final Number a(hb.a aVar) {
            return new q(aVar.f0());
        }
    }

    /* 'enum' modifier removed */
    public final class c extends x {
        public c() {
            super("LONG_OR_DOUBLE", 2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
            throw new hb.c("JSON forbids NaN and infinities: " + r3 + "; at path " + r7.D());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            r0 = androidx.activity.result.d.c("Cannot parse ", r2, "; at path ");
            r0.append(r7.D());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
            throw new ab.r(r0.toString(), r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r3 = java.lang.Double.valueOf(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r3.isInfinite() != false) goto L_0x0021;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0011 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Number a(hb.a r7) {
            /*
                r6 = this;
                java.lang.String r0 = "; at path "
                java.lang.String r1 = "JSON forbids NaN and infinities: "
                java.lang.String r2 = r7.f0()
                long r3 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0011 }
                java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0011 }
                return r7
            L_0x0011:
                java.lang.Double r3 = java.lang.Double.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0042 }
                boolean r4 = r3.isInfinite()     // Catch:{ NumberFormatException -> 0x0042 }
                if (r4 != 0) goto L_0x0021
                boolean r4 = r3.isNaN()     // Catch:{ NumberFormatException -> 0x0042 }
                if (r4 == 0) goto L_0x0025
            L_0x0021:
                boolean r4 = r7.f9288b     // Catch:{ NumberFormatException -> 0x0042 }
                if (r4 == 0) goto L_0x0026
            L_0x0025:
                return r3
            L_0x0026:
                hb.c r4 = new hb.c     // Catch:{ NumberFormatException -> 0x0042 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0042 }
                r5.<init>(r1)     // Catch:{ NumberFormatException -> 0x0042 }
                r5.append(r3)     // Catch:{ NumberFormatException -> 0x0042 }
                r5.append(r0)     // Catch:{ NumberFormatException -> 0x0042 }
                java.lang.String r1 = r7.D()     // Catch:{ NumberFormatException -> 0x0042 }
                r5.append(r1)     // Catch:{ NumberFormatException -> 0x0042 }
                java.lang.String r1 = r5.toString()     // Catch:{ NumberFormatException -> 0x0042 }
                r4.<init>(r1)     // Catch:{ NumberFormatException -> 0x0042 }
                throw r4     // Catch:{ NumberFormatException -> 0x0042 }
            L_0x0042:
                r1 = move-exception
                ab.r r3 = new ab.r
                java.lang.String r4 = "Cannot parse "
                java.lang.StringBuilder r0 = androidx.activity.result.d.c(r4, r2, r0)
                java.lang.String r7 = r7.D()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r3.<init>(r7, r1)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: ab.x.c.a(hb.a):java.lang.Number");
        }
    }

    /* 'enum' modifier removed */
    public final class d extends x {
        public d() {
            super("BIG_DECIMAL", 3);
        }

        public final Number a(hb.a aVar) {
            String f02 = aVar.f0();
            try {
                return new BigDecimal(f02);
            } catch (NumberFormatException e10) {
                StringBuilder c3 = androidx.activity.result.d.c("Cannot parse ", f02, "; at path ");
                c3.append(aVar.D());
                throw new r(c3.toString(), e10);
            }
        }
    }
}
