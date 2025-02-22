package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.profileinstaller.c;
import java.io.File;

public class ProfileInstallReceiver extends BroadcastReceiver {

    public class a implements c.C0027c {
        public a() {
        }

        public final void a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        public final void b(int i8, Object obj) {
            c.f2354b.b(i8, obj);
            ProfileInstallReceiver.this.setResultCode(i8);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                c.b(context, new j.a(1), new a(), true);
                return;
            }
            boolean equals = "androidx.profileinstaller.action.SKIP_FILE".equals(action);
            c.b bVar = c.f2354b;
            if (equals) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        a aVar = new a();
                        try {
                            c.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            new g3.c(aVar, 10, (PackageManager.NameNotFoundException) null).run();
                        } catch (PackageManager.NameNotFoundException e10) {
                            new g3.c(aVar, 7, e10).run();
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        bVar.b(11, (Object) null);
                        setResultCode(11);
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                bVar.b(12, (Object) null);
                setResultCode(12);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                if (!"DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                    bVar.b(16, (Object) null);
                    setResultCode(16);
                } else if (a.a(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    bVar.b(14, (Object) null);
                    setResultCode(14);
                } else {
                    bVar.b(15, (Object) null);
                    setResultCode(15);
                }
            }
        }
    }
}
