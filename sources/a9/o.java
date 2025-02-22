package a9;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.a;
import e2.d;
import e2.i;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f164a;

    /* renamed from: b  reason: collision with root package name */
    public final a f165b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f166c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f167d;

    public o(a aVar) {
        this.f164a = aVar.f6209a;
        this.f165b = aVar;
        this.f166c = aVar.getContext();
        this.f167d = aVar.C;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public d h() {
        return null;
    }

    public boolean i(int i8) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof n;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(i iVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }

    public final void q() {
        this.f165b.e(false);
    }

    public void r() {
    }

    public void s() {
    }
}
