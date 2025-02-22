package a1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import e.q;
import sf.j;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final View f43a;

    public i(View view) {
        j.f(view, "view");
        this.f43a = view;
    }

    public void a(InputMethodManager inputMethodManager) {
        j.f(inputMethodManager, "imm");
        inputMethodManager.hideSoftInputFromWindow(this.f43a.getWindowToken(), 0);
    }

    public void b(InputMethodManager inputMethodManager) {
        j.f(inputMethodManager, "imm");
        this.f43a.post(new q(1, inputMethodManager, this));
    }
}
