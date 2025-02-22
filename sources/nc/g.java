package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel;

public abstract class g extends ViewDataBinding {
    public static final /* synthetic */ int Y = 0;
    public final TextView S;
    public final MaterialButton T;
    public final ImageView U;
    public final EditText V;
    public final EditText W;
    public ChoosePasswordViewModel X;

    public g(Object obj, View view, TextView textView, MaterialButton materialButton, ImageView imageView, EditText editText, EditText editText2) {
        super(2, view, obj);
        this.S = textView;
        this.T = materialButton;
        this.U = imageView;
        this.V = editText;
        this.W = editText2;
    }

    public abstract void w(ChoosePasswordViewModel choosePasswordViewModel);
}
