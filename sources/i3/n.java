package i3;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9505a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9506b;

    public /* synthetic */ n(Object obj, Object obj2) {
        this.f9505a = obj;
        this.f9506b = obj2;
    }

    public final void run() {
        int i8 = JobInfoSchedulerService.f4146a;
        ((JobInfoSchedulerService) this.f9505a).jobFinished((JobParameters) this.f9506b, false);
    }
}
