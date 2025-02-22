package kf;

import cb.b;
import jf.d;
import jf.f;
import rf.p;
import sf.j;
import sf.y;

public final class c extends lf.c {

    /* renamed from: a  reason: collision with root package name */
    public int f10469a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f10470b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10471c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, f fVar, p pVar, Object obj) {
        super(dVar, fVar);
        this.f10470b = pVar;
        this.f10471c = obj;
        j.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object invokeSuspend(Object obj) {
        int i8 = this.f10469a;
        if (i8 == 0) {
            this.f10469a = 1;
            b.J(obj);
            p pVar = this.f10470b;
            j.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            y.c(2, pVar);
            return pVar.invoke(this.f10471c, this);
        } else if (i8 == 1) {
            this.f10469a = 2;
            b.J(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
