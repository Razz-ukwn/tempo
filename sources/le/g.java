package le;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.m;
import sf.j;

public final class g extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f11089a;

    public g(j jVar) {
        this.f11089a = jVar;
    }

    public final void a(int i8, RecyclerView recyclerView) {
        j.f(recyclerView, "recyclerView");
        if (i8 == 0) {
            j.o0(this.f11089a);
        }
    }

    public final void b(RecyclerView recyclerView, int i8, int i10) {
        j.f(recyclerView, "recyclerView");
        int abs = Math.abs(i10);
        j jVar = this.f11089a;
        if (abs > 30) {
            m mVar = jVar.C0;
            if (mVar != null) {
                mVar.m();
            } else {
                j.l("mGlideRequestManager");
                throw null;
            }
        } else {
            j.o0(jVar);
        }
    }
}
