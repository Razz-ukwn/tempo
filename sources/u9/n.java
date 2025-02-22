package u9;

import android.content.Context;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import d6.w;
import t9.e;
import t9.v;

public final /* synthetic */ class n implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15930a;

    public /* synthetic */ n(int i8) {
        this.f15930a = i8;
    }

    public final Object e(v vVar) {
        switch (this.f15930a) {
            case 0:
                return ExecutorsRegistrar.f6326c.get();
            case 1:
                return w.b((Context) vVar.a(Context.class));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(vVar);
        }
    }
}
