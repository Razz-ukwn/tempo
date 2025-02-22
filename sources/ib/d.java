package ib;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

public final class d implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f9634a;

    public d(f fVar) {
        this.f9634a = fVar;
    }

    public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 != 3) {
            return false;
        }
        f fVar = this.f9634a;
        ((InputMethodManager) fVar.G.getSystemService("input_method")).hideSoftInputFromWindow(fVar.E.getWindowToken(), 0);
        return true;
    }
}
