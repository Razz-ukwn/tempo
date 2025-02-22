package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;
import com.quickkonnect.silencio.R;

public abstract class a implements j {
    public final int B = R.layout.abc_action_menu_layout;
    public final int C = R.layout.abc_action_menu_item_layout;
    public k D;
    public int E;

    /* renamed from: a  reason: collision with root package name */
    public final Context f690a;

    /* renamed from: b  reason: collision with root package name */
    public Context f691b;

    /* renamed from: c  reason: collision with root package name */
    public f f692c;

    /* renamed from: d  reason: collision with root package name */
    public final LayoutInflater f693d;

    /* renamed from: e  reason: collision with root package name */
    public j.a f694e;

    public a(Context context) {
        this.f690a = context;
        this.f693d = LayoutInflater.from(context);
    }

    public final void f(j.a aVar) {
        this.f694e = aVar;
    }

    public final boolean g(h hVar) {
        return false;
    }

    public final int getId() {
        return this.E;
    }

    public final boolean m(h hVar) {
        return false;
    }
}
