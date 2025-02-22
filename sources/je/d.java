package je;

import android.view.MenuItem;
import android.widget.TextView;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.m;
import com.quickkonnect.silencio.R;
import droidninja.filepicker.MediaDetailsActivity;
import java.util.List;
import ke.i;
import sf.j;

public final class d<T> implements w<List<? extends me.d>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaDetailsActivity f9992a;

    public d(MediaDetailsActivity mediaDetailsActivity) {
        this.f9992a = mediaDetailsActivity;
    }

    public final void b(Object obj) {
        List list = (List) obj;
        j.e(list, "data");
        int i8 = MediaDetailsActivity.f7598f0;
        MediaDetailsActivity mediaDetailsActivity = this.f9992a;
        mediaDetailsActivity.getClass();
        if (!list.isEmpty()) {
            TextView textView = mediaDetailsActivity.W;
            if (textView != null) {
                textView.setVisibility(8);
            }
            RecyclerView recyclerView = mediaDetailsActivity.V;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            i iVar = mediaDetailsActivity.Y;
            Integer num = null;
            if (iVar != null) {
                iVar.r(list, e.f9994b);
            } else {
                m mVar = mediaDetailsActivity.X;
                if (mVar != null) {
                    i iVar2 = new i(mediaDetailsActivity, mVar, list, e.f9994b, false, mediaDetailsActivity);
                    mediaDetailsActivity.Y = iVar2;
                    RecyclerView recyclerView2 = mediaDetailsActivity.V;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(iVar2);
                    }
                } else {
                    j.l("mGlideRequestManager");
                    throw null;
                }
            }
            if (e.f9993a == -1) {
                i iVar3 = mediaDetailsActivity.Y;
                if (!(iVar3 == null || mediaDetailsActivity.f7601c0 == null)) {
                    Integer valueOf = Integer.valueOf(iVar3.d());
                    i iVar4 = mediaDetailsActivity.Y;
                    if (iVar4 != null) {
                        num = Integer.valueOf(iVar4.f10463e.size());
                    }
                    if (j.a(valueOf, num)) {
                        MenuItem menuItem = mediaDetailsActivity.f7601c0;
                        if (menuItem != null) {
                            menuItem.setIcon(R.drawable.ic_select_all);
                        }
                        MenuItem menuItem2 = mediaDetailsActivity.f7601c0;
                        if (menuItem2 != null) {
                            menuItem2.setChecked(true);
                        }
                    }
                }
                mediaDetailsActivity.setTitle(e.c());
                return;
            }
            return;
        }
        TextView textView2 = mediaDetailsActivity.W;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        RecyclerView recyclerView3 = mediaDetailsActivity.V;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(8);
        }
    }
}
