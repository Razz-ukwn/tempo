package u1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public final class k {
    public static c a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i8) {
        c cVar;
        if (d(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i8, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new c((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                cVar = c.a(typedArray.getResources(), typedArray.getResourceId(i8, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new c((Shader) null, (ColorStateList) null, 0);
    }

    public static float b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, float f10) {
        return !d(xmlPullParser, str) ? f10 : typedArray.getFloat(i8, f10);
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, int i10) {
        return !d(xmlPullParser, str) ? i10 : typedArray.getInt(i8, i10);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
