package p9;

import androidx.fragment.app.q;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.u5;
import gc.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final s5 f12520a;

    /* renamed from: b  reason: collision with root package name */
    public static final u5 f12521b;

    /* renamed from: c  reason: collision with root package name */
    public static final u5 f12522c;

    /* renamed from: d  reason: collision with root package name */
    public static final u5 f12523d;

    static {
        int i8 = s5.f5514c;
        Object[] objArr = new Object[15];
        int i10 = 0;
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f12520a = s5.g(15, objArr);
        o5 o5Var = r5.f5498b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        int i11 = 0;
        while (i11 < 7) {
            if (objArr2[i11] != null) {
                i11++;
            } else {
                throw new NullPointerException(q.a("at index ", i11));
            }
        }
        f12521b = r5.f(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        int i12 = 0;
        while (i12 < 3) {
            if (objArr3[i12] != null) {
                i12++;
            } else {
                throw new NullPointerException(q.a("at index ", i12));
            }
        }
        f12522c = r5.f(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        int i13 = 0;
        while (i13 < 2) {
            if (objArr4[i13] != null) {
                i13++;
            } else {
                throw new NullPointerException(q.a("at index ", i13));
            }
        }
        f12523d = r5.f(2, objArr4);
        n5 n5Var = new n5();
        n5Var.a(b.J);
        n5Var.a(b.K);
        n5Var.f5385c = true;
        r5.f(n5Var.f5384b, n5Var.f5383a);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        while (i10 < 2) {
            if (objArr5[i10] != null) {
                i10++;
            } else {
                throw new NullPointerException(q.a("at index ", i10));
            }
        }
        r5.f(2, objArr5);
    }
}
