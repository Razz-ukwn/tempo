package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class p extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f1881a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1882b = new ArrayList();

    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a  reason: collision with root package name */
        public final Object f1883a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicInteger f1884b = new AtomicInteger(0);

        public a(Object obj) {
            this.f1883a = obj;
        }

        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1883a).afterTextChanged(editable);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
            ((TextWatcher) this.f1883a).beforeTextChanged(charSequence, i8, i10, i11);
        }

        public final void onSpanAdded(Spannable spannable, Object obj, int i8, int i10) {
            if (this.f1884b.get() <= 0 || !(obj instanceof l)) {
                ((SpanWatcher) this.f1883a).onSpanAdded(spannable, obj, i8, i10);
            }
        }

        public final void onSpanChanged(Spannable spannable, Object obj, int i8, int i10, int i11, int i12) {
            int i13;
            int i14;
            if (this.f1884b.get() <= 0 || !(obj instanceof l)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i8 > i10) {
                        i8 = 0;
                    }
                    if (i11 > i12) {
                        i14 = i8;
                        i13 = 0;
                        ((SpanWatcher) this.f1883a).onSpanChanged(spannable, obj, i14, i10, i13, i12);
                    }
                }
                i14 = i8;
                i13 = i11;
                ((SpanWatcher) this.f1883a).onSpanChanged(spannable, obj, i14, i10, i13, i12);
            }
        }

        public final void onSpanRemoved(Spannable spannable, Object obj, int i8, int i10) {
            if (this.f1884b.get() <= 0 || !(obj instanceof l)) {
                ((SpanWatcher) this.f1883a).onSpanRemoved(spannable, obj, i8, i10);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
            ((TextWatcher) this.f1883a).onTextChanged(charSequence, i8, i10, i11);
        }
    }

    public p(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        if (cls != null) {
            this.f1881a = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    public final void a() {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f1882b;
            if (i8 < arrayList.size()) {
                ((a) arrayList.get(i8)).f1884b.incrementAndGet();
                i8++;
            } else {
                return;
            }
        }
    }

    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f1882b;
            if (i8 < arrayList.size()) {
                ((a) arrayList.get(i8)).onTextChanged(this, 0, length(), length());
                i8++;
            } else {
                return;
            }
        }
    }

    public final a c(Object obj) {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f1882b;
            if (i8 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i8);
            if (aVar.f1883a == obj) {
                return aVar;
            }
            i8++;
        }
    }

    public final boolean d(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f1881a == obj.getClass();
    }

    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i8, int i10) {
        super.delete(i8, i10);
        return this;
    }

    public final void e() {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f1882b;
            if (i8 < arrayList.size()) {
                ((a) arrayList.get(i8)).f1884b.decrementAndGet();
                i8++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        a c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        a c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        a c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i8, int i10, Class<T> cls) {
        if (!(this.f1881a == cls)) {
            return super.getSpans(i8, i10, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i8, i10, a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            tArr[i11] = aVarArr[i11].f1883a;
        }
        return tArr;
    }

    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i8, CharSequence charSequence) {
        super.insert(i8, charSequence);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if ((r1.f1881a == r4) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class<androidx.emoji2.text.p.a> r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x000b
            java.lang.Class<?> r0 = r1.f1881a
            if (r0 != r4) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            java.lang.Class<androidx.emoji2.text.p$a> r4 = androidx.emoji2.text.p.a.class
        L_0x000d:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.p.nextSpanTransition(int, int, java.lang.Class):int");
    }

    public final void removeSpan(Object obj) {
        a aVar;
        if (d(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f1882b.remove(aVar);
        }
    }

    public final void setSpan(Object obj, int i8, int i10, int i11) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f1882b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i8, i10, i11);
    }

    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i8, int i10) {
        return new p(this.f1881a, this, i8, i10);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m2append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m7delete(int i8, int i10) {
        super.delete(i8, i10);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m8insert(int i8, CharSequence charSequence) {
        super.insert(i8, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m5append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i8, CharSequence charSequence, int i10, int i11) {
        super.insert(i8, charSequence, i10, i11);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i8, int i10, CharSequence charSequence) {
        a();
        super.replace(i8, i10, charSequence);
        e();
        return this;
    }

    public final Editable append(char c3) {
        super.append(c3);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m9insert(int i8, CharSequence charSequence, int i10, int i11) {
        super.insert(i8, charSequence, i10, i11);
        return this;
    }

    public p(Class<?> cls, CharSequence charSequence, int i8, int i10) {
        super(charSequence, i8, i10);
        if (cls != null) {
            this.f1881a = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m1append(char c3) {
        super.append(c3);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m4append(char c3) {
        super.append(c3);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i8, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i8, i10, charSequence, i11, i12);
        e();
        return this;
    }

    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i8, int i10) {
        super.append(charSequence, i8, i10);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m3append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i8, int i10) {
        super.append(charSequence, i8, i10);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m6append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i8, int i10) {
        super.append(charSequence, i8, i10);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i8) {
        super.append(charSequence, obj, i8);
        return this;
    }
}
