package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FavoritesFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private FavoritesFragmentArgs() {
  }

  private FavoritesFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static FavoritesFragmentArgs fromBundle(@NonNull Bundle bundle) {
    FavoritesFragmentArgs __result = new FavoritesFragmentArgs();
    bundle.setClassLoader(FavoritesFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("from_result")) {
      boolean fromResult;
      fromResult = bundle.getBoolean("from_result");
      __result.arguments.put("from_result", fromResult);
    } else {
      __result.arguments.put("from_result", true);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getFromResult() {
    return (boolean) arguments.get("from_result");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("from_result")) {
      boolean fromResult = (boolean) arguments.get("from_result");
      __result.putBoolean("from_result", fromResult);
    } else {
      __result.putBoolean("from_result", true);
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
    FavoritesFragmentArgs that = (FavoritesFragmentArgs) object;
    if (arguments.containsKey("from_result") != that.arguments.containsKey("from_result")) {
      return false;
    }
    if (getFromResult() != that.getFromResult()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getFromResult() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "FavoritesFragmentArgs{"
        + "fromResult=" + getFromResult()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(FavoritesFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public FavoritesFragmentArgs build() {
      FavoritesFragmentArgs result = new FavoritesFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setFromResult(boolean fromResult) {
      this.arguments.put("from_result", fromResult);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getFromResult() {
      return (boolean) arguments.get("from_result");
    }
  }
}
