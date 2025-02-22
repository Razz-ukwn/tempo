package db;

import ab.l;
import ab.n;
import ab.p;
import ab.q;
import ab.s;
import hb.b;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public final class g extends b {
    public static final a L = new a();
    public static final s M = new s("closed");
    public final ArrayList I = new ArrayList();
    public String J;
    public n K = p.f274a;

    public class a extends Writer {
        public final void close() {
            throw new AssertionError();
        }

        public final void flush() {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i8, int i10) {
            throw new AssertionError();
        }
    }

    public g() {
        super(L);
    }

    public final void K(long j10) {
        b0(new s((Number) Long.valueOf(j10)));
    }

    public final void L(Boolean bool) {
        if (bool == null) {
            b0(p.f274a);
        } else {
            b0(new s(bool));
        }
    }

    public final void Q(Number number) {
        if (number == null) {
            b0(p.f274a);
            return;
        }
        if (!this.B) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        b0(new s(number));
    }

    public final void R(String str) {
        if (str == null) {
            b0(p.f274a);
        } else {
            b0(new s(str));
        }
    }

    public final void T(boolean z10) {
        b0(new s(Boolean.valueOf(z10)));
    }

    public final n Y() {
        ArrayList arrayList = this.I;
        return (n) arrayList.get(arrayList.size() - 1);
    }

    public final void b0(n nVar) {
        if (this.J != null) {
            nVar.getClass();
            if (!(nVar instanceof p) || this.E) {
                ((q) Y()).f275a.put(this.J, nVar);
            }
            this.J = null;
        } else if (this.I.isEmpty()) {
            this.K = nVar;
        } else {
            n Y = Y();
            if (Y instanceof l) {
                l lVar = (l) Y;
                if (nVar == null) {
                    lVar.getClass();
                    nVar = p.f274a;
                }
                lVar.f273a.add(nVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void close() {
        ArrayList arrayList = this.I;
        if (arrayList.isEmpty()) {
            arrayList.add(M);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d() {
        l lVar = new l();
        b0(lVar);
        this.I.add(lVar);
    }

    public final void e() {
        q qVar = new q();
        b0(qVar);
        this.I.add(qVar);
    }

    public final void flush() {
    }

    public final void p() {
        ArrayList arrayList = this.I;
        if (arrayList.isEmpty() || this.J != null) {
            throw new IllegalStateException();
        } else if (Y() instanceof l) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void q() {
        ArrayList arrayList = this.I;
        if (arrayList.isEmpty() || this.J != null) {
            throw new IllegalStateException();
        } else if (Y() instanceof q) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void s(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.I.isEmpty() || this.J != null) {
            throw new IllegalStateException();
        } else if (Y() instanceof q) {
            this.J = str;
        } else {
            throw new IllegalStateException();
        }
    }

    public final b z() {
        b0(p.f274a);
        return this;
    }
}
