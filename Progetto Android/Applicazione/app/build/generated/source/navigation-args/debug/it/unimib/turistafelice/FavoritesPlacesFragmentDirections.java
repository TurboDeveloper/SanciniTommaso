package it.unimib.turistafelice;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import it.unimib.turistafelice.model.Place;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FavoritesPlacesFragmentDirections {
  private FavoritesPlacesFragmentDirections() {
  }

  @NonNull
  public static FavoritePlaceDetailsAction favoritePlaceDetailsAction(@NonNull Place placeDetailArg,
      @NonNull String cityName) {
    return new FavoritePlaceDetailsAction(placeDetailArg, cityName);
  }

  public static class FavoritePlaceDetailsAction implements NavDirections {
    private final HashMap arguments = new HashMap();

    private FavoritePlaceDetailsAction(@NonNull Place placeDetailArg, @NonNull String cityName) {
      if (placeDetailArg == null) {
        throw new IllegalArgumentException("Argument \"placeDetailArg\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("placeDetailArg", placeDetailArg);
      if (cityName == null) {
        throw new IllegalArgumentException("Argument \"city_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("city_name", cityName);
    }

    @NonNull
    public FavoritePlaceDetailsAction setPlaceDetailArg(@NonNull Place placeDetailArg) {
      if (placeDetailArg == null) {
        throw new IllegalArgumentException("Argument \"placeDetailArg\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("placeDetailArg", placeDetailArg);
      return this;
    }

    @NonNull
    public FavoritePlaceDetailsAction setCityName(@NonNull String cityName) {
      if (cityName == null) {
        throw new IllegalArgumentException("Argument \"city_name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("city_name", cityName);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("placeDetailArg")) {
        Place placeDetailArg = (Place) arguments.get("placeDetailArg");
        if (Parcelable.class.isAssignableFrom(Place.class) || placeDetailArg == null) {
          __result.putParcelable("placeDetailArg", Parcelable.class.cast(placeDetailArg));
        } else if (Serializable.class.isAssignableFrom(Place.class)) {
          __result.putSerializable("placeDetailArg", Serializable.class.cast(placeDetailArg));
        } else {
          throw new UnsupportedOperationException(Place.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      if (arguments.containsKey("city_name")) {
        String cityName = (String) arguments.get("city_name");
        __result.putString("city_name", cityName);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.favoritePlaceDetailsAction;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Place getPlaceDetailArg() {
      return (Place) arguments.get("placeDetailArg");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCityName() {
      return (String) arguments.get("city_name");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      FavoritePlaceDetailsAction that = (FavoritePlaceDetailsAction) object;
      if (arguments.containsKey("placeDetailArg") != that.arguments.containsKey("placeDetailArg")) {
        return false;
      }
      if (getPlaceDetailArg() != null ? !getPlaceDetailArg().equals(that.getPlaceDetailArg()) : that.getPlaceDetailArg() != null) {
        return false;
      }
      if (arguments.containsKey("city_name") != that.arguments.containsKey("city_name")) {
        return false;
      }
      if (getCityName() != null ? !getCityName().equals(that.getCityName()) : that.getCityName() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPlaceDetailArg() != null ? getPlaceDetailArg().hashCode() : 0);
      result = 31 * result + (getCityName() != null ? getCityName().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "FavoritePlaceDetailsAction(actionId=" + getActionId() + "){"
          + "placeDetailArg=" + getPlaceDetailArg()
          + ", cityName=" + getCityName()
          + "}";
    }
  }
}
