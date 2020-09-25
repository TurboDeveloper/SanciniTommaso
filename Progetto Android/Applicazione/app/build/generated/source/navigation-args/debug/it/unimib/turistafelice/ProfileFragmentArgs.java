package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProfileFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ProfileFragmentArgs() {
  }

  private ProfileFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ProfileFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ProfileFragmentArgs __result = new ProfileFragmentArgs();
    bundle.setClassLoader(ProfileFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("logged")) {
      boolean logged;
      logged = bundle.getBoolean("logged");
      __result.arguments.put("logged", logged);
    } else {
      __result.arguments.put("logged", true);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getLogged() {
    return (boolean) arguments.get("logged");
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
    ProfileFragmentArgs that = (ProfileFragmentArgs) object;
    if (arguments.containsKey("logged") != that.arguments.containsKey("logged")) {
      return false;
    }
    if (getLogged() != that.getLogged()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getLogged() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ProfileFragmentArgs{"
        + "logged=" + getLogged()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ProfileFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public ProfileFragmentArgs build() {
      ProfileFragmentArgs result = new ProfileFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setLogged(boolean logged) {
      this.arguments.put("logged", logged);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getLogged() {
      return (boolean) arguments.get("logged");
    }
  }
}
