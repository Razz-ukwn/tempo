package j;

import java.util.concurrent.Executor;

public final /* synthetic */ class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9667a;

    public /* synthetic */ b(int i8) {
        this.f9667a = i8;
    }

    public final void execute(Runnable runnable) {
        switch (this.f9667a) {
            case 0:
                c.F().f9670b.f9672c.execute(runnable);
                return;
            case 1:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
