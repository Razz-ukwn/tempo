package nc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.measure.howto.HowToMeasureViewModel;

public abstract class b0 extends ViewDataBinding {
    public static final /* synthetic */ int X = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final MaterialButton U;
    public final TextView V;
    public HowToMeasureViewModel W;

    public b0(Object obj, View view, ImageView imageView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView) {
        super(0, view, obj);
        this.S = imageView;
        this.T = materialButton;
        this.U = materialButton2;
        this.V = textView;
    }

    public abstract void w(HowToMeasureViewModel howToMeasureViewModel);
}
