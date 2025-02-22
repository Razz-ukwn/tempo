package rd;

import android.view.View;
import androidx.appcompat.app.b;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import com.quickkonnect.silencio.ui.menu.profile.ProfileViewModel;
import jf.f;
import sf.j;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f14214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f14215b;

    public /* synthetic */ d(ProfileFragment profileFragment, b bVar) {
        this.f14214a = profileFragment;
        this.f14215b = bVar;
    }

    public final void onClick(View view) {
        int i8 = ProfileFragment.I0;
        ProfileFragment profileFragment = this.f14214a;
        j.f(profileFragment, "this$0");
        b bVar = this.f14215b;
        j.f(bVar, "$dialog");
        ProfileViewModel o02 = profileFragment.o0();
        o02.getClass();
        cb.b.D(gc.b.o(o02), (f.b) null, 0, new t(o02, (jf.d<? super t>) null), 3);
        bVar.dismiss();
    }
}
