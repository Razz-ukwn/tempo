package z9;

import aa.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ea.d;
import ea.e;
import ga.b;
import ga.f;
import j6.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import t.w2;

public final class p {

    /* renamed from: p  reason: collision with root package name */
    public static final j f17862p = new j(0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f17863a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f17864b;

    /* renamed from: c  reason: collision with root package name */
    public final w2 f17865c;

    /* renamed from: d  reason: collision with root package name */
    public final g f17866d;

    /* renamed from: e  reason: collision with root package name */
    public final g0 f17867e;

    /* renamed from: f  reason: collision with root package name */
    public final e f17868f;

    /* renamed from: g  reason: collision with root package name */
    public final a f17869g;

    /* renamed from: h  reason: collision with root package name */
    public final c f17870h;

    /* renamed from: i  reason: collision with root package name */
    public final w9.a f17871i;

    /* renamed from: j  reason: collision with root package name */
    public final x9.a f17872j;

    /* renamed from: k  reason: collision with root package name */
    public final i0 f17873k;

    /* renamed from: l  reason: collision with root package name */
    public b0 f17874l;
    public final TaskCompletionSource<Boolean> m = new TaskCompletionSource<>();

    /* renamed from: n  reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f17875n = new TaskCompletionSource<>();

    /* renamed from: o  reason: collision with root package name */
    public final TaskCompletionSource<Void> f17876o = new TaskCompletionSource<>();

    public class a implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Task f17877a;

        public a(Task task) {
            this.f17877a = task;
        }

        public final Task then(Object obj) {
            Task<TContinuationResult> continueWithTask;
            g gVar = p.this.f17866d;
            o oVar = new o(this, (Boolean) obj);
            synchronized (gVar.f17829c) {
                continueWithTask = gVar.f17828b.continueWithTask(gVar.f17827a, new i(oVar));
                gVar.f17828b = continueWithTask.continueWith(gVar.f17827a, new androidx.databinding.a());
            }
            return continueWithTask;
        }
    }

    public p(Context context, g gVar, g0 g0Var, c0 c0Var, e eVar, w2 w2Var, a aVar, c cVar, i0 i0Var, w9.a aVar2, x9.a aVar3) {
        new AtomicBoolean(false);
        this.f17863a = context;
        this.f17866d = gVar;
        this.f17867e = g0Var;
        this.f17864b = c0Var;
        this.f17868f = eVar;
        this.f17865c = w2Var;
        this.f17869g = aVar;
        this.f17870h = cVar;
        this.f17871i = aVar2;
        this.f17872j = aVar3;
        this.f17873k = i0Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:46|47|48|49|50|51|52|53|54|55|56|88) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x025d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(z9.p r29, java.lang.String r30) {
        /*
            r0 = r29
            r7 = r30
            r29.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r8 = r1 / r3
            java.lang.String r1 = "Opening a new session with ID "
            java.lang.String r1 = j0.t.a(r1, r7)
            java.lang.String r10 = "FirebaseCrashlytics"
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r10, r2)
            r3 = 0
            if (r2 == 0) goto L_0x0022
            android.util.Log.d(r10, r1, r3)
        L_0x0022:
            java.util.Locale r11 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r12 = "18.3.6"
            r1[r2] = r12
            java.lang.String r2 = "Crashlytics Android SDK/%s"
            java.lang.String r3 = java.lang.String.format(r11, r2, r1)
            z9.g0 r1 = r0.f17867e
            java.lang.String r14 = r1.f17836c
            z9.a r2 = r0.f17869g
            java.lang.String r15 = r2.f17791f
            java.lang.String r4 = r2.f17792g
            java.lang.String r17 = r1.c()
            java.lang.String r1 = r2.f17789d
            if (r1 == 0) goto L_0x0046
            r1 = 4
            goto L_0x0047
        L_0x0046:
            r1 = 1
        L_0x0047:
            int r18 = j0.e.f(r1)
            w9.c r1 = r2.f17793h
            ba.y r2 = new ba.y
            r13 = r2
            r16 = r4
            r19 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.String r13 = android.os.Build.VERSION.RELEASE
            java.lang.String r14 = android.os.Build.VERSION.CODENAME
            boolean r1 = z9.f.j()
            ba.a0 r4 = new ba.a0
            r4.<init>(r13, r14, r1)
            android.os.StatFs r1 = new android.os.StatFs
            java.io.File r5 = android.os.Environment.getDataDirectory()
            java.lang.String r5 = r5.getPath()
            r1.<init>(r5)
            int r5 = r1.getBlockCount()
            long r5 = (long) r5
            int r1 = r1.getBlockSize()
            r16 = r14
            long r14 = (long) r1
            long r23 = r5 * r14
            z9.f$a r1 = z9.f.a.f17824a
            java.lang.String r14 = android.os.Build.CPU_ABI
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            z9.f$a r5 = z9.f.a.f17824a
            if (r1 == 0) goto L_0x0099
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r10, r1)
            if (r1 == 0) goto L_0x00a9
            java.lang.String r1 = "Architecture#getValue()::Build.CPU_ABI returned null or empty"
            r6 = 0
            android.util.Log.v(r10, r1, r6)
            goto L_0x00a9
        L_0x0099:
            java.lang.String r1 = r14.toLowerCase(r11)
            java.util.HashMap r6 = z9.f.a.f17825b
            java.lang.Object r1 = r6.get(r1)
            z9.f$a r1 = (z9.f.a) r1
            if (r1 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r5 = r1
        L_0x00a9:
            int r18 = r5.ordinal()
            java.lang.String r15 = android.os.Build.MODEL
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r20 = r1.availableProcessors()
            long r21 = z9.f.g()
            boolean r25 = z9.f.i()
            int r26 = z9.f.d()
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r5 = android.os.Build.PRODUCT
            ba.z r1 = new ba.z
            r17 = r1
            r19 = r15
            r27 = r6
            r28 = r5
            r17.<init>(r18, r19, r20, r21, r23, r25, r26, r27, r28)
            r17 = r5
            w9.a r5 = r0.f17871i
            r18 = r6
            ba.x r6 = new ba.x
            r6.<init>(r2, r4, r1)
            r1 = r5
            r2 = r30
            r19 = r10
            r10 = r17
            r4 = r8
            r10 = r18
            r1.d(r2, r3, r4, r6)
            aa.c r1 = r0.f17870h
            r1.a(r7)
            z9.i0 r0 = r0.f17873k
            z9.z r1 = r0.f17842a
            r1.getClass()
            java.nio.charset.Charset r2 = ba.b0.f3440a
            ba.b$a r2 = new ba.b$a
            r2.<init>()
            r2.f3431a = r12
            z9.a r3 = r1.f17914c
            java.lang.String r4 = r3.f17786a
            if (r4 == 0) goto L_0x02d7
            r2.f3432b = r4
            z9.g0 r1 = r1.f17913b
            java.lang.String r4 = r1.c()
            if (r4 == 0) goto L_0x02cf
            r2.f3434d = r4
            java.lang.String r4 = r3.f17791f
            if (r4 == 0) goto L_0x02c7
            r2.f3435e = r4
            java.lang.String r5 = r3.f17792g
            if (r5 == 0) goto L_0x02bf
            r2.f3436f = r5
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.f3433c = r6
            ba.h$a r6 = new ba.h$a
            r6.<init>()
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r6.f3484e = r12
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.f3482c = r8
            java.lang.String r8 = "Null identifier"
            if (r7 == 0) goto L_0x02b9
            r6.f3481b = r7
            java.lang.String r7 = z9.z.f17911g
            if (r7 == 0) goto L_0x02b1
            r6.f3480a = r7
            java.lang.String r7 = r1.f17836c
            if (r7 == 0) goto L_0x02ab
            java.lang.String r24 = r1.c()
            w9.c r1 = r3.f17793h
            w9.c$a r3 = r1.f16534b
            if (r3 != 0) goto L_0x0156
            w9.c$a r3 = new w9.c$a
            r3.<init>(r1)
            r1.f16534b = r3
        L_0x0156:
            w9.c$a r3 = r1.f16534b
            java.lang.String r8 = r3.f16535a
            if (r3 != 0) goto L_0x0163
            w9.c$a r3 = new w9.c$a
            r3.<init>(r1)
            r1.f16534b = r3
        L_0x0163:
            w9.c$a r1 = r1.f16534b
            java.lang.String r1 = r1.f16536b
            java.lang.String r3 = ""
            ba.i r9 = new ba.i
            r20 = r9
            r21 = r7
            r22 = r4
            r23 = r5
            r25 = r8
            r26 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r6.f3485f = r9
            ba.v$a r1 = new ba.v$a
            r1.<init>()
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.f3587a = r4
            r1.f3588b = r13
            r4 = r16
            r1.f3589c = r4
            boolean r4 = z9.f.j()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.f3590d = r4
            ba.v r1 = r1.a()
            r6.f3487h = r1
            android.os.StatFs r1 = new android.os.StatFs
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            r1.<init>(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r14)
            if (r4 == 0) goto L_0x01b2
            goto L_0x01c0
        L_0x01b2:
            java.util.HashMap r4 = z9.z.f17910f
            java.lang.String r5 = r14.toLowerCase(r11)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x01c2
        L_0x01c0:
            r4 = 7
            goto L_0x01c6
        L_0x01c2:
            int r4 = r4.intValue()
        L_0x01c6:
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            int r5 = r5.availableProcessors()
            long r7 = z9.f.g()
            int r9 = r1.getBlockCount()
            long r11 = (long) r9
            int r1 = r1.getBlockSize()
            long r13 = (long) r1
            long r11 = r11 * r13
            boolean r1 = z9.f.i()
            int r9 = z9.f.d()
            ba.k$a r13 = new ba.k$a
            r13.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13.f3507a = r4
            r13.f3508b = r15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r13.f3509c = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r13.f3510d = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r13.f3511e = r4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r13.f3512f = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r13.f3513g = r1
            r13.f3514h = r10
            r1 = r17
            r13.f3515i = r1
            ba.k r1 = r13.a()
            r6.f3488i = r1
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f3490k = r1
            ba.h r1 = r6.a()
            r2.f3437g = r1
            ba.b r1 = r2.a()
            ea.d r0 = r0.f17843b
            ea.e r0 = r0.f7901b
            ba.b0$e r2 = r1.f3428h
            if (r2 != 0) goto L_0x0245
            r0 = 3
            r4 = r19
            boolean r0 = android.util.Log.isLoggable(r4, r0)
            if (r0 == 0) goto L_0x02aa
            java.lang.String r0 = "Could not get session for report"
            r1 = 0
            android.util.Log.d(r4, r0, r1)
            goto L_0x02aa
        L_0x0245:
            r4 = r19
            java.lang.String r5 = r2.g()
            ca.a r6 = ea.d.f7897f     // Catch:{ IOException -> 0x0299 }
            r6.getClass()     // Catch:{ IOException -> 0x0299 }
            la.d r6 = ca.a.f3872a     // Catch:{ IOException -> 0x0299 }
            r6.getClass()     // Catch:{ IOException -> 0x0299 }
            java.io.StringWriter r7 = new java.io.StringWriter     // Catch:{ IOException -> 0x0299 }
            r7.<init>()     // Catch:{ IOException -> 0x0299 }
            r6.a(r1, r7)     // Catch:{ IOException -> 0x025d }
        L_0x025d:
            java.lang.String r1 = r7.toString()     // Catch:{ IOException -> 0x0299 }
            java.lang.String r6 = "report"
            java.io.File r6 = r0.b(r5, r6)     // Catch:{ IOException -> 0x0299 }
            ea.d.e(r6, r1)     // Catch:{ IOException -> 0x0299 }
            java.lang.String r1 = "start-time"
            java.io.File r0 = r0.b(r5, r1)     // Catch:{ IOException -> 0x0299 }
            long r1 = r2.i()     // Catch:{ IOException -> 0x0299 }
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0299 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0299 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0299 }
            java.nio.charset.Charset r8 = ea.d.f7895d     // Catch:{ IOException -> 0x0299 }
            r6.<init>(r7, r8)     // Catch:{ IOException -> 0x0299 }
            r6.write(r3)     // Catch:{ all -> 0x028d }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r7
            r0.setLastModified(r1)     // Catch:{ all -> 0x028d }
            r6.close()     // Catch:{ IOException -> 0x0299 }
            goto L_0x02aa
        L_0x028d:
            r0 = move-exception
            r1 = r0
            r6.close()     // Catch:{ all -> 0x0293 }
            goto L_0x0298
        L_0x0293:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ IOException -> 0x0299 }
        L_0x0298:
            throw r1     // Catch:{ IOException -> 0x0299 }
        L_0x0299:
            r0 = move-exception
            java.lang.String r1 = "Could not persist report for session "
            java.lang.String r1 = j0.t.a(r1, r5)
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r4, r2)
            if (r2 == 0) goto L_0x02aa
            android.util.Log.d(r4, r1, r0)
        L_0x02aa:
            return
        L_0x02ab:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r8)
            throw r0
        L_0x02b1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null generator"
            r0.<init>(r1)
            throw r0
        L_0x02b9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r8)
            throw r0
        L_0x02bf:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null displayVersion"
            r0.<init>(r1)
            throw r0
        L_0x02c7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null buildVersion"
            r0.<init>(r1)
            throw r0
        L_0x02cf:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installationUuid"
            r0.<init>(r1)
            throw r0
        L_0x02d7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null gmpAppId"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.p.a(z9.p, java.lang.String):void");
    }

    public static Task b(p pVar) {
        boolean z10;
        Task task;
        pVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : e.e(pVar.f17868f.f7904b.listFiles(f17862p))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", (Throwable) null);
                    task = Tasks.forResult(null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", (Throwable) null);
                    }
                    task = Tasks.call(new ScheduledThreadPoolExecutor(1), new t(pVar, parseLong));
                }
                arrayList.add(task);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), (Throwable) null);
            }
            file.delete();
        }
        return Tasks.whenAll((Collection<? extends Task<?>>) arrayList);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:(1:189)(1:190)|191|192|193|194|195|226) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:194:0x057d */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0408 A[LOOP:3: B:119:0x0408->B:124:0x0425, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0318  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r26, ga.f r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            java.util.ArrayList r3 = new java.util.ArrayList
            z9.i0 r4 = r1.f17873k
            ea.d r0 = r4.f17843b
            r0.getClass()
            java.util.TreeSet r5 = new java.util.TreeSet
            ea.e r0 = r0.f7901b
            java.io.File r0 = r0.f7905c
            java.lang.String[] r0 = r0.list()
            java.util.List r0 = ea.e.e(r0)
            r5.<init>(r0)
            java.util.NavigableSet r0 = r5.descendingSet()
            r3.<init>(r0)
            int r0 = r3.size()
            r5 = 2
            r6 = 0
            java.lang.String r7 = "FirebaseCrashlytics"
            if (r0 > r2) goto L_0x003b
            boolean r0 = android.util.Log.isLoggable(r7, r5)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "No open sessions to be closed."
            android.util.Log.v(r7, r0, r6)
        L_0x003a:
            return
        L_0x003b:
            java.lang.Object r0 = r3.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            r0 = r27
            ga.d r0 = (ga.d) r0
            ga.b r0 = r0.b()
            ga.b$a r0 = r0.f8900b
            boolean r0 = r0.f8906b
            r9 = 0
            r10 = 1
            ea.d r11 = r4.f17843b
            if (r0 == 0) goto L_0x0347
            int r0 = android.os.Build.VERSION.SDK_INT
            r12 = 30
            if (r0 < r12) goto L_0x0334
            android.content.Context r0 = r1.f17863a
            java.lang.String r6 = "activity"
            java.lang.Object r0 = r0.getSystemService(r6)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getHistoricalProcessExitReasons((java.lang.String) null, 0, 0)
            int r6 = r0.size()
            if (r6 == 0) goto L_0x031f
            aa.c r6 = new aa.c
            ea.e r12 = r1.f17868f
            r6.<init>(r12, r8)
            aa.d r13 = new aa.d
            r13.<init>(r12)
            aa.g r12 = new aa.g
            r12.<init>()
            aa.g$a r14 = r12.f238a
            java.util.concurrent.atomic.AtomicMarkableReference<aa.b> r14 = r14.f241a
            java.lang.Object r14 = r14.getReference()
            aa.b r14 = (aa.b) r14
            java.util.Map r15 = r13.b(r8, r9)
            r14.a(r15)
            aa.g$a r14 = r12.f239b
            java.util.concurrent.atomic.AtomicMarkableReference<aa.b> r14 = r14.f241a
            java.lang.Object r14 = r14.getReference()
            aa.b r14 = (aa.b) r14
            java.util.Map r15 = r13.b(r8, r10)
            r14.a(r15)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r14 = r12.f240c
            java.lang.String r13 = r13.c(r8)
            r14.set(r13, r9)
            ea.e r13 = r11.f7901b
            java.lang.String r14 = "start-time"
            java.io.File r13 = r13.b(r8, r14)
            long r13 = r13.lastModified()
            java.util.Iterator r0 = r0.iterator()
        L_0x00ba:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x00d9
            java.lang.Object r15 = r0.next()
            android.app.ApplicationExitInfo r15 = (android.app.ApplicationExitInfo) r15
            long r16 = r15.getTimestamp()
            int r16 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x00cf
            goto L_0x00d9
        L_0x00cf:
            int r10 = r15.getReason()
            r9 = 6
            if (r10 == r9) goto L_0x00da
            r9 = 0
            r10 = 1
            goto L_0x00ba
        L_0x00d9:
            r15 = 0
        L_0x00da:
            if (r15 != 0) goto L_0x00f2
            java.lang.String r0 = "No relevant ApplicationExitInfo occurred during session: "
            java.lang.String r0 = j0.t.a(r0, r8)
            boolean r4 = android.util.Log.isLoggable(r7, r5)
            if (r4 == 0) goto L_0x00ec
            r4 = 0
            android.util.Log.v(r7, r0, r4)
        L_0x00ec:
            r16 = r3
            r2 = r11
            r10 = 1
            goto L_0x0358
        L_0x00f2:
            java.io.InputStream r0 = r15.getTraceInputStream()     // Catch:{ IOException -> 0x0118 }
            if (r0 == 0) goto L_0x0137
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0118 }
            r5.<init>()     // Catch:{ IOException -> 0x0118 }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x0118 }
        L_0x0101:
            int r10 = r0.read(r9)     // Catch:{ IOException -> 0x0118 }
            r13 = -1
            if (r10 == r13) goto L_0x010d
            r13 = 0
            r5.write(r9, r13, r10)     // Catch:{ IOException -> 0x0118 }
            goto L_0x0101
        L_0x010d:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x0118 }
            java.lang.String r0 = r0.name()     // Catch:{ IOException -> 0x0118 }
            java.lang.String r0 = r5.toString(r0)     // Catch:{ IOException -> 0x0118 }
            goto L_0x0138
        L_0x0118:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Could not get input trace in application exit info: "
            r5.<init>(r9)
            java.lang.String r9 = r15.toString()
            r5.append(r9)
            java.lang.String r9 = " Error: "
            r5.append(r9)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r5 = 0
            android.util.Log.w(r7, r0, r5)
        L_0x0137:
            r0 = 0
        L_0x0138:
            ba.c$a r5 = new ba.c$a
            r5.<init>()
            int r9 = r15.getImportance()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5.f3453d = r9
            java.lang.String r9 = r15.getProcessName()
            java.lang.String r10 = "Null processName"
            if (r9 == 0) goto L_0x0318
            r5.f3451b = r9
            int r9 = r15.getReason()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5.f3452c = r9
            long r13 = r15.getTimestamp()
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            r5.f3456g = r9
            int r9 = r15.getPid()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5.f3450a = r9
            long r13 = r15.getPss()
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            r5.f3454e = r9
            long r13 = r15.getRss()
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            r5.f3455f = r9
            r5.f3457h = r0
            ba.c r0 = r5.a()
            z9.z r4 = r4.f17842a
            android.content.Context r5 = r4.f17912a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            ba.l$a r9 = new ba.l$a
            r9.<init>()
            java.lang.String r13 = "anr"
            r9.f3522b = r13
            long r13 = r0.f3447g
            java.lang.Long r15 = java.lang.Long.valueOf(r13)
            r9.f3521a = r15
            ga.f r15 = r4.f17916e
            ga.d r15 = (ga.d) r15
            ga.b r15 = r15.b()
            ga.b$a r15 = r15.f8900b
            boolean r15 = r15.f8907c
            r16 = r3
            java.lang.String r3 = ""
            if (r15 == 0) goto L_0x0222
            z9.a r15 = r4.f17914c
            java.util.List<z9.d> r2 = r15.f17788c
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0222
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<z9.d> r15 = r15.f17788c
            java.util.Iterator r15 = r15.iterator()
        L_0x01cf:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x0218
            java.lang.Object r17 = r15.next()
            r27 = r15
            r15 = r17
            z9.d r15 = (z9.d) r15
            java.lang.String r1 = r15.f17810a
            if (r1 == 0) goto L_0x0210
            r17 = r10
            java.lang.String r10 = r15.f17811b
            if (r10 == 0) goto L_0x0208
            java.lang.String r15 = r15.f17812c
            if (r15 == 0) goto L_0x0200
            r18 = r11
            ba.d r11 = new ba.d
            r11.<init>(r10, r1, r15)
            r2.add(r11)
            r1 = r25
            r15 = r27
            r10 = r17
            r11 = r18
            goto L_0x01cf
        L_0x0200:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null buildId"
            r0.<init>(r1)
            throw r0
        L_0x0208:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null arch"
            r0.<init>(r1)
            throw r0
        L_0x0210:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null libraryName"
            r0.<init>(r1)
            throw r0
        L_0x0218:
            r17 = r10
            r18 = r11
            ba.c0 r1 = new ba.c0
            r1.<init>(r2)
            goto L_0x0227
        L_0x0222:
            r17 = r10
            r18 = r11
            r1 = 0
        L_0x0227:
            ba.c$a r2 = new ba.c$a
            r2.<init>()
            int r10 = r0.f3444d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.f3453d = r10
            java.lang.String r10 = r0.f3442b
            if (r10 == 0) goto L_0x0310
            r2.f3451b = r10
            int r10 = r0.f3443c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.f3452c = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r2.f3456g = r10
            int r10 = r0.f3441a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2.f3450a = r10
            long r10 = r0.f3445e
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r2.f3454e = r10
            long r10 = r0.f3446f
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r2.f3455f = r10
            java.lang.String r0 = r0.f3448h
            r2.f3457h = r0
            r2.f3458i = r1
            ba.c r0 = r2.a()
            r1 = 100
            int r2 = r0.f3444d
            if (r2 == r1) goto L_0x0272
            r1 = 1
            goto L_0x0273
        L_0x0272:
            r1 = 0
        L_0x0273:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r21 = 0
            r20 = 0
            r10 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            if (r10 != 0) goto L_0x028a
            java.lang.String r11 = " address"
            goto L_0x028b
        L_0x028a:
            r11 = r3
        L_0x028b:
            boolean r13 = r11.isEmpty()
            java.lang.String r14 = "Missing required properties:"
            if (r13 == 0) goto L_0x0305
            ba.q r11 = new ba.q
            r27 = r14
            long r13 = r10.longValue()
            java.lang.String r10 = "0"
            r11.<init>(r10, r10, r13)
            ba.c0 r24 = r4.a()
            ba.n r10 = new ba.n
            r19 = r10
            r22 = r0
            r23 = r11
            r19.<init>(r20, r21, r22, r23, r24)
            if (r2 != 0) goto L_0x02b7
            java.lang.String r0 = " uiOrientation"
            java.lang.String r3 = r3.concat(r0)
        L_0x02b7:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x02f9
            ba.m r0 = new ba.m
            int r24 = r2.intValue()
            r21 = 0
            r22 = 0
            r19 = r0
            r20 = r10
            r23 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            r9.f3523c = r0
            ba.t r0 = r4.b(r5)
            r9.f3524d = r0
            ba.l r0 = r9.a()
            java.lang.String r1 = "Persisting anr for session "
            java.lang.String r1 = j0.t.a(r1, r8)
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r7, r2)
            if (r2 == 0) goto L_0x02ed
            r2 = 0
            android.util.Log.d(r7, r1, r2)
        L_0x02ed:
            ba.l r0 = z9.i0.a(r0, r6, r12)
            r1 = 1
            r2 = r18
            r2.c(r0, r8, r1)
            r10 = r1
            goto L_0x0356
        L_0x02f9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r27
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1)
            throw r0
        L_0x0305:
            r1 = r14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.concat(r11)
            r0.<init>(r1)
            throw r0
        L_0x0310:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r17
            r0.<init>(r1)
            throw r0
        L_0x0318:
            r1 = r10
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x031f:
            r16 = r3
            r2 = r11
            java.lang.String r0 = "No ApplicationExitInfo available. Session: "
            java.lang.String r0 = j0.t.a(r0, r8)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r7, r1)
            if (r1 == 0) goto L_0x0355
            r1 = 0
            android.util.Log.v(r7, r0, r1)
            goto L_0x0355
        L_0x0334:
            r16 = r3
            r2 = r11
            java.lang.String r1 = "ANR feature enabled, but device is API "
            java.lang.String r0 = androidx.fragment.app.q.a(r1, r0)
            boolean r1 = android.util.Log.isLoggable(r7, r5)
            if (r1 == 0) goto L_0x0355
            android.util.Log.v(r7, r0, r6)
            goto L_0x0355
        L_0x0347:
            r16 = r3
            r2 = r11
            boolean r0 = android.util.Log.isLoggable(r7, r5)
            if (r0 == 0) goto L_0x0355
            java.lang.String r0 = "ANR feature disabled."
            android.util.Log.v(r7, r0, r6)
        L_0x0355:
            r10 = 1
        L_0x0356:
            r1 = r25
        L_0x0358:
            w9.a r0 = r1.f17871i
            boolean r3 = r0.c(r8)
            if (r3 == 0) goto L_0x039f
            java.lang.String r3 = "Finalizing native report for session "
            java.lang.String r3 = j0.t.a(r3, r8)
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r7, r4)
            r5 = 0
            if (r4 == 0) goto L_0x0371
            android.util.Log.v(r7, r3, r5)
        L_0x0371:
            w9.d r0 = r0.a(r8)
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "No minidump data found for session "
            r0.<init>(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r7, r0, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "No Tombstones data found for session "
            r0.<init>(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r7, r0, r5)
            java.lang.String r0 = "No native core present"
            android.util.Log.w(r7, r0, r5)
        L_0x039f:
            if (r26 == 0) goto L_0x03ab
            r0 = 0
            r3 = r16
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x03ad
        L_0x03ab:
            r0 = 0
            r3 = 0
        L_0x03ad:
            long r4 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r8
            ea.e r6 = r2.f7901b
            r6.getClass()
            java.io.File r8 = new java.io.File
            java.io.File r9 = r6.f7903a
            java.lang.String r11 = ".com.google.firebase.crashlytics"
            r8.<init>(r9, r11)
            ea.e.a(r8)
            java.io.File r8 = new java.io.File
            java.lang.String r11 = ".com.google.firebase.crashlytics-ndk"
            r8.<init>(r9, r11)
            ea.e.a(r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r8 < r11) goto L_0x03d6
            goto L_0x03d7
        L_0x03d6:
            r10 = r0
        L_0x03d7:
            if (r10 == 0) goto L_0x03e3
            java.io.File r8 = new java.io.File
            java.lang.String r10 = ".com.google.firebase.crashlytics.files.v1"
            r8.<init>(r9, r10)
            ea.e.a(r8)
        L_0x03e3:
            java.util.TreeSet r8 = new java.util.TreeSet
            ea.e r9 = r2.f7901b
            java.io.File r9 = r9.f7905c
            java.lang.String[] r9 = r9.list()
            java.util.List r9 = ea.e.e(r9)
            r8.<init>(r9)
            java.util.NavigableSet r8 = r8.descendingSet()
            if (r3 == 0) goto L_0x03fd
            r8.remove(r3)
        L_0x03fd:
            int r3 = r8.size()
            java.io.File r9 = r6.f7905c
            r10 = 8
            if (r3 > r10) goto L_0x0408
            goto L_0x0431
        L_0x0408:
            int r3 = r8.size()
            if (r3 <= r10) goto L_0x0431
            java.lang.Object r3 = r8.last()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r11 = "Removing session over cap: "
            java.lang.String r11 = j0.t.a(r11, r3)
            r12 = 3
            boolean r12 = android.util.Log.isLoggable(r7, r12)
            if (r12 == 0) goto L_0x0425
            r12 = 0
            android.util.Log.d(r7, r11, r12)
        L_0x0425:
            java.io.File r11 = new java.io.File
            r11.<init>(r9, r3)
            ea.e.d(r11)
            r8.remove(r3)
            goto L_0x0408
        L_0x0431:
            java.util.Iterator r3 = r8.iterator()
        L_0x0435:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x05aa
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = "Finalizing report for session "
            java.lang.String r10 = j0.t.a(r10, r8)
            r11 = 2
            boolean r11 = android.util.Log.isLoggable(r7, r11)
            if (r11 == 0) goto L_0x0452
            r11 = 0
            android.util.Log.v(r7, r10, r11)
        L_0x0452:
            z9.j r10 = ea.d.f7899h
            java.io.File r11 = new java.io.File
            r11.<init>(r9, r8)
            r11.mkdirs()
            java.io.File[] r10 = r11.listFiles(r10)
            java.util.List r10 = ea.e.e(r10)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x047f
            java.lang.String r0 = "Session "
            java.lang.String r10 = " has no events."
            java.lang.String r0 = b2.c.a(r0, r8, r10)
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r7, r10)
            if (r10 == 0) goto L_0x059f
            r10 = 0
            android.util.Log.v(r7, r0, r10)
            goto L_0x059f
        L_0x047f:
            java.util.Collections.sort(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x048b:
            r12 = r0
        L_0x048c:
            boolean r0 = r10.hasNext()
            ca.a r13 = ea.d.f7897f
            if (r0 == 0) goto L_0x04fc
            java.lang.Object r0 = r10.next()
            r14 = r0
            java.io.File r14 = (java.io.File) r14
            java.lang.String r0 = ea.d.d(r14)     // Catch:{ IOException -> 0x04e9 }
            r13.getClass()     // Catch:{ IOException -> 0x04e9 }
            android.util.JsonReader r13 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x04e2 }
            java.io.StringReader r15 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x04e2 }
            r15.<init>(r0)     // Catch:{ IllegalStateException -> 0x04e2 }
            r13.<init>(r15)     // Catch:{ IllegalStateException -> 0x04e2 }
            ba.l r0 = ca.a.e(r13)     // Catch:{ all -> 0x04d6 }
            r13.close()     // Catch:{ IllegalStateException -> 0x04e2 }
            r11.add(r0)     // Catch:{ IOException -> 0x04e9 }
            if (r12 != 0) goto L_0x04d4
            java.lang.String r0 = r14.getName()     // Catch:{ IOException -> 0x04e9 }
            java.lang.String r13 = "event"
            boolean r13 = r0.startsWith(r13)     // Catch:{ IOException -> 0x04e9 }
            if (r13 == 0) goto L_0x04ce
            java.lang.String r13 = "_"
            boolean r0 = r0.endsWith(r13)     // Catch:{ IOException -> 0x04e9 }
            if (r0 == 0) goto L_0x04ce
            r0 = 1
            goto L_0x04cf
        L_0x04ce:
            r0 = 0
        L_0x04cf:
            if (r0 == 0) goto L_0x04d2
            goto L_0x04d4
        L_0x04d2:
            r0 = 0
            goto L_0x048b
        L_0x04d4:
            r12 = 1
            goto L_0x048c
        L_0x04d6:
            r0 = move-exception
            r15 = r0
            r13.close()     // Catch:{ all -> 0x04dc }
            goto L_0x04e1
        L_0x04dc:
            r0 = move-exception
            r13 = r0
            r15.addSuppressed(r13)     // Catch:{ IllegalStateException -> 0x04e2 }
        L_0x04e1:
            throw r15     // Catch:{ IllegalStateException -> 0x04e2 }
        L_0x04e2:
            r0 = move-exception
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x04e9 }
            r13.<init>(r0)     // Catch:{ IOException -> 0x04e9 }
            throw r13     // Catch:{ IOException -> 0x04e9 }
        L_0x04e9:
            r0 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "Could not add event to report for "
            r13.<init>(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r7, r13, r0)
            goto L_0x048c
        L_0x04fc:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0516
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r10 = "Could not parse event files for session "
            r0.<init>(r10)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r10 = 0
            android.util.Log.w(r7, r0, r10)
            goto L_0x059f
        L_0x0516:
            aa.d r0 = new aa.d
            r0.<init>(r6)
            java.lang.String r0 = r0.c(r8)
            java.lang.String r10 = "report"
            java.io.File r10 = r6.b(r8, r10)
            java.lang.String r14 = ea.d.d(r10)     // Catch:{ IOException -> 0x058d }
            r13.getClass()     // Catch:{ IOException -> 0x058d }
            ba.b r13 = ca.a.h(r14)     // Catch:{ IOException -> 0x058d }
            ba.b r0 = r13.j(r4, r0, r12)     // Catch:{ IOException -> 0x058d }
            ba.c0 r13 = new ba.c0     // Catch:{ IOException -> 0x058d }
            r13.<init>(r11)     // Catch:{ IOException -> 0x058d }
            ba.b0$e r11 = r0.f3428h
            if (r11 == 0) goto L_0x0585
            ba.b$a r14 = new ba.b$a     // Catch:{ IOException -> 0x058d }
            r14.<init>(r0)     // Catch:{ IOException -> 0x058d }
            ba.h$a r0 = r11.l()     // Catch:{ IOException -> 0x058d }
            r0.f3489j = r13     // Catch:{ IOException -> 0x058d }
            ba.h r0 = r0.a()     // Catch:{ IOException -> 0x058d }
            r14.f3437g = r0     // Catch:{ IOException -> 0x058d }
            ba.b r0 = r14.a()     // Catch:{ IOException -> 0x058d }
            ba.b0$e r11 = r0.f3428h     // Catch:{ IOException -> 0x058d }
            if (r11 != 0) goto L_0x0557
            goto L_0x059f
        L_0x0557:
            if (r12 == 0) goto L_0x0565
            java.lang.String r11 = r11.g()     // Catch:{ IOException -> 0x058d }
            java.io.File r12 = new java.io.File     // Catch:{ IOException -> 0x058d }
            java.io.File r13 = r6.f7907e     // Catch:{ IOException -> 0x058d }
            r12.<init>(r13, r11)     // Catch:{ IOException -> 0x058d }
            goto L_0x0570
        L_0x0565:
            java.lang.String r11 = r11.g()     // Catch:{ IOException -> 0x058d }
            java.io.File r12 = new java.io.File     // Catch:{ IOException -> 0x058d }
            java.io.File r13 = r6.f7906d     // Catch:{ IOException -> 0x058d }
            r12.<init>(r13, r11)     // Catch:{ IOException -> 0x058d }
        L_0x0570:
            la.d r11 = ca.a.f3872a     // Catch:{ IOException -> 0x058d }
            r11.getClass()     // Catch:{ IOException -> 0x058d }
            java.io.StringWriter r13 = new java.io.StringWriter     // Catch:{ IOException -> 0x058d }
            r13.<init>()     // Catch:{ IOException -> 0x058d }
            r11.a(r0, r13)     // Catch:{ IOException -> 0x057d }
        L_0x057d:
            java.lang.String r0 = r13.toString()     // Catch:{ IOException -> 0x058d }
            ea.d.e(r12, r0)     // Catch:{ IOException -> 0x058d }
            goto L_0x059f
        L_0x0585:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x058d }
            java.lang.String r11 = "Reports without sessions cannot have events added to them."
            r0.<init>(r11)     // Catch:{ IOException -> 0x058d }
            throw r0     // Catch:{ IOException -> 0x058d }
        L_0x058d:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Could not synthesize final report file for "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r7, r10, r0)
        L_0x059f:
            java.io.File r0 = new java.io.File
            r0.<init>(r9, r8)
            ea.e.d(r0)
            r0 = 0
            goto L_0x0435
        L_0x05aa:
            ga.f r0 = r2.f7902c
            ga.d r0 = (ga.d) r0
            ga.b r0 = r0.b()
            ga.b$b r0 = r0.f8899a
            r0.getClass()
            java.util.ArrayList r0 = r2.b()
            int r2 = r0.size()
            r3 = 4
            if (r2 > r3) goto L_0x05c3
            goto L_0x05db
        L_0x05c3:
            java.util.List r0 = r0.subList(r3, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x05cb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05db
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            r2.delete()
            goto L_0x05cb
        L_0x05db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.p.c(boolean, ga.f):void");
    }

    public final boolean d(f fVar) {
        if (Boolean.TRUE.equals(this.f17866d.f17830d.get())) {
            b0 b0Var = this.f17874l;
            if (b0Var != null && b0Var.f17801e.get()) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", (Throwable) null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", (Throwable) null);
            }
            try {
                c(true, fVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", (Throwable) null);
                }
                return true;
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
                return false;
            }
        } else {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public final String e() {
        d dVar = this.f17873k.f17843b;
        dVar.getClass();
        NavigableSet descendingSet = new TreeSet(e.e(dVar.f7901b.f7905c.list())).descendingSet();
        if (!descendingSet.isEmpty()) {
            return (String) descendingSet.first();
        }
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    public final Task<Void> f(Task<b> task) {
        Task task2;
        Task<Void> task3;
        e eVar = this.f17873k.f17843b.f7901b;
        boolean z10 = !e.e(eVar.f7906d.listFiles()).isEmpty() || !e.e(eVar.f7907e.listFiles()).isEmpty() || !e.e(eVar.f7908f.listFiles()).isEmpty();
        TaskCompletionSource<Boolean> taskCompletionSource = this.m;
        if (!z10) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", (Throwable) null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        cb.d dVar = cb.d.f3892c;
        dVar.j0("Crash reports are available to be sent.");
        c0 c0Var = this.f17864b;
        if (c0Var.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", (Throwable) null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task2 = Tasks.forResult(Boolean.TRUE);
        } else {
            dVar.w("Automatic data collection is disabled.");
            dVar.j0("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (c0Var.f17804c) {
                task3 = c0Var.f17805d.getTask();
            }
            Task<TContinuationResult> onSuccessTask = task3.onSuccessTask(new cb.b());
            dVar.w("Waiting for send/deleteUnsentReports to be called.");
            Task<Boolean> task4 = this.f17875n.getTask();
            ExecutorService executorService = j0.f17848a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            m mVar = new m(taskCompletionSource2);
            onSuccessTask.continueWith(mVar);
            task4.continueWith(mVar);
            task2 = taskCompletionSource2.getTask();
        }
        return task2.onSuccessTask(new a(task));
    }
}
