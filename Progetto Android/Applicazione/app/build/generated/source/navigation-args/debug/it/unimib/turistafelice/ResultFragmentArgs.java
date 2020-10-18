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

public class ResultFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ResultFragmentArgs() {
  }

  private ResultFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ResultFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ResultFragmentArgs __result = new ResultFragmentArgs();
    bundle.setClassLoader(ResultFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("city_name_search")) {
      String cityNameSearch;
      cityNameSearch = bundle.getString("city_name_search");
      if (cityNameSearch == null) {
        throw new IllegalArgumentException("Argument \"city_name_search\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("city_name_search", cityNameSearch);
    } else {
      throw new IllegalArgumentException("Required argument \"city_name_search\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getCityNameSearch() {
    return (String) arguments.get("city_name_search");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("city_name_search")) {
      String cityNameSearch = (String) arguments.get("city_name_search");
      __result.putString("city_name_search", cityNameSearch);
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
    ResultFragmentArgs that = (ResultFragmentArgs) object;
    if (arguments.containsKey("city_name_search") != that.arguments.containsKey("city_name_search")) {
      return false;
    }
    if (getCityNameSearch() != null ? !getCityNameSearch().equals(that.getCityNameSearch()) : that.getCityNameSearch() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCityNameSearch() != null ? getCityNameSearch().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ResultFragmentArgs{"
        + "cityNameSearch=" + getCityNameSearch()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ResultFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String cityNameSearch) {
      if (cityNameSearch == null) {
        throw new IllegalArgumentException("Argument \"city_name_search\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("city_name_search", cityNameSearch);
    }

    @NonNull
    public ResultFragmentArgs build() {
      ResultFragmentArgs result = new ResultFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setCityNameSearch(@NonNull String cityNameSearch) {
      if (cityNameSearch == null) {
        throw new IllegalArgumentException("Argument \"city_name_search\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("city_name_search", cityNameSearch);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getCityNameSearch() {
      return (String) arguments.get("city_name_search");
    }
  }
}
