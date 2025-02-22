package yb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import gc.e;
import java.util.LinkedHashMap;
import sf.j;

public abstract class b extends p {

    /* renamed from: v0  reason: collision with root package name */
    public final LinkedHashMap f17328v0 = new LinkedHashMap();

    public void F(Bundle bundle) {
        this.f2062b0 = true;
        q0();
    }

    public void J(Bundle bundle) {
        super.J(bundle);
        gc.b.q(bundle, this);
        if (bundle != null) {
            bundle.clear();
        }
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        o0();
        return layoutInflater.inflate(p0(), viewGroup, false);
    }

    public final void M() {
        String str;
        this.f2062b0 = true;
        gc.b.d();
        e eVar = gc.b.f8931a;
        if (eVar.f8941b && (str = (String) eVar.f8948i.remove(this)) != null) {
            eVar.f8947h.remove(str);
            eVar.f8950k.edit().remove(String.format("bundle_%s", new Object[]{str})).apply();
        }
    }

    public void N() {
        this.f2062b0 = true;
        n0();
    }

    public final void W(Bundle bundle) {
        gc.b.r(bundle, this);
        bundle.clear();
    }

    public void n0() {
        this.f17328v0.clear();
    }

    public void o0() {
    }

    public abstract int p0();

    public void q0() {
    }
}
