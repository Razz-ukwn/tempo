package z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f17587a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f17588b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f17589c;

    public c(int i8, long[] jArr, Object[] objArr) {
        this.f17587a = i8;
        this.f17588b = jArr;
        this.f17589c = objArr;
    }

    public final int a(long j10) {
        int i8 = this.f17587a - 1;
        if (i8 == -1) {
            return -1;
        }
        long[] jArr = this.f17588b;
        int i10 = 0;
        if (i8 != 0) {
            while (i10 <= i8) {
                int i11 = (i10 + i8) >>> 1;
                int i12 = ((jArr[i11] - j10) > 0 ? 1 : ((jArr[i11] - j10) == 0 ? 0 : -1));
                if (i12 < 0) {
                    i10 = i11 + 1;
                } else if (i12 <= 0) {
                    return i11;
                } else {
                    i8 = i11 - 1;
                }
            }
            return -(i10 + 1);
        }
        long j11 = jArr[0];
        if (j11 == j10) {
            return 0;
        }
        return j11 > j10 ? -2 : -1;
    }

    public final c b(Object obj, long j10) {
        long[] jArr;
        int i8;
        Object[] objArr = this.f17589c;
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 >= length) {
                break;
            }
            if (objArr[i11] == null) {
                z10 = false;
            }
            if (z10) {
                i12++;
            }
            i11++;
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f17588b;
                i8 = this.f17587a;
                if (i10 >= i13 || i14 >= i8) {
                    break;
                }
                long j11 = jArr[i14];
                Object obj2 = objArr[i14];
                if (j11 > j10) {
                    jArr2[i10] = j10;
                    objArr2[i10] = obj;
                    i10++;
                    break;
                }
                if (obj2 != null) {
                    jArr2[i10] = j11;
                    objArr2[i10] = obj2;
                    i10++;
                }
                i14++;
            }
            if (i14 == i8) {
                int i15 = i13 - 1;
                jArr2[i15] = j10;
                objArr2[i15] = obj;
            } else {
                while (i10 < i13) {
                    long j12 = jArr[i14];
                    Object obj3 = objArr[i14];
                    if (obj3 != null) {
                        jArr2[i10] = j12;
                        objArr2[i10] = obj3;
                        i10++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = j10;
            objArr2[0] = obj;
        }
        return new c(i13, jArr2, objArr2);
    }
}
