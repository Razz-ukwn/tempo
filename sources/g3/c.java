package g3;

import android.content.pm.PackageManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.profileinstaller.c;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.C0027c f8814a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8815b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8816c;

    public /* synthetic */ c(ProfileInstallReceiver.a aVar, int i8, PackageManager.NameNotFoundException nameNotFoundException) {
        this.f8814a = aVar;
        this.f8815b = i8;
        this.f8816c = nameNotFoundException;
    }

    public final void run() {
        this.f8814a.b(this.f8815b, this.f8816c);
    }
}
