package b0;

import e9.c;
import ff.m;
import gf.l;
import gf.q;
import java.util.ArrayList;
import java.util.Iterator;
import jf.d;
import lf.e;
import lf.h;
import rf.p;
import sf.j;
import yf.i;

public final class k implements Iterable<Integer>, tf.a {

    /* renamed from: e  reason: collision with root package name */
    public static final k f2930e = new k(0, 0, 0, (int[]) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f2931a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2932b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2933c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f2934d;

    @e(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
    public static final class a extends h implements p<i<? super Integer>, d<? super m>, Object> {
        public /* synthetic */ Object B;
        public final /* synthetic */ k C;

        /* renamed from: b  reason: collision with root package name */
        public int[] f2935b;

        /* renamed from: c  reason: collision with root package name */
        public int f2936c;

        /* renamed from: d  reason: collision with root package name */
        public int f2937d;

        /* renamed from: e  reason: collision with root package name */
        public int f2938e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(k kVar, d<? super a> dVar) {
            super(dVar);
            this.C = kVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.C, dVar);
            aVar.B = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((i) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f2938e
                r3 = 1
                r6 = 64
                r8 = 0
                r10 = 3
                r11 = 2
                r12 = 1
                if (r2 == 0) goto L_0x004c
                if (r2 == r12) goto L_0x003c
                if (r2 == r11) goto L_0x002e
                if (r2 != r10) goto L_0x0026
                int r2 = r0.f2936c
                java.lang.Object r7 = r0.B
                yf.i r7 = (yf.i) r7
                cb.b.J(r21)
                r5 = r0
                r14 = r10
                r13 = 0
                r10 = r1
                goto L_0x00ee
            L_0x0026:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002e:
                int r2 = r0.f2936c
                java.lang.Object r13 = r0.B
                yf.i r13 = (yf.i) r13
                cb.b.J(r21)
                r7 = r0
                r10 = r1
                r5 = r11
                goto L_0x00b1
            L_0x003c:
                int r2 = r0.f2937d
                int r13 = r0.f2936c
                int[] r14 = r0.f2935b
                java.lang.Object r15 = r0.B
                yf.i r15 = (yf.i) r15
                cb.b.J(r21)
                r7 = r0
                r10 = r1
                goto L_0x0079
            L_0x004c:
                cb.b.J(r21)
                java.lang.Object r2 = r0.B
                yf.i r2 = (yf.i) r2
                b0.k r13 = r0.C
                int[] r13 = r13.f2934d
                if (r13 == 0) goto L_0x007e
                int r14 = r13.length
                r7 = r0
                r10 = r1
                r15 = r2
                r2 = r14
                r14 = r13
                r13 = 0
            L_0x0060:
                if (r13 >= r2) goto L_0x007c
                r11 = r14[r13]
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r11)
                r7.B = r15
                r7.f2935b = r14
                r7.f2936c = r13
                r7.f2937d = r2
                r7.f2938e = r12
                r15.c(r5, r7)
                if (r1 != r10) goto L_0x0079
                return r10
            L_0x0079:
                int r13 = r13 + r12
                r11 = 2
                goto L_0x0060
            L_0x007c:
                r2 = r15
                goto L_0x0080
            L_0x007e:
                r7 = r0
                r10 = r1
            L_0x0080:
                b0.k r5 = r7.C
                long r13 = r5.f2932b
                int r5 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r5 == 0) goto L_0x00b4
                r13 = r2
                r2 = 0
            L_0x008a:
                if (r2 >= r6) goto L_0x00b3
                b0.k r5 = r7.C
                long r14 = r5.f2932b
                long r17 = r3 << r2
                long r14 = r14 & r17
                int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
                if (r11 == 0) goto L_0x00b0
                int r5 = r5.f2933c
                int r5 = r5 + r2
                java.lang.Integer r11 = new java.lang.Integer
                r11.<init>(r5)
                r7.B = r13
                r5 = 0
                r7.f2935b = r5
                r7.f2936c = r2
                r5 = 2
                r7.f2938e = r5
                r13.c(r11, r7)
                if (r1 != r10) goto L_0x00b1
                return r10
            L_0x00b0:
                r5 = 2
            L_0x00b1:
                int r2 = r2 + r12
                goto L_0x008a
            L_0x00b3:
                r2 = r13
            L_0x00b4:
                b0.k r5 = r7.C
                long r13 = r5.f2931a
                int r5 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r5 == 0) goto L_0x00f6
                r5 = r2
                r2 = r7
                r7 = 0
            L_0x00bf:
                if (r7 >= r6) goto L_0x00f6
                b0.k r11 = r2.C
                long r13 = r11.f2931a
                long r15 = r3 << r7
                long r13 = r13 & r15
                int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r13 == 0) goto L_0x00e6
                int r13 = r7 + 64
                int r11 = r11.f2933c
                int r13 = r13 + r11
                java.lang.Integer r11 = new java.lang.Integer
                r11.<init>(r13)
                r2.B = r5
                r13 = 0
                r2.f2935b = r13
                r2.f2936c = r7
                r14 = 3
                r2.f2938e = r14
                r5.c(r11, r2)
                if (r1 != r10) goto L_0x00e8
                return r10
            L_0x00e6:
                r13 = 0
                r14 = 3
            L_0x00e8:
                r19 = r5
                r5 = r2
                r2 = r7
                r7 = r19
            L_0x00ee:
                int r2 = r2 + r12
                r19 = r7
                r7 = r2
                r2 = r5
                r5 = r19
                goto L_0x00bf
            L_0x00f6:
                ff.m r1 = ff.m.f8717a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k(long j10, long j11, int i8, int[] iArr) {
        this.f2931a = j10;
        this.f2932b = j11;
        this.f2933c = i8;
        this.f2934d = iArr;
    }

    public final k a(k kVar) {
        int[] iArr;
        j.f(kVar, "bits");
        k kVar2 = f2930e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar2;
        }
        int i8 = this.f2933c;
        if (kVar.f2933c == i8 && kVar.f2934d == (iArr = this.f2934d)) {
            return new k(this.f2931a & (~kVar.f2931a), (~kVar.f2932b) & this.f2932b, i8, iArr);
        }
        Iterator it = kVar.iterator();
        k kVar3 = this;
        while (it.hasNext()) {
            kVar3 = kVar3.b(((Number) it.next()).intValue());
        }
        return kVar3;
    }

    public final k b(int i8) {
        int[] iArr;
        int n2;
        int i10 = i8;
        int i11 = this.f2933c;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j10 = 1 << i12;
            long j11 = this.f2932b;
            if ((j11 & j10) != 0) {
                return new k(this.f2931a, j11 & (~j10), i11, this.f2934d);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j12 = 1 << (i12 - 64);
            long j13 = this.f2931a;
            if ((j13 & j12) != 0) {
                return new k(j13 & (~j12), this.f2932b, i11, this.f2934d);
            }
        } else if (i12 < 0 && (iArr = this.f2934d) != null && (n2 = b7.a.n(iArr, i10)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new k(this.f2931a, this.f2932b, this.f2933c, (int[]) null);
            }
            int[] iArr2 = new int[length];
            if (n2 > 0) {
                l.U(0, 0, n2, iArr, iArr2);
            }
            if (n2 < length) {
                l.U(n2, n2 + 1, length + 1, iArr, iArr2);
            }
            return new k(this.f2931a, this.f2932b, this.f2933c, iArr2);
        }
        return this;
    }

    public final boolean c(int i8) {
        int[] iArr;
        int i10 = i8 - this.f2933c;
        boolean z10 = true;
        if (i10 >= 0 && i10 < 64) {
            return ((1 << i10) & this.f2932b) != 0;
        }
        if (i10 >= 64 && i10 < 128) {
            return ((1 << (i10 - 64)) & this.f2931a) != 0;
        }
        if (i10 > 0 || (iArr = this.f2934d) == null) {
            return false;
        }
        if (b7.a.n(iArr, i8) < 0) {
            z10 = false;
        }
        return z10;
    }

    public final k d(k kVar) {
        int[] iArr;
        j.f(kVar, "bits");
        k kVar2 = f2930e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar;
        }
        int i8 = this.f2933c;
        if (kVar.f2933c == i8 && kVar.f2934d == (iArr = this.f2934d)) {
            return new k(this.f2931a | kVar.f2931a, this.f2932b | kVar.f2932b, i8, iArr);
        }
        if (this.f2934d == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                kVar = kVar.e(((Number) it.next()).intValue());
            }
            return kVar;
        }
        Iterator it2 = kVar.iterator();
        k kVar3 = this;
        while (it2.hasNext()) {
            kVar3 = kVar3.e(((Number) it2.next()).intValue());
        }
        return kVar3;
    }

    public final k e(int i8) {
        long j10;
        int i10;
        int i11 = i8;
        int i12 = this.f2933c;
        int i13 = i11 - i12;
        long j11 = this.f2932b;
        if (i13 < 0 || i13 >= 64) {
            long j12 = this.f2931a;
            if (i13 < 64 || i13 >= 128) {
                int[] iArr = this.f2934d;
                if (i13 >= 128) {
                    if (!c(i8)) {
                        int i14 = ((i11 + 1) / 64) * 64;
                        int i15 = this.f2933c;
                        ArrayList arrayList = null;
                        long j13 = j12;
                        while (true) {
                            if (i15 >= i14) {
                                j10 = j11;
                                i10 = i15;
                                break;
                            }
                            if (j11 != 0) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    if (iArr != null) {
                                        for (int valueOf : iArr) {
                                            arrayList.add(Integer.valueOf(valueOf));
                                        }
                                    }
                                }
                                for (int i16 = 0; i16 < 64; i16++) {
                                    if (((1 << i16) & j11) != 0) {
                                        arrayList.add(Integer.valueOf(i16 + i15));
                                    }
                                }
                            }
                            if (j13 == 0) {
                                i10 = i14;
                                j10 = 0;
                                break;
                            }
                            i15 += 64;
                            j11 = j13;
                            j13 = 0;
                        }
                        if (arrayList != null) {
                            iArr = q.N0(arrayList);
                        }
                        return new k(j13, j10, i10, iArr).e(i11);
                    }
                } else if (iArr == null) {
                    return new k(j12, j11, i12, new int[]{i11});
                } else {
                    int n2 = b7.a.n(iArr, i11);
                    if (n2 < 0) {
                        int i17 = -(n2 + 1);
                        int length = iArr.length + 1;
                        int[] iArr2 = new int[length];
                        l.U(0, 0, i17, iArr, iArr2);
                        l.U(i17 + 1, i17, length - 1, iArr, iArr2);
                        iArr2[i17] = i11;
                        return new k(this.f2931a, this.f2932b, this.f2933c, iArr2);
                    }
                }
            } else {
                long j14 = 1 << (i13 - 64);
                if ((j12 & j14) == 0) {
                    return new k(j12 | j14, j11, i12, this.f2934d);
                }
            }
        } else {
            long j15 = 1 << i13;
            if ((j11 & j15) == 0) {
                return new k(this.f2931a, j11 | j15, i12, this.f2934d);
            }
        }
        return this;
    }

    public final Iterator<Integer> iterator() {
        a aVar = new a(this, (d<? super a>) null);
        yf.h hVar = new yf.h();
        hVar.f17387c = c.e(hVar, hVar, aVar);
        return hVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(gf.m.n0(this));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("");
        int size = arrayList.size();
        int i8 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            boolean z10 = true;
            i8++;
            if (i8 > 1) {
                sb3.append(", ");
            }
            if (obj != null) {
                z10 = obj instanceof CharSequence;
            }
            if (z10) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append(String.valueOf(obj));
            }
        }
        sb3.append("");
        String sb4 = sb3.toString();
        j.e(sb4, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb2.append(sb4);
        sb2.append(']');
        return sb2.toString();
    }
}
