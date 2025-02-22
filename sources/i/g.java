package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import x1.c;

public final class g extends e implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final c f9358e;

    public g(Context context, c cVar) {
        super(context, cVar);
        this.f9358e = cVar;
    }

    public final void clearHeader() {
        this.f9358e.clearHeader();
    }

    public final MenuItem getItem() {
        return d(this.f9358e.getItem());
    }

    public final SubMenu setHeaderIcon(int i8) {
        this.f9358e.setHeaderIcon(i8);
        return this;
    }

    public final SubMenu setHeaderTitle(int i8) {
        this.f9358e.setHeaderTitle(i8);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.f9358e.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i8) {
        this.f9358e.setIcon(i8);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f9358e.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f9358e.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f9358e.setIcon(drawable);
        return this;
    }
}
