package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FavoritesFragmentDirections {
  private FavoritesFragmentDirections() {
  }

  @NonNull
  public static FavoritePlaceIdAction favoritePlaceIdAction(@NonNull String selectedCity) {
    return new FavoritePlaceIdAction(selectedCity);
  }

  public static class FavoritePlaceIdAction implements NavDirections {
    private final HashMap arguments = new HashMap();

    private FavoritePlaceIdAction(@NonNull String selectedCity) {
      if (selectedCity == null) {
        throw new IllegalArgumentException("Argument \"selected_city\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selected_city", selectedCity);
    }

    @NonNull
    public FavoritePlaceIdAction setSelectedCity(@NonNull String selectedCity) {
      if (selectedCity == null) {
        throw new IllegalArgumentException("Argument \"selected_city\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selected_city", selectedCity);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("selected_city")) {
        String selectedCity = (String) arguments.get("selected_city");
        __result.putString("selected_city", selectedCity);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.favoritePlaceIdAction;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getSelectedCity() {
      return (String) arguments.get("selected_city");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      FavoritePlaceIdAction that = (FavoritePlaceIdAction) object;
      if (arguments.containsKey("selected_city") != that.arguments.containsKey("selected_city")) {
        return false;
      }
      if (getSelectedCity() != null ? !getSelectedCity().equals(that.getSelectedCity()) : that.getSelectedCity() != null) {
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
      result = 31 * result + (getSelectedCity() != null ? getSelectedCity().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "FavoritePlaceIdAction(actionId=" + getActionId() + "){"
          + "selectedCity=" + getSelectedCity()
          + "}";
    }
  }
}
