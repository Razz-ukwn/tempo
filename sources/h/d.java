package h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.c;
import h.a;
import java.lang.ref.WeakReference;

public final class d extends a implements f.a {
    public WeakReference<View> B;
    public boolean C;
    public final f D;

    /* renamed from: c  reason: collision with root package name */
    public final Context f9012c;

    /* renamed from: d  reason: collision with root package name */
    public final ActionBarContextView f9013d;

    /* renamed from: e  reason: collision with root package name */
    public final a.C0162a f9014e;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0162a aVar) {
        this.f9012c = context;
        this.f9013d = actionBarContextView;
        this.f9014e = aVar;
        f fVar = new f(actionBarContextView.getContext());
        fVar.f733l = 1;
        this.D = fVar;
        fVar.f726e = this;
    }

    public final boolean a(f fVar, MenuItem menuItem) {
        return this.f9014e.c(this, menuItem);
    }

    public final void b(f fVar) {
        i();
        c cVar = this.f9013d.f920d;
        if (cVar != null) {
            cVar.n();
        }
    }

    public final void c() {
        if (!this.C) {
            this.C = true;
            this.f9014e.d(this);
        }
    }

    public final View d() {
        WeakReference<View> weakReference = this.B;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final f e() {
        return this.D;
    }

    public final MenuInflater f() {
        return new f(this.f9013d.getContext());
    }

    public final CharSequence g() {
        return this.f9013d.getSubtitle();
    }

    public final CharSequence h() {
        return this.f9013d.getTitle();
    }

    public final void i() {
        this.f9014e.a(this, this.D);
    }

    public final boolean j() {
        return this.f9013d.O;
    }

    public final void k(View view) {
        this.f9013d.setCustomView(view);
        this.B = view != null ? new WeakReference<>(view) : null;
    }

    public final void l(int i8) {
        m(this.f9012c.getString(i8));
    }

    public final void m(CharSequence charSequence) {
        this.f9013d.setSubtitle(charSequence);
    }

    public final void n(int i8) {
        o(this.f9012c.getString(i8));
    }

    public final void o(CharSequence charSequence) {
        this.f9013d.setTitle(charSequence);
    }

    public final void p(boolean z10) {
        this.f9005b = z10;
        this.f9013d.setTitleOptional(z10);
    }
}
