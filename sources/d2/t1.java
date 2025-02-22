package d2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final /* synthetic */ class t1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f7274a;

    public /* synthetic */ t1(View view) {
        this.f7274a = view;
    }

    public final void run() {
        View view = this.f7274a;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }
}
