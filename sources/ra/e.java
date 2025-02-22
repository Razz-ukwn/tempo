package ra;

import android.annotation.SuppressLint;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f3.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import m9.f;
import t9.p;
import ta.a;
import ta.b;
import u6.q;
import u9.o;
import ua.c;

public final class e implements f {
    public static final Object m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final f f14165a;

    /* renamed from: b  reason: collision with root package name */
    public final c f14166b;

    /* renamed from: c  reason: collision with root package name */
    public final ta.c f14167c;

    /* renamed from: d  reason: collision with root package name */
    public final m f14168d;

    /* renamed from: e  reason: collision with root package name */
    public final p<b> f14169e;

    /* renamed from: f  reason: collision with root package name */
    public final k f14170f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f14171g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f14172h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f14173i;

    /* renamed from: j  reason: collision with root package name */
    public String f14174j;

    /* renamed from: k  reason: collision with root package name */
    public final HashSet f14175k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f14176l;

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public e() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public e(f fVar, qa.b bVar, ExecutorService executorService, o oVar) {
        fVar.a();
        c cVar = new c(fVar.f11331a, bVar);
        ta.c cVar2 = new ta.c(fVar);
        m a10 = m.a();
        p<b> pVar = new p<>(new b(fVar));
        k kVar = new k();
        this.f14171g = new Object();
        this.f14175k = new HashSet();
        this.f14176l = new ArrayList();
        this.f14165a = fVar;
        this.f14166b = cVar;
        this.f14167c = cVar2;
        this.f14168d = a10;
        this.f14169e = pVar;
        this.f14170f = kVar;
        this.f14172h = executorService;
        this.f14173i = oVar;
    }

    public final Task a() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h hVar = new h(this.f14168d, taskCompletionSource);
        synchronized (this.f14171g) {
            this.f14176l.add(hVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f14172h.execute(new d(this));
        return task;
    }

    public final void b(boolean z10) {
        a c3;
        synchronized (m) {
            f fVar = this.f14165a;
            fVar.a();
            v b10 = v.b(fVar.f11331a);
            try {
                c3 = this.f14167c.c();
                int i8 = c3.f15507c;
                boolean z11 = true;
                if (i8 != 2) {
                    if (i8 != 1) {
                        z11 = false;
                    }
                }
                if (z11) {
                    String e10 = e(c3);
                    ta.c cVar = this.f14167c;
                    a.C0286a aVar = new a.C0286a(c3);
                    aVar.f15513a = e10;
                    aVar.b(3);
                    c3 = aVar.a();
                    cVar.b(c3);
                }
            } finally {
                if (b10 != null) {
                    b10.c();
                }
            }
        }
        if (z10) {
            a.C0286a aVar2 = new a.C0286a(c3);
            aVar2.f15515c = null;
            c3 = aVar2.a();
        }
        h(c3);
        this.f14173i.execute(new c(this, z10));
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e2, code lost:
        r18 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0194, code lost:
        r11 = r18;
        r8 = true;
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a9, code lost:
        r13.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b A[Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }, ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }]), Splitter:B:16:0x005f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ta.a c(ta.a r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            m9.f r2 = r1.f14165a
            r2.a()
            m9.i r2 = r2.f11333c
            java.lang.String r2 = r2.f11343a
            java.lang.String r3 = r0.f15506b
            m9.f r4 = r1.f14165a
            r4.a()
            m9.i r4 = r4.f11333c
            java.lang.String r4 = r4.f11349g
            java.lang.String r5 = r0.f15509e
            ua.c r6 = r1.f14166b
            ua.e r7 = r6.f15954c
            monitor-enter(r7)
            int r8 = r7.f15959c     // Catch:{ all -> 0x01c9 }
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x0039
            ra.m r8 = r7.f15957a     // Catch:{ all -> 0x01c9 }
            q4.a r8 = r8.f14185a     // Catch:{ all -> 0x01c9 }
            r8.getClass()     // Catch:{ all -> 0x01c9 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01c9 }
            long r13 = r7.f15958b     // Catch:{ all -> 0x01c9 }
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r8 = r9
            goto L_0x003a
        L_0x0039:
            r8 = r10
        L_0x003a:
            monitor-exit(r7)
            java.lang.String r11 = "Firebase Installations Service is unavailable. Please try again later."
            if (r8 == 0) goto L_0x01c3
            r8 = 2
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r9] = r4
            r12[r10] = r3
            java.lang.String r3 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r3 = java.lang.String.format(r3, r12)
            java.net.URL r3 = ua.c.a(r3)
            r12 = r9
        L_0x0051:
            if (r12 > r10) goto L_0x01bd
            r13 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r13)
            java.net.HttpURLConnection r13 = r6.c(r3, r2)
            java.lang.String r14 = "POST"
            r13.setRequestMethod(r14)     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            java.lang.String r14 = "Authorization"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            r15.<init>()     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            java.lang.String r9 = "FIS_v2 "
            r15.append(r9)     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            r15.append(r5)     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            java.lang.String r9 = r15.toString()     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            r13.addRequestProperty(r14, r9)     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            r13.setDoOutput(r10)     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            ua.c.h(r13)     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            int r9 = r13.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            r7.a(r9)     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            r14 = 200(0xc8, float:2.8E-43)
            if (r9 < r14) goto L_0x008f
            r14 = 300(0x12c, float:4.2E-43)
            if (r9 >= r14) goto L_0x008f
            r14 = r10
            goto L_0x0090
        L_0x008f:
            r14 = 0
        L_0x0090:
            r15 = 0
            if (r14 == 0) goto L_0x00a2
            ua.b r2 = ua.c.f(r13)     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            r18 = r11
            goto L_0x0121
        L_0x009b:
            r0 = move-exception
            goto L_0x01a9
        L_0x009e:
            r9 = r8
            r8 = r10
            goto L_0x01b0
        L_0x00a2:
            ua.c.b(r13, r15, r2, r4)     // Catch:{ IOException | AssertionError -> 0x009e, all -> 0x009b }
            r14 = 401(0x191, float:5.62E-43)
            r16 = 0
            if (r9 == r14) goto L_0x0103
            r14 = 404(0x194, float:5.66E-43)
            if (r9 != r14) goto L_0x00b0
            goto L_0x0103
        L_0x00b0:
            r14 = 429(0x1ad, float:6.01E-43)
            if (r9 == r14) goto L_0x00f3
            r14 = 500(0x1f4, float:7.0E-43)
            if (r9 < r14) goto L_0x00bd
            r14 = 600(0x258, float:8.41E-43)
            if (r9 >= r14) goto L_0x00bd
            goto L_0x009e
        L_0x00bd:
            java.lang.String r9 = "Firebase-Installations"
            java.lang.String r14 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r9, r14)     // Catch:{ IOException | AssertionError -> 0x00e2, all -> 0x009b }
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ IOException | AssertionError -> 0x00e2, all -> 0x009b }
            if (r9 != 0) goto L_0x00cd
            java.lang.String r14 = " tokenExpirationTimestamp"
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r14 = ""
        L_0x00cf:
            boolean r16 = r14.isEmpty()     // Catch:{ IOException | AssertionError -> 0x00e2, all -> 0x009b }
            if (r16 == 0) goto L_0x00e5
            ua.b r14 = new ua.b     // Catch:{ IOException | AssertionError -> 0x00e2, all -> 0x009b }
            r18 = r11
            long r10 = r9.longValue()     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            r14.<init>(r15, r10, r8)     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            r2 = r14
            goto L_0x0121
        L_0x00e2:
            r18 = r11
            goto L_0x00fd
        L_0x00e5:
            r18 = r11
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            java.lang.String r10 = "Missing required properties:"
            java.lang.String r10 = r10.concat(r14)     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            r9.<init>(r10)     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            throw r9     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
        L_0x00f3:
            r18 = r11
            ra.g r9 = new ra.g     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            java.lang.String r10 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r9.<init>(r10)     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            throw r9     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
        L_0x00fd:
            r9 = r8
            r11 = r18
            r8 = 1
            goto L_0x01b0
        L_0x0103:
            r18 = r11
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            if (r9 != 0) goto L_0x010e
            java.lang.String r10 = " tokenExpirationTimestamp"
            goto L_0x0110
        L_0x010e:
            java.lang.String r10 = ""
        L_0x0110:
            boolean r11 = r10.isEmpty()     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            if (r11 == 0) goto L_0x0199
            ua.b r10 = new ua.b     // Catch:{ IOException | AssertionError -> 0x00fd, all -> 0x009b }
            long r8 = r9.longValue()     // Catch:{ IOException | AssertionError -> 0x0194, all -> 0x009b }
            r14 = 3
            r10.<init>(r15, r8, r14)     // Catch:{ IOException | AssertionError -> 0x0194, all -> 0x009b }
            r2 = r10
        L_0x0121:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r3 = r2.f15949c
            int r3 = q.g.c(r3)
            if (r3 == 0) goto L_0x0164
            r8 = 1
            if (r3 == r8) goto L_0x0153
            r2 = 2
            if (r3 != r2) goto L_0x014b
            monitor-enter(r19)
            r1.f14174j = r15     // Catch:{ all -> 0x0147 }
            monitor-exit(r19)
            ta.a$a r2 = new ta.a$a
            r2.<init>(r0)
            r9 = 2
            r2.b(r9)
            ta.a r0 = r2.a()
            return r0
        L_0x0147:
            r0 = move-exception
            r2 = r0
            monitor-exit(r19)
            throw r2
        L_0x014b:
            ra.g r0 = new ra.g
            r11 = r18
            r0.<init>(r11)
            throw r0
        L_0x0153:
            ta.a$a r0 = r20.h()
            java.lang.String r2 = "BAD CONFIG"
            r0.f15519g = r2
            r2 = 5
            r0.b(r2)
            ta.a r0 = r0.a()
            return r0
        L_0x0164:
            ra.m r3 = r1.f14168d
            r3.getClass()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            q4.a r3 = r3.f14185a
            r3.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            long r3 = r4.toSeconds(r5)
            ta.a$a r5 = new ta.a$a
            r5.<init>(r0)
            java.lang.String r0 = r2.f15947a
            r5.f15515c = r0
            long r6 = r2.f15948b
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r5.f15517e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.f15518f = r0
            ta.a r0 = r5.a()
            return r0
        L_0x0194:
            r11 = r18
            r8 = 1
            r9 = 2
            goto L_0x01b0
        L_0x0199:
            r9 = r8
            r11 = r18
            r8 = 1
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x01b0, all -> 0x009b }
            java.lang.String r15 = "Missing required properties:"
            java.lang.String r10 = r15.concat(r10)     // Catch:{ IOException | AssertionError -> 0x01b0, all -> 0x009b }
            r14.<init>(r10)     // Catch:{ IOException | AssertionError -> 0x01b0, all -> 0x009b }
            throw r14     // Catch:{ IOException | AssertionError -> 0x01b0, all -> 0x009b }
        L_0x01a9:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01b0:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r12 = r12 + 1
            r10 = r8
            r8 = r9
            r9 = 0
            goto L_0x0051
        L_0x01bd:
            ra.g r0 = new ra.g
            r0.<init>(r11)
            throw r0
        L_0x01c3:
            ra.g r0 = new ra.g
            r0.<init>(r11)
            throw r0
        L_0x01c9:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.c(ta.a):ta.a");
    }

    public final void d() {
        f fVar = this.f14165a;
        fVar.a();
        q.g("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar.f11333c.f11344b);
        fVar.a();
        q.g("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar.f11333c.f11349g);
        fVar.a();
        q.g("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar.f11333c.f11343a);
        fVar.a();
        String str = fVar.f11333c.f11344b;
        Pattern pattern = m.f14183c;
        q.b(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fVar.a();
        q.b(m.f14183c.matcher(fVar.f11333c.f11343a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f11332b) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e(ta.a r6) {
        /*
            r5 = this;
            m9.f r0 = r5.f14165a
            r0.a()
            java.lang.String r0 = r0.f11332b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            m9.f r0 = r5.f14165a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f11332b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x001e:
            int r6 = r6.f15507c
            r0 = 1
            if (r6 != r0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x0031
        L_0x0027:
            ra.k r6 = r5.f14170f
            r6.getClass()
            java.lang.String r6 = ra.k.a()
            return r6
        L_0x0031:
            t9.p<ta.b> r6 = r5.f14169e
            java.lang.Object r6 = r6.get()
            ta.b r6 = (ta.b) r6
            android.content.SharedPreferences r0 = r6.f15521a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f15521a     // Catch:{ all -> 0x0065 }
            monitor-enter(r1)     // Catch:{ all -> 0x0065 }
            android.content.SharedPreferences r2 = r6.f15521a     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x004d
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            goto L_0x0052
        L_0x004d:
            java.lang.String r2 = r6.a()     // Catch:{ all -> 0x0065 }
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
        L_0x0052:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0061
            ra.k r6 = r5.f14170f
            r6.getClass()
            java.lang.String r2 = ra.k.a()
        L_0x0061:
            return r2
        L_0x0062:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            throw r6     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.e(ta.a):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r9.startsWith("{") == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = new org.json.JSONObject(r9).getString("token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019e, code lost:
        r15.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A[Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }, ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }]), Splitter:B:43:0x00c9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ta.a f(ta.a r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = r0.f15506b
            r3 = 4
            r5 = 0
            if (r2 == 0) goto L_0x006a
            int r2 = r2.length()
            r6 = 11
            if (r2 != r6) goto L_0x006a
            t9.p<ta.b> r2 = r1.f14169e
            java.lang.Object r2 = r2.get()
            ta.b r2 = (ta.b) r2
            android.content.SharedPreferences r6 = r2.f15521a
            monitor-enter(r6)
            java.lang.String[] r7 = ta.b.f15520c     // Catch:{ all -> 0x005e }
            r8 = 0
        L_0x0020:
            if (r8 >= r3) goto L_0x0066
            r9 = r7[r8]     // Catch:{ all -> 0x005e }
            java.lang.String r10 = r2.f15522b     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            java.lang.String r12 = "|T|"
            r11.<init>(r12)     // Catch:{ all -> 0x005e }
            r11.append(r10)     // Catch:{ all -> 0x005e }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x005e }
            r11.append(r9)     // Catch:{ all -> 0x005e }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x005e }
            android.content.SharedPreferences r10 = r2.f15521a     // Catch:{ all -> 0x005e }
            java.lang.String r9 = r10.getString(r9, r5)     // Catch:{ all -> 0x005e }
            if (r9 == 0) goto L_0x0063
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x005e }
            if (r10 != 0) goto L_0x0063
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0060
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061 }
            r2.<init>(r9)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r7 = "token"
            java.lang.String r5 = r2.getString(r7)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0061
        L_0x005e:
            r0 = move-exception
            goto L_0x0068
        L_0x0060:
            r5 = r9
        L_0x0061:
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            goto L_0x006a
        L_0x0063:
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0066:
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            goto L_0x006a
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x005e }
            throw r0
        L_0x006a:
            ua.c r2 = r1.f14166b
            m9.f r6 = r1.f14165a
            r6.a()
            m9.i r6 = r6.f11333c
            java.lang.String r6 = r6.f11343a
            java.lang.String r7 = r0.f15506b
            m9.f r8 = r1.f14165a
            r8.a()
            m9.i r8 = r8.f11333c
            java.lang.String r8 = r8.f11349g
            m9.f r9 = r1.f14165a
            r9.a()
            m9.i r9 = r9.f11333c
            java.lang.String r9 = r9.f11344b
            ua.e r10 = r2.f15954c
            monitor-enter(r10)
            int r11 = r10.f15959c     // Catch:{ all -> 0x01bc }
            r12 = 1
            if (r11 == 0) goto L_0x00a5
            ra.m r11 = r10.f15957a     // Catch:{ all -> 0x01bc }
            q4.a r11 = r11.f14185a     // Catch:{ all -> 0x01bc }
            r11.getClass()     // Catch:{ all -> 0x01bc }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bc }
            long r3 = r10.f15958b     // Catch:{ all -> 0x01bc }
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r3 = 0
            goto L_0x00a6
        L_0x00a5:
            r3 = r12
        L_0x00a6:
            monitor-exit(r10)
            java.lang.String r4 = "Firebase Installations Service is unavailable. Please try again later."
            if (r3 == 0) goto L_0x01b6
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r13 = 0
            r3[r13] = r8
            java.lang.String r14 = "projects/%s/installations"
            java.lang.String r3 = java.lang.String.format(r14, r3)
            java.net.URL r3 = ua.c.a(r3)
            r14 = r13
        L_0x00bb:
            if (r14 > r12) goto L_0x01b0
            r15 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r15)
            java.net.HttpURLConnection r15 = r2.c(r3, r6)
            java.lang.String r11 = "POST"
            r15.setRequestMethod(r11)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            r15.setDoOutput(r12)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            if (r5 == 0) goto L_0x00da
            java.lang.String r11 = "x-goog-fis-android-iid-migration-auth"
            r15.addRequestProperty(r11, r5)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            goto L_0x00da
        L_0x00d7:
            r0 = move-exception
            goto L_0x019e
        L_0x00da:
            ua.c.g(r15, r7, r9)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            int r11 = r15.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            r10.a(r11)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r11 < r13) goto L_0x00ee
            r13 = 300(0x12c, float:4.2E-43)
            if (r11 >= r13) goto L_0x00ee
            r13 = r12
            goto L_0x00ef
        L_0x00ee:
            r13 = 0
        L_0x00ef:
            if (r13 == 0) goto L_0x00fc
            ua.a r2 = ua.c.e(r15)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x012c
        L_0x00fc:
            ua.c.b(r15, r9, r6, r8)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            r13 = 429(0x1ad, float:6.01E-43)
            if (r11 == r13) goto L_0x0195
            r13 = 500(0x1f4, float:7.0E-43)
            if (r11 < r13) goto L_0x010d
            r13 = 600(0x258, float:8.41E-43)
            if (r11 >= r13) goto L_0x010d
            goto L_0x01a5
        L_0x010d:
            java.lang.String r11 = "Firebase-Installations"
            java.lang.String r13 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r11, r13)     // Catch:{ IOException | AssertionError -> 0x0193, all -> 0x00d7 }
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r21 = 2
            ua.a r11 = new ua.a     // Catch:{ IOException | AssertionError -> 0x0193, all -> 0x00d7 }
            r16 = r11
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x0193, all -> 0x00d7 }
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r11
        L_0x012c:
            int r3 = r2.f15946e
            int r3 = q.g.c(r3)
            if (r3 == 0) goto L_0x014f
            if (r3 != r12) goto L_0x0147
            ta.a$a r0 = r23.h()
            java.lang.String r2 = "BAD CONFIG"
            r0.f15519g = r2
            r2 = 5
            r0.b(r2)
            ta.a r0 = r0.a()
            return r0
        L_0x0147:
            ra.g r0 = new ra.g
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            r0.<init>(r2)
            throw r0
        L_0x014f:
            java.lang.String r3 = r2.f15943b
            java.lang.String r4 = r2.f15944c
            ra.m r5 = r1.f14168d
            r5.getClass()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            q4.a r5 = r5.f14185a
            r5.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r6.toSeconds(r7)
            ua.f r7 = r2.f15945d
            java.lang.String r7 = r7.b()
            ua.f r2 = r2.f15945d
            long r8 = r2.c()
            ta.a$a r2 = new ta.a$a
            r2.<init>(r0)
            r2.f15513a = r3
            r11 = 4
            r2.b(r11)
            r2.f15515c = r7
            r2.f15516d = r4
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2.f15517e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.f15518f = r0
            ta.a r0 = r2.a()
            return r0
        L_0x0193:
            r11 = 4
            goto L_0x01a5
        L_0x0195:
            r11 = 4
            ra.g r13 = new ra.g     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            java.lang.String r11 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r13.<init>(r11)     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
            throw r13     // Catch:{ IOException | AssertionError -> 0x01a5, all -> 0x00d7 }
        L_0x019e:
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01a5:
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r14 = r14 + 1
            r13 = 0
            goto L_0x00bb
        L_0x01b0:
            ra.g r0 = new ra.g
            r0.<init>(r4)
            throw r0
        L_0x01b6:
            ra.g r0 = new ra.g
            r0.<init>(r4)
            throw r0
        L_0x01bc:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.e.f(ta.a):ta.a");
    }

    public final void g(Exception exc) {
        synchronized (this.f14171g) {
            Iterator it = this.f14176l.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final Task<String> getId() {
        String str;
        d();
        synchronized (this) {
            str = this.f14174j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i iVar = new i(taskCompletionSource);
        synchronized (this.f14171g) {
            this.f14176l.add(iVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f14172h.execute(new androidx.activity.b(this, 10));
        return task;
    }

    public final void h(a aVar) {
        synchronized (this.f14171g) {
            Iterator it = this.f14176l.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).b(aVar)) {
                    it.remove();
                }
            }
        }
    }
}
