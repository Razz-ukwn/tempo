package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class f {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1822j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile f f1823k;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f1824a;

    /* renamed from: b  reason: collision with root package name */
    public final o.b f1825b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1826c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1827d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1828e;

    /* renamed from: f  reason: collision with root package name */
    public final h f1829f;

    /* renamed from: g  reason: collision with root package name */
    public final d f1830g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1831h;

    /* renamed from: i  reason: collision with root package name */
    public final d f1832i;

    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile k f1833b;

        /* renamed from: c  reason: collision with root package name */
        public volatile o f1834c;

        public a(f fVar) {
            super(fVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f1835a;

        public b(f fVar) {
            this.f1835a = fVar;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final h f1836a;

        /* renamed from: b  reason: collision with root package name */
        public int f1837b = 0;

        /* renamed from: c  reason: collision with root package name */
        public final d f1838c = new d();

        public c(h hVar) {
            this.f1836a = hVar;
        }
    }

    public static class d implements j {
    }

    public interface e {
    }

    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    public static abstract class C0024f {
        public void a() {
        }
    }

    public static class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f1839a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1840b;

        public g(List list, int i8, Throwable th) {
            if (list != null) {
                this.f1839a = new ArrayList(list);
                this.f1840b = i8;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        public final void run() {
            ArrayList arrayList = this.f1839a;
            int size = arrayList.size();
            int i8 = 0;
            if (this.f1840b != 1) {
                while (i8 < size) {
                    ((C0024f) arrayList.get(i8)).getClass();
                    i8++;
                }
                return;
            }
            while (i8 < size) {
                ((C0024f) arrayList.get(i8)).a();
                i8++;
            }
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(o oVar);
    }

    public interface j {
    }

    public f(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1824a = reentrantReadWriteLock;
        h hVar = aVar.f1836a;
        this.f1829f = hVar;
        int i8 = aVar.f1837b;
        this.f1831h = i8;
        this.f1832i = aVar.f1838c;
        this.f1827d = new Handler(Looper.getMainLooper());
        this.f1825b = new o.b();
        this.f1830g = new d();
        a aVar2 = new a(this);
        this.f1828e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i8 == 0) {
            try {
                this.f1826c = 0;
            } catch (Throwable th) {
                this.f1824a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.a(new e(aVar2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static f a() {
        f fVar;
        synchronized (f1822j) {
            fVar = f1823k;
            if (!(fVar != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return fVar;
    }

    public final int b() {
        this.f1824a.readLock().lock();
        try {
            return this.f1826c;
        } finally {
            this.f1824a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z10 = true;
        if (this.f1831h == 1) {
            if (b() != 1) {
                z10 = false;
            }
            if (!z10) {
                this.f1824a.writeLock().lock();
                try {
                    if (this.f1826c != 0) {
                        this.f1826c = 0;
                        this.f1824a.writeLock().unlock();
                        a aVar = this.f1828e;
                        f fVar = aVar.f1835a;
                        try {
                            fVar.f1829f.a(new e(aVar));
                        } catch (Throwable th) {
                            fVar.d(th);
                        }
                    }
                } finally {
                    this.f1824a.writeLock().unlock();
                }
            }
        } else {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1824a.writeLock().lock();
        try {
            this.f1826c = 2;
            arrayList.addAll(this.f1825b);
            this.f1825b.clear();
            this.f1824a.writeLock().unlock();
            this.f1827d.post(new g(arrayList, this.f1826c, th));
        } catch (Throwable th2) {
            this.f1824a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f1824a.writeLock().lock();
        try {
            this.f1826c = 1;
            arrayList.addAll(this.f1825b);
            this.f1825b.clear();
            this.f1824a.writeLock().unlock();
            this.f1827d.post(new g(arrayList, this.f1826c, (Throwable) null));
        } catch (Throwable th) {
            this.f1824a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e A[Catch:{ all -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac A[Catch:{ all -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence f(int r11, int r12, java.lang.CharSequence r13) {
        /*
            r10 = this;
            int r0 = r10.b()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x000a
            r0 = r1
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 == 0) goto L_0x00f7
            if (r11 < 0) goto L_0x00ef
            if (r12 < 0) goto L_0x00e7
            if (r11 > r12) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            java.lang.String r3 = "start should be <= than end"
            b7.a.o(r0, r3)
            r0 = 0
            if (r13 != 0) goto L_0x001f
            return r0
        L_0x001f:
            int r3 = r13.length()
            if (r11 > r3) goto L_0x0027
            r3 = r1
            goto L_0x0028
        L_0x0027:
            r3 = r2
        L_0x0028:
            java.lang.String r4 = "start should be < than charSequence length"
            b7.a.o(r3, r4)
            int r3 = r13.length()
            if (r12 > r3) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            java.lang.String r3 = "end should be < than charSequence length"
            b7.a.o(r1, r3)
            int r1 = r13.length()
            if (r1 == 0) goto L_0x00e6
            if (r11 != r12) goto L_0x0044
            goto L_0x00e6
        L_0x0044:
            r8 = 0
            androidx.emoji2.text.f$a r1 = r10.f1828e
            androidx.emoji2.text.k r3 = r1.f1833b
            r3.getClass()
            boolean r1 = r13 instanceof androidx.emoji2.text.p
            if (r1 == 0) goto L_0x0056
            r4 = r13
            androidx.emoji2.text.p r4 = (androidx.emoji2.text.p) r4
            r4.a()
        L_0x0056:
            java.lang.Class<androidx.emoji2.text.l> r4 = androidx.emoji2.text.l.class
            if (r1 != 0) goto L_0x0076
            boolean r5 = r13 instanceof android.text.Spannable     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x005f
            goto L_0x0076
        L_0x005f:
            boolean r5 = r13 instanceof android.text.Spanned     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x007e
            r5 = r13
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch:{ all -> 0x00dd }
            int r6 = r11 + -1
            int r7 = r12 + 1
            int r5 = r5.nextSpanTransition(r6, r7, r4)     // Catch:{ all -> 0x00dd }
            if (r5 > r12) goto L_0x007e
            androidx.emoji2.text.s r0 = new androidx.emoji2.text.s     // Catch:{ all -> 0x00dd }
            r0.<init>((java.lang.CharSequence) r13)     // Catch:{ all -> 0x00dd }
            goto L_0x007e
        L_0x0076:
            androidx.emoji2.text.s r0 = new androidx.emoji2.text.s     // Catch:{ all -> 0x00dd }
            r5 = r13
            android.text.Spannable r5 = (android.text.Spannable) r5     // Catch:{ all -> 0x00dd }
            r0.<init>((android.text.Spannable) r5)     // Catch:{ all -> 0x00dd }
        L_0x007e:
            if (r0 == 0) goto L_0x00a8
            java.lang.Object[] r4 = r0.getSpans(r11, r12, r4)     // Catch:{ all -> 0x00dd }
            androidx.emoji2.text.l[] r4 = (androidx.emoji2.text.l[]) r4     // Catch:{ all -> 0x00dd }
            if (r4 == 0) goto L_0x00a8
            int r5 = r4.length     // Catch:{ all -> 0x00dd }
            if (r5 <= 0) goto L_0x00a8
            int r5 = r4.length     // Catch:{ all -> 0x00dd }
        L_0x008c:
            if (r2 >= r5) goto L_0x00a8
            r6 = r4[r2]     // Catch:{ all -> 0x00dd }
            int r7 = r0.getSpanStart(r6)     // Catch:{ all -> 0x00dd }
            int r9 = r0.getSpanEnd(r6)     // Catch:{ all -> 0x00dd }
            if (r7 == r12) goto L_0x009d
            r0.removeSpan(r6)     // Catch:{ all -> 0x00dd }
        L_0x009d:
            int r11 = java.lang.Math.min(r7, r11)     // Catch:{ all -> 0x00dd }
            int r12 = java.lang.Math.max(r9, r12)     // Catch:{ all -> 0x00dd }
            int r2 = r2 + 1
            goto L_0x008c
        L_0x00a8:
            r5 = r11
            r6 = r12
            if (r5 == r6) goto L_0x00d4
            int r11 = r13.length()     // Catch:{ all -> 0x00dd }
            if (r5 < r11) goto L_0x00b3
            goto L_0x00d4
        L_0x00b3:
            r7 = 2147483647(0x7fffffff, float:NaN)
            androidx.emoji2.text.k$a r9 = new androidx.emoji2.text.k$a     // Catch:{ all -> 0x00dd }
            androidx.emoji2.text.f$j r11 = r3.f1847a     // Catch:{ all -> 0x00dd }
            r9.<init>(r0, r11)     // Catch:{ all -> 0x00dd }
            r4 = r13
            java.lang.Object r11 = r3.c(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00dd }
            androidx.emoji2.text.s r11 = (androidx.emoji2.text.s) r11     // Catch:{ all -> 0x00dd }
            if (r11 == 0) goto L_0x00d1
            android.text.Spannable r11 = r11.f1891b     // Catch:{ all -> 0x00dd }
            if (r1 == 0) goto L_0x00cf
            androidx.emoji2.text.p r13 = (androidx.emoji2.text.p) r13
            r13.b()
        L_0x00cf:
            r13 = r11
            goto L_0x00dc
        L_0x00d1:
            if (r1 == 0) goto L_0x00dc
            goto L_0x00d6
        L_0x00d4:
            if (r1 == 0) goto L_0x00dc
        L_0x00d6:
            r11 = r13
            androidx.emoji2.text.p r11 = (androidx.emoji2.text.p) r11
            r11.b()
        L_0x00dc:
            return r13
        L_0x00dd:
            r11 = move-exception
            if (r1 == 0) goto L_0x00e5
            androidx.emoji2.text.p r13 = (androidx.emoji2.text.p) r13
            r13.b()
        L_0x00e5:
            throw r11
        L_0x00e6:
            return r13
        L_0x00e7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "end cannot be negative"
            r11.<init>(r12)
            throw r11
        L_0x00ef:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "start cannot be negative"
            r11.<init>(r12)
            throw r11
        L_0x00f7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not initialized yet"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.f.f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(C0024f fVar) {
        if (fVar != null) {
            this.f1824a.writeLock().lock();
            try {
                if (this.f1826c != 1) {
                    if (this.f1826c != 2) {
                        this.f1825b.add(fVar);
                    }
                }
                this.f1827d.post(new g(Arrays.asList(new C0024f[]{fVar}), this.f1826c, (Throwable) null));
            } finally {
                this.f1824a.writeLock().unlock();
            }
        } else {
            throw new NullPointerException("initCallback cannot be null");
        }
    }

    public final void h(EditorInfo editorInfo) {
        boolean z10 = true;
        if (b() != 1) {
            z10 = false;
        }
        if (z10 && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a aVar = this.f1828e;
            aVar.getClass();
            Bundle bundle = editorInfo.extras;
            q2.b bVar = aVar.f1834c.f1875a;
            int a10 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a10 != 0 ? bVar.f12831b.getInt(a10 + bVar.f12830a) : 0);
            Bundle bundle2 = editorInfo.extras;
            aVar.f1835a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }
}
