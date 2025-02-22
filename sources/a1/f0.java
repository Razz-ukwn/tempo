package a1;

import android.view.Choreographer;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import ff.d;
import java.util.ArrayList;
import sf.j;
import x0.a;
import x0.h;

public final class f0 implements t {

    /* renamed from: a  reason: collision with root package name */
    public final View f29a;

    /* renamed from: b  reason: collision with root package name */
    public final n f30b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f31c = d0.f27a;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f32d = e0.f28a;

    /* renamed from: e  reason: collision with root package name */
    public final y f33e = new y(new a(""), h.f16906b, (h) null);

    /* renamed from: f  reason: collision with root package name */
    public final h f34f = h.f37f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f35g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final d f36h = b7.a.w(new b0(this));

    public f0(AndroidComposeView androidComposeView, n nVar) {
        j.f(androidComposeView, "view");
        new m(androidComposeView);
        j.e(Choreographer.getInstance(), "getInstance()");
        this.f29a = androidComposeView;
        this.f30b = nVar;
    }
}
