package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import b2.h;
import java.util.stream.IntStream;

public final class s implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1890a = false;

    /* renamed from: b  reason: collision with root package name */
    public Spannable f1891b;

    public static class a {
        public boolean a(Spannable spannable) {
            return spannable instanceof h;
        }
    }

    public static class b extends a {
        public final boolean a(Spannable spannable) {
            return (spannable instanceof PrecomputedText) || (spannable instanceof h);
        }
    }

    public s(Spannable spannable) {
        this.f1891b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1891b;
        if (!this.f1890a) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).a(spannable)) {
                this.f1891b = new SpannableString(spannable);
            }
        }
        this.f1890a = true;
    }

    public final char charAt(int i8) {
        return this.f1891b.charAt(i8);
    }

    public final IntStream chars() {
        return this.f1891b.chars();
    }

    public final IntStream codePoints() {
        return this.f1891b.codePoints();
    }

    public final int getSpanEnd(Object obj) {
        return this.f1891b.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f1891b.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f1891b.getSpanStart(obj);
    }

    public final <T> T[] getSpans(int i8, int i10, Class<T> cls) {
        return this.f1891b.getSpans(i8, i10, cls);
    }

    public final int length() {
        return this.f1891b.length();
    }

    public final int nextSpanTransition(int i8, int i10, Class cls) {
        return this.f1891b.nextSpanTransition(i8, i10, cls);
    }

    public final void removeSpan(Object obj) {
        a();
        this.f1891b.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i8, int i10, int i11) {
        a();
        this.f1891b.setSpan(obj, i8, i10, i11);
    }

    public final CharSequence subSequence(int i8, int i10) {
        return this.f1891b.subSequence(i8, i10);
    }

    public final String toString() {
        return this.f1891b.toString();
    }

    public s(CharSequence charSequence) {
        this.f1891b = new SpannableString(charSequence);
    }
}
