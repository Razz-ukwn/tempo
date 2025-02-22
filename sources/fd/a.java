package fd;

import android.content.Intent;
import androidx.fragment.app.x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.quickkonnect.silencio.ui.measure.claimcoin.congratulation.ClaimCoinCongratulationBottomSheet;
import i9.b;
import i9.e;
import i9.f;
import sf.j;

public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinCongratulationBottomSheet f8685a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8686b;

    public /* synthetic */ a(ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet, boolean z10) {
        this.f8685a = claimCoinCongratulationBottomSheet;
        this.f8686b = z10;
    }

    public final void onComplete(Task task) {
        Task task2;
        int i8 = ClaimCoinCongratulationBottomSheet.Q0;
        ClaimCoinCongratulationBottomSheet claimCoinCongratulationBottomSheet = this.f8685a;
        j.f(claimCoinCongratulationBottomSheet, "this$0");
        j.f(task, "it");
        boolean isSuccessful = task.isSuccessful();
        boolean z10 = this.f8686b;
        if (isSuccessful) {
            b bVar = (b) task.getResult();
            f fVar = claimCoinCongratulationBottomSheet.P0;
            if (fVar != null) {
                x d02 = claimCoinCongratulationBottomSheet.d0();
                if (bVar.c()) {
                    task2 = Tasks.forResult(null);
                } else {
                    Intent intent = new Intent(d02, PlayCoreDialogWrapperActivity.class);
                    intent.putExtra("confirmation_intent", bVar.a());
                    intent.putExtra("window_flags", d02.getWindow().getDecorView().getWindowSystemUiVisibility());
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    intent.putExtra("result_receiver", new e(fVar.f9622b, taskCompletionSource));
                    d02.startActivity(intent);
                    task2 = taskCompletionSource.getTask();
                }
                j.e(task2, "reviewManager.launchRevi…reActivity(), reviewInfo)");
                task2.addOnCompleteListener(new b(claimCoinCongratulationBottomSheet, z10)).addOnFailureListener(new c(claimCoinCongratulationBottomSheet, z10));
                return;
            }
            j.l("reviewManager");
            throw null;
        }
        claimCoinCongratulationBottomSheet.v0(z10);
    }
}
