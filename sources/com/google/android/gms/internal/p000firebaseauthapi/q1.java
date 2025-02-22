package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.activity.result.d;
import d.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q1  reason: invalid package */
public abstract class q1 implements Iterable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final p1 f4830b = new p1(u2.f4975b);

    /* renamed from: a  reason: collision with root package name */
    public int f4831a = 0;

    static {
        int i8 = g1.f4563a;
    }

    public static int k(int i8, int i10, int i11) {
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

    public static p1 l(byte[] bArr, int i8, int i10) {
        k(i8, i8 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i8, bArr2, 0, i10);
        return new p1(bArr2);
    }

    public abstract byte a(int i8);

    public abstract byte b(int i8);

    public abstract int c();

    public abstract void d(byte[] bArr, int i8);

    public abstract int e(int i8, int i10);

    public abstract boolean equals(Object obj);

    public abstract p1 f();

    public abstract r1 g();

    public abstract String h(Charset charset);

    public final int hashCode() {
        int i8 = this.f4831a;
        if (i8 == 0) {
            int c3 = c();
            i8 = e(c3, c3);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f4831a = i8;
        }
        return i8;
    }

    public abstract void i(y1 y1Var);

    public final /* synthetic */ Iterator iterator() {
        return new l1(this);
    }

    public abstract boolean j();

    public final byte[] m() {
        int c3 = c();
        if (c3 == 0) {
            return u2.f4975b;
        }
        byte[] bArr = new byte[c3];
        d(bArr, c3);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(c());
        objArr[2] = c() <= 50 ? ag.d.m(this) : ag.d.m(f()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
