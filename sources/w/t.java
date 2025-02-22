package w;

import cb.b;
import cb.c;
import d2.f1;
import gf.l;
import java.util.Arrays;
import sf.j;
import wf.d;

public final class t<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final t f16457e = new t(0, 0, new Object[0], (c) null);

    /* renamed from: a  reason: collision with root package name */
    public int f16458a;

    /* renamed from: b  reason: collision with root package name */
    public int f16459b;

    /* renamed from: c  reason: collision with root package name */
    public final c f16460c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f16461d;

    public static final class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public t<K, V> f16462a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16463b;

        public a(t<K, V> tVar, int i8) {
            j.f(tVar, "node");
            this.f16462a = tVar;
            this.f16463b = i8;
        }
    }

    public t(int i8, int i10, Object[] objArr, c cVar) {
        this.f16458a = i8;
        this.f16459b = i10;
        this.f16460c = cVar;
        this.f16461d = objArr;
    }

    public static t j(int i8, Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11, c cVar) {
        int i12 = i11;
        c cVar2 = cVar;
        if (i12 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, cVar2);
        }
        int i13 = (i8 >> i12) & 31;
        int i14 = (i10 >> i12) & 31;
        if (i13 != i14) {
            Object[] objArr = new Object[4];
            if (i13 < i14) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            return new t((1 << i14) | (1 << i13), 0, objArr, cVar2);
        }
        return new t(0, 1 << i13, new Object[]{j(i8, obj, obj2, i10, obj3, obj4, i12 + 5, cVar)}, cVar2);
    }

    public final Object[] a(int i8, int i10, int i11, K k10, V v3, int i12, c cVar) {
        int i13 = i8;
        Object obj = this.f16461d[i13];
        t j10 = j(obj != null ? obj.hashCode() : 0, obj, x(i8), i11, k10, v3, i12 + 5, cVar);
        int i14 = i10;
        int t2 = t(i10) + 1;
        Object[] objArr = this.f16461d;
        int i15 = t2 - 2;
        Object[] objArr2 = new Object[((objArr.length - 2) + 1)];
        l.X(objArr, objArr2, 0, 0, i8, 6);
        l.V(i8, i13 + 2, t2, objArr, objArr2);
        objArr2[i15] = j10;
        l.V(i15 + 1, t2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f16459b == 0) {
            return this.f16461d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f16458a);
        int length = this.f16461d.length;
        for (int i8 = bitCount * 2; i8 < length; i8++) {
            bitCount += s(i8).b();
        }
        return bitCount;
    }

    public final boolean c(K k10) {
        d K = f1.K(f1.P(0, this.f16461d.length), 2);
        int i8 = K.f16714a;
        int i10 = K.f16715b;
        int i11 = K.f16716c;
        if ((i11 > 0 && i8 <= i10) || (i11 < 0 && i10 <= i8)) {
            while (!j.a(k10, this.f16461d[i8])) {
                if (i8 != i10) {
                    i8 += i11;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(Object obj, int i8, int i10) {
        int i11 = 1 << ((i8 >> i10) & 31);
        if (h(i11)) {
            return j.a(obj, this.f16461d[f(i11)]);
        } else if (!i(i11)) {
            return false;
        } else {
            t s10 = s(t(i11));
            return i10 == 30 ? s10.c(obj) : s10.d(obj, i8, i10 + 5);
        }
    }

    public final boolean e(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f16459b != tVar.f16459b || this.f16458a != tVar.f16458a) {
            return false;
        }
        int length = this.f16461d.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (this.f16461d[i8] != tVar.f16461d[i8]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i8) {
        return Integer.bitCount((i8 - 1) & this.f16458a) * 2;
    }

    public final Object g(Object obj, int i8, int i10) {
        int i11 = 1 << ((i8 >> i10) & 31);
        if (h(i11)) {
            int f10 = f(i11);
            if (j.a(obj, this.f16461d[f10])) {
                return x(f10);
            }
            return null;
        } else if (!i(i11)) {
            return null;
        } else {
            t s10 = s(t(i11));
            if (i10 != 30) {
                return s10.g(obj, i8, i10 + 5);
            }
            d K = f1.K(f1.P(0, s10.f16461d.length), 2);
            int i12 = K.f16714a;
            int i13 = K.f16715b;
            int i14 = K.f16716c;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                return null;
            }
            while (!j.a(obj, s10.f16461d[i12])) {
                if (i12 == i13) {
                    return null;
                }
                i12 += i14;
            }
            return s10.x(i12);
        }
    }

    public final boolean h(int i8) {
        return (i8 & this.f16458a) != 0;
    }

    public final boolean i(int i8) {
        return (i8 & this.f16459b) != 0;
    }

    public final t<K, V> k(int i8, f<K, V> fVar) {
        fVar.getClass();
        fVar.b(fVar.B - 1);
        fVar.f16446d = x(i8);
        Object[] objArr = this.f16461d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f16460c != fVar.f16444b) {
            return new t<>(0, 0, b.j(i8, objArr), fVar.f16444b);
        }
        this.f16461d = b.j(i8, objArr);
        return this;
    }

    public final t<K, V> l(int i8, K k10, V v3, int i10, f<K, V> fVar) {
        t<K, V> tVar;
        j.f(fVar, "mutator");
        int i11 = 1 << ((i8 >> i10) & 31);
        boolean h3 = h(i11);
        c cVar = this.f16460c;
        if (h3) {
            int f10 = f(i11);
            if (j.a(k10, this.f16461d[f10])) {
                fVar.f16446d = x(f10);
                if (x(f10) == v3) {
                    return this;
                }
                if (cVar == fVar.f16444b) {
                    this.f16461d[f10 + 1] = v3;
                    return this;
                }
                fVar.f16447e++;
                Object[] objArr = this.f16461d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                j.e(copyOf, "copyOf(this, size)");
                copyOf[f10 + 1] = v3;
                return new t<>(this.f16458a, this.f16459b, copyOf, fVar.f16444b);
            }
            fVar.b(fVar.B + 1);
            c cVar2 = fVar.f16444b;
            if (cVar == cVar2) {
                this.f16461d = a(f10, i11, i8, k10, v3, i10, cVar2);
                this.f16458a ^= i11;
                this.f16459b |= i11;
                return this;
            }
            return new t<>(this.f16458a ^ i11, this.f16459b | i11, a(f10, i11, i8, k10, v3, i10, cVar2), cVar2);
        } else if (i(i11)) {
            int t2 = t(i11);
            t<K, V> s10 = s(t2);
            if (i10 == 30) {
                d K = f1.K(f1.P(0, s10.f16461d.length), 2);
                int i12 = K.f16714a;
                int i13 = K.f16715b;
                int i14 = K.f16716c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!j.a(k10, s10.f16461d[i12])) {
                            if (i12 == i13) {
                                break;
                            }
                            i12 += i14;
                        } else {
                            fVar.f16446d = s10.x(i12);
                            if (s10.f16460c == fVar.f16444b) {
                                s10.f16461d[i12 + 1] = v3;
                                tVar = s10;
                            } else {
                                fVar.f16447e++;
                                Object[] objArr2 = s10.f16461d;
                                Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                j.e(copyOf2, "copyOf(this, size)");
                                copyOf2[i12 + 1] = v3;
                                tVar = new t<>(0, 0, copyOf2, fVar.f16444b);
                            }
                        }
                    }
                }
                fVar.b(fVar.B + 1);
                tVar = new t<>(0, 0, b.i(s10.f16461d, 0, k10, v3), fVar.f16444b);
            } else {
                tVar = s10.l(i8, k10, v3, i10 + 5, fVar);
            }
            return s10 == tVar ? this : r(t2, tVar, fVar.f16444b);
        } else {
            fVar.b(fVar.B + 1);
            c cVar3 = fVar.f16444b;
            int f11 = f(i11);
            if (cVar == cVar3) {
                this.f16461d = b.i(this.f16461d, f11, k10, v3);
                this.f16458a |= i11;
                return this;
            }
            return new t<>(this.f16458a | i11, this.f16459b, b.i(this.f16461d, f11, k10, v3), cVar3);
        }
    }

    public final t<K, V> m(t<K, V> tVar, int i8, y.a aVar, f<K, V> fVar) {
        Object[] objArr;
        int i10;
        t<K, V> tVar2;
        int i11;
        t<K, V> tVar3 = tVar;
        int i12 = i8;
        y.a aVar2 = aVar;
        f<K, V> fVar2 = fVar;
        j.f(fVar2, "mutator");
        if (this == tVar3) {
            aVar2.f17103a += b();
            return this;
        }
        int i13 = 0;
        if (i12 > 30) {
            c cVar = fVar2.f16444b;
            Object[] objArr2 = this.f16461d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + tVar3.f16461d.length);
            j.e(copyOf, "copyOf(this, newSize)");
            int length = this.f16461d.length;
            d K = f1.K(f1.P(0, tVar3.f16461d.length), 2);
            int i14 = K.f16714a;
            int i15 = K.f16715b;
            int i16 = K.f16716c;
            if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                while (true) {
                    if (!c(tVar3.f16461d[i14])) {
                        Object[] objArr3 = tVar3.f16461d;
                        copyOf[length] = objArr3[i14];
                        copyOf[length + 1] = objArr3[i14 + 1];
                        length += 2;
                    } else {
                        aVar2.f17103a++;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14 += i16;
                }
            }
            if (length == this.f16461d.length) {
                return this;
            }
            if (length == tVar3.f16461d.length) {
                return tVar3;
            }
            if (length == copyOf.length) {
                return new t<>(0, 0, copyOf, cVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            j.e(copyOf2, "copyOf(this, newSize)");
            return new t<>(0, 0, copyOf2, cVar);
        }
        int i17 = this.f16459b | tVar3.f16459b;
        int i18 = this.f16458a;
        int i19 = tVar3.f16458a;
        int i20 = i18 & i19;
        int i21 = (i18 ^ i19) & (~i17);
        while (i20 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i20);
            if (j.a(this.f16461d[f(lowestOneBit)], tVar3.f16461d[tVar3.f(lowestOneBit)])) {
                i21 |= lowestOneBit;
            } else {
                i17 |= lowestOneBit;
            }
            i20 ^= lowestOneBit;
        }
        if ((i17 & i21) == 0) {
            t tVar4 = (j.a(this.f16460c, fVar2.f16444b) && this.f16458a == i21 && this.f16459b == i17) ? this : new t(i21, i17, new Object[(Integer.bitCount(i17) + (Integer.bitCount(i21) * 2))], (c) null);
            int i22 = i17;
            int i23 = 0;
            while (i22 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i22);
                Object[] objArr4 = tVar4.f16461d;
                int length2 = (objArr4.length - 1) - i23;
                if (i(lowestOneBit2)) {
                    tVar2 = s(t(lowestOneBit2));
                    if (tVar3.i(lowestOneBit2)) {
                        tVar2 = tVar2.m(tVar3.s(tVar3.t(lowestOneBit2)), i12 + 5, aVar2, fVar2);
                    } else if (tVar3.h(lowestOneBit2)) {
                        int f10 = tVar3.f(lowestOneBit2);
                        Object obj = tVar3.f16461d[f10];
                        V x10 = tVar3.x(f10);
                        int i24 = fVar2.B;
                        int hashCode = obj != null ? obj.hashCode() : i13;
                        int i25 = i24;
                        int i26 = hashCode;
                        objArr = objArr4;
                        i11 = lowestOneBit2;
                        tVar2 = tVar2.l(i26, obj, x10, i12 + 5, fVar);
                        if (fVar2.B == i25) {
                            aVar2.f17103a++;
                        }
                        i10 = i11;
                    }
                    objArr = objArr4;
                    i11 = lowestOneBit2;
                    i10 = i11;
                } else {
                    objArr = objArr4;
                    i10 = lowestOneBit2;
                    if (tVar3.i(i10)) {
                        tVar2 = tVar3.s(tVar3.t(i10));
                        if (h(i10)) {
                            int f11 = f(i10);
                            Object obj2 = this.f16461d[f11];
                            int i27 = i12 + 5;
                            if (tVar2.d(obj2, obj2 != null ? obj2.hashCode() : 0, i27)) {
                                aVar2.f17103a++;
                            } else {
                                tVar2 = tVar2.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f11), i27, fVar);
                            }
                        }
                    } else {
                        int f12 = f(i10);
                        Object obj3 = this.f16461d[f12];
                        Object x11 = x(f12);
                        int f13 = tVar3.f(i10);
                        Object obj4 = tVar3.f16461d[f13];
                        tVar2 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x11, obj4 != null ? obj4.hashCode() : 0, obj4, tVar3.x(f13), i12 + 5, fVar2.f16444b);
                    }
                }
                objArr[length2] = tVar2;
                i23++;
                i22 ^= i10;
                i13 = 0;
            }
            int i28 = 0;
            while (i21 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i21);
                int i29 = i28 * 2;
                if (!tVar3.h(lowestOneBit3)) {
                    int f14 = f(lowestOneBit3);
                    Object[] objArr5 = tVar4.f16461d;
                    objArr5[i29] = this.f16461d[f14];
                    objArr5[i29 + 1] = x(f14);
                } else {
                    int f15 = tVar3.f(lowestOneBit3);
                    Object[] objArr6 = tVar4.f16461d;
                    objArr6[i29] = tVar3.f16461d[f15];
                    objArr6[i29 + 1] = tVar3.x(f15);
                    if (h(lowestOneBit3)) {
                        aVar2.f17103a++;
                    }
                }
                i28++;
                i21 ^= lowestOneBit3;
            }
            return e(tVar4) ? this : tVar3.e(tVar4) ? tVar3 : tVar4;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final t<K, V> n(int i8, K k10, int i10, f<K, V> fVar) {
        t<K, V> tVar;
        t<K, V> tVar2;
        j.f(fVar, "mutator");
        int i11 = 1 << ((i8 >> i10) & 31);
        if (h(i11)) {
            int f10 = f(i11);
            return j.a(k10, this.f16461d[f10]) ? p(f10, i11, fVar) : this;
        } else if (!i(i11)) {
            return this;
        } else {
            int t2 = t(i11);
            t<K, V> s10 = s(t2);
            if (i10 == 30) {
                d K = f1.K(f1.P(0, s10.f16461d.length), 2);
                int i12 = K.f16714a;
                int i13 = K.f16715b;
                int i14 = K.f16716c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!j.a(k10, s10.f16461d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    tVar2 = s10.k(i12, fVar);
                }
                tVar = s10;
                return q(s10, tVar, t2, i11, fVar.f16444b);
            }
            tVar2 = s10.n(i8, k10, i10 + 5, fVar);
            tVar = tVar2;
            return q(s10, tVar, t2, i11, fVar.f16444b);
        }
    }

    public final t<K, V> o(int i8, K k10, V v3, int i10, f<K, V> fVar) {
        t<K, V> tVar;
        t<K, V> tVar2;
        K k11 = k10;
        V v10 = v3;
        int i11 = i10;
        f<K, V> fVar2 = fVar;
        j.f(fVar2, "mutator");
        int i12 = 1 << ((i8 >> i11) & 31);
        if (h(i12)) {
            int f10 = f(i12);
            return (!j.a(k10, this.f16461d[f10]) || !j.a(v3, x(f10))) ? this : p(f10, i12, fVar2);
        } else if (!i(i12)) {
            return this;
        } else {
            int t2 = t(i12);
            t<K, V> s10 = s(t2);
            if (i11 == 30) {
                d K = f1.K(f1.P(0, s10.f16461d.length), 2);
                int i13 = K.f16714a;
                int i14 = K.f16715b;
                int i15 = K.f16716c;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (true) {
                        if (!j.a(k10, s10.f16461d[i13]) || !j.a(v3, s10.x(i13))) {
                            if (i13 == i14) {
                                break;
                            }
                            i13 += i15;
                        } else {
                            tVar2 = s10.k(i13, fVar2);
                            break;
                        }
                    }
                }
                tVar = s10;
                return q(s10, tVar, t2, i12, fVar2.f16444b);
            }
            tVar2 = s10.o(i8, k10, v3, i11 + 5, fVar);
            tVar = tVar2;
            return q(s10, tVar, t2, i12, fVar2.f16444b);
        }
    }

    public final t<K, V> p(int i8, int i10, f<K, V> fVar) {
        fVar.getClass();
        fVar.b(fVar.B - 1);
        fVar.f16446d = x(i8);
        Object[] objArr = this.f16461d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f16460c == fVar.f16444b) {
            this.f16461d = b.j(i8, objArr);
            this.f16458a ^= i10;
            return this;
        }
        return new t<>(i10 ^ this.f16458a, this.f16459b, b.j(i8, objArr), fVar.f16444b);
    }

    public final t<K, V> q(t<K, V> tVar, t<K, V> tVar2, int i8, int i10, c cVar) {
        c cVar2 = this.f16460c;
        if (tVar2 == null) {
            Object[] objArr = this.f16461d;
            if (objArr.length == 1) {
                return null;
            }
            if (cVar2 == cVar) {
                this.f16461d = b.k(i8, objArr);
                this.f16459b ^= i10;
            } else {
                return new t<>(this.f16458a, i10 ^ this.f16459b, b.k(i8, objArr), cVar);
            }
        } else if (cVar2 == cVar || tVar != tVar2) {
            return r(i8, tVar2, cVar);
        }
        return this;
    }

    public final t<K, V> r(int i8, t<K, V> tVar, c cVar) {
        Object[] objArr = this.f16461d;
        if (objArr.length == 1 && tVar.f16461d.length == 2 && tVar.f16459b == 0) {
            tVar.f16458a = this.f16459b;
            return tVar;
        } else if (this.f16460c == cVar) {
            objArr[i8] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            j.e(copyOf, "copyOf(this, size)");
            copyOf[i8] = tVar;
            return new t<>(this.f16458a, this.f16459b, copyOf, cVar);
        }
    }

    public final t<K, V> s(int i8) {
        Object obj = this.f16461d[i8];
        j.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int t(int i8) {
        return (this.f16461d.length - 1) - Integer.bitCount((i8 - 1) & this.f16459b);
    }

    public final a u(Object obj, int i8, int i10, x.a aVar) {
        a aVar2;
        int i11 = 1 << ((i8 >> i10) & 31);
        if (h(i11)) {
            int f10 = f(i11);
            if (!j.a(obj, this.f16461d[f10])) {
                return new a(new t(this.f16458a ^ i11, this.f16459b | i11, a(f10, i11, i8, obj, aVar, i10, (c) null), (c) null), 1);
            } else if (x(f10) == aVar) {
                return null;
            } else {
                Object[] objArr = this.f16461d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                j.e(copyOf, "copyOf(this, size)");
                copyOf[f10 + 1] = aVar;
                return new a(new t(this.f16458a, this.f16459b, copyOf, (c) null), 0);
            }
        } else if (i(i11)) {
            int t2 = t(i11);
            t s10 = s(t2);
            if (i10 == 30) {
                d K = f1.K(f1.P(0, s10.f16461d.length), 2);
                int i12 = K.f16714a;
                int i13 = K.f16715b;
                int i14 = K.f16716c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!j.a(obj, s10.f16461d[i12])) {
                            if (i12 == i13) {
                                break;
                            }
                            i12 += i14;
                        } else if (aVar == s10.x(i12)) {
                            aVar2 = null;
                        } else {
                            Object[] objArr2 = s10.f16461d;
                            Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            j.e(copyOf2, "copyOf(this, size)");
                            copyOf2[i12 + 1] = aVar;
                            aVar2 = new a(new t(0, 0, copyOf2, (c) null), 0);
                        }
                    }
                }
                aVar2 = new a(new t(0, 0, b.i(s10.f16461d, 0, obj, aVar), (c) null), 1);
                if (aVar2 == null) {
                    return null;
                }
            } else {
                aVar2 = s10.u(obj, i8, i10 + 5, aVar);
                if (aVar2 == null) {
                    return null;
                }
            }
            aVar2.f16462a = w(t2, i11, aVar2.f16462a);
            return aVar2;
        } else {
            return new a(new t(this.f16458a | i11, this.f16459b, b.i(this.f16461d, f(i11), obj, aVar), (c) null), 1);
        }
    }

    public final t v(Object obj, int i8, int i10) {
        t tVar;
        int i11 = 1 << ((i8 >> i10) & 31);
        if (h(i11)) {
            int f10 = f(i11);
            if (!j.a(obj, this.f16461d[f10])) {
                return this;
            }
            Object[] objArr = this.f16461d;
            if (objArr.length == 2) {
                return null;
            }
            return new t(this.f16458a ^ i11, this.f16459b, b.j(f10, objArr), (c) null);
        } else if (!i(i11)) {
            return this;
        } else {
            int t2 = t(i11);
            t s10 = s(t2);
            if (i10 == 30) {
                d K = f1.K(f1.P(0, s10.f16461d.length), 2);
                int i12 = K.f16714a;
                int i13 = K.f16715b;
                int i14 = K.f16716c;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!j.a(obj, s10.f16461d[i12])) {
                            if (i12 == i13) {
                                break;
                            }
                            i12 += i14;
                        } else {
                            Object[] objArr2 = s10.f16461d;
                            tVar = objArr2.length == 2 ? null : new t(0, 0, b.j(i12, objArr2), (c) null);
                        }
                    }
                }
                tVar = s10;
            } else {
                tVar = s10.v(obj, i8, i10 + 5);
            }
            if (tVar != null) {
                return s10 != tVar ? w(t2, i11, tVar) : this;
            }
            Object[] objArr3 = this.f16461d;
            if (objArr3.length == 1) {
                return null;
            }
            return new t(this.f16458a, i11 ^ this.f16459b, b.k(t2, objArr3), (c) null);
        }
    }

    public final t<K, V> w(int i8, int i10, t<K, V> tVar) {
        Object[] objArr = tVar.f16461d;
        if (objArr.length != 2 || tVar.f16459b != 0) {
            Object[] objArr2 = this.f16461d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            j.e(copyOf, "copyOf(this, newSize)");
            copyOf[i8] = tVar;
            return new t<>(this.f16458a, this.f16459b, copyOf, (c) null);
        } else if (this.f16461d.length == 1) {
            tVar.f16458a = this.f16459b;
            return tVar;
        } else {
            int f10 = f(i10);
            Object[] objArr3 = this.f16461d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
            j.e(copyOf2, "copyOf(this, newSize)");
            l.V(i8 + 2, i8 + 1, objArr3.length, copyOf2, copyOf2);
            l.V(f10 + 2, f10, i8, copyOf2, copyOf2);
            copyOf2[f10] = obj;
            copyOf2[f10 + 1] = obj2;
            return new t<>(this.f16458a ^ i10, i10 ^ this.f16459b, copyOf2, (c) null);
        }
    }

    public final V x(int i8) {
        return this.f16461d[i8 + 1];
    }
}
