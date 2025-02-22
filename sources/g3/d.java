package g3;

import java.util.concurrent.Executor;

public final /* synthetic */ class d implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8817a;

    public /* synthetic */ d(int i8) {
        this.f8817a = i8;
    }

    public final void execute(Runnable runnable) {
        switch (this.f8817a) {
            case 0:
                runnable.run();
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
