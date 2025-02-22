package r3;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q;
import androidx.fragment.app.z;
import j1.c;
import java.util.ArrayList;
import java.util.Iterator;
import r3.k;

public class p extends k {
    public ArrayList<k> T = new ArrayList<>();
    public boolean U = true;
    public int V;
    public boolean W = false;
    public int X = 0;

    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f13854a;

        public a(k kVar) {
            this.f13854a = kVar;
        }

        public final void c(k kVar) {
            this.f13854a.C();
            kVar.z(this);
        }
    }

    public static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        public final p f13855a;

        public b(p pVar) {
            this.f13855a = pVar;
        }

        public final void c(k kVar) {
            p pVar = this.f13855a;
            int i8 = pVar.V - 1;
            pVar.V = i8;
            if (i8 == 0) {
                pVar.W = false;
                pVar.p();
            }
            kVar.z(this);
        }

        public final void e(k kVar) {
            p pVar = this.f13855a;
            if (!pVar.W) {
                pVar.J();
                pVar.W = true;
            }
        }
    }

    public final void A(View view) {
        for (int i8 = 0; i8 < this.T.size(); i8++) {
            this.T.get(i8).A(view);
        }
        this.B.remove(view);
    }

    public final void B(ViewGroup viewGroup) {
        super.B(viewGroup);
        int size = this.T.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.T.get(i8).B(viewGroup);
        }
    }

    public final void C() {
        if (this.T.isEmpty()) {
            J();
            p();
            return;
        }
        b bVar = new b(this);
        Iterator<k> it = this.T.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.V = this.T.size();
        if (!this.U) {
            for (int i8 = 1; i8 < this.T.size(); i8++) {
                this.T.get(i8 - 1).a(new a(this.T.get(i8)));
            }
            k kVar = this.T.get(0);
            if (kVar != null) {
                kVar.C();
                return;
            }
            return;
        }
        Iterator<k> it2 = this.T.iterator();
        while (it2.hasNext()) {
            it2.next().C();
        }
    }

    public final void E(k.c cVar) {
        this.O = cVar;
        this.X |= 8;
        int size = this.T.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.T.get(i8).E(cVar);
        }
    }

    public final void G(z zVar) {
        super.G(zVar);
        this.X |= 4;
        if (this.T != null) {
            for (int i8 = 0; i8 < this.T.size(); i8++) {
                this.T.get(i8).G(zVar);
            }
        }
    }

    public final void H() {
        this.X |= 2;
        int size = this.T.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.T.get(i8).H();
        }
    }

    public final void I(long j10) {
        this.f13835b = j10;
    }

    public final String K(String str) {
        String K = super.K(str);
        for (int i8 = 0; i8 < this.T.size(); i8++) {
            StringBuilder b10 = d.a.b(K, "\n");
            b10.append(this.T.get(i8).K(str + "  "));
            K = b10.toString();
        }
        return K;
    }

    public final void L(k kVar) {
        this.T.add(kVar);
        kVar.E = this;
        long j10 = this.f13836c;
        if (j10 >= 0) {
            kVar.D(j10);
        }
        if ((this.X & 1) != 0) {
            kVar.F(this.f13837d);
        }
        if ((this.X & 2) != 0) {
            kVar.H();
        }
        if ((this.X & 4) != 0) {
            kVar.G(this.P);
        }
        if ((this.X & 8) != 0) {
            kVar.E(this.O);
        }
    }

    /* renamed from: M */
    public final void D(long j10) {
        ArrayList<k> arrayList;
        this.f13836c = j10;
        if (j10 >= 0 && (arrayList = this.T) != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.T.get(i8).D(j10);
            }
        }
    }

    /* renamed from: N */
    public final void F(TimeInterpolator timeInterpolator) {
        this.X |= 1;
        ArrayList<k> arrayList = this.T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.T.get(i8).F(timeInterpolator);
            }
        }
        this.f13837d = timeInterpolator;
    }

    public final void O(int i8) {
        if (i8 == 0) {
            this.U = true;
        } else if (i8 == 1) {
            this.U = false;
        } else {
            throw new AndroidRuntimeException(q.a("Invalid parameter for TransitionSet ordering: ", i8));
        }
    }

    public final void a(k.d dVar) {
        super.a(dVar);
    }

    public final void b(View view) {
        for (int i8 = 0; i8 < this.T.size(); i8++) {
            this.T.get(i8).b(view);
        }
        this.B.add(view);
    }

    public final void cancel() {
        super.cancel();
        int size = this.T.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.T.get(i8).cancel();
        }
    }

    public final void g(r rVar) {
        View view = rVar.f13860b;
        if (w(view)) {
            Iterator<k> it = this.T.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next.w(view)) {
                    next.g(rVar);
                    rVar.f13861c.add(next);
                }
            }
        }
    }

    public final void i(r rVar) {
        int size = this.T.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.T.get(i8).i(rVar);
        }
    }

    public final void j(r rVar) {
        View view = rVar.f13860b;
        if (w(view)) {
            Iterator<k> it = this.T.iterator();
            while (it.hasNext()) {
                k next = it.next();
                if (next.w(view)) {
                    next.j(rVar);
                    rVar.f13861c.add(next);
                }
            }
        }
    }

    /* renamed from: m */
    public final k clone() {
        p pVar = (p) super.clone();
        pVar.T = new ArrayList<>();
        int size = this.T.size();
        for (int i8 = 0; i8 < size; i8++) {
            k m = this.T.get(i8).clone();
            pVar.T.add(m);
            m.E = pVar;
        }
        return pVar;
    }

    public final void o(ViewGroup viewGroup, c cVar, c cVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long j10 = this.f13835b;
        int size = this.T.size();
        for (int i8 = 0; i8 < size; i8++) {
            k kVar = this.T.get(i8);
            if (j10 > 0 && (this.U || i8 == 0)) {
                long j11 = kVar.f13835b;
                if (j11 > 0) {
                    kVar.I(j11 + j10);
                } else {
                    kVar.I(j10);
                }
            }
            kVar.o(viewGroup, cVar, cVar2, arrayList, arrayList2);
        }
    }

    public final void y(View view) {
        super.y(view);
        int size = this.T.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.T.get(i8).y(view);
        }
    }

    public final void z(k.d dVar) {
        super.z(dVar);
    }
}
