package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import b2.h;
import cb.d;
import h2.l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import v1.n;

public class d0 extends TextView {
    public b B;
    public Future<h> C;

    /* renamed from: a  reason: collision with root package name */
    public final e f967a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f968b;

    /* renamed from: c  reason: collision with root package name */
    public final z f969c;

    /* renamed from: d  reason: collision with root package name */
    public m f970d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f971e;

    public interface a {
        void a(int i8);

        void b(int i8);
    }

    public class b implements a {
        public b() {
        }

        public void a(int i8) {
        }

        public void b(int i8) {
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        public final void a(int i8) {
            d0.super.setLastBaselineToBottomHeight(i8);
        }

        public final void b(int i8) {
            d0.super.setFirstBaselineToTopHeight(i8);
        }
    }

    public d0() {
        throw null;
    }

    public d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private m getEmojiTextViewHelper() {
        if (this.f970d == null) {
            this.f970d = new m(this);
        }
        return this.f970d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f967a;
        if (eVar != null) {
            eVar.a();
        }
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (q1.f1114b) {
            return super.getAutoSizeMaxTextSize();
        }
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            return Math.round(a0Var.f933i.f985e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (q1.f1114b) {
            return super.getAutoSizeMinTextSize();
        }
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            return Math.round(a0Var.f933i.f984d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (q1.f1114b) {
            return super.getAutoSizeStepGranularity();
        }
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            return Math.round(a0Var.f933i.f983c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (q1.f1114b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        a0 a0Var = this.f968b;
        return a0Var != null ? a0Var.f933i.f986f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (q1.f1114b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            return a0Var.f933i.f981a;
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof l.f ? ((l.f) customSelectionActionModeCallback).f9105a : customSelectionActionModeCallback;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.B == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.B = new c();
            } else {
                this.B = new b();
            }
        }
        return this.B;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f967a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f967a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f968b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f968b.e();
    }

    public CharSequence getText() {
        Future<h> future = this.C;
        if (future != null) {
            try {
                this.C = null;
                h hVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    hVar.getClass();
                    setText((CharSequence) null);
                } else {
                    h.a a10 = l.a(this);
                    hVar.getClass();
                    a10.a((h.a) null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f969c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = zVar.f1167b;
        return textClassifier == null ? z.a.a(zVar.f1166a) : textClassifier;
    }

    public h.a getTextMetricsParamsCompat() {
        return l.a(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f968b.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            g2.a.a(editorInfo, getText());
        }
        d.V(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        a0 a0Var = this.f968b;
        if (a0Var != null && !q1.f1114b) {
            a0Var.f933i.a();
        }
    }

    public void onMeasure(int i8, int i10) {
        Future<h> future = this.C;
        if (future != null) {
            try {
                this.C = null;
                h hVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    hVar.getClass();
                    setText((CharSequence) null);
                } else {
                    h.a a10 = l.a(this);
                    hVar.getClass();
                    a10.a((h.a) null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i8, i10);
    }

    public final void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        super.onTextChanged(charSequence, i8, i10, i11);
        boolean z10 = false;
        a0 a0Var = this.f968b;
        if (a0Var != null && !q1.f1114b) {
            e0 e0Var = a0Var.f933i;
            if (e0Var.i() && e0Var.f981a != 0) {
                z10 = true;
            }
        }
        if (z10) {
            a0Var.f933i.a();
        }
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i10, int i11, int i12) {
        if (q1.f1114b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i8, i10, i11, i12);
            return;
        }
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.h(i8, i10, i11, i12);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8) {
        if (q1.f1114b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
            return;
        }
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.i(iArr, i8);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i8) {
        if (q1.f1114b) {
            super.setAutoSizeTextTypeWithDefaults(i8);
            return;
        }
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.j(i8);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f967a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f967a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.d(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1076b.f13782a.a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i8);
        } else {
            l.b(this, i8);
        }
    }

    public void setLastBaselineToBottomHeight(int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i8);
        } else {
            l.c(this, i8);
        }
    }

    public void setLineHeight(int i8) {
        b7.a.p(i8);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i8 != fontMetricsInt) {
            setLineSpacing((float) (i8 - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(h hVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            hVar.getClass();
            setText((CharSequence) null);
            return;
        }
        h.a a10 = l.a(this);
        hVar.getClass();
        a10.a((h.a) null);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f967a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f967a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f968b;
        a0Var.k(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f968b;
        a0Var.l(mode);
        a0Var.b();
    }

    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.g(context, i8);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f969c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f1167b = textClassifier;
        }
    }

    public void setTextFuture(Future<h> future) {
        this.C = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(h.a aVar) {
        int i8;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f3013b;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i8 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i8 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i8 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i8 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i8 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i8 = 7;
            }
            l.b.h(this, i8);
            getPaint().set(aVar.f3012a);
            l.c.e(this, aVar.f3014c);
            l.c.h(this, aVar.f3015d);
        }
        i8 = 1;
        l.b.h(this, i8);
        getPaint().set(aVar.f3012a);
        l.c.e(this, aVar.f3014c);
        l.c.h(this, aVar.f3015d);
    }

    public final void setTextSize(int i8, float f10) {
        boolean z10 = q1.f1114b;
        if (z10) {
            super.setTextSize(i8, f10);
            return;
        }
        a0 a0Var = this.f968b;
        if (a0Var != null && !z10) {
            e0 e0Var = a0Var.f933i;
            if (!(e0Var.i() && e0Var.f981a != 0)) {
                e0Var.f(i8, f10);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int i8) {
        Typeface typeface2;
        if (!this.f971e) {
            if (typeface == null || i8 <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                n nVar = v1.h.f16128a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i8);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f971e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i8);
            } finally {
                this.f971e = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        e1.a(context);
        this.f971e = false;
        this.B = null;
        c1.a(this, getContext());
        e eVar = new e(this);
        this.f967a = eVar;
        eVar.d(attributeSet, i8);
        a0 a0Var = new a0(this);
        this.f968b = a0Var;
        a0Var.f(attributeSet, i8);
        a0Var.b();
        this.f969c = new z(this);
        getEmojiTextViewHelper().a(attributeSet, i8);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i10, int i11, int i12) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a10 = i8 != 0 ? f.a.a(context, i8) : null;
        Drawable a11 = i10 != 0 ? f.a.a(context, i10) : null;
        Drawable a12 = i11 != 0 ? f.a.a(context, i11) : null;
        if (i12 != 0) {
            drawable = f.a.a(context, i12);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a10, a11, a12, drawable);
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i8, int i10, int i11, int i12) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a10 = i8 != 0 ? f.a.a(context, i8) : null;
        Drawable a11 = i10 != 0 ? f.a.a(context, i10) : null;
        Drawable a12 = i11 != 0 ? f.a.a(context, i11) : null;
        if (i12 != 0) {
            drawable = f.a.a(context, i12);
        }
        setCompoundDrawablesWithIntrinsicBounds(a10, a11, a12, drawable);
        a0 a0Var = this.f968b;
        if (a0Var != null) {
            a0Var.b();
        }
    }
}
