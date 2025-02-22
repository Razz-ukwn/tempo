package t4;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f15356a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15357b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15358c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f15359a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityManager f15360b;

        /* renamed from: c  reason: collision with root package name */
        public final b f15361c;

        /* renamed from: d  reason: collision with root package name */
        public final float f15362d = ((float) 1);

        public a(Context context) {
            this.f15359a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f15360b = activityManager;
            this.f15361c = new b(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.f15362d = 0.0f;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f15363a;

        public b(DisplayMetrics displayMetrics) {
            this.f15363a = displayMetrics;
        }
    }

    public i(a aVar) {
        Context context = aVar.f15359a;
        ActivityManager activityManager = aVar.f15360b;
        int i8 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f15358c = i8;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f15361c.f15363a;
        float f10 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        float f11 = aVar.f15362d;
        int round2 = Math.round(f10 * f11);
        int round3 = Math.round(f10 * 2.0f);
        int i10 = round - i8;
        int i11 = round3 + round2;
        if (i11 <= i10) {
            this.f15357b = round3;
            this.f15356a = round2;
        } else {
            float f12 = ((float) i10) / (f11 + 2.0f);
            this.f15357b = Math.round(2.0f * f12);
            this.f15356a = Math.round(f12 * f11);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context, (long) this.f15357b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context, (long) this.f15356a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context, (long) i8));
            sb2.append(", memory class limited? ");
            sb2.append(i11 > round);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context, (long) round));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }
}
