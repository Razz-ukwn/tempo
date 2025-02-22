package r4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14013a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f14014b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((w) message.obj).c();
            return true;
        }
    }

    public final synchronized void a(w<?> wVar, boolean z10) {
        if (!this.f14013a) {
            if (!z10) {
                this.f14013a = true;
                wVar.c();
                this.f14013a = false;
            }
        }
        this.f14014b.obtainMessage(1, wVar).sendToTarget();
    }
}
