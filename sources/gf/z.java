package gf;

import androidx.activity.result.d;
import androidx.appcompat.widget.a1;
import androidx.fragment.app.q;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import sf.j;

public final class z<T> extends c<T> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f8983a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8984b;

    /* renamed from: c  reason: collision with root package name */
    public int f8985c;

    /* renamed from: d  reason: collision with root package name */
    public int f8986d;

    public static final class a extends b<T> {

        /* renamed from: c  reason: collision with root package name */
        public int f8987c;

        /* renamed from: d  reason: collision with root package name */
        public int f8988d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ z<T> f8989e;

        public a(z<T> zVar) {
            this.f8989e = zVar;
            this.f8987c = zVar.a();
            this.f8988d = zVar.f8985c;
        }
    }

    public z(int i8, Object[] objArr) {
        this.f8983a = objArr;
        boolean z10 = true;
        if (i8 >= 0) {
            if (i8 > objArr.length ? false : z10) {
                this.f8984b = objArr.length;
                this.f8986d = i8;
                return;
            }
            StringBuilder b10 = a1.b("ring buffer filled size: ", i8, " cannot be larger than the buffer size: ");
            b10.append(objArr.length);
            throw new IllegalArgumentException(b10.toString().toString());
        }
        throw new IllegalArgumentException(q.a("ring buffer filled size should not be negative but it is ", i8).toString());
    }

    public final int a() {
        return this.f8986d;
    }

    public final void b(int i8) {
        boolean z10 = true;
        if (i8 >= 0) {
            if (i8 > this.f8986d) {
                z10 = false;
            }
            if (!z10) {
                StringBuilder b10 = a1.b("n shouldn't be greater than the buffer size: n = ", i8, ", size = ");
                b10.append(this.f8986d);
                throw new IllegalArgumentException(b10.toString().toString());
            } else if (i8 > 0) {
                int i10 = this.f8985c;
                int i11 = this.f8984b;
                int i12 = (i10 + i8) % i11;
                Object[] objArr = this.f8983a;
                if (i10 > i12) {
                    l.Z(objArr, i10, i11);
                    l.Z(objArr, 0, i12);
                } else {
                    l.Z(objArr, i10, i12);
                }
                this.f8985c = i12;
                this.f8986d -= i8;
            }
        } else {
            throw new IllegalArgumentException(q.a("n shouldn't be negative but it is ", i8).toString());
        }
    }

    public final T get(int i8) {
        int a10 = a();
        if (i8 < 0 || i8 >= a10) {
            throw new IndexOutOfBoundsException(d.a("index: ", i8, ", size: ", a10));
        }
        return this.f8983a[(this.f8985c + i8) % this.f8984b];
    }

    public final Iterator<T> iterator() {
        return new a(this);
    }

    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public final <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        j.f(tArr, "array");
        if (tArr.length < a()) {
            tArr = Arrays.copyOf(tArr, a());
            j.e(tArr, "copyOf(this, newSize)");
        }
        int a10 = a();
        int i8 = this.f8985c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            tArr2 = this.f8983a;
            if (i11 < a10 && i8 < this.f8984b) {
                tArr[i11] = tArr2[i8];
                i11++;
                i8++;
            }
        }
        while (i11 < a10) {
            tArr[i11] = tArr2[i10];
            i11++;
            i10++;
        }
        if (tArr.length > a()) {
            tArr[a()] = null;
        }
        return tArr;
    }
}
