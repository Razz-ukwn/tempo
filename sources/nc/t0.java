package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel;

public abstract class t0 extends ViewDataBinding {
    public static final /* synthetic */ int X = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final EditText U;
    public final EditText V;
    public ResetPasswordViewModel W;

    public t0(Object obj, View view, ImageView imageView, MaterialButton materialButton, EditText editText, EditText editText2) {
        super(2, view, obj);
        this.S = imageView;
        this.T = materialButton;
        this.U = editText;
        this.V = editText2;
    }

    public abstract void w(ResetPasswordViewModel resetPasswordViewModel);
}
