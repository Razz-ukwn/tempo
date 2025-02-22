package q2;

import android.os.Looper;
import com.google.android.gms.internal.measurement.z4;
import com.google.android.gms.internal.p000firebaseauthapi.dh;
import e5.m;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;

public class d implements m, dh {

    /* renamed from: b  reason: collision with root package name */
    public static d f12834b;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12835a;

    public d() {
        this.f12835a = 0;
    }

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static final boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        switch (this.f12835a) {
            case 5:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    public /* synthetic */ d(int i8) {
        this.f12835a = i8;
    }

    public /* synthetic */ d(int i8, int i10) {
        this.f12835a = i8;
    }

    public d(Object obj) {
        this.f12835a = 9;
        Object obj2 = z4.f5617f;
    }
}
