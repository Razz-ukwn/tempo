package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.z;
import cb.d;
import com.quickkonnect.silencio.R;
import d2.b0;
import d2.f;
import d2.i0;
import g2.b;
import h2.l;
import h2.n;

public class k extends EditText implements b0 {
    public a B;

    /* renamed from: a  reason: collision with root package name */
    public final e f1037a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f1038b;

    /* renamed from: c  reason: collision with root package name */
    public final z f1039c;

    /* renamed from: d  reason: collision with root package name */
    public final n f1040d;

    /* renamed from: e  reason: collision with root package name */
    public final l f1041e;

    public class a {
        public a() {
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private a getSuperCaller() {
        if (this.B == null) {
            this.B = new a();
        }
        return this.B;
    }

    public final f a(f fVar) {
        return this.f1040d.a(this, fVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1037a;
        if (eVar != null) {
            eVar.a();
        }
        a0 a0Var = this.f1038b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof l.f ? ((l.f) customSelectionActionModeCallback).f9105a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1037a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1037a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1038b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1038b.e();
    }

    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f1039c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = zVar.f1167b;
        return textClassifier == null ? z.a.a(zVar.f1166a) : textClassifier;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g10;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1038b.getClass();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30 && onCreateInputConnection != null) {
            g2.a.a(editorInfo, getText());
        }
        d.V(this, editorInfo, onCreateInputConnection);
        if (!(onCreateInputConnection == null || i8 > 30 || (g10 = i0.g(this)) == null)) {
            editorInfo.contentMimeTypes = g10;
            onCreateInputConnection = new b(onCreateInputConnection, new j0.n(this, 2));
        }
        return this.f1041e.f(onCreateInputConnection, editorInfo);
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && i0.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = u.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i8) {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        if (i10 < 31 && i0.g(this) != null && (i8 == 16908322 || i8 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                f.b aVar = i10 >= 31 ? new f.a(primaryClip, 1) : new f.c(primaryClip, 1);
                if (i8 != 16908322) {
                    i11 = 1;
                }
                aVar.b(i11);
                i0.j(this, aVar.build());
            }
            i11 = 1;
        }
        if (i11 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i8);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1037a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f1037a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f1038b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.f1038b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.d(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1041e.g(z10);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1041e.b(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1037a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1037a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f1038b;
        a0Var.k(colorStateList);
        a0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.f1038b;
        a0Var.l(mode);
        a0Var.b();
    }

    public final void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        a0 a0Var = this.f1038b;
        if (a0Var != null) {
            a0Var.g(context, i8);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f1039c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f1167b = textClassifier;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, R.attr.editTextStyle);
        e1.a(context);
        c1.a(this, getContext());
        e eVar = new e(this);
        this.f1037a = eVar;
        eVar.d(attributeSet, R.attr.editTextStyle);
        a0 a0Var = new a0(this);
        this.f1038b = a0Var;
        a0Var.f(attributeSet, R.attr.editTextStyle);
        a0Var.b();
        this.f1039c = new z(this);
        this.f1040d = new n();
        l lVar = new l((EditText) this);
        this.f1041e = lVar;
        lVar.e(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener b10 = lVar.b(keyListener);
            if (b10 != keyListener) {
                super.setKeyListener(b10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
