package le;

import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.m;
import java.util.List;
import ke.f;
import me.e;
import sf.j;

public final class h<T> implements w<List<? extends e>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f11090a;

    public h(j jVar) {
        this.f11090a = jVar;
    }

    public final void b(Object obj) {
        List<e> list = (List) obj;
        j.e(list, "data");
        int i8 = j.G0;
        j jVar = this.f11090a;
        if (jVar.f2066d0 != null) {
            boolean z10 = true;
            if (!list.isEmpty()) {
                TextView textView = jVar.f11093x0;
                if (textView != null) {
                    textView.setVisibility(8);
                    RecyclerView recyclerView = jVar.f11092w0;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        f fVar = jVar.A0;
                        if (fVar == null) {
                            Context e02 = jVar.e0();
                            m mVar = jVar.C0;
                            if (mVar != null) {
                                if (jVar.D0 != 1 || !je.e.f10001i) {
                                    z10 = false;
                                }
                                f fVar2 = new f(e02, mVar, list, z10);
                                jVar.A0 = fVar2;
                                RecyclerView recyclerView2 = jVar.f11092w0;
                                if (recyclerView2 != null) {
                                    recyclerView2.setAdapter(fVar2);
                                    f fVar3 = jVar.A0;
                                    if (fVar3 != null) {
                                        fVar3.f10439e = jVar;
                                        return;
                                    }
                                    return;
                                }
                                j.l("recyclerView");
                                throw null;
                            }
                            j.l("mGlideRequestManager");
                            throw null;
                        }
                        fVar.D = list;
                        if (fVar != null) {
                            fVar.g();
                            return;
                        }
                        return;
                    }
                    j.l("recyclerView");
                    throw null;
                }
                j.l("emptyView");
                throw null;
            }
            TextView textView2 = jVar.f11093x0;
            if (textView2 != null) {
                textView2.setVisibility(0);
                RecyclerView recyclerView3 = jVar.f11092w0;
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(8);
                } else {
                    j.l("recyclerView");
                    throw null;
                }
            } else {
                j.l("emptyView");
                throw null;
            }
        }
    }
}
