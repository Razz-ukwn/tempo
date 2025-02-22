package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import cb.d;
import f.a;
import h2.l;

public final class g extends CheckedTextView {

    /* renamed from: a  reason: collision with root package name */
    public final h f1001a = new h(this);

    /* renamed from: b  reason: collision with root package name */
    public final e f1002b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f1003c;

    /* renamed from: d  reason: collision with root package name */
    public m f1004d;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063 A[SYNTHETIC, Splitter:B:11:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081 A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[Catch:{ all -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            androidx.appcompat.widget.e1.a(r8)
            r0 = 2130903315(0x7f030113, float:1.7413445E38)
            r7.<init>(r8, r9, r0)
            android.content.Context r8 = r7.getContext()
            androidx.appcompat.widget.c1.a(r7, r8)
            androidx.appcompat.widget.a0 r8 = new androidx.appcompat.widget.a0
            r8.<init>(r7)
            r7.f1003c = r8
            r8.f(r9, r0)
            r8.b()
            androidx.appcompat.widget.e r8 = new androidx.appcompat.widget.e
            r8.<init>(r7)
            r7.f1002b = r8
            r8.d(r9, r0)
            androidx.appcompat.widget.h r8 = new androidx.appcompat.widget.h
            r8.<init>(r7)
            r7.f1001a = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = cb.e.I
            androidx.appcompat.widget.h1 r8 = androidx.appcompat.widget.h1.m(r8, r9, r3, r0)
            android.content.Context r2 = r7.getContext()
            android.content.res.TypedArray r5 = r8.f1015b
            r6 = 2130903315(0x7f030113, float:1.7413445E38)
            r1 = r7
            r4 = r9
            d2.i0.m(r1, r2, r3, r4, r5, r6)
            r1 = 1
            boolean r2 = r8.l(r1)     // Catch:{ all -> 0x00a7 }
            r3 = 0
            if (r2 == 0) goto L_0x0060
            int r2 = r8.i(r1, r3)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0060
            android.content.Context r4 = r7.getContext()     // Catch:{ NotFoundException -> 0x0060 }
            android.graphics.drawable.Drawable r2 = f.a.a(r4, r2)     // Catch:{ NotFoundException -> 0x0060 }
            r7.setCheckMarkDrawable((android.graphics.drawable.Drawable) r2)     // Catch:{ NotFoundException -> 0x0060 }
            goto L_0x0061
        L_0x0060:
            r1 = r3
        L_0x0061:
            if (r1 != 0) goto L_0x007a
            boolean r1 = r8.l(r3)     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x007a
            int r1 = r8.i(r3, r3)     // Catch:{ all -> 0x00a7 }
            if (r1 == 0) goto L_0x007a
            android.content.Context r2 = r7.getContext()     // Catch:{ all -> 0x00a7 }
            android.graphics.drawable.Drawable r1 = f.a.a(r2, r1)     // Catch:{ all -> 0x00a7 }
            r7.setCheckMarkDrawable((android.graphics.drawable.Drawable) r1)     // Catch:{ all -> 0x00a7 }
        L_0x007a:
            r1 = 2
            boolean r2 = r8.l(r1)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0088
            android.content.res.ColorStateList r1 = r8.b(r1)     // Catch:{ all -> 0x00a7 }
            r7.setCheckMarkTintList(r1)     // Catch:{ all -> 0x00a7 }
        L_0x0088:
            r1 = 3
            boolean r2 = r8.l(r1)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x009c
            r2 = -1
            int r1 = r8.h(r1, r2)     // Catch:{ all -> 0x00a7 }
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.j0.b(r1, r2)     // Catch:{ all -> 0x00a7 }
            r7.setCheckMarkTintMode(r1)     // Catch:{ all -> 0x00a7 }
        L_0x009c:
            r8.n()
            androidx.appcompat.widget.m r8 = r7.getEmojiTextViewHelper()
            r8.a(r9, r0)
            return
        L_0x00a7:
            r9 = move-exception
            r8.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private m getEmojiTextViewHelper() {
        if (this.f1004d == null) {
            this.f1004d = new m(this);
        }
        return this.f1004d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a0 a0Var = this.f1003c;
        if (a0Var != null) {
            a0Var.b();
        }
        e eVar = this.f1002b;
        if (eVar != null) {
            eVar.a();
        }
        h hVar = this.f1001a;
        if (hVar != null) {
            hVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof l.f ? ((l.f) customSelectionActionModeCallback).f9105a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1002b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1002b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.f1001a;
        if (hVar != null) {
            return hVar.f1009b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.f1001a;
        if (hVar != null) {
            return hVar.f1010c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1003c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1003c.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        d.V(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1002b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f1002b;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.f1001a;
        if (hVar == null) {
            return;
        }
        if (hVar.f1013f) {
            hVar.f1013f = false;
            return;
        }
        hVar.f1013f = true;
        hVar.a();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f1003c;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f1003c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1002b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1002b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.f1001a;
        if (hVar != null) {
            hVar.f1009b = colorStateList;
            hVar.f1011d = true;
            hVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.f1001a;
        if (hVar != null) {
            hVar.f1010c = mode;
            hVar.f1012e = true;
            hVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f1003c;
        a0Var.k(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f1003c;
        a0Var.l(mode);
        a0Var.b();
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        a0 a0Var = this.f1003c;
        if (a0Var != null) {
            a0Var.g(context, i8);
        }
    }

    public void setCheckMarkDrawable(int i8) {
        setCheckMarkDrawable(a.a(getContext(), i8));
    }
}
