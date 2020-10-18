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

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static SearchPlacesFromCity searchPlacesFromCity(@NonNull String cityNameSearch) {
    return new SearchPlacesFromCity(cityNameSearch);
  }

  @NonNull
  public static ActionHomeFragmentToResultFragment3 actionHomeFragmentToResultFragment3(
      @NonNull String cityNameSearch) {
    return new ActionHomeFragmentToResultFragment3(cityNameSearch);
  }

  @NonNull
  public static MyInterestsAction myInterestsAction() {
    return new MyInterestsAction();
  }

  public static class SearchPlacesFromCity implements NavDirections {
    private final HashMap arguments = new HashMap();

    private SearchPlacesFromCity(@NonNull String cityNameSearch) {
      if (cityNameSearch == null) {
        throw new IllegalArgumentException("Argument \"city_name_search\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("city_name_search", cityNameSearch);
    }

    @NonNull
    public SearchPlacesFromCity setCityNameSearch(@NonNull String cityNameSearch) {
      if (cityNameSearch == null) {
        throw new IllegalArgumentException("Argument \"city_name_search\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("city_name_search", cityNameSearch);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("city_name_search")) {
        String cityNameSearch = (String) arguments.get("city_name_search");
        __result.putString("city_name_search", cityNameSearch);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.searchPlacesFromCity;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCityNameSearch() {
      return (String) arguments.get("city_name_search");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      SearchPlacesFromCity that = (SearchPlacesFromCity) object;
      if (arguments.containsKey("city_name_search") != that.arguments.containsKey("city_name_search")) {
        return false;
      }
      if (getCityNameSearch() != null ? !getCityNameSearch().equals(that.getCityNameSearch()) : that.getCityNameSearch() != null) {
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
      result = 31 * result + (getCityNameSearch() != null ? getCityNameSearch().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "SearchPlacesFromCity(actionId=" + getActionId() + "){"
          + "cityNameSearch=" + getCityNameSearch()
          + "}";
    }
  }

  public static class ActionHomeFragmentToResultFragment3 implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeFragmentToResultFragment3(@NonNull String cityNameSearch) {
      if (cityNameSearch == null) {
        throw new IllegalArgumentException("Argument \"city_name_search\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("city_name_search", cityNameSearch);
    }

    @NonNull
    public ActionHomeFragmentToResultFragment3 setCityNameSearch(@NonNull String cityNameSearch) {
      if (cityNameSearch == null) {
        throw new IllegalArgumentException("Argument \"city_name_search\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("city_name_search", cityNameSearch);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("city_name_search")) {
        String cityNameSearch = (String) arguments.get("city_name_search");
        __result.putString("city_name_search", cityNameSearch);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_resultFragment3;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCityNameSearch() {
      return (String) arguments.get("city_name_search");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToResultFragment3 that = (ActionHomeFragmentToResultFragment3) object;
      if (arguments.containsKey("city_name_search") != that.arguments.containsKey("city_name_search")) {
        return false;
      }
      if (getCityNameSearch() != null ? !getCityNameSearch().equals(that.getCityNameSearch()) : that.getCityNameSearch() != null) {
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
      result = 31 * result + (getCityNameSearch() != null ? getCityNameSearch().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToResultFragment3(actionId=" + getActionId() + "){"
          + "cityNameSearch=" + getCityNameSearch()
          + "}";
    }
  }

  public static class MyInterestsAction implements NavDirections {
    private final HashMap arguments = new HashMap();

    private MyInterestsAction() {
    }

    @NonNull
    public MyInterestsAction setTt(boolean tt) {
      this.arguments.put("tt", tt);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("tt")) {
        boolean tt = (boolean) arguments.get("tt");
        __result.putBoolean("tt", tt);
      } else {
        __result.putBoolean("tt", true);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.myInterestsAction;
    }

    @SuppressWarnings("unchecked")
    public boolean getTt() {
      return (boolean) arguments.get("tt");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      MyInterestsAction that = (MyInterestsAction) object;
      if (arguments.containsKey("tt") != that.arguments.containsKey("tt")) {
        return false;
      }
      if (getTt() != that.getTt()) {
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
      result = 31 * result + (getTt() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "MyInterestsAction(actionId=" + getActionId() + "){"
          + "tt=" + getTt()
          + "}";
    }
  }
}
