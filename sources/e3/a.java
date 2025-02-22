package e3;

import ag.b1;
import android.view.Menu;
import android.view.MenuItem;
import b3.m;
import b3.z;
import java.lang.ref.WeakReference;
import o8.g;
import sf.j;

public final class a implements m.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference<g> f7802a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f7803b;

    public a(WeakReference<g> weakReference, m mVar) {
        this.f7802a = weakReference;
        this.f7803b = mVar;
    }

    public final void a(m mVar, z zVar) {
        j.f(mVar, "controller");
        j.f(zVar, "destination");
        g gVar = this.f7802a.get();
        if (gVar == null) {
            m mVar2 = this.f7803b;
            mVar2.getClass();
            mVar2.f3115p.remove(this);
            return;
        }
        Menu menu = gVar.getMenu();
        j.e(menu, "view.menu");
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = menu.getItem(i8);
            j.b(item, "getItem(index)");
            if (b1.g(zVar, item.getItemId())) {
                item.setChecked(true);
            }
        }
    }
}
