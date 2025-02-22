package wa;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import wa.d;

public final class q implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f16638a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Future<?> f16639b;

    /* renamed from: c  reason: collision with root package name */
    public Task<Bitmap> f16640c;

    public q(URL url) {
        this.f16638a = url;
    }

    public final Bitmap c() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.f16638a;
        if (isLoggable) {
            Log.i("FirebaseMessaging", "Starting download of: " + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] b10 = d.b(new d.a(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + b10.length + " bytes from " + url);
                }
                if (b10.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b10, 0, b10.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Successfully downloaded image: " + url);
                        }
                        return decodeByteArray;
                    }
                    throw new IOException("Failed to decode image: " + url);
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public final void close() {
        this.f16639b.cancel(true);
    }
}
