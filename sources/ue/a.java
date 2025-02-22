package ue;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class a extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final List<Throwable> f16025a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16026b;

    /* renamed from: c  reason: collision with root package name */
    public C0295a f16027c;

    /* renamed from: ue.a$a  reason: collision with other inner class name */
    public static final class C0295a extends RuntimeException {
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public static abstract class b {
        public abstract void a(String str);
    }

    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final PrintStream f16028a;

        public c(PrintStream printStream) {
            this.f16028a = printStream;
        }

        public final void a(String str) {
            this.f16028a.println(str);
        }
    }

    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final PrintWriter f16029a;

        public d(PrintWriter printWriter) {
            this.f16029a = printWriter;
        }

        public final void a(String str) {
            this.f16029a.println(str);
        }
    }

    public a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof a) {
                    linkedHashSet.addAll(((a) th).f16025a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f16025a = unmodifiableList;
            this.f16026b = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public static void a(StringBuilder sb2, Throwable th, String str) {
        sb2.append(str);
        sb2.append(th);
        sb2.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(append);
            sb2.append(10);
        }
        if (th.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th.getCause(), "");
        }
    }

    public final void b(b bVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(append);
            sb2.append(10);
        }
        int i8 = 1;
        for (Throwable a10 : this.f16025a) {
            sb2.append("  ComposedException ");
            sb2.append(i8);
            sb2.append(" :\n");
            a(sb2, a10, "\t");
            i8++;
        }
        bVar.a(sb2.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|(1:(1:13)(1:(2:14|(1:51)(1:(2:52|17)(1:18)))))(0)|19|(4:22|(2:24|54)(2:25|55)|53|20)|26|27|28|29|(1:47)(1:(2:32|48)(1:(2:33|(1:(3:56|36|50))(1:49))))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0016 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            ue.a$a r0 = r8.f16027c     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0082
            ue.a$a r0 = new ue.a$a     // Catch:{ all -> 0x0086 }
            r0.<init>()     // Catch:{ all -> 0x0086 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0086 }
            r1.<init>()     // Catch:{ all -> 0x0086 }
            java.util.List<java.lang.Throwable> r2 = r8.f16025a     // Catch:{ all -> 0x0086 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0086 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0086 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0086 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0086 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0086 }
            r5.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.Throwable r6 = r4.getCause()     // Catch:{ all -> 0x0086 }
            if (r6 == 0) goto L_0x0048
            if (r6 != r4) goto L_0x003a
            goto L_0x0048
        L_0x003a:
            r5.add(r6)     // Catch:{ all -> 0x0086 }
            java.lang.Throwable r7 = r6.getCause()     // Catch:{ all -> 0x0086 }
            if (r7 == 0) goto L_0x0048
            if (r7 != r6) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r6 = r7
            goto L_0x003a
        L_0x0048:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0086 }
        L_0x004c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0086 }
            if (r6 == 0) goto L_0x006a
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0086 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0086 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0086 }
            if (r7 == 0) goto L_0x0066
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0086 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0086 }
            goto L_0x004c
        L_0x0066:
            r1.add(r6)     // Catch:{ all -> 0x0086 }
            goto L_0x004c
        L_0x006a:
            r3.initCause(r4)     // Catch:{ all -> 0x006d }
        L_0x006d:
            java.lang.Throwable r4 = r3.getCause()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0016
            if (r3 != r4) goto L_0x0076
            goto L_0x0016
        L_0x0076:
            r3 = r4
            java.lang.Throwable r4 = r3.getCause()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0016
            if (r4 != r3) goto L_0x0076
            goto L_0x0016
        L_0x0080:
            r8.f16027c = r0     // Catch:{ all -> 0x0086 }
        L_0x0082:
            ue.a$a r0 = r8.f16027c     // Catch:{ all -> 0x0086 }
            monitor-exit(r8)
            return r0
        L_0x0086:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.a.getCause():java.lang.Throwable");
    }

    public final String getMessage() {
        return this.f16026b;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        b(new c(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        b(new d(printWriter));
    }
}
