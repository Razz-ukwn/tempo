package a1;

import android.view.inputmethod.BaseInputConnection;
import rf.a;
import sf.k;

public final class b0 extends k implements a<BaseInputConnection> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f0 f21a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var) {
        super(0);
        this.f21a = f0Var;
    }

    public final Object d() {
        return new BaseInputConnection(this.f21a.f29a, false);
    }
}
