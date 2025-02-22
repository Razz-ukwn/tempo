package o8;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.h1;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import h.f;
import java.util.WeakHashMap;
import m8.s;
import v8.i;
import w1.a;

public abstract class g extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final c f12237a;

    /* renamed from: b  reason: collision with root package name */
    public final d f12238b;

    /* renamed from: c  reason: collision with root package name */
    public final e f12239c;

    /* renamed from: d  reason: collision with root package name */
    public f f12240d;

    /* renamed from: e  reason: collision with root package name */
    public b f12241e;

    public interface a {
    }

    public interface b {
    }

    public static class c extends k2.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f12242c;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new c[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeBundle(this.f12242c);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12242c = parcel.readBundle(classLoader == null ? c.class.getClassLoader() : classLoader);
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.bottomNavigationStyle, 2132017999), attributeSet, R.attr.bottomNavigationStyle);
        e eVar = new e();
        this.f12239c = eVar;
        Context context2 = getContext();
        h1 e10 = s.e(context2, attributeSet, n2.f451b0, R.attr.bottomNavigationStyle, 2132017999, 10, 9);
        c cVar = new c(context2, getClass(), getMaxItemCount());
        this.f12237a = cVar;
        z7.b bVar = new z7.b(context2);
        this.f12238b = bVar;
        eVar.f12231a = bVar;
        eVar.f12233c = 1;
        bVar.setPresenter(eVar);
        cVar.b(eVar, cVar.f722a);
        getContext();
        eVar.f12231a.f12226b0 = cVar;
        if (e10.l(5)) {
            bVar.setIconTintList(e10.b(5));
        } else {
            bVar.setIconTintList(bVar.c());
        }
        setItemIconSize(e10.d(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (e10.l(10)) {
            setItemTextAppearanceInactive(e10.i(10, 0));
        }
        if (e10.l(9)) {
            setItemTextAppearanceActive(e10.i(9, 0));
        }
        if (e10.l(11)) {
            setItemTextColor(e10.b(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            v8.f fVar = new v8.f();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                fVar.m(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            fVar.j(context2);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.q(this, fVar);
        }
        if (e10.l(7)) {
            setItemPaddingTop(e10.d(7, 0));
        }
        if (e10.l(6)) {
            setItemPaddingBottom(e10.d(6, 0));
        }
        if (e10.l(1)) {
            setElevation((float) e10.d(1, 0));
        }
        a.b.h(getBackground().mutate(), r8.c.b(context2, e10, 0));
        setLabelVisibilityMode(e10.f1015b.getInteger(12, -1));
        int i8 = e10.i(3, 0);
        if (i8 != 0) {
            bVar.setItemBackgroundRes(i8);
        } else {
            setItemRippleColor(r8.c.b(context2, e10, 8));
        }
        int i10 = e10.i(2, 0);
        if (i10 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i10, n2.f449a0);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(r8.c.a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(new i(i.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new v8.a((float) 0))));
            obtainStyledAttributes.recycle();
        }
        if (e10.l(13)) {
            int i11 = e10.i(13, 0);
            eVar.f12232b = true;
            getMenuInflater().inflate(i11, cVar);
            eVar.f12232b = false;
            eVar.d(true);
        }
        e10.n();
        addView(bVar);
        cVar.f726e = new f((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f12240d == null) {
            this.f12240d = new f(getContext());
        }
        return this.f12240d;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f12238b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f12238b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f12238b.getItemActiveIndicatorMarginHorizontal();
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.f12238b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f12238b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f12238b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f12238b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f12238b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f12238b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f12238b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f12238b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f12238b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f12238b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f12238b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f12238b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f12238b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f12237a;
    }

    public k getMenuView() {
        return this.f12238b;
    }

    public e getPresenter() {
        return this.f12239c;
    }

    public int getSelectedItemId() {
        return this.f12238b.getSelectedItemId();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1.b.k(this);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f10267a);
        this.f12237a.t(cVar.f12242c);
    }

    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        cVar.f12242c = bundle;
        this.f12237a.v(bundle);
        return cVar;
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        b1.b.i(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f12238b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f12238b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i8) {
        this.f12238b.setItemActiveIndicatorHeight(i8);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i8) {
        this.f12238b.setItemActiveIndicatorMarginHorizontal(i8);
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.f12238b.setItemActiveIndicatorShapeAppearance(iVar);
    }

    public void setItemActiveIndicatorWidth(int i8) {
        this.f12238b.setItemActiveIndicatorWidth(i8);
    }

    public void setItemBackground(Drawable drawable) {
        this.f12238b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i8) {
        this.f12238b.setItemBackgroundRes(i8);
    }

    public void setItemIconSize(int i8) {
        this.f12238b.setItemIconSize(i8);
    }

    public void setItemIconSizeRes(int i8) {
        setItemIconSize(getResources().getDimensionPixelSize(i8));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f12238b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i8) {
        this.f12238b.setItemPaddingBottom(i8);
    }

    public void setItemPaddingTop(int i8) {
        this.f12238b.setItemPaddingTop(i8);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f12238b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i8) {
        this.f12238b.setItemTextAppearanceActive(i8);
    }

    public void setItemTextAppearanceInactive(int i8) {
        this.f12238b.setItemTextAppearanceInactive(i8);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f12238b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i8) {
        d dVar = this.f12238b;
        if (dVar.getLabelVisibilityMode() != i8) {
            dVar.setLabelVisibilityMode(i8);
            this.f12239c.d(false);
        }
    }

    public void setOnItemReselectedListener(a aVar) {
    }

    public void setOnItemSelectedListener(b bVar) {
        this.f12241e = bVar;
    }

    public void setSelectedItemId(int i8) {
        c cVar = this.f12237a;
        MenuItem findItem = cVar.findItem(i8);
        if (findItem != null && !cVar.q(findItem, this.f12239c, 0)) {
            findItem.setChecked(true);
        }
    }
}
