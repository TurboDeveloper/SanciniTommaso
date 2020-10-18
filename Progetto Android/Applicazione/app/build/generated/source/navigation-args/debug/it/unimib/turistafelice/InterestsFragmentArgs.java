package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class InterestsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private InterestsFragmentArgs() {
  }

  private InterestsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static InterestsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    InterestsFragmentArgs __result = new InterestsFragmentArgs();
    bundle.setClassLoader(InterestsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("tt")) {
      boolean tt;
      tt = bundle.getBoolean("tt");
      __result.arguments.put("tt", tt);
    } else {
      __result.arguments.put("tt", true);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getTt() {
    return (boolean) arguments.get("tt");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    InterestsFragmentArgs that = (InterestsFragmentArgs) object;
    if (arguments.containsKey("tt") != that.arguments.containsKey("tt")) {
      return false;
    }
    if (getTt() != that.getTt()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getTt() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "InterestsFragmentArgs{"
        + "tt=" + getTt()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(InterestsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public InterestsFragmentArgs build() {
      InterestsFragmentArgs result = new InterestsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTt(boolean tt) {
      this.arguments.put("tt", tt);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getTt() {
      return (boolean) arguments.get("tt");
    }
  }
}
