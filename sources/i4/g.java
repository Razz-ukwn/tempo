package i4;

import android.view.View;
import android.view.ViewGroup;
import i4.a;

public interface g<T extends View> extends f {

    public static final class a {
        public static <T extends View> e a(g<T> gVar) {
            a aVar;
            a aVar2;
            ViewGroup.LayoutParams layoutParams = gVar.a().getLayoutParams();
            int i8 = -1;
            int i10 = layoutParams != null ? layoutParams.width : -1;
            int width = gVar.a().getWidth();
            int i11 = 0;
            int paddingRight = gVar.b() ? gVar.a().getPaddingRight() + gVar.a().getPaddingLeft() : 0;
            if (i10 == -2) {
                aVar = a.b.f9567a;
            } else {
                int i12 = i10 - paddingRight;
                if (i12 > 0) {
                    aVar = new a.C0176a(i12);
                } else {
                    int i13 = width - paddingRight;
                    aVar = i13 > 0 ? new a.C0176a(i13) : null;
                }
            }
            if (aVar == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams2 = gVar.a().getLayoutParams();
            if (layoutParams2 != null) {
                i8 = layoutParams2.height;
            }
            int height = gVar.a().getHeight();
            if (gVar.b()) {
                i11 = gVar.a().getPaddingTop() + gVar.a().getPaddingBottom();
            }
            if (i8 == -2) {
                aVar2 = a.b.f9567a;
            } else {
                int i14 = i8 - i11;
                if (i14 > 0) {
                    aVar2 = new a.C0176a(i14);
                } else {
                    int i15 = height - i11;
                    aVar2 = i15 > 0 ? new a.C0176a(i15) : null;
                }
            }
            if (aVar2 == null) {
                return null;
            }
            return new e(aVar, aVar2);
        }
    }

    T a();

    boolean b();
}
