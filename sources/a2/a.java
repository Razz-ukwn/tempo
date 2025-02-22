package a2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import i3.k;
import i3.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import k.b;
import sf.j;
import t9.q;
import u2.c;
import u2.f;
import u9.j;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f72a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f73b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f74c;

    public /* synthetic */ a(int i8, Object obj, Object obj2) {
        this.f72a = i8;
        this.f73b = obj;
        this.f74c = obj2;
    }

    public final void run() {
        switch (this.f72a) {
            case 1:
                f fVar = (f) this.f74c;
                c.b bVar = c.f15701a;
                j.f(fVar, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String) this.f73b), fVar);
                throw fVar;
            case 2:
                Context context = (Context) this.f74c;
                ((ProfileInstallerInitializer) this.f73b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new androidx.activity.j(context, 4), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
            case 3:
                m mVar = (m) this.f73b;
                String[] strArr = (String[]) this.f74c;
                int i8 = m.b.f9502b;
                j.f(mVar, "this$0");
                j.f(strArr, "$tables");
                k kVar = mVar.f9492b;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                kVar.getClass();
                j.f(strArr2, "tables");
                synchronized (kVar.f9476k) {
                    Iterator<Map.Entry<k.c, k.d>> it = kVar.f9476k.iterator();
                    while (true) {
                        b.e eVar = (b.e) it;
                        if (eVar.hasNext()) {
                            Map.Entry entry = (Map.Entry) eVar.next();
                            j.e(entry, "(observer, wrapper)");
                            k.c cVar = (k.c) entry.getKey();
                            k.d dVar = (k.d) entry.getValue();
                            cVar.getClass();
                            if (!(cVar instanceof m.a)) {
                                dVar.b(strArr2);
                            }
                        } else {
                            ff.m mVar2 = ff.m.f8717a;
                        }
                    }
                }
                return;
            case 4:
                q qVar = (q) this.f73b;
                qa.b bVar2 = (qa.b) this.f74c;
                synchronized (qVar) {
                    if (qVar.f15490b == null) {
                        qVar.f15489a.add(bVar2);
                    } else {
                        qVar.f15490b.add(bVar2.get());
                    }
                }
                return;
            case 5:
                u9.a aVar = (u9.a) this.f73b;
                Runnable runnable = (Runnable) this.f74c;
                Process.setThreadPriority(aVar.f15898c);
                StrictMode.ThreadPolicy threadPolicy = aVar.f15899d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 6:
                Runnable runnable2 = (Runnable) this.f73b;
                j.b bVar3 = (j.b) this.f74c;
                try {
                    runnable2.run();
                    return;
                } catch (Exception e10) {
                    ((j.a) bVar3).a(e10);
                    throw e10;
                }
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f73b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f74c;
                com.google.firebase.messaging.a aVar2 = FirebaseMessaging.m;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
        }
    }
}
