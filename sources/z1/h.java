package z1;

import android.content.Context;
import java.util.concurrent.Callable;
import z1.j;

public final class h implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17639a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f17640b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f17641c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f17642d;

    public h(String str, Context context, e eVar, int i8) {
        this.f17639a = str;
        this.f17640b = context;
        this.f17641c = eVar;
        this.f17642d = i8;
    }

    public final Object call() {
        try {
            return j.a(this.f17639a, this.f17640b, this.f17641c, this.f17642d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
