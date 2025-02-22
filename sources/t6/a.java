package t6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.recaptcha.RecaptchaDefinitions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u6.q;

public final class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15371a = false;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedBlockingQueue f15372b = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    public final IBinder a(TimeUnit timeUnit) {
        q.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f15371a) {
            this.f15371a = true;
            IBinder iBinder = (IBinder) this.f15372b.poll(RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f15372b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
