package e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import cb.e;
import e.f;

public abstract class a {

    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public abstract void f();

    public boolean g() {
        return false;
    }

    public abstract void h();

    public void i() {
    }

    public abstract boolean j(int i8, KeyEvent keyEvent);

    public boolean k(KeyEvent keyEvent) {
        return false;
    }

    public boolean l() {
        return false;
    }

    public abstract void m(boolean z10);

    public abstract void n(boolean z10);

    public abstract void o(Drawable drawable);

    public abstract void p(boolean z10);

    public abstract void q(int i8);

    public abstract void r(String str);

    public abstract void s(CharSequence charSequence);

    public abstract void t();

    public h.a u(f.d dVar) {
        return null;
    }

    /* renamed from: e.a$a  reason: collision with other inner class name */
    public static class C0126a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f7613a = 8388627;

        public C0126a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f3897c);
            this.f7613a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0126a() {
            super(-2, -2);
        }

        public C0126a(C0126a aVar) {
            super(aVar);
            this.f7613a = aVar.f7613a;
        }

        public C0126a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
