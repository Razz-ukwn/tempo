package t6;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import h7.i;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"HandlerLeak"})
public final class l extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15409a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f15410b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f15410b = eVar;
        this.f15409a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i8 = message.what;
        boolean z10 = true;
        if (i8 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i8);
            return;
        }
        e eVar = this.f15410b;
        Context context = this.f15409a;
        int b10 = eVar.b(context);
        AtomicBoolean atomicBoolean = i.f15402a;
        if (!(b10 == 1 || b10 == 2 || b10 == 3 || b10 == 9)) {
            z10 = false;
        }
        if (z10) {
            Intent a10 = eVar.a(b10, context, "n");
            eVar.g(context, b10, a10 == null ? null : PendingIntent.getActivity(context, 0, a10, 201326592));
        }
    }
}
