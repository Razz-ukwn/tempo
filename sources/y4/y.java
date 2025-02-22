package y4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import s4.c;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Paint f17250a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    public static final Lock f17251b = (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL) ? new ReentrantLock() : new a());

    public static final class a implements Lock {
        public final void lock() {
        }

        public final void lockInterruptibly() {
        }

        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public final boolean tryLock() {
            return true;
        }

        public final boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }

        public final void unlock() {
        }
    }

    static {
        new Paint(7);
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f17251b;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f17250a);
            canvas.setBitmap((Bitmap) null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(c cVar, Bitmap bitmap, int i8, int i10) {
        if (bitmap.getWidth() == i8 && bitmap.getHeight() == i10) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i8) / ((float) bitmap.getWidth()), ((float) i10) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap e10 = cVar.e((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        e10.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i8 + "x" + i10);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + e10.getWidth() + "x" + e10.getHeight());
            StringBuilder sb2 = new StringBuilder("minPct:   ");
            sb2.append(min);
            Log.v("TransformationUtils", sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, e10, matrix);
        return e10;
    }
}
