package f3;

import cb.d;
import cg.e;
import f3.f2;
import f3.m0;
import f3.v2;
import f3.y0;
import ff.m;
import gf.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import sf.j;

public final class q1<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    public final w1 f8446a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8447b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8448c;

    /* renamed from: d  reason: collision with root package name */
    public int f8449d;

    /* renamed from: e  reason: collision with root package name */
    public int f8450e;

    /* renamed from: f  reason: collision with root package name */
    public int f8451f;

    /* renamed from: g  reason: collision with root package name */
    public int f8452g;

    /* renamed from: h  reason: collision with root package name */
    public int f8453h;

    /* renamed from: i  reason: collision with root package name */
    public final cg.a f8454i = d.d(-1, (e) null, 6);

    /* renamed from: j  reason: collision with root package name */
    public final cg.a f8455j = d.d(-1, (e) null, 6);

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f8456k = new LinkedHashMap();

    /* renamed from: l  reason: collision with root package name */
    public final t0 f8457l;

    public static final class a<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        public final kotlinx.coroutines.sync.d f8458a = gc.b.b();

        /* renamed from: b  reason: collision with root package name */
        public final q1<Key, Value> f8459b;

        public a(w1 w1Var) {
            j.f(w1Var, "config");
            this.f8459b = new q1<>(w1Var);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8460a;

        static {
            int[] iArr = new int[o0.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f8460a = iArr;
        }
    }

    public q1(w1 w1Var) {
        this.f8446a = w1Var;
        ArrayList arrayList = new ArrayList();
        this.f8447b = arrayList;
        this.f8448c = arrayList;
        t0 t0Var = new t0();
        t0Var.c(o0.f8397a, m0.b.f8365b);
        m mVar = m.f8717a;
        this.f8457l = t0Var;
    }

    public final g2<Key, Value> a(v2.a aVar) {
        Integer num;
        int i8;
        ArrayList arrayList = this.f8448c;
        List O0 = q.O0(arrayList);
        w1 w1Var = this.f8446a;
        if (aVar == null) {
            num = null;
        } else {
            int d10 = d();
            int i10 = -this.f8449d;
            int H = d.H(arrayList) - this.f8449d;
            int i11 = aVar.f8523e;
            if (i10 < i11) {
                int i12 = i10;
                while (true) {
                    int i13 = i12 + 1;
                    if (i12 > H) {
                        w1Var.getClass();
                        i8 = 10;
                    } else {
                        i8 = ((f2.b.C0140b) arrayList.get(i12 + this.f8449d)).f8225a.size();
                    }
                    d10 += i8;
                    if (i13 >= i11) {
                        break;
                    }
                    i12 = i13;
                }
            }
            int i14 = d10 + aVar.f8524f;
            if (i11 < i10) {
                w1Var.getClass();
                i14 -= 10;
            }
            num = Integer.valueOf(i14);
        }
        return new g2<>(O0, num, w1Var, d());
    }

    public final void b(y0.a<Value> aVar) {
        int a10 = aVar.a();
        ArrayList arrayList = this.f8448c;
        int i8 = 0;
        if (a10 <= arrayList.size()) {
            LinkedHashMap linkedHashMap = this.f8456k;
            o0 o0Var = aVar.f8545a;
            linkedHashMap.remove(o0Var);
            this.f8457l.c(o0Var, m0.c.f8367c);
            int ordinal = o0Var.ordinal();
            ArrayList arrayList2 = this.f8447b;
            int i10 = aVar.f8548d;
            if (ordinal == 1) {
                int a11 = aVar.a();
                for (int i11 = 0; i11 < a11; i11++) {
                    arrayList2.remove(0);
                }
                this.f8449d -= aVar.a();
                if (i10 != Integer.MIN_VALUE) {
                    i8 = i10;
                }
                this.f8450e = i8;
                int i12 = this.f8452g + 1;
                this.f8452g = i12;
                this.f8454i.o(Integer.valueOf(i12));
            } else if (ordinal == 2) {
                int a12 = aVar.a();
                for (int i13 = 0; i13 < a12; i13++) {
                    arrayList2.remove(arrayList.size() - 1);
                }
                if (i10 != Integer.MIN_VALUE) {
                    i8 = i10;
                }
                this.f8451f = i8;
                int i14 = this.f8453h + 1;
                this.f8453h = i14;
                this.f8455j.o(Integer.valueOf(i14));
            } else {
                throw new IllegalArgumentException(j.k(o0Var, "cannot drop "));
            }
        } else {
            throw new IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + aVar.a()).toString());
        }
    }

    public final y0.a<Value> c(o0 o0Var, v2 v2Var) {
        int i8;
        j.f(o0Var, "loadType");
        j.f(v2Var, "hint");
        w1 w1Var = this.f8446a;
        y0.a<Value> aVar = null;
        if (w1Var.f8533d == Integer.MAX_VALUE) {
            return null;
        }
        ArrayList arrayList = this.f8448c;
        if (arrayList.size() <= 2) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((f2.b.C0140b) it.next()).f8225a.size();
        }
        int i12 = w1Var.f8533d;
        if (i11 <= i12) {
            return null;
        }
        if (o0Var != o0.f8397a) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < arrayList.size()) {
                Iterator it2 = arrayList.iterator();
                int i15 = 0;
                while (it2.hasNext()) {
                    i15 += ((f2.b.C0140b) it2.next()).f8225a.size();
                }
                if (i15 - i14 <= i12) {
                    break;
                }
                int[] iArr = b.f8460a;
                int size = iArr[o0Var.ordinal()] == 2 ? ((f2.b.C0140b) arrayList.get(i13)).f8225a.size() : ((f2.b.C0140b) arrayList.get(d.H(arrayList) - i13)).f8225a.size();
                if (((iArr[o0Var.ordinal()] == 2 ? v2Var.f8519a : v2Var.f8520b) - i14) - size < w1Var.f8530a) {
                    break;
                }
                i14 += size;
                i13++;
            }
            if (i13 != 0) {
                int[] iArr2 = b.f8460a;
                int H = iArr2[o0Var.ordinal()] == 2 ? -this.f8449d : (d.H(arrayList) - this.f8449d) - (i13 - 1);
                int H2 = iArr2[o0Var.ordinal()] == 2 ? (i13 - 1) - this.f8449d : d.H(arrayList) - this.f8449d;
                if (w1Var.f8531b) {
                    if (o0Var == o0.f8398b) {
                        i8 = d();
                    } else {
                        if (w1Var.f8531b) {
                            i10 = this.f8451f;
                        }
                        i8 = i10;
                    }
                    i10 = i8 + i14;
                }
                aVar = new y0.a<>(o0Var, H, H2, i10);
            }
            return aVar;
        }
        throw new IllegalArgumentException(j.k(o0Var, "Drop LoadType must be PREPEND or APPEND, but got ").toString());
    }

    public final int d() {
        if (this.f8446a.f8531b) {
            return this.f8450e;
        }
        return 0;
    }

    public final boolean e(int i8, o0 o0Var, f2.b.C0140b<Key, Value> bVar) {
        j.f(o0Var, "loadType");
        j.f(bVar, "page");
        int ordinal = o0Var.ordinal();
        ArrayList arrayList = this.f8447b;
        ArrayList arrayList2 = this.f8448c;
        int i10 = 0;
        int i11 = bVar.f8228d;
        int i12 = bVar.f8229e;
        if (ordinal != 0) {
            LinkedHashMap linkedHashMap = this.f8456k;
            List<Value> list = bVar.f8225a;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!(!arrayList2.isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    } else if (i8 != this.f8453h) {
                        return false;
                    } else {
                        arrayList.add(bVar);
                        if (i12 == Integer.MIN_VALUE) {
                            int size = (this.f8446a.f8531b ? this.f8451f : 0) - list.size();
                            i12 = size < 0 ? 0 : size;
                        }
                        if (i12 != Integer.MIN_VALUE) {
                            i10 = i12;
                        }
                        this.f8451f = i10;
                        linkedHashMap.remove(o0.f8399c);
                    }
                }
            } else if (!(!arrayList2.isEmpty())) {
                throw new IllegalStateException("should've received an init before prepend".toString());
            } else if (i8 != this.f8452g) {
                return false;
            } else {
                arrayList.add(0, bVar);
                this.f8449d++;
                if (i11 == Integer.MIN_VALUE) {
                    int d10 = d() - list.size();
                    i11 = d10 < 0 ? 0 : d10;
                }
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                this.f8450e = i10;
                linkedHashMap.remove(o0.f8398b);
            }
        } else if (arrayList2.isEmpty()) {
            if (i8 == 0) {
                arrayList.add(bVar);
                this.f8449d = 0;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = 0;
                }
                this.f8451f = i12;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                this.f8450e = i10;
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
        } else {
            throw new IllegalStateException("cannot receive multiple init calls".toString());
        }
        return true;
    }

    public final y0.b f(f2.b.C0140b bVar, o0 o0Var) {
        int i8;
        j.f(bVar, "<this>");
        int ordinal = o0Var.ordinal();
        int i10 = 0;
        if (ordinal == 0) {
            i8 = 0;
        } else if (ordinal == 1) {
            i8 = 0 - this.f8449d;
        } else if (ordinal == 2) {
            i8 = (this.f8448c.size() - this.f8449d) - 1;
        } else {
            throw new ff.e();
        }
        List O = d.O(new s2(i8, bVar.f8225a));
        int ordinal2 = o0Var.ordinal();
        w1 w1Var = this.f8446a;
        t0 t0Var = this.f8457l;
        if (ordinal2 == 0) {
            y0.b<Object> bVar2 = y0.b.f8549g;
            int d10 = d();
            if (w1Var.f8531b) {
                i10 = this.f8451f;
            }
            return y0.b.a.a(O, d10, i10, t0Var.d(), (n0) null);
        } else if (ordinal2 == 1) {
            y0.b<Object> bVar3 = y0.b.f8549g;
            return new y0.b(o0.f8398b, O, d(), -1, t0Var.d(), (n0) null);
        } else if (ordinal2 == 2) {
            y0.b<Object> bVar4 = y0.b.f8549g;
            if (w1Var.f8531b) {
                i10 = this.f8451f;
            }
            return new y0.b(o0.f8399c, O, -1, i10, t0Var.d(), (n0) null);
        } else {
            throw new ff.e();
        }
    }
}
