package s9;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import u6.q;

public final class d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f14821b = new d0();

    /* renamed from: a  reason: collision with root package name */
    public final r f14822a;

    public d0() {
        r rVar = r.f14863b;
        if (m.f14847a == null) {
            m.f14847a = new m();
        }
        this.f14822a = rVar;
    }

    public static void b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f4176b);
        edit.putString("statusMessage", status.f4177c);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }

    public final void a(Context context) {
        this.f14822a.getClass();
        q.i(context);
        r.a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }
}
