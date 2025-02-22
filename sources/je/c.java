package je;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.m;
import droidninja.filepicker.MediaDetailsActivity;
import sf.j;

public final class c extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaDetailsActivity f9991a;

    public c(MediaDetailsActivity mediaDetailsActivity) {
        this.f9991a = mediaDetailsActivity;
    }

    public final void a(int i8, RecyclerView recyclerView) {
        j.f(recyclerView, "recyclerView");
        if (i8 == 0) {
            MediaDetailsActivity.O(this.f9991a);
        }
    }

    public final void b(RecyclerView recyclerView, int i8, int i10) {
        j.f(recyclerView, "recyclerView");
        int abs = Math.abs(i10);
        int i11 = MediaDetailsActivity.f7598f0;
        MediaDetailsActivity mediaDetailsActivity = this.f9991a;
        if (abs > 30) {
            m mVar = mediaDetailsActivity.X;
            if (mVar != null) {
                mVar.m();
            } else {
                j.l("mGlideRequestManager");
                throw null;
            }
        } else {
            MediaDetailsActivity.O(mediaDetailsActivity);
        }
    }
}
