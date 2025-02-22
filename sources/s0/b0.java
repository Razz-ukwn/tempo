package s0;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
import t9.e;
import t9.p;
import t9.v;

public final /* synthetic */ class b0 implements e {
    public static String a(StringBuilder sb2, String str, char c3) {
        sb2.append(str);
        sb2.append(c3);
        return sb2.toString();
    }

    public static /* synthetic */ String b(int i8) {
        return i8 == 1 ? "InMeasureBlock" : i8 == 2 ? "InLayoutBlock" : i8 == 3 ? "NotUsed" : "null";
    }

    public Object e(v vVar) {
        p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f6324a;
        return u9.p.f15939a;
    }
}
