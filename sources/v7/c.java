package v7;

import android.util.Property;
import android.view.ViewGroup;
import com.quickkonnect.silencio.R;

public final class c extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f16234a = new c();

    public c() {
        super(Float.class, "childrenAlpha");
    }

    public final Object get(Object obj) {
        Float f10 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            viewGroup.getChildAt(i8).setAlpha(floatValue);
        }
    }
}
