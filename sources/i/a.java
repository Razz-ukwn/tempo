package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import t1.a;
import w1.a;
import x1.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f9328a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f9329b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f9330c;

    /* renamed from: d  reason: collision with root package name */
    public char f9331d;

    /* renamed from: e  reason: collision with root package name */
    public int f9332e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f9333f;

    /* renamed from: g  reason: collision with root package name */
    public int f9334g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f9335h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f9336i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f9337j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f9338k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f9339l = null;
    public PorterDuff.Mode m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9340n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9341o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f9342p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f9336i = context;
        this.f9328a = charSequence;
    }

    public final b a(d2.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final d2.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f9335h;
        if (drawable == null) {
            return;
        }
        if (this.f9340n || this.f9341o) {
            this.f9335h = drawable;
            Drawable mutate = drawable.mutate();
            this.f9335h = mutate;
            if (this.f9340n) {
                a.b.h(mutate, this.f9339l);
            }
            if (this.f9341o) {
                a.b.i(this.f9335h, this.m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f9334g;
    }

    public final char getAlphabeticShortcut() {
        return this.f9333f;
    }

    public final CharSequence getContentDescription() {
        return this.f9337j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f9335h;
    }

    public final ColorStateList getIconTintList() {
        return this.f9339l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    public final Intent getIntent() {
        return this.f9330c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f9332e;
    }

    public final char getNumericShortcut() {
        return this.f9331d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f9328a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9329b;
        return charSequence != null ? charSequence : this.f9328a;
    }

    public final CharSequence getTooltipText() {
        return this.f9338k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f9342p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f9342p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f9342p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f9342p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f9333f = Character.toLowerCase(c3);
        return this;
    }

    public final MenuItem setCheckable(boolean z10) {
        this.f9342p = z10 | (this.f9342p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z10) {
        this.f9342p = (z10 ? 2 : 0) | (this.f9342p & -3);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f9337j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z10) {
        this.f9342p = (z10 ? 16 : 0) | (this.f9342p & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f9335h = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9339l = colorStateList;
        this.f9340n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.f9341o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f9330c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c3) {
        this.f9331d = c3;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c3, char c10) {
        this.f9331d = c3;
        this.f9333f = Character.toLowerCase(c10);
        return this;
    }

    public final void setShowAsAction(int i8) {
    }

    public final MenuItem setShowAsActionFlags(int i8) {
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9328a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9329b = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f9338k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z10) {
        int i8 = 8;
        int i10 = this.f9342p & 8;
        if (z10) {
            i8 = 0;
        }
        this.f9342p = i10 | i8;
        return this;
    }

    public final MenuItem setActionView(int i8) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c3, int i8) {
        this.f9333f = Character.toLowerCase(c3);
        this.f9334g = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final b m20setContentDescription(CharSequence charSequence) {
        this.f9337j = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c3, int i8) {
        this.f9331d = c3;
        this.f9332e = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    public final MenuItem setTitle(int i8) {
        this.f9328a = this.f9336i.getResources().getString(i8);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final b m21setTooltipText(CharSequence charSequence) {
        this.f9338k = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i8) {
        Object obj = t1.a.f15323a;
        this.f9335h = a.c.b(this.f9336i, i8);
        c();
        return this;
    }

    public final MenuItem setShortcut(char c3, char c10, int i8, int i10) {
        this.f9331d = c3;
        this.f9332e = KeyEvent.normalizeMetaState(i8);
        this.f9333f = Character.toLowerCase(c10);
        this.f9334g = KeyEvent.normalizeMetaState(i10);
        return this;
    }
}
