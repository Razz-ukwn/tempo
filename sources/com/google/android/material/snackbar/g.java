package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static g f6094e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f6095a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6096b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f6097c;

    /* renamed from: d  reason: collision with root package name */
    public c f6098d;

    public class a implements Handler.Callback {
        public a() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            g gVar = g.this;
            c cVar = (c) message.obj;
            synchronized (gVar.f6095a) {
                if (gVar.f6097c == cVar || gVar.f6098d == cVar) {
                    gVar.a(cVar, 2);
                }
            }
            return true;
        }
    }

    public interface b {
        void b();

        void c(int i8);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f6100a;

        /* renamed from: b  reason: collision with root package name */
        public int f6101b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6102c;

        public c(int i8, BaseTransientBottomBar.c cVar) {
            this.f6100a = new WeakReference<>(cVar);
            this.f6101b = i8;
        }
    }

    public static g b() {
        if (f6094e == null) {
            f6094e = new g();
        }
        return f6094e;
    }

    public final boolean a(c cVar, int i8) {
        b bVar = cVar.f6100a.get();
        if (bVar == null) {
            return false;
        }
        this.f6096b.removeCallbacksAndMessages(cVar);
        bVar.c(i8);
        return true;
    }

    public final boolean c(BaseTransientBottomBar.c cVar) {
        c cVar2 = this.f6097c;
        if (cVar2 == null) {
            return false;
        }
        return cVar != null && cVar2.f6100a.get() == cVar;
    }

    public final void d(c cVar) {
        int i8 = cVar.f6101b;
        if (i8 != -2) {
            if (i8 <= 0) {
                i8 = i8 == -1 ? 1500 : 2750;
            }
            Handler handler = this.f6096b;
            handler.removeCallbacksAndMessages(cVar);
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i8);
        }
    }
}
