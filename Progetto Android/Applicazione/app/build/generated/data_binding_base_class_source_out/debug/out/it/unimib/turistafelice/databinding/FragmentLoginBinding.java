// Generated by view binder compiler. Do not edit!
package it.unimib.turistafelice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import it.unimib.turistafelice.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final TextView forgotPswTextView;

  @NonNull
  public final ConstraintLayout fragmentLoginId;

  @NonNull
  public final Button loginBtn;

  @NonNull
  public final TextView mainText;

  @NonNull
  public final EditText passwordEditText;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button registerBtn;

  private FragmentLoginBinding(@NonNull ConstraintLayout rootView, @NonNull EditText emailEditText,
      @NonNull TextView forgotPswTextView, @NonNull ConstraintLayout fragmentLoginId,
      @NonNull Button loginBtn, @NonNull TextView mainText, @NonNull EditText passwordEditText,
      @NonNull ProgressBar progressBar, @NonNull Button registerBtn) {
    this.rootView = rootView;
    this.emailEditText = emailEditText;
    this.forgotPswTextView = forgotPswTextView;
    this.fragmentLoginId = fragmentLoginId;
    this.loginBtn = loginBtn;
    this.mainText = mainText;
    this.passwordEditText = passwordEditText;
    this.progressBar = progressBar;
    this.registerBtn = registerBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      EditText emailEditText = rootView.findViewById(R.id.email_edit_text);
      if (emailEditText == null) {
        missingId = "emailEditText";
        break missingId;
      }
      TextView forgotPswTextView = rootView.findViewById(R.id.forgot_psw_text_view);
      if (forgotPswTextView == null) {
        missingId = "forgotPswTextView";
        break missingId;
      }
      ConstraintLayout fragmentLoginId = rootView.findViewById(R.id.fragment_login_id);
      if (fragmentLoginId == null) {
        missingId = "fragmentLoginId";
        break missingId;
      }
      Button loginBtn = rootView.findViewById(R.id.login_btn);
      if (loginBtn == null) {
        missingId = "loginBtn";
        break missingId;
      }
      TextView mainText = rootView.findViewById(R.id.main_text);
      if (mainText == null) {
        missingId = "mainText";
        break missingId;
      }
      EditText passwordEditText = rootView.findViewById(R.id.password_edit_text);
      if (passwordEditText == null) {
        missingId = "passwordEditText";
        break missingId;
      }
      ProgressBar progressBar = rootView.findViewById(R.id.progressBar);
      if (progressBar == null) {
        missingId = "progressBar";
        break missingId;
      }
      Button registerBtn = rootView.findViewById(R.id.register_btn);
      if (registerBtn == null) {
        missingId = "registerBtn";
        break missingId;
      }
      return new FragmentLoginBinding((ConstraintLayout) rootView, emailEditText, forgotPswTextView,
          fragmentLoginId, loginBtn, mainText, passwordEditText, progressBar, registerBtn);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
