package z9;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class t implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f17888a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f17889b;

    public t(p pVar, long j10) {
        this.f17889b = pVar;
        this.f17888a = j10;
    }

    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f17888a);
        this.f17889b.f17872j.c(bundle);
        return null;
    }
}
