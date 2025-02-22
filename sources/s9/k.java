package s9;

import android.os.HandlerThread;
import com.google.android.gms.internal.p000firebaseauthapi.y7;
import m9.f;
import q7.z3;
import x6.a;

public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final a f14839e = new a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    public volatile long f14840a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f14841b;

    /* renamed from: c  reason: collision with root package name */
    public final y7 f14842c;

    /* renamed from: d  reason: collision with root package name */
    public final z3 f14843d;

    public k(f fVar) {
        f14839e.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.f14842c = new y7(handlerThread.getLooper());
        fVar.a();
        this.f14843d = new z3(this, fVar.f11332b);
    }
}
