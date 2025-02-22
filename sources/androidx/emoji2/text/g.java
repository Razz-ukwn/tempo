package androidx.emoji2.text;

import android.content.Intent;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.emoji2.text.m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e.q;
import j0.n;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import u9.i;
import u9.j;
import yg.b0;
import yg.d;
import yg.i;
import z9.j0;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1841a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1842b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1843c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1844d;

    public /* synthetic */ g(int i8, Object obj, Object obj2, Object obj3) {
        this.f1841a = i8;
        this.f1842b = obj;
        this.f1843c = obj2;
        this.f1844d = obj3;
    }

    public final void run() {
        switch (this.f1841a) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f1842b;
                f.i iVar = (f.i) this.f1843c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1844d;
                bVar.getClass();
                try {
                    m a10 = c.a(bVar.f1817a);
                    if (a10 != null) {
                        m.b bVar2 = (m.b) a10.f1836a;
                        synchronized (bVar2.f1869d) {
                            bVar2.f1871f = threadPoolExecutor;
                        }
                        a10.f1836a.a(new h(iVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    iVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                i iVar2 = (i) this.f1842b;
                iVar2.getClass();
                iVar2.f15927a.execute(new q((Runnable) this.f1843c, (j.b) this.f1844d));
                return;
            case 3:
                Callable callable = (Callable) this.f1842b;
                Executor executor = (Executor) this.f1843c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1844d;
                ExecutorService executorService = j0.f17848a;
                try {
                    ((Task) callable.call()).continueWith(executor, new n(taskCompletionSource, 6));
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 4:
                wa.i iVar3 = (wa.i) this.f1842b;
                Intent intent = (Intent) this.f1843c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f1844d;
                int i8 = wa.i.B;
                iVar3.getClass();
                try {
                    iVar3.c(intent);
                    return;
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            default:
                d dVar = (d) this.f1843c;
                b0 b0Var = (b0) this.f1844d;
                i.a aVar = i.a.this;
                if (aVar.f17479b.c()) {
                    dVar.b(aVar, new IOException("Canceled"));
                    return;
                } else {
                    dVar.a(aVar, b0Var);
                    return;
                }
        }
    }
}
