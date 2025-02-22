package nc;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.measure.measuring.popup.PopupViewModel;

public abstract class l0 extends ViewDataBinding {
    public static final /* synthetic */ int X = 0;
    public final MaterialButton S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public PopupViewModel W;

    public l0(Object obj, View view, MaterialButton materialButton, TextView textView, TextView textView2, TextView textView3) {
        super(0, view, obj);
        this.S = materialButton;
        this.T = textView;
        this.U = textView2;
        this.V = textView3;
    }

    public abstract void w(PopupViewModel popupViewModel);
}
