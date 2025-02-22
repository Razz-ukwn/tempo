package db;

import ab.l;
import ab.p;
import ab.q;
import ab.s;
import cb.r;
import h0.e;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class f extends hb.a {
    public static final Object P = new Object();
    public Object[] L;
    public int M;
    public String[] N;
    public int[] O;

    public class a extends Reader {
        public final void close() {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i8, int i10) {
            throw new AssertionError();
        }
    }

    static {
        new a();
    }

    private String L() {
        return " at path " + z(false);
    }

    private String z(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i8 = 0;
        while (true) {
            int i10 = this.M;
            if (i8 >= i10) {
                return sb2.toString();
            }
            Object[] objArr = this.L;
            Object obj = objArr[i8];
            if (obj instanceof l) {
                i8++;
                if (i8 < i10 && (objArr[i8] instanceof Iterator)) {
                    int i11 = this.O[i8];
                    if (z10 && i11 > 0 && (i8 == i10 - 1 || i8 == i10 - 2)) {
                        i11--;
                    }
                    sb2.append('[');
                    sb2.append(i11);
                    sb2.append(']');
                }
            } else if ((obj instanceof q) && (i8 = i8 + 1) < i10 && (objArr[i8] instanceof Iterator)) {
                sb2.append('.');
                String str = this.N[i8];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i8++;
        }
    }

    public final String D() {
        return z(true);
    }

    public final Object E0() {
        return this.L[this.M - 1];
    }

    public final boolean F() {
        int k02 = k0();
        return (k02 == 4 || k02 == 2 || k02 == 10) ? false : true;
    }

    public final Object F0() {
        Object[] objArr = this.L;
        int i8 = this.M - 1;
        this.M = i8;
        Object obj = objArr[i8];
        objArr[i8] = null;
        return obj;
    }

    public final void G0(Object obj) {
        int i8 = this.M;
        Object[] objArr = this.L;
        if (i8 == objArr.length) {
            int i10 = i8 * 2;
            this.L = Arrays.copyOf(objArr, i10);
            this.O = Arrays.copyOf(this.O, i10);
            this.N = (String[]) Arrays.copyOf(this.N, i10);
        }
        Object[] objArr2 = this.L;
        int i11 = this.M;
        this.M = i11 + 1;
        objArr2[i11] = obj;
    }

    public final boolean Q() {
        x0(8);
        boolean a10 = ((s) F0()).a();
        int i8 = this.M;
        if (i8 > 0) {
            int[] iArr = this.O;
            int i10 = i8 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return a10;
    }

    public final double R() {
        int k02 = k0();
        if (k02 == 7 || k02 == 6) {
            s sVar = (s) E0();
            double doubleValue = sVar.f276a instanceof Number ? sVar.b().doubleValue() : Double.parseDouble(sVar.c());
            if (this.f9288b || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                F0();
                int i8 = this.M;
                if (i8 > 0) {
                    int[] iArr = this.O;
                    int i10 = i8 - 1;
                    iArr[i10] = iArr[i10] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        throw new IllegalStateException("Expected " + e.d(7) + " but was " + e.d(k02) + L());
    }

    public final int T() {
        int k02 = k0();
        if (k02 == 7 || k02 == 6) {
            s sVar = (s) E0();
            int intValue = sVar.f276a instanceof Number ? sVar.b().intValue() : Integer.parseInt(sVar.c());
            F0();
            int i8 = this.M;
            if (i8 > 0) {
                int[] iArr = this.O;
                int i10 = i8 - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            return intValue;
        }
        throw new IllegalStateException("Expected " + e.d(7) + " but was " + e.d(k02) + L());
    }

    public final long X() {
        int k02 = k0();
        if (k02 == 7 || k02 == 6) {
            s sVar = (s) E0();
            long longValue = sVar.f276a instanceof Number ? sVar.b().longValue() : Long.parseLong(sVar.c());
            F0();
            int i8 = this.M;
            if (i8 > 0) {
                int[] iArr = this.O;
                int i10 = i8 - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            return longValue;
        }
        throw new IllegalStateException("Expected " + e.d(7) + " but was " + e.d(k02) + L());
    }

    public final String Y() {
        x0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) E0()).next();
        String str = (String) entry.getKey();
        this.N[this.M - 1] = str;
        G0(entry.getValue());
        return str;
    }

    public final void c() {
        x0(1);
        G0(((l) E0()).iterator());
        this.O[this.M - 1] = 0;
    }

    public final void close() {
        this.L = new Object[]{P};
        this.M = 1;
    }

    public final void d() {
        x0(3);
        G0(new r.b.a((r.b) ((q) E0()).f275a.entrySet()));
    }

    public final void d0() {
        x0(9);
        F0();
        int i8 = this.M;
        if (i8 > 0) {
            int[] iArr = this.O;
            int i10 = i8 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    public final String f0() {
        int k02 = k0();
        if (k02 == 6 || k02 == 7) {
            String c3 = ((s) F0()).c();
            int i8 = this.M;
            if (i8 > 0) {
                int[] iArr = this.O;
                int i10 = i8 - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            return c3;
        }
        throw new IllegalStateException("Expected " + e.d(6) + " but was " + e.d(k02) + L());
    }

    public final int k0() {
        if (this.M == 0) {
            return 10;
        }
        Object E0 = E0();
        if (E0 instanceof Iterator) {
            boolean z10 = this.L[this.M - 2] instanceof q;
            Iterator it = (Iterator) E0;
            if (!it.hasNext()) {
                return z10 ? 4 : 2;
            }
            if (z10) {
                return 5;
            }
            G0(it.next());
            return k0();
        } else if (E0 instanceof q) {
            return 3;
        } else {
            if (E0 instanceof l) {
                return 1;
            }
            if (E0 instanceof s) {
                Serializable serializable = ((s) E0).f276a;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (E0 instanceof p) {
                return 9;
            } else {
                if (E0 == P) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public final void p() {
        x0(2);
        F0();
        F0();
        int i8 = this.M;
        if (i8 > 0) {
            int[] iArr = this.O;
            int i10 = i8 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    public final void q() {
        x0(4);
        F0();
        F0();
        int i8 = this.M;
        if (i8 > 0) {
            int[] iArr = this.O;
            int i10 = i8 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    public final String toString() {
        return f.class.getSimpleName() + L();
    }

    public final String u() {
        return z(false);
    }

    public final void v0() {
        if (k0() == 5) {
            Y();
            this.N[this.M - 2] = "null";
        } else {
            F0();
            int i8 = this.M;
            if (i8 > 0) {
                this.N[i8 - 1] = "null";
            }
        }
        int i10 = this.M;
        if (i10 > 0) {
            int[] iArr = this.O;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    public final void x0(int i8) {
        if (k0() != i8) {
            throw new IllegalStateException("Expected " + e.d(i8) + " but was " + e.d(k0()) + L());
        }
    }
}
