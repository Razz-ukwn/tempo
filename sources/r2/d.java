package r2;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;

public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f13776a;

    /* renamed from: b  reason: collision with root package name */
    public a f13777b;

    public static class a extends f.C0024f {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f13778a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f13779b;

        public a(TextView textView, d dVar) {
            this.f13778a = new WeakReference(textView);
            this.f13779b = new WeakReference(dVar);
        }

        public final void a() {
            boolean z10;
            int i8;
            InputFilter[] filters;
            TextView textView = (TextView) this.f13778a.get();
            InputFilter inputFilter = (InputFilter) this.f13779b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= filters.length) {
                        break;
                    } else if (filters[i10] == inputFilter) {
                        z10 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            z10 = false;
            if (z10 && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                f a10 = f.a();
                if (text == null) {
                    i8 = 0;
                } else {
                    a10.getClass();
                    i8 = text.length();
                }
                CharSequence f10 = a10.f(0, i8, text);
                if (text != f10) {
                    int selectionStart = Selection.getSelectionStart(f10);
                    int selectionEnd = Selection.getSelectionEnd(f10);
                    textView.setText(f10);
                    if (f10 instanceof Spannable) {
                        Spannable spannable = (Spannable) f10;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                        } else if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                        }
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f13776a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i8, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f13776a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = f.a().b();
        if (b10 != 0) {
            boolean z10 = true;
            if (b10 == 1) {
                if (i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (!(i8 == 0 && i10 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i8, i10);
                }
                return f.a().f(0, charSequence.length(), charSequence);
            } else if (b10 != 3) {
                return charSequence;
            }
        }
        f a10 = f.a();
        if (this.f13777b == null) {
            this.f13777b = new a(textView, this);
        }
        a10.g(this.f13777b);
        return charSequence;
    }
}
