package wa;

import com.google.firebase.messaging.FirebaseMessaging;
import na.a;
import na.b;

public final /* synthetic */ class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging.a f16631a;

    public /* synthetic */ o(FirebaseMessaging.a aVar) {
        this.f16631a = aVar;
    }

    public final void a(a aVar) {
        boolean booleanValue;
        FirebaseMessaging.a aVar2 = this.f16631a;
        synchronized (aVar2) {
            aVar2.a();
            Boolean bool = aVar2.f6344c;
            booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f6331a.j();
        }
        if (booleanValue) {
            com.google.firebase.messaging.a aVar3 = FirebaseMessaging.m;
            FirebaseMessaging.this.d();
        }
    }
}
