package ag;

import java.util.Iterator;
import java.util.List;
import jf.d;
import lf.e;

@e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {66}, m = "joinAll")
public final class c extends lf.c {

    /* renamed from: a  reason: collision with root package name */
    public Iterator f399a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f400b;

    /* renamed from: c  reason: collision with root package name */
    public int f401c;

    public c(d<? super c> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f400b = obj;
        this.f401c |= Integer.MIN_VALUE;
        return d.h((List) null, this);
    }
}
