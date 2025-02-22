package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final i1.b<c> f2355a = new i1.b<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f2356b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static c f2357c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2358a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2359b;

        /* renamed from: c  reason: collision with root package name */
        public final long f2360c;

        /* renamed from: d  reason: collision with root package name */
        public final long f2361d;

        public b(int i8, int i10, long j10, long j11) {
            this.f2358a = i8;
            this.f2359b = i10;
            this.f2360c = j10;
            this.f2361d = j11;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public final void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2358a);
                dataOutputStream.writeInt(this.f2359b);
                dataOutputStream.writeLong(this.f2360c);
                dataOutputStream.writeLong(this.f2361d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2359b == bVar.f2359b && this.f2360c == bVar.f2360c && this.f2358a == bVar.f2358a && this.f2361d == bVar.f2361d;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f2359b), Long.valueOf(this.f2360c), Integer.valueOf(this.f2358a), Long.valueOf(this.f2361d)});
        }
    }

    public static class c {
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i8, boolean z10, boolean z11) {
        c cVar = new c();
        f2357c = cVar;
        f2355a.g(cVar);
        return f2357c;
    }

    public static void c(Context context, boolean z10) {
        b bVar;
        b bVar2;
        if (z10 || f2357c == null) {
            synchronized (f2356b) {
                if (!z10) {
                    if (f2357c != null) {
                        return;
                    }
                }
                int i8 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i8 >= 28) {
                    if (i8 != 30) {
                        File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length = file.length();
                        boolean z11 = file.exists() && length > 0;
                        File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        boolean z12 = file2.exists() && length2 > 0;
                        try {
                            long a10 = a(context);
                            File file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                try {
                                    bVar = b.a(file3);
                                } catch (IOException unused) {
                                    b(131072, z11, z12);
                                    return;
                                }
                            } else {
                                bVar = null;
                            }
                            if (bVar != null && bVar.f2360c == a10) {
                                int i11 = bVar.f2359b;
                                if (i11 != 2) {
                                    i10 = i11;
                                    if (z10 && z12 && i10 != 1) {
                                        i10 = 2;
                                    }
                                    if (bVar != null && bVar.f2359b == 2 && i10 == 1 && length < bVar.f2361d) {
                                        i10 = 3;
                                    }
                                    bVar2 = new b(1, i10, a10, length2);
                                    if (bVar == null || !bVar.equals(bVar2)) {
                                        bVar2.b(file3);
                                    }
                                    b(i10, z11, z12);
                                    return;
                                }
                            }
                            if (z11) {
                                i10 = 1;
                            } else if (z12) {
                                i10 = 2;
                            }
                            i10 = 2;
                            i10 = 3;
                            bVar2 = new b(1, i10, a10, length2);
                            try {
                                bVar2.b(file3);
                            } catch (IOException unused2) {
                                i10 = 196608;
                            }
                            b(i10, z11, z12);
                            return;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            b(65536, z11, z12);
                            return;
                        }
                    }
                }
                b(262144, false, false);
            }
        }
    }
}
