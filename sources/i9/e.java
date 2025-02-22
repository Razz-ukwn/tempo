package i9;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class e extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9620a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f9620a = taskCompletionSource;
    }

    public final void onReceiveResult(int i8, Bundle bundle) {
        this.f9620a.trySetResult(null);
    }
}
