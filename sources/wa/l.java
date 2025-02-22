package wa;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j0.n;
import j6.k;
import t7.a;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f16623c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static j0 f16624d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16625a;

    /* renamed from: b  reason: collision with root package name */
    public final j f16626b = new j();

    public l(Context context) {
        this.f16625a = context;
    }

    public static Task<Integer> a(Context context, Intent intent) {
        j0 j0Var;
        j0 j0Var2;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (z.a().c(context)) {
            synchronized (f16623c) {
                if (f16624d == null) {
                    f16624d = new j0(context);
                }
                j0Var2 = f16624d;
            }
            synchronized (h0.f16603b) {
                if (h0.f16604c == null) {
                    a aVar = new a(context);
                    h0.f16604c = aVar;
                    synchronized (aVar.f15432a) {
                        aVar.f15438g = true;
                    }
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    h0.f16604c.a(h0.f16602a);
                }
                j0Var2.b(intent).addOnCompleteListener(new n(intent, 7));
            }
        } else {
            synchronized (f16623c) {
                if (f16624d == null) {
                    f16624d = new j0(context);
                }
                j0Var = f16624d;
            }
            j0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public final Task<Integer> b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z10 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f16625a;
        boolean z11 = context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z10 = true;
        }
        if (z11 && !z10) {
            return a(context, intent);
        }
        k kVar = new k(context, intent);
        j jVar = this.f16626b;
        return Tasks.call(jVar, kVar).continueWithTask(jVar, new k(context, intent));
    }
}
