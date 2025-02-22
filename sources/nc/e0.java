package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.auth.login.LoginViewModel;

public abstract class e0 extends ViewDataBinding {
    public static final /* synthetic */ int Z = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final EditText U;
    public final EditText V;
    public final TextView W;
    public final MaterialButton X;
    public LoginViewModel Y;

    public e0(Object obj, View view, ImageView imageView, MaterialButton materialButton, EditText editText, EditText editText2, TextView textView, MaterialButton materialButton2) {
        super(2, view, obj);
        this.S = imageView;
        this.T = materialButton;
        this.U = editText;
        this.V = editText2;
        this.W = textView;
        this.X = materialButton2;
    }

    public abstract void w(LoginViewModel loginViewModel);
}
