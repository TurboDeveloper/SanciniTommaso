// Generated by view binder compiler. Do not edit!
package it.unimib.turistafelice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import it.unimib.turistafelice.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentResultDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardviewWikipediaImg;

  @NonNull
  public final CheckBox iconFavorite;

  @NonNull
  public final ImageView imageViewWikipedia;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView textViewTitlePlace;

  @NonNull
  public final TextView textViewWikipedia;

  private FragmentResultDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView cardviewWikipediaImg, @NonNull CheckBox iconFavorite,
      @NonNull ImageView imageViewWikipedia, @NonNull RelativeLayout relativeLayout,
      @NonNull ScrollView scrollView2, @NonNull TextView textViewTitlePlace,
      @NonNull TextView textViewWikipedia) {
    this.rootView = rootView;
    this.cardviewWikipediaImg = cardviewWikipediaImg;
    this.iconFavorite = iconFavorite;
    this.imageViewWikipedia = imageViewWikipedia;
    this.relativeLayout = relativeLayout;
    this.scrollView2 = scrollView2;
    this.textViewTitlePlace = textViewTitlePlace;
    this.textViewWikipedia = textViewWikipedia;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentResultDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentResultDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_result_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentResultDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      CardView cardviewWikipediaImg = rootView.findViewById(R.id.cardview_wikipedia_img);
      if (cardviewWikipediaImg == null) {
        missingId = "cardviewWikipediaImg";
        break missingId;
      }
      CheckBox iconFavorite = rootView.findViewById(R.id.icon_favorite);
      if (iconFavorite == null) {
        missingId = "iconFavorite";
        break missingId;
      }
      ImageView imageViewWikipedia = rootView.findViewById(R.id.imageViewWikipedia);
      if (imageViewWikipedia == null) {
        missingId = "imageViewWikipedia";
        break missingId;
      }
      RelativeLayout relativeLayout = rootView.findViewById(R.id.relativeLayout);
      if (relativeLayout == null) {
        missingId = "relativeLayout";
        break missingId;
      }
      ScrollView scrollView2 = rootView.findViewById(R.id.scrollView2);
      if (scrollView2 == null) {
        missingId = "scrollView2";
        break missingId;
      }
      TextView textViewTitlePlace = rootView.findViewById(R.id.textViewTitlePlace);
      if (textViewTitlePlace == null) {
        missingId = "textViewTitlePlace";
        break missingId;
      }
      TextView textViewWikipedia = rootView.findViewById(R.id.textViewWikipedia);
      if (textViewWikipedia == null) {
        missingId = "textViewWikipedia";
        break missingId;
      }
      return new FragmentResultDetailsBinding((ConstraintLayout) rootView, cardviewWikipediaImg,
          iconFavorite, imageViewWikipedia, relativeLayout, scrollView2, textViewTitlePlace,
          textViewWikipedia);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}