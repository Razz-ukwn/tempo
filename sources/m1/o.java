package m1;

import ag.m;
import b3.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l1.c;
import l1.d;
import l1.e;

public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static int f11160f;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f11161a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final int f11162b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f11163c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f11164d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f11165e = -1;

    public class a {
        public a(d dVar, j1.d dVar2) {
            new WeakReference(dVar);
            c cVar = dVar.K;
            dVar2.getClass();
            j1.d.n(cVar);
            j1.d.n(dVar.L);
            j1.d.n(dVar.M);
            j1.d.n(dVar.N);
            j1.d.n(dVar.O);
        }
    }

    public o(int i8) {
        int i10 = f11160f;
        f11160f = i10 + 1;
        this.f11162b = i10;
        this.f11163c = i8;
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f11161a.size();
        if (this.f11165e != -1 && size > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                o oVar = arrayList.get(i8);
                if (this.f11165e == oVar.f11162b) {
                    c(this.f11163c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(j1.d dVar, int i8) {
        int i10;
        int i11;
        ArrayList<d> arrayList = this.f11161a;
        if (arrayList.size() == 0) {
            return 0;
        }
        e eVar = (e) arrayList.get(0).W;
        dVar.t();
        eVar.c(dVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList.get(i12).c(dVar, false);
        }
        if (i8 == 0 && eVar.B0 > 0) {
            m.a(eVar, dVar, arrayList, 0);
        }
        if (i8 == 1 && eVar.C0 > 0) {
            m.a(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f11164d = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f11164d.add(new a(arrayList.get(i13), dVar));
        }
        if (i8 == 0) {
            i10 = j1.d.n(eVar.K);
            i11 = j1.d.n(eVar.M);
            dVar.t();
        } else {
            i10 = j1.d.n(eVar.L);
            i11 = j1.d.n(eVar.N);
            dVar.t();
        }
        return i11 - i10;
    }

    public final void c(int i8, o oVar) {
        Iterator<d> it = this.f11161a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i10 = oVar.f11162b;
            if (hasNext) {
                d next = it.next();
                ArrayList<d> arrayList = oVar.f11161a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i8 == 0) {
                    next.f10872q0 = i10;
                } else {
                    next.f10874r0 = i10;
                }
            } else {
                this.f11165e = i10;
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i8 = this.f11163c;
        sb2.append(i8 == 0 ? "Horizontal" : i8 == 1 ? "Vertical" : i8 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String b10 = x.b(sb2, this.f11162b, "] <");
        Iterator<d> it = this.f11161a.iterator();
        while (it.hasNext()) {
            StringBuilder b11 = d.a.b(b10, " ");
            b11.append(it.next().f10861k0);
            b10 = b11.toString();
        }
        return h4.a.c(b10, " >");
    }
}
