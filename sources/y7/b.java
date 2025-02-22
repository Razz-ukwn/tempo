package y7;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17305a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f17306b;

    public class a extends FloatingActionButton.a {
        public a() {
        }

        public final void b() {
            BottomAppBar bottomAppBar = b.this.f17306b;
            int i8 = BottomAppBar.F0;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i8) {
        this.f17306b = bottomAppBar;
        this.f17305a = i8;
    }

    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f17306b.z(this.f17305a));
        floatingActionButton.k(new a(), true);
    }
}
