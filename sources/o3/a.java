package o3;

import android.annotation.SuppressLint;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f12126e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12127a;

    /* renamed from: b  reason: collision with root package name */
    public final File f12128b;
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: c  reason: collision with root package name */
    public final Lock f12129c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f12130d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f12127a = z10;
        this.f12128b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f12126e;
        synchronized (hashMap) {
            Object obj = hashMap.get(str);
            if (obj == null) {
                obj = new ReentrantLock();
                hashMap.put(str, obj);
            }
            lock = (Lock) obj;
        }
        this.f12129c = lock;
    }

    public final void a(boolean z10) {
        this.f12129c.lock();
        if (z10) {
            File file = this.f12128b;
            if (file != null) {
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.f12130d = channel;
                } catch (IOException e10) {
                    this.f12130d = null;
                    Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
                }
            } else {
                throw new IOException("No lock directory was provided.");
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f12130d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f12129c.unlock();
    }
}
