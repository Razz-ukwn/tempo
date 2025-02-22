package ag;

import bg.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

public final /* synthetic */ class e0 {
    public static /* synthetic */ Iterator a() {
        try {
            return Arrays.asList(new d0[]{new b()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
