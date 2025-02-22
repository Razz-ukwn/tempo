package w;

import java.util.Iterator;
import java.util.NoSuchElementException;
import sf.j;
import tf.a;

public abstract class e<K, V, T> implements Iterator<T>, a {

    /* renamed from: a  reason: collision with root package name */
    public final u<K, V, T>[] f16440a;

    /* renamed from: b  reason: collision with root package name */
    public int f16441b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16442c = true;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        j.f(tVar, "node");
        this.f16440a = uVarArr;
        u<K, V, T> uVar = uVarArr[0];
        Object[] objArr = tVar.f16461d;
        uVar.getClass();
        j.f(objArr, "buffer");
        uVar.f16464a = objArr;
        uVar.f16465b = Integer.bitCount(tVar.f16458a) * 2;
        uVar.f16466c = 0;
        this.f16441b = 0;
        a();
    }

    public final void a() {
        int i8 = this.f16441b;
        u<K, V, T>[] uVarArr = this.f16440a;
        u<K, V, T> uVar = uVarArr[i8];
        if (!(uVar.f16466c < uVar.f16465b)) {
            while (-1 < i8) {
                int b10 = b(i8);
                if (b10 == -1) {
                    u<K, V, T> uVar2 = uVarArr[i8];
                    int i10 = uVar2.f16466c;
                    Object[] objArr = uVar2.f16464a;
                    if (i10 < objArr.length) {
                        int length = objArr.length;
                        uVar2.f16466c = i10 + 1;
                        b10 = b(i8);
                    }
                }
                if (b10 != -1) {
                    this.f16441b = b10;
                    return;
                }
                if (i8 > 0) {
                    u<K, V, T> uVar3 = uVarArr[i8 - 1];
                    int i11 = uVar3.f16466c;
                    int length2 = uVar3.f16464a.length;
                    uVar3.f16466c = i11 + 1;
                }
                u<K, V, T> uVar4 = uVarArr[i8];
                Object[] objArr2 = t.f16457e.f16461d;
                uVar4.getClass();
                j.f(objArr2, "buffer");
                uVar4.f16464a = objArr2;
                uVar4.f16465b = 0;
                uVar4.f16466c = 0;
                i8--;
            }
            this.f16442c = false;
        }
    }

    public final int b(int i8) {
        u<K, V, T>[] uVarArr = this.f16440a;
        u<K, V, T> uVar = uVarArr[i8];
        int i10 = uVar.f16466c;
        if (i10 < uVar.f16465b) {
            return i8;
        }
        Object[] objArr = uVar.f16464a;
        if (!(i10 < objArr.length)) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i10];
        j.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        t tVar = (t) obj;
        if (i8 == 6) {
            u<K, V, T> uVar2 = uVarArr[i8 + 1];
            Object[] objArr2 = tVar.f16461d;
            int length2 = objArr2.length;
            uVar2.getClass();
            uVar2.f16464a = objArr2;
            uVar2.f16465b = length2;
            uVar2.f16466c = 0;
        } else {
            u<K, V, T> uVar3 = uVarArr[i8 + 1];
            Object[] objArr3 = tVar.f16461d;
            uVar3.getClass();
            j.f(objArr3, "buffer");
            uVar3.f16464a = objArr3;
            uVar3.f16465b = Integer.bitCount(tVar.f16458a) * 2;
            uVar3.f16466c = 0;
        }
        return b(i8 + 1);
    }

    public final boolean hasNext() {
        return this.f16442c;
    }

    public T next() {
        if (this.f16442c) {
            T next = this.f16440a[this.f16441b].next();
            a();
            return next;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
