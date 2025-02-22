package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailViewModel;

public abstract class z extends ViewDataBinding {
    public static final /* synthetic */ int X = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final EditText U;
    public final TextView V;
    public ForgotPasswordEmailViewModel W;

    public z(View view, EditText editText, ImageView imageView, TextView textView, MaterialButton materialButton, Object obj) {
        super(1, view, obj);
        this.S = imageView;
        this.T = materialButton;
        this.U = editText;
        this.V = textView;
    }

    public abstract void w(ForgotPasswordEmailViewModel forgotPasswordEmailViewModel);
}
