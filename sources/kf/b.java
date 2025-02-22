package kf;

import jf.d;
import lf.g;
import rf.p;
import sf.j;
import sf.y;

public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public int f10466a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f10467b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10468c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Object obj, d dVar, p pVar) {
        super(dVar);
        this.f10467b = pVar;
        this.f10468c = obj;
        j.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object invokeSuspend(Object obj) {
        int i8 = this.f10466a;
        if (i8 == 0) {
            this.f10466a = 1;
            cb.b.J(obj);
            p pVar = this.f10467b;
            j.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            y.c(2, pVar);
            return pVar.invoke(this.f10468c, this);
        } else if (i8 == 1) {
            this.f10466a = 2;
            cb.b.J(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
