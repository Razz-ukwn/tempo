package n1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.q;

@SuppressLint({"LogConditional"})
public final class a {
    public static String a(Context context, int i8) {
        if (i8 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i8);
        } catch (Exception unused) {
            return q.a("?", i8);
        }
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
