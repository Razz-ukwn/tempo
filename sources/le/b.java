package le;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.quickkonnect.silencio.R;
import je.e;
import ke.b;
import sf.j;

public final class b extends a implements ke.a {
    public ke.b A0;

    /* renamed from: w0  reason: collision with root package name */
    public RecyclerView f11062w0;

    /* renamed from: x0  reason: collision with root package name */
    public TextView f11063x0;

    /* renamed from: y0  reason: collision with root package name */
    public a f11064y0;

    /* renamed from: z0  reason: collision with root package name */
    public MenuItem f11065z0;

    public interface a {
        void a();
    }

    /* renamed from: le.b$b  reason: collision with other inner class name */
    public static final class C0208b implements SearchView.m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f11066a;

        public C0208b(b bVar) {
            this.f11066a = bVar;
        }

        public final void a(String str) {
            j.f(str, "newText");
            ke.b bVar = this.f11066a.A0;
            if (bVar != null) {
                new b.C0193b(bVar).filter(str);
            }
        }

        public final void b(String str) {
            j.f(str, "query");
        }
    }

    public final void I(Context context) {
        j.f(context, "context");
        super.I(context);
        if (context instanceof a) {
            this.f11064y0 = (a) context;
            return;
        }
        throw new RuntimeException(context + " must implement PhotoPickerFragmentListener");
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        i0(true);
    }

    public final void K(Menu menu, MenuInflater menuInflater) {
        j.f(menu, "menu");
        j.f(menuInflater, "inflater");
        menuInflater.inflate(R.menu.doc_picker_menu, menu);
        MenuItem findItem = menu.findItem(R.id.action_select);
        this.f11065z0 = findItem;
        int i8 = e.f9993a;
        if (findItem != null) {
            findItem.setVisible(false);
        }
        MenuItem findItem2 = menu.findItem(R.id.search);
        View actionView = findItem2 != null ? findItem2.getActionView() : null;
        if (actionView != null) {
            ((SearchView) actionView).setOnQueryTextListener(new C0208b(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_photo_picker, viewGroup, false);
    }

    public final /* synthetic */ void N() {
        super.N();
    }

    public final void O() {
        this.f2062b0 = true;
        this.f11064y0 = null;
    }

    public final boolean R(MenuItem menuItem) {
        MenuItem menuItem2;
        j.f(menuItem, "item");
        if (menuItem.getItemId() != R.id.action_select) {
            return false;
        }
        ke.b bVar = this.A0;
        if (!(bVar == null || (menuItem2 = this.f11065z0) == null)) {
            if (menuItem2.isChecked()) {
                bVar.f10463e.clear();
                bVar.g();
                e.f9994b.clear();
                e.f9995c.clear();
                menuItem2.setIcon(R.drawable.ic_deselect_all);
            } else {
                bVar.q();
                int i8 = e.f9993a;
                e.a(2, bVar.f10463e);
                menuItem2.setIcon(R.drawable.ic_select_all);
            }
            menuItem2.setChecked(!menuItem2.isChecked());
            a aVar = this.f11064y0;
            if (aVar != null) {
                aVar.a();
            }
        }
        return true;
    }

    public final void Z(View view) {
        j.f(view, "view");
        View findViewById = view.findViewById(R.id.recyclerview);
        j.e(findViewById, "view.findViewById(R.id.recyclerview)");
        this.f11062w0 = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.empty_view);
        j.e(findViewById2, "view.findViewById(R.id.empty_view)");
        this.f11063x0 = (TextView) findViewById2;
        RecyclerView recyclerView = this.f11062w0;
        if (recyclerView != null) {
            o();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            RecyclerView recyclerView2 = this.f11062w0;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            } else {
                j.l("recyclerView");
                throw null;
            }
        } else {
            j.l("recyclerView");
            throw null;
        }
    }

    public final void a() {
        MenuItem menuItem;
        a aVar = this.f11064y0;
        if (aVar != null) {
            aVar.a();
        }
        ke.b bVar = this.A0;
        if (bVar != null && (menuItem = this.f11065z0) != null && bVar.d() == bVar.f10463e.size()) {
            menuItem.setIcon(R.drawable.ic_select_all);
            menuItem.setChecked(true);
        }
    }

    public final void n0() {
    }
}
