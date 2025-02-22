package androidx.activity;

import android.window.OnBackInvokedCallback;
import rf.a;
import sf.j;

public final /* synthetic */ class o implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f604a;

    public /* synthetic */ o(a aVar) {
        this.f604a = aVar;
    }

    public final void onBackInvoked() {
        a aVar = this.f604a;
        j.f(aVar, "$onBackInvoked");
        aVar.d();
    }
}
