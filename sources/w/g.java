package w;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import sf.j;
import sf.y;

public class g<K, V, T> extends e<K, V, T> {
    public boolean B;
    public int C;

    /* renamed from: d  reason: collision with root package name */
    public final f<K, V> f16448d;

    /* renamed from: e  reason: collision with root package name */
    public K f16449e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.f16445c, uVarArr);
        j.f(fVar, "builder");
        this.f16448d = fVar;
        this.C = fVar.f16447e;
    }

    public final void c(int i8, t<?, ?> tVar, K k10, int i10) {
        int i11 = i10 * 5;
        u<K, V, T>[] uVarArr = this.f16440a;
        if (i11 > 30) {
            u<K, V, T> uVar = uVarArr[i10];
            Object[] objArr = tVar.f16461d;
            int length = objArr.length;
            uVar.getClass();
            uVar.f16464a = objArr;
            uVar.f16465b = length;
            uVar.f16466c = 0;
            while (true) {
                u<K, V, T> uVar2 = uVarArr[i10];
                if (!j.a(uVar2.f16464a[uVar2.f16466c], k10)) {
                    uVarArr[i10].f16466c += 2;
                } else {
                    this.f16441b = i10;
                    return;
                }
            }
        } else {
            int i12 = 1 << ((i8 >> i11) & 31);
            if (tVar.h(i12)) {
                int f10 = tVar.f(i12);
                u<K, V, T> uVar3 = uVarArr[i10];
                Object[] objArr2 = tVar.f16461d;
                uVar3.getClass();
                j.f(objArr2, "buffer");
                uVar3.f16464a = objArr2;
                uVar3.f16465b = Integer.bitCount(tVar.f16458a) * 2;
                uVar3.f16466c = f10;
                this.f16441b = i10;
                return;
            }
            int t2 = tVar.t(i12);
            t<?, ?> s10 = tVar.s(t2);
            u<K, V, T> uVar4 = uVarArr[i10];
            Object[] objArr3 = tVar.f16461d;
            uVar4.getClass();
            j.f(objArr3, "buffer");
            uVar4.f16464a = objArr3;
            uVar4.f16465b = Integer.bitCount(tVar.f16458a) * 2;
            uVar4.f16466c = t2;
            c(i8, s10, k10, i10 + 1);
        }
    }

    public final T next() {
        if (this.f16448d.f16447e != this.C) {
            throw new ConcurrentModificationException();
        } else if (this.f16442c) {
            u<K, V, T> uVar = this.f16440a[this.f16441b];
            this.f16449e = uVar.f16464a[uVar.f16466c];
            this.B = true;
            return super.next();
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        if (this.B) {
            boolean z10 = this.f16442c;
            f<K, V> fVar = this.f16448d;
            if (!z10) {
                K k10 = this.f16449e;
                y.b(fVar);
                fVar.remove(k10);
            } else if (z10) {
                u<K, V, T> uVar = this.f16440a[this.f16441b];
                Object obj = uVar.f16464a[uVar.f16466c];
                K k11 = this.f16449e;
                y.b(fVar);
                fVar.remove(k11);
                c(obj != null ? obj.hashCode() : 0, fVar.f16445c, obj, 0);
            } else {
                throw new NoSuchElementException();
            }
            this.f16449e = null;
            this.B = false;
            this.C = fVar.f16447e;
            return;
        }
        throw new IllegalStateException();
    }
}
