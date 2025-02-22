package z0;

import ag.n2;
import android.content.Context;
import android.os.Build;

public final class k {
    public static final i a(Context context) {
        return new i(new n2(context), new a(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0));
    }
}
