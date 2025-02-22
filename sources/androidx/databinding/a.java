package androidx.databinding;

import android.graphics.Typeface;
import androidx.compose.ui.platform.b3;
import cb.c;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.p000firebaseauthapi.ab;
import com.google.android.gms.internal.p000firebaseauthapi.c2;
import com.google.android.gms.internal.p000firebaseauthapi.gd;
import com.google.android.gms.internal.p000firebaseauthapi.ka;
import com.google.android.gms.internal.p000firebaseauthapi.lb;
import com.google.android.gms.internal.p000firebaseauthapi.mg;
import com.google.android.gms.internal.p000firebaseauthapi.nb;
import com.google.android.gms.internal.p000firebaseauthapi.q6;
import com.google.android.gms.internal.p000firebaseauthapi.v6;
import com.google.android.gms.internal.p000firebaseauthapi.w2;
import com.google.android.gms.internal.p000firebaseauthapi.w6;
import com.google.android.gms.internal.p000firebaseauthapi.x6;
import com.google.android.gms.internal.p000firebaseauthapi.y6;
import com.google.android.gms.internal.p000firebaseauthapi.z6;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import i0.i;
import j0.g;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import q7.e2;
import q7.g2;
import r3.s;
import sf.j;
import v1.d;
import z0.p;
import z0.q;
import z0.v;

public class a implements ka, e2, v, Continuation {
    public static final float[] B = {95.047f, 100.0f, 108.883f};
    public static final float[][] C = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f1764a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final kotlinx.coroutines.internal.v f1765b = new kotlinx.coroutines.internal.v("CONDITION_FALSE");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ a f1766c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f1767d = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: e  reason: collision with root package name */
    public static final float[][] f1768e = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long e(float r10, float r11, float r12, float r13, j0.c r14) {
        /*
            java.lang.String r0 = "colorSpace"
            sf.j.f(r14, r0)
            r0 = 0
            float r1 = r14.c(r0)
            float r2 = r14.b(r0)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L_0x0019
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0019
            r1 = r3
            goto L_0x001a
        L_0x0019:
            r1 = r0
        L_0x001a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r1 == 0) goto L_0x0059
            float r1 = r14.c(r3)
            float r5 = r14.b(r3)
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0031
            r1 = r3
            goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            if (r1 == 0) goto L_0x0059
            r1 = 2
            float r5 = r14.c(r1)
            float r1 = r14.b(r1)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            r1 = r3
            goto L_0x0048
        L_0x0047:
            r1 = r0
        L_0x0048:
            if (r1 == 0) goto L_0x0059
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            int r1 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            r1 = r3
            goto L_0x0055
        L_0x0054:
            r1 = r0
        L_0x0055:
            if (r1 == 0) goto L_0x0059
            r1 = r3
            goto L_0x005a
        L_0x0059:
            r1 = r0
        L_0x005a:
            if (r1 == 0) goto L_0x00f0
            boolean r1 = r14.d()
            r5 = 16
            r6 = 32
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x0089
            r14 = 1132396544(0x437f0000, float:255.0)
            float r13 = r13 * r14
            float r13 = r13 + r7
            int r13 = (int) r13
            int r13 = r13 << 24
            float r10 = r10 * r14
            float r10 = r10 + r7
            int r10 = (int) r10
            int r10 = r10 << r5
            r10 = r10 | r13
            float r11 = r11 * r14
            float r11 = r11 + r7
            int r11 = (int) r11
            int r11 = r11 << 8
            r10 = r10 | r11
            float r12 = r12 * r14
            float r12 = r12 + r7
            int r11 = (int) r12
            r10 = r10 | r11
            long r10 = (long) r10
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            long r10 = r10 << r6
            int r12 = i0.i.f9377f
            return r10
        L_0x0089:
            int r1 = j0.b.f9681e
            long r8 = r14.f9683b
            long r8 = r8 >> r6
            int r1 = (int) r8
            r8 = 3
            if (r1 != r8) goto L_0x0094
            r1 = r3
            goto L_0x0095
        L_0x0094:
            r1 = r0
        L_0x0095:
            if (r1 == 0) goto L_0x00e4
            r1 = -1
            int r14 = r14.f9684c
            if (r14 == r1) goto L_0x009d
            r0 = r3
        L_0x009d:
            if (r0 == 0) goto L_0x00d8
            short r10 = i0.j.a(r10)
            short r11 = i0.j.a(r11)
            short r12 = i0.j.a(r12)
            float r13 = java.lang.Math.min(r13, r2)
            float r13 = java.lang.Math.max(r4, r13)
            r0 = 1149222912(0x447fc000, float:1023.0)
            float r13 = r13 * r0
            float r13 = r13 + r7
            int r13 = (int) r13
            long r0 = (long) r10
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            r10 = 48
            long r0 = r0 << r10
            long r10 = (long) r11
            long r10 = r10 & r2
            long r10 = r10 << r6
            long r10 = r10 | r0
            long r0 = (long) r12
            long r0 = r0 & r2
            long r0 = r0 << r5
            long r10 = r10 | r0
            long r12 = (long) r13
            r0 = 1023(0x3ff, double:5.054E-321)
            long r12 = r12 & r0
            r0 = 6
            long r12 = r12 << r0
            long r10 = r10 | r12
            long r12 = (long) r14
            r0 = 63
            long r12 = r12 & r0
            long r10 = r10 | r12
            int r12 = i0.i.f9377f
            return r10
        L_0x00d8:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Unknown color space, please use a color space in ColorSpaces"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00e4:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Color only works with ColorSpaces with 3 components"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00f0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "red = "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = ", green = "
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = ", blue = "
            r0.append(r10)
            r0.append(r12)
            java.lang.String r10 = ", alpha = "
            r0.append(r10)
            r0.append(r13)
            java.lang.String r10 = " outside the range for "
            r0.append(r10)
            r0.append(r14)
            java.lang.String r10 = r0.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.a.e(float, float, float, float, j0.c):long");
    }

    public static final long f(long j10) {
        long j11 = (j10 & 4294967295L) << 32;
        int i8 = i.f9377f;
        return j11;
    }

    public static Typeface g(String str, p pVar, int i8) {
        boolean z10 = true;
        if ((i8 == 0) && j.a(pVar, p.f17606c)) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                j.e(typeface, "DEFAULT");
                return typeface;
            }
        }
        Typeface create = str == null ? Typeface.DEFAULT : Typeface.create(str, 0);
        int i10 = pVar.f17608a;
        if (i8 != 1) {
            z10 = false;
        }
        Typeface b10 = Typeface.create(create, i10, z10);
        j.e(b10, "create(\n            fami…ontStyle.Italic\n        )");
        return b10;
    }

    public static int h(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = (f10 > 8.0f ? 1 : (f10 == 8.0f ? 0 : -1)) > 0 ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = B;
        return d.a((double) (f14 * fArr[0]), (double) (f12 * fArr[1]), (double) (f13 * fArr[2]));
    }

    public static float i(int i8) {
        float f10 = ((float) i8) / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((double) ((f10 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    public static final boolean k(String str) {
        j.f(str, "method");
        return !j.a(str, "GET") && !j.a(str, "HEAD");
    }

    public static final int l(long j10) {
        float[] fArr = g.f9686a;
        return (int) (i.a(j10, g.f9688c) >>> 32);
    }

    public static float m() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public c a(nb nbVar) {
        w6 w6Var;
        x6 x6Var;
        ab abVar = z6.f5124a;
        if (((lb) nbVar).f4712a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                gd w10 = gd.w(((lb) nbVar).f4714c, c2.f4439b);
                if (w10.t() == 0) {
                    v6 v6Var = new v6();
                    int c3 = w10.x().z().c();
                    if (!(c3 == 16 || c3 == 24)) {
                        if (c3 != 32) {
                            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(c3)}));
                        }
                    }
                    v6Var.f5010a = Integer.valueOf(c3);
                    int c10 = w10.y().z().c();
                    if (c10 >= 16) {
                        v6Var.f5011b = Integer.valueOf(c10);
                        int t2 = w10.y().y().t();
                        if (t2 >= 10) {
                            v6Var.f5012c = Integer.valueOf(t2);
                            int y10 = w10.y().y().y();
                            int i8 = y10 - 2;
                            if (i8 == 1) {
                                w6Var = w6.f5036b;
                            } else if (i8 == 2) {
                                w6Var = w6.f5039e;
                            } else if (i8 == 3) {
                                w6Var = w6.f5038d;
                            } else if (i8 == 4) {
                                w6Var = w6.f5040f;
                            } else if (i8 == 5) {
                                w6Var = w6.f5037c;
                            } else {
                                throw new GeneralSecurityException("Unable to parse HashType: " + b3.b(y10));
                            }
                            v6Var.f5013d = w6Var;
                            mg mgVar = ((lb) nbVar).f4716e;
                            int ordinal = mgVar.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        x6Var = x6.f5077d;
                                    } else if (ordinal != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + mgVar.zza());
                                    }
                                }
                                x6Var = x6.f5076c;
                            } else {
                                x6Var = x6.f5075b;
                            }
                            v6Var.f5014e = x6Var;
                            y6 a10 = v6Var.a();
                            q6 q6Var = new q6();
                            q6Var.f4835a = a10;
                            q6Var.f4836b = s.i(w10.x().z().m());
                            q6Var.f4837c = s.i(w10.y().z().m());
                            q6Var.f4838d = ((lb) nbVar).B;
                            return q6Var.a();
                        }
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(t2)}));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{Integer.valueOf(c10)}));
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (w2 unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
    }

    public Typeface c(p pVar, int i8) {
        j.f(pVar, "fontWeight");
        return g((String) null, pVar, i8);
    }

    public Typeface d(q qVar, p pVar, int i8) {
        j.f(qVar, "name");
        j.f(pVar, "fontWeight");
        return g(qVar.f17609a, pVar, i8);
    }

    public void j(int i8) {
        synchronized (this) {
        }
    }

    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().zzk());
    }
}
