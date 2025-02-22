package androidx.fragment.app;

import a5.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.k0;
import androidx.lifecycle.p0;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import com.google.android.gms.internal.measurement.rb;
import com.google.android.gms.internal.p000firebaseauthapi.ha;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.quickkonnect.silencio.R;
import f1.d;
import j0.w;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.flow.y0;
import kotlinx.coroutines.internal.v;
import m9.b;
import q7.e2;
import q7.g2;
import rf.a;
import sf.j;

public final class z0 implements Continuation, e2 {
    public static final float[] B = {0.964212f, 1.0f, 0.825188f};
    public static final d C = new d(1.0f, 1.0f);
    public static final /* synthetic */ z0 D = new z0();
    public static final v E = new v("NONE");
    public static final v F = new v("PENDING");
    public static final /* synthetic */ z0 G = new z0();

    /* renamed from: a  reason: collision with root package name */
    public static final jf.d[] f2175a = new jf.d[0];

    /* renamed from: b  reason: collision with root package name */
    public static final w f2176b = new w(0.31006f, 0.31616f);

    /* renamed from: c  reason: collision with root package name */
    public static final w f2177c = new w(0.34567f, 0.3585f);

    /* renamed from: d  reason: collision with root package name */
    public static final w f2178d = new w(0.32168f, 0.33767f);

    /* renamed from: e  reason: collision with root package name */
    public static final w f2179e = new w(0.31271f, 0.32902f);

    public static final y0 a(Object obj) {
        if (obj == null) {
            obj = b.f11323d;
        }
        return new y0(obj);
    }

    public static final p0 b(ff.d dVar) {
        return (p0) dVar.getValue();
    }

    public static final void c(Throwable th, Throwable th2) {
        j.f(th, "<this>");
        j.f(th2, "exception");
        if (th != th2) {
            mf.b.f11479a.a(th, th2);
        }
    }

    public static final void d(ConstraintLayout constraintLayout, List list, String str) {
        j.f(constraintLayout, "constraintLayout");
        j.f(list, "selectedList");
        j.f(str, "placeText");
        if (list.contains(str)) {
            constraintLayout.setBackgroundResource(R.drawable.bg_card_selected);
        } else {
            constraintLayout.setBackgroundResource(0);
        }
    }

    public static final k0 e(p pVar, sf.d dVar, a aVar, a aVar2, a aVar3) {
        j.f(pVar, "<this>");
        return new k0(dVar, aVar, aVar3, aVar2);
    }

    public static final void f(ImageView imageView, String str) {
        j5.a aVar = new j5.a(300, true);
        Context context = imageView.getContext();
        m b10 = com.bumptech.glide.b.c(context).b(context);
        if (str == null) {
            str = "";
        }
        b10.getClass();
        Context context2 = b10.f4128b;
        l E2 = new l(b10.f4127a, b10, Drawable.class, context2).E(str);
        rb.a aVar2 = rb.a.V;
        i iVar = new i();
        iVar.f4135a = aVar;
        ((l) ((l) E2.h(aVar2.C)).l(aVar2.B)).H(iVar).C(imageView);
    }

    public static final void g(TextView textView, List list, String str) {
        j.f(textView, "textView");
        j.f(str, "placeText");
        textView.setVisibility(list.contains(str) ? 0 : 8);
        textView.setText(String.valueOf(list.indexOf(str) + 1));
    }

    public static String h(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(r1 + r1);
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(b11 >> 4));
            sb2.append("0123456789abcdef".charAt(b11 & 15));
        }
        return sb2.toString();
    }

    public static final void i(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8) {
        if (i8 < 0 || byteBuffer2.remaining() < i8 || byteBuffer3.remaining() < i8 || byteBuffer.remaining() < i8) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i10 = 0; i10 < i8; i10++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static byte[] k(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            int i8 = 0;
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b10 = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) b10;
            copyOf[31] = (byte) (b10 | 64);
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i10 = 0;
                while (i10 < 7) {
                    byte[][] bArr5 = ha.f4621a;
                    if (!MessageDigest.isEqual(bArr5[i10], copyOf2)) {
                        i10++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(h(bArr5[i10])));
                    }
                }
                long[] jArr2 = new long[10];
                int i11 = 0;
                for (int i12 = 10; i11 < i12; i12 = 10) {
                    int i13 = ag.m.f439b[i11];
                    jArr2[i11] = (((((((long) (copyOf2[i13 + 1] & 255)) << 8) | ((long) (copyOf2[i13] & 255))) | (((long) (copyOf2[i13 + 2] & 255)) << 16)) | (((long) (copyOf2[i13 + 3] & 255)) << 24)) >> ag.m.f440c[i11]) & ((long) ag.m.f441d[i11 & 1]);
                    i11++;
                    copyOf2 = copyOf2;
                }
                long[] jArr3 = new long[19];
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                jArr5[0] = 1;
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                long[] jArr8 = new long[19];
                jArr8[0] = 1;
                long[] jArr9 = new long[19];
                long[] jArr10 = new long[19];
                jArr10[0] = 1;
                System.arraycopy(jArr2, 0, jArr3, 0, 10);
                int i14 = 0;
                while (i14 < 32) {
                    byte b11 = copyOf[(32 - i14) - 1] & 255;
                    int i15 = 8;
                    while (i8 < i15) {
                        int i16 = (b11 >> (7 - i8)) & 1;
                        ha.a(jArr5, jArr3, i16);
                        ha.a(jArr6, jArr4, i16);
                        byte[] bArr6 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr5, 10);
                        byte b12 = b11;
                        long[] jArr11 = jArr;
                        long[] jArr12 = new long[19];
                        int i17 = i14;
                        long[] jArr13 = new long[19];
                        int i18 = i8;
                        long[] jArr14 = new long[19];
                        int i19 = i16;
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr10;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        ag.m.O(jArr5, jArr5, jArr6);
                        ag.m.N(jArr6, copyOf3, jArr6);
                        long[] copyOf4 = Arrays.copyOf(jArr3, 10);
                        ag.m.O(jArr3, jArr3, jArr4);
                        ag.m.N(jArr4, copyOf4, jArr4);
                        ag.m.F(jArr14, jArr3, jArr6);
                        ag.m.F(jArr15, jArr5, jArr4);
                        ag.m.K(jArr14);
                        ag.m.J(jArr14);
                        ag.m.K(jArr15);
                        ag.m.J(jArr15);
                        long[] jArr19 = jArr3;
                        System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                        ag.m.O(jArr14, jArr14, jArr15);
                        ag.m.N(jArr15, copyOf4, jArr15);
                        ag.m.M(jArr18, jArr14);
                        ag.m.M(jArr17, jArr15);
                        ag.m.F(jArr15, jArr17, jArr2);
                        ag.m.K(jArr15);
                        ag.m.J(jArr15);
                        System.arraycopy(jArr18, 0, jArr7, 0, 10);
                        System.arraycopy(jArr15, 0, jArr8, 0, 10);
                        ag.m.M(jArr12, jArr5);
                        ag.m.M(jArr13, jArr6);
                        ag.m.F(jArr9, jArr12, jArr13);
                        ag.m.K(jArr9);
                        ag.m.J(jArr9);
                        ag.m.N(jArr13, jArr12, jArr13);
                        long[] jArr20 = new long[19];
                        Arrays.fill(jArr20, 10, 18, 0);
                        int i20 = 0;
                        for (int i21 = 10; i20 < i21; i21 = 10) {
                            jArr20[i20] = jArr13[i20] * 121665;
                            i20++;
                        }
                        ag.m.J(jArr20);
                        ag.m.O(jArr20, jArr20, jArr12);
                        long[] jArr21 = jArr16;
                        ag.m.F(jArr21, jArr13, jArr20);
                        ag.m.K(jArr21);
                        ag.m.J(jArr21);
                        int i22 = i19;
                        ha.a(jArr9, jArr7, i22);
                        ha.a(jArr21, jArr8, i22);
                        i8 = i18 + 1;
                        byte[] bArr7 = bArr2;
                        jArr3 = jArr7;
                        b11 = b12;
                        copyOf = bArr6;
                        jArr = jArr11;
                        i14 = i17;
                        jArr7 = jArr19;
                        i15 = 8;
                        long[] jArr22 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr22;
                        long[] jArr23 = jArr9;
                        jArr9 = jArr5;
                        jArr5 = jArr23;
                        long[] jArr24 = jArr21;
                        jArr10 = jArr6;
                        jArr6 = jArr24;
                    }
                    byte[] bArr8 = copyOf;
                    long[] jArr25 = jArr3;
                    long[] jArr26 = jArr;
                    i14++;
                    byte[] bArr9 = bArr2;
                    i8 = 0;
                }
                long[] jArr27 = jArr;
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = new long[10];
                long[] jArr34 = new long[10];
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = new long[10];
                long[] jArr38 = jArr3;
                long[] jArr39 = new long[10];
                ag.m.M(jArr29, jArr6);
                ag.m.M(jArr39, jArr29);
                ag.m.M(jArr37, jArr39);
                ag.m.x(jArr30, jArr37, jArr6);
                ag.m.x(jArr31, jArr30, jArr29);
                ag.m.M(jArr37, jArr31);
                ag.m.x(jArr32, jArr37, jArr30);
                ag.m.M(jArr37, jArr32);
                ag.m.M(jArr39, jArr37);
                ag.m.M(jArr37, jArr39);
                ag.m.M(jArr39, jArr37);
                ag.m.M(jArr37, jArr39);
                ag.m.x(jArr33, jArr37, jArr32);
                ag.m.M(jArr37, jArr33);
                ag.m.M(jArr39, jArr37);
                for (int i23 = 2; i23 < 10; i23 += 2) {
                    ag.m.M(jArr37, jArr39);
                    ag.m.M(jArr39, jArr37);
                }
                ag.m.x(jArr34, jArr39, jArr33);
                ag.m.M(jArr37, jArr34);
                ag.m.M(jArr39, jArr37);
                for (int i24 = 2; i24 < 20; i24 += 2) {
                    ag.m.M(jArr37, jArr39);
                    ag.m.M(jArr39, jArr37);
                }
                ag.m.x(jArr37, jArr39, jArr34);
                ag.m.M(jArr39, jArr37);
                ag.m.M(jArr37, jArr39);
                for (int i25 = 2; i25 < 10; i25 += 2) {
                    ag.m.M(jArr39, jArr37);
                    ag.m.M(jArr37, jArr39);
                }
                ag.m.x(jArr35, jArr37, jArr33);
                ag.m.M(jArr37, jArr35);
                ag.m.M(jArr39, jArr37);
                for (int i26 = 2; i26 < 50; i26 += 2) {
                    ag.m.M(jArr37, jArr39);
                    ag.m.M(jArr39, jArr37);
                }
                ag.m.x(jArr36, jArr39, jArr35);
                ag.m.M(jArr39, jArr36);
                ag.m.M(jArr37, jArr39);
                for (int i27 = 2; i27 < 100; i27 += 2) {
                    ag.m.M(jArr39, jArr37);
                    ag.m.M(jArr37, jArr39);
                }
                ag.m.x(jArr39, jArr37, jArr36);
                ag.m.M(jArr37, jArr39);
                ag.m.M(jArr39, jArr37);
                for (int i28 = 2; i28 < 50; i28 += 2) {
                    ag.m.M(jArr37, jArr39);
                    ag.m.M(jArr39, jArr37);
                }
                ag.m.x(jArr37, jArr39, jArr35);
                ag.m.M(jArr39, jArr37);
                ag.m.M(jArr37, jArr39);
                ag.m.M(jArr39, jArr37);
                ag.m.M(jArr37, jArr39);
                ag.m.M(jArr39, jArr37);
                ag.m.x(jArr28, jArr39, jArr31);
                long[] jArr40 = jArr27;
                ag.m.x(jArr40, jArr5, jArr28);
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[10];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                long[] jArr45 = new long[11];
                ag.m.x(jArr41, jArr2, jArr40);
                ag.m.O(jArr42, jArr2, jArr40);
                long[] jArr46 = new long[10];
                jArr46[0] = 486662;
                ag.m.O(jArr44, jArr42, jArr46);
                ag.m.x(jArr44, jArr44, jArr4);
                long[] jArr47 = jArr38;
                ag.m.O(jArr44, jArr44, jArr47);
                ag.m.x(jArr44, jArr44, jArr41);
                ag.m.x(jArr44, jArr44, jArr47);
                for (int i29 = 0; i29 < 10; i29++) {
                    jArr43[i29] = jArr44[i29] * 4;
                }
                ag.m.J(jArr43);
                ag.m.x(jArr44, jArr41, jArr4);
                ag.m.N(jArr44, jArr44, jArr4);
                ag.m.x(jArr45, jArr42, jArr47);
                ag.m.O(jArr44, jArr44, jArr45);
                ag.m.M(jArr44, jArr44);
                if (MessageDigest.isEqual(ag.m.P(jArr43), ag.m.P(jArr44))) {
                    return ag.m.P(jArr40);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(h(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] l(byte[]... bArr) {
        int i8 = 0;
        int i10 = 0;
        while (true) {
            if (i8 < r3) {
                int length = bArr[i8].length;
                if (i10 <= Integer.MAX_VALUE - length) {
                    i10 += length;
                    i8++;
                } else {
                    throw new GeneralSecurityException("exceeded size limit");
                }
            } else {
                byte[] bArr2 = new byte[i10];
                int i11 = 0;
                for (byte[] bArr3 : bArr) {
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i11, length2);
                    i11 += length2;
                }
                return bArr2;
            }
        }
    }

    public static final byte[] m(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return n(0, 0, length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] n(int i8, int i10, int i11, byte[] bArr, byte[] bArr2) {
        if (bArr.length - i11 < i8 || bArr2.length - i11 < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr3[i12] = (byte) (bArr[i12 + i8] ^ bArr2[i12 + i10]);
        }
        return bArr3;
    }

    public Object then(Task task) {
        com.google.android.gms.common.api.a aVar = k7.d.f10357k;
        return null;
    }

    public Object zza() {
        List list = g2.f13022a;
        return Double.valueOf(rb.f5507b.zza().zza());
    }
}
