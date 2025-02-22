package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import d2.b;
import java.util.ArrayList;
import w1.a;
import x1.b;

public final class h implements b {
    public d2.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f748a;

    /* renamed from: b  reason: collision with root package name */
    public final int f749b;

    /* renamed from: c  reason: collision with root package name */
    public final int f750c;

    /* renamed from: d  reason: collision with root package name */
    public final int f751d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f752e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f753f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f754g;

    /* renamed from: h  reason: collision with root package name */
    public char f755h;

    /* renamed from: i  reason: collision with root package name */
    public int f756i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f757j;

    /* renamed from: k  reason: collision with root package name */
    public int f758k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f759l;
    public int m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final f f760n;

    /* renamed from: o  reason: collision with root package name */
    public m f761o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f762p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f763q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f764r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f765s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f766t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f767u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f768v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f769w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f770x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f771y;

    /* renamed from: z  reason: collision with root package name */
    public View f772z;

    public class a implements b.a {
        public a() {
        }
    }

    public h(f fVar, int i8, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f760n = fVar;
        this.f748a = i10;
        this.f749b = i8;
        this.f750c = i11;
        this.f751d = i12;
        this.f752e = charSequence;
        this.f771y = i13;
    }

    public static void c(int i8, int i10, String str, StringBuilder sb2) {
        if ((i8 & i10) == i10) {
            sb2.append(str);
        }
    }

    public final x1.b a(d2.b bVar) {
        d2.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f7189a = null;
        }
        this.f772z = null;
        this.A = bVar;
        this.f760n.p(true);
        d2.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    public final d2.b b() {
        return this.A;
    }

    public final boolean collapseActionView() {
        if ((this.f771y & 8) == 0) {
            return false;
        }
        if (this.f772z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f760n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f769w && (this.f767u || this.f768v)) {
            drawable = drawable.mutate();
            if (this.f767u) {
                a.b.h(drawable, this.f765s);
            }
            if (this.f768v) {
                a.b.i(drawable, this.f766t);
            }
            this.f769w = false;
        }
        return drawable;
    }

    public final boolean e() {
        d2.b bVar;
        if ((this.f771y & 8) == 0) {
            return false;
        }
        if (this.f772z == null && (bVar = this.A) != null) {
            this.f772z = bVar.d(this);
        }
        return this.f772z != null;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f760n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        this.f770x = (z10 ? 4 : 0) | (this.f770x & -5);
    }

    public final void g(boolean z10) {
        if (z10) {
            this.f770x |= 32;
        } else {
            this.f770x &= -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f772z;
        if (view != null) {
            return view;
        }
        d2.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.f772z = d10;
        return d10;
    }

    public final int getAlphabeticModifiers() {
        return this.f758k;
    }

    public final char getAlphabeticShortcut() {
        return this.f757j;
    }

    public final CharSequence getContentDescription() {
        return this.f763q;
    }

    public final int getGroupId() {
        return this.f749b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f759l;
        if (drawable != null) {
            return d(drawable);
        }
        int i8 = this.m;
        if (i8 == 0) {
            return null;
        }
        Drawable a10 = f.a.a(this.f760n.f722a, i8);
        this.m = 0;
        this.f759l = a10;
        return d(a10);
    }

    public final ColorStateList getIconTintList() {
        return this.f765s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f766t;
    }

    public final Intent getIntent() {
        return this.f754g;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f748a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f756i;
    }

    public final char getNumericShortcut() {
        return this.f755h;
    }

    public final int getOrder() {
        return this.f750c;
    }

    public final SubMenu getSubMenu() {
        return this.f761o;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f752e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f753f;
        return charSequence != null ? charSequence : this.f752e;
    }

    public final CharSequence getTooltipText() {
        return this.f764r;
    }

    public final boolean hasSubMenu() {
        return this.f761o != null;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        return (this.f770x & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f770x & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f770x & 16) != 0;
    }

    public final boolean isVisible() {
        d2.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f770x & 8) == 0 : (this.f770x & 8) == 0 && this.A.b();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(View view) {
        int i8;
        this.f772z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i8 = this.f748a) > 0) {
            view.setId(i8);
        }
        f fVar = this.f760n;
        fVar.f732k = true;
        fVar.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f757j == c3) {
            return this;
        }
        this.f757j = Character.toLowerCase(c3);
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z10) {
        int i8 = this.f770x;
        boolean z11 = z10 | (i8 & true);
        this.f770x = z11 ? 1 : 0;
        if (i8 != z11) {
            this.f760n.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z10) {
        int i8 = this.f770x;
        int i10 = i8 & 4;
        f fVar = this.f760n;
        int i11 = 2;
        if (i10 != 0) {
            fVar.getClass();
            ArrayList<h> arrayList = fVar.f727f;
            int size = arrayList.size();
            fVar.y();
            for (int i12 = 0; i12 < size; i12++) {
                h hVar = arrayList.get(i12);
                if (hVar.f749b == this.f749b) {
                    boolean z11 = true;
                    if (((hVar.f770x & 4) != 0) && hVar.isCheckable()) {
                        if (hVar != this) {
                            z11 = false;
                        }
                        int i13 = hVar.f770x;
                        int i14 = (z11 ? 2 : 0) | (i13 & -3);
                        hVar.f770x = i14;
                        if (i13 != i14) {
                            hVar.f760n.p(false);
                        }
                    }
                }
            }
            fVar.x();
        } else {
            int i15 = i8 & -3;
            if (!z10) {
                i11 = 0;
            }
            int i16 = i11 | i15;
            this.f770x = i16;
            if (i8 != i16) {
                fVar.p(false);
            }
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f770x |= 16;
        } else {
            this.f770x &= -17;
        }
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.f759l = drawable;
        this.f769w = true;
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f765s = colorStateList;
        this.f767u = true;
        this.f769w = true;
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f766t = mode;
        this.f768v = true;
        this.f769w = true;
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f754g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c3) {
        if (this.f755h == c3) {
            return this;
        }
        this.f755h = c3;
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f762p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c3, char c10) {
        this.f755h = c3;
        this.f757j = Character.toLowerCase(c10);
        this.f760n.p(false);
        return this;
    }

    public final void setShowAsAction(int i8) {
        int i10 = i8 & 3;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.f771y = i8;
            f fVar = this.f760n;
            fVar.f732k = true;
            fVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f752e = charSequence;
        this.f760n.p(false);
        m mVar = this.f761o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f753f = charSequence;
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z10) {
        int i8 = this.f770x;
        boolean z11 = false;
        int i10 = (z10 ? 0 : 8) | (i8 & -9);
        this.f770x = i10;
        if (i8 != i10) {
            z11 = true;
        }
        if (z11) {
            f fVar = this.f760n;
            fVar.f729h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f752e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final x1.b setContentDescription(CharSequence charSequence) {
        this.f763q = charSequence;
        this.f760n.p(false);
        return this;
    }

    public final x1.b setTooltipText(CharSequence charSequence) {
        this.f764r = charSequence;
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c3, int i8) {
        if (this.f757j == c3 && this.f758k == i8) {
            return this;
        }
        this.f757j = Character.toLowerCase(c3);
        this.f758k = KeyEvent.normalizeMetaState(i8);
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c3, int i8) {
        if (this.f755h == c3 && this.f756i == i8) {
            return this;
        }
        this.f755h = c3;
        this.f756i = KeyEvent.normalizeMetaState(i8);
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c3, char c10, int i8, int i10) {
        this.f755h = c3;
        this.f756i = KeyEvent.normalizeMetaState(i8);
        this.f757j = Character.toLowerCase(c10);
        this.f758k = KeyEvent.normalizeMetaState(i10);
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setIcon(int i8) {
        this.f759l = null;
        this.m = i8;
        this.f769w = true;
        this.f760n.p(false);
        return this;
    }

    public final MenuItem setTitle(int i8) {
        setTitle((CharSequence) this.f760n.f722a.getString(i8));
        return this;
    }

    public final MenuItem setActionView(int i8) {
        int i10;
        f fVar = this.f760n;
        Context context = fVar.f722a;
        View inflate = LayoutInflater.from(context).inflate(i8, new LinearLayout(context), false);
        this.f772z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f748a) > 0) {
            inflate.setId(i10);
        }
        fVar.f732k = true;
        fVar.p(true);
        return this;
    }
}
