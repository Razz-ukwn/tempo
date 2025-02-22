package n4;

import android.annotation.TargetApi;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {
    public final long B;
    public final int C;
    public long D = 0;
    public BufferedWriter E;
    public final LinkedHashMap<String, d> F = new LinkedHashMap<>(0, 0.75f, true);
    public int G;
    public long H = 0;
    public final ThreadPoolExecutor I = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final C0223a J = new C0223a();

    /* renamed from: a  reason: collision with root package name */
    public final File f11571a;

    /* renamed from: b  reason: collision with root package name */
    public final File f11572b;

    /* renamed from: c  reason: collision with root package name */
    public final File f11573c;

    /* renamed from: d  reason: collision with root package name */
    public final File f11574d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11575e;

    /* renamed from: n4.a$a  reason: collision with other inner class name */
    public class C0223a implements Callable<Void> {
        public C0223a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() {
            /*
                r3 = this;
                n4.a r0 = n4.a.this
                monitor-enter(r0)
                n4.a r1 = n4.a.this     // Catch:{ all -> 0x0023 }
                java.io.BufferedWriter r2 = r1.E     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.Q()     // Catch:{ all -> 0x0023 }
                n4.a r1 = n4.a.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.s()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                n4.a r1 = n4.a.this     // Catch:{ all -> 0x0023 }
                r1.K()     // Catch:{ all -> 0x0023 }
                n4.a r1 = n4.a.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.G = r2     // Catch:{ all -> 0x0023 }
            L_0x0020:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            L_0x0021:
                r0 = 0
                return r0
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n4.a.C0223a.call():java.lang.Object");
        }
    }

    public static final class b implements ThreadFactory {
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f11577a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f11578b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f11579c;

        public c(d dVar) {
            this.f11577a = dVar;
            this.f11578b = dVar.f11585e ? null : new boolean[a.this.C];
        }

        public final void a() {
            a.c(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                d dVar = this.f11577a;
                if (dVar.f11586f == this) {
                    if (!dVar.f11585e) {
                        this.f11578b[0] = true;
                    }
                    file = dVar.f11584d[0];
                    a.this.f11571a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f11581a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f11582b;

        /* renamed from: c  reason: collision with root package name */
        public final File[] f11583c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f11584d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11585e;

        /* renamed from: f  reason: collision with root package name */
        public c f11586f;

        public d(String str) {
            this.f11581a = str;
            int i8 = a.this.C;
            this.f11582b = new long[i8];
            this.f11583c = new File[i8];
            this.f11584d = new File[i8];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < a.this.C; i10++) {
                sb2.append(i10);
                File[] fileArr = this.f11583c;
                String sb3 = sb2.toString();
                File file = a.this.f11571a;
                fileArr[i10] = new File(file, sb3);
                sb2.append(".tmp");
                this.f11584d[i10] = new File(file, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb2 = new StringBuilder();
            for (long append : this.f11582b) {
                sb2.append(' ');
                sb2.append(append);
            }
            return sb2.toString();
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f11588a;

        public e(File[] fileArr) {
            this.f11588a = fileArr;
        }
    }

    public a(File file, long j10) {
        File file2 = file;
        this.f11571a = file2;
        this.f11575e = 1;
        this.f11572b = new File(file2, "journal");
        this.f11573c = new File(file2, "journal.tmp");
        this.f11574d = new File(file2, "journal.bkp");
        this.C = 1;
        this.B = j10;
    }

    public static void L(File file, File file2, boolean z10) {
        if (z10) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(n4.a r9, n4.a.c r10, boolean r11) {
        /*
            monitor-enter(r9)
            n4.a$d r0 = r10.f11577a     // Catch:{ all -> 0x00f9 }
            n4.a$c r1 = r0.f11586f     // Catch:{ all -> 0x00f9 }
            if (r1 != r10) goto L_0x00f3
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.f11585e     // Catch:{ all -> 0x00f9 }
            if (r2 != 0) goto L_0x0046
            r2 = r1
        L_0x000f:
            int r3 = r9.C     // Catch:{ all -> 0x00f9 }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.f11578b     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x002c
            java.io.File[] r3 = r0.f11584d     // Catch:{ all -> 0x00f9 }
            r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f9 }
            if (r3 != 0) goto L_0x0029
            r10.a()     // Catch:{ all -> 0x00f9 }
            monitor-exit(r9)
            goto L_0x00f2
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.a()     // Catch:{ all -> 0x00f9 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r11.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00f9 }
            r11.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f9 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x0046:
            int r10 = r9.C     // Catch:{ all -> 0x00f9 }
            if (r1 >= r10) goto L_0x0076
            java.io.File[] r10 = r0.f11584d     // Catch:{ all -> 0x00f9 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x0073
            java.io.File[] r2 = r0.f11583c     // Catch:{ all -> 0x00f9 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f9 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f11582b     // Catch:{ all -> 0x00f9 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f9 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f11582b     // Catch:{ all -> 0x00f9 }
            r10[r1] = r5     // Catch:{ all -> 0x00f9 }
            long r7 = r9.D     // Catch:{ all -> 0x00f9 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.D = r7     // Catch:{ all -> 0x00f9 }
            goto L_0x0073
        L_0x0070:
            e(r10)     // Catch:{ all -> 0x00f9 }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.G     // Catch:{ all -> 0x00f9 }
            r1 = 1
            int r10 = r10 + r1
            r9.G = r10     // Catch:{ all -> 0x00f9 }
            r10 = 0
            r0.f11586f = r10     // Catch:{ all -> 0x00f9 }
            boolean r10 = r0.f11585e     // Catch:{ all -> 0x00f9 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b8
            r0.f11585e = r1     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            r10.append(r3)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.f11581a     // Catch:{ all -> 0x00f9 }
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x00f9 }
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            r10.append(r2)     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x00d7
            long r10 = r9.H     // Catch:{ all -> 0x00f9 }
            r1 = 1
            long r10 = r10 + r1
            r9.H = r10     // Catch:{ all -> 0x00f9 }
            r0.getClass()     // Catch:{ all -> 0x00f9 }
            goto L_0x00d7
        L_0x00b8:
            java.util.LinkedHashMap<java.lang.String, n4.a$d> r10 = r9.F     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f11581a     // Catch:{ all -> 0x00f9 }
            r10.remove(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            r10.append(r3)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f11581a     // Catch:{ all -> 0x00f9 }
            r10.append(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            r10.append(r2)     // Catch:{ all -> 0x00f9 }
        L_0x00d7:
            java.io.BufferedWriter r10 = r9.E     // Catch:{ all -> 0x00f9 }
            p(r10)     // Catch:{ all -> 0x00f9 }
            long r10 = r9.D     // Catch:{ all -> 0x00f9 }
            long r0 = r9.B     // Catch:{ all -> 0x00f9 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ea
            boolean r10 = r9.s()     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x00f1
        L_0x00ea:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.I     // Catch:{ all -> 0x00f9 }
            n4.a$a r11 = r9.J     // Catch:{ all -> 0x00f9 }
            r10.submit(r11)     // Catch:{ all -> 0x00f9 }
        L_0x00f1:
            monitor-exit(r9)
        L_0x00f2:
            return
        L_0x00f3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            r10.<init>()     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a.c(n4.a, n4.a$c, boolean):void");
    }

    @TargetApi(26)
    public static void d(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void e(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void p(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a u(File file, long j10) {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    L(file2, file3, false);
                }
            }
            a aVar = new a(file, j10);
            if (aVar.f11572b.exists()) {
                try {
                    aVar.D();
                    aVar.z();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.f11571a);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j10);
            aVar2.K();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r10.G = r1 - r10.F.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r2.f11593e == -1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r0 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r10.E = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r4, true), n4.c.f11595a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0062 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0062=Splitter:B:16:0x0062, B:29:0x0093=Splitter:B:29:0x0093} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            n4.b r2 = new n4.b
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = r10.f11572b
            r3.<init>(r4)
            java.nio.charset.Charset r5 = n4.c.f11595a
            r2.<init>(r3, r5)
            java.lang.String r3 = r2.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = r2.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r2.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = r2.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = r2.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = "libcore.io.DiskLruCache"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0093
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r9 == 0) goto L_0x0093
            int r9 = r10.f11575e     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0091 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            int r6 = r10.C     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0091 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0091 }
            if (r6 == 0) goto L_0x0093
            r0 = 0
            r1 = r0
        L_0x0058:
            java.lang.String r3 = r2.c()     // Catch:{ EOFException -> 0x0062 }
            r10.F(r3)     // Catch:{ EOFException -> 0x0062 }
            int r1 = r1 + 1
            goto L_0x0058
        L_0x0062:
            java.util.LinkedHashMap<java.lang.String, n4.a$d> r3 = r10.F     // Catch:{ all -> 0x0091 }
            int r3 = r3.size()     // Catch:{ all -> 0x0091 }
            int r1 = r1 - r3
            r10.G = r1     // Catch:{ all -> 0x0091 }
            int r1 = r2.f11593e     // Catch:{ all -> 0x0091 }
            r3 = -1
            r5 = 1
            if (r1 != r3) goto L_0x0072
            r0 = r5
        L_0x0072:
            if (r0 == 0) goto L_0x0078
            r10.K()     // Catch:{ all -> 0x0091 }
            goto L_0x008b
        L_0x0078:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0091 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0091 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0091 }
            java.nio.charset.Charset r4 = n4.c.f11595a     // Catch:{ all -> 0x0091 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            r0.<init>(r1)     // Catch:{ all -> 0x0091 }
            r10.E = r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            r2.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            r0 = move-exception
            goto L_0x00bc
        L_0x0093:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r6.<init>(r1)     // Catch:{ all -> 0x0091 }
            r6.append(r3)     // Catch:{ all -> 0x0091 }
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            r6.append(r5)     // Catch:{ all -> 0x0091 }
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            r6.append(r7)     // Catch:{ all -> 0x0091 }
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            r6.append(r8)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "]"
            r6.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0091 }
            r4.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r4     // Catch:{ all -> 0x0091 }
        L_0x00bc:
            r2.close()     // Catch:{ RuntimeException -> 0x00c0, Exception -> 0x00bf }
        L_0x00bf:
            throw r0
        L_0x00c0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a.D():void");
    }

    public final void F(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i8 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i8);
            LinkedHashMap<String, d> linkedHashMap = this.F;
            if (indexOf2 == -1) {
                str2 = str.substring(i8);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i8, indexOf2);
            }
            d dVar = linkedHashMap.get(str2);
            if (dVar == null) {
                dVar = new d(str2);
                linkedHashMap.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f11585e = true;
                dVar.f11586f = null;
                if (split.length == a.this.C) {
                    int i10 = 0;
                    while (i10 < split.length) {
                        try {
                            dVar.f11582b[i10] = Long.parseLong(split[i10]);
                            i10++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f11586f = new c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void K() {
        BufferedWriter bufferedWriter = this.E;
        if (bufferedWriter != null) {
            d(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11573c), c.f11595a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f11575e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.C));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (d next : this.F.values()) {
                if (next.f11586f != null) {
                    bufferedWriter2.write("DIRTY " + next.f11581a + 10);
                } else {
                    bufferedWriter2.write("CLEAN " + next.f11581a + next.a() + 10);
                }
            }
            d(bufferedWriter2);
            if (this.f11572b.exists()) {
                L(this.f11572b, this.f11574d, true);
            }
            L(this.f11573c, this.f11572b, false);
            this.f11574d.delete();
            this.E = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11572b, true), c.f11595a));
        } catch (Throwable th) {
            d(bufferedWriter2);
            throw th;
        }
    }

    public final void Q() {
        while (this.D > this.B) {
            String str = (String) this.F.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.E != null) {
                    d dVar = this.F.get(str);
                    if (dVar != null) {
                        if (dVar.f11586f == null) {
                            for (int i8 = 0; i8 < this.C; i8++) {
                                File file = dVar.f11583c[i8];
                                if (file.exists()) {
                                    if (!file.delete()) {
                                        throw new IOException("failed to delete " + file);
                                    }
                                }
                                long j10 = this.D;
                                long[] jArr = dVar.f11582b;
                                this.D = j10 - jArr[i8];
                                jArr[i8] = 0;
                            }
                            this.G++;
                            this.E.append("REMOVE");
                            this.E.append(' ');
                            this.E.append(str);
                            this.E.append(10);
                            this.F.remove(str);
                            if (s()) {
                                this.I.submit(this.J);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    public final synchronized void close() {
        if (this.E != null) {
            Iterator it = new ArrayList(this.F.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f11586f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            Q();
            d(this.E);
            this.E = null;
        }
    }

    public final c j(String str) {
        synchronized (this) {
            if (this.E != null) {
                d dVar = this.F.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.F.put(str, dVar);
                } else if (dVar.f11586f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f11586f = cVar;
                this.E.append("DIRTY");
                this.E.append(' ');
                this.E.append(str);
                this.E.append(10);
                p(this.E);
                return cVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized e q(String str) {
        if (this.E != null) {
            d dVar = this.F.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f11585e) {
                return null;
            }
            for (File exists : dVar.f11583c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.G++;
            this.E.append("READ");
            this.E.append(' ');
            this.E.append(str);
            this.E.append(10);
            if (s()) {
                this.I.submit(this.J);
            }
            return new e(dVar.f11583c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean s() {
        int i8 = this.G;
        return i8 >= 2000 && i8 >= this.F.size();
    }

    public final void z() {
        e(this.f11573c);
        Iterator<d> it = this.F.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f11586f;
            int i8 = this.C;
            int i10 = 0;
            if (cVar == null) {
                while (i10 < i8) {
                    this.D += next.f11582b[i10];
                    i10++;
                }
            } else {
                next.f11586f = null;
                while (i10 < i8) {
                    e(next.f11583c[i10]);
                    e(next.f11584d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }
}
