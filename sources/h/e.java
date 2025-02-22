package h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import h.a;
import i.c;
import java.util.ArrayList;
import o.f;
import x1.b;

public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9015a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9016b;

    public static class a implements a.C0162a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f9017a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f9018b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f9019c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final f<Menu, Menu> f9020d = new f<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f9018b = context;
            this.f9017a = callback;
        }

        public final boolean a(a aVar, androidx.appcompat.view.menu.f fVar) {
            e e10 = e(aVar);
            f<Menu, Menu> fVar2 = this.f9020d;
            Menu orDefault = fVar2.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new i.e(this.f9018b, fVar);
                fVar2.put(fVar, orDefault);
            }
            return this.f9017a.onPrepareActionMode(e10, orDefault);
        }

        public final boolean b(a aVar, androidx.appcompat.view.menu.f fVar) {
            e e10 = e(aVar);
            f<Menu, Menu> fVar2 = this.f9020d;
            Menu orDefault = fVar2.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new i.e(this.f9018b, fVar);
                fVar2.put(fVar, orDefault);
            }
            return this.f9017a.onCreateActionMode(e10, orDefault);
        }

        public final boolean c(a aVar, MenuItem menuItem) {
            return this.f9017a.onActionItemClicked(e(aVar), new c(this.f9018b, (b) menuItem));
        }

        public final void d(a aVar) {
            this.f9017a.onDestroyActionMode(e(aVar));
        }

        public final e e(a aVar) {
            ArrayList<e> arrayList = this.f9019c;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                e eVar = arrayList.get(i8);
                if (eVar != null && eVar.f9016b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f9018b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, a aVar) {
        this.f9015a = context;
        this.f9016b = aVar;
    }

    public final void finish() {
        this.f9016b.c();
    }

    public final View getCustomView() {
        return this.f9016b.d();
    }

    public final Menu getMenu() {
        return new i.e(this.f9015a, this.f9016b.e());
    }

    public final MenuInflater getMenuInflater() {
        return this.f9016b.f();
    }

    public final CharSequence getSubtitle() {
        return this.f9016b.g();
    }

    public final Object getTag() {
        return this.f9016b.f9004a;
    }

    public final CharSequence getTitle() {
        return this.f9016b.h();
    }

    public final boolean getTitleOptionalHint() {
        return this.f9016b.f9005b;
    }

    public final void invalidate() {
        this.f9016b.i();
    }

    public final boolean isTitleOptional() {
        return this.f9016b.j();
    }

    public final void setCustomView(View view) {
        this.f9016b.k(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f9016b.m(charSequence);
    }

    public final void setTag(Object obj) {
        this.f9016b.f9004a = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f9016b.o(charSequence);
    }

    public final void setTitleOptionalHint(boolean z10) {
        this.f9016b.p(z10);
    }

    public final void setSubtitle(int i8) {
        this.f9016b.l(i8);
    }

    public final void setTitle(int i8) {
        this.f9016b.n(i8);
    }
}
