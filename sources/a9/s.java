package a9;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.p0;

public final class s implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f199a;

    public s(t tVar) {
        this.f199a = tVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i8, long j10) {
        Object obj;
        View view2 = null;
        t tVar = this.f199a;
        if (i8 < 0) {
            p0 p0Var = tVar.f200e;
            obj = !p0Var.a() ? null : p0Var.f1104c.getSelectedItem();
        } else {
            obj = tVar.getAdapter().getItem(i8);
        }
        t.a(tVar, obj);
        AdapterView.OnItemClickListener onItemClickListener = tVar.getOnItemClickListener();
        p0 p0Var2 = tVar.f200e;
        if (onItemClickListener != null) {
            if (view == null || i8 < 0) {
                if (p0Var2.a()) {
                    view2 = p0Var2.f1104c.getSelectedView();
                }
                view = view2;
                i8 = !p0Var2.a() ? -1 : p0Var2.f1104c.getSelectedItemPosition();
                j10 = !p0Var2.a() ? Long.MIN_VALUE : p0Var2.f1104c.getSelectedItemId();
            }
            onItemClickListener.onItemClick(p0Var2.f1104c, view, i8, j10);
        }
        p0Var2.dismiss();
    }
}
