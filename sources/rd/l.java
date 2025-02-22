package rd;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import ff.m;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class l extends k implements rf.l<g<BaseResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f14229a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(ProfileFragment profileFragment) {
        super(1);
        this.f14229a = profileFragment;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        ProfileFragment profileFragment = this.f14229a;
        if (z10) {
            b bVar = profileFragment.G0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = profileFragment.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(profileFragment, string, str, "OK", (String) null, false, j.f14227a, k.f14228a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = profileFragment.G0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = profileFragment.G0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    zd.j.b(profileFragment.e0());
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}
