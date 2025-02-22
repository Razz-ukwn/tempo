package m1;

import h0.e;
import java.util.ArrayList;
import java.util.Iterator;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public p f11142a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11143b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11144c = false;

    /* renamed from: d  reason: collision with root package name */
    public final p f11145d;

    /* renamed from: e  reason: collision with root package name */
    public int f11146e = 1;

    /* renamed from: f  reason: collision with root package name */
    public int f11147f;

    /* renamed from: g  reason: collision with root package name */
    public int f11148g;

    /* renamed from: h  reason: collision with root package name */
    public int f11149h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f11150i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11151j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f11152k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f11153l = new ArrayList();

    public f(p pVar) {
        this.f11145d = pVar;
    }

    public final void a(d dVar) {
        ArrayList arrayList = this.f11153l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f11151j) {
                return;
            }
        }
        this.f11144c = true;
        p pVar = this.f11142a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f11143b) {
            this.f11145d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i8 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i8++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i8 == 1 && fVar.f11151j) {
            g gVar = this.f11150i;
            if (gVar != null) {
                if (gVar.f11151j) {
                    this.f11147f = this.f11149h * gVar.f11148g;
                } else {
                    return;
                }
            }
            d(fVar.f11148g + this.f11147f);
        }
        p pVar2 = this.f11142a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f11152k.add(dVar);
        if (this.f11151j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f11153l.clear();
        this.f11152k.clear();
        this.f11151j = false;
        this.f11148g = 0;
        this.f11144c = false;
        this.f11143b = false;
    }

    public void d(int i8) {
        if (!this.f11151j) {
            this.f11151j = true;
            this.f11148g = i8;
            Iterator it = this.f11152k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11145d.f11167b.f10861k0);
        sb2.append(":");
        sb2.append(e.e(this.f11146e));
        sb2.append("(");
        sb2.append(this.f11151j ? Integer.valueOf(this.f11148g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f11153l.size());
        sb2.append(":d=");
        sb2.append(this.f11152k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
