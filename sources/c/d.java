package c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import c.a;
import sf.j;

public final class d extends a<String, Boolean> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        j.f(componentActivity, "context");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
        j.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    public final a.C0054a b(ComponentActivity componentActivity, Object obj) {
        j.f(componentActivity, "context");
        if (t1.a.a(componentActivity, (String) obj) == 0) {
            return new a.C0054a(Boolean.TRUE);
        }
        return null;
    }

    public final Object c(Intent intent, int i8) {
        boolean z10;
        if (intent == null || i8 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z11 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (intArrayExtra[i10] == 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
