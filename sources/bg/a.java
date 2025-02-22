package bg;

import ag.x1;
import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.l;

public final class a implements l {
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public x1 b(List<? extends l> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(h.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int c() {
        return 1073741823;
    }
}
