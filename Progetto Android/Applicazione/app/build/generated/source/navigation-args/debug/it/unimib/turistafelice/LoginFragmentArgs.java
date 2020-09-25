package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LoginFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private LoginFragmentArgs() {
  }

  private LoginFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static LoginFragmentArgs fromBundle(@NonNull Bundle bundle) {
    LoginFragmentArgs __result = new LoginFragmentArgs();
    bundle.setClassLoader(LoginFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("notLogged")) {
      boolean notLogged;
      notLogged = bundle.getBoolean("notLogged");
      __result.arguments.put("notLogged", notLogged);
    } else {
      __result.arguments.put("notLogged", true);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getNotLogged() {
    return (boolean) arguments.get("notLogged");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("notLogged")) {
      boolean notLogged = (boolean) arguments.get("notLogged");
      __result.putBoolean("notLogged", notLogged);
    } else {
      __result.putBoolean("notLogged", true);
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
    LoginFragmentArgs that = (LoginFragmentArgs) object;
    if (arguments.containsKey("notLogged") != that.arguments.containsKey("notLogged")) {
      return false;
    }
    if (getNotLogged() != that.getNotLogged()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getNotLogged() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "LoginFragmentArgs{"
        + "notLogged=" + getNotLogged()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(LoginFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public LoginFragmentArgs build() {
      LoginFragmentArgs result = new LoginFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setNotLogged(boolean notLogged) {
      this.arguments.put("notLogged", notLogged);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getNotLogged() {
      return (boolean) arguments.get("notLogged");
    }
  }
}
