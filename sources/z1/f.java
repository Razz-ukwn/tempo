package z1;

import android.content.Context;
import java.util.concurrent.Callable;
import z1.j;

public final class f implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17634a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f17635b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f17636c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f17637d;

    public f(String str, Context context, e eVar, int i8) {
        this.f17634a = str;
        this.f17635b = context;
        this.f17636c = eVar;
        this.f17637d = i8;
    }

    public final Object call() {
        return j.a(this.f17634a, this.f17635b, this.f17636c, this.f17637d);
    }
}
