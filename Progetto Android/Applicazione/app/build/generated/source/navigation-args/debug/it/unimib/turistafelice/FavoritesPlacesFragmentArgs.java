package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FavoritesPlacesFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private FavoritesPlacesFragmentArgs() {
  }

  private FavoritesPlacesFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static FavoritesPlacesFragmentArgs fromBundle(@NonNull Bundle bundle) {
    FavoritesPlacesFragmentArgs __result = new FavoritesPlacesFragmentArgs();
    bundle.setClassLoader(FavoritesPlacesFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("selected_city")) {
      String selectedCity;
      selectedCity = bundle.getString("selected_city");
      if (selectedCity == null) {
        throw new IllegalArgumentException("Argument \"selected_city\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("selected_city", selectedCity);
    } else {
      throw new IllegalArgumentException("Required argument \"selected_city\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getSelectedCity() {
    return (String) arguments.get("selected_city");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("selected_city")) {
      String selectedCity = (String) arguments.get("selected_city");
      __result.putString("selected_city", selectedCity);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    FavoritesPlacesFragmentArgs that = (FavoritesPlacesFragmentArgs) object;
    if (arguments.containsKey("selected_city") != that.arguments.containsKey("selected_city")) {
      return false;
    }
    if (getSelectedCity() != null ? !getSelectedCity().equals(that.getSelectedCity()) : that.getSelectedCity() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSelectedCity() != null ? getSelectedCity().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "FavoritesPlacesFragmentArgs{"
        + "selectedCity=" + getSelectedCity()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(FavoritesPlacesFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String selectedCity) {
      if (selectedCity == null) {
        throw new IllegalArgumentException("Argument \"selected_city\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selected_city", selectedCity);
    }

    @NonNull
    public FavoritesPlacesFragmentArgs build() {
      FavoritesPlacesFragmentArgs result = new FavoritesPlacesFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setSelectedCity(@NonNull String selectedCity) {
      if (selectedCity == null) {
        throw new IllegalArgumentException("Argument \"selected_city\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selected_city", selectedCity);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getSelectedCity() {
      return (String) arguments.get("selected_city");
    }
  }
}
