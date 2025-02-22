package s9;

import android.os.Looper;
import com.google.android.gms.internal.p000firebaseauthapi.y7;
import java.util.concurrent.Executor;

public final class b0 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f14816b = new b0();

    /* renamed from: a  reason: collision with root package name */
    public final y7 f14817a = new y7(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f14817a.post(runnable);
    }
}
