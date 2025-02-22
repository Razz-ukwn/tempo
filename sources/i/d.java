package i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;

public abstract class d implements f, j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Rect f9356a;

    public static int o(e eVar, Context context, int i8) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = eVar.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = eVar.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = eVar.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i8) {
                return i8;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    public static boolean w(f fVar) {
        int size = fVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = fVar.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(h hVar) {
        return false;
    }

    public final int getId() {
        return 0;
    }

    public final void h(Context context, f fVar) {
    }

    public final boolean m(h hVar) {
        return false;
    }

    public abstract void n(f fVar);

    public final void onItemClick(AdapterView<?> adapterView, View view, int i8, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (e) listAdapter).f716a.q((MenuItem) listAdapter.getItem(i8), this, (this instanceof b) ^ true ? 0 : 4);
    }

    public abstract void p(View view);

    public abstract void q(boolean z10);

    public abstract void r(int i8);

    public abstract void s(int i8);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z10);

    public abstract void v(int i8);
}
