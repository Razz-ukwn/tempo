package m8;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Comparator;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11308a = new a();

    public class a implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }

    public static ImageButton a(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i8 = 0; i8 < toolbar.getChildCount(); i8++) {
            View childAt = toolbar.getChildAt(i8);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList b(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < toolbar.getChildCount(); i8++) {
            View childAt = toolbar.getChildAt(i8);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
