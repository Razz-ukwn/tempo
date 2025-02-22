package z9;

import java.util.concurrent.Callable;

public final class s implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17886a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f17887b;

    public s(p pVar, String str) {
        this.f17887b = pVar;
        this.f17886a = str;
    }

    public final Object call() {
        p.a(this.f17887b, this.f17886a);
        return null;
    }
}
