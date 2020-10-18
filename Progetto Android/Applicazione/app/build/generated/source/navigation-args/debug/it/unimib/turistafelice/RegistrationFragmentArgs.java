package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RegistrationFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private RegistrationFragmentArgs() {
  }

  private RegistrationFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RegistrationFragmentArgs fromBundle(@NonNull Bundle bundle) {
    RegistrationFragmentArgs __result = new RegistrationFragmentArgs();
    bundle.setClassLoader(RegistrationFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("notRegisterd")) {
      boolean notRegisterd;
      notRegisterd = bundle.getBoolean("notRegisterd");
      __result.arguments.put("notRegisterd", notRegisterd);
    } else {
      __result.arguments.put("notRegisterd", true);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getNotRegisterd() {
    return (boolean) arguments.get("notRegisterd");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("notRegisterd")) {
      boolean notRegisterd = (boolean) arguments.get("notRegisterd");
      __result.putBoolean("notRegisterd", notRegisterd);
    } else {
      __result.putBoolean("notRegisterd", true);
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
    RegistrationFragmentArgs that = (RegistrationFragmentArgs) object;
    if (arguments.containsKey("notRegisterd") != that.arguments.containsKey("notRegisterd")) {
      return false;
    }
    if (getNotRegisterd() != that.getNotRegisterd()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getNotRegisterd() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "RegistrationFragmentArgs{"
        + "notRegisterd=" + getNotRegisterd()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(RegistrationFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public RegistrationFragmentArgs build() {
      RegistrationFragmentArgs result = new RegistrationFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setNotRegisterd(boolean notRegisterd) {
      this.arguments.put("notRegisterd", notRegisterd);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getNotRegisterd() {
      return (boolean) arguments.get("notRegisterd");
    }
  }
}
