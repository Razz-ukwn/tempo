package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.d f705a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MenuItem f706b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f707c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b.c f708d;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f708d = cVar;
        this.f705a = dVar;
        this.f706b = hVar;
        this.f707c = fVar;
    }

    public final void run() {
        b.d dVar = this.f705a;
        if (dVar != null) {
            b.c cVar = this.f708d;
            b.this.W = true;
            dVar.f703b.c(false);
            b.this.W = false;
        }
        MenuItem menuItem = this.f706b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f707c.q(menuItem, (j) null, 4);
        }
    }
}
