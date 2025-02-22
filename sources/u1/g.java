package u1;

import android.graphics.Typeface;
import u1.f;
import u9.j;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15679a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15680b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15681c;

    public /* synthetic */ g(int i8, Object obj, Object obj2) {
        this.f15679a = i8;
        this.f15680b = obj;
        this.f15681c = obj2;
    }

    public final void run() {
        int i8 = this.f15679a;
        Object obj = this.f15681c;
        Object obj2 = this.f15680b;
        switch (i8) {
            case 0:
                ((f.e) obj2).d((Typeface) obj);
                return;
            default:
                j.b bVar = (j.b) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } catch (Exception e10) {
                    ((j.a) bVar).a(e10);
                    return;
                }
        }
    }
}
