package z9;

import android.content.Context;
import ba.b0;
import ba.c0;
import ba.o;
import ba.p;
import ba.r;
import ba.s;
import ga.d;
import ga.f;
import ha.a;
import ha.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public final class z {

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f17910f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f17911g = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.3.6"});

    /* renamed from: a  reason: collision with root package name */
    public final Context f17912a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f17913b;

    /* renamed from: c  reason: collision with root package name */
    public final a f17914c;

    /* renamed from: d  reason: collision with root package name */
    public final c f17915d;

    /* renamed from: e  reason: collision with root package name */
    public final f f17916e;

    static {
        HashMap hashMap = new HashMap();
        f17910f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public z(Context context, g0 g0Var, a aVar, a aVar2, d dVar) {
        this.f17912a = context;
        this.f17913b = g0Var;
        this.f17914c = aVar;
        this.f17915d = aVar2;
        this.f17916e = dVar;
    }

    public static p c(q1.a aVar, int i8) {
        String str = (String) aVar.f12825b;
        String str2 = (String) aVar.f12824a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) aVar.f12826c;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        q1.a aVar2 = (q1.a) aVar.f12827d;
        if (i8 >= 8) {
            q1.a aVar3 = aVar2;
            while (aVar3 != null) {
                aVar3 = (q1.a) aVar3.f12827d;
                i10++;
            }
        }
        if (str != null) {
            c0 c0Var = new c0(d(stackTraceElementArr, 4));
            Integer valueOf = Integer.valueOf(i10);
            p pVar = null;
            if (aVar2 != null && i10 == 0) {
                pVar = c(aVar2, i8 + 1);
            }
            String str3 = "";
            if (valueOf == null) {
                str3 = h4.a.c(str3, " overflowCount");
            }
            if (str3.isEmpty()) {
                return new p(str, str2, c0Var, pVar, valueOf.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str3));
        }
        throw new NullPointerException("Null type");
    }

    public static c0 d(StackTraceElement[] stackTraceElementArr, int i8) {
        ArrayList arrayList = new ArrayList();
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            s.a aVar = new s.a();
            aVar.f3569e = Integer.valueOf(i8);
            long j10 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = (long) stackTraceElement.getLineNumber();
            }
            aVar.f3565a = Long.valueOf(max);
            if (str != null) {
                aVar.f3566b = str;
                aVar.f3567c = fileName;
                aVar.f3568d = Long.valueOf(j10);
                arrayList.add(aVar.a());
                i10++;
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return new c0(arrayList);
    }

    public static r e(Thread thread, StackTraceElement[] stackTraceElementArr, int i8) {
        String name = thread.getName();
        if (name != null) {
            Integer valueOf = Integer.valueOf(i8);
            c0 c0Var = new c0(d(stackTraceElementArr, i8));
            String str = "";
            if (valueOf == null) {
                str = str.concat(" importance");
            }
            if (str.isEmpty()) {
                return new r(name, valueOf.intValue(), c0Var);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null name");
    }

    public final c0<b0.e.d.a.b.C0044a> a() {
        b0.e.d.a.b.C0044a[] aVarArr = new b0.e.d.a.b.C0044a[1];
        o.a aVar = new o.a();
        aVar.f3545a = 0L;
        aVar.f3546b = 0L;
        a aVar2 = this.f17914c;
        String str = aVar2.f17790e;
        if (str != null) {
            aVar.f3547c = str;
            aVar.f3548d = aVar2.f17787b;
            aVarArr[0] = aVar.a();
            return new c0<>(Arrays.asList(aVarArr));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ba.t b(int r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.f17912a
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch:{ IllegalStateException -> 0x0044 }
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch:{ IllegalStateException -> 0x0044 }
            android.content.Intent r5 = r0.registerReceiver(r2, r5)     // Catch:{ IllegalStateException -> 0x0044 }
            if (r5 == 0) goto L_0x0041
            java.lang.String r6 = "status"
            r7 = -1
            int r6 = r5.getIntExtra(r6, r7)     // Catch:{ IllegalStateException -> 0x0044 }
            if (r6 != r7) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            if (r6 == r1) goto L_0x0025
            r8 = 5
            if (r6 != r8) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r6 = r3
            goto L_0x0026
        L_0x0025:
            r6 = r4
        L_0x0026:
            java.lang.String r8 = "level"
            int r8 = r5.getIntExtra(r8, r7)     // Catch:{ IllegalStateException -> 0x003f }
            java.lang.String r9 = "scale"
            int r5 = r5.getIntExtra(r9, r7)     // Catch:{ IllegalStateException -> 0x003f }
            if (r8 == r7) goto L_0x004d
            if (r5 != r7) goto L_0x0037
            goto L_0x004d
        L_0x0037:
            float r7 = (float) r8     // Catch:{ IllegalStateException -> 0x003f }
            float r5 = (float) r5     // Catch:{ IllegalStateException -> 0x003f }
            float r7 = r7 / r5
            java.lang.Float r5 = java.lang.Float.valueOf(r7)     // Catch:{ IllegalStateException -> 0x003f }
            goto L_0x004e
        L_0x003f:
            r5 = move-exception
            goto L_0x0046
        L_0x0041:
            r5 = r2
            r6 = r3
            goto L_0x004e
        L_0x0044:
            r5 = move-exception
            r6 = r3
        L_0x0046:
            java.lang.String r7 = "FirebaseCrashlytics"
            java.lang.String r8 = "An error occurred getting battery state."
            android.util.Log.e(r7, r8, r5)
        L_0x004d:
            r5 = r2
        L_0x004e:
            if (r5 == 0) goto L_0x0058
            double r7 = r5.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
        L_0x0058:
            if (r6 == 0) goto L_0x006e
            if (r5 != 0) goto L_0x005d
            goto L_0x006e
        L_0x005d:
            float r5 = r5.floatValue()
            double r5 = (double) r5
            r7 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r1 = 3
            goto L_0x006f
        L_0x006e:
            r1 = r4
        L_0x006f:
            boolean r5 = z9.f.i()
            if (r5 == 0) goto L_0x0076
            goto L_0x0087
        L_0x0076:
            java.lang.String r5 = "sensor"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.hardware.SensorManager r5 = (android.hardware.SensorManager) r5
            r6 = 8
            android.hardware.Sensor r5 = r5.getDefaultSensor(r6)
            if (r5 == 0) goto L_0x0087
            r3 = r4
        L_0x0087:
            long r4 = z9.f.g()
            android.app.ActivityManager$MemoryInfo r6 = new android.app.ActivityManager$MemoryInfo
            r6.<init>()
            java.lang.String r7 = "activity"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r0.getMemoryInfo(r6)
            long r6 = r6.availMem
            long r4 = r4 - r6
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = r0.getPath()
            android.os.StatFs r6 = new android.os.StatFs
            r6.<init>(r0)
            int r0 = r6.getBlockSize()
            long r7 = (long) r0
            int r0 = r6.getBlockCount()
            long r9 = (long) r0
            long r9 = r9 * r7
            int r0 = r6.getAvailableBlocks()
            long r11 = (long) r0
            long r7 = r7 * r11
            long r9 = r9 - r7
            ba.t$a r0 = new ba.t$a
            r0.<init>()
            r0.f3576a = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f3577b = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.f3578c = r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.f3579d = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r0.f3580e = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r0.f3581f = r14
            ba.t r14 = r0.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.z.b(int):ba.t");
    }
}
