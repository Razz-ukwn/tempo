package s6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class r<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f14784a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<T> f14785b = new TaskCompletionSource<>();

    /* renamed from: c  reason: collision with root package name */
    public final int f14786c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f14787d;

    public r(int i8, int i10, Bundle bundle) {
        this.f14784a = i8;
        this.f14786c = i10;
        this.f14787d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(s sVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(sVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f14785b.setException(sVar);
    }

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(bundle);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f14785b.setResult(bundle);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(this.f14786c);
        sb2.append(" id=");
        sb2.append(this.f14784a);
        sb2.append(" oneWay=");
        sb2.append(b());
        sb2.append("}");
        return sb2.toString();
    }
}
