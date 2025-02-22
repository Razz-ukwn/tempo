package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

public final class o0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p0 f1097a;

    public o0(p0 p0Var) {
        this.f1097a = p0Var;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j10) {
        k0 k0Var;
        if (i8 != -1 && (k0Var = this.f1097a.f1104c) != null) {
            k0Var.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
