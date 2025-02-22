package a9;

import android.widget.AutoCompleteTextView;

public final /* synthetic */ class l implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f149a;

    public /* synthetic */ l(n nVar) {
        this.f149a = nVar;
    }

    public final void onDismiss() {
        n nVar = this.f149a;
        nVar.m = true;
        nVar.f160o = System.currentTimeMillis();
        nVar.t(false);
    }
}
