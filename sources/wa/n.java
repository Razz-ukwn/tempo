package wa;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import m9.f;

public final /* synthetic */ class n implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f16628a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16629b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a.C0080a f16630c;

    public /* synthetic */ n(FirebaseMessaging firebaseMessaging, String str, a.C0080a aVar) {
        this.f16628a = firebaseMessaging;
        this.f16629b = str;
        this.f16630c = aVar;
    }

    public final Task then(Object obj) {
        a aVar;
        String str;
        FirebaseMessaging firebaseMessaging = this.f16628a;
        String str2 = this.f16629b;
        a.C0080a aVar2 = this.f16630c;
        String str3 = (String) obj;
        Context context = firebaseMessaging.f6334d;
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.m == null) {
                FirebaseMessaging.m = new a(context);
            }
            aVar = FirebaseMessaging.m;
        }
        f fVar = firebaseMessaging.f6331a;
        fVar.a();
        String f10 = "[DEFAULT]".equals(fVar.f11332b) ? "" : fVar.f();
        s sVar = firebaseMessaging.f6340j;
        synchronized (sVar) {
            if (sVar.f16642b == null) {
                sVar.d();
            }
            str = sVar.f16642b;
        }
        synchronized (aVar) {
            String a10 = a.C0080a.a(System.currentTimeMillis(), str3, str);
            if (a10 != null) {
                SharedPreferences.Editor edit = aVar.f6346a.edit();
                edit.putString(f10 + "|T|" + str2 + "|*", a10);
                edit.commit();
            }
        }
        if (aVar2 == null || !str3.equals(aVar2.f6348a)) {
            f fVar2 = firebaseMessaging.f6331a;
            fVar2.a();
            if ("[DEFAULT]".equals(fVar2.f11332b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    fVar2.a();
                    sb2.append(fVar2.f11332b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str3);
                new l(firebaseMessaging.f6334d).b(intent);
            }
        }
        return Tasks.forResult(str3);
    }
}
