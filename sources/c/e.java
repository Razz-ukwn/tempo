package c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.a;
import sf.j;

public final class e extends a<Intent, a> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Intent intent = (Intent) obj;
        j.f(componentActivity, "context");
        return intent;
    }

    public final Object c(Intent intent, int i8) {
        return new a(intent, i8);
    }
}
