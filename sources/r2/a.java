package r2;

import android.widget.EditText;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0258a f13768a;

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    public static class C0258a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f13769a;

        /* renamed from: b  reason: collision with root package name */
        public final g f13770b;

        public C0258a(EditText editText) {
            this.f13769a = editText;
            g gVar = new g(editText);
            this.f13770b = gVar;
            editText.addTextChangedListener(gVar);
            if (b.f13772b == null) {
                synchronized (b.f13771a) {
                    if (b.f13772b == null) {
                        b.f13772b = new b();
                    }
                }
            }
            editText.setEditableFactory(b.f13772b);
        }
    }

    public static class b {
    }

    public a(EditText editText) {
        if (editText != null) {
            this.f13768a = new C0258a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}
