package l1;

import j1.c;
import java.util.ArrayList;

public class k extends d {

    /* renamed from: s0  reason: collision with root package name */
    public ArrayList<d> f10925s0 = new ArrayList<>();

    public void D() {
        this.f10925s0.clear();
        super.D();
    }

    public final void G(c cVar) {
        super.G(cVar);
        int size = this.f10925s0.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f10925s0.get(i8).G(cVar);
        }
    }

    public void R() {
        ArrayList<d> arrayList = this.f10925s0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                d dVar = this.f10925s0.get(i8);
                if (dVar instanceof k) {
                    ((k) dVar).R();
                }
            }
        }
    }
}
