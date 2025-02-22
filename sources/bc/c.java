package bc;

import androidx.activity.result.a;
import androidx.activity.result.b;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jf.d;
import jf.f;
import sf.j;
import yb.e;

public final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3611a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f3612b;

    public /* synthetic */ c(e eVar, int i8) {
        this.f3611a = i8;
        this.f3612b = eVar;
    }

    public final void a(Object obj) {
        boolean z10;
        int i8 = this.f3611a;
        e eVar = this.f3612b;
        switch (i8) {
            case 0:
                f fVar = (f) eVar;
                int i10 = f.F0;
                j.f(fVar, "this$0");
                Set entrySet = ((Map) obj).entrySet();
                boolean z11 = true;
                if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
                    Iterator it = entrySet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                z10 = true;
                                continue;
                            } else {
                                z10 = false;
                                continue;
                            }
                            if (!z10) {
                                z11 = false;
                            }
                        }
                    }
                }
                if (z11) {
                    i iVar = (i) fVar.s0();
                    iVar.getClass();
                    cb.b.D(gc.b.o(iVar), (f.b) null, 0, new h(iVar, (d<? super h>) null), 3);
                    return;
                }
                b.a aVar = new b.a(fVar.e0(), R.style.dialogTheme);
                AlertController.b bVar = aVar.f681a;
                bVar.f666f = bVar.f661a.getText(R.string.storage_permission_rational);
                bVar.f671k = false;
                d dVar = new d(fVar);
                bVar.f667g = bVar.f661a.getText(R.string.ok);
                bVar.f668h = dVar;
                e eVar2 = new e(fVar, 0);
                bVar.f669i = bVar.f661a.getText(R.string.cancel);
                bVar.f670j = eVar2;
                androidx.appcompat.app.b a10 = aVar.a();
                a10.setCancelable(false);
                a10.show();
                return;
            default:
                ec.e eVar3 = (ec.e) eVar;
                a aVar2 = (a) obj;
                int i11 = ec.e.G0;
                j.f(eVar3, "this$0");
                eVar3.v0();
                return;
        }
    }
}
