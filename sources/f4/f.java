package f4;

import android.graphics.Bitmap;
import f4.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<b.a, ArrayList<a>> f8590a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public int f8591b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8592a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<Bitmap> f8593b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, Object> f8594c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8595d;

        public a(int i8, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i10) {
            this.f8592a = i8;
            this.f8593b = weakReference;
            this.f8594c = map;
            this.f8595d = i10;
        }
    }

    public final synchronized void a(int i8) {
        if (i8 >= 10 && i8 != 20) {
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized f4.b.C0153b b(f4.b.a r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.LinkedHashMap<f4.b$a, java.util.ArrayList<f4.f$a>> r0 = r6.f8590a     // Catch:{ all -> 0x0044 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0044 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x0044 }
            r0 = 0
            if (r7 != 0) goto L_0x000e
            monitor-exit(r6)
            return r0
        L_0x000e:
            int r1 = r7.size()     // Catch:{ all -> 0x0044 }
            r2 = 0
        L_0x0013:
            if (r2 >= r1) goto L_0x0035
            java.lang.Object r3 = r7.get(r2)     // Catch:{ all -> 0x0044 }
            f4.f$a r3 = (f4.f.a) r3     // Catch:{ all -> 0x0044 }
            java.lang.ref.WeakReference<android.graphics.Bitmap> r4 = r3.f8593b     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0044 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x002d
            f4.b$b r5 = new f4.b$b     // Catch:{ all -> 0x0044 }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f8594c     // Catch:{ all -> 0x0044 }
            r5.<init>(r4, r3)     // Catch:{ all -> 0x0044 }
            goto L_0x002e
        L_0x002d:
            r5 = r0
        L_0x002e:
            if (r5 == 0) goto L_0x0032
            r0 = r5
            goto L_0x0035
        L_0x0032:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0035:
            int r7 = r6.f8591b     // Catch:{ all -> 0x0044 }
            int r1 = r7 + 1
            r6.f8591b = r1     // Catch:{ all -> 0x0044 }
            r1 = 10
            if (r7 < r1) goto L_0x0042
            r6.d()     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r6)
            return r0
        L_0x0044:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f.b(f4.b$a):f4.b$b");
    }

    public final synchronized void c(b.a aVar, Bitmap bitmap, Map<String, ? extends Object> map, int i8) {
        LinkedHashMap<b.a, ArrayList<a>> linkedHashMap = this.f8590a;
        ArrayList<a> arrayList = linkedHashMap.get(aVar);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(aVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        int identityHashCode = System.identityHashCode(bitmap);
        a aVar2 = new a(identityHashCode, new WeakReference(bitmap), map, i8);
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                arrayList2.add(aVar2);
                break;
            }
            a aVar3 = (a) arrayList2.get(i10);
            if (i8 < aVar3.f8595d) {
                i10++;
            } else if (aVar3.f8592a == identityHashCode && aVar3.f8593b.get() == bitmap) {
                arrayList2.set(i10, aVar2);
            } else {
                arrayList2.add(i10, aVar2);
            }
        }
        int i11 = this.f8591b;
        this.f8591b = i11 + 1;
        if (i11 >= 10) {
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r2 = r2.f8593b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            r0 = 0
            r9.f8591b = r0
            java.util.LinkedHashMap<f4.b$a, java.util.ArrayList<f4.f$a>> r1 = r9.f8590a
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r1.next()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = 1
            if (r3 > r4) goto L_0x003a
            java.lang.Object r2 = gf.q.v0(r2)
            f4.f$a r2 = (f4.f.a) r2
            if (r2 == 0) goto L_0x0033
            java.lang.ref.WeakReference<android.graphics.Bitmap> r2 = r2.f8593b
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r2.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 != 0) goto L_0x000d
            r1.remove()
            goto L_0x000d
        L_0x003a:
            int r3 = r2.size()
            r5 = r0
            r6 = r5
        L_0x0040:
            if (r5 >= r3) goto L_0x005f
            int r7 = r5 - r6
            java.lang.Object r8 = r2.get(r7)
            f4.f$a r8 = (f4.f.a) r8
            java.lang.ref.WeakReference<android.graphics.Bitmap> r8 = r8.f8593b
            java.lang.Object r8 = r8.get()
            if (r8 != 0) goto L_0x0054
            r8 = r4
            goto L_0x0055
        L_0x0054:
            r8 = r0
        L_0x0055:
            if (r8 == 0) goto L_0x005c
            r2.remove(r7)
            int r6 = r6 + 1
        L_0x005c:
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005f:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x000d
            r1.remove()
            goto L_0x000d
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.f.d():void");
    }
}
