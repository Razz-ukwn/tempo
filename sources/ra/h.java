package ra;

import com.google.android.gms.tasks.TaskCompletionSource;
import ta.a;

public final class h implements l {

    /* renamed from: a  reason: collision with root package name */
    public final m f14177a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<j> f14178b;

    public h(m mVar, TaskCompletionSource<j> taskCompletionSource) {
        this.f14177a = mVar;
        this.f14178b = taskCompletionSource;
    }

    public final boolean a(Exception exc) {
        this.f14178b.trySetException(exc);
        return true;
    }

    public final boolean b(a aVar) {
        if (!(aVar.f() == 4) || this.f14177a.b(aVar)) {
            return false;
        }
        String str = aVar.f15508d;
        if (str != null) {
            Long valueOf = Long.valueOf(aVar.f15510f);
            Long valueOf2 = Long.valueOf(aVar.f15511g);
            String str2 = "";
            if (valueOf == null) {
                str2 = str2.concat(" tokenExpirationTimestamp");
            }
            if (valueOf2 == null) {
                str2 = h4.a.c(str2, " tokenCreationTimestamp");
            }
            if (str2.isEmpty()) {
                this.f14178b.setResult(new a(str, valueOf.longValue(), valueOf2.longValue()));
                return true;
            }
            throw new IllegalStateException("Missing required properties:".concat(str2));
        }
        throw new NullPointerException("Null token");
    }
}
