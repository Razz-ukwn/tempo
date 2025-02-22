package fd;

import com.google.android.gms.tasks.OnFailureListener;
import com.quickkonnect.silencio.ui.measure.claimcoin.congratulation.ClaimCoinCongratulationBottomSheet;
import sf.j;

public final /* synthetic */ class c implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinCongratulationBottomSheet f8689a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8690b;

    public /* synthetic */ c(ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet, boolean z10) {
        this.f8689a = claimCoinCongratulationBottomSheet;
        this.f8690b = z10;
    }

    public final void onFailure(Exception exc) {
        int i8 = ClaimCoinCongratulationBottomSheet.Q0;
        ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet = this.f8689a;
        j.f(claimCoinCongratulationBottomSheet, "this$0");
        j.f(exc, "it");
        claimCoinCongratulationBottomSheet.v0(this.f8690b);
    }
}
