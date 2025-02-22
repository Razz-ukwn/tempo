package q7;

import android.content.Context;
import android.content.res.Resources;
import com.quickkonnect.silencio.R;

public final class s3 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
