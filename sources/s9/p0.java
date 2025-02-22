package s9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m9.f;
import r9.d0;
import r9.g0;
import r9.m;
import r9.p;
import r9.s;
import r9.v;
import u6.q;

public final class p0 extends m {
    public static final Parcelable.Creator<p0> CREATOR = new c();
    public List B;
    public String C;
    public Boolean D;
    public d E;
    public boolean F;
    public g0 G;
    public p H;

    /* renamed from: a  reason: collision with root package name */
    public m0 f14857a;

    /* renamed from: b  reason: collision with root package name */
    public m0 f14858b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14859c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14860d;

    /* renamed from: e  reason: collision with root package name */
    public List f14861e;

    public p0(f fVar, ArrayList arrayList) {
        q.i(fVar);
        fVar.a();
        this.f14859c = fVar.f11332b;
        this.f14860d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.C = "2";
        C(arrayList);
    }

    public final boolean A() {
        String str;
        Boolean bool = this.D;
        if (bool == null || bool.booleanValue()) {
            m0 m0Var = this.f14857a;
            if (m0Var != null) {
                Map map = (Map) n.a(m0Var.f4724b).f13252b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z10 = false;
            if (this.f14861e.size() <= 1 && (str == null || !str.equals("custom"))) {
                z10 = true;
            }
            this.D = Boolean.valueOf(z10);
        }
        return this.D.booleanValue();
    }

    public final p0 B() {
        this.D = Boolean.FALSE;
        return this;
    }

    public final synchronized p0 C(List list) {
        q.i(list);
        this.f14861e = new ArrayList(list.size());
        this.B = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            v vVar = (v) list.get(i8);
            if (vVar.a().equals("firebase")) {
                this.f14858b = (m0) vVar;
            } else {
                this.B.add(vVar.a());
            }
            this.f14861e.add((m0) vVar);
        }
        if (this.f14858b == null) {
            this.f14858b = (m0) this.f14861e.get(0);
        }
        return this;
    }

    public final m0 D() {
        return this.f14857a;
    }

    public final String E() {
        return this.f14857a.f4724b;
    }

    public final String F() {
        return this.f14857a.x();
    }

    public final List G() {
        return this.B;
    }

    public final void H(m0 m0Var) {
        q.i(m0Var);
        this.f14857a = m0Var;
    }

    public final void I(ArrayList arrayList) {
        p pVar;
        if (arrayList.isEmpty()) {
            pVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p pVar2 = (p) it.next();
                if (pVar2 instanceof s) {
                    arrayList2.add((s) pVar2);
                } else if (pVar2 instanceof d0) {
                    arrayList3.add((d0) pVar2);
                }
            }
            pVar = new p(arrayList2, arrayList3);
        }
        this.H = pVar;
    }

    public final String a() {
        return this.f14858b.f14849b;
    }

    public final /* synthetic */ r3.s w() {
        return new r3.s(this);
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int s10 = ag.m.s(parcel, 20293);
        ag.m.m(parcel, 1, this.f14857a, i8);
        ag.m.m(parcel, 2, this.f14858b, i8);
        ag.m.n(parcel, 3, this.f14859c);
        ag.m.n(parcel, 4, this.f14860d);
        ag.m.q(parcel, 5, this.f14861e);
        ag.m.o(parcel, 6, this.B);
        ag.m.n(parcel, 7, this.C);
        Boolean valueOf = Boolean.valueOf(A());
        if (valueOf != null) {
            parcel.writeInt(262152);
            parcel.writeInt(valueOf.booleanValue() ? 1 : 0);
        }
        ag.m.m(parcel, 9, this.E, i8);
        ag.m.g(parcel, 10, this.F);
        ag.m.m(parcel, 11, this.G, i8);
        ag.m.m(parcel, 12, this.H, i8);
        ag.m.E(parcel, s10);
    }

    public final List<? extends v> x() {
        return this.f14861e;
    }

    public final String y() {
        String str;
        Map map;
        m0 m0Var = this.f14857a;
        if (m0Var == null || (str = m0Var.f4724b) == null || (map = (Map) n.a(str).f13252b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    public final String z() {
        return this.f14858b.f14848a;
    }

    public p0(m0 m0Var, m0 m0Var2, String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, Boolean bool, d dVar, boolean z10, g0 g0Var, p pVar) {
        this.f14857a = m0Var;
        this.f14858b = m0Var2;
        this.f14859c = str;
        this.f14860d = str2;
        this.f14861e = arrayList;
        this.B = arrayList2;
        this.C = str3;
        this.D = bool;
        this.E = dVar;
        this.F = z10;
        this.G = g0Var;
        this.H = pVar;
    }
}
