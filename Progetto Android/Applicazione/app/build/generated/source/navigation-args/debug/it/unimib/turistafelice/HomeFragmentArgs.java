package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private HomeFragmentArgs() {
  }

  private HomeFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static HomeFragmentArgs fromBundle(@NonNull Bundle bundle) {
    HomeFragmentArgs __result = new HomeFragmentArgs();
    bundle.setClassLoader(HomeFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("logged")) {
      boolean logged;
      logged = bundle.getBoolean("logged");
      __result.arguments.put("logged", logged);
    } else {
      __result.arguments.put("logged", true);
    }
    if (bundle.containsKey("registeredSuccess")) {
      boolean registeredSuccess;
      registeredSuccess = bundle.getBoolean("registeredSuccess");
      __result.arguments.put("registeredSuccess", registeredSuccess);
    } else {
      __result.arguments.put("registeredSuccess", true);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getLogged() {
    return (boolean) arguments.get("logged");
  }

  @SuppressWarnings("unchecked")
  public boolean getRegisteredSuccess() {
    return (boolean) arguments.get("registeredSuccess");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("logged")) {
      boolean logged = (boolean) arguments.get("logged");
      __result.putBoolean("logged", logged);
    } else {
      __result.putBoolean("logged", true);
    }
    if (arguments.containsKey("registeredSuccess")) {
      boolean registeredSuccess = (boolean) arguments.get("registeredSuccess");
      __result.putBoolean("registeredSuccess", registeredSuccess);
    } else {
      __result.putBoolean("registeredSuccess", true);
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
    HomeFragmentArgs that = (HomeFragmentArgs) object;
    if (arguments.containsKey("logged") != that.arguments.containsKey("logged")) {
      return false;
    }
    if (getLogged() != that.getLogged()) {
      return false;
    }
    if (arguments.containsKey("registeredSuccess") != that.arguments.containsKey("registeredSuccess")) {
      return false;
    }
    if (getRegisteredSuccess() != that.getRegisteredSuccess()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getLogged() ? 1 : 0);
    result = 31 * result + (getRegisteredSuccess() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "HomeFragmentArgs{"
        + "logged=" + getLogged()
        + ", registeredSuccess=" + getRegisteredSuccess()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(HomeFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public HomeFragmentArgs build() {
      HomeFragmentArgs result = new HomeFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setLogged(boolean logged) {
      this.arguments.put("logged", logged);
      return this;
    }

    @NonNull
    public Builder setRegisteredSuccess(boolean registeredSuccess) {
      this.arguments.put("registeredSuccess", registeredSuccess);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getLogged() {
      return (boolean) arguments.get("logged");
    }

    @SuppressWarnings("unchecked")
    public boolean getRegisteredSuccess() {
      return (boolean) arguments.get("registeredSuccess");
    }
  }
}
