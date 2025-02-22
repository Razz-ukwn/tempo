package yb;

import android.os.Bundle;
import androidx.appcompat.app.c;
import gc.b;
import gc.e;
import java.util.LinkedHashMap;
import sf.j;

public abstract class a extends c {
    public a() {
        new LinkedHashMap();
    }

    public abstract int M();

    public void N() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(M());
        N();
        b.q(bundle, this);
    }

    public final void onDestroy() {
        String str;
        super.onDestroy();
        b.d();
        e eVar = b.f8931a;
        if (eVar.f8941b && (str = (String) eVar.f8948i.remove(this)) != null) {
            eVar.f8947h.remove(str);
            eVar.f8950k.edit().remove(String.format("bundle_%s", new Object[]{str})).apply();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        j.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        b.r(bundle, this);
        bundle.clear();
    }
}
