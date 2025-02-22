package l9;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.result.d;
import h0.e;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f11019a;

    public m(String str) {
        this.f11019a = d.b("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public static String b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return e.b(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", b(this.f11019a, str, objArr));
        }
    }
}
