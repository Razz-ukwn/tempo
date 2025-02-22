package u6;

import ag.d;
import cb.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

public final class g0 implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f15807a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15808b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f15809c;

    public g0(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, f fVar) {
        this.f15807a = basePendingResult;
        this.f15808b = taskCompletionSource;
        this.f15809c = fVar;
    }

    public final void a(Status status) {
        if (status.f4176b <= 0) {
            e eVar = this.f15807a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) eVar;
            q.k(true ^ basePendingResult.f4204g, "Result has already been consumed.");
            try {
                if (!basePendingResult.f4199b.await(0, timeUnit)) {
                    basePendingResult.c(Status.E);
                }
            } catch (InterruptedException unused) {
                basePendingResult.c(Status.C);
            }
            q.k(basePendingResult.d(), "Result is not ready.");
            this.f15808b.setResult(this.f15809c.b(basePendingResult.f()));
            return;
        }
        this.f15808b.setException(d.f(status));
    }
}
