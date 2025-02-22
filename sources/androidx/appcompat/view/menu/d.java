package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;

public final class d implements j, AdapterView.OnItemClickListener {
    public a B;

    /* renamed from: a  reason: collision with root package name */
    public Context f709a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f710b;

    /* renamed from: c  reason: collision with root package name */
    public f f711c;

    /* renamed from: d  reason: collision with root package name */
    public ExpandedMenuView f712d;

    /* renamed from: e  reason: collision with root package name */
    public j.a f713e;

    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public int f714a = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f711c;
            h hVar = fVar.f742v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f731j;
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    if (arrayList.get(i8) == hVar) {
                        this.f714a = i8;
                        return;
                    }
                }
            }
            this.f714a = -1;
        }

        /* renamed from: c */
        public final h getItem(int i8) {
            d dVar = d.this;
            f fVar = dVar.f711c;
            fVar.i();
            ArrayList<h> arrayList = fVar.f731j;
            dVar.getClass();
            int i10 = i8 + 0;
            int i11 = this.f714a;
            if (i11 >= 0 && i10 >= i11) {
                i10++;
            }
            return arrayList.get(i10);
        }

        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.f711c;
            fVar.i();
            int size = fVar.f731j.size();
            dVar.getClass();
            int i8 = size + 0;
            return this.f714a < 0 ? i8 : i8 - 1;
        }

        public final long getItemId(int i8) {
            return (long) i8;
        }

        public final View getView(int i8, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f710b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i8));
            return view;
        }

        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.f709a = context;
        this.f710b = LayoutInflater.from(context);
    }

    public final void c(f fVar, boolean z10) {
        j.a aVar = this.f713e;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    public final void d(boolean z10) {
        a aVar = this.B;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final boolean e() {
        return false;
    }

    public final void f(j.a aVar) {
        this.f713e = aVar;
    }

    public final boolean g(h hVar) {
        return false;
    }

    public final int getId() {
        return 0;
    }

    public final void h(Context context, f fVar) {
        if (this.f709a != null) {
            this.f709a = context;
            if (this.f710b == null) {
                this.f710b = LayoutInflater.from(context);
            }
        }
        this.f711c = fVar;
        a aVar = this.B;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final void i(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f712d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        Context context = mVar.f722a;
        b.a aVar = new b.a(context);
        AlertController.b bVar = aVar.f681a;
        d dVar = new d(bVar.f661a);
        gVar.f747c = dVar;
        dVar.f713e = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.f747c;
        if (dVar2.B == null) {
            dVar2.B = new a();
        }
        bVar.m = dVar2.B;
        bVar.f673n = gVar;
        View view = mVar.f735o;
        if (view != null) {
            bVar.f665e = view;
        } else {
            bVar.f663c = mVar.f734n;
            bVar.f664d = mVar.m;
        }
        bVar.f672l = gVar;
        b a10 = aVar.a();
        gVar.f746b = a10;
        a10.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f746b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f746b.show();
        j.a aVar2 = this.f713e;
        if (aVar2 == null) {
            return true;
        }
        aVar2.d(mVar);
        return true;
    }

    public final Parcelable l() {
        if (this.f712d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f712d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final boolean m(h hVar) {
        return false;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i8, long j10) {
        this.f711c.q(this.B.getItem(i8), this, 0);
    }
}
