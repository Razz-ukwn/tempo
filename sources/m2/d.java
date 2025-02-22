package m2;

import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.f;
import com.quickkonnect.silencio.R;

public final class d {

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public static String a(EditText editText) {
        return editText.getText().toString();
    }

    public static void b(TextView textView, String str) {
        CharSequence text = textView.getText();
        if (str == text) {
            return;
        }
        if (str != null || text.length() != 0) {
            if (!(str instanceof Spanned)) {
                boolean z10 = true;
                if ((str == null) == (text == null)) {
                    if (str != null) {
                        int length = str.length();
                        if (length == text.length()) {
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length) {
                                    break;
                                } else if (str.charAt(i8) != text.charAt(i8)) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                if (!z10) {
                    return;
                }
            } else if (str.equals(text)) {
                return;
            }
            textView.setText(str);
        }
    }

    public static void c(EditText editText, f fVar) {
        c cVar = fVar == null ? null : new c(fVar);
        int i8 = b.f11178a;
        Object tag = editText.getTag(R.id.textWatcher);
        editText.setTag(R.id.textWatcher, cVar);
        TextWatcher textWatcher = (TextWatcher) tag;
        if (textWatcher != null) {
            editText.removeTextChangedListener(textWatcher);
        }
        if (cVar != null) {
            editText.addTextChangedListener(cVar);
        }
    }
}
