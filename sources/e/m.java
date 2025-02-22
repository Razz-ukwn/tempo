package e;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.k;
import d2.o;
import e.r;

public class m extends k implements d {

    /* renamed from: d  reason: collision with root package name */
    public f f7683d;

    /* renamed from: e  reason: collision with root package name */
    public final l f7684e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903526(0x7f0301e6, float:1.7413872E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            e.l r2 = new e.l
            r2.<init>(r4)
            r4.f7684e = r2
            e.e r2 = r4.e()
            if (r6 != 0) goto L_0x0034
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0034:
            r5 = r2
            e.f r5 = (e.f) r5
            r5.f7637q0 = r6
            r2.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m.<init>(android.content.Context, int):void");
    }

    public final void D() {
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().c(view, layoutParams);
    }

    public final void dismiss() {
        super.dismiss();
        e().o();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return o.b(this.f7684e, getWindow().getDecorView(), this, keyEvent);
    }

    public final e e() {
        if (this.f7683d == null) {
            r.a aVar = e.f7616a;
            this.f7683d = new f(getContext(), getWindow(), this, this);
        }
        return this.f7683d;
    }

    /* access modifiers changed from: package-private */
    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final <T extends View> T findViewById(int i8) {
        return e().e(i8);
    }

    public final void invalidateOptionsMenu() {
        e().k();
    }

    public void onCreate(Bundle bundle) {
        e().j();
        super.onCreate(bundle);
        e().n();
    }

    public final void onStop() {
        super.onStop();
        e().r();
    }

    public void setContentView(int i8) {
        e().u(i8);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().z(charSequence);
    }

    public final void t() {
    }

    public final void z() {
    }

    public void setContentView(View view) {
        e().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().w(view, layoutParams);
    }

    public final void setTitle(int i8) {
        super.setTitle(i8);
        e().z(getContext().getString(i8));
    }
}
