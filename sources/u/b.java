package u;

import gf.l;
import java.util.concurrent.CountDownLatch;
import sf.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f15631a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f15632b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15633c;

    public /* synthetic */ b() {
    }

    public final void a(Integer num) {
        int i8 = this.f15631a;
        if (i8 > 0) {
            this.f15631a = i8 - 1;
            return;
        }
        Object[] objArr = this.f15632b;
        if (((CountDownLatch) objArr) != null) {
            this.f15633c = num;
            ((CountDownLatch) objArr).countDown();
        }
    }

    public final int b(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i8 = this.f15631a - 1;
        int i10 = 0;
        while (i10 <= i8) {
            int i11 = (i10 + i8) >>> 1;
            Object obj2 = this.f15632b[i11];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i10 = i11 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i8 = i11 - 1;
            } else if (obj == obj2) {
                return i11;
            } else {
                for (int i12 = i11 - 1; -1 < i12; i12--) {
                    Object obj3 = this.f15632b[i12];
                    if (obj3 == obj) {
                        return i12;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i13 = i11 + 1;
                int i14 = this.f15631a;
                while (i13 < i14) {
                    Object obj4 = this.f15632b[i13];
                    if (obj4 == obj) {
                        return i13;
                    }
                    i13++;
                    if (System.identityHashCode(obj4) != identityHashCode) {
                        return -i13;
                    }
                }
                return -(this.f15631a + 1);
            }
        }
        return -(i10 + 1);
    }

    public final Object c(Object obj) {
        j.f(obj, "key");
        int b10 = b(obj);
        if (b10 >= 0) {
            return ((Object[]) this.f15633c)[b10];
        }
        return null;
    }

    public final void d(Object obj, Object obj2) {
        j.f(obj, "key");
        int b10 = b(obj);
        if (b10 >= 0) {
            ((Object[]) this.f15633c)[b10] = obj2;
            return;
        }
        int i8 = -(b10 + 1);
        int i10 = this.f15631a;
        Object[] objArr = this.f15632b;
        boolean z10 = i10 == objArr.length;
        Object[] objArr2 = z10 ? new Object[(i10 * 2)] : objArr;
        int i11 = i8 + 1;
        l.V(i11, i8, i10, objArr, objArr2);
        if (z10) {
            l.X(this.f15632b, objArr2, 0, 0, i8, 6);
        }
        objArr2[i8] = obj;
        this.f15632b = objArr2;
        Object[] objArr3 = z10 ? new Object[(this.f15631a * 2)] : (Object[]) this.f15633c;
        l.V(i11, i8, this.f15631a, (Object[]) this.f15633c, objArr3);
        if (z10) {
            l.X((Object[]) this.f15633c, objArr3, 0, 0, i8, 6);
        }
        objArr3[i8] = obj2;
        this.f15633c = objArr3;
        this.f15631a++;
    }

    public final void e() {
        if (!(((CountDownLatch) this.f15632b) != null)) {
            this.f15631a++;
        }
    }

    public /* synthetic */ b(int i8) {
        this.f15632b = new Object[16];
        this.f15633c = new Object[16];
    }
}
