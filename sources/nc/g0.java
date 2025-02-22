package nc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import wd.b;

public abstract class g0 extends ViewDataBinding {
    public static final /* synthetic */ int W = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final TextView U;
    public b V;

    public g0(Object obj, View view, ImageView imageView, MaterialButton materialButton, TextView textView) {
        super(0, view, obj);
        this.S = imageView;
        this.T = materialButton;
        this.U = textView;
    }

    public abstract void w(b bVar);
}
