package tc;

import android.text.InputFilter;
import android.text.Spanned;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import sf.j;
import zf.n;

public final /* synthetic */ class b implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CreateAccountBottomSheet f15570a;

    public /* synthetic */ b(CreateAccountBottomSheet createAccountBottomSheet) {
        this.f15570a = createAccountBottomSheet;
    }

    public final CharSequence filter(CharSequence charSequence, int i8, int i10, Spanned spanned, int i11, int i12) {
        int i13 = CreateAccountBottomSheet.W0;
        CreateAccountBottomSheet createAccountBottomSheet = this.f15570a;
        j.f(createAccountBottomSheet, "this$0");
        if (charSequence != null) {
            if (n.A0(createAccountBottomSheet.V0, "" + charSequence)) {
                return "";
            }
        }
        return null;
    }
}
