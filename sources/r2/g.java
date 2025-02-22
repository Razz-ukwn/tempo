package r2;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;

public final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f13787a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13788b = false;

    /* renamed from: c  reason: collision with root package name */
    public a f13789c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13790d = true;

    public static class a extends f.C0024f {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f13791a;

        public a(EditText editText) {
            this.f13791a = new WeakReference(editText);
        }

        public final void a() {
            g.a((EditText) this.f13791a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f13787a = editText;
    }

    public static void a(EditText editText, int i8) {
        int i10;
        if (i8 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            f a10 = f.a();
            if (editableText == null) {
                i10 = 0;
            } else {
                a10.getClass();
                i10 = editableText.length();
            }
            a10.f(0, i10, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if ((androidx.emoji2.text.f.f1823k != null) == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.f13787a
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L_0x0054
            boolean r1 = r4.f13790d
            r2 = 1
            if (r1 == 0) goto L_0x001b
            boolean r1 = r4.f13788b
            r3 = 0
            if (r1 != 0) goto L_0x001c
            androidx.emoji2.text.f r1 = androidx.emoji2.text.f.f1823k
            if (r1 == 0) goto L_0x0018
            r1 = r2
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r3 = r2
        L_0x001c:
            if (r3 == 0) goto L_0x001f
            goto L_0x0054
        L_0x001f:
            if (r7 > r8) goto L_0x0054
            boolean r7 = r5 instanceof android.text.Spannable
            if (r7 == 0) goto L_0x0054
            androidx.emoji2.text.f r7 = androidx.emoji2.text.f.a()
            int r7 = r7.b()
            if (r7 == 0) goto L_0x0040
            if (r7 == r2) goto L_0x0035
            r5 = 3
            if (r7 == r5) goto L_0x0040
            goto L_0x0054
        L_0x0035:
            android.text.Spannable r5 = (android.text.Spannable) r5
            androidx.emoji2.text.f r7 = androidx.emoji2.text.f.a()
            int r8 = r8 + r6
            r7.f(r6, r8, r5)
            goto L_0x0054
        L_0x0040:
            androidx.emoji2.text.f r5 = androidx.emoji2.text.f.a()
            r2.g$a r6 = r4.f13789c
            if (r6 != 0) goto L_0x004f
            r2.g$a r6 = new r2.g$a
            r6.<init>(r0)
            r4.f13789c = r6
        L_0x004f:
            r2.g$a r6 = r4.f13789c
            r5.g(r6)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
