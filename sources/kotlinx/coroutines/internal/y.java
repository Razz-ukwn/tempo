package kotlinx.coroutines.internal;

import ag.z0;
import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.z;
import sf.j;

public class y<T extends z & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    public T[] f10747a;

    public final void a(z0.c cVar) {
        cVar.b((z0.d) this);
        T[] tArr = this.f10747a;
        if (tArr == null) {
            tArr = new z[4];
            this.f10747a = tArr;
        } else if (this._size >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            j.e(copyOf, "copyOf(this, newSize)");
            tArr = (z[]) copyOf;
            this.f10747a = tArr;
        }
        int i8 = this._size;
        this._size = i8 + 1;
        tArr[i8] = cVar;
        cVar.f517b = i8;
        e(i8);
    }

    public final boolean b() {
        return this._size == 0;
    }

    public final T c(int i8) {
        T[] tArr = this.f10747a;
        j.c(tArr);
        this._size--;
        if (i8 < this._size) {
            f(i8, this._size);
            int i10 = (i8 - 1) / 2;
            if (i8 > 0) {
                T t2 = tArr[i8];
                j.c(t2);
                T t10 = tArr[i10];
                j.c(t10);
                if (((Comparable) t2).compareTo(t10) < 0) {
                    f(i8, i10);
                    e(i10);
                }
            }
            while (true) {
                int i11 = (i8 * 2) + 1;
                if (i11 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f10747a;
                j.c(tArr2);
                int i12 = i11 + 1;
                if (i12 < this._size) {
                    T t11 = tArr2[i12];
                    j.c(t11);
                    T t12 = tArr2[i11];
                    j.c(t12);
                    if (((Comparable) t11).compareTo(t12) < 0) {
                        i11 = i12;
                    }
                }
                T t13 = tArr2[i8];
                j.c(t13);
                T t14 = tArr2[i11];
                j.c(t14);
                if (((Comparable) t13).compareTo(t14) <= 0) {
                    break;
                }
                f(i8, i11);
                i8 = i11;
            }
        }
        T t15 = tArr[this._size];
        j.c(t15);
        t15.b((z0.d) null);
        t15.setIndex(-1);
        tArr[this._size] = null;
        return t15;
    }

    public final T d() {
        T c3;
        synchronized (this) {
            c3 = this._size > 0 ? c(0) : null;
        }
        return c3;
    }

    public final void e(int i8) {
        while (i8 > 0) {
            T[] tArr = this.f10747a;
            j.c(tArr);
            int i10 = (i8 - 1) / 2;
            T t2 = tArr[i10];
            j.c(t2);
            T t10 = tArr[i8];
            j.c(t10);
            if (((Comparable) t2).compareTo(t10) > 0) {
                f(i8, i10);
                i8 = i10;
            } else {
                return;
            }
        }
    }

    public final void f(int i8, int i10) {
        T[] tArr = this.f10747a;
        j.c(tArr);
        T t2 = tArr[i10];
        j.c(t2);
        T t10 = tArr[i8];
        j.c(t10);
        tArr[i8] = t2;
        tArr[i10] = t10;
        t2.setIndex(i8);
        t10.setIndex(i10);
    }
}
