package ec;

import android.widget.ProgressBar;
import androidx.lifecycle.w;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import nb.a;
import sf.j;

public final /* synthetic */ class b implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f7911a;

    public /* synthetic */ b(e eVar) {
        this.f7911a = eVar;
    }

    public final void b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        int i8 = e.G0;
        e eVar = this.f7911a;
        j.f(eVar, "this$0");
        ProgressBar progressBar = (ProgressBar) eVar.u0(R.id.progressBar);
        j.e(progressBar, "progressBar");
        progressBar.setVisibility(8);
        if (!(arrayList == null || arrayList.isEmpty())) {
            fc.b bVar = (fc.b) eVar.E0.getValue();
            if (arrayList != null) {
                ArrayList<a> arrayList2 = bVar.f8681e;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            }
            bVar.g();
        }
    }
}
