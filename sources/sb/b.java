package sb;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.a;
import androidx.fragment.app.x;
import bc.f;
import java.util.ArrayList;
import java.util.Iterator;
import sf.j;
import yb.e;

public final /* synthetic */ class b implements androidx.activity.result.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14880a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f14881b;

    public /* synthetic */ b(e eVar, int i8) {
        this.f14880a = i8;
        this.f14881b = eVar;
    }

    public final void a(Object obj) {
        ArrayList parcelableArrayListExtra;
        ClipData clipData;
        int i8 = this.f14880a;
        e eVar = this.f14881b;
        switch (i8) {
            case 0:
                e eVar2 = (e) eVar;
                a aVar = (a) obj;
                int i10 = e.C0;
                j.f(eVar2, "this$0");
                eVar2.y0();
                return;
            default:
                f fVar = (f) eVar;
                a aVar2 = (a) obj;
                int i11 = f.F0;
                j.f(fVar, "this$0");
                if (aVar2.f609a == -1) {
                    ArrayList arrayList = new ArrayList();
                    Intent intent = aVar2.f610b;
                    if (intent != null) {
                        if (intent.getDataString() != null) {
                            arrayList.add(intent.getDataString());
                        } else if (!(intent.getClipData() == null || (clipData = intent.getClipData()) == null)) {
                            int itemCount = clipData.getItemCount();
                            for (int i12 = 0; i12 < itemCount; i12++) {
                                arrayList.add(clipData.getItemAt(i12).getUri().toString());
                            }
                        }
                        if (intent.hasExtra("uris") && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("uris")) != null) {
                            int size = parcelableArrayListExtra.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                arrayList.add(((Uri) parcelableArrayListExtra.get(i13)).toString());
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        rb.a aVar3 = rb.a.V;
                        if (aVar3.G >= arrayList.size()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new nb.b(0, (String) null, (String) it.next(), 0, (String) null, 0, true, 59));
                            }
                        } else {
                            int i14 = aVar3.G;
                            for (int i15 = 0; i15 < i14; i15++) {
                                nb.b bVar = r7;
                                nb.b bVar2 = new nb.b(0, (String) null, (String) arrayList.get(i15), 0, (String) null, 0, true, 59);
                                arrayList2.add(bVar);
                            }
                        }
                        Intent intent2 = new Intent();
                        intent2.putExtra("selected_media", arrayList2);
                        x o10 = fVar.o();
                        if (o10 != null) {
                            o10.setResult(-1, intent2);
                        }
                        x o11 = fVar.o();
                        if (o11 != null) {
                            o11.finish();
                            return;
                        }
                        return;
                    }
                    return;
                }
                x o12 = fVar.o();
                if (o12 != null) {
                    o12.onBackPressed();
                    return;
                }
                return;
        }
    }
}
