package hb;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class b implements Closeable, Flushable {
    public static final Pattern F = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] G = new String[128];
    public static final String[] H;
    public boolean B;
    public boolean C;
    public String D;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    public final Writer f9292a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f9293b;

    /* renamed from: c  reason: collision with root package name */
    public int f9294c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f9295d;

    /* renamed from: e  reason: collision with root package name */
    public String f9296e;

    static {
        for (int i8 = 0; i8 <= 31; i8++) {
            G[i8] = String.format("\\u%04x", new Object[]{Integer.valueOf(i8)});
        }
        String[] strArr = G;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        H = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f9293b = iArr;
        if (iArr.length == 0) {
            this.f9293b = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f9293b;
        int i8 = this.f9294c;
        this.f9294c = i8 + 1;
        iArr2[i8] = 6;
        this.f9296e = ":";
        this.E = true;
        if (writer != null) {
            this.f9292a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final int D() {
        int i8 = this.f9294c;
        if (i8 != 0) {
            return this.f9293b[i8 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void F(String str) {
        String str2;
        String[] strArr = this.C ? H : G;
        Writer writer = this.f9292a;
        writer.write(34);
        int length = str.length();
        int i8 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i8 < i10) {
                writer.write(str, i8, i10 - i8);
            }
            writer.write(str2);
            i8 = i10 + 1;
        }
        if (i8 < length) {
            writer.write(str, i8, length - i8);
        }
        writer.write(34);
    }

    public void K(long j10) {
        X();
        c();
        this.f9292a.write(Long.toString(j10));
    }

    public void L(Boolean bool) {
        if (bool == null) {
            z();
            return;
        }
        X();
        c();
        this.f9292a.write(bool.booleanValue() ? "true" : "false");
    }

    public void Q(Number number) {
        if (number == null) {
            z();
            return;
        }
        X();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) && !F.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.B) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        c();
        this.f9292a.append(obj);
    }

    public void R(String str) {
        if (str == null) {
            z();
            return;
        }
        X();
        c();
        F(str);
    }

    public void T(boolean z10) {
        X();
        c();
        this.f9292a.write(z10 ? "true" : "false");
    }

    public final void X() {
        if (this.D != null) {
            int D2 = D();
            if (D2 == 5) {
                this.f9292a.write(44);
            } else if (D2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            u();
            this.f9293b[this.f9294c - 1] = 4;
            F(this.D);
            this.D = null;
        }
    }

    public final void c() {
        int D2 = D();
        if (D2 != 1) {
            Writer writer = this.f9292a;
            if (D2 == 2) {
                writer.append(',');
                u();
            } else if (D2 != 4) {
                if (D2 != 6) {
                    if (D2 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.B) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                this.f9293b[this.f9294c - 1] = 7;
            } else {
                writer.append(this.f9296e);
                this.f9293b[this.f9294c - 1] = 5;
            }
        } else {
            this.f9293b[this.f9294c - 1] = 2;
            u();
        }
    }

    public void close() {
        this.f9292a.close();
        int i8 = this.f9294c;
        if (i8 > 1 || (i8 == 1 && this.f9293b[i8 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f9294c = 0;
    }

    public void d() {
        X();
        c();
        int i8 = this.f9294c;
        int[] iArr = this.f9293b;
        if (i8 == iArr.length) {
            this.f9293b = Arrays.copyOf(iArr, i8 * 2);
        }
        int[] iArr2 = this.f9293b;
        int i10 = this.f9294c;
        this.f9294c = i10 + 1;
        iArr2[i10] = 1;
        this.f9292a.write(91);
    }

    public void e() {
        X();
        c();
        int i8 = this.f9294c;
        int[] iArr = this.f9293b;
        if (i8 == iArr.length) {
            this.f9293b = Arrays.copyOf(iArr, i8 * 2);
        }
        int[] iArr2 = this.f9293b;
        int i10 = this.f9294c;
        this.f9294c = i10 + 1;
        iArr2[i10] = 3;
        this.f9292a.write(123);
    }

    public void flush() {
        if (this.f9294c != 0) {
            this.f9292a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void j(int i8, int i10, char c3) {
        int D2 = D();
        if (D2 != i10 && D2 != i8) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.D == null) {
            this.f9294c--;
            if (D2 == i10) {
                u();
            }
            this.f9292a.write(c3);
        } else {
            throw new IllegalStateException("Dangling name: " + this.D);
        }
    }

    public void p() {
        j(1, 2, ']');
    }

    public void q() {
        j(3, 5, '}');
    }

    public void s(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.D != null) {
            throw new IllegalStateException();
        } else if (this.f9294c != 0) {
            this.D = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void u() {
        if (this.f9295d != null) {
            Writer writer = this.f9292a;
            writer.write(10);
            int i8 = this.f9294c;
            for (int i10 = 1; i10 < i8; i10++) {
                writer.write(this.f9295d);
            }
        }
    }

    public b z() {
        if (this.D != null) {
            if (this.E) {
                X();
            } else {
                this.D = null;
                return this;
            }
        }
        c();
        this.f9292a.write("null");
        return this;
    }
}
