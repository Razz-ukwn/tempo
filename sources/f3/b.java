package f3;

import f3.c2;
import jf.d;
import lf.c;
import lf.e;
import rf.a;

@e(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", f = "AsyncPagingDataDiffer.kt", l = {98}, m = "presentNewList")
public final class b extends c {
    public /* synthetic */ Object B;
    public final /* synthetic */ d C;
    public int D;

    /* renamed from: a  reason: collision with root package name */
    public d f8072a;

    /* renamed from: b  reason: collision with root package name */
    public v0 f8073b;

    /* renamed from: c  reason: collision with root package name */
    public v0 f8074c;

    /* renamed from: d  reason: collision with root package name */
    public a f8075d;

    /* renamed from: e  reason: collision with root package name */
    public int f8076e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar, d<? super b> dVar2) {
        super(dVar2);
        this.C = dVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.c((t1) null, (t1) null, 0, (c2.a.C0133a) null, this);
    }
}
