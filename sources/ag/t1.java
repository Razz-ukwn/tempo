package ag;

import androidx.databinding.a;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.v;

public final class t1 extends i.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s1 f486d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f487e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t1(i iVar, s1 s1Var, Object obj) {
        super(iVar);
        this.f486d = s1Var;
        this.f487e = obj;
    }

    public final v c(Object obj) {
        i iVar = (i) obj;
        if (this.f486d.S() == this.f487e) {
            return null;
        }
        return a.f1765b;
    }
}
