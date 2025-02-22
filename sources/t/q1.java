package t;

import b7.a;
import ff.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public final List<z0> f15209a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15210b;

    /* renamed from: c  reason: collision with root package name */
    public int f15211c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f15212d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<Integer, u0> f15213e;

    /* renamed from: f  reason: collision with root package name */
    public final j f15214f;

    public q1(int i8, ArrayList arrayList) {
        this.f15209a = arrayList;
        this.f15210b = i8;
        if (i8 >= 0) {
            this.f15212d = new ArrayList();
            HashMap<Integer, u0> hashMap = new HashMap<>();
            int size = arrayList.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                z0 z0Var = this.f15209a.get(i11);
                Integer valueOf = Integer.valueOf(z0Var.f15293c);
                int i12 = z0Var.f15294d;
                hashMap.put(valueOf, new u0(i11, i10, i12));
                i10 += i12;
            }
            this.f15213e = hashMap;
            this.f15214f = a.x(new p1(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int a(z0 z0Var) {
        sf.j.f(z0Var, "keyInfo");
        u0 u0Var = this.f15213e.get(Integer.valueOf(z0Var.f15293c));
        if (u0Var != null) {
            return u0Var.f15240b;
        }
        return -1;
    }

    public final boolean b(int i8, int i10) {
        int i11;
        HashMap<Integer, u0> hashMap = this.f15213e;
        u0 u0Var = hashMap.get(Integer.valueOf(i8));
        if (u0Var == null) {
            return false;
        }
        int i12 = u0Var.f15240b;
        int i13 = i10 - u0Var.f15241c;
        u0Var.f15241c = i10;
        if (i13 == 0) {
            return true;
        }
        Collection<u0> values = hashMap.values();
        sf.j.e(values, "groupInfos.values");
        for (u0 u0Var2 : values) {
            if (u0Var2.f15240b >= i12 && !sf.j.a(u0Var2, u0Var) && (i11 = u0Var2.f15240b + i13) >= 0) {
                u0Var2.f15240b = i11;
            }
        }
        return true;
    }
}
