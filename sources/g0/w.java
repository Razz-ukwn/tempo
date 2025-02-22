package g0;

import gf.l;
import java.util.Arrays;
import java.util.Comparator;
import s0.a0;
import s0.s0;
import sf.j;

public final class w implements Comparator<s> {

    /* renamed from: a  reason: collision with root package name */
    public static final w f8785a = new w();

    public final int compare(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        if (sVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (sVar2 != null) {
            int i8 = 0;
            if (v.d(sVar) && v.d(sVar2)) {
                s0 s0Var = sVar.C;
                a0 a0Var = null;
                a0 a0Var2 = s0Var != null ? s0Var.C : null;
                if (a0Var2 != null) {
                    s0 s0Var2 = sVar2.C;
                    if (s0Var2 != null) {
                        a0Var = s0Var2.C;
                    }
                    if (a0Var == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (j.a(a0Var2, a0Var)) {
                        return 0;
                    } else {
                        Object[] objArr = new a0[16];
                        int i10 = 0;
                        while (a0Var2 != null) {
                            int i11 = i10 + 1;
                            if (objArr.length < i11) {
                                objArr = Arrays.copyOf(objArr, Math.max(i11, objArr.length * 2));
                                j.e(objArr, "copyOf(this, newSize)");
                            }
                            if (i10 != 0) {
                                l.V(0 + 1, 0, i10, objArr, objArr);
                            }
                            objArr[0] = a0Var2;
                            i10++;
                            a0Var2 = a0Var2.q();
                        }
                        Object[] objArr2 = new a0[16];
                        int i12 = 0;
                        while (a0Var != null) {
                            int i13 = i12 + 1;
                            if (objArr2.length < i13) {
                                objArr2 = Arrays.copyOf(objArr2, Math.max(i13, objArr2.length * 2));
                                j.e(objArr2, "copyOf(this, newSize)");
                            }
                            if (i12 != 0) {
                                l.V(0 + 1, 0, i12, objArr2, objArr2);
                            }
                            objArr2[0] = a0Var;
                            i12++;
                            a0Var = a0Var.q();
                        }
                        int min = Math.min(i10 - 1, i12 - 1);
                        if (min >= 0) {
                            while (j.a(objArr[i8], objArr2[i8])) {
                                if (i8 != min) {
                                    i8++;
                                }
                            }
                            return j.h(((a0) objArr[i8]).N, ((a0) objArr2[i8]).N);
                        }
                        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else if (v.d(sVar)) {
                return -1;
            } else {
                return v.d(sVar2) ? 1 : 0;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
