package androidx.emoji2.text;

import androidx.emoji2.text.f;
import java.util.concurrent.ThreadPoolExecutor;

public final class h extends f.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.i f1845a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1846b;

    public h(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1845a = iVar;
        this.f1846b = threadPoolExecutor;
    }

    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1846b;
        try {
            this.f1845a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void b(o oVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1846b;
        try {
            this.f1845a.b(oVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
