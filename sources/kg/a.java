package kg;

import java.util.concurrent.ThreadFactory;
import sf.j;

public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10472a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10473b;

    public /* synthetic */ a(String str, boolean z10) {
        this.f10472a = str;
        this.f10473b = z10;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f10472a;
        j.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f10473b);
        return thread;
    }
}
