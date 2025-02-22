package j;

import java.util.concurrent.Executor;

public final /* synthetic */ class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9666a;

    public /* synthetic */ a(int i8) {
        this.f9666a = i8;
    }

    public final void execute(Runnable runnable) {
        switch (this.f9666a) {
            case 1:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
