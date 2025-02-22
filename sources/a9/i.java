package a9;

import android.view.View;

public final /* synthetic */ class i implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f146a;

    public /* synthetic */ i(n nVar) {
        this.f146a = nVar;
    }

    public final void onFocusChange(View view, boolean z10) {
        n nVar = this.f146a;
        nVar.f158l = z10;
        nVar.q();
        if (!z10) {
            nVar.t(false);
            nVar.m = false;
        }
    }
}
