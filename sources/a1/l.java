package a1;

import android.view.inputmethod.InputMethodManager;
import rf.a;
import sf.j;
import sf.k;

public final class l extends k implements a<InputMethodManager> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f46a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(0);
        this.f46a = mVar;
    }

    public final Object d() {
        Object systemService = this.f46a.f47a.getContext().getSystemService("input_method");
        j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
