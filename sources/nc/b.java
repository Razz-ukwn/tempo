package nc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioViewModel;

public abstract class b extends ViewDataBinding {
    public static final /* synthetic */ int W = 0;
    public final MaterialButton S;
    public final ImageView T;
    public final TextView U;
    public AskSilencioViewModel V;

    public b(Object obj, View view, MaterialButton materialButton, ImageView imageView, TextView textView) {
        super(0, view, obj);
        this.S = materialButton;
        this.T = imageView;
        this.U = textView;
    }

    public abstract void w(AskSilencioViewModel askSilencioViewModel);
}
