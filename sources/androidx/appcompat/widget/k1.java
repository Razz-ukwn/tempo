package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import i.a;

public final class k1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final a f1055a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l1 f1056b;

    public k1(l1 l1Var) {
        this.f1056b = l1Var;
        this.f1055a = new a(l1Var.f1060a.getContext(), l1Var.f1068i);
    }

    public final void onClick(View view) {
        l1 l1Var = this.f1056b;
        Window.Callback callback = l1Var.f1071l;
        if (callback != null && l1Var.m) {
            callback.onMenuItemSelected(0, this.f1055a);
        }
    }
}
