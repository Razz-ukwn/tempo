package tc;

import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import ff.m;
import rf.a;
import sf.k;

public final class e extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CreateAccountBottomSheet f15575a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f15576b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(CreateAccountBottomSheet createAccountBottomSheet, String str) {
        super(0);
        this.f15575a = createAccountBottomSheet;
        this.f15576b = str;
    }

    public final Object d() {
        int i8 = CreateAccountBottomSheet.W0;
        this.f15575a.v0().f6730k.setValue(this.f15576b);
        return m.f8717a;
    }
}
