package t;

import ff.m;
import java.util.ArrayList;
import java.util.List;
import rf.a;
import rf.q;
import sf.k;

public final class r extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f15218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<q<c<?>, p2, i2, m>> f15219b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m2 f15220c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i1 f15221d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(i iVar, ArrayList arrayList, m2 m2Var, i1 i1Var) {
        super(0);
        this.f15218a = iVar;
        this.f15219b = arrayList;
        this.f15220c = m2Var;
        this.f15221d = i1Var;
    }

    public final Object d() {
        m2 m2Var;
        int[] iArr;
        List<q<c<?>, p2, i2, m>> list = this.f15219b;
        m2 m2Var2 = this.f15220c;
        i1 i1Var = this.f15221d;
        i iVar = this.f15218a;
        List<q<c<?>, p2, i2, m>> list2 = iVar.f15069e;
        try {
            iVar.f15069e = list;
            m2Var = iVar.D;
            iArr = iVar.f15077n;
            iVar.f15077n = null;
            iVar.D = m2Var2;
            i.r(iVar, i1Var.f15119a, i1Var.f15125g, i1Var.f15120b);
            m mVar = m.f8717a;
            iVar.D = m2Var;
            iVar.f15077n = iArr;
            iVar.f15069e = list2;
            return m.f8717a;
        } catch (Throwable th) {
            iVar.f15069e = list2;
            throw th;
        }
    }
}
