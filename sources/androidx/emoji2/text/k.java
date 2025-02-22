package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.emoji2.text.f;
import androidx.emoji2.text.o;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import v1.f;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final f.j f1847a;

    /* renamed from: b  reason: collision with root package name */
    public final o f1848b;

    /* renamed from: c  reason: collision with root package name */
    public final f.e f1849c;

    public static class a implements b<s> {

        /* renamed from: a  reason: collision with root package name */
        public s f1850a;

        /* renamed from: b  reason: collision with root package name */
        public final f.j f1851b;

        public a(s sVar, f.j jVar) {
            this.f1850a = sVar;
            this.f1851b = jVar;
        }

        public final boolean a(CharSequence charSequence, int i8, int i10, q qVar) {
            if ((qVar.f1888c & 4) > 0) {
                return true;
            }
            if (this.f1850a == null) {
                this.f1850a = new s(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((f.d) this.f1851b).getClass();
            this.f1850a.setSpan(new r(qVar), i8, i10, 33);
            return true;
        }

        public final Object getResult() {
            return this.f1850a;
        }
    }

    public interface b<T> {
        boolean a(CharSequence charSequence, int i8, int i10, q qVar);

        T getResult();
    }

    public static class c implements b<c> {

        /* renamed from: a  reason: collision with root package name */
        public final String f1852a;

        public c(String str) {
            this.f1852a = str;
        }

        public final boolean a(CharSequence charSequence, int i8, int i10, q qVar) {
            if (!TextUtils.equals(charSequence.subSequence(i8, i10), this.f1852a)) {
                return true;
            }
            qVar.f1888c = (qVar.f1888c & 3) | 4;
            return false;
        }

        public final Object getResult() {
            return this;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public int f1853a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final o.a f1854b;

        /* renamed from: c  reason: collision with root package name */
        public o.a f1855c;

        /* renamed from: d  reason: collision with root package name */
        public o.a f1856d;

        /* renamed from: e  reason: collision with root package name */
        public int f1857e;

        /* renamed from: f  reason: collision with root package name */
        public int f1858f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f1859g;

        /* renamed from: h  reason: collision with root package name */
        public final int[] f1860h;

        public d(o.a aVar, boolean z10, int[] iArr) {
            this.f1854b = aVar;
            this.f1855c = aVar;
            this.f1859g = z10;
            this.f1860h = iArr;
        }

        public final void a() {
            this.f1853a = 1;
            this.f1855c = this.f1854b;
            this.f1858f = 0;
        }

        public final boolean b() {
            int[] iArr;
            q2.a c3 = this.f1855c.f1880b.c();
            int a10 = c3.a(6);
            if ((a10 == 0 || c3.f12831b.get(a10 + c3.f12830a) == 0) ? false : true) {
                return true;
            }
            if (this.f1857e == 65039) {
                return true;
            }
            return this.f1859g && ((iArr = this.f1860h) == null || Arrays.binarySearch(iArr, this.f1855c.f1880b.a(0)) < 0);
        }
    }

    public k(o oVar, f.d dVar, d dVar2, Set set) {
        this.f1847a = dVar;
        this.f1848b = oVar;
        this.f1849c = dVar2;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                c(str, 0, str.length(), 1, true, new c(str));
            }
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        l[] lVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (lVarArr = (l[]) editable.getSpans(selectionStart, selectionEnd, l.class)) != null && lVarArr.length > 0) {
            int length = lVarArr.length;
            int i8 = 0;
            while (i8 < length) {
                l lVar = lVarArr[i8];
                int spanStart = editable.getSpanStart(lVar);
                int spanEnd = editable.getSpanEnd(lVar);
                if ((!z10 || spanStart != selectionStart) && ((z10 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i8++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i8, int i10, q qVar) {
        if ((qVar.f1888c & 3) == 0) {
            f.e eVar = this.f1849c;
            q2.a c3 = qVar.c();
            int a10 = c3.a(8);
            if (a10 != 0) {
                c3.f12831b.getShort(a10 + c3.f12830a);
            }
            d dVar = (d) eVar;
            dVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = d.f1819b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i8 < i10) {
                sb2.append(charSequence.charAt(i8));
                i8++;
            }
            TextPaint textPaint = dVar.f1820a;
            String sb3 = sb2.toString();
            int i11 = v1.f.f16125a;
            boolean a11 = f.a.a(textPaint, sb3);
            int i12 = qVar.f1888c & 4;
            qVar.f1888c = a11 ? i12 | 2 : i12 | 1;
        }
        return (qVar.f1888c & 3) == 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T c(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, androidx.emoji2.text.k.b<T> r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            androidx.emoji2.text.k$d r5 = new androidx.emoji2.text.k$d
            androidx.emoji2.text.o r6 = r0.f1848b
            androidx.emoji2.text.o$a r6 = r6.f1877c
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r9 = 1
            r10 = r18
            r11 = r6
            r12 = r7
            r13 = r9
            r6 = r10
        L_0x0020:
            r14 = 2
            if (r6 >= r2) goto L_0x00d8
            if (r12 >= r3) goto L_0x00d8
            if (r13 == 0) goto L_0x00d8
            androidx.emoji2.text.o$a r15 = r5.f1855c
            android.util.SparseArray<androidx.emoji2.text.o$a> r15 = r15.f1879a
            if (r15 != 0) goto L_0x002f
            r15 = r8
            goto L_0x0035
        L_0x002f:
            java.lang.Object r15 = r15.get(r11)
            androidx.emoji2.text.o$a r15 = (androidx.emoji2.text.o.a) r15
        L_0x0035:
            int r7 = r5.f1853a
            r8 = 3
            if (r7 == r14) goto L_0x0047
            if (r15 != 0) goto L_0x0040
            r5.a()
            goto L_0x0091
        L_0x0040:
            r5.f1853a = r14
            r5.f1855c = r15
            r5.f1858f = r9
            goto L_0x0069
        L_0x0047:
            if (r15 == 0) goto L_0x0051
            r5.f1855c = r15
            int r7 = r5.f1858f
            int r7 = r7 + r9
            r5.f1858f = r7
            goto L_0x0069
        L_0x0051:
            r7 = 65038(0xfe0e, float:9.1138E-41)
            if (r11 != r7) goto L_0x0058
            r7 = r9
            goto L_0x0059
        L_0x0058:
            r7 = 0
        L_0x0059:
            if (r7 == 0) goto L_0x005f
            r5.a()
            goto L_0x0091
        L_0x005f:
            r7 = 65039(0xfe0f, float:9.1139E-41)
            if (r11 != r7) goto L_0x0066
            r7 = r9
            goto L_0x0067
        L_0x0066:
            r7 = 0
        L_0x0067:
            if (r7 == 0) goto L_0x006b
        L_0x0069:
            r7 = r14
            goto L_0x0092
        L_0x006b:
            androidx.emoji2.text.o$a r7 = r5.f1855c
            androidx.emoji2.text.q r15 = r7.f1880b
            if (r15 == 0) goto L_0x008e
            int r15 = r5.f1858f
            if (r15 != r9) goto L_0x0087
            boolean r7 = r5.b()
            if (r7 == 0) goto L_0x0083
            androidx.emoji2.text.o$a r7 = r5.f1855c
            r5.f1856d = r7
            r5.a()
            goto L_0x008c
        L_0x0083:
            r5.a()
            goto L_0x0091
        L_0x0087:
            r5.f1856d = r7
            r5.a()
        L_0x008c:
            r7 = r8
            goto L_0x0092
        L_0x008e:
            r5.a()
        L_0x0091:
            r7 = r9
        L_0x0092:
            r5.f1857e = r11
            if (r7 == r9) goto L_0x00c4
            if (r7 == r14) goto L_0x00b7
            if (r7 == r8) goto L_0x009b
            goto L_0x00d4
        L_0x009b:
            if (r21 != 0) goto L_0x00aa
            androidx.emoji2.text.o$a r7 = r5.f1856d
            androidx.emoji2.text.q r7 = r7.f1880b
            boolean r7 = r0.b(r1, r10, r6, r7)
            if (r7 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r10 = r6
            goto L_0x00d3
        L_0x00aa:
            androidx.emoji2.text.o$a r7 = r5.f1856d
            androidx.emoji2.text.q r7 = r7.f1880b
            boolean r7 = r4.a(r1, r10, r6, r7)
            int r12 = r12 + 1
            r10 = r6
            r13 = r7
            goto L_0x00d3
        L_0x00b7:
            int r7 = java.lang.Character.charCount(r11)
            int r6 = r6 + r7
            if (r6 >= r2) goto L_0x00d4
            int r7 = java.lang.Character.codePointAt(r1, r6)
            r11 = r7
            goto L_0x00d4
        L_0x00c4:
            int r6 = java.lang.Character.codePointAt(r1, r10)
            int r6 = java.lang.Character.charCount(r6)
            int r10 = r10 + r6
            if (r10 >= r2) goto L_0x00d3
            int r11 = java.lang.Character.codePointAt(r1, r10)
        L_0x00d3:
            r6 = r10
        L_0x00d4:
            r7 = 0
            r8 = 0
            goto L_0x0020
        L_0x00d8:
            int r2 = r5.f1853a
            if (r2 != r14) goto L_0x00ee
            androidx.emoji2.text.o$a r2 = r5.f1855c
            androidx.emoji2.text.q r2 = r2.f1880b
            if (r2 == 0) goto L_0x00ee
            int r2 = r5.f1858f
            if (r2 > r9) goto L_0x00ec
            boolean r2 = r5.b()
            if (r2 == 0) goto L_0x00ee
        L_0x00ec:
            r7 = r9
            goto L_0x00ef
        L_0x00ee:
            r7 = 0
        L_0x00ef:
            if (r7 == 0) goto L_0x0108
            if (r12 >= r3) goto L_0x0108
            if (r13 == 0) goto L_0x0108
            if (r21 != 0) goto L_0x0101
            androidx.emoji2.text.o$a r2 = r5.f1855c
            androidx.emoji2.text.q r2 = r2.f1880b
            boolean r2 = r0.b(r1, r10, r6, r2)
            if (r2 != 0) goto L_0x0108
        L_0x0101:
            androidx.emoji2.text.o$a r2 = r5.f1855c
            androidx.emoji2.text.q r2 = r2.f1880b
            r4.a(r1, r10, r6, r2)
        L_0x0108:
            java.lang.Object r1 = r22.getResult()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.k.c(java.lang.CharSequence, int, int, int, boolean, androidx.emoji2.text.k$b):java.lang.Object");
    }
}
