package com.google.android.gms.internal.measurement;

import androidx.activity.result.d;
import b1.b;
import d.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class k6 implements Iterable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final i6 f5359b = new i6(m7.f5400b);

    /* renamed from: a  reason: collision with root package name */
    public int f5360a = 0;

    static {
        int i8 = b6.f5164a;
    }

    public static int i(int i8, int i10, int i11) {
        int i12 = i10 - i8;
        if ((i8 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException(a.a("Beginning index: ", i8, " < 0"));
        } else if (i10 < i8) {
            throw new IndexOutOfBoundsException(d.a("Beginning index larger than ending index: ", i8, ", ", i10));
        } else {
            throw new IndexOutOfBoundsException(d.a("End index: ", i10, " >= ", i11));
        }
    }

    public static i6 j(byte[] bArr, int i8, int i10) {
        i(i8, i8 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i8, bArr2, 0, i10);
        return new i6(bArr2);
    }

    public abstract byte a(int i8);

    public abstract byte b(int i8);

    public abstract int c();

    public abstract int d(int i8, int i10);

    public abstract i6 e();

    public abstract boolean equals(Object obj);

    public abstract String f(Charset charset);

    public abstract void g(o6 o6Var);

    public abstract boolean h();

    public final int hashCode() {
        int i8 = this.f5360a;
        if (i8 == 0) {
            int c3 = c();
            i8 = d(c3, c3);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f5360a = i8;
        }
        return i8;
    }

    public final /* synthetic */ Iterator iterator() {
        return new f6(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(c());
        objArr[2] = c() <= 50 ? b.o(this) : b.o(e()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
