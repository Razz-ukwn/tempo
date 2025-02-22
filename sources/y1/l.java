package y1;

import android.content.Context;
import android.os.UserManager;

public final class l {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
