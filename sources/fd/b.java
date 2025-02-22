package fd;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.quickkonnect.silencio.ui.measure.claimcoin.congratulation.ClaimCoinCongratulationBottomSheet;
import sf.j;

public final /* synthetic */ class b implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinCongratulationBottomSheet f8687a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8688b;

    public /* synthetic */ b(ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet, boolean z10) {
        this.f8687a = claimCoinCongratulationBottomSheet;
        this.f8688b = z10;
    }

    public final void onComplete(Task task) {
        int i8 = ClaimCoinCongratulationBottomSheet.Q0;
        ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet = this.f8687a;
        j.f(claimCoinCongratulationBottomSheet, "this$0");
        j.f(task, "it");
        claimCoinCongratulationBottomSheet.v0(this.f8688b);
    }
}
