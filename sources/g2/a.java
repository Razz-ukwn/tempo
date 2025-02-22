package g2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class a {
    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
            return;
        }
        charSequence.getClass();
        if (i8 >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 + 0 : i10 + 0;
        int i13 = i10 > i11 ? i10 - 0 : i11 + 0;
        int length = charSequence.length();
        if (i12 < 0 || i13 > length) {
            b(editorInfo, (CharSequence) null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            b(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            b(editorInfo, charSequence, i12, i13);
        } else {
            int i15 = i13 - i12;
            int i16 = i15 > 1024 ? 0 : i15;
            int i17 = 2048 - i16;
            int min = Math.min(charSequence.length() - i13, i17 - Math.min(i12, (int) (((double) i17) * 0.8d)));
            int min2 = Math.min(i12, i17 - min);
            int i18 = i12 - min2;
            if (Character.isLowSurrogate(charSequence.charAt(i18))) {
                i18++;
                min2--;
            }
            if (Character.isHighSurrogate(charSequence.charAt((i13 + min) - 1))) {
                min--;
            }
            CharSequence concat = i16 != i15 ? TextUtils.concat(new CharSequence[]{charSequence.subSequence(i18, i18 + min2), charSequence.subSequence(i13, min + i13)}) : charSequence.subSequence(i18, min2 + i16 + min + i18);
            int i19 = min2 + 0;
            b(editorInfo, concat, i19, i16 + i19);
        }
    }

    public static void b(EditorInfo editorInfo, CharSequence charSequence, int i8, int i10) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i8);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i10);
    }
}
