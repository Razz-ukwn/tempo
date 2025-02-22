package ec;

import android.os.Bundle;
import androidx.fragment.app.i0;
import androidx.fragment.app.j0;
import androidx.fragment.app.x;
import com.quickkonnect.silencio.R;
import ff.m;
import nb.a;
import rf.l;
import sf.i;
import sf.j;

public final /* synthetic */ class d extends i implements l<a, m> {
    public d(e eVar) {
        super(1, (Object) eVar, e.class, "onItemClick", "onItemClick(Lcom/lassi/data/media/MiItemMedia;)V");
    }

    public final Object invoke(Object obj) {
        j0 I;
        a aVar = (a) obj;
        j.f(aVar, "p0");
        int i8 = e.G0;
        x o10 = ((e) this.f14944b).o();
        if (!(o10 == null || (I = o10.I()) == null)) {
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a((i0) I);
            aVar2.f2107b = R.anim.right_in;
            aVar2.f2108c = R.anim.right_out;
            aVar2.f2109d = R.anim.right_in;
            aVar2.f2110e = R.anim.right_out;
            cc.a aVar3 = new cc.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("selectedFolder", aVar);
            aVar3.h0(bundle);
            aVar2.d(R.id.ftContainer, aVar3, (String) null, 1);
            aVar2.c(cc.a.class.getSimpleName());
            aVar2.h();
        }
        return m.f8717a;
    }
}
