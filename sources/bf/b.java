package bf;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f3640a;

    /* renamed from: b  reason: collision with root package name */
    public int f3641b;

    /* renamed from: c  reason: collision with root package name */
    public int f3642c;

    /* renamed from: d  reason: collision with root package name */
    public T[] f3643d;

    public b() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.f3640a = numberOfLeadingZeros - 1;
        this.f3642c = (int) (((float) numberOfLeadingZeros) * 0.75f);
        this.f3643d = new Object[numberOfLeadingZeros];
    }

    public final void a(Object obj) {
        T t2;
        T t10;
        T[] tArr = this.f3643d;
        int i8 = this.f3640a;
        int hashCode = obj.hashCode() * -1640531527;
        int i10 = (hashCode ^ (hashCode >>> 16)) & i8;
        T t11 = tArr[i10];
        if (t11 != null) {
            if (!t11.equals(obj)) {
                do {
                    i10 = (i10 + 1) & i8;
                    t10 = tArr[i10];
                    if (t10 == null) {
                    }
                } while (!t10.equals(obj));
                return;
            }
            return;
        }
        tArr[i10] = obj;
        int i11 = this.f3641b + 1;
        this.f3641b = i11;
        if (i11 >= this.f3642c) {
            T[] tArr2 = this.f3643d;
            int length = tArr2.length;
            int i12 = length << 1;
            int i13 = i12 - 1;
            T[] tArr3 = new Object[i12];
            while (true) {
                int i14 = i11 - 1;
                if (i11 != 0) {
                    do {
                        length--;
                        t2 = tArr2[length];
                    } while (t2 == null);
                    int hashCode2 = t2.hashCode() * -1640531527;
                    int i15 = (hashCode2 ^ (hashCode2 >>> 16)) & i13;
                    if (tArr3[i15] != null) {
                        do {
                            i15 = (i15 + 1) & i13;
                        } while (tArr3[i15] != null);
                    }
                    tArr3[i15] = tArr2[length];
                    i11 = i14;
                } else {
                    this.f3640a = i13;
                    this.f3642c = (int) (((float) i12) * 0.75f);
                    this.f3643d = tArr3;
                    return;
                }
            }
        }
    }

    public final void b(int i8, int i10, Object[] objArr) {
        int i11;
        Object obj;
        this.f3641b--;
        while (true) {
            int i12 = i8 + 1;
            while (true) {
                i11 = i12 & i10;
                obj = objArr[i11];
                if (obj == null) {
                    objArr[i8] = null;
                    return;
                }
                int hashCode = obj.hashCode() * -1640531527;
                int i13 = (hashCode ^ (hashCode >>> 16)) & i10;
                if (i8 <= i11) {
                    if (i8 >= i13 || i13 > i11) {
                        break;
                    }
                    i12 = i11 + 1;
                } else {
                    if (i8 >= i13 && i13 > i11) {
                        break;
                    }
                    i12 = i11 + 1;
                }
            }
            objArr[i8] = obj;
            i8 = i11;
        }
    }
}
