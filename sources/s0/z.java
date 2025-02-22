package s0;

import ba.b0;
import java.util.Comparator;
import sf.j;

public final /* synthetic */ class z implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14470a;

    public /* synthetic */ z(int i8) {
        this.f14470a = i8;
    }

    public final int compare(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.f14470a) {
            case 0:
                a0 a0Var = (a0) obj;
                a0 a0Var2 = (a0) obj2;
                float f10 = a0Var.X;
                float f11 = a0Var2.X;
                if (f10 == f11) {
                    z10 = true;
                }
                return z10 ? j.h(a0Var.N, a0Var2.N) : Float.compare(f10, f11);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i8 = 0; i8 < bArr.length; i8++) {
                    byte b10 = bArr[i8];
                    byte b11 = bArr2[i8];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            default:
                return ((b0.c) obj).a().compareTo(((b0.c) obj2).a());
        }
    }
}
