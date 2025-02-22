package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import d2.b;
import java.lang.reflect.Method;

public final class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final x1.b f9346d;

    /* renamed from: e  reason: collision with root package name */
    public Method f9347e;

    public class a extends d2.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f9348b;

        public a(ActionProvider actionProvider) {
            this.f9348b = actionProvider;
        }

        public final boolean a() {
            return this.f9348b.hasSubMenu();
        }

        public final View c() {
            return this.f9348b.onCreateActionView();
        }

        public final boolean e() {
            return this.f9348b.onPerformDefaultAction();
        }

        public final void f(m mVar) {
            this.f9348b.onPrepareSubMenu(c.this.e(mVar));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.a f9350d;

        public b(c cVar, ActionProvider actionProvider) {
            super(actionProvider);
        }

        public final boolean b() {
            return this.f9348b.isVisible();
        }

        public final View d(MenuItem menuItem) {
            return this.f9348b.onCreateActionView(menuItem);
        }

        public final boolean g() {
            return this.f9348b.overridesItemVisibility();
        }

        public final void h(h.a aVar) {
            this.f9350d = aVar;
            this.f9348b.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z10) {
            b.a aVar = this.f9350d;
            if (aVar != null) {
                f fVar = h.this.f760n;
                fVar.f729h = true;
                fVar.p(true);
            }
        }
    }

    /* renamed from: i.c$c  reason: collision with other inner class name */
    public static class C0168c extends FrameLayout implements h.b {

        /* renamed from: a  reason: collision with root package name */
        public final CollapsibleActionView f9351a;

        public C0168c(View view) {
            super(view.getContext());
            this.f9351a = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewCollapsed() {
            this.f9351a.onActionViewCollapsed();
        }

        public final void onActionViewExpanded() {
            this.f9351a.onActionViewExpanded();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f9352a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f9352a = onActionExpandListener;
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f9352a.onMenuItemActionCollapse(c.this.d(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f9352a.onMenuItemActionExpand(c.this.d(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f9354a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f9354a = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f9354a.onMenuItemClick(c.this.d(menuItem));
        }
    }

    public c(Context context, x1.b bVar) {
        super(context);
        if (bVar != null) {
            this.f9346d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f9346d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f9346d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        d2.b b10 = this.f9346d.b();
        if (b10 instanceof a) {
            return ((a) b10).f9348b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f9346d.getActionView();
        return actionView instanceof C0168c ? (View) ((C0168c) actionView).f9351a : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f9346d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f9346d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f9346d.getContentDescription();
    }

    public final int getGroupId() {
        return this.f9346d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f9346d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f9346d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f9346d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f9346d.getIntent();
    }

    public final int getItemId() {
        return this.f9346d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f9346d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f9346d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f9346d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f9346d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return e(this.f9346d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.f9346d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f9346d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f9346d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f9346d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f9346d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f9346d.isCheckable();
    }

    public final boolean isChecked() {
        return this.f9346d.isChecked();
    }

    public final boolean isEnabled() {
        return this.f9346d.isEnabled();
    }

    public final boolean isVisible() {
        return this.f9346d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, actionProvider);
        if (actionProvider == null) {
            bVar = null;
        }
        this.f9346d.a(bVar);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0168c(view);
        }
        this.f9346d.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f9346d.setAlphabeticShortcut(c3);
        return this;
    }

    public final MenuItem setCheckable(boolean z10) {
        this.f9346d.setCheckable(z10);
        return this;
    }

    public final MenuItem setChecked(boolean z10) {
        this.f9346d.setChecked(z10);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f9346d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z10) {
        this.f9346d.setEnabled(z10);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f9346d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9346d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9346d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f9346d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c3) {
        this.f9346d.setNumericShortcut(c3);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9346d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9346d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c3, char c10) {
        this.f9346d.setShortcut(c3, c10);
        return this;
    }

    public final void setShowAsAction(int i8) {
        this.f9346d.setShowAsAction(i8);
    }

    public final MenuItem setShowAsActionFlags(int i8) {
        this.f9346d.setShowAsActionFlags(i8);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9346d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9346d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f9346d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z10) {
        return this.f9346d.setVisible(z10);
    }

    public final MenuItem setAlphabeticShortcut(char c3, int i8) {
        this.f9346d.setAlphabeticShortcut(c3, i8);
        return this;
    }

    public final MenuItem setIcon(int i8) {
        this.f9346d.setIcon(i8);
        return this;
    }

    public final MenuItem setNumericShortcut(char c3, int i8) {
        this.f9346d.setNumericShortcut(c3, i8);
        return this;
    }

    public final MenuItem setShortcut(char c3, char c10, int i8, int i10) {
        this.f9346d.setShortcut(c3, c10, i8, i10);
        return this;
    }

    public final MenuItem setTitle(int i8) {
        this.f9346d.setTitle(i8);
        return this;
    }

    public final MenuItem setActionView(int i8) {
        x1.b bVar = this.f9346d;
        bVar.setActionView(i8);
        View actionView = bVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bVar.setActionView((View) new C0168c(actionView));
        }
        return this;
    }
}
