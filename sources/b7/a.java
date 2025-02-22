package b7;

import android.content.Context;
import android.view.View;
import androidx.activity.p;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.p000firebaseauthapi.eb;
import com.google.android.gms.internal.p000firebaseauthapi.wb;
import com.quickkonnect.silencio.R;
import d2.f1;
import ff.d;
import ff.e;
import ff.i;
import ff.n;
import java.util.ArrayList;
import java.util.List;
import m3.c;
import q.c0;
import q.g;
import q7.e2;
import q7.g2;
import sf.j;
import t.b;
import t.e0;
import t.x2;

public class a implements eb, c.C0212c, e2 {

    /* renamed from: a  reason: collision with root package name */
    public static Context f3267a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f3268b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ a f3269c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3270d = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ a f3271e = new a();

    public static final int A(ArrayList arrayList, int i8, int i10) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = ((b) arrayList.get(i12)).f14988a;
            if (i13 < 0) {
                i13 += i10;
            }
            int h3 = j.h(i13, i8);
            if (h3 < 0) {
                i11 = i12 + 1;
            } else if (h3 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void B(View view, p pVar) {
        j.f(view, "<this>");
        j.f(pVar, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, pVar);
    }

    public static c0 C(Float f10, int i8) {
        float f11 = 0.0f;
        float f12 = (i8 & 1) != 0 ? 1.0f : 0.0f;
        if ((i8 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = null;
        }
        return new c0(f12, f11, f10);
    }

    public static final long c(float f10, boolean z10) {
        return ((z10 ? 1 : 0) & 4294967295L) | (((long) Float.floatToIntBits(f10)) << 32);
    }

    public static final boolean d(int[] iArr, int i8) {
        return (iArr[(i8 * 5) + 1] & 67108864) != 0;
    }

    public static final int e(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 3];
    }

    public static final boolean f(int[] iArr, int i8) {
        return (iArr[(i8 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean g(int[] iArr, int i8) {
        return (iArr[(i8 * 5) + 1] & 1073741824) != 0;
    }

    public static final int h(ArrayList arrayList, int i8, int i10) {
        int A = A(arrayList, i8, i10);
        return A >= 0 ? A : -(A + 1);
    }

    public static final int i(long j10) {
        int i8;
        if ((4294967295L & j10) == 0) {
            i8 = 32;
            j10 >>= 32;
        } else {
            i8 = 0;
        }
        if ((65535 & j10) == 0) {
            i8 += 16;
            j10 >>= 16;
        }
        if ((255 & j10) == 0) {
            i8 += 8;
            j10 >>= 8;
        }
        if ((15 & j10) == 0) {
            i8 += 4;
            j10 >>= 4;
        }
        if ((1 & j10) != 0) {
            return i8;
        }
        if ((2 & j10) != 0) {
            return i8 + 1;
        }
        if ((4 & j10) != 0) {
            return i8 + 2;
        }
        if ((j10 & 8) != 0) {
            return i8 + 3;
        }
        return -1;
    }

    public static final int j(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 1] & 67108863;
    }

    public static final int k(int[] iArr, int i8) {
        int i10 = i8 * 5;
        return t(iArr[i10 + 1] >> 28) + iArr[i10 + 4];
    }

    public static final void l(int i8, int i10, int[] iArr) {
        e0.f(i10 >= 0);
        iArr[(i8 * 5) + 3] = i10;
    }

    public static final void m(int i8, int i10, int[] iArr) {
        e0.f(i10 >= 0 && i10 < 67108863);
        int i11 = (i8 * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & -67108864);
    }

    public static final int n(int[] iArr, int i8) {
        int length = iArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            int i12 = iArr[i11];
            if (i8 > i12) {
                i10 = i11 + 1;
            } else if (i8 >= i12) {
                return i11;
            } else {
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static void o(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void p(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int r(int i8, int i10, int i11) {
        return i8 < i10 ? i10 : i8 > i11 ? i11 : i8;
    }

    public static float[] s() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final int t(int i8) {
        switch (i8) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final boolean u(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        j.f(fArr3, "$this$invertTo");
        j.f(fArr4, "other");
        float f10 = fArr3[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = fArr3[3];
        float f14 = fArr3[4];
        float f15 = fArr3[5];
        float f16 = fArr3[6];
        float f17 = fArr3[7];
        float f18 = fArr3[8];
        float f19 = fArr3[9];
        float f20 = fArr3[10];
        float f21 = fArr3[11];
        float f22 = fArr3[12];
        float f23 = fArr3[13];
        float f24 = fArr3[14];
        float f25 = fArr3[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == 0.0f) {
            return false;
        }
        float f39 = 1.0f / f38;
        fArr4[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
        fArr4[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
        fArr4[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
        fArr4[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
        float f40 = -f14;
        fArr4[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
        fArr4[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
        float f41 = -f22;
        fArr4[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
        fArr4[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
        fArr4[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
        fArr4[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
        fArr4[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
        fArr4[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
        fArr4[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
        fArr4[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
        fArr4[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
        fArr4[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        return true;
    }

    public static synchronized boolean v(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f3267a;
            if (!(context2 == null || (bool = f3268b) == null)) {
                if (context2 == applicationContext) {
                    boolean booleanValue = bool.booleanValue();
                    return booleanValue;
                }
            }
            f3268b = null;
            Boolean valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f3268b = valueOf;
            f3267a = applicationContext;
            boolean booleanValue2 = valueOf.booleanValue();
            return booleanValue2;
        }
    }

    public static final d w(rf.a aVar) {
        f2.a(3, "mode");
        j.f(aVar, "initializer");
        int c3 = g.c(3);
        if (c3 == 0) {
            return new ff.j(aVar);
        }
        if (c3 == 1) {
            return new i(aVar);
        }
        if (c3 == 2) {
            return new n(aVar);
        }
        throw new e();
    }

    public static final ff.j x(rf.a aVar) {
        j.f(aVar, "initializer");
        return new ff.j(aVar);
    }

    public static final long y(float[] fArr, long j10) {
        float b10 = h0.c.b(j10);
        float c3 = h0.c.c(j10);
        float f10 = ((float) 1) / (((fArr[7] * c3) + (fArr[3] * b10)) + fArr[15]);
        if (!(!Float.isInfinite(f10) && !Float.isNaN(f10))) {
            f10 = 0.0f;
        }
        return f1.f(((fArr[4] * c3) + (fArr[0] * b10) + fArr[12]) * f10, ((fArr[5] * c3) + (fArr[1] * b10) + fArr[13]) * f10);
    }

    public static final void z(float[] fArr, h0.b bVar) {
        long y10 = y(fArr, f1.f(bVar.f9064a, bVar.f9065b));
        long y11 = y(fArr, f1.f(bVar.f9064a, bVar.f9067d));
        long y12 = y(fArr, f1.f(bVar.f9066c, bVar.f9065b));
        long y13 = y(fArr, f1.f(bVar.f9066c, bVar.f9067d));
        bVar.f9064a = Math.min(Math.min(h0.c.b(y10), h0.c.b(y11)), Math.min(h0.c.b(y12), h0.c.b(y13)));
        bVar.f9065b = Math.min(Math.min(h0.c.c(y10), h0.c.c(y11)), Math.min(h0.c.c(y12), h0.c.c(y13)));
        bVar.f9066c = Math.max(Math.max(h0.c.b(y10), h0.c.b(y11)), Math.max(h0.c.b(y12), h0.c.b(y13)));
        bVar.f9067d = Math.max(Math.max(h0.c.c(y10), h0.c.c(y11)), Math.max(h0.c.c(y12), h0.c.c(y13)));
    }

    public Object a(cb.c cVar) {
        return new x2((wb) cVar);
    }

    public c b(c.b bVar) {
        return new n3.d(bVar.f11182a, bVar.f11183b, bVar.f11184c, bVar.f11185d, bVar.f11186e);
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().zzo());
    }
}
