package r3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.quickkonnect.silencio.R;

public final class b0 extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13803a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f13804b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f13805c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c0 f13806d;

    public b0(c0 c0Var, ViewGroup viewGroup, View view, View view2) {
        this.f13806d = c0Var;
        this.f13803a = viewGroup;
        this.f13804b = view;
        this.f13805c = view2;
    }

    public final void a() {
        ((ViewGroupOverlay) new s(this.f13803a).f13862a).remove(this.f13804b);
    }

    public final void c(k kVar) {
        this.f13805c.setTag(R.id.save_overlay_view, (Object) null);
        ((ViewGroupOverlay) new s(this.f13803a).f13862a).remove(this.f13804b);
        kVar.z(this);
    }

    public final void d() {
        View view = this.f13804b;
        if (view.getParent() == null) {
            ((ViewGroupOverlay) new s(this.f13803a).f13862a).add(view);
        } else {
            this.f13806d.cancel();
        }
    }
}
