package pc;

import android.view.View;

public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0247a f12579a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12580b;

    /* renamed from: pc.a$a  reason: collision with other inner class name */
    public interface C0247a {
        void b(int i8);
    }

    public a(C0247a aVar, int i8) {
        this.f12579a = aVar;
        this.f12580b = i8;
    }

    public final void onClick(View view) {
        this.f12579a.b(this.f12580b);
    }
}
