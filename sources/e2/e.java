package e2;

import a9.n;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import d2.d1;
import d2.i0;
import j6.m;
import java.util.WeakHashMap;

public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final d f7778a;

    public e(d dVar) {
        this.f7778a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f7778a.equals(((e) obj).f7778a);
    }

    public final int hashCode() {
        return this.f7778a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z10) {
        n nVar = (n) ((m) this.f7778a).f9834a;
        AutoCompleteTextView autoCompleteTextView = nVar.f154h;
        if (autoCompleteTextView != null) {
            int i8 = 1;
            if (!(autoCompleteTextView.getInputType() != 0)) {
                if (z10) {
                    i8 = 2;
                }
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.s(nVar.f167d, i8);
            }
        }
    }
}
