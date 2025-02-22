package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import ff.m;
import i3.i;
import i3.j;
import java.util.LinkedHashMap;

public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public int f2761a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f2762b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final b f2763c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    public final a f2764d = new a(this);

    public static final class a extends j.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MultiInstanceInvalidationService f2765b;

        public a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f2765b = multiInstanceInvalidationService;
        }

        public final void I(int i8, String[] strArr) {
            sf.j.f(strArr, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2765b;
            synchronized (multiInstanceInvalidationService.f2763c) {
                String str = (String) multiInstanceInvalidationService.f2762b.get(Integer.valueOf(i8));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.f2763c.beginBroadcast();
                for (int i10 = 0; i10 < beginBroadcast; i10++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f2763c.getBroadcastCookie(i10);
                        sf.j.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) broadcastCookie).intValue();
                        String str2 = (String) multiInstanceInvalidationService.f2762b.get(Integer.valueOf(intValue));
                        if (i8 != intValue && sf.j.a(str, str2)) {
                            ((i) multiInstanceInvalidationService.f2763c.getBroadcastItem(i10)).h(strArr);
                        }
                    } catch (RemoteException e10) {
                        Log.w("ROOM", "Error invoking a remote callback", e10);
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.f2763c.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.f2763c.finishBroadcast();
                m mVar = m.f8717a;
            }
        }

        public final int i(i iVar, String str) {
            sf.j.f(iVar, "callback");
            int i8 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f2765b;
            synchronized (multiInstanceInvalidationService.f2763c) {
                int i10 = multiInstanceInvalidationService.f2761a + 1;
                multiInstanceInvalidationService.f2761a = i10;
                if (multiInstanceInvalidationService.f2763c.register(iVar, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f2762b.put(Integer.valueOf(i10), str);
                    i8 = i10;
                } else {
                    multiInstanceInvalidationService.f2761a--;
                }
            }
            return i8;
        }
    }

    public static final class b extends RemoteCallbackList<i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MultiInstanceInvalidationService f2766a;

        public b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f2766a = multiInstanceInvalidationService;
        }

        public final void onCallbackDied(IInterface iInterface, Object obj) {
            sf.j.f((i) iInterface, "callback");
            sf.j.f(obj, "cookie");
            this.f2766a.f2762b.remove((Integer) obj);
        }
    }

    public final IBinder onBind(Intent intent) {
        sf.j.f(intent, "intent");
        return this.f2764d;
    }
}
