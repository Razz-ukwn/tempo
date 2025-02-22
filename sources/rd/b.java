package rd;

import android.text.InputFilter;
import android.text.Spanned;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import sf.j;
import zf.n;

public final /* synthetic */ class b implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f14212a;

    public /* synthetic */ b(ProfileFragment profileFragment) {
        this.f14212a = profileFragment;
    }

    public final CharSequence filter(CharSequence charSequence, int i8, int i10, Spanned spanned, int i11, int i12) {
        int i13 = ProfileFragment.I0;
        ProfileFragment profileFragment = this.f14212a;
        j.f(profileFragment, "this$0");
        if (charSequence != null) {
            if (n.A0(profileFragment.F0, "" + charSequence)) {
                return "";
            }
        }
        return null;
    }
}
