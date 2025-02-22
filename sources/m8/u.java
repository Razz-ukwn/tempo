package m8;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f11309a;

    public u(EditText editText) {
        this.f11309a = editText;
    }

    public final void run() {
        View view = this.f11309a;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
