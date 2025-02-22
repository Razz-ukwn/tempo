package zd;

import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.fragment.app.p;
import bc.e;
import com.quickkonnect.silencio.R;
import ff.m;
import rf.a;
import sf.j;

public final class d {
    public static final b a(p pVar) {
        j.f(pVar, "<this>");
        b.a aVar = new b.a(pVar.e0(), R.style.Custom_Loading_Dialog);
        AlertController.b bVar = aVar.f681a;
        bVar.f675p = null;
        bVar.f674o = R.layout.loading_dialog;
        bVar.f671k = false;
        return aVar.a();
    }

    public static final int b(p pVar) {
        j.f(pVar, "<this>");
        return pVar.v().getDimensionPixelSize(pVar.v().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = r1.getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.fragment.app.p r1) {
        /*
            java.lang.String r0 = "<this>"
            sf.j.f(r1, r0)
            androidx.fragment.app.x r1 = r1.o()
            if (r1 == 0) goto L_0x0016
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L_0x0016
            android.view.View r1 = r1.getDecorView()
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 != 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            r0 = 9472(0x2500, float:1.3273E-41)
            r1.setSystemUiVisibility(r0)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.d.c(androidx.fragment.app.p):void");
    }

    public static final void d(p pVar, String str, String str2, String str3, String str4, boolean z10, a<m> aVar, a<m> aVar2) {
        j.f(pVar, "<this>");
        j.f(str2, "message");
        j.f(aVar, "onPositiveClick");
        j.f(aVar2, "onNegativeClick");
        b.a aVar3 = new b.a(pVar.e0());
        AlertController.b bVar = aVar3.f681a;
        bVar.f664d = str;
        bVar.f666f = str2;
        e eVar = new e(aVar, 2);
        bVar.f667g = str3;
        bVar.f668h = eVar;
        if (z10) {
            vd.a aVar4 = new vd.a(aVar2, 1);
            bVar.f669i = str4;
            bVar.f670j = aVar4;
        }
        try {
            aVar3.a().show();
        } catch (Exception e10) {
            bh.a.f3654a.c(e10);
        }
    }
}
