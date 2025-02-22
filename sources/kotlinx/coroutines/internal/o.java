package kotlinx.coroutines.internal;

import androidx.fragment.app.z0;
import c4.a;
import com.google.android.gms.internal.measurement.aa;
import java.io.EOFException;
import java.util.List;
import q7.e2;
import q7.g2;
import rf.l;
import sf.j;
import wg.e;
import wg.f0;

public final class o implements e2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ o f10732a = new o();

    public static final b0 a(l lVar, Object obj, b0 b0Var) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (b0Var == null || b0Var.getCause() == th) {
                return new b0(a.c("Exception in undelivered element handler for ", obj), th);
            }
            z0.c(b0Var, th);
        }
        return b0Var;
    }

    public static final boolean b(e eVar) {
        j.f(eVar, "$this$isProbablyUtf8");
        try {
            e eVar2 = new e();
            long j10 = eVar.f16752b;
            eVar.u(0, j10 > 64 ? 64 : j10, eVar2);
            for (int i8 = 0; i8 < 16; i8++) {
                if (eVar2.y()) {
                    return true;
                }
                int b02 = eVar2.b0();
                if (Character.isISOControl(b02) && !Character.isWhitespace(b02)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static final int c(f0 f0Var, int i8) {
        int i10;
        j.f(f0Var, "<this>");
        int i11 = i8 + 1;
        int length = f0Var.f16758e.length;
        int[] iArr = f0Var.B;
        j.f(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 >= i11) {
                    if (i14 <= i11) {
                        break;
                    }
                    i12 = i10 - 1;
                } else {
                    i13 = i10 + 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        return i10 >= 0 ? i10 : ~i10;
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().n());
    }
}
