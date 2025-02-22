package e;

import a1.i;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.f;
import com.google.android.gms.tasks.TaskCompletionSource;
import e.r;
import i1.a;
import u9.j;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7698a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7699b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7700c;

    public /* synthetic */ q(int i8, Object obj, Object obj2) {
        this.f7698a = i8;
        this.f7699b = obj;
        this.f7700c = obj2;
    }

    public /* synthetic */ q(Runnable runnable, j.b bVar) {
        this.f7698a = 3;
        this.f7700c = runnable;
        this.f7699b = bVar;
    }

    public final void run() {
        int i8 = this.f7698a;
        Object obj = this.f7700c;
        Object obj2 = this.f7699b;
        switch (i8) {
            case 0:
                r.a aVar = (r.a) obj2;
                Runnable runnable = (Runnable) obj;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                InputMethodManager inputMethodManager = (InputMethodManager) obj2;
                i iVar = (i) obj;
                sf.j.f(inputMethodManager, "$imm");
                sf.j.f(iVar, "this$0");
                inputMethodManager.showSoftInput(iVar.f43a, 0);
                return;
            case 2:
                f.d(obj2);
                sf.j.f((Object) null, "this$0");
                sf.j.f((String) obj, "$query");
                throw null;
            case 3:
                j.b bVar = (j.b) obj2;
                try {
                    ((Runnable) obj).run();
                    j jVar = j.this;
                    jVar.getClass();
                    if (a.B.b(jVar, (Object) null, a.C)) {
                        a.c(jVar);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    ((j.a) bVar).a(e10);
                    return;
                }
            default:
                wa.q qVar = (wa.q) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                qVar.getClass();
                try {
                    taskCompletionSource.setResult(qVar.c());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
        }
    }
}
