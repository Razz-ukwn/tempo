package ag;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.n;
import androidx.fragment.app.p;
import androidx.fragment.app.q;
import androidx.navigation.fragment.NavHostFragment;
import b3.d0;
import b3.l0;
import com.google.android.gms.internal.measurement.rb;
import com.google.android.gms.internal.p000firebaseauthapi.v8;
import f.a;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.internal.v;
import q2.d;
import q7.e2;
import q7.g2;
import sf.j;
import z6.b;

public final class m implements e2, b {
    public static d B;
    public static final /* synthetic */ m C = new m();
    public static final m D = new m();

    /* renamed from: a  reason: collision with root package name */
    public static final v f438a = new v("RESUME_TOKEN");

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f439b = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f440c = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f441d = {67108863, 33554431};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f442e = {26, 25};

    public static String A(int i8) {
        if (i8 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i8 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i8 == 104) {
            return "LOW_POWER";
        }
        if (i8 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r9v1, types: [r9.d0] */
    /* JADX WARNING: type inference failed for: r3v1, types: [r9.s] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0012 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList B(java.util.List r15) {
        /*
            if (r15 == 0) goto L_0x0054
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0009
            goto L_0x0054
        L_0x0009:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x0012:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r15.next()
            com.google.android.gms.internal.firebase-auth-api.o0 r1 = (com.google.android.gms.internal.p000firebaseauthapi.o0) r1
            if (r1 != 0) goto L_0x0021
            goto L_0x004c
        L_0x0021:
            java.lang.String r2 = r1.f4767a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x003b
            r9.s r2 = new r9.s
            java.lang.String r6 = r1.f4768b
            java.lang.String r7 = r1.f4769c
            long r4 = r1.f4770d
            java.lang.String r8 = r1.f4767a
            u6.q.f(r8)
            r3 = r2
            r3.<init>(r4, r6, r7, r8)
            goto L_0x004d
        L_0x003b:
            com.google.android.gms.internal.firebase-auth-api.t0 r14 = r1.f4771e
            if (r14 == 0) goto L_0x004c
            r9.d0 r2 = new r9.d0
            java.lang.String r10 = r1.f4768b
            java.lang.String r11 = r1.f4769c
            long r12 = r1.f4770d
            r9 = r2
            r9.<init>(r10, r11, r12, r14)
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            if (r2 == 0) goto L_0x0012
            r0.add(r2)
            goto L_0x0012
        L_0x0053:
            return r0
        L_0x0054:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.m.B(java.util.List):java.util.ArrayList");
    }

    public static void C(int i8, int i10) {
        if (i8 < 0 || i8 > i10) {
            throw new IndexOutOfBoundsException(H(i8, i10, "index"));
        }
    }

    public static void D(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static void E(Parcel parcel, int i8) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i8 - 4);
        parcel.writeInt(dataPosition - i8);
        parcel.setDataPosition(dataPosition);
    }

    /* JADX WARNING: type inference failed for: r56v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void F(long[] r56, long[] r57, long[] r58) {
        /*
            r0 = 0
            r1 = r57[r0]
            r3 = r58[r0]
            long r1 = r1 * r3
            r56[r0] = r1
            r1 = r57[r0]
            r3 = 1
            r4 = r58[r3]
            long r4 = r4 * r1
            r6 = r57[r3]
            r8 = r58[r0]
            long r6 = r6 * r8
            long r6 = r6 + r4
            r56[r3] = r6
            r4 = r57[r3]
            long r6 = r4 + r4
            r10 = r58[r3]
            long r6 = r6 * r10
            r0 = 2
            r12 = r58[r0]
            long r12 = r12 * r1
            r14 = r57[r0]
            long r14 = r14 * r8
            long r6 = r6 + r12
            long r6 = r6 + r14
            r56[r0] = r6
            r6 = r58[r0]
            long r12 = r4 * r6
            r14 = r57[r0]
            long r16 = r14 * r10
            r0 = 3
            r18 = r58[r0]
            long r18 = r18 * r1
            r20 = r57[r0]
            long r20 = r20 * r8
            long r12 = r12 + r16
            long r12 = r12 + r18
            long r12 = r12 + r20
            r56[r0] = r12
            long r12 = r14 * r6
            r16 = r58[r0]
            long r18 = r4 * r16
            r20 = r57[r0]
            long r22 = r20 * r10
            r0 = 4
            r24 = r58[r0]
            long r24 = r24 * r1
            r26 = r57[r0]
            long r26 = r26 * r8
            long r18 = r18 + r22
            long r18 = r18 + r18
            long r18 = r18 + r12
            long r18 = r18 + r24
            long r18 = r18 + r26
            r56[r0] = r18
            long r12 = r14 * r16
            long r18 = r20 * r6
            r22 = r58[r0]
            long r24 = r4 * r22
            r26 = r57[r0]
            long r28 = r26 * r10
            r0 = 5
            r30 = r58[r0]
            long r30 = r30 * r1
            r32 = r57[r0]
            long r32 = r32 * r8
            long r12 = r12 + r18
            long r12 = r12 + r24
            long r12 = r12 + r28
            long r12 = r12 + r30
            long r12 = r12 + r32
            r56[r0] = r12
            long r12 = r20 * r16
            r18 = r58[r0]
            long r24 = r4 * r18
            r28 = r57[r0]
            long r30 = r28 * r10
            long r32 = r14 * r22
            long r34 = r26 * r6
            r0 = 6
            r36 = r58[r0]
            long r36 = r36 * r1
            r38 = r57[r0]
            long r38 = r38 * r8
            long r12 = r12 + r24
            long r12 = r12 + r30
            long r12 = r12 + r12
            long r12 = r12 + r32
            long r12 = r12 + r34
            long r12 = r12 + r36
            long r12 = r12 + r38
            r56[r0] = r12
            long r12 = r20 * r22
            long r24 = r26 * r16
            long r30 = r14 * r18
            long r32 = r28 * r6
            r34 = r58[r0]
            long r36 = r4 * r34
            r38 = r57[r0]
            long r40 = r38 * r10
            r0 = 7
            r42 = r58[r0]
            long r42 = r42 * r1
            r44 = r57[r0]
            long r44 = r44 * r8
            long r12 = r12 + r24
            long r12 = r12 + r30
            long r12 = r12 + r32
            long r12 = r12 + r36
            long r12 = r12 + r40
            long r12 = r12 + r42
            long r12 = r12 + r44
            r56[r0] = r12
            long r12 = r26 * r22
            long r24 = r20 * r18
            long r30 = r28 * r16
            r32 = r58[r0]
            long r36 = r4 * r32
            r40 = r57[r0]
            long r42 = r40 * r10
            long r44 = r14 * r34
            long r46 = r38 * r6
            r0 = 8
            r48 = r58[r0]
            long r48 = r48 * r1
            r50 = r57[r0]
            long r50 = r50 * r8
            long r24 = r24 + r30
            long r24 = r24 + r36
            long r24 = r24 + r42
            long r24 = r24 + r24
            long r24 = r24 + r12
            long r24 = r24 + r44
            long r24 = r24 + r46
            long r24 = r24 + r48
            long r24 = r24 + r50
            r56[r0] = r24
            long r12 = r26 * r18
            long r24 = r28 * r22
            long r30 = r20 * r34
            long r36 = r38 * r16
            long r42 = r14 * r32
            long r44 = r40 * r6
            r46 = r58[r0]
            long r48 = r4 * r46
            r50 = r57[r0]
            long r52 = r50 * r10
            r0 = 9
            r54 = r58[r0]
            long r1 = r1 * r54
            r54 = r57[r0]
            long r54 = r54 * r8
            long r12 = r12 + r24
            long r12 = r12 + r30
            long r12 = r12 + r36
            long r12 = r12 + r42
            long r12 = r12 + r44
            long r12 = r12 + r48
            long r12 = r12 + r52
            long r12 = r12 + r1
            long r12 = r12 + r54
            r56[r0] = r12
            long r1 = r28 * r18
            long r8 = r20 * r32
            long r12 = r40 * r16
            r24 = r58[r0]
            long r4 = r4 * r24
            r30 = r57[r0]
            long r10 = r10 * r30
            long r36 = r26 * r34
            long r42 = r38 * r22
            long r44 = r14 * r46
            long r48 = r50 * r6
            long r1 = r1 + r8
            long r1 = r1 + r12
            long r1 = r1 + r4
            long r1 = r1 + r10
            long r1 = r1 + r1
            long r1 = r1 + r36
            long r1 = r1 + r42
            long r1 = r1 + r44
            long r1 = r1 + r48
            r0 = 10
            r56[r0] = r1
            long r0 = r28 * r34
            long r2 = r38 * r18
            long r4 = r26 * r32
            long r8 = r40 * r22
            long r10 = r20 * r46
            long r12 = r50 * r16
            long r14 = r14 * r24
            long r6 = r6 * r30
            long r0 = r0 + r2
            long r0 = r0 + r4
            long r0 = r0 + r8
            long r0 = r0 + r10
            long r0 = r0 + r12
            long r0 = r0 + r14
            long r0 = r0 + r6
            r2 = 11
            r56[r2] = r0
            long r0 = r38 * r34
            long r2 = r28 * r32
            long r4 = r40 * r18
            long r20 = r20 * r24
            long r16 = r16 * r30
            long r6 = r26 * r46
            long r8 = r50 * r22
            long r2 = r2 + r4
            long r2 = r2 + r20
            long r2 = r2 + r16
            long r2 = r2 + r2
            long r2 = r2 + r0
            long r2 = r2 + r6
            long r2 = r2 + r8
            r0 = 12
            r56[r0] = r2
            long r0 = r38 * r32
            long r2 = r40 * r34
            long r4 = r28 * r46
            long r6 = r50 * r18
            long r26 = r26 * r24
            long r22 = r22 * r30
            long r0 = r0 + r2
            long r0 = r0 + r4
            long r0 = r0 + r6
            long r0 = r0 + r26
            long r0 = r0 + r22
            r2 = 13
            r56[r2] = r0
            long r0 = r40 * r32
            long r28 = r28 * r24
            long r18 = r18 * r30
            long r2 = r38 * r46
            long r4 = r50 * r34
            long r0 = r0 + r28
            long r0 = r0 + r18
            long r0 = r0 + r0
            long r0 = r0 + r2
            long r0 = r0 + r4
            r2 = 14
            r56[r2] = r0
            long r0 = r40 * r46
            long r2 = r50 * r32
            long r38 = r38 * r24
            long r34 = r34 * r30
            long r0 = r0 + r2
            long r0 = r0 + r38
            long r0 = r0 + r34
            r2 = 15
            r56[r2] = r0
            long r0 = r50 * r46
            long r40 = r40 * r24
            long r32 = r32 * r30
            long r32 = r32 + r40
            long r32 = r32 + r32
            long r32 = r32 + r0
            r0 = 16
            r56[r0] = r32
            long r50 = r50 * r24
            long r46 = r46 * r30
            long r46 = r46 + r50
            r0 = 17
            r56[r0] = r46
            long r30 = r30 + r30
            long r30 = r30 * r24
            r0 = 18
            r56[r0] = r30
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.m.F(long[], long[], long[]):void");
    }

    public static void G(int i8, int i10, int i11) {
        String str;
        if (i8 < 0 || i10 < i8 || i10 > i11) {
            if (i8 < 0 || i8 > i11) {
                str = H(i8, i11, "start index");
            } else if (i10 < 0 || i10 > i11) {
                str = H(i10, i11, "end index");
            } else {
                str = v("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i8));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static String H(int i8, int i10, String str) {
        if (i8 < 0) {
            return v("%s (%s) must not be negative", str, Integer.valueOf(i8));
        } else if (i10 >= 0) {
            return v("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i10));
        } else {
            throw new IllegalArgumentException(q.a("negative size: ", i10));
        }
    }

    public static void I(Parcel parcel, Parcelable parcelable, int i8) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i8);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void J(long[] jArr) {
        jArr[10] = 0;
        int i8 = 0;
        while (i8 < 10) {
            long j10 = jArr[i8];
            long j11 = j10 / 67108864;
            jArr[i8] = j10 - (j11 << 26);
            int i10 = i8 + 1;
            long j12 = jArr[i10] + j11;
            jArr[i10] = j12;
            long j13 = j12 / 33554432;
            jArr[i10] = j12 - (j13 << 25);
            i8 += 2;
            jArr[i8] = jArr[i8] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j15 + j15 + j16;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static void K(long[] jArr) {
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j11 + j11 + j12;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j15 + j15 + j16;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j19 + j19 + j20;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j23 + j23 + j24;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j27 + j27 + j28;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j31 + j31 + j32;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j35 + j35 + j36;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j39 + j39 + j40;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j43 + j43 + j44;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
    }

    public static boolean L(byte b10) {
        return b10 > -65;
    }

    public static void M(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[0];
        long j12 = j11 + j11;
        long j13 = jArr2[1];
        long j14 = (jArr2[2] * j11) + (j13 * j13);
        long j15 = jArr2[2];
        long j16 = (jArr2[3] * j11) + (j13 * j15);
        long j17 = jArr2[3];
        long j18 = (j15 * j15) + (j13 * 4 * j17);
        long j19 = jArr2[4];
        long j20 = (j15 * j17) + (j13 * j19) + (jArr2[5] * j11);
        long j21 = jArr2[5];
        long j22 = (j17 * j17) + (j15 * j19) + (jArr2[6] * j11) + ((j13 + j13) * j21);
        long j23 = jArr2[6];
        long j24 = (j17 * j19) + (j15 * j21) + (j13 * j23) + (jArr2[7] * j11);
        long j25 = jArr2[7];
        long j26 = (j17 * j21) + (j13 * j25);
        long j27 = j26 + j26 + (j15 * j23) + (jArr2[8] * j11);
        long j28 = j27 + j27;
        long j29 = jArr2[8];
        long j30 = (j19 * j21) + (j17 * j23) + (j15 * j25) + (j13 * j29) + (j11 * jArr2[9]);
        long j31 = jArr2[9];
        long j32 = (j13 * j31) + (j17 * j25);
        long j33 = j32 + j32;
        long j34 = j33 + (j21 * j21) + (j19 * j23) + (j15 * j29);
        long j35 = (j21 * j23) + (j19 * j25) + (j17 * j29) + (j15 * j31);
        long j36 = (j17 * j31) + (j21 * j25);
        long j37 = j36 + j36 + (j19 * j29);
        long j38 = (j23 * j25) + (j21 * j29) + (j19 * j31);
        long j39 = (j25 * j25) + (j23 * j29) + ((j21 + j21) * j31);
        long j40 = (j23 * j31) + (j25 * j29);
        long[] jArr3 = {j10 * j10, jArr2[1] * j12, j14 + j14, j16 + j16, j18 + (j12 * jArr2[4]), j20 + j20, j22 + j22, j24 + j24, j28 + (j19 * j19), j30 + j30, j34 + j34, j35 + j35, j37 + j37 + (j23 * j23), j38 + j38, j39 + j39, j40 + j40, (j25 * 4 * j31) + (j29 * j29), (j29 + j29) * j31, (j31 + j31) * j31};
        K(jArr3);
        J(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void N(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i8 = 0; i8 < 10; i8++) {
            jArr[i8] = jArr2[i8] - jArr3[i8];
        }
    }

    public static void O(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i8 = 0; i8 < 10; i8++) {
            jArr[i8] = jArr2[i8] + jArr3[i8];
        }
    }

    public static byte[] P(long[] jArr) {
        int[] iArr;
        int i8;
        int[] iArr2;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i10 = 0;
        while (true) {
            iArr = f442e;
            i8 = 2;
            if (i10 >= 2) {
                break;
            }
            int i11 = 0;
            while (i11 < 9) {
                long j10 = copyOf[i11];
                int i12 = iArr[i11 & 1];
                int i13 = -((int) (((j10 >> 31) & j10) >> i12));
                copyOf[i11] = j10 + ((long) (i13 << i12));
                i11++;
                copyOf[i11] = copyOf[i11] - ((long) i13);
            }
            long j11 = copyOf[9];
            int i14 = -((int) (((j11 >> 31) & j11) >> 25));
            copyOf[9] = j11 + ((long) (i14 << 25));
            copyOf[0] = copyOf[0] - (((long) i14) * 19);
            i10++;
        }
        long j12 = copyOf[0];
        int i15 = -((int) (((j12 >> 31) & j12) >> 26));
        copyOf[0] = j12 + ((long) (i15 << 26));
        copyOf[1] = copyOf[1] - ((long) i15);
        int i16 = 0;
        while (true) {
            iArr2 = f441d;
            if (i16 >= i8) {
                break;
            }
            int i17 = 0;
            while (i17 < 9) {
                long j13 = copyOf[i17];
                int i18 = i17 & 1;
                copyOf[i17] = ((long) iArr2[i18]) & j13;
                i17++;
                copyOf[i17] = copyOf[i17] + ((long) ((int) (j13 >> iArr[i18])));
            }
            i16++;
            i8 = 2;
        }
        long j14 = copyOf[9];
        copyOf[9] = j14 & 33554431;
        long j15 = (((long) ((int) (j14 >> 25))) * 19) + copyOf[0];
        copyOf[0] = j15;
        int i19 = ~((((int) j15) - 67108845) >> 31);
        for (int i20 = 1; i20 < 10; i20++) {
            int i21 = ~(((int) copyOf[i20]) ^ iArr2[i20 & 1]);
            int i22 = i21 & (i21 << 16);
            int i23 = i22 & (i22 << 8);
            int i24 = i23 & (i23 << 4);
            int i25 = i24 & (i24 << 2);
            i19 &= (i25 & (i25 + i25)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i19));
        long j16 = (long) (33554431 & i19);
        copyOf[1] = copyOf[1] - j16;
        for (int i26 = 2; i26 < 10; i26 += 2) {
            copyOf[i26] = copyOf[i26] - ((long) (67108863 & i19));
            int i27 = i26 + 1;
            copyOf[i27] = copyOf[i27] - j16;
        }
        for (int i28 = 0; i28 < 10; i28++) {
            copyOf[i28] = copyOf[i28] << f440c[i28];
        }
        byte[] bArr = new byte[32];
        for (int i29 = 0; i29 < 10; i29++) {
            int i30 = f439b[i29];
            long j17 = copyOf[i29];
            bArr[i30] = (byte) ((int) (((long) bArr[i30]) | (j17 & 255)));
            int i31 = i30 + 1;
            bArr[i31] = (byte) ((int) (((long) bArr[i31]) | ((j17 >> 8) & 255)));
            int i32 = i30 + 2;
            bArr[i32] = (byte) ((int) (((long) bArr[i32]) | ((j17 >> 16) & 255)));
            int i33 = i30 + 3;
            bArr[i33] = (byte) ((int) (((long) bArr[i33]) | ((j17 >> 24) & 255)));
        }
        return bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0271, code lost:
        if (r2.f10829d == r8) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f1, code lost:
        if (r4.f10829d == r13) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x048c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x06d7  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06e9  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x00fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x028a A[EDGE_INSN: B:426:0x028a->B:173:0x028a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(l1.e r36, j1.d r37, java.util.ArrayList r38, int r39) {
        /*
            r0 = r36
            r10 = r37
            r11 = r38
            r12 = 2
            if (r39 != 0) goto L_0x0012
            int r1 = r0.B0
            l1.b[] r2 = r0.E0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.C0
            l1.b[] r2 = r0.D0
            r14 = r1
            r15 = r2
            r16 = r12
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0716
            r1 = r15[r9]
            boolean r2 = r1.f10825q
            r3 = 3
            r8 = 8
            r5 = 1
            l1.d r7 = r1.f10810a
            r17 = 0
            if (r2 != 0) goto L_0x013d
            int r2 = r1.f10821l
            int r6 = r2 * 2
            r13 = r7
            r19 = r13
            r18 = 0
        L_0x0034:
            if (r18 != 0) goto L_0x0107
            int r4 = r1.f10818i
            int r4 = r4 + r5
            r1.f10818i = r4
            l1.d[] r4 = r13.f10870p0
            r4[r2] = r17
            l1.d[] r4 = r13.f10868o0
            r4[r2] = r17
            int r4 = r13.f10859j0
            l1.c[] r5 = r13.S
            if (r4 == r8) goto L_0x00d3
            int r4 = r13.k(r2)
            r4 = r5[r6]
            r4.e()
            int r4 = r6 + 1
            r22 = r5[r4]
            r22.e()
            r22 = r5[r6]
            r22.e()
            r4 = r5[r4]
            r4.e()
            l1.d r4 = r1.f10811b
            if (r4 != 0) goto L_0x0069
            r1.f10811b = r13
        L_0x0069:
            r1.f10813d = r13
            int[] r4 = r13.V
            r4 = r4[r2]
            if (r4 != r3) goto L_0x00d3
            int[] r8 = r13.f10877u
            r8 = r8[r2]
            if (r8 == 0) goto L_0x007b
            if (r8 == r3) goto L_0x007b
            if (r8 != r12) goto L_0x00d3
        L_0x007b:
            int r12 = r1.f10819j
            r21 = 1
            int r12 = r12 + 1
            r1.f10819j = r12
            float[] r12 = r13.f10866n0
            r12 = r12[r2]
            r20 = 0
            int r23 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x0092
            float r3 = r1.f10820k
            float r3 = r3 + r12
            r1.f10820k = r3
        L_0x0092:
            int r3 = r13.f10859j0
            r24 = r9
            r9 = 8
            if (r3 == r9) goto L_0x00a3
            r3 = 3
            if (r4 != r3) goto L_0x00a3
            if (r8 == 0) goto L_0x00a1
            if (r8 != r3) goto L_0x00a3
        L_0x00a1:
            r3 = 1
            goto L_0x00a4
        L_0x00a3:
            r3 = 0
        L_0x00a4:
            if (r3 == 0) goto L_0x00c2
            r3 = 0
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x00af
            r3 = 1
            r1.f10822n = r3
            goto L_0x00b2
        L_0x00af:
            r3 = 1
            r1.f10823o = r3
        L_0x00b2:
            java.util.ArrayList<l1.d> r3 = r1.f10817h
            if (r3 != 0) goto L_0x00bd
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f10817h = r3
        L_0x00bd:
            java.util.ArrayList<l1.d> r3 = r1.f10817h
            r3.add(r13)
        L_0x00c2:
            l1.d r3 = r1.f10815f
            if (r3 != 0) goto L_0x00c8
            r1.f10815f = r13
        L_0x00c8:
            l1.d r3 = r1.f10816g
            if (r3 == 0) goto L_0x00d0
            l1.d[] r3 = r3.f10868o0
            r3[r2] = r13
        L_0x00d0:
            r1.f10816g = r13
            goto L_0x00d5
        L_0x00d3:
            r24 = r9
        L_0x00d5:
            r3 = r19
            if (r3 == r13) goto L_0x00dd
            l1.d[] r3 = r3.f10870p0
            r3[r2] = r13
        L_0x00dd:
            int r3 = r6 + 1
            r3 = r5[r3]
            l1.c r3 = r3.f10831f
            if (r3 == 0) goto L_0x00f3
            l1.d r3 = r3.f10829d
            l1.c[] r4 = r3.S
            r4 = r4[r6]
            l1.c r4 = r4.f10831f
            if (r4 == 0) goto L_0x00f3
            l1.d r4 = r4.f10829d
            if (r4 == r13) goto L_0x00f5
        L_0x00f3:
            r3 = r17
        L_0x00f5:
            if (r3 == 0) goto L_0x00f8
            goto L_0x00fb
        L_0x00f8:
            r3 = r13
            r18 = 1
        L_0x00fb:
            r19 = r13
            r9 = r24
            r5 = 1
            r8 = 8
            r12 = 2
            r13 = r3
            r3 = 3
            goto L_0x0034
        L_0x0107:
            r24 = r9
            l1.d r3 = r1.f10811b
            if (r3 == 0) goto L_0x0114
            l1.c[] r3 = r3.S
            r3 = r3[r6]
            r3.e()
        L_0x0114:
            l1.d r3 = r1.f10813d
            if (r3 == 0) goto L_0x0121
            int r6 = r6 + 1
            l1.c[] r3 = r3.S
            r3 = r3[r6]
            r3.e()
        L_0x0121:
            r1.f10812c = r13
            if (r2 != 0) goto L_0x012c
            boolean r2 = r1.m
            if (r2 == 0) goto L_0x012c
            r1.f10814e = r13
            goto L_0x012e
        L_0x012c:
            r1.f10814e = r7
        L_0x012e:
            boolean r2 = r1.f10823o
            if (r2 == 0) goto L_0x0138
            boolean r2 = r1.f10822n
            if (r2 == 0) goto L_0x0138
            r2 = 1
            goto L_0x0139
        L_0x0138:
            r2 = 0
        L_0x0139:
            r1.f10824p = r2
            r2 = 1
            goto L_0x0140
        L_0x013d:
            r24 = r9
            r2 = r5
        L_0x0140:
            r1.f10825q = r2
            if (r11 == 0) goto L_0x0153
            boolean r2 = r11.contains(r7)
            if (r2 == 0) goto L_0x014b
            goto L_0x0153
        L_0x014b:
            r30 = r14
            r31 = r15
            r22 = r24
            goto L_0x0709
        L_0x0153:
            l1.d r12 = r1.f10812c
            l1.d r13 = r1.f10811b
            l1.d r9 = r1.f10813d
            l1.d r2 = r1.f10814e
            float r3 = r1.f10820k
            int[] r4 = r0.V
            r4 = r4[r39]
            r8 = 2
            if (r4 != r8) goto L_0x0166
            r4 = 1
            goto L_0x0167
        L_0x0166:
            r4 = 0
        L_0x0167:
            if (r39 != 0) goto L_0x0182
            int r5 = r2.f10863l0
            r6 = 1
            if (r5 != 0) goto L_0x0171
            r21 = 1
            goto L_0x0173
        L_0x0171:
            r21 = 0
        L_0x0173:
            if (r5 != r6) goto L_0x0178
            r18 = r6
            goto L_0x017a
        L_0x0178:
            r18 = 0
        L_0x017a:
            if (r5 != r8) goto L_0x017f
            r5 = r21
            goto L_0x0197
        L_0x017f:
            r5 = r21
            goto L_0x01a1
        L_0x0182:
            r6 = 1
            int r5 = r2.f10864m0
            if (r5 != 0) goto L_0x018a
            r18 = r6
            goto L_0x018c
        L_0x018a:
            r18 = 0
        L_0x018c:
            if (r5 != r6) goto L_0x0190
            r6 = 1
            goto L_0x0191
        L_0x0190:
            r6 = 0
        L_0x0191:
            if (r5 != r8) goto L_0x019d
            r5 = r18
            r18 = r6
        L_0x0197:
            r19 = r18
            r18 = r5
            r5 = 1
            goto L_0x01a6
        L_0x019d:
            r5 = r18
            r18 = r6
        L_0x01a1:
            r19 = r18
            r18 = r5
            r5 = 0
        L_0x01a6:
            r25 = r3
            r8 = r7
            r6 = 0
        L_0x01aa:
            l1.c[] r3 = r0.S
            if (r6 != 0) goto L_0x028a
            r28 = r6
            l1.c[] r6 = r8.S
            r6 = r6[r16]
            if (r5 == 0) goto L_0x01b9
            r27 = 1
            goto L_0x01bb
        L_0x01b9:
            r27 = 4
        L_0x01bb:
            int r29 = r6.e()
            int[] r11 = r8.V
            r30 = r14
            r14 = r11[r39]
            r31 = r15
            r15 = 3
            if (r14 != r15) goto L_0x01d2
            int[] r14 = r8.f10877u
            r14 = r14[r39]
            if (r14 != 0) goto L_0x01d2
            r14 = 1
            goto L_0x01d3
        L_0x01d2:
            r14 = 0
        L_0x01d3:
            l1.c r15 = r6.f10831f
            if (r15 == 0) goto L_0x01df
            if (r8 == r7) goto L_0x01df
            int r15 = r15.e()
            int r29 = r15 + r29
        L_0x01df:
            r15 = r29
            if (r5 == 0) goto L_0x01ec
            if (r8 == r7) goto L_0x01ec
            if (r8 == r13) goto L_0x01ec
            r29 = r2
            r27 = 8
            goto L_0x01ee
        L_0x01ec:
            r29 = r2
        L_0x01ee:
            l1.c r2 = r6.f10831f
            if (r2 == 0) goto L_0x022c
            if (r8 != r13) goto L_0x0201
            r32 = r7
            j1.g r7 = r6.f10834i
            j1.g r2 = r2.f10834i
            r33 = r1
            r1 = 6
            r10.f(r7, r2, r15, r1)
            goto L_0x020e
        L_0x0201:
            r33 = r1
            r32 = r7
            j1.g r1 = r6.f10834i
            j1.g r2 = r2.f10834i
            r7 = 8
            r10.f(r1, r2, r15, r7)
        L_0x020e:
            if (r14 == 0) goto L_0x0214
            if (r5 != 0) goto L_0x0214
            r27 = 5
        L_0x0214:
            if (r8 != r13) goto L_0x0220
            if (r5 == 0) goto L_0x0220
            boolean[] r1 = r8.U
            boolean r1 = r1[r39]
            if (r1 == 0) goto L_0x0220
            r1 = 5
            goto L_0x0222
        L_0x0220:
            r1 = r27
        L_0x0222:
            j1.g r2 = r6.f10834i
            l1.c r6 = r6.f10831f
            j1.g r6 = r6.f10834i
            r10.e(r2, r6, r15, r1)
            goto L_0x0230
        L_0x022c:
            r33 = r1
            r32 = r7
        L_0x0230:
            l1.c[] r1 = r8.S
            if (r4 == 0) goto L_0x025d
            int r2 = r8.f10859j0
            r6 = 8
            if (r2 == r6) goto L_0x024f
            r2 = r11[r39]
            r6 = 3
            if (r2 != r6) goto L_0x024f
            int r2 = r16 + 1
            r2 = r1[r2]
            j1.g r2 = r2.f10834i
            r6 = r1[r16]
            j1.g r6 = r6.f10834i
            r7 = 5
            r11 = 0
            r10.f(r2, r6, r11, r7)
            goto L_0x0250
        L_0x024f:
            r11 = 0
        L_0x0250:
            r2 = r1[r16]
            j1.g r2 = r2.f10834i
            r3 = r3[r16]
            j1.g r3 = r3.f10834i
            r6 = 8
            r10.f(r2, r3, r11, r6)
        L_0x025d:
            int r2 = r16 + 1
            r1 = r1[r2]
            l1.c r1 = r1.f10831f
            if (r1 == 0) goto L_0x0273
            l1.d r1 = r1.f10829d
            l1.c[] r2 = r1.S
            r2 = r2[r16]
            l1.c r2 = r2.f10831f
            if (r2 == 0) goto L_0x0273
            l1.d r2 = r2.f10829d
            if (r2 == r8) goto L_0x0275
        L_0x0273:
            r1 = r17
        L_0x0275:
            if (r1 == 0) goto L_0x027b
            r8 = r1
            r6 = r28
            goto L_0x027c
        L_0x027b:
            r6 = 1
        L_0x027c:
            r11 = r38
            r2 = r29
            r14 = r30
            r15 = r31
            r7 = r32
            r1 = r33
            goto L_0x01aa
        L_0x028a:
            r33 = r1
            r29 = r2
            r32 = r7
            r30 = r14
            r31 = r15
            if (r9 == 0) goto L_0x02f6
            l1.c[] r1 = r12.S
            int r2 = r16 + 1
            r1 = r1[r2]
            l1.c r1 = r1.f10831f
            if (r1 == 0) goto L_0x02f6
            l1.c[] r1 = r9.S
            r1 = r1[r2]
            int[] r6 = r9.V
            r6 = r6[r39]
            r7 = 3
            if (r6 != r7) goto L_0x02b3
            int[] r6 = r9.f10877u
            r6 = r6[r39]
            if (r6 != 0) goto L_0x02b3
            r6 = 1
            goto L_0x02b4
        L_0x02b3:
            r6 = 0
        L_0x02b4:
            if (r6 == 0) goto L_0x02cc
            if (r5 != 0) goto L_0x02cc
            l1.c r6 = r1.f10831f
            l1.d r7 = r6.f10829d
            if (r7 != r0) goto L_0x02cc
            j1.g r7 = r1.f10834i
            j1.g r6 = r6.f10834i
            int r8 = r1.e()
            int r8 = -r8
            r11 = 5
            r10.e(r7, r6, r8, r11)
            goto L_0x02e2
        L_0x02cc:
            r11 = 5
            if (r5 == 0) goto L_0x02e2
            l1.c r6 = r1.f10831f
            l1.d r7 = r6.f10829d
            if (r7 != r0) goto L_0x02e2
            j1.g r7 = r1.f10834i
            j1.g r6 = r6.f10834i
            int r8 = r1.e()
            int r8 = -r8
            r14 = 4
            r10.e(r7, r6, r8, r14)
        L_0x02e2:
            j1.g r6 = r1.f10834i
            l1.c[] r7 = r12.S
            r2 = r7[r2]
            l1.c r2 = r2.f10831f
            j1.g r2 = r2.f10834i
            int r1 = r1.e()
            int r1 = -r1
            r7 = 6
            r10.g(r6, r2, r1, r7)
            goto L_0x02f7
        L_0x02f6:
            r11 = 5
        L_0x02f7:
            if (r4 == 0) goto L_0x030e
            int r1 = r16 + 1
            r2 = r3[r1]
            j1.g r2 = r2.f10834i
            l1.c[] r3 = r12.S
            r1 = r3[r1]
            j1.g r3 = r1.f10834i
            int r1 = r1.e()
            r4 = 8
            r10.f(r2, r3, r1, r4)
        L_0x030e:
            r1 = r33
            java.util.ArrayList<l1.d> r2 = r1.f10817h
            if (r2 == 0) goto L_0x0425
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x0425
            boolean r6 = r1.f10822n
            if (r6 == 0) goto L_0x0327
            boolean r6 = r1.f10824p
            if (r6 != 0) goto L_0x0327
            int r6 = r1.f10819j
            float r6 = (float) r6
            goto L_0x0329
        L_0x0327:
            r6 = r25
        L_0x0329:
            r14 = r17
            r7 = 0
            r8 = 0
        L_0x032d:
            if (r7 >= r3) goto L_0x0425
            java.lang.Object r15 = r2.get(r7)
            l1.d r15 = (l1.d) r15
            float[] r4 = r15.f10866n0
            r4 = r4[r39]
            r20 = 0
            int r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            l1.c[] r11 = r15.S
            if (r23 >= 0) goto L_0x0359
            boolean r4 = r1.f10824p
            if (r4 == 0) goto L_0x0355
            int r4 = r16 + 1
            r4 = r11[r4]
            j1.g r4 = r4.f10834i
            r11 = r11[r16]
            j1.g r11 = r11.f10834i
            r0 = 0
            r15 = 4
            r10.e(r4, r11, r0, r15)
            goto L_0x0370
        L_0x0355:
            r0 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x035a
        L_0x0359:
            r0 = 4
        L_0x035a:
            r20 = 0
            int r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r23 != 0) goto L_0x0378
            int r4 = r16 + 1
            r4 = r11[r4]
            j1.g r4 = r4.f10834i
            r11 = r11[r16]
            j1.g r11 = r11.f10834i
            r0 = 0
            r15 = 8
            r10.e(r4, r11, r0, r15)
        L_0x0370:
            r28 = r2
            r26 = r3
            r20 = 0
            goto L_0x0419
        L_0x0378:
            r0 = 0
            if (r14 == 0) goto L_0x040b
            l1.c[] r14 = r14.S
            r0 = r14[r16]
            j1.g r0 = r0.f10834i
            int r26 = r16 + 1
            r14 = r14[r26]
            j1.g r14 = r14.f10834i
            r28 = r2
            r2 = r11[r16]
            j1.g r2 = r2.f10834i
            r11 = r11[r26]
            j1.g r11 = r11.f10834i
            r26 = r3
            j1.b r3 = r37.l()
            r33 = r15
            r15 = 0
            r3.f9751b = r15
            int r20 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r20 == 0) goto L_0x03ec
            int r20 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r20 != 0) goto L_0x03a7
            goto L_0x03ec
        L_0x03a7:
            r20 = 0
            int r34 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r34 != 0) goto L_0x03ba
            j1.b$a r2 = r3.f9753d
            r8 = 1065353216(0x3f800000, float:1.0)
            r2.e(r0, r8)
            j1.b$a r0 = r3.f9753d
            r0.e(r14, r15)
            goto L_0x03ca
        L_0x03ba:
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r23 != 0) goto L_0x03cd
            j1.b$a r0 = r3.f9753d
            r0.e(r2, r15)
            j1.b$a r0 = r3.f9753d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.e(r11, r2)
        L_0x03ca:
            r23 = r4
            goto L_0x0407
        L_0x03cd:
            float r8 = r8 / r6
            float r23 = r4 / r6
            float r8 = r8 / r23
            r23 = r4
            j1.b$a r4 = r3.f9753d
            r4.e(r0, r15)
            j1.b$a r0 = r3.f9753d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.e(r14, r4)
            j1.b$a r0 = r3.f9753d
            r0.e(r11, r8)
            j1.b$a r0 = r3.f9753d
            float r4 = -r8
            r0.e(r2, r4)
            goto L_0x0407
        L_0x03ec:
            r23 = r4
            r4 = r15
            r15 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            j1.b$a r8 = r3.f9753d
            r8.e(r0, r15)
            j1.b$a r0 = r3.f9753d
            r0.e(r14, r4)
            j1.b$a r0 = r3.f9753d
            r0.e(r11, r15)
            j1.b$a r0 = r3.f9753d
            r0.e(r2, r4)
        L_0x0407:
            r10.c(r3)
            goto L_0x0415
        L_0x040b:
            r28 = r2
            r26 = r3
            r23 = r4
            r33 = r15
            r20 = 0
        L_0x0415:
            r8 = r23
            r14 = r33
        L_0x0419:
            int r7 = r7 + 1
            r3 = r26
            r2 = r28
            r4 = 1
            r11 = 5
            r0 = r36
            goto L_0x032d
        L_0x0425:
            if (r13 == 0) goto L_0x0484
            if (r13 == r9) goto L_0x042b
            if (r5 == 0) goto L_0x0484
        L_0x042b:
            r0 = r32
            l1.c[] r0 = r0.S
            r0 = r0[r16]
            l1.c[] r1 = r12.S
            int r2 = r16 + 1
            r1 = r1[r2]
            l1.c r0 = r0.f10831f
            if (r0 == 0) goto L_0x043f
            j1.g r0 = r0.f10834i
            r3 = r0
            goto L_0x0441
        L_0x043f:
            r3 = r17
        L_0x0441:
            l1.c r0 = r1.f10831f
            if (r0 == 0) goto L_0x0449
            j1.g r0 = r0.f10834i
            r6 = r0
            goto L_0x044b
        L_0x0449:
            r6 = r17
        L_0x044b:
            l1.c[] r0 = r13.S
            r0 = r0[r16]
            if (r9 == 0) goto L_0x0455
            l1.c[] r1 = r9.S
            r1 = r1[r2]
        L_0x0455:
            if (r3 == 0) goto L_0x047e
            if (r6 == 0) goto L_0x047e
            if (r39 != 0) goto L_0x0460
            r2 = r29
            float r2 = r2.f10853g0
            goto L_0x0464
        L_0x0460:
            r2 = r29
            float r2 = r2.f10855h0
        L_0x0464:
            r5 = r2
            int r4 = r0.e()
            int r8 = r1.e()
            j1.g r2 = r0.f10834i
            j1.g r7 = r1.f10834i
            r0 = 7
            r1 = r37
            r11 = 2
            r14 = r9
            r15 = r24
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x06a6
        L_0x047e:
            r14 = r9
            r15 = r24
            r11 = 2
            goto L_0x06a6
        L_0x0484:
            r14 = r9
            r15 = r24
            r0 = r32
            r11 = 2
            if (r18 == 0) goto L_0x0572
            if (r13 == 0) goto L_0x0572
            int r2 = r1.f10819j
            if (r2 <= 0) goto L_0x0499
            int r1 = r1.f10818i
            if (r1 != r2) goto L_0x0499
            r21 = 1
            goto L_0x049b
        L_0x0499:
            r21 = 0
        L_0x049b:
            r8 = r13
            r9 = r8
        L_0x049d:
            if (r9 == 0) goto L_0x06a6
            l1.d[] r1 = r9.f10870p0
            r1 = r1[r39]
            r7 = r1
        L_0x04a4:
            if (r7 == 0) goto L_0x04b1
            int r1 = r7.f10859j0
            r6 = 8
            if (r1 != r6) goto L_0x04b3
            l1.d[] r1 = r7.f10870p0
            r7 = r1[r39]
            goto L_0x04a4
        L_0x04b1:
            r6 = 8
        L_0x04b3:
            if (r7 != 0) goto L_0x04c0
            if (r9 != r14) goto L_0x04b8
            goto L_0x04c0
        L_0x04b8:
            r11 = r0
            r20 = r7
            r22 = r8
            r0 = r9
            goto L_0x0562
        L_0x04c0:
            l1.c[] r1 = r9.S
            r2 = r1[r16]
            j1.g r3 = r2.f10834i
            l1.c r4 = r2.f10831f
            if (r4 == 0) goto L_0x04cd
            j1.g r4 = r4.f10834i
            goto L_0x04cf
        L_0x04cd:
            r4 = r17
        L_0x04cf:
            if (r8 == r9) goto L_0x04da
            l1.c[] r4 = r8.S
            int r5 = r16 + 1
            r4 = r4[r5]
            j1.g r4 = r4.f10834i
            goto L_0x04e9
        L_0x04da:
            if (r9 != r13) goto L_0x04e9
            l1.c[] r4 = r0.S
            r4 = r4[r16]
            l1.c r4 = r4.f10831f
            if (r4 == 0) goto L_0x04e7
            j1.g r4 = r4.f10834i
            goto L_0x04e9
        L_0x04e7:
            r4 = r17
        L_0x04e9:
            int r2 = r2.e()
            int r5 = r16 + 1
            r20 = r1[r5]
            int r20 = r20.e()
            if (r7 == 0) goto L_0x04fe
            l1.c[] r6 = r7.S
            r6 = r6[r16]
            j1.g r11 = r6.f10834i
            goto L_0x050b
        L_0x04fe:
            l1.c[] r6 = r12.S
            r6 = r6[r5]
            l1.c r6 = r6.f10831f
            if (r6 == 0) goto L_0x0509
            j1.g r11 = r6.f10834i
            goto L_0x050b
        L_0x0509:
            r11 = r17
        L_0x050b:
            r1 = r1[r5]
            j1.g r1 = r1.f10834i
            if (r6 == 0) goto L_0x0517
            int r6 = r6.e()
            int r20 = r6 + r20
        L_0x0517:
            l1.c[] r6 = r8.S
            r6 = r6[r5]
            int r6 = r6.e()
            int r6 = r6 + r2
            if (r3 == 0) goto L_0x04b8
            if (r4 == 0) goto L_0x04b8
            if (r11 == 0) goto L_0x04b8
            if (r1 == 0) goto L_0x04b8
            if (r9 != r13) goto L_0x0533
            l1.c[] r2 = r13.S
            r2 = r2[r16]
            int r2 = r2.e()
            r6 = r2
        L_0x0533:
            if (r9 != r14) goto L_0x053f
            l1.c[] r2 = r14.S
            r2 = r2[r5]
            int r2 = r2.e()
            r20 = r2
        L_0x053f:
            if (r21 == 0) goto L_0x0544
            r23 = 8
            goto L_0x0546
        L_0x0544:
            r23 = 5
        L_0x0546:
            r5 = 1056964608(0x3f000000, float:0.5)
            r24 = r1
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r6
            r22 = 8
            r6 = r11
            r11 = r0
            r0 = r7
            r7 = r24
            r22 = r8
            r8 = r20
            r20 = r0
            r0 = r9
            r9 = r23
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0562:
            int r1 = r0.f10859j0
            r9 = 8
            if (r1 == r9) goto L_0x056a
            r8 = r0
            goto L_0x056c
        L_0x056a:
            r8 = r22
        L_0x056c:
            r0 = r11
            r9 = r20
            r11 = 2
            goto L_0x049d
        L_0x0572:
            r11 = r0
            r9 = 8
            if (r19 == 0) goto L_0x06a6
            if (r13 == 0) goto L_0x06a6
            int r0 = r1.f10819j
            if (r0 <= 0) goto L_0x0584
            int r1 = r1.f10818i
            if (r1 != r0) goto L_0x0584
            r21 = 1
            goto L_0x0586
        L_0x0584:
            r21 = 0
        L_0x0586:
            r0 = r13
            r8 = r0
        L_0x0588:
            if (r0 == 0) goto L_0x0645
            l1.d[] r1 = r0.f10870p0
            r1 = r1[r39]
        L_0x058e:
            if (r1 == 0) goto L_0x0599
            int r2 = r1.f10859j0
            if (r2 != r9) goto L_0x0599
            l1.d[] r1 = r1.f10870p0
            r1 = r1[r39]
            goto L_0x058e
        L_0x0599:
            if (r0 == r13) goto L_0x0630
            if (r0 == r14) goto L_0x0630
            if (r1 == 0) goto L_0x0630
            if (r1 != r14) goto L_0x05a4
            r7 = r17
            goto L_0x05a5
        L_0x05a4:
            r7 = r1
        L_0x05a5:
            l1.c[] r1 = r0.S
            r2 = r1[r16]
            j1.g r3 = r2.f10834i
            l1.c[] r4 = r8.S
            int r5 = r16 + 1
            r4 = r4[r5]
            j1.g r4 = r4.f10834i
            int r2 = r2.e()
            r6 = r1[r5]
            int r6 = r6.e()
            if (r7 == 0) goto L_0x05d1
            l1.c[] r1 = r7.S
            r1 = r1[r16]
            j1.g r9 = r1.f10834i
            r20 = r7
            l1.c r7 = r1.f10831f
            if (r7 == 0) goto L_0x05ce
            j1.g r7 = r7.f10834i
            goto L_0x05e7
        L_0x05ce:
            r7 = r17
            goto L_0x05e7
        L_0x05d1:
            r20 = r7
            l1.c[] r7 = r14.S
            r7 = r7[r16]
            if (r7 == 0) goto L_0x05dc
            j1.g r9 = r7.f10834i
            goto L_0x05de
        L_0x05dc:
            r9 = r17
        L_0x05de:
            r1 = r1[r5]
            j1.g r1 = r1.f10834i
            r35 = r7
            r7 = r1
            r1 = r35
        L_0x05e7:
            if (r1 == 0) goto L_0x05f1
            int r1 = r1.e()
            int r1 = r1 + r6
            r22 = r1
            goto L_0x05f3
        L_0x05f1:
            r22 = r6
        L_0x05f3:
            l1.c[] r1 = r8.S
            r1 = r1[r5]
            int r1 = r1.e()
            int r5 = r1 + r2
            if (r21 == 0) goto L_0x0602
            r23 = 8
            goto L_0x0604
        L_0x0602:
            r23 = 4
        L_0x0604:
            if (r3 == 0) goto L_0x0625
            if (r4 == 0) goto L_0x0625
            if (r9 == 0) goto L_0x0625
            if (r7 == 0) goto L_0x0625
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r2 = r3
            r24 = 4
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r25 = r8
            r8 = r22
            r22 = r15
            r15 = 8
            r9 = r23
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x062d
        L_0x0625:
            r25 = r8
            r22 = r15
            r15 = 8
            r24 = 4
        L_0x062d:
            r1 = r20
            goto L_0x0637
        L_0x0630:
            r25 = r8
            r22 = r15
            r24 = 4
            r15 = r9
        L_0x0637:
            int r2 = r0.f10859j0
            if (r2 == r15) goto L_0x063d
            r8 = r0
            goto L_0x063f
        L_0x063d:
            r8 = r25
        L_0x063f:
            r0 = r1
            r9 = r15
            r15 = r22
            goto L_0x0588
        L_0x0645:
            r22 = r15
            l1.c[] r0 = r13.S
            r0 = r0[r16]
            l1.c[] r1 = r11.S
            r1 = r1[r16]
            l1.c r1 = r1.f10831f
            l1.c[] r2 = r14.S
            int r3 = r16 + 1
            r11 = r2[r3]
            l1.c[] r2 = r12.S
            r2 = r2[r3]
            l1.c r15 = r2.f10831f
            if (r1 == 0) goto L_0x0692
            if (r13 == r14) goto L_0x066e
            j1.g r2 = r0.f10834i
            j1.g r1 = r1.f10834i
            int r0 = r0.e()
            r9 = 5
            r10.e(r2, r1, r0, r9)
            goto L_0x068e
        L_0x066e:
            r9 = 5
            if (r15 == 0) goto L_0x068e
            j1.g r2 = r0.f10834i
            j1.g r3 = r1.f10834i
            int r4 = r0.e()
            r5 = 1056964608(0x3f000000, float:0.5)
            j1.g r6 = r11.f10834i
            j1.g r7 = r15.f10834i
            int r8 = r11.e()
            r0 = 5
            r1 = r37
            r20 = r12
            r12 = r9
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0695
        L_0x068e:
            r20 = r12
            r12 = r9
            goto L_0x0695
        L_0x0692:
            r20 = r12
            r12 = 5
        L_0x0695:
            if (r15 == 0) goto L_0x06aa
            if (r13 == r14) goto L_0x06aa
            j1.g r0 = r11.f10834i
            j1.g r1 = r15.f10834i
            int r2 = r11.e()
            int r2 = -r2
            r10.e(r0, r1, r2, r12)
            goto L_0x06aa
        L_0x06a6:
            r20 = r12
            r22 = r15
        L_0x06aa:
            if (r18 != 0) goto L_0x06ae
            if (r19 == 0) goto L_0x0709
        L_0x06ae:
            if (r13 == 0) goto L_0x0709
            if (r13 == r14) goto L_0x0709
            l1.c[] r0 = r13.S
            r1 = r0[r16]
            if (r14 != 0) goto L_0x06ba
            r9 = r13
            goto L_0x06bb
        L_0x06ba:
            r9 = r14
        L_0x06bb:
            int r2 = r16 + 1
            l1.c[] r3 = r9.S
            r3 = r3[r2]
            l1.c r4 = r1.f10831f
            if (r4 == 0) goto L_0x06c8
            j1.g r4 = r4.f10834i
            goto L_0x06ca
        L_0x06c8:
            r4 = r17
        L_0x06ca:
            l1.c r5 = r3.f10831f
            if (r5 == 0) goto L_0x06d1
            j1.g r5 = r5.f10834i
            goto L_0x06d3
        L_0x06d1:
            r5 = r17
        L_0x06d3:
            r6 = r20
            if (r6 == r9) goto L_0x06e6
            l1.c[] r5 = r6.S
            r5 = r5[r2]
            l1.c r5 = r5.f10831f
            if (r5 == 0) goto L_0x06e3
            j1.g r5 = r5.f10834i
            r17 = r5
        L_0x06e3:
            r6 = r17
            goto L_0x06e7
        L_0x06e6:
            r6 = r5
        L_0x06e7:
            if (r13 != r9) goto L_0x06eb
            r3 = r0[r2]
        L_0x06eb:
            if (r4 == 0) goto L_0x0709
            if (r6 == 0) goto L_0x0709
            r5 = 1056964608(0x3f000000, float:0.5)
            int r0 = r1.e()
            l1.c[] r7 = r9.S
            r2 = r7[r2]
            int r8 = r2.e()
            j1.g r2 = r1.f10834i
            j1.g r7 = r3.f10834i
            r9 = 5
            r1 = r37
            r3 = r4
            r4 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0709:
            int r9 = r22 + 1
            r12 = 2
            r0 = r36
            r11 = r38
            r14 = r30
            r15 = r31
            goto L_0x001b
        L_0x0716:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.m.a(l1.e, j1.d, java.util.ArrayList, int):void");
    }

    public static final b3.m c(p pVar) {
        Dialog dialog;
        Window window;
        j.f(pVar, "<this>");
        int i8 = NavHostFragment.A0;
        for (p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.S) {
            if (pVar2 instanceof NavHostFragment) {
                d0 d0Var = ((NavHostFragment) pVar2).f2339v0;
                if (d0Var != null) {
                    return d0Var;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
            p pVar3 = pVar2.u().f1988x;
            if (pVar3 instanceof NavHostFragment) {
                d0 d0Var2 = ((NavHostFragment) pVar3).f2339v0;
                if (d0Var2 != null) {
                    return d0Var2;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
        }
        View view = pVar.f2066d0;
        if (view != null) {
            return l0.b(view);
        }
        View view2 = null;
        n nVar = pVar instanceof n ? (n) pVar : null;
        if (!(nVar == null || (dialog = nVar.G0) == null || (window = dialog.getWindow()) == null)) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return l0.b(view2);
        }
        throw new IllegalStateException(q.b("Fragment ", pVar, " does not have a NavController set"));
    }

    public static final int d(Bitmap bitmap) {
        int i8 = 1;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config != Bitmap.Config.ALPHA_8) {
                    i8 = (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4;
                }
                return height * i8;
            }
        } else {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
    }

    public static final Drawable e(Context context, int i8) {
        Drawable a10 = a.a(context, i8);
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException(q.a("Invalid resource ID: ", i8).toString());
    }

    public static String f(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            sb2.append(str.charAt(i8));
            if (str2.length() > i8) {
                sb2.append(str2.charAt(i8));
            }
        }
        return sb2.toString();
    }

    public static void g(Parcel parcel, int i8, boolean z10) {
        parcel.writeInt(i8 | 262144);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void h(Parcel parcel, int i8, Bundle bundle) {
        if (bundle != null) {
            int s10 = s(parcel, i8);
            parcel.writeBundle(bundle);
            E(parcel, s10);
        }
    }

    public static void i(Parcel parcel, int i8, IBinder iBinder) {
        if (iBinder != null) {
            int s10 = s(parcel, i8);
            parcel.writeStrongBinder(iBinder);
            E(parcel, s10);
        }
    }

    public static void j(Parcel parcel, int i8, int i10) {
        parcel.writeInt(i8 | 262144);
        parcel.writeInt(i10);
    }

    public static void k(Parcel parcel, int i8, long j10) {
        parcel.writeInt(i8 | 524288);
        parcel.writeLong(j10);
    }

    public static void l(Parcel parcel, int i8, Long l10) {
        if (l10 != null) {
            parcel.writeInt(i8 | 524288);
            parcel.writeLong(l10.longValue());
        }
    }

    public static void m(Parcel parcel, int i8, Parcelable parcelable, int i10) {
        if (parcelable != null) {
            int s10 = s(parcel, i8);
            parcelable.writeToParcel(parcel, i10);
            E(parcel, s10);
        }
    }

    public static void n(Parcel parcel, int i8, String str) {
        if (str != null) {
            int s10 = s(parcel, i8);
            parcel.writeString(str);
            E(parcel, s10);
        }
    }

    public static void o(Parcel parcel, int i8, List list) {
        if (list != null) {
            int s10 = s(parcel, i8);
            parcel.writeStringList(list);
            E(parcel, s10);
        }
    }

    public static void p(Parcel parcel, int i8, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr != null) {
            int s10 = s(parcel, i8);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    I(parcel, parcelable, i10);
                }
            }
            E(parcel, s10);
        }
    }

    public static void q(Parcel parcel, int i8, List list) {
        if (list != null) {
            int s10 = s(parcel, i8);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                Parcelable parcelable = (Parcelable) list.get(i10);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    I(parcel, parcelable, 0);
                }
            }
            E(parcel, s10);
        }
    }

    public static int r(int i8) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i8) * -862048943), 15)) * 461845907);
    }

    public static int s(Parcel parcel, int i8) {
        parcel.writeInt(i8 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Object t(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()}));
    }

    public static String u(String str) {
        Class<String> cls = String.class;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{cls}).invoke((Object) null, new Object[]{str});
            if (invoke != null && cls.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String v(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i8 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), e10);
                    StringBuilder c3 = androidx.activity.result.d.c("<", str3, " threw ");
                    c3.append(e10.getClass().getName());
                    c3.append(">");
                    str2 = c3.toString();
                }
            }
            objArr[i10] = str2;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i8 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                sb2.append(str, i11, str.length());
            } else {
                sb2.append(str, i11, indexOf);
                sb2.append(objArr[i8]);
                i11 = indexOf + 2;
                i8++;
            }
        }
        sb2.append(str, i11, str.length());
        if (i8 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i8]);
            for (int i12 = i8 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void w(int i8, int i10) {
        String str;
        if (i8 < 0 || i8 >= i10) {
            if (i8 < 0) {
                str = v("%s (%s) must not be negative", "index", Integer.valueOf(i8));
            } else if (i10 < 0) {
                throw new IllegalArgumentException(q.a("negative size: ", i10));
            } else {
                str = v("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void x(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        F(jArr4, jArr2, jArr3);
        K(jArr4);
        J(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static boolean y(int i8) {
        Boolean bool;
        if (i8 - 1 == 0) {
            return !v8.a();
        }
        if (v8.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
                v8.f5015a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            return bool.booleanValue();
        }
    }

    public static void z(int i8) {
        boolean z10;
        if (!(i8 == 100 || i8 == 102 || i8 == 104)) {
            if (i8 == 105) {
                i8 = 105;
            } else {
                z10 = false;
                u6.q.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i8));
            }
        }
        z10 = true;
        u6.q.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i8));
    }

    public long b() {
        return System.currentTimeMillis();
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(rb.f5507b.zza().zzc());
    }
}
