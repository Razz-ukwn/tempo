package s9;

import android.content.SharedPreferences;
import androidx.fragment.app.q;
import com.google.android.gms.internal.p000firebaseauthapi.c5;
import com.google.android.gms.internal.p000firebaseauthapi.e5;
import com.google.android.gms.internal.p000firebaseauthapi.g5;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final g5 f14862a;

    /* renamed from: b  reason: collision with root package name */
    public static final r f14863b = new r();

    static {
        c5 c5Var = e5.f4509b;
        int i8 = 0;
        Object[] objArr = {"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"};
        while (i8 < 8) {
            if (objArr[i8] != null) {
                i8++;
            } else {
                throw new NullPointerException(q.a("at index ", i8));
            }
        }
        f14862a = new g5(8, objArr);
    }

    public static final void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        g5 g5Var = f14862a;
        int i8 = g5Var.f4570d;
        for (int i10 = 0; i10 < i8; i10++) {
            edit.remove((String) g5Var.get(i10));
        }
        edit.commit();
    }
}
