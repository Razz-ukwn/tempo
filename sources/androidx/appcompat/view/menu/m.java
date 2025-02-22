package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.fragment.app.q;

public class m extends f implements SubMenu {
    public final h A;

    /* renamed from: z  reason: collision with root package name */
    public final f f793z;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.f793z = fVar;
        this.A = hVar;
    }

    public final boolean d(h hVar) {
        return this.f793z.d(hVar);
    }

    public final boolean e(f fVar, MenuItem menuItem) {
        return super.e(fVar, menuItem) || this.f793z.e(fVar, menuItem);
    }

    public final boolean f(h hVar) {
        return this.f793z.f(hVar);
    }

    public final MenuItem getItem() {
        return this.A;
    }

    public final String j() {
        h hVar = this.A;
        int i8 = hVar != null ? hVar.f748a : 0;
        if (i8 == 0) {
            return null;
        }
        return q.a("android:menu:actionviewstates:", i8);
    }

    public final f k() {
        return this.f793z.k();
    }

    public final boolean m() {
        return this.f793z.m();
    }

    public final boolean n() {
        return this.f793z.n();
    }

    public final boolean o() {
        return this.f793z.o();
    }

    public final void setGroupDividerEnabled(boolean z10) {
        this.f793z.setGroupDividerEnabled(z10);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        w(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z10) {
        this.f793z.setQwertyMode(z10);
    }

    public final SubMenu setHeaderIcon(int i8) {
        w(0, (CharSequence) null, i8, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i8) {
        w(i8, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i8) {
        this.A.setIcon(i8);
        return this;
    }
}
