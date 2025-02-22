package wa;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f16552a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16553b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16554c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<String> f16555d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final Executor f16556e;

    public a0(SharedPreferences sharedPreferences, Executor executor) {
        this.f16552a = sharedPreferences;
        this.f16553b = "topic_operation_queue";
        this.f16554c = ",";
        this.f16556e = executor;
    }

    public static a0 a(SharedPreferences sharedPreferences, Executor executor) {
        a0 a0Var = new a0(sharedPreferences, executor);
        synchronized (a0Var.f16555d) {
            a0Var.f16555d.clear();
            String string = a0Var.f16552a.getString(a0Var.f16553b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(a0Var.f16554c)) {
                    String[] split = string.split(a0Var.f16554c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            a0Var.f16555d.add(str);
                        }
                    }
                }
            }
        }
        return a0Var;
    }
}
