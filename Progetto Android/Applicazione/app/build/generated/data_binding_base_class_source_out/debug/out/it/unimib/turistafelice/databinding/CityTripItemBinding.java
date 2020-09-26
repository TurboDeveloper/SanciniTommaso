// Generated by view binder compiler. Do not edit!
package it.unimib.turistafelice.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import it.unimib.turistafelice.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CityTripItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imageCityTripFav;

  @NonNull
  public final TextView textCityTripName;

  @NonNull
  public final TextView textViewInfo;

  private CityTripItemBinding(@NonNull CardView rootView, @NonNull ImageView imageCityTripFav,
      @NonNull TextView textCityTripName, @NonNull TextView textViewInfo) {
    this.rootView = rootView;
    this.imageCityTripFav = imageCityTripFav;
    this.textCityTripName = textCityTripName;
    this.textViewInfo = textViewInfo;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CityTripItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CityTripItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.city_trip_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CityTripItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      ImageView imageCityTripFav = rootView.findViewById(R.id.image_city_trip_fav);
      if (imageCityTripFav == null) {
        missingId = "imageCityTripFav";
        break missingId;
      }
      TextView textCityTripName = rootView.findViewById(R.id.text_city_trip_name);
      if (textCityTripName == null) {
        missingId = "textCityTripName";
        break missingId;
      }
      TextView textViewInfo = rootView.findViewById(R.id.text_view_info);
      if (textViewInfo == null) {
        missingId = "textViewInfo";
        break missingId;
      }
      return new CityTripItemBinding((CardView) rootView, imageCityTripFav, textCityTripName,
          textViewInfo);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}