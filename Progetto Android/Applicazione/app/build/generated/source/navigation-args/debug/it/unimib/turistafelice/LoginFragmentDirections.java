package it.unimib.turistafelice;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static RegisterAction registerAction() {
    return new RegisterAction();
  }

  @NonNull
  public static LoggedActionSucces loggedActionSucces() {
    return new LoggedActionSucces();
  }

  public static class RegisterAction implements NavDirections {
    private final HashMap arguments = new HashMap();

    private RegisterAction() {
    }

    @NonNull
    public RegisterAction setNotRegisterd(boolean notRegisterd) {
      this.arguments.put("notRegisterd", notRegisterd);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.registerAction;
    }

    @SuppressWarnings("unchecked")
    public boolean getNotRegisterd() {
      return (boolean) arguments.get("notRegisterd");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      RegisterAction that = (RegisterAction) object;
      if (arguments.containsKey("notRegisterd") != that.arguments.containsKey("notRegisterd")) {
        return false;
      }
      if (getNotRegisterd() != that.getNotRegisterd()) {
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
      result = 31 * result + (getNotRegisterd() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "RegisterAction(actionId=" + getActionId() + "){"
          + "notRegisterd=" + getNotRegisterd()
          + "}";
    }
  }

  public static class LoggedActionSucces implements NavDirections {
    private final HashMap arguments = new HashMap();

    private LoggedActionSucces() {
    }

    @NonNull
    public LoggedActionSucces setLogged(boolean logged) {
      this.arguments.put("logged", logged);
      return this;
    }

    @NonNull
    public LoggedActionSucces setRegisteredSuccess(boolean registeredSuccess) {
      this.arguments.put("registeredSuccess", registeredSuccess);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.loggedActionSucces;
    }

    @SuppressWarnings("unchecked")
    public boolean getLogged() {
      return (boolean) arguments.get("logged");
    }

    @SuppressWarnings("unchecked")
    public boolean getRegisteredSuccess() {
      return (boolean) arguments.get("registeredSuccess");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      LoggedActionSucces that = (LoggedActionSucces) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getLogged() ? 1 : 0);
      result = 31 * result + (getRegisteredSuccess() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "LoggedActionSucces(actionId=" + getActionId() + "){"
          + "logged=" + getLogged()
          + ", registeredSuccess=" + getRegisteredSuccess()
          + "}";
    }
  }
}
