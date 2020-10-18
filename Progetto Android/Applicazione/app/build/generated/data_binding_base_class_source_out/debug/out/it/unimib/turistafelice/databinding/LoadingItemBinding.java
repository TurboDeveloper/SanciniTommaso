// Generated by view binder compiler. Do not edit!
package it.unimib.turistafelice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import it.unimib.turistafelice.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LoadingItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ProgressBar progressBarLoadingNews;

  private LoadingItemBinding(@NonNull LinearLayout rootView,
      @NonNull ProgressBar progressBarLoadingNews) {
    this.rootView = rootView;
    this.progressBarLoadingNews = progressBarLoadingNews;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LoadingItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoadingItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.loading_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoadingItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      ProgressBar progressBarLoadingNews = rootView.findViewById(R.id.progressBarLoadingNews);
      if (progressBarLoadingNews == null) {
        missingId = "progressBarLoadingNews";
        break missingId;
      }
      return new LoadingItemBinding((LinearLayout) rootView, progressBarLoadingNews);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}