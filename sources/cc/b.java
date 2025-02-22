package cc;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.x;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import com.lassi.presentation.videopreview.VideoPreviewActivity;
import ff.m;
import java.io.File;
import java.util.ArrayList;
import q.g;
import rb.a;
import rf.l;
import sf.i;
import sf.j;

public final /* synthetic */ class b extends i implements l<ArrayList<nb.b>, m> {
    public b(a aVar) {
        super(1, (Object) aVar, a.class, "onItemClick", "onItemClick(Ljava/util/ArrayList;)V");
    }

    public final Object invoke(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        j.f(arrayList, "p0");
        a aVar = (a) this.f14944b;
        int i8 = a.C0;
        aVar.getClass();
        a aVar2 = a.V;
        int c3 = g.c(aVar2.F);
        if (c3 == 0) {
            int i10 = aVar2.G;
            if (i10 == 1 && aVar2.U) {
                String str = ((nb.b) arrayList.get(0)).f11620c;
                Uri fromFile = Uri.fromFile(str != null ? new File(str) : null);
                x d02 = aVar.d0();
                j.e(fromFile, "uri");
                gf.c(d02, fromFile);
            } else if (i10 > 1) {
                ((d) aVar.s0()).e(arrayList);
            } else {
                ((d) aVar.s0()).e(arrayList);
                Intent intent = new Intent();
                intent.putExtra("selected_media", arrayList);
                x o10 = aVar.o();
                if (o10 != null) {
                    o10.setResult(-1, intent);
                }
                x o11 = aVar.o();
                if (o11 != null) {
                    o11.finish();
                }
            }
        } else if (c3 == 1 || c3 == 2 || c3 == 3) {
            if (aVar2.G > 1) {
                ((d) aVar.s0()).e(arrayList);
            } else {
                int i11 = VideoPreviewActivity.X;
                x o12 = aVar.o();
                String str2 = ((nb.b) arrayList.get(0)).f11620c;
                j.c(str2);
                Intent intent2 = new Intent(o12, VideoPreviewActivity.class);
                intent2.putExtra("videoPath", str2);
                if (o12 != null) {
                    o12.startActivityForResult(intent2, 203);
                }
            }
        }
        return m.f8717a;
    }
}
