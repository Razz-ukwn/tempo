package z9;

import java.util.concurrent.Callable;

public final class h implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f17840a;

    public h(r rVar) {
        this.f17840a = rVar;
    }

    public final Object call() {
        this.f17840a.run();
        return null;
    }
}
