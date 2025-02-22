package bc;

import android.content.Intent;
import androidx.fragment.app.x;
import cc.d;
import ff.m;
import java.util.ArrayList;
import nb.b;
import rb.a;
import rf.l;
import sf.i;
import sf.j;

public final /* synthetic */ class g extends i implements l<ArrayList<b>, m> {
    public g(f fVar) {
        super(1, (Object) fVar, f.class, "onItemClick", "onItemClick(Ljava/util/ArrayList;)V");
    }

    public final Object invoke(Object obj) {
        ArrayList<b> arrayList = (ArrayList) obj;
        j.f(arrayList, "p0");
        f fVar = (f) this.f14944b;
        int i8 = f.F0;
        fVar.getClass();
        a aVar = a.V;
        if (aVar.G > 1) {
            aVar.E = arrayList;
            ((d) fVar.A0.getValue()).e(arrayList);
        } else {
            Intent intent = new Intent();
            intent.putExtra("selected_media", arrayList);
            x o10 = fVar.o();
            if (o10 != null) {
                o10.setResult(-1, intent);
            }
            x o11 = fVar.o();
            if (o11 != null) {
                o11.finish();
            }
        }
        return m.f8717a;
    }
}
