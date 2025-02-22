package com.google.android.gms.internal.measurement;

import androidx.fragment.app.q;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class s5 extends m5 implements Set {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f5514c = 0;

    /* renamed from: b  reason: collision with root package name */
    public transient r5 f5515b;

    public static int f(int i8) {
        int max = Math.max(i8, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static s5 g(int i8, Object... objArr) {
        if (i8 == 0) {
            return v5.F;
        }
        if (i8 != 1) {
            int f10 = f(i8);
            Object[] objArr2 = new Object[f10];
            int i10 = f10 - 1;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < i8) {
                Object obj = objArr[i11];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int rotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) hashCode) * -862048943), 15)) * 461845907);
                    while (true) {
                        int i14 = rotateLeft & i10;
                        Object obj2 = objArr2[i14];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            rotateLeft++;
                        } else {
                            objArr[i13] = obj;
                            objArr2[i14] = obj;
                            i12 += hashCode;
                            i13++;
                            break;
                        }
                    }
                    i11++;
                } else {
                    throw new NullPointerException(q.a("at index ", i11));
                }
            }
            Arrays.fill(objArr, i13, i8, (Object) null);
            if (i13 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new w5(obj3);
            }
            if (f(i13) < f10 / 2) {
                return g(i13, objArr);
            }
            if (i13 < 10) {
                objArr = Arrays.copyOf(objArr, i13);
            }
            return new v5(i12, i10, i13, objArr, objArr2);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new w5(obj4);
    }

    /* renamed from: e */
    public abstract x5 iterator();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof s5) && (this instanceof v5)) {
            s5 s5Var = (s5) obj;
            s5Var.getClass();
            if ((s5Var instanceof v5) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i8 += next != null ? next.hashCode() : 0;
        }
        return i8;
    }
}
