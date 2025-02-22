package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1166a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f1167b;

    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public z(TextView textView) {
        textView.getClass();
        this.f1166a = textView;
    }
}
