package s5;

import java.util.ArrayList;
import java.util.Iterator;
import r5.i;
import w5.d;

public abstract class d<T extends w5.d<? extends f>> {

    /* renamed from: a  reason: collision with root package name */
    public float f14721a;

    /* renamed from: b  reason: collision with root package name */
    public float f14722b;

    /* renamed from: c  reason: collision with root package name */
    public float f14723c;

    /* renamed from: d  reason: collision with root package name */
    public float f14724d;

    /* renamed from: e  reason: collision with root package name */
    public float f14725e;

    /* renamed from: f  reason: collision with root package name */
    public float f14726f;

    /* renamed from: g  reason: collision with root package name */
    public float f14727g;

    /* renamed from: h  reason: collision with root package name */
    public float f14728h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f14729i;

    public d() {
        this.f14721a = -3.4028235E38f;
        this.f14722b = Float.MAX_VALUE;
        this.f14723c = -3.4028235E38f;
        this.f14724d = Float.MAX_VALUE;
        this.f14725e = -3.4028235E38f;
        this.f14726f = Float.MAX_VALUE;
        this.f14727g = -3.4028235E38f;
        this.f14728h = Float.MAX_VALUE;
        this.f14729i = new ArrayList();
    }

    public final void a() {
        i.a aVar;
        w5.d dVar;
        w5.d dVar2;
        i.a aVar2;
        ArrayList arrayList = this.f14729i;
        if (arrayList != null) {
            this.f14721a = -3.4028235E38f;
            this.f14722b = Float.MAX_VALUE;
            this.f14723c = -3.4028235E38f;
            this.f14724d = Float.MAX_VALUE;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                aVar = i.a.f14064a;
                if (!hasNext) {
                    break;
                }
                w5.d dVar3 = (w5.d) it.next();
                if (this.f14721a < dVar3.g()) {
                    this.f14721a = dVar3.g();
                }
                if (this.f14722b > dVar3.p()) {
                    this.f14722b = dVar3.p();
                }
                if (this.f14723c < dVar3.M()) {
                    this.f14723c = dVar3.M();
                }
                if (this.f14724d > dVar3.e()) {
                    this.f14724d = dVar3.e();
                }
                if (dVar3.U() == aVar) {
                    if (this.f14725e < dVar3.g()) {
                        this.f14725e = dVar3.g();
                    }
                    if (this.f14726f > dVar3.p()) {
                        this.f14726f = dVar3.p();
                    }
                } else {
                    if (this.f14727g < dVar3.g()) {
                        this.f14727g = dVar3.g();
                    }
                    if (this.f14728h > dVar3.p()) {
                        this.f14728h = dVar3.p();
                    }
                }
            }
            this.f14725e = -3.4028235E38f;
            this.f14726f = Float.MAX_VALUE;
            this.f14727g = -3.4028235E38f;
            this.f14728h = Float.MAX_VALUE;
            Iterator it2 = arrayList.iterator();
            while (true) {
                dVar = null;
                if (!it2.hasNext()) {
                    dVar2 = null;
                    break;
                }
                dVar2 = (w5.d) it2.next();
                if (dVar2.U() == aVar) {
                    break;
                }
            }
            if (dVar2 != null) {
                this.f14725e = dVar2.g();
                this.f14726f = dVar2.p();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    w5.d dVar4 = (w5.d) it3.next();
                    if (dVar4.U() == aVar) {
                        if (dVar4.p() < this.f14726f) {
                            this.f14726f = dVar4.p();
                        }
                        if (dVar4.g() > this.f14725e) {
                            this.f14725e = dVar4.g();
                        }
                    }
                }
            }
            Iterator it4 = arrayList.iterator();
            while (true) {
                boolean hasNext2 = it4.hasNext();
                aVar2 = i.a.f14065b;
                if (!hasNext2) {
                    break;
                }
                w5.d dVar5 = (w5.d) it4.next();
                if (dVar5.U() == aVar2) {
                    dVar = dVar5;
                    break;
                }
            }
            if (dVar != null) {
                this.f14727g = dVar.g();
                this.f14728h = dVar.p();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    w5.d dVar6 = (w5.d) it5.next();
                    if (dVar6.U() == aVar2) {
                        if (dVar6.p() < this.f14728h) {
                            this.f14728h = dVar6.p();
                        }
                        if (dVar6.g() > this.f14727g) {
                            this.f14727g = dVar6.g();
                        }
                    }
                }
            }
        }
    }

    public final T b(int i8) {
        ArrayList arrayList = this.f14729i;
        if (arrayList == null || i8 < 0 || i8 >= arrayList.size()) {
            return null;
        }
        return (w5.d) arrayList.get(i8);
    }

    public final int c() {
        ArrayList arrayList = this.f14729i;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int d() {
        Iterator it = this.f14729i.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((w5.d) it.next()).V();
        }
        return i8;
    }

    public final float e(i.a aVar) {
        if (aVar == i.a.f14064a) {
            float f10 = this.f14725e;
            return f10 == -3.4028235E38f ? this.f14727g : f10;
        }
        float f11 = this.f14727g;
        return f11 == -3.4028235E38f ? this.f14725e : f11;
    }

    public final float f(i.a aVar) {
        if (aVar == i.a.f14064a) {
            float f10 = this.f14726f;
            return f10 == Float.MAX_VALUE ? this.f14728h : f10;
        }
        float f11 = this.f14728h;
        return f11 == Float.MAX_VALUE ? this.f14726f : f11;
    }

    public d(T... tArr) {
        this.f14721a = -3.4028235E38f;
        this.f14722b = Float.MAX_VALUE;
        this.f14723c = -3.4028235E38f;
        this.f14724d = Float.MAX_VALUE;
        this.f14725e = -3.4028235E38f;
        this.f14726f = Float.MAX_VALUE;
        this.f14727g = -3.4028235E38f;
        this.f14728h = Float.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        for (T add : tArr) {
            arrayList.add(add);
        }
        this.f14729i = arrayList;
        a();
    }
}
