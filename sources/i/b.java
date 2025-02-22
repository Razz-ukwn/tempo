package i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import o.f;
import p8.b;
import x1.c;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public Object f9343a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9344b;

    /* renamed from: c  reason: collision with root package name */
    public Object f9345c;

    public /* synthetic */ b(Context context) {
        this.f9343a = context;
    }

    public abstract void c();

    public final MenuItem d(MenuItem menuItem) {
        if (!(menuItem instanceof x1.b)) {
            return menuItem;
        }
        x1.b bVar = (x1.b) menuItem;
        if (((f) this.f9344b) == null) {
            this.f9344b = new f();
        }
        MenuItem menuItem2 = (MenuItem) ((f) this.f9344b).getOrDefault(bVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c((Context) this.f9343a, bVar);
        ((f) this.f9344b).put(bVar, cVar);
        return cVar;
    }

    public final SubMenu e(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (((f) this.f9345c) == null) {
            this.f9345c = new f();
        }
        SubMenu subMenu2 = (SubMenu) ((f) this.f9345c).getOrDefault(cVar, null);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g((Context) this.f9343a, cVar);
        ((f) this.f9345c).put(cVar, gVar);
        return gVar;
    }

    public abstract void f();

    public abstract void g(b.c cVar);

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public /* synthetic */ b() {
        this.f9344b = new float[2];
        this.f9345c = new int[1];
    }
}
